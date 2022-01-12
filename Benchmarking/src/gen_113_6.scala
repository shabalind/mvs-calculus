import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: s0
  )
  case class s4 (
    p0: s1,
    p1: s3
  )
  def f102(v0: Vector[s0]): Vector[s0] = {
    val v7: s0 = v0(2)
    val v5: s0 = v0(1)
    var v1: Vector[s0] = v0
    val v8: s3 = s3(v0, v7)
    var v2: Vector[s0] = v1
    val v9: Vector[Vector[Double]] = v5.p0
    val v10: s0 = v8.p1
    val v16: Vector[Double] = v10.p1
    val v12: s0 = s0(v9, v16)
    v2 = v2.updated(0, v12)
    val v32: Vector[Vector[s0]] = Vector(v2, v1, v1, v0, v0)
    var v34: Vector[Vector[s0]] = v32
    v34 = v34.updated(0, v1)
    v34 = v34.updated(4, v1)
    val v150: Vector[s0] = v34(4)
    v150
  }
  def f91(v0: s4): s4 = {
    val v6: s3 = v0.p1
    val v3: s0 = v6.p1
    val v4: Vector[s0] = Vector(v3, v3, v3)
    val v9: s0 = v4(2)
    val v2: Vector[s0] = f102(v4)
    var v1: s0 = v3
    val v7: s0 = v4(0)
    val v8: s0 = v2(1)
    val v10: s0 = v4(1)
    val v18: Vector[Vector[Double]] = v10.p0
    var v42: s0 = v8
    v42 = v42.copy(p0 = v18)
    val v41: s1 = s1(v1, v7)
    val v112: s4 = s4(v41, v6)
    val v48: Vector[Double] = v9.p1
    val v69: Vector[Double] = v3.p1
    val v75: Vector[s0] = f102(v4)
    val v113: Vector[s0] = f102(v75)
    v1 = v1.copy(p1 = v69)
    var v121: Vector[Double] = v48
    v1 = v1.copy(p1 = v121)
    val v184: Vector[Double] = v42.p1
    var v124: s4 = v112
    v1 = v1.copy(p1 = v184)
    v124 = v0
    var v156: s4 = v124
    val v155: s0 = v113(1)
    v1 = v155
    v156
  }
  def f70(v0: s1, v1: s1): s1 = {
    var v3: s1 = v1
    var v2: s1 = v3
    val v4: s0 = v1.p0
    val v9: s0 = v1.p1
    val v7: Vector[Vector[Double]] = v9.p0
    val v13: s0 = v0.p1
    v2 = v3
    val v8: Vector[s1] = Vector(v0, v2, v3, v0)
    v2 = v0
    var v24: s0 = v4
    var v46: s0 = v13
    v46 = v46.copy(p0 = v7)
    val v59: s1 = v8(1)
    v3 = v3.copy(p1 = v24)
    v24 = v46
    v59
  }
  def f48(v0: s1): s1 = {
    var v1: s1 = v0
    val v5: s0 = v0.p1
    val v2: s0 = v0.p1
    val v4: s1 = f70(v1, v1)
    val v8: s1 = f70(v4, v0)
    var v7: s0 = v5
    val v6: s0 = v0.p0
    var v3: s1 = v0
    val v9: s1 = f70(v0, v8)
    val v11: s1 = f70(v1, v0)
    v3 = v3.copy(p0 = v7)
    v3 = v3.copy(p0 = v2)
    v1 = v1.copy(p0 = v6)
    v1 = v1.copy(p0 = v5)
    v1 = v1.copy(p0 = v6)
    val v15: s1 = f70(v1, v4)
    var v10: s0 = v2
    v3 = v3.copy(p0 = v2)
    var v13: s0 = v5
    v3 = v3.copy(p0 = v13)
    val v18: s0 = v9.p0
    val v50: s0 = v3.p1
    val v17: s1 = f70(v11, v11)
    var v51: s1 = v17
    val v48: s1 = f70(v51, v4)
    val v58: Vector[Vector[Double]] = v50.p0
    var v45: Vector[Vector[Double]] = v58
    val v46: Vector[Vector[Double]] = v6.p0
    val v37: Vector[Vector[Vector[Double]]] = Vector(v58, v46, v45, v46, v46)
    v7 = v18
    val v40: Vector[Double] = v18.p1
    val v32: Vector[Double] = v6.p1
    var v75: Vector[Vector[Vector[Double]]] = v37
    v3 = v3.copy(p1 = v2)
    val v42: s0 = v11.p1
    v10 = v10.copy(p1 = v40)
    v51 = v51.copy(p0 = v7)
    val v73: s1 = f70(v1, v17)
    val v63: s1 = s1(v5, v18)
    val v66: Vector[Double] = v2.p1
    v75 = v75.updated(3, v58)
    val v161: s1 = f70(v17, v15)
    v10 = v10.copy(p1 = v66)
    val v61: s1 = f70(v48, v63)
    var v112: s0 = v42
    var v55: s0 = v13
    val v197: Vector[Vector[Double]] = v37(4)
    v1 = v1.copy(p1 = v50)
    val v177: s1 = s1(v112, v42)
    val v119: Vector[Vector[Double]] = v75(3)
    var v78: s1 = v17
    var v142: s0 = v18
    v112 = v112.copy(p0 = v119)
    val v111: s1 = f70(v161, v177)
    val v144: s0 = v61.p1
    v1 = v1.copy(p0 = v10)
    val v350: s0 = v73.p0
    val v113: Vector[Double] = v144.p1
    v1 = v1.copy(p1 = v144)
    val v123: Vector[Vector[Double]] = v142.p0
    v55 = v55.copy(p1 = v113)
    v55 = v55.copy(p0 = v123)
    v51 = v51.copy(p0 = v350)
    val v82: s0 = v1.p0
    v75 = v75.updated(3, v197)
    v7 = v7.copy(p0 = v197)
    var v201: s1 = v63
    val v221: s1 = f70(v111, v177)
    val v390: s1 = f70(v221, v48)
    v3 = v3.copy(p0 = v82)
    v51 = v51.copy(p0 = v55)
    val v302: s1 = f70(v201, v390)
    val v137: s1 = f70(v302, v78)
    v112 = v112.copy(p1 = v32)
    v137
  }
  def f45(v0: s1): s1 = {
    val v1: s0 = v0.p1
    val v2: Vector[Double] = v1.p1
    val v5: Vector[Double] = v1.p1
    val v3: Double = v5(0)
    val v9: Vector[Double] = v1.p1
    val v8: Vector[Vector[Double]] = Vector(v2, v5, v2, v9, v9, v2, v2)
    var v4: Vector[Double] = v2
    var v7: s0 = v1
    val v10: s1 = f70(v0, v0)
    var v15: Double = v3
    val v11: s1 = f70(v0, v10)
    v7 = v7.copy(p1 = v4)
    val v16: Vector[Vector[Double]] = v1.p0
    val v24: s1 = f70(v11, v0)
    val v32: Vector[Double] = v8(1)
    val v29: s1 = f48(v24)
    val v27: Vector[s0] = Vector(v7, v7)
    v4 = v4.updated(0, v15)
    v7 = v7.copy(p1 = v9)
    v7 = v7.copy(p0 = v16)
    v7 = v7.copy(p0 = v16)
    v4 = v4.updated(0, v3)
    v7 = v7.copy(p0 = v16)
    val v34: s0 = v29.p0
    val v33: Double = v2(2)
    val v73: Vector[Vector[Double]] = v34.p0
    v15 = v33
    val v87: s1 = f48(v10)
    v7 = v7.copy(p1 = v32)
    var v59: Vector[s0] = v27
    v4 = v4.updated(2, v33)
    v7 = v7.copy(p1 = v32)
    v7 = v7.copy(p0 = v73)
    val v97: s0 = v59(1)
    var v161: s1 = v10
    v161 = v161.copy(p0 = v97)
    val v166: s1 = f70(v87, v161)
    v166
  }
  def f34(v0: Double): Double = {
    var v6: Double = v0
    var v1: Double = v6
    val v2: Double = v1 * v6
    var v3: Double = v1
    var v7: Double = v2
    var v8: Double = v3
    v1 = v7
    var v15: Double = v8
    val v13: Double = v8 + v15
    var v14: Double = v2
    var v17: Double = v2
    var v35: Double = v3
    v35 = v17
    v1 = v13
    val v36: Vector[Double] = Vector(v3, v35, v0, v0, v14)
    val v23: Double = v36(2)
    var v53: Vector[Double] = v36
    var v43: Vector[Double] = v53
    var v58: Vector[Double] = v43
    v58 = v58.updated(4, v23)
    var v47: Vector[Double] = v58
    val v62: Double = v47(4)
    v43 = v43.updated(3, v62)
    val v71: Double = v47(2)
    v71
  }
  def f21(v0: s0): s0 = {
    var v3: s0 = v0
    val v7: Vector[Vector[Double]] = v3.p0
    val v2: Vector[Double] = v0.p1
    var v4: Vector[Double] = v2
    v4 = v2
    val v9: Vector[Double] = v0.p1
    val v13: Double = v4(2)
    v3 = v3.copy(p1 = v9)
    var v12: s0 = v0
    var v10: Vector[Vector[Double]] = v7
    val v26: Double = f34(v13)
    val v16: s0 = s0(v7, v9)
    v12 = v12.copy(p1 = v4)
    v4 = v4.updated(0, v26)
    val v22: Vector[Vector[Double]] = v3.p0
    val v18: Vector[s0] = Vector(v16)
    var v21: Vector[s0] = v18
    val v79: Vector[Vector[Double]] = v16.p0
    var v30: Vector[s0] = v18
    val v32: Double = v9(0)
    val v44: Vector[Double] = v3.p1
    v12 = v12.copy(p0 = v10)
    val v17: s0 = v30(0)
    v3 = v3.copy(p1 = v44)
    v30 = v21
    v4 = v4.updated(2, v32)
    v21 = v21.updated(0, v17)
    var v70: Vector[s0] = v30
    v70 = v70.updated(0, v16)
    v70 = v70.updated(0, v16)
    val v73: Vector[Double] = v12.p1
    v70 = v70.updated(0, v3)
    v3 = v3.copy(p0 = v22)
    v3 = v3.copy(p0 = v79)
    val v60: s0 = v70(0)
    v3 = v3.copy(p1 = v73)
    v60
  }
  def f18(v0: s1): s1 = {
    val v1: s1 = f48(v0)
    var v2: s1 = v0
    var v4: s1 = v1
    v4 = v2
    val v8: s0 = v4.p1
    var v7: s0 = v8
    var v3: s0 = v7
    v3 = v7
    val v6: s0 = v4.p1
    val v14: s1 = s1(v3, v8)
    var v20: s1 = v14
    val v11: s0 = v0.p1
    val v16: s1 = f45(v20)
    val v29: Vector[s0] = Vector(v11, v6, v7, v3, v6, v8)
    val v40: s0 = v29(0)
    v4 = v4.copy(p1 = v8)
    v2 = v2.copy(p0 = v8)
    val v27: s1 = f70(v16, v20)
    val v37: s0 = v29(4)
    v2 = v2.copy(p0 = v3)
    v2 = v27
    val v62: s1 = s1(v37, v40)
    v62
  }
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    val v4: s1 = v0.p0
    val v6: s4 = f91(v0)
    val v7: s1 = v6.p0
    val v3: s1 = f18(v4)
    var v5: Double = v1
    var v9: s1 = v3
    val v8: s0 = v9.p1
    var v10: s4 = v6
    val v19: s0 = v7.p1
    val v14: s0 = f21(v19)
    val v13: s0 = f21(v8)
    val v16: Vector[Double] = v13.p1
    val v34: s3 = v10.p1
    val v23: Vector[s0] = v34.p0
    val v47: Double = v16(0)
    val v28: Double = v16(2)
    val v32: Double = v16(2)
    var v37: Vector[Double] = v16
    val v43: s3 = s3(v23, v13)
    v37 = v37.updated(1, v5)
    v37 = v37.updated(2, v47)
    v5 = v32
    var v30: Vector[Double] = v37
    val v49: s1 = f45(v4)
    val v48: s0 = v43.p1
    v30 = v30.updated(1, v28)
    v37 = v37.updated(0, v32)
    val v59: s3 = v0.p1
    v10 = v10.copy(p1 = v59)
    v10 = v10.copy(p0 = v49)
    v30 = v30.updated(1, v32)
    v9 = v9.copy(p0 = v14)
    v30 = v30.updated(0, v32)
    v9 = v9.copy(p0 = v48)
    val v88: Double = v30(1)
    v37 = v37.updated(0, v32)
    v88
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(2.0, 3.0, 4.0)), s0(Vector(Vector(5.0), Vector(6.0)), Vector(7.0, 8.0, 9.0))), s3(Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(12.0, 13.0, 14.0)), s0(Vector(Vector(15.0), Vector(16.0)), Vector(17.0, 18.0, 19.0)), s0(Vector(Vector(20.0), Vector(21.0)), Vector(22.0, 23.0, 24.0))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(27.0, 28.0, 29.0))))
    val v1: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}