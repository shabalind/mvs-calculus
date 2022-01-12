import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  case class s3 (
    p0: s1,
    p1: s1
  )
  def f70(v0: s2, v1: s3): s2 = {
    var v6: s2 = v0
    var v2: s3 = v1
    val v3: s1 = v6.p1
    var v4: s1 = v3
    v6 = v6.copy(p1 = v4)
    val v8: s1 = v2.p1
    var v13: s2 = v0
    v13 = v13.copy(p1 = v8)
    v6 = v6.copy(p1 = v8)
    v2 = v2.copy(p0 = v3)
    v13 = v13.copy(p1 = v8)
    val v44: s1 = v1.p0
    val v33: Vector[Vector[s0]] = v13.p0
    var v35: Vector[Vector[s0]] = v33
    v2 = v2.copy(p1 = v44)
    val v117: Vector[s0] = v33(0)
    v6 = v6.copy(p0 = v33)
    v6 = v6.copy(p0 = v35)
    v35 = v35.updated(1, v117)
    v13
  }
  def f62(v0: Vector[s1]): Vector[s1] = {
    var v1: Vector[s1] = v0
    v1 = v0
    var v3: Vector[s1] = v1
    var v2: Vector[s1] = v1
    val v5: Vector[Vector[s1]] = Vector(v1, v2, v3)
    val v7: s1 = v2(1)
    val v4: Vector[s1] = v5(0)
    val v6: Vector[s1] = v5(2)
    v3 = v3.updated(0, v7)
    v1 = v2
    val v8: s0 = v7.p0
    var v10: s1 = v7
    v2 = v2.updated(0, v7)
    val v13: s1 = v2(1)
    val v14: Vector[Vector[Double]] = v7.p1
    v2 = v2.updated(1, v7)
    val v11: s0 = v7.p0
    var v15: s0 = v11
    v1 = v1.updated(1, v10)
    val v45: s1 = v6(1)
    v10 = v10.copy(p0 = v8)
    val v12: Vector[Vector[Double]] = v13.p1
    val v27: Vector[Vector[Double]] = v8.p1
    v10 = v10.copy(p1 = v12)
    val v43: Vector[Vector[Double]] = v11.p1
    var v63: s0 = v15
    v10 = v10.copy(p0 = v15)
    v15 = v15.copy(p1 = v43)
    v15 = v15.copy(p1 = v43)
    val v26: s1 = v0(1)
    v15 = v15.copy(p1 = v27)
    v2 = v2.updated(1, v10)
    v10 = v10.copy(p1 = v14)
    v3 = v3.updated(1, v26)
    v10 = v10.copy(p0 = v63)
    v10 = v10.copy(p0 = v63)
    v1 = v1.updated(0, v7)
    v2 = v2.updated(0, v45)
    v4
  }
  def f57(v0: s2): s2 = {
    val v5: Vector[Vector[s0]] = v0.p0
    var v4: Vector[Vector[s0]] = v5
    val v1: Vector[s0] = v5(1)
    val v6: s1 = v0.p1
    val v8: Vector[Vector[s0]] = v0.p0
    val v9: s1 = v0.p1
    val v19: s0 = v9.p0
    val v13: Vector[Vector[Double]] = v19.p0
    var v15: s1 = v9
    v4 = v4.updated(1, v1)
    val v12: Vector[Vector[Double]] = v19.p1
    var v20: s0 = v19
    val v47: Vector[Vector[Double]] = v15.p1
    var v28: Vector[Vector[Double]] = v12
    v20 = v20.copy(p1 = v12)
    v20 = v20.copy(p1 = v12)
    v20 = v20.copy(p1 = v28)
    v20 = v20.copy(p0 = v13)
    var v67: s2 = v0
    var v36: s2 = v67
    val v25: Vector[Vector[Double]] = v6.p1
    v20 = v20.copy(p0 = v13)
    var v71: s1 = v9
    v71 = v15
    v20 = v20.copy(p1 = v12)
    v4 = v5
    val v54: Vector[Double] = v47(0)
    v28 = v28.updated(0, v54)
    val v33: Vector[s0] = v5(0)
    v15 = v15.copy(p1 = v47)
    val v32: Vector[Vector[Double]] = v15.p1
    val v44: Vector[s0] = v8(0)
    v36 = v0
    val v52: s3 = s3(v71, v71)
    val v73: s1 = v67.p1
    v36 = v36.copy(p0 = v4)
    val v85: Vector[Double] = v47(1)
    var v58: s3 = v52
    val v74: s2 = f70(v36, v52)
    val v53: s2 = f70(v74, v58)
    val v43: s0 = v44(0)
    var v91: s3 = v58
    v15 = v15.copy(p0 = v43)
    var v98: s3 = v52
    v4 = v4.updated(1, v1)
    v91 = v91.copy(p1 = v9)
    v4 = v4.updated(1, v33)
    v36 = v36.copy(p1 = v9)
    val v170: s2 = f70(v67, v52)
    var v141: Vector[Vector[Double]] = v25
    val v59: s2 = f70(v53, v91)
    val v110: s1 = v91.p1
    v67 = v67.copy(p1 = v6)
    v98 = v98.copy(p1 = v9)
    v71 = v71.copy(p1 = v32)
    v28 = v28.updated(0, v85)
    v98 = v98.copy(p1 = v110)
    var v163: s3 = v98
    val v181: s2 = f70(v170, v163)
    v67 = v181
    v36 = v36.copy(p1 = v73)
    v15 = v15.copy(p0 = v20)
    v71 = v71.copy(p1 = v141)
    val v145: s2 = f70(v59, v91)
    v4 = v4.updated(1, v33)
    v145
  }
  def f49(v0: s0): s0 = {
    v0
  }
  def f45(v0: s1): s1 = {
    var v6: s1 = v0
    val v5: Vector[s1] = Vector(v6, v6, v6, v0, v0)
    val v3: s0 = v0.p0
    val v1: s0 = f49(v3)
    v6 = v6.copy(p0 = v1)
    v6 = v0
    val v30: s0 = f49(v1)
    val v48: Vector[Vector[Double]] = v6.p1
    val v98: s0 = f49(v3)
    v6 = v6.copy(p1 = v48)
    val v93: s0 = f49(v98)
    v6 = v6.copy(p0 = v30)
    v6 = v6.copy(p0 = v93)
    val v119: s1 = v5(2)
    v119
  }
  def f37(v0: s2): s2 = {
    var v5: s2 = v0
    val v3: s1 = v0.p1
    var v6: s2 = v5
    v5 = v0
    var v8: s1 = v3
    val v9: Vector[Vector[s0]] = v5.p0
    var v4: s2 = v5
    var v14: s1 = v3
    val v7: Vector[s1] = Vector(v8, v3)
    var v2: s1 = v8
    var v10: Vector[s1] = v7
    val v12: Vector[s1] = f62(v10)
    v10 = v10.updated(1, v3)
    val v1: Vector[s0] = v9(1)
    val v15: s0 = v14.p0
    val v20: s2 = s2(v9, v3)
    v6 = v6.copy(p1 = v2)
    val v11: s1 = v7(0)
    val v19: s0 = v1(0)
    val v26: s1 = v6.p1
    v10 = v10.updated(1, v8)
    v10 = v10.updated(0, v26)
    val v16: Vector[s1] = f62(v12)
    v10 = v10.updated(1, v2)
    val v42: s1 = v12(1)
    val v17: s1 = v12(1)
    val v25: s1 = f45(v42)
    v10 = v10.updated(0, v11)
    v6 = v5
    val v28: s3 = s3(v42, v17)
    v6 = v6.copy(p0 = v9)
    v4 = v4.copy(p1 = v25)
    v10 = v10.updated(1, v11)
    v4 = v20
    var v46: s3 = v28
    v2 = v2.copy(p0 = v19)
    v10 = v10.updated(1, v17)
    val v37: Vector[s0] = v9(1)
    v14 = v14.copy(p0 = v19)
    val v40: s2 = f70(v4, v46)
    val v57: s0 = v37(0)
    val v51: Vector[s3] = Vector(v28, v46, v46, v46, v46)
    val v58: Vector[Vector[s0]] = v40.p0
    v14 = v14.copy(p0 = v57)
    val v43: Vector[Vector[Double]] = v19.p1
    val v29: Vector[Vector[Double]] = v15.p0
    val v71: Vector[Vector[s0]] = v6.p0
    val v79: s2 = f70(v40, v28)
    val v99: s1 = v16(0)
    val v73: Vector[Vector[Double]] = v3.p1
    var v54: Vector[Vector[s0]] = v71
    val v53: s0 = s0(v29, v43)
    val v68: s3 = v51(3)
    v2 = v2.copy(p0 = v53)
    v8 = v8.copy(p1 = v73)
    v6 = v6.copy(p0 = v71)
    v4 = v4.copy(p0 = v71)
    val v212: s1 = v68.p1
    v6 = v6.copy(p0 = v54)
    v4 = v4.copy(p0 = v54)
    v4 = v4.copy(p1 = v212)
    v4 = v4.copy(p0 = v58)
    v5 = v5.copy(p1 = v99)
    v79
  }
  def f32(v0: Vector[s0]): Vector[s0] = {
    val v7: s0 = v0(0)
    var v8: Vector[s0] = v0
    val v11: s0 = f49(v7)
    v8 = v0
    var v105: Vector[s0] = v8
    val v237: s0 = f49(v11)
    v8 = v8.updated(0, v237)
    var v138: Vector[s0] = v105
    var v252: Vector[s0] = v138
    v252
  }
  def f20(v0: s2): s2 = {
    val v2: Vector[Vector[s0]] = v0.p0
    val v4: s2 = f57(v0)
    var v7: Vector[Vector[s0]] = v2
    var v6: s2 = v0
    v6 = v6.copy(p0 = v7)
    val v3: s1 = v4.p1
    val v1: s2 = f57(v6)
    val v5: s1 = f45(v3)
    val v11: s1 = f45(v3)
    val v10: Vector[s0] = v2(0)
    val v17: s1 = v1.p1
    val v20: s3 = s3(v3, v11)
    v6 = v6.copy(p1 = v5)
    val v39: Vector[s0] = v2(0)
    v7 = v7.updated(0, v10)
    val v28: s2 = f37(v0)
    var v33: Vector[Vector[s0]] = v2
    val v34: Vector[s0] = v7(0)
    val v37: Vector[s0] = v2(1)
    v33 = v33.updated(1, v34)
    v7 = v7.updated(1, v34)
    var v61: Vector[Vector[s0]] = v2
    val v32: s1 = v28.p1
    var v41: Vector[Vector[s0]] = v7
    v6 = v6.copy(p0 = v61)
    var v102: Vector[Vector[s0]] = v61
    val v86: s3 = s3(v32, v17)
    v61 = v61.updated(0, v37)
    v6 = v6.copy(p0 = v102)
    v41 = v41.updated(1, v37)
    var v99: Vector[Vector[s0]] = v33
    v6 = v6.copy(p1 = v11)
    v99 = v99.updated(1, v10)
    v41 = v41.updated(0, v39)
    val v85: s1 = v20.p0
    val v94: s2 = s2(v41, v85)
    v6 = v6.copy(p0 = v99)
    val v195: s2 = f70(v94, v86)
    v195
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v2: s2 = f57(v0)
    val v5: s1 = v2.p1
    val v8: s2 = f20(v2)
    val v9: s0 = v5.p0
    val v4: Vector[Vector[s0]] = v8.p0
    var v11: s0 = v9
    val v13: Vector[Vector[Double]] = v11.p1
    val v16: Vector[Double] = v13(0)
    val v23: Vector[Vector[Double]] = v11.p0
    val v21: s0 = f49(v11)
    val v35: Vector[Double] = v23(0)
    val v17: Double = v35(0)
    v11 = v11.copy(p0 = v23)
    val v34: Vector[s0] = v4(0)
    val v27: Vector[Vector[Double]] = v5.p1
    var v41: Vector[Vector[Double]] = v23
    var v43: Vector[Vector[Double]] = v27
    val v72: Vector[s0] = f32(v34)
    val v53: s0 = v72(0)
    val v67: Double = v17 * v1
    v43 = v43.updated(0, v16)
    val v81: Vector[Vector[Double]] = v21.p0
    val v50: Vector[Vector[Double]] = v53.p0
    v43 = v43.updated(0, v35)
    v11 = v11.copy(p1 = v13)
    val v78: Vector[Vector[Vector[Double]]] = Vector(v81, v23, v50, v41, v50, v41, v41)
    val v111: Vector[Double] = v43(1)
    val v150: Vector[Vector[Double]] = v78(1)
    val v58: Vector[Double] = v150(1)
    var v55: Vector[Vector[Double]] = v150
    v55 = v55.updated(0, v111)
    v11 = v11.copy(p0 = v81)
    var v125: Vector[Vector[Double]] = v55
    v11 = v11.copy(p0 = v125)
    v41 = v41.updated(0, v58)
    val v193: Double = v67 + v67
    val v203: Double = v67 - v193
    var v96: Double = v203
    v96
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))), s1(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}