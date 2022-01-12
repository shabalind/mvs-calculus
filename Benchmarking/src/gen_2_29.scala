import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[s1], v1: s0, v2: Double, v3: Vector[s0], v4: s1, v5: Vector[Vector[s0]], v6: Vector[Vector[s0]]): Double = {
    val v10: Vector[s0] = v4.p1
    val v12: s0 = v10(1)
    val v90: Vector[Vector[Double]] = v1.p1
    val v116: Vector[Vector[Double]] = v12.p0
    var v94: Vector[Vector[Double]] = v116
    var v95: Vector[Vector[Double]] = v94
    val v60: Vector[Double] = v95(1)
    val v141: Vector[Double] = v90(1)
    v95 = v95.updated(0, v141)
    var v150: Vector[Double] = v60
    val v253: Double = v150(0)
    val v195: Double = v2 + v253
    v195
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), s1(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))))
    val v1: s0 = s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))
    val v2: Double = 35.0
    val v3: Vector[s0] = Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0))), s0(Vector(Vector(41.0), Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0))))
    val v4: s1 = s1(s0(Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0))), Vector(s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0)))))
    val v5: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(61.0), Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0)))))
    val v6: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0)))))
    val start = nanoTime()
    var result: Double = [[StructValue(Name(str='s0', ty=None), [[[66.0], [67.0], [68.0]], [[69.0], [70.0]]])]]
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}