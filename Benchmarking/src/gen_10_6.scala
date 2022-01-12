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
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s8 (
    p0: s0
  )
  case class s9 (
    p0: Vector[s1],
    p1: s2
  )
  def f56(v0: s1): s1 = {
    val v5: Vector[s1] = Vector(v0)
    val v6: s1 = v5(0)
    val v7: s1 = v5(0)
    var v8: Vector[s1] = v5
    var v4: s1 = v7
    v8 = v5
    val v3: s1 = v5(0)
    v8 = v8.updated(0, v7)
    var v12: s1 = v7
    val v11: s0 = v3.p0
    val v15: Vector[Vector[Double]] = v11.p1
    v12 = v6
    var v18: Vector[Vector[Double]] = v15
    var v33: Vector[s1] = v8
    var v51: Vector[s1] = v33
    val v27: s1 = v51(0)
    v51 = v51.updated(0, v4)
    var v22: Vector[Vector[Double]] = v18
    val v26: s0 = v6.p0
    v12 = v12.copy(p0 = v11)
    var v28: s0 = v11
    val v43: Vector[Vector[Double]] = v28.p0
    val v39: s0 = v12.p0
    val v57: s8 = s8(v11)
    v4 = v4.copy(p0 = v39)
    v12 = v12.copy(p0 = v28)
    v28 = v28.copy(p1 = v22)
    v51 = v51.updated(0, v3)
    v12 = v12.copy(p0 = v39)
    val v52: s0 = v57.p0
    v12 = v12.copy(p0 = v11)
    v28 = v28.copy(p0 = v43)
    v12 = v12.copy(p0 = v52)
    v12 = v12.copy(p0 = v26)
    v27
  }
  def f41(v0: s9): s9 = {
    val v1: Vector[s1] = v0.p0
    val v7: Vector[s1] = v0.p0
    var v6: s9 = v0
    val v2: s1 = v1(1)
    var v4: s1 = v2
    var v5: s1 = v4
    var v9: s9 = v0
    val v11: s1 = f56(v5)
    val v8: Vector[s0] = v2.p1
    v9 = v9.copy(p0 = v7)
    v6 = v6.copy(p0 = v7)
    var v23: Vector[s1] = v7
    var v10: Vector[s0] = v8
    v23 = v7
    val v20: s1 = f56(v4)
    val v21: s2 = s2(v20, v5)
    var v17: s2 = v21
    val v16: s2 = v6.p1
    v9 = v9.copy(p0 = v1)
    val v19: s1 = v23(1)
    v17 = v17.copy(p1 = v2)
    v23 = v23.updated(2, v11)
    val v22: s2 = v9.p1
    val v18: s0 = v19.p0
    var v36: s0 = v18
    v10 = v10.updated(1, v36)
    v9 = v9.copy(p1 = v16)
    val v13: Vector[s1] = v6.p0
    val v28: s0 = v8(1)
    v6 = v6.copy(p1 = v16)
    var v24: Vector[s0] = v10
    var v31: s0 = v28
    v9 = v9.copy(p1 = v17)
    var v33: s0 = v31
    val v37: s8 = s8(v36)
    val v84: Vector[Vector[Double]] = v33.p1
    val v64: s0 = v37.p0
    v33 = v33.copy(p1 = v84)
    v10 = v10.updated(0, v36)
    v10 = v10.updated(1, v64)
    v36 = v36.copy(p1 = v84)
    v10 = v10.updated(1, v31)
    val v41: s1 = s1(v64, v10)
    v23 = v23.updated(1, v19)
    val v88: s0 = v8(0)
    val v54: s9 = s9(v13, v21)
    v23 = v23.updated(0, v41)
    v10 = v10.updated(1, v33)
    val v59: s0 = v37.p0
    val v48: s0 = v37.p0
    v10 = v10.updated(1, v48)
    val v47: Vector[Vector[Double]] = v59.p0
    v36 = v36.copy(p0 = v47)
    val v71: Vector[s1] = v54.p0
    v23 = v23.updated(0, v20)
    val v45: s9 = s9(v71, v22)
    v23 = v71
    v4 = v4.copy(p0 = v88)
    v24 = v24.updated(2, v48)
    v9 = v9.copy(p0 = v7)
    v31 = v31.copy(p1 = v84)
    v4 = v4.copy(p1 = v24)
    v10 = v10.updated(1, v59)
    v9 = v9.copy(p0 = v1)
    v45
  }
  @noinline
  def f0(v0: s9, v1: Double): Double = {
    val v5: s9 = f41(v0)
    val v6: s2 = v5.p1
    val v11: s1 = v6.p1
    val v4: s1 = f56(v11)
    val v28: s0 = v4.p0
    var v73: s0 = v28
    var v30: s0 = v73
    val v23: Vector[Vector[Double]] = v30.p1
    val v39: Vector[Double] = v23(0)
    val v51: Double = v39(0)
    v51
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), s1(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))), s1(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))), s2(s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))))), s1(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))), Vector(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0))), s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)))))))
    val v1: Double = 100.0
    val start = nanoTime()
    var result: Double = 100.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}