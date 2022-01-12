import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: s0
  )
  case class s7 (
    p0: s3,
    p1: s1
  )
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    val v3: s7 = v0(2)
    val v2: s3 = v3.p0
    val v5: s1 = v3.p1
    val v6: s0 = v5.p0
    val v10: s0 = v2.p1
    val v15: Vector[Vector[Double]] = v10.p1
    val v24: Vector[Vector[Double]] = v6.p0
    val v59: Vector[Double] = v24(1)
    var v23: Vector[Vector[Double]] = v15
    val v33: Vector[Double] = v23(1)
    val v28: Double = v33(0)
    v23 = v23.updated(0, v33)
    v23 = v23.updated(1, v59)
    var v48: Double = v28
    v23 = v23.updated(1, v59)
    val v135: Double = v28 + v48
    v135
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(s3(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))), s1(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))))), s7(s3(Vector(s1(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))), s1(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))))), s7(s3(Vector(s1(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0)))), s1(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))))
    val v1: Double = 48.0
    val start = nanoTime()
    var result: Double = 48.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}