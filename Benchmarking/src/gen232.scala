import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f2(v0: Double): Double = {
    var v3: Double = v0
    var v6: Double = v0
    v6 = v0
    v3 = v6
    val v2: Double = v0 + v6
    var v5: Double = v3
    val v8: Double = v3 / v2
    var v9: Double = v3
    val v23: Double = v5 + v8
    var v18: Double = v5
    var v31: Double = v23
    var v15: Double = v31
    var v57: Double = v3
    var v19: Double = v15
    v31 = v57
    val v27: Vector[Double] = Vector(v23)
    v15 = v6
    v57 = v5
    var v43: Double = v18
    val v60: Vector[Double] = Vector(v15, v0, v23, v8)
    val v52: Double = v60(0)
    var v42: Vector[Double] = v27
    v42 = v42.updated(0, v57)
    val v70: Vector[Vector[Double]] = Vector(v42, v42, v27, v27, v42)
    v42 = v42.updated(0, v19)
    v42 = v42.updated(0, v52)
    v42 = v42.updated(0, v43)
    val v162: Vector[Double] = v70(0)
    var v164: Vector[Double] = v162
    v164 = v164.updated(0, v9)
    val v92: Double = v164(0)
    v92
  }
  @noinline
  def f0(v0: s0, v1: s2, v2: Double): Double = {
    val v4: Double = f2(v2)
    val v3: Double = f2(v2)
    var v6: Double = v4
    val v10: Double = f2(v3)
    val v86: Double = f2(v10)
    val v92: Double = v86 + v6
    v92
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))
    val v1: s2 = s2(Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))
    val v2: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}