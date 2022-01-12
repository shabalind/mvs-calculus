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
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  case class s3 (
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: Vector[Vector[s2]],
    p1: Vector[s3]
  )
  case class s6 (
    p0: s4
  )
  def f101(v0: Vector[Double]): Vector[Double] = {
    var v3: Vector[Double] = v0
    var v7: Vector[Double] = v0
    val v2: Double = v7(1)
    v7 = v7.updated(0, v2)
    val v8: Double = v7(1)
    v3 = v3.updated(0, v2)
    val v6: Double = v3(2)
    v3 = v0
    v3 = v3.updated(1, v6)
    v3 = v0
    var v10: Double = v8
    var v9: Vector[Double] = v3
    var v11: Double = v10
    v7 = v7.updated(0, v8)
    var v12: Vector[Double] = v0
    val v21: Double = v2 + v11
    v3 = v3.updated(1, v21)
    v11 = v6
    val v23: Double = v0(0)
    val v29: Double = v3(1)
    var v17: Double = v23
    val v15: Double = v7(1)
    v12 = v12.updated(2, v15)
    val v39: Vector[Vector[Double]] = Vector(v9)
    var v35: Vector[Vector[Double]] = v39
    v35 = v35.updated(0, v9)
    var v43: Vector[Double] = v7
    val v24: Vector[Vector[Vector[Double]]] = Vector(v35, v39, v35, v35, v35, v35)
    var v53: Double = v29
    var v36: Vector[Vector[Vector[Double]]] = v24
    val v31: Vector[Vector[Double]] = v36(0)
    var v38: Vector[Vector[Double]] = v31
    val v57: Vector[Vector[Double]] = v24(3)
    v38 = v31
    v3 = v3.updated(1, v17)
    v12 = v12.updated(1, v8)
    val v111: Vector[Double] = v38(0)
    var v51: Vector[Double] = v43
    v38 = v38.updated(0, v12)
    v35 = v35.updated(0, v51)
    v12 = v12.updated(1, v53)
    v36 = v36.updated(4, v57)
    v111
  }
  def f51(v0: Double): Double = {
    var v2: Double = v0
    v2 = v0
    var v7: Double = v2
    val v1: Double = v7 * v0
    val v5: Double = v7 + v1
    val v15: Vector[Double] = Vector(v5)
    var v18: Vector[Double] = v15
    val v9: Double = v15(0)
    val v13: Double = v18(0)
    v18 = v18.updated(0, v9)
    var v12: Vector[Double] = v18
    var v23: Double = v13
    v18 = v18.updated(0, v23)
    var v17: Vector[Double] = v12
    val v24: Vector[Vector[Double]] = Vector(v12, v17)
    val v67: Double = v18(0)
    val v19: Vector[Double] = v24(0)
    val v42: Double = v19(0)
    v17 = v17.updated(0, v67)
    v12 = v12.updated(0, v1)
    v42
  }
  @noinline
  def f0(v0: s4, v1: s6, v2: Double): Double = {
    var v5: Double = v2
    var v17: Double = v2
    var v16: Double = v17
    val v12: Double = f51(v16)
    val v26: Vector[Double] = Vector(v2, v2, v17)
    val v69: Double = f51(v5)
    val v61: Vector[Double] = f101(v26)
    val v56: Double = v12 * v2
    var v46: Vector[Double] = v61
    v46 = v46.updated(0, v12)
    val v31: Double = v16 / v56
    val v50: Double = v46(0)
    v16 = v69
    v16 = v31
    v50
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s1(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))))))), Vector(s3(s1(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))), Vector(Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))))), s3(s1(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))), Vector(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))))), s3(s1(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))), Vector(Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))))))))
    val v1: s6 = s6(s4(Vector(Vector(s2(Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0)))), s1(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))))))), Vector(s3(s1(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), Vector(Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)))))), s3(s1(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))), Vector(Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0)))))), s3(s1(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0)))), Vector(Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0)))))))))
    val v2: Double = 112.0
    val start = nanoTime()
    var result: Double = 112.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}