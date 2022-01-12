import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s5 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  def f23(v0: s5): s5 = {
    var v3: s5 = v0
    val v1: Vector[Vector[s0]] = v0.p1
    v3 = v3.copy(p1 = v1)
    val v2: Vector[s0] = v1(0)
    val v5: Vector[s0] = v1(0)
    var v4: Vector[Vector[s0]] = v1
    v3 = v3.copy(p1 = v1)
    v3 = v3.copy(p1 = v4)
    val v18: s0 = v2(0)
    val v6: Vector[Vector[Double]] = v18.p0
    v4 = v4.updated(0, v5)
    v3 = v3.copy(p0 = v18)
    v4 = v4.updated(1, v2)
    var v23: Vector[s0] = v5
    val v56: Vector[Vector[s0]] = v3.p1
    v3 = v3.copy(p1 = v1)
    v3 = v3.copy(p1 = v56)
    v23 = v23.updated(0, v18)
    val v20: Vector[Vector[Double]] = v18.p1
    var v24: s5 = v0
    val v52: s0 = s0(v6, v20)
    v23 = v23.updated(0, v52)
    var v51: Vector[s0] = v23
    v3 = v0
    var v46: Vector[s0] = v51
    v4 = v4.updated(1, v23)
    v4 = v4.updated(0, v23)
    val v76: s0 = v46(0)
    var v109: s5 = v3
    val v86: Vector[s5] = Vector(v109, v24, v0)
    var v62: Vector[s0] = v5
    val v183: s0 = v62(0)
    v24 = v24.copy(p0 = v76)
    v51 = v51.updated(0, v183)
    v24 = v24.copy(p0 = v183)
    val v61: s5 = v86(0)
    v61
  }
  @noinline
  def f0(v0: Vector[Vector[s5]], v1: Double): Double = {
    val v3: Vector[s5] = v0(0)
    val v5: s5 = v3(0)
    val v4: s5 = f23(v5)
    val v29: s0 = v4.p0
    val v21: Vector[Vector[Double]] = v29.p0
    var v70: Vector[Vector[Double]] = v21
    var v38: Double = v1
    val v49: Double = v38 / v1
    val v31: Vector[Double] = v70(1)
    var v50: Vector[Double] = v31
    v50 = v50.updated(0, v49)
    val v78: Double = v31(0)
    val v40: Double = v78 - v1
    v70 = v70.updated(1, v50)
    v50 = v50.updated(0, v1)
    var v46: Double = v40
    v50 = v50.updated(0, v1)
    v46
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s5]] = Vector(Vector(s5(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}