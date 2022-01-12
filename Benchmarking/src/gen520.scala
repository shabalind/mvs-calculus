import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Double]
  )
  case class s2 (
    p0: s1,
    p1: s0,
    p2: s1
  )
  def f54(v0: s1, v1: s0, v2: s2): s2 = {
    val v7: Vector[Double] = v0.p1
    var v8: s0 = v1
    val v3: Vector[Vector[Double]] = v8.p0
    val v13: Vector[Vector[Double]] = v8.p1
    val v5: Vector[Double] = v0.p1
    v8 = v8.copy(p0 = v3)
    val v12: s0 = s0(v3, v13)
    val v14: Vector[Double] = v3(1)
    val v25: s1 = v2.p0
    v8 = v8.copy(p0 = v3)
    v8 = v8.copy(p0 = v3)
    var v82: Vector[Vector[Double]] = v3
    var v34: Vector[Vector[Double]] = v3
    val v26: Vector[Vector[Double]] = v12.p1
    v8 = v8.copy(p0 = v3)
    val v79: Vector[s0] = Vector(v1, v12, v8)
    v8 = v8.copy(p0 = v3)
    v82 = v82.updated(1, v14)
    var v36: Vector[s0] = v79
    v8 = v8.copy(p1 = v13)
    v82 = v82.updated(0, v14)
    val v40: Vector[Vector[Double]] = v12.p0
    val v43: s0 = v36(2)
    val v109: Vector[Double] = v34(1)
    v36 = v36.updated(0, v12)
    v82 = v82.updated(0, v109)
    val v61: Vector[Vector[Double]] = v1.p0
    val v74: s1 = s1(v1, v7)
    v8 = v8.copy(p0 = v40)
    v8 = v8.copy(p1 = v26)
    v8 = v8.copy(p1 = v26)
    var v60: s0 = v8
    val v99: Vector[Vector[Double]] = v8.p1
    val v80: s0 = v36(1)
    v8 = v8.copy(p0 = v82)
    var v73: s2 = v2
    v60 = v60.copy(p1 = v99)
    v73 = v73.copy(p1 = v43)
    v73 = v73.copy(p1 = v60)
    v60 = v60.copy(p0 = v82)
    val v62: s0 = v74.p0
    var v75: s2 = v73
    v75 = v75.copy(p0 = v25)
    v75 = v75.copy(p0 = v74)
    val v93: Vector[Double] = v61(0)
    v82 = v82.updated(0, v93)
    v75 = v75.copy(p1 = v80)
    val v129: s1 = s1(v62, v5)
    v73 = v73.copy(p0 = v129)
    v75
  }
  def f53(v0: s2): s2 = {
    val v4: s1 = v0.p0
    var v3: s1 = v4
    v3 = v4
    var v2: s1 = v3
    val v6: s0 = v0.p1
    v2 = v3
    val v1: s2 = s2(v2, v6, v2)
    v1
  }
  def f51(v0: s0, v1: s0): s0 = {
    val v2: Vector[Vector[Double]] = v1.p1
    var v6: s0 = v0
    v6 = v6.copy(p1 = v2)
    v6 = v6.copy(p1 = v2)
    val v14: Vector[Vector[Double]] = v1.p0
    val v33: Vector[Vector[Double]] = v0.p1
    val v21: Vector[Vector[Double]] = v0.p0
    v6 = v6.copy(p0 = v21)
    val v19: Vector[Vector[Double]] = v6.p1
    val v102: Vector[Vector[Double]] = v6.p1
    v6 = v6.copy(p0 = v21)
    val v34: Vector[Vector[Double]] = v0.p1
    val v27: Vector[Vector[Double]] = v6.p0
    val v71: Vector[Vector[Double]] = v1.p0
    var v20: s0 = v1
    v20 = v20.copy(p1 = v33)
    val v37: Vector[Vector[Double]] = v6.p1
    v6 = v6.copy(p0 = v71)
    v20 = v20.copy(p1 = v2)
    val v63: Vector[Vector[Double]] = v1.p1
    var v64: s0 = v1
    v20 = v20.copy(p0 = v14)
    val v82: Vector[Vector[Double]] = v64.p0
    v64 = v64.copy(p1 = v102)
    v20 = v20.copy(p0 = v27)
    var v125: s0 = v0
    v64 = v64.copy(p1 = v34)
    val v58: Vector[Vector[Double]] = v125.p0
    v6 = v6.copy(p0 = v58)
    v6 = v6.copy(p1 = v19)
    v6 = v6.copy(p0 = v82)
    v20 = v20.copy(p0 = v27)
    v64 = v64.copy(p1 = v63)
    v125 = v125.copy(p1 = v37)
    v20
  }
  def f48(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p1
    var v2: s0 = v0
    v2 = v2.copy(p1 = v1)
    var v8: s0 = v0
    val v7: Vector[Vector[Double]] = v0.p0
    var v9: s0 = v0
    v8 = v8.copy(p1 = v1)
    val v6: s0 = f51(v9, v2)
    val v11: Vector[Vector[Double]] = v9.p0
    v9 = v9.copy(p0 = v7)
    v2 = v9
    v8 = v8.copy(p0 = v7)
    val v16: Vector[Vector[Double]] = v8.p0
    v2 = v2.copy(p0 = v11)
    var v25: Vector[Vector[Double]] = v16
    val v24: s0 = f51(v9, v8)
    val v21: s0 = f51(v6, v24)
    val v18: Vector[Vector[Double]] = v24.p1
    v2 = v2.copy(p0 = v7)
    val v80: Vector[Vector[Double]] = v21.p1
    val v66: s0 = f51(v21, v6)
    v2 = v2.copy(p0 = v11)
    val v36: s0 = f51(v66, v24)
    val v37: s0 = f51(v8, v24)
    val v74: s0 = f51(v36, v37)
    v8 = v8.copy(p1 = v18)
    val v22: s0 = f51(v74, v2)
    v9 = v8
    v8 = v8.copy(p1 = v18)
    v9 = v9.copy(p0 = v25)
    v9 = v9.copy(p1 = v80)
    v22
  }
  def f46(v0: s0): s0 = {
    var v3: s0 = v0
    val v6: s0 = f51(v0, v3)
    val v5: s0 = f48(v3)
    var v4: s0 = v0
    val v7: Vector[Vector[Double]] = v0.p0
    var v12: Vector[Vector[Double]] = v7
    val v13: s0 = f48(v6)
    val v2: Vector[Vector[Double]] = v6.p1
    val v8: Vector[Double] = v12(1)
    v3 = v3.copy(p0 = v7)
    val v16: s0 = f48(v13)
    val v9: s0 = f48(v4)
    val v14: s0 = f51(v3, v0)
    val v21: s0 = f51(v16, v16)
    val v15: Vector[Vector[Double]] = v16.p0
    val v28: Vector[Vector[Double]] = v6.p1
    val v24: Vector[Vector[Double]] = v16.p0
    val v33: Vector[Double] = v28(0)
    val v18: s0 = f51(v5, v5)
    val v25: s0 = f48(v14)
    val v40: Vector[Double] = v24(1)
    val v47: Vector[Double] = v28(0)
    val v35: Vector[Vector[Double]] = v21.p0
    var v42: Vector[Vector[Double]] = v35
    v3 = v3.copy(p0 = v15)
    v3 = v3.copy(p0 = v42)
    val v38: Vector[Vector[Double]] = v25.p0
    val v61: Vector[Double] = v42(0)
    var v59: s0 = v9
    var v34: Vector[Vector[Double]] = v2
    val v74: Vector[Vector[Double]] = v16.p0
    val v125: Vector[Double] = v2(0)
    var v55: Vector[Vector[Double]] = v28
    val v48: Vector[Double] = v2(2)
    var v58: Vector[Vector[Double]] = v55
    var v69: Vector[Vector[Double]] = v28
    v42 = v42.updated(1, v47)
    val v64: Vector[Vector[Double]] = v0.p0
    val v131: Vector[Vector[Double]] = v3.p1
    val v43: s0 = f51(v16, v59)
    var v207: Vector[Vector[Double]] = v58
    val v110: Vector[Vector[Double]] = v18.p1
    v4 = v4.copy(p0 = v74)
    val v71: Vector[Double] = v64(0)
    var v139: s0 = v0
    val v79: s0 = f51(v139, v43)
    v12 = v12.updated(0, v48)
    v34 = v34.updated(0, v8)
    v4 = v4.copy(p1 = v34)
    v69 = v69.updated(2, v8)
    val v63: Vector[Double] = v207(0)
    v69 = v69.updated(1, v125)
    v3 = v3.copy(p0 = v38)
    v139 = v139.copy(p1 = v207)
    v55 = v55.updated(0, v71)
    v139 = v139.copy(p1 = v55)
    val v395: Vector[Vector[Double]] = v18.p1
    val v118: Vector[Vector[Vector[Double]]] = Vector(v131)
    v139 = v139.copy(p1 = v110)
    v34 = v34.updated(1, v40)
    v58 = v58.updated(2, v63)
    var v177: Vector[Vector[Vector[Double]]] = v118
    v4 = v4.copy(p1 = v69)
    v12 = v12.updated(0, v125)
    v69 = v69.updated(0, v33)
    var v140: Vector[Vector[Vector[Double]]] = v177
    v140 = v140.updated(0, v395)
    var v108: Vector[Vector[Vector[Double]]] = v140
    val v89: Vector[Vector[Double]] = v108(0)
    v34 = v34.updated(1, v8)
    v59 = v59.copy(p1 = v34)
    v3 = v3.copy(p1 = v89)
    v58 = v58.updated(0, v61)
    v12 = v12.updated(1, v40)
    v79
  }
  def f45(v0: s2, v1: s2): s2 = {
    val v2: s2 = f53(v1)
    val v7: s2 = f53(v2)
    val v5: s1 = v2.p0
    var v8: s2 = v1
    val v3: s1 = v8.p0
    val v11: s0 = v1.p1
    v8 = v8.copy(p0 = v5)
    val v10: s1 = v7.p0
    val v14: Vector[s0] = Vector(v11)
    var v25: s1 = v5
    var v13: Vector[s0] = v14
    var v12: s2 = v1
    val v17: s0 = f48(v11)
    var v30: s0 = v11
    var v34: s0 = v17
    v13 = v13.updated(0, v30)
    val v19: s0 = v13(0)
    val v15: Vector[Vector[Double]] = v30.p1
    val v43: s0 = v2.p1
    var v16: Vector[s0] = v13
    val v32: s0 = f51(v17, v34)
    val v42: Vector[s0] = Vector(v43, v17, v32, v43)
    val v48: Vector[Vector[Double]] = v30.p1
    val v27: s0 = v42(0)
    val v31: s0 = v42(1)
    val v33: s0 = v10.p0
    val v23: Vector[Vector[Double]] = v34.p0
    v13 = v16
    var v56: Vector[Vector[Double]] = v23
    val v45: s2 = f54(v25, v27, v12)
    val v40: s0 = f51(v31, v32)
    val v57: Vector[Double] = v56(1)
    val v28: Vector[Double] = v15(1)
    v56 = v56.updated(1, v28)
    val v60: s0 = f48(v17)
    val v51: s0 = v10.p0
    v16 = v16.updated(0, v43)
    v8 = v8.copy(p1 = v19)
    val v140: s0 = f51(v30, v40)
    v25 = v25.copy(p0 = v19)
    v56 = v56.updated(0, v57)
    v12 = v12.copy(p1 = v33)
    val v133: s0 = f48(v51)
    val v70: s0 = f51(v60, v32)
    v30 = v30.copy(p0 = v56)
    v16 = v16.updated(0, v133)
    v30 = v30.copy(p1 = v48)
    val v49: Vector[Vector[Double]] = v70.p0
    val v88: s2 = f54(v3, v140, v45)
    v30 = v30.copy(p0 = v49)
    val v71: s0 = f46(v17)
    v25 = v25.copy(p0 = v71)
    v88
  }
  @noinline
  def f0(v0: s2, v1: Vector[s2], v2: Double): Double = {
    val v3: s2 = f45(v0, v0)
    var v7: Double = v2
    val v6: s1 = v3.p0
    val v21: Vector[Double] = v6.p1
    val v26: Double = v7 * v7
    var v38: Vector[Double] = v21
    var v72: Vector[Double] = v38
    val v70: Double = v2 - v26
    val v94: Double = v72(1)
    v72 = v72.updated(1, v70)
    v94
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(5.0, 6.0, 7.0)), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0))), s1(s0(Vector(Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), Vector(18.0, 19.0, 20.0)))
    val v1: Vector[s2] = Vector(s2(s1(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0), Vector(25.0))), Vector(26.0, 27.0, 28.0)), s0(Vector(Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0), Vector(33.0))), s1(s0(Vector(Vector(34.0), Vector(35.0)), Vector(Vector(36.0), Vector(37.0), Vector(38.0))), Vector(39.0, 40.0, 41.0))), s2(s1(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0), Vector(46.0))), Vector(47.0, 48.0, 49.0)), s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), s1(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), Vector(60.0, 61.0, 62.0))), s2(s1(s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), Vector(68.0, 69.0, 70.0)), s0(Vector(Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), s1(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0), Vector(80.0))), Vector(81.0, 82.0, 83.0))))
    val v2: Double = 84.0
    val start = nanoTime()
    var result: Double = 84.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}