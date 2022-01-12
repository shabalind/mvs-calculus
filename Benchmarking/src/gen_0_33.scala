import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s1],
    p1: s0
  )
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: Double): Double = {
    val v6: Vector[s3] = v0(0)
    val v2: s3 = v6(0)
    val v10: Vector[s1] = v2.p0
    val v12: s1 = v10(0)
    val v50: Vector[s0] = v12.p1
    val v60: s0 = v50(1)
    val v32: Vector[Vector[Double]] = v60.p1
    val v35: Vector[Double] = v32(1)
    val v46: Double = v35(0)
    var v174: Double = v46
    val v180: Double = v174 - v174
    v180
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0))), Vector(s0(Vector(Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)), Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0), Vector(25.0))), s0(Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)), Vector(Vector(36.0), Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))))), s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))))))
    val v1: Double = 65.0
    val start = nanoTime()
    var result: Double = 65.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}