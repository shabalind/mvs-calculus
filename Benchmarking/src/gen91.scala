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
    p0: Double,
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    var v4: Double = v1
    val v2: s3 = v0(1)
    val v3: s3 = v0(0)
    v4 = v1
    var v5: s3 = v2
    val v7: Double = v3.p0
    val v8: Vector[s1] = v5.p1
    v5 = v5.copy(p0 = v7)
    var v18: Double = v7
    val v23: Double = v1 - v7
    v5 = v5.copy(p1 = v8)
    val v176: Double = v5.p0
    val v151: Vector[Double] = Vector(v4, v176, v23, v23, v18, v7)
    val v93: Double = v151(4)
    v93
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(0.0, Vector(s1(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0)))), s1(s0(Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0)))), s1(s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0))), s0(Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0)))))), s3(31.0, Vector(s1(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0))), s0(Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))), s1(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0))), s0(Vector(Vector(47.0), Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))), s1(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0), Vector(56.0))), s0(Vector(Vector(57.0), Vector(58.0), Vector(59.0)), Vector(Vector(60.0), Vector(61.0)))))))
    val v1: Double = 62.0
    val start = nanoTime()
    var result: Double = 62.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}