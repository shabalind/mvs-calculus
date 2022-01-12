import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: s0
  )
  case class s6 (
    p0: s3,
    p1: s2,
    p2: s0
  )
  @noinline
  def f0(v0: s6, v1: s1, v2: Double): Double = {
    val v3: s0 = v0.p2
    var v5: s0 = v3
    var v12: Double = v2
    val v7: Vector[Double] = v5.p0
    val v10: s0 = v1.p0
    val v14: Double = v7(0)
    val v34: Vector[Vector[Double]] = Vector(v7, v7, v7, v7, v7)
    val v19: s0 = v1.p0
    val v13: Vector[Double] = v34(3)
    val v23: Double = v2 / v14
    val v27: Vector[Vector[Double]] = v19.p1
    var v65: Vector[Double] = v13
    v65 = v65.updated(2, v2)
    val v21: Double = v65(0)
    val v24: Vector[Vector[Double]] = v19.p1
    v65 = v65.updated(1, v21)
    val v38: Vector[Double] = v24(2)
    val v46: Vector[Vector[Double]] = v10.p1
    var v37: Vector[Vector[Double]] = v46
    v37 = v37.updated(0, v38)
    v5 = v5.copy(p0 = v65)
    val v80: Vector[Double] = v34(3)
    v12 = v23
    v5 = v5.copy(p0 = v80)
    var v55: Double = v21
    var v77: Vector[Vector[Double]] = v27
    val v92: Vector[Double] = v34(3)
    v5 = v5.copy(p0 = v92)
    val v195: Double = v92(0)
    v65 = v65.updated(2, v195)
    v65 = v65.updated(1, v12)
    v5 = v5.copy(p1 = v77)
    v5 = v5.copy(p1 = v37)
    v55
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s3(s1(s0(Vector(0.0, 1.0, 2.0), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(6.0, 7.0, 8.0), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s0(Vector(12.0, 13.0, 14.0), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), s2(s0(Vector(18.0, 19.0, 20.0), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), Vector(s0(Vector(24.0, 25.0, 26.0), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(30.0, 31.0, 32.0), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(36.0, 37.0, 38.0), Vector(Vector(39.0), Vector(40.0), Vector(41.0))))), s0(Vector(42.0, 43.0, 44.0), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))
    val v1: s1 = s1(s0(Vector(48.0, 49.0, 50.0), Vector(Vector(51.0), Vector(52.0), Vector(53.0))), s0(Vector(54.0, 55.0, 56.0), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))
    val v2: Double = 60.0
    val start = nanoTime()
    var result: Double = 60.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}