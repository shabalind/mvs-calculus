import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: s0,
    p3: s0,
    p4: Vector[Double],
    p5: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  case class s4 (
    p0: Vector[s0],
    p1: Double
  )
  @noinline
  def f0(v0: s2, v1: s4, v2: s4, v3: Double): Double = {
    val v6: Double = v3 + v3
    var v15: Double = v6
    val v19: Double = v2.p1
    val v30: Vector[Double] = Vector(v19, v19, v3, v3, v15, v3, v3)
    val v50: Double = v30(6)
    var v42: Double = v50
    var v49: s4 = v1
    v15 = v6
    var v59: Vector[Double] = v30
    v59 = v59.updated(6, v6)
    val v90: Double = v49.p1
    val v84: Double = v59(0)
    val v57: Double = v1.p1
    v49 = v49.copy(p1 = v15)
    v49 = v49.copy(p1 = v42)
    val v163: Double = v84 + v57
    val v186: Double = v163 + v90
    v49 = v49.copy(p1 = v19)
    v186
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), Vector(24.0, 25.0, 26.0), Vector(s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0)), Vector(Vector(30.0))), s0(Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0))))), s1(Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0), Vector(41.0)), Vector(Vector(42.0))), s0(Vector(Vector(43.0), Vector(44.0), Vector(45.0)), Vector(Vector(46.0)))), s0(Vector(Vector(47.0), Vector(48.0), Vector(49.0)), Vector(Vector(50.0))), s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0)), Vector(Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0))), Vector(59.0, 60.0, 61.0), Vector(s0(Vector(Vector(62.0), Vector(63.0), Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0)))))), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0))))
    val v1: s4 = s4(Vector(s0(Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0)))), 82.0)
    val v2: s4 = s4(Vector(s0(Vector(Vector(83.0), Vector(84.0), Vector(85.0)), Vector(Vector(86.0))), s0(Vector(Vector(87.0), Vector(88.0), Vector(89.0)), Vector(Vector(90.0)))), 91.0)
    val v3: Double = 92.0
    val start = nanoTime()
    var result: Double = 92.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}