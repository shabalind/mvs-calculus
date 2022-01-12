import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  case class s3 (
    p0: Vector[s1],
    p1: s2
  )
  case class s4 (
    p0: s0,
    p1: s1
  )
  case class s5 (
    p0: Vector[s4],
    p1: Vector[Vector[s3]]
  )
  def f17(v0: s5): s5 = {
    var v4: s5 = v0
    val v6: Vector[s4] = v4.p0
    val v27: Vector[Vector[s3]] = v0.p1
    v4 = v4.copy(p1 = v27)
    v4 = v4.copy(p0 = v6)
    v4
  }
  def f16(v0: s5): s5 = {
    var v2: s5 = v0
    val v14: Vector[s4] = v0.p0
    val v26: s5 = f17(v2)
    v2 = v0
    v2 = v2.copy(p0 = v14)
    v26
  }
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    val v6: s5 = v0(0)
    val v2: s5 = f16(v6)
    var v7: s5 = v2
    var v4: s5 = v7
    var v3: s5 = v4
    val v9: Vector[s4] = v3.p0
    val v13: s4 = v9(1)
    val v17: Vector[s4] = v3.p0
    v4 = v4.copy(p0 = v17)
    v3 = v3.copy(p0 = v17)
    v3 = v3.copy(p0 = v9)
    val v21: s0 = v13.p0
    v3 = v3.copy(p0 = v17)
    v3 = v3.copy(p0 = v17)
    v3 = v3.copy(p0 = v9)
    v7 = v7.copy(p0 = v9)
    var v25: s0 = v21
    var v20: s0 = v25
    val v37: Vector[Vector[Double]] = v20.p1
    v3 = v3.copy(p0 = v9)
    val v51: Vector[Double] = v37(1)
    var v28: Vector[s4] = v9
    var v125: Vector[s4] = v17
    val v85: Double = v51(0)
    v3 = v3.copy(p0 = v28)
    v4 = v4.copy(p0 = v125)
    v85
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(Vector(s4(s0(0.0, Vector(Vector(1.0), Vector(2.0))), s1(s0(3.0, Vector(Vector(4.0), Vector(5.0))), s0(6.0, Vector(Vector(7.0), Vector(8.0))))), s4(s0(9.0, Vector(Vector(10.0), Vector(11.0))), s1(s0(12.0, Vector(Vector(13.0), Vector(14.0))), s0(15.0, Vector(Vector(16.0), Vector(17.0))))), s4(s0(18.0, Vector(Vector(19.0), Vector(20.0))), s1(s0(21.0, Vector(Vector(22.0), Vector(23.0))), s0(24.0, Vector(Vector(25.0), Vector(26.0)))))), Vector(Vector(s3(Vector(s1(s0(27.0, Vector(Vector(28.0), Vector(29.0))), s0(30.0, Vector(Vector(31.0), Vector(32.0)))), s1(s0(33.0, Vector(Vector(34.0), Vector(35.0))), s0(36.0, Vector(Vector(37.0), Vector(38.0))))), s2(Vector(s0(39.0, Vector(Vector(40.0), Vector(41.0)))), s1(s0(42.0, Vector(Vector(43.0), Vector(44.0))), s0(45.0, Vector(Vector(46.0), Vector(47.0))))))))), s5(Vector(s4(s0(48.0, Vector(Vector(49.0), Vector(50.0))), s1(s0(51.0, Vector(Vector(52.0), Vector(53.0))), s0(54.0, Vector(Vector(55.0), Vector(56.0))))), s4(s0(57.0, Vector(Vector(58.0), Vector(59.0))), s1(s0(60.0, Vector(Vector(61.0), Vector(62.0))), s0(63.0, Vector(Vector(64.0), Vector(65.0))))), s4(s0(66.0, Vector(Vector(67.0), Vector(68.0))), s1(s0(69.0, Vector(Vector(70.0), Vector(71.0))), s0(72.0, Vector(Vector(73.0), Vector(74.0)))))), Vector(Vector(s3(Vector(s1(s0(75.0, Vector(Vector(76.0), Vector(77.0))), s0(78.0, Vector(Vector(79.0), Vector(80.0)))), s1(s0(81.0, Vector(Vector(82.0), Vector(83.0))), s0(84.0, Vector(Vector(85.0), Vector(86.0))))), s2(Vector(s0(87.0, Vector(Vector(88.0), Vector(89.0)))), s1(s0(90.0, Vector(Vector(91.0), Vector(92.0))), s0(93.0, Vector(Vector(94.0), Vector(95.0))))))))))
    val v1: Double = 96.0
    val start = nanoTime()
    var result: Double = 96.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}