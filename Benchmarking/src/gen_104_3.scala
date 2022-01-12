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
    p0: s0,
    p1: s0
  )
  def f92(v0: s0): s0 = {
    val v3: s2 = s2(v0, v0)
    val v4: s2 = s2(v0, v0)
    val v1: Vector[s2] = Vector(v4, v3, v4)
    var v5: Vector[s2] = v1
    v5 = v5.updated(0, v4)
    v5 = v5.updated(1, v3)
    val v11: s2 = v5(2)
    val v24: s0 = v11.p0
    v5 = v5.updated(0, v11)
    v24
  }
  def f78(v0: s0): s0 = {
    var v1: s0 = v0
    var v4: s0 = v0
    val v8: s0 = f92(v0)
    val v17: Vector[Vector[Double]] = v4.p1
    v1 = v1.copy(p0 = v17)
    val v22: s2 = s2(v8, v1)
    val v26: s0 = v22.p1
    val v36: Vector[Vector[Double]] = v26.p0
    val v86: s0 = s0(v36, v17)
    v86
  }
  def f41(v0: Double): Double = {
    var v3: Double = v0
    var v7: Double = v3
    var v2: Double = v0
    var v1: Double = v3
    var v4: Double = v2
    var v8: Double = v4
    var v9: Double = v4
    val v14: Vector[Double] = Vector(v1, v7)
    var v15: Vector[Double] = v14
    val v21: Double = v14(1)
    val v13: Double = v14(0)
    val v12: Double = v14(0)
    v15 = v15.updated(1, v8)
    v15 = v15.updated(1, v3)
    var v24: Vector[Double] = v14
    val v17: Double = v9 / v21
    val v37: Double = v15(0)
    v15 = v15.updated(0, v37)
    val v43: Double = v24(1)
    var v22: Vector[Double] = v15
    val v29: Double = v22(0)
    val v27: Double = v14(1)
    val v20: Double = v24(0)
    v24 = v24.updated(0, v43)
    v8 = v13
    var v42: Double = v12
    val v55: Vector[Double] = Vector(v43, v27, v29, v20, v17, v21, v42)
    var v56: Vector[Double] = v55
    var v49: Double = v7
    var v80: Double = v13
    var v116: Vector[Double] = v56
    v8 = v49
    var v83: Vector[Double] = v116
    val v113: Double = v83(1)
    v56 = v56.updated(0, v80)
    v113
  }
  @noinline
  def f0(v0: s1, v1: s0, v2: Vector[s1], v3: s1, v4: Double): Double = {
    val v6: Vector[s0] = v0.p0
    val v10: s0 = v6(1)
    val v11: s0 = f78(v10)
    val v12: Vector[Vector[Double]] = v10.p0
    val v17: Vector[Vector[Double]] = v11.p0
    val v22: Vector[Double] = v17(0)
    val v29: s0 = v6(1)
    val v35: Double = v22(0)
    val v25: Vector[Double] = v12(1)
    val v46: Vector[Vector[Double]] = v29.p0
    val v20: Double = v22(0)
    val v52: Double = f41(v20)
    val v68: Vector[Double] = v46(1)
    var v30: Vector[Double] = v68
    v30 = v30.updated(0, v35)
    val v66: Vector[Vector[Double]] = Vector(v22, v25, v22, v25, v30, v22)
    v30 = v30.updated(0, v20)
    val v79: Vector[Double] = v66(2)
    v30 = v30.updated(0, v52)
    val v135: Double = v79(0)
    v135
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))))
    val v1: s0 = s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))
    val v2: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), s1(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))), s1(Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)))), s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0)))))
    val v3: s1 = s1(Vector(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0)))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0))))
    val v4: Double = 84.0
    val start = nanoTime()
    var result: Double = 84.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}