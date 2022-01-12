import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[s0],
    p1: s2
  )
  case class s8 (
    p0: Vector[s2],
    p1: s4
  )
  def f101(v0: s2): s2 = {
    v0
  }
  def f85(v0: s2): s2 = {
    val v14: s2 = f101(v0)
    val v19: s2 = f101(v14)
    val v12: s2 = f101(v19)
    v12
  }
  def f81(v0: s8): s8 = {
    val v1: Vector[s2] = v0.p0
    val v7: s2 = v1(0)
    var v8: Vector[s2] = v1
    var v3: Vector[s2] = v1
    val v4: s2 = f101(v7)
    var v2: Vector[s2] = v3
    val v12: s2 = f85(v7)
    v3 = v8
    v8 = v8.updated(0, v7)
    var v43: s8 = v0
    v2 = v2.updated(0, v4)
    val v28: s2 = f101(v12)
    v43 = v43.copy(p0 = v2)
    val v75: s2 = f85(v28)
    val v69: s4 = v43.p1
    v43 = v43.copy(p1 = v69)
    v3 = v3.updated(0, v75)
    v43
  }
  def f76(v0: s8): s8 = {
    val v7: Vector[s2] = v0.p0
    var v1: Vector[s2] = v7
    val v6: s8 = f81(v0)
    val v3: s2 = v7(0)
    val v4: s2 = v7(0)
    val v9: s2 = v7(0)
    var v10: s2 = v3
    var v8: s8 = v6
    var v2: Vector[s2] = v7
    val v24: s2 = f85(v10)
    val v29: s2 = f101(v10)
    v8 = v8.copy(p0 = v2)
    var v12: s8 = v8
    val v18: s2 = f85(v9)
    val v32: s2 = v7(0)
    val v15: Vector[s0] = v24.p1
    var v33: Vector[s2] = v7
    v10 = v10.copy(p1 = v15)
    val v17: s4 = v12.p1
    v33 = v33.updated(0, v18)
    v8 = v8.copy(p1 = v17)
    val v59: Vector[s0] = v17.p0
    var v28: s4 = v17
    v12 = v12.copy(p0 = v33)
    v8 = v0
    var v65: Vector[s0] = v59
    val v19: s2 = f85(v3)
    v33 = v33.updated(0, v3)
    val v69: s2 = f101(v32)
    val v37: Vector[s0] = v4.p0
    v28 = v28.copy(p1 = v29)
    var v137: Vector[s2] = v2
    v33 = v33.updated(0, v29)
    var v58: Vector[s2] = v137
    var v48: Vector[s2] = v58
    val v74: s2 = v58(0)
    v28 = v28.copy(p0 = v65)
    v8 = v8.copy(p0 = v1)
    var v86: Vector[s0] = v37
    v2 = v2.updated(0, v29)
    v58 = v58.updated(0, v19)
    v28 = v28.copy(p1 = v3)
    v137 = v58
    v1 = v1.updated(0, v69)
    v2 = v2.updated(0, v18)
    v12 = v8
    val v191: s8 = s8(v48, v28)
    v10 = v10.copy(p0 = v86)
    v33 = v33.updated(0, v74)
    v191
  }
  def f44(v0: s8): s8 = {
    val v1: s8 = f81(v0)
    val v4: Vector[s2] = v0.p0
    val v5: s8 = f76(v1)
    val v3: s2 = v4(0)
    val v8: Vector[s0] = v3.p1
    var v17: s2 = v3
    var v2: Vector[s2] = v4
    val v9: s0 = v8(1)
    var v23: s0 = v9
    var v10: s2 = v17
    var v15: s2 = v10
    val v13: s2 = v2(0)
    val v12: s2 = v4(0)
    var v11: s2 = v12
    v11 = v15
    v10 = v10.copy(p1 = v8)
    var v18: s0 = v23
    val v21: s0 = v8(1)
    v2 = v2.updated(0, v13)
    var v41: s8 = v5
    v15 = v15.copy(p1 = v8)
    v2 = v2.updated(0, v11)
    v11 = v11.copy(p1 = v8)
    val v28: s2 = v2(0)
    v41 = v41.copy(p0 = v2)
    val v36: s0 = v8(0)
    var v51: Vector[s0] = v8
    val v54: Vector[Vector[Double]] = v21.p0
    val v25: s0 = v8(1)
    var v34: Vector[s0] = v8
    var v38: Vector[Vector[Double]] = v54
    val v40: s0 = v51(2)
    var v30: s0 = v36
    val v47: s0 = v51(2)
    val v52: s4 = v1.p1
    v34 = v34.updated(1, v30)
    val v89: Vector[Double] = v54(1)
    v34 = v34.updated(1, v36)
    var v102: Vector[s0] = v34
    v51 = v51.updated(2, v40)
    var v77: s0 = v18
    v102 = v102.updated(1, v47)
    v10 = v10.copy(p1 = v102)
    var v114: s4 = v52
    v102 = v102.updated(1, v25)
    v2 = v2.updated(0, v10)
    v23 = v23.copy(p0 = v54)
    v38 = v38.updated(0, v89)
    v102 = v102.updated(2, v25)
    v30 = v30.copy(p0 = v38)
    v34 = v34.updated(0, v77)
    var v190: s0 = v30
    var v104: s4 = v114
    v15 = v15.copy(p1 = v51)
    var v234: s8 = v41
    v34 = v34.updated(2, v9)
    v51 = v51.updated(2, v190)
    v234 = v234.copy(p1 = v104)
    v17 = v17.copy(p1 = v102)
    v114 = v114.copy(p1 = v28)
    val v250: Vector[s0] = v15.p0
    v11 = v11.copy(p0 = v250)
    v234
  }
  def f24(v0: s8): s8 = {
    val v5: Vector[s2] = v0.p0
    var v8: Vector[s2] = v5
    var v1: Vector[s2] = v5
    val v6: Vector[s2] = v0.p0
    val v2: s2 = v6(0)
    var v14: s8 = v0
    v14 = v14.copy(p0 = v1)
    val v3: s2 = f85(v2)
    val v11: s4 = v14.p1
    val v25: s8 = f44(v14)
    var v10: s4 = v11
    var v18: s8 = v25
    v8 = v8.updated(0, v3)
    v14 = v14.copy(p0 = v6)
    val v12: s2 = v11.p1
    val v63: s2 = v8(0)
    v10 = v11
    v1 = v1.updated(0, v12)
    val v43: Vector[s0] = v10.p0
    val v87: s8 = f44(v14)
    v10 = v10.copy(p0 = v43)
    v18 = v18.copy(p1 = v11)
    v1 = v1.updated(0, v63)
    v18 = v18.copy(p1 = v11)
    v14 = v14.copy(p1 = v10)
    val v46: s4 = v87.p1
    val v118: s2 = v8(0)
    val v117: s4 = v0.p1
    v1 = v1.updated(0, v118)
    v18 = v18.copy(p1 = v10)
    v14 = v14.copy(p1 = v46)
    v1 = v1.updated(0, v2)
    v18 = v18.copy(p1 = v117)
    v18
  }
  def f15(v0: s4, v1: s8): s4 = {
    val v32: Vector[s0] = v0.p0
    val v46: s4 = v1.p1
    var v139: s4 = v46
    v139 = v139.copy(p0 = v32)
    v139
  }
  @noinline
  def f0(v0: Vector[s8], v1: Double): Double = {
    val v7: Vector[Double] = Vector(v1, v1, v1, v1, v1, v1)
    var v3: Vector[s8] = v0
    val v9: s8 = v3(1)
    val v6: Double = v7(2)
    val v8: s4 = v9.p1
    v3 = v0
    var v11: Vector[s8] = v0
    v3 = v0
    v11 = v11.updated(0, v9)
    val v5: s4 = f15(v8, v9)
    v11 = v11.updated(0, v9)
    val v17: s8 = v0(0)
    val v34: s8 = f24(v9)
    val v21: Vector[s2] = v17.p0
    val v32: s8 = f24(v34)
    v3 = v3.updated(0, v34)
    var v38: s8 = v32
    val v39: Vector[s2] = v32.p0
    v11 = v11.updated(1, v9)
    val v60: s4 = v38.p1
    val v41: s8 = v0(0)
    v11 = v11.updated(1, v34)
    v11 = v11.updated(0, v32)
    val v50: s8 = v11(0)
    v38 = v38.copy(p1 = v5)
    v38 = v38.copy(p1 = v60)
    val v69: Vector[s0] = v5.p0
    v3 = v3.updated(0, v17)
    v3 = v3.updated(0, v50)
    val v90: s0 = v69(0)
    var v56: Vector[s2] = v21
    val v63: s8 = f24(v34)
    val v101: Vector[Vector[Double]] = v90.p0
    v38 = v38.copy(p1 = v8)
    v11 = v11.updated(1, v41)
    v11 = v11.updated(1, v50)
    val v87: Vector[Double] = v101(0)
    v38 = v38.copy(p0 = v39)
    v11 = v11.updated(0, v38)
    v11 = v11.updated(1, v63)
    v38 = v38.copy(p0 = v56)
    val v107: Double = v87(0)
    val v296: Double = v107 * v6
    v3 = v3.updated(1, v32)
    v296
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))))), s4(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), s2(Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))))))), s8(Vector(s2(Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)))), Vector(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))))), s4(Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)))), s2(Vector(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)))), Vector(s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0))), s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0))))))))
    val v1: Double = 66.0
    val start = nanoTime()
    var result: Double = 66.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}