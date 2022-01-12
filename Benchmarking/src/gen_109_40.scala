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
    p0: Vector[Vector[s1]],
    p1: s0
  )
  def f44(v0: s0): s0 = {
    var v5: s0 = v0
    val v4: Vector[Vector[Double]] = v5.p0
    val v6: Vector[Vector[Double]] = v5.p1
    v5 = v5.copy(p0 = v4)
    var v11: s0 = v0
    v5 = v5.copy(p0 = v4)
    v11 = v11.copy(p1 = v6)
    val v12: Vector[Vector[Double]] = v11.p1
    var v14: Vector[Vector[Double]] = v12
    val v29: Vector[Double] = v6(0)
    val v17: s0 = s0(v4, v12)
    v14 = v14.updated(1, v29)
    val v16: Vector[Vector[Double]] = v0.p1
    val v21: Vector[Vector[Double]] = v17.p0
    val v35: Vector[Double] = v16(0)
    v11 = v11.copy(p0 = v4)
    val v19: Vector[Vector[Double]] = v11.p1
    var v32: Vector[Vector[Double]] = v4
    val v44: s0 = s0(v32, v14)
    val v70: Vector[Vector[Double]] = v44.p0
    val v25: Vector[Vector[Double]] = v11.p1
    val v39: Vector[Double] = v25(0)
    var v47: Vector[Vector[Double]] = v21
    val v54: Vector[Double] = v19(1)
    v47 = v47.updated(0, v39)
    v11 = v11.copy(p1 = v14)
    var v66: Vector[Vector[Double]] = v47
    v32 = v32.updated(0, v54)
    v14 = v14.updated(1, v54)
    val v76: Vector[Double] = v4(2)
    val v125: Vector[Vector[Vector[Double]]] = Vector(v70, v66)
    v11 = v11.copy(p0 = v66)
    val v60: Vector[Vector[Double]] = v125(0)
    val v78: Vector[Vector[Double]] = v17.p0
    v14 = v14.updated(0, v76)
    var v42: s0 = v0
    v11 = v11.copy(p0 = v21)
    val v91: Vector[Vector[Double]] = v5.p1
    v66 = v66.updated(1, v35)
    val v145: s0 = s0(v60, v91)
    v11 = v11.copy(p0 = v21)
    v5 = v42
    v11 = v11.copy(p0 = v70)
    v42 = v42.copy(p0 = v21)
    v42 = v42.copy(p0 = v78)
    v145
  }
  def f40(v0: s1): s1 = {
    v0
  }
  def f39(v0: s1): s1 = {
    val v6: Vector[s0] = v0.p1
    val v5: s0 = v6(0)
    val v4: s1 = f40(v0)
    val v14: s1 = f40(v4)
    val v1: Vector[s0] = v4.p1
    val v31: s1 = s1(v5, v6)
    val v12: s1 = f40(v31)
    val v28: s1 = f40(v12)
    var v100: s1 = v14
    v100 = v100.copy(p1 = v1)
    v100 = v100.copy(p1 = v6)
    v100 = v28
    v100
  }
  def f38(v0: s0): s0 = {
    var v3: s0 = v0
    val v6: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Vector[Double]] = v0.p0
    var v9: s0 = v0
    val v7: s0 = f44(v3)
    var v2: Vector[Vector[Double]] = v5
    val v4: Vector[Double] = v2(0)
    var v8: Vector[Vector[Double]] = v6
    val v11: Vector[Double] = v8(0)
    val v12: Vector[Double] = v8(0)
    val v13: Vector[Double] = v5(1)
    var v17: Vector[Vector[Double]] = v8
    v3 = v3.copy(p0 = v5)
    v17 = v17.updated(0, v11)
    v9 = v9.copy(p1 = v17)
    v2 = v2.updated(0, v13)
    val v15: s0 = f44(v9)
    val v10: Vector[Double] = v8(1)
    val v14: Vector[Vector[Double]] = v7.p0
    v17 = v17.updated(1, v12)
    v3 = v3.copy(p1 = v17)
    val v18: Vector[Vector[Double]] = v15.p1
    v2 = v2.updated(2, v4)
    val v28: Vector[Vector[Double]] = v7.p0
    val v33: Vector[Vector[Double]] = v3.p0
    val v50: Vector[Double] = v33(1)
    var v58: Vector[Vector[Double]] = v6
    v17 = v17.updated(1, v4)
    var v19: Vector[Vector[Double]] = v2
    val v38: Vector[Vector[Double]] = v0.p0
    val v23: s0 = f44(v3)
    v8 = v8.updated(1, v10)
    v3 = v3.copy(p0 = v28)
    var v69: s0 = v23
    v69 = v69.copy(p0 = v28)
    v9 = v9.copy(p0 = v38)
    v19 = v19.updated(2, v10)
    v58 = v58.updated(1, v4)
    v2 = v2.updated(0, v50)
    v69 = v69.copy(p0 = v14)
    v69 = v69.copy(p1 = v18)
    val v68: s0 = f44(v15)
    val v76: Vector[Double] = v58(1)
    v2 = v2.updated(1, v76)
    val v67: Vector[Vector[Double]] = v68.p1
    v8 = v8.updated(0, v12)
    v3 = v3.copy(p0 = v19)
    var v96: s0 = v69
    v9 = v9.copy(p1 = v67)
    v96
  }
  def f25(v0: s1): s1 = {
    val v6: s0 = v0.p0
    val v3: s0 = f38(v6)
    var v17: s1 = v0
    val v94: s1 = f39(v17)
    var v53: s1 = v94
    val v131: Vector[s0] = v53.p1
    val v114: s1 = s1(v3, v131)
    v114
  }
  def f18(v0: s1, v1: s1): s1 = {
    val v9: s0 = v0.p0
    val v13: s1 = f39(v0)
    var v18: s1 = v13
    var v36: s1 = v13
    v36 = v18
    val v39: s1 = f25(v36)
    v36 = v36.copy(p0 = v9)
    val v422: s1 = f39(v39)
    v422
  }
  def f15(v0: s1): s1 = {
    var v5: s1 = v0
    var v6: s1 = v0
    val v7: s0 = v6.p0
    val v11: s0 = f44(v7)
    v6 = v0
    var v13: s1 = v5
    val v2: Vector[s0] = v6.p1
    v13 = v13.copy(p0 = v7)
    v6 = v6.copy(p1 = v2)
    val v54: s1 = f40(v13)
    v13 = v13.copy(p0 = v11)
    v54
  }
  def f13(v0: s1, v1: s1): s1 = {
    val v4: s1 = f15(v1)
    val v19: s1 = f18(v4, v4)
    v19
  }
  def f10(v0: s1): s1 = {
    var v6: s1 = v0
    val v3: Vector[s0] = v6.p1
    v6 = v6.copy(p1 = v3)
    val v7: Vector[s0] = v0.p1
    val v5: s0 = v7(2)
    var v2: s0 = v5
    val v4: s0 = v3(2)
    var v1: Vector[s0] = v7
    v6 = v6.copy(p1 = v3)
    val v11: s1 = f15(v0)
    var v14: s0 = v2
    val v12: s0 = v11.p0
    v1 = v1.updated(1, v14)
    val v17: s1 = f40(v6)
    val v28: s1 = f39(v6)
    val v22: s0 = v1(0)
    val v46: s1 = f18(v28, v17)
    val v27: s0 = f38(v2)
    val v19: Vector[Vector[Double]] = v4.p1
    val v36: Vector[Vector[Vector[Double]]] = Vector(v19, v19, v19)
    val v60: Vector[Vector[Double]] = v36(1)
    v6 = v6.copy(p0 = v5)
    var v37: s0 = v27
    v37 = v37.copy(p1 = v60)
    var v70: s0 = v12
    val v48: Vector[Vector[Double]] = v36(1)
    v1 = v1.updated(2, v70)
    val v39: s1 = f15(v46)
    v6 = v6.copy(p0 = v27)
    v6 = v6.copy(p0 = v37)
    v70 = v70.copy(p1 = v60)
    var v84: Vector[Vector[Double]] = v48
    val v184: s1 = f13(v39, v46)
    v6 = v6.copy(p0 = v22)
    val v127: s1 = f15(v184)
    v14 = v14.copy(p1 = v84)
    v127
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Vector[Vector[s2]], v2: Double): Double = {
    val v3: Vector[s2] = v1(0)
    val v14: s2 = v3(0)
    val v9: Vector[Vector[s1]] = v14.p0
    val v20: Vector[s1] = v9(2)
    val v19: s1 = v20(0)
    val v17: s1 = f10(v19)
    val v18: Vector[s0] = v17.p1
    val v31: s0 = v18(0)
    val v41: Vector[Vector[Double]] = v31.p1
    var v32: Vector[Vector[Double]] = v41
    val v83: Vector[Double] = v32(0)
    v32 = v32.updated(1, v83)
    val v99: Vector[Vector[Double]] = v31.p1
    v32 = v32.updated(0, v83)
    var v103: Vector[Double] = v83
    val v69: Double = v103(0)
    v32 = v99
    var v71: Vector[Vector[Double]] = v41
    val v112: Vector[Double] = v71(0)
    val v134: Double = v112(0)
    var v169: Double = v2
    val v132: Double = v134 + v169
    val v215: Double = v132 - v69
    v215
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))))), Vector(s1(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))))))
    val v1: Vector[Vector[s2]] = Vector(Vector(s2(Vector(Vector(s1(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))), Vector(s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0)))))), Vector(s1(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))), Vector(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0))), s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))))))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))))))
    val v2: Double = 105.0
    val start = nanoTime()
    var result: Double = 105.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}