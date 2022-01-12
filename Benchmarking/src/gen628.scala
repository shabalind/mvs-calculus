import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  case class s5 (
    p0: Vector[Vector[s1]],
    p1: s4
  )
  def f51(v0: Vector[s1]): Vector[s1] = {
    v0
  }
  @noinline
  def f0(v0: s5, v1: Double): Double = {
    val v7: Double = v1 + v1
    val v6: s4 = v0.p1
    val v3: Vector[s1] = v6.p0
    val v4: Vector[Vector[s1]] = v0.p0
    val v2: Vector[s1] = f51(v3)
    var v10: Vector[Vector[s1]] = v4
    var v9: Vector[s1] = v2
    v10 = v10.updated(0, v2)
    val v19: Vector[s1] = v6.p0
    v10 = v10.updated(1, v19)
    v10 = v4
    var v18: Double = v7
    v10 = v10.updated(1, v2)
    val v14: Vector[s1] = v4(0)
    val v15: s1 = v9(0)
    val v27: Vector[s0] = v15.p1
    var v16: s1 = v15
    v10 = v10.updated(0, v14)
    val v42: s0 = v27(1)
    val v24: s1 = v19(0)
    v16 = v16.copy(p0 = v27)
    val v25: Vector[s0] = v15.p0
    val v63: Vector[Vector[Double]] = v42.p0
    val v51: Vector[Double] = v63(0)
    v9 = v9.updated(0, v24)
    var v48: s1 = v16
    v9 = v9.updated(0, v16)
    val v114: Double = v51(0)
    v10 = v10.updated(1, v2)
    v48 = v48.copy(p1 = v27)
    val v91: Double = v18 - v1
    v48 = v48.copy(p1 = v27)
    v16 = v16.copy(p1 = v27)
    var v105: s1 = v16
    v9 = v9.updated(0, v48)
    val v79: Vector[s1] = v10(0)
    v9 = v9.updated(0, v105)
    val v73: Double = v114 / v91
    val v173: s1 = v79(0)
    v9 = v9.updated(0, v173)
    v105 = v105.copy(p1 = v25)
    v73
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(Vector(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))), Vector(s1(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))), s4(Vector(s1(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0)))), Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))), s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))))), Vector(Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0)))))))
    val v1: Double = 95.0
    val start = nanoTime()
    var result: Double = 95.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}