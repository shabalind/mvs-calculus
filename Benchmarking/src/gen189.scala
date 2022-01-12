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
  case class s7 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  def f40(v0: s7): s7 = {
    val v1: Vector[s7] = Vector(v0, v0, v0)
    var v7: Vector[s7] = v1
    v7 = v1
    val v10: s7 = v7(0)
    v7 = v7.updated(1, v10)
    val v6: s7 = v7(2)
    v6
  }
  def f38(v0: Vector[s0]): Vector[s0] = {
    var v3: Vector[s0] = v0
    var v8: Vector[s0] = v0
    var v4: Vector[s0] = v3
    val v6: s0 = v4(0)
    val v7: Vector[Vector[Double]] = v6.p1
    val v5: Vector[Vector[Double]] = v6.p0
    v3 = v3.updated(1, v6)
    val v1: s1 = s1(v6, v3)
    var v2: Vector[Vector[Double]] = v7
    val v9: Vector[Double] = v7(0)
    var v13: s0 = v6
    var v14: s0 = v6
    v14 = v14.copy(p1 = v2)
    val v17: Vector[Vector[Double]] = v14.p0
    v14 = v14.copy(p1 = v2)
    var v20: s1 = v1
    v20 = v20.copy(p1 = v4)
    v13 = v13.copy(p1 = v5)
    v13 = v13.copy(p0 = v17)
    val v19: s0 = v4(0)
    v8 = v8.updated(0, v19)
    val v16: s0 = v20.p0
    val v42: Vector[Vector[Double]] = v16.p1
    val v18: Vector[Double] = v17(0)
    val v23: Vector[Vector[Double]] = v16.p1
    val v37: s0 = v20.p0
    v14 = v14.copy(p1 = v23)
    v2 = v2.updated(0, v18)
    val v31: s0 = v1.p0
    val v28: Vector[Vector[Double]] = v16.p1
    var v34: s1 = v20
    v20 = v20.copy(p1 = v4)
    val v48: Vector[s0] = v20.p1
    v14 = v14.copy(p1 = v28)
    var v39: s1 = v34
    v8 = v8.updated(1, v16)
    val v79: Vector[Vector[Double]] = v19.p1
    v14 = v14.copy(p1 = v2)
    v20 = v20.copy(p1 = v8)
    val v71: Vector[Vector[Double]] = v19.p1
    val v67: Vector[s0] = v1.p1
    v13 = v13.copy(p0 = v2)
    v20 = v20.copy(p0 = v31)
    v3 = v3.updated(1, v13)
    var v196: Vector[Vector[Double]] = v5
    v2 = v2.updated(0, v9)
    v39 = v39.copy(p0 = v14)
    v14 = v14.copy(p1 = v28)
    val v69: Vector[Vector[Vector[Double]]] = Vector(v79, v71, v79, v196)
    val v165: Vector[Vector[Double]] = v69(2)
    val v166: Vector[s0] = v34.p1
    v14 = v14.copy(p0 = v17)
    var v126: Vector[Vector[Vector[Double]]] = v69
    v39 = v39.copy(p1 = v48)
    v20 = v20.copy(p0 = v37)
    val v93: Vector[s0] = v39.p1
    val v98: s0 = v20.p0
    val v178: Vector[Vector[Double]] = v126(1)
    v14 = v14.copy(p1 = v42)
    val v161: Vector[Vector[s0]] = Vector(v93, v67, v166)
    v14 = v14.copy(p1 = v165)
    val v124: Vector[s0] = v161(1)
    v20 = v20.copy(p0 = v98)
    var v231: Vector[s0] = v124
    v14 = v14.copy(p1 = v178)
    v231
  }
  def f36(v0: s0): s0 = {
    var v2: s0 = v0
    val v5: Vector[Vector[Double]] = v2.p1
    val v1: Vector[Double] = v5(0)
    var v7: s0 = v2
    val v11: Vector[Double] = v5(0)
    val v10: Vector[Vector[Double]] = v0.p0
    val v14: Vector[Vector[Double]] = v7.p0
    val v16: Vector[Vector[Double]] = v0.p0
    val v17: Vector[Vector[Double]] = v2.p0
    var v9: Vector[Vector[Double]] = v17
    val v18: Vector[Vector[Double]] = v2.p1
    val v15: Vector[Vector[Double]] = v7.p0
    val v20: Vector[Vector[Double]] = v0.p0
    val v47: Vector[Vector[Double]] = v0.p1
    v2 = v2.copy(p0 = v15)
    val v23: Vector[Vector[Double]] = v0.p1
    var v30: s0 = v0
    v2 = v2.copy(p0 = v5)
    v7 = v7.copy(p0 = v17)
    v2 = v2.copy(p0 = v23)
    v7 = v30
    val v58: Vector[Double] = v16(0)
    val v63: Vector[Double] = v47(0)
    val v40: s0 = s0(v17, v18)
    val v69: Vector[Double] = v47(0)
    val v54: Vector[Vector[Double]] = v30.p0
    val v53: Vector[Vector[Double]] = v7.p0
    v9 = v9.updated(0, v69)
    v9 = v9.updated(0, v69)
    var v87: Vector[Vector[Double]] = v9
    var v103: s0 = v2
    val v96: Vector[Vector[Double]] = v40.p1
    v103 = v103.copy(p0 = v10)
    val v37: Vector[Vector[Double]] = v103.p1
    v103 = v103.copy(p0 = v20)
    v103 = v103.copy(p0 = v14)
    v87 = v87.updated(0, v1)
    v87 = v87.updated(0, v58)
    var v114: Vector[Vector[Double]] = v37
    v114 = v20
    v114 = v114.updated(0, v11)
    v9 = v53
    v7 = v7.copy(p1 = v54)
    v2 = v2.copy(p0 = v96)
    var v95: Vector[Double] = v63
    v2 = v2.copy(p0 = v87)
    v103 = v103.copy(p0 = v114)
    v114 = v114.updated(0, v95)
    v103
  }
  def f28(v0: Vector[s7]): Vector[s7] = {
    val v7: s7 = v0(0)
    val v3: s7 = f40(v7)
    var v2: Vector[s7] = v0
    var v11: Vector[s7] = v2
    val v8: s1 = v7.p1
    v2 = v2.updated(0, v3)
    v2 = v11
    var v6: s7 = v7
    val v12: Vector[s7] = Vector(v3, v7, v7, v7, v6, v6)
    val v10: s7 = v12(5)
    val v19: Vector[s1] = Vector(v8)
    v2 = v2.updated(0, v3)
    val v20: s1 = v6.p1
    val v14: s7 = f40(v3)
    v6 = v6.copy(p1 = v20)
    v2 = v2.updated(0, v10)
    v2 = v2.updated(0, v14)
    val v79: s1 = v19(0)
    v6 = v6.copy(p1 = v79)
    v6 = v6.copy(p1 = v79)
    v2
  }
  def f26(v0: s0): s0 = {
    var v1: s0 = v0
    val v5: Vector[Vector[Double]] = v0.p0
    v1 = v1.copy(p1 = v5)
    val v15: Vector[Vector[Double]] = v0.p1
    val v8: s0 = s0(v5, v15)
    val v24: s0 = f36(v8)
    val v17: Vector[Vector[Double]] = v8.p0
    val v18: Vector[Vector[Double]] = v1.p1
    val v19: Vector[Vector[Vector[Double]]] = Vector(v18, v18, v18, v15)
    val v38: Vector[Vector[Double]] = v1.p1
    val v50: Vector[Vector[Double]] = v8.p0
    v1 = v1.copy(p0 = v5)
    var v27: Vector[Vector[Vector[Double]]] = v19
    val v39: Vector[Vector[Double]] = v0.p1
    var v79: s0 = v24
    val v42: s0 = f36(v1)
    val v33: s0 = f36(v42)
    val v52: s0 = f36(v33)
    val v89: s0 = f36(v79)
    v79 = v79.copy(p1 = v50)
    var v46: Vector[Vector[Vector[Double]]] = v27
    val v75: Vector[Vector[Double]] = v52.p1
    val v71: Vector[Vector[Double]] = v89.p1
    val v63: Vector[Vector[Double]] = v1.p1
    val v77: Vector[Vector[Double]] = v46(3)
    v79 = v79.copy(p0 = v17)
    val v125: s0 = s0(v38, v77)
    v27 = v27.updated(2, v39)
    v46 = v46.updated(1, v63)
    val v105: s0 = f36(v125)
    v27 = v27.updated(2, v71)
    v1 = v1.copy(p0 = v75)
    v105
  }
  def f24(v0: s0): s0 = {
    var v7: s0 = v0
    val v3: s0 = f36(v7)
    val v2: Vector[Vector[Double]] = v3.p0
    val v14: s0 = s0(v2, v2)
    val v20: s0 = f36(v14)
    v20
  }
  @noinline
  def f0(v0: Vector[Vector[s7]], v1: Double): Double = {
    val v8: Vector[s7] = v0(0)
    var v6: Vector[s7] = v8
    val v3: Vector[s7] = f28(v6)
    val v11: Vector[s7] = v0(0)
    var v12: Vector[s7] = v3
    val v18: Vector[s7] = f28(v11)
    val v13: Vector[s7] = v0(0)
    val v23: s7 = v12(0)
    val v15: s1 = v23.p1
    val v20: s7 = f40(v23)
    v12 = v12.updated(0, v20)
    var v17: s1 = v15
    val v14: s7 = v18(0)
    v12 = v12.updated(0, v20)
    val v21: s1 = v23.p1
    var v19: s7 = v23
    val v41: Vector[Vector[s0]] = v23.p0
    val v28: s7 = v13(0)
    v19 = v14
    var v39: s7 = v28
    val v43: Vector[Vector[s0]] = v39.p0
    val v34: Vector[s0] = v17.p1
    var v58: s7 = v19
    val v27: Vector[s0] = f38(v34)
    val v42: s7 = v11(0)
    val v50: s1 = v23.p1
    val v25: s0 = v27(1)
    val v47: s0 = f24(v25)
    v58 = v58.copy(p1 = v21)
    v39 = v39.copy(p1 = v15)
    val v31: Vector[s0] = f38(v27)
    v39 = v39.copy(p1 = v17)
    val v61: s0 = f36(v47)
    val v33: s0 = f26(v47)
    val v120: s0 = f24(v25)
    v58 = v58.copy(p0 = v41)
    val v84: s1 = v58.p1
    v39 = v39.copy(p0 = v43)
    v39 = v39.copy(p0 = v43)
    v39 = v39.copy(p0 = v43)
    v17 = v17.copy(p0 = v120)
    v39 = v39.copy(p1 = v84)
    var v52: s1 = v50
    v17 = v17.copy(p0 = v61)
    v39 = v39.copy(p0 = v41)
    var v112: s7 = v42
    v58 = v58.copy(p1 = v15)
    v12 = v12.updated(0, v42)
    val v48: Vector[Vector[Double]] = v33.p0
    val v115: s1 = v14.p1
    var v117: Vector[Vector[Double]] = v48
    v12 = v12.updated(0, v112)
    var v90: s7 = v39
    val v138: Vector[Double] = v117(0)
    var v219: Vector[Double] = v138
    v112 = v112.copy(p1 = v52)
    val v236: Double = v219(0)
    v19 = v19.copy(p1 = v115)
    v12 = v12.updated(0, v90)
    v52 = v52.copy(p1 = v31)
    v236
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s7]] = Vector(Vector(s7(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))))), s1(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))))))
    val v1: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}