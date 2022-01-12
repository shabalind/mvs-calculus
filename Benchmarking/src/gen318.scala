import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Vector[s2], v2: Vector[Vector[s1]], v3: Double): Double = {
    val v6: Vector[Double] = Vector(v3, v3)
    val v7: Double = v6(0)
    var v5: Vector[Double] = v6
    var v13: Double = v7
    v5 = v5.updated(1, v13)
    val v24: Vector[Vector[Double]] = Vector(v6, v5, v5)
    val v15: Double = v5(0)
    var v42: Vector[Vector[Double]] = v24
    val v38: Vector[Double] = v42(2)
    v5 = v5.updated(1, v15)
    val v74: Double = v38(1)
    v5 = v5.updated(0, v74)
    v74
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))))), Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0)))), Vector(s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))))))
    val v1: Vector[s2] = Vector(s2(Vector(Vector(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))))), Vector(s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))), s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))), s2(Vector(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0)))), Vector(s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))))), Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))), s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))))))
    val v2: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0)))), s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))))), Vector(s1(Vector(s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0)))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0))))), Vector(s1(Vector(s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))), s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0))))))
    val v3: Double = 93.0
    val start = nanoTime()
    var result: Double = 93.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}