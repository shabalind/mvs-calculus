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
  case class s4 (
    p0: Double,
    p1: Vector[s1]
  )
  case class s7 (
    p0: s4,
    p1: s1
  )
  case class s11 (
    p0: Vector[s1],
    p1: Vector[s7]
  )
  def f69(v0: Double): Double = {
    var v7: Double = v0
    var v6: Double = v7
    var v4: Double = v7
    var v5: Double = v0
    var v2: Double = v7
    var v1: Double = v6
    var v11: Double = v7
    var v3: Double = v0
    var v8: Double = v3
    var v19: Double = v5
    var v9: Double = v0
    v8 = v4
    var v12: Double = v0
    v19 = v12
    var v25: Double = v1
    var v28: Double = v2
    var v10: Double = v4
    var v14: Double = v4
    var v18: Double = v9
    val v26: Vector[Double] = Vector(v8, v6, v11, v19)
    var v20: Vector[Double] = v26
    var v16: Double = v4
    v20 = v20.updated(3, v25)
    var v22: Vector[Double] = v26
    v4 = v5
    val v21: Double = v22(0)
    v22 = v22.updated(2, v10)
    val v33: Double = v22(0)
    var v27: Double = v33
    val v60: Vector[Vector[Double]] = Vector(v20)
    v4 = v18
    val v42: Vector[Double] = Vector(v21, v16)
    var v70: Vector[Double] = v42
    v70 = v70.updated(0, v18)
    v22 = v22.updated(1, v28)
    val v84: Vector[Double] = v60(0)
    val v35: Double = v70(1)
    val v51: Double = v70(0)
    val v41: Double = v42(1)
    val v77: Double = v70(0)
    var v80: Vector[Double] = v42
    var v214: Vector[Double] = v80
    v28 = v11
    var v125: Vector[Double] = v214
    v20 = v20.updated(3, v51)
    var v176: Vector[Double] = v125
    v1 = v41
    v3 = v14
    v125 = v125.updated(1, v35)
    v214 = v214.updated(1, v27)
    v20 = v20.updated(3, v18)
    v80 = v80.updated(0, v18)
    var v127: Vector[Double] = v176
    val v150: Double = v127(0)
    val v114: Double = v84(2)
    val v145: Double = v114 + v150
    v80 = v80.updated(0, v77)
    v145
  }
  @noinline
  def f0(v0: Vector[s0], v1: s11, v2: Double): Double = {
    val v4: Double = v2 * v2
    val v3: Double = f69(v4)
    val v11: Double = f69(v3)
    var v32: Double = v11
    val v27: Double = f69(v32)
    v27
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))))
    val v1: s11 = s11(Vector(s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), s1(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))))), Vector(s7(s4(28.0, Vector(s1(s0(Vector(Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0), Vector(36.0)))), s1(s0(Vector(Vector(37.0)), Vector(Vector(38.0), Vector(39.0), Vector(40.0))), s0(Vector(Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))))), s1(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0), Vector(48.0))), s0(Vector(Vector(49.0)), Vector(Vector(50.0), Vector(51.0), Vector(52.0))))), s7(s4(53.0, Vector(s1(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0), Vector(57.0))), s0(Vector(Vector(58.0)), Vector(Vector(59.0), Vector(60.0), Vector(61.0)))), s1(s0(Vector(Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)))))), s1(s0(Vector(Vector(70.0)), Vector(Vector(71.0), Vector(72.0), Vector(73.0))), s0(Vector(Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))))), s7(s4(78.0, Vector(s1(s0(Vector(Vector(79.0)), Vector(Vector(80.0), Vector(81.0), Vector(82.0))), s0(Vector(Vector(83.0)), Vector(Vector(84.0), Vector(85.0), Vector(86.0)))), s1(s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0), Vector(90.0))), s0(Vector(Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0)))))), s1(s0(Vector(Vector(95.0)), Vector(Vector(96.0), Vector(97.0), Vector(98.0))), s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0), Vector(102.0)))))))
    val v2: Double = 103.0
    val start = nanoTime()
    var result: Double = 103.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}