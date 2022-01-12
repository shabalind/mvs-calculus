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
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: s1, v2: Double): Double = {
    val v4: Vector[s0] = v1.p1
    val v6: s0 = v1.p0
    val v3: s0 = v4(0)
    var v8: s1 = v1
    val v15: s0 = v8.p0
    v8 = v8.copy(p1 = v4)
    val v18: Vector[Vector[Double]] = v6.p0
    var v19: s0 = v3
    var v31: s0 = v6
    var v24: Vector[Vector[Double]] = v18
    val v27: Vector[Vector[Double]] = v15.p0
    val v62: Vector[Double] = v27(0)
    val v43: Vector[Double] = v27(1)
    v8 = v8.copy(p0 = v19)
    v8 = v8.copy(p0 = v31)
    var v47: Vector[Double] = v43
    v31 = v31.copy(p0 = v24)
    v47 = v47.updated(0, v2)
    v24 = v18
    v8 = v8.copy(p0 = v6)
    var v84: Vector[Double] = v47
    val v70: Double = v84(0)
    v24 = v24.updated(1, v62)
    v70
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))), Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))))))), Vector(s2(Vector(s1(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))))), s1(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))))), Vector(Vector(s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0)))), Vector(s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))))))
    val v1: s1 = s1(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))))
    val v2: Double = 96.0
    val start = nanoTime()
    var result: Double = 96.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}