import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  case class s8 (
    p0: Vector[s0],
    p1: s0
  )
  def f98(v0: s2): s2 = {
    val v7: s0 = v0.p0
    val v3: s1 = v0.p1
    val v6: s1 = v0.p1
    var v5: s1 = v6
    v5 = v3
    var v4: s1 = v6
    v5 = v6
    v4 = v4.copy(p0 = v7)
    v4 = v4.copy(p0 = v7)
    v4 = v4.copy(p0 = v7)
    val v8: s0 = v0.p0
    v4 = v4.copy(p0 = v8)
    var v1: s0 = v8
    var v13: s0 = v1
    val v11: s0 = v4.p0
    v4 = v4.copy(p0 = v11)
    val v27: s1 = v0.p1
    v13 = v8
    val v14: s0 = v27.p1
    val v24: s0 = v27.p0
    val v30: Vector[Vector[Double]] = v8.p1
    val v15: Vector[Vector[Double]] = v24.p0
    val v19: s2 = s2(v14, v5)
    var v34: Vector[Vector[Double]] = v15
    v1 = v1.copy(p1 = v30)
    var v28: Vector[Vector[Double]] = v30
    v5 = v5.copy(p1 = v11)
    v1 = v1.copy(p0 = v15)
    val v73: Vector[Double] = v15(1)
    v28 = v28.updated(0, v73)
    v13 = v13.copy(p1 = v28)
    val v65: Vector[Double] = v34(1)
    v5 = v5.copy(p1 = v14)
    v4 = v4.copy(p0 = v13)
    v34 = v34.updated(0, v73)
    var v38: Vector[Vector[Double]] = v34
    v38 = v38.updated(0, v65)
    v1 = v1.copy(p0 = v38)
    v19
  }
  def f84(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p1
    val v24: Vector[Vector[Double]] = v0.p0
    var v10: s0 = v0
    v10 = v10.copy(p1 = v6)
    v10 = v10.copy(p0 = v24)
    val v19: Vector[Vector[Double]] = v10.p1
    val v30: s1 = s1(v0, v10)
    val v27: s0 = v30.p1
    v10 = v10.copy(p1 = v19)
    val v40: s2 = s2(v27, v30)
    var v38: s2 = v40
    val v23: s2 = f98(v38)
    v10 = v10.copy(p1 = v19)
    v38 = v38.copy(p1 = v30)
    val v88: s0 = v30.p0
    val v78: s1 = v23.p1
    val v97: s0 = v78.p0
    v38 = v38.copy(p0 = v88)
    v38 = v38.copy(p0 = v88)
    v10 = v10.copy(p0 = v24)
    v97
  }
  @noinline
  def f0(v0: s2, v1: Vector[Vector[s8]], v2: Double): Double = {
    val v6: Vector[s8] = v1(0)
    val v4: s8 = v6(0)
    val v8: s0 = v4.p1
    val v3: s0 = f84(v8)
    val v13: Vector[Vector[Double]] = v3.p1
    val v35: Vector[Double] = v13(0)
    val v49: Double = v35(0)
    val v71: Double = v49 + v2
    val v111: Vector[Double] = Vector(v49, v71)
    var v87: Vector[Double] = v111
    val v83: Double = v87(0)
    v83
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s1(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))))
    val v1: Vector[Vector[s8]] = Vector(Vector(s8(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))))))
    val v2: Double = 25.0
    val start = nanoTime()
    var result: Double = 25.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}