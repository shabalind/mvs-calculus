import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[s1]
  )
  case class s3 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[s2],
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: s4, v1: s3, v2: Double): Double = {
    val v3: Vector[Vector[s0]] = v0.p1
    val v7: Vector[s0] = v3(0)
    val v8: s0 = v7(0)
    val v16: Vector[Vector[Double]] = v8.p0
    val v32: Vector[Vector[Double]] = v8.p1
    val v40: Vector[Double] = v16(2)
    val v46: Vector[Double] = v16(0)
    var v60: Vector[Vector[Double]] = v32
    val v81: Vector[Double] = v60(1)
    v60 = v60.updated(1, v40)
    v60 = v60.updated(1, v46)
    val v89: Vector[Double] = v60(1)
    v60 = v60.updated(1, v89)
    val v88: Double = v81(0)
    v88
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0)))), Vector(s0(Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0))))), Vector(s1(s0(Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), Vector(Vector(s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))))))), s2(Vector(Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0))))), Vector(s1(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0))), Vector(Vector(s0(Vector(Vector(49.0), Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))))))))), Vector(Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0))))))
    val v1: s3 = s3(s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))), Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0)))))
    val v2: Double = 77.0
    val start = nanoTime()
    var result: Double = 77.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}