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
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: s1
  )
  def f38(v0: s1, v1: Double): Double = {
    val v7: s0 = v0.p1
    val v2: Vector[s0] = Vector(v7, v7, v7, v7, v7, v7, v7)
    val v9: s0 = v2(1)
    val v5: Vector[Double] = Vector(v1, v1, v1, v1, v1)
    val v4: Vector[Vector[Double]] = v9.p0
    val v24: Double = v5(3)
    val v22: Vector[Double] = v4(1)
    val v72: Double = v22(0)
    var v82: Double = v72
    v82 = v24
    v82
  }
  @noinline
  def f0(v0: s1, v1: s3, v2: Double): Double = {
    val v3: s0 = v0.p1
    val v7: Vector[s0] = Vector(v3, v3, v3, v3, v3, v3, v3)
    val v11: s1 = s1(v3, v3)
    var v18: s0 = v3
    val v16: s0 = v7(2)
    val v19: Vector[Vector[Double]] = v18.p0
    v18 = v16
    val v17: Vector[Double] = v19(1)
    val v23: Double = f38(v11, v2)
    val v84: Double = v17(0)
    val v40: Double = v84 - v23
    v18 = v18.copy(p0 = v19)
    v40
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))
    val v1: s3 = s3(Vector(Vector(s1(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), Vector(s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), Vector(s1(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))))), s1(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))))
    val v2: Double = 50.0
    val start = nanoTime()
    var result: Double = 50.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}