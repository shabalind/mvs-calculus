import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: s1,
    p1: Vector[s2]
  )
  @noinline
  def f0(v0: s3, v1: s3, v2: Double): Double = {
    val v6: s1 = v0.p0
    var v5: Double = v2
    val v10: Vector[s0] = v6.p1
    var v16: Double = v5
    var v26: Double = v5
    var v28: Double = v26
    val v40: s0 = v10(0)
    val v35: Vector[Double] = v40.p1
    val v82: Double = v35(0)
    var v59: Double = v16
    v59 = v82
    val v180: Double = v28 - v59
    v180
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0)), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(7.0)))), Vector(s2(s1(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(11.0)), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(15.0)))), s1(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(19.0)), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(23.0)))))))
    val v1: s3 = s3(s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(27.0)), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(31.0)))), Vector(s2(s1(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(35.0)), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(39.0)))), s1(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(43.0)), Vector(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(47.0)))))))
    val v2: Double = 48.0
    val start = nanoTime()
    var result: Double = 48.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}