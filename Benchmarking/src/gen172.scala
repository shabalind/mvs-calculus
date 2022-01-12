import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: s0
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: Double,
    p1: s2
  )
  def f110(v0: s2): s2 = {
    val v1: s1 = v0.p1
    val v8: s0 = v1.p0
    var v5: s0 = v8
    var v4: s1 = v1
    var v2: s1 = v4
    var v9: s2 = v0
    var v20: s1 = v2
    v9 = v9.copy(p0 = v4)
    val v15: s0 = v1.p0
    var v7: s2 = v0
    val v11: Double = v15.p1
    val v6: s0 = v4.p0
    v4 = v4.copy(p0 = v15)
    val v30: Vector[s2] = Vector(v0, v9, v9, v7, v9)
    v7 = v7.copy(p0 = v20)
    v4 = v4.copy(p0 = v5)
    v5 = v5.copy(p1 = v11)
    v4 = v4.copy(p0 = v15)
    val v31: s2 = v30(2)
    v7 = v0
    var v36: Vector[s2] = v30
    v36 = v36.updated(3, v31)
    var v63: Vector[s2] = v36
    val v58: s2 = v63(0)
    val v70: s2 = v36(3)
    v36 = v36.updated(1, v58)
    v36 = v36.updated(3, v7)
    v63 = v63.updated(0, v58)
    v36 = v36.updated(1, v0)
    v20 = v20.copy(p0 = v6)
    v70
  }
  def f92(v0: s2): s2 = {
    val v1: s1 = v0.p0
    val v9: s2 = s2(v1, v1)
    val v3: Vector[s1] = Vector(v1, v1, v1, v1, v1, v1)
    var v8: s2 = v9
    var v7: s1 = v1
    val v2: s0 = v7.p0
    val v10: s1 = v0.p1
    v8 = v8.copy(p0 = v7)
    val v11: s2 = f110(v8)
    val v16: s1 = v3(3)
    val v17: s0 = v1.p0
    val v15: Vector[Vector[Double]] = v17.p0
    val v24: s2 = f110(v9)
    val v12: s1 = v3(3)
    v8 = v8.copy(p1 = v12)
    val v4: Vector[Double] = v15(1)
    var v20: s1 = v10
    val v14: s1 = v24.p0
    val v34: s0 = v20.p0
    val v26: s2 = f110(v24)
    v20 = v20.copy(p0 = v2)
    val v48: s0 = v12.p0
    val v19: s2 = f110(v11)
    var v35: s0 = v17
    val v36: Vector[Double] = v15(2)
    v7 = v7.copy(p0 = v35)
    var v50: s1 = v12
    var v47: s1 = v50
    val v55: s1 = v26.p0
    val v96: s1 = v26.p1
    val v151: Double = v4(0)
    v8 = v8.copy(p0 = v10)
    v8 = v8.copy(p1 = v96)
    var v100: s2 = v19
    val v101: Double = v36(0)
    val v83: s0 = v47.p0
    v8 = v8.copy(p1 = v16)
    v20 = v20.copy(p0 = v48)
    v35 = v35.copy(p1 = v151)
    v8 = v8.copy(p0 = v14)
    v7 = v7.copy(p0 = v34)
    v35 = v35.copy(p1 = v101)
    v20 = v20.copy(p0 = v83)
    val v150: s2 = f110(v100)
    v50 = v50.copy(p0 = v2)
    v100 = v100.copy(p1 = v55)
    v8 = v19
    v150
  }
  def f88(v0: s1): s1 = {
    v0
  }
  def f86(v0: s1): s1 = {
    val v4: s0 = v0.p0
    val v3: s0 = v0.p0
    val v2: Vector[Vector[Double]] = v4.p0
    val v7: Vector[Double] = v2(0)
    val v5: Double = v3.p1
    val v6: Double = v3.p1
    var v1: s0 = v4
    val v8: Vector[Vector[Double]] = v3.p0
    v1 = v1.copy(p0 = v8)
    v1 = v1.copy(p0 = v2)
    val v12: Vector[Double] = v2(0)
    val v14: Vector[s0] = Vector(v4, v4, v3, v1, v1, v3)
    val v9: Vector[Double] = v2(0)
    v1 = v1.copy(p1 = v6)
    val v23: Vector[Vector[Double]] = Vector(v7, v7, v9, v7, v7, v12)
    val v22: Vector[Double] = v2(1)
    var v47: Vector[Double] = v7
    v1 = v1.copy(p1 = v6)
    v47 = v47.updated(0, v5)
    var v39: Vector[Vector[Double]] = v23
    v39 = v39.updated(2, v47)
    val v30: s0 = v0.p0
    val v24: Vector[Double] = v39(5)
    val v59: Double = v24(0)
    v47 = v47.updated(0, v5)
    v47 = v47.updated(0, v59)
    v1 = v1.copy(p1 = v59)
    val v42: s0 = v14(2)
    val v37: s1 = f88(v0)
    var v198: s1 = v37
    v47 = v47.updated(0, v59)
    v39 = v39.updated(0, v22)
    v198 = v198.copy(p0 = v42)
    v47 = v47.updated(0, v6)
    v1 = v1.copy(p1 = v5)
    v198 = v198.copy(p0 = v30)
    v47 = v47.updated(0, v6)
    v198
  }
  def f82(v0: s2): s2 = {
    val v3: s2 = f110(v0)
    val v1: s2 = f92(v3)
    var v9: s2 = v1
    val v11: s1 = v1.p1
    v9 = v9.copy(p0 = v11)
    v9 = v9.copy(p0 = v11)
    val v10: s2 = f92(v9)
    val v22: s2 = f92(v10)
    var v21: s1 = v11
    val v20: s1 = f86(v21)
    val v19: s1 = f86(v20)
    val v12: s1 = v22.p0
    val v28: s1 = f86(v20)
    val v34: s1 = f86(v12)
    val v14: s1 = f86(v11)
    val v32: s1 = f88(v20)
    v9 = v9.copy(p1 = v14)
    var v75: s2 = v10
    v75 = v75.copy(p0 = v28)
    var v44: s1 = v34
    val v64: s1 = f88(v44)
    val v78: s1 = f86(v12)
    val v61: Vector[s1] = Vector(v78, v19, v12, v32)
    val v71: s1 = f88(v64)
    var v159: Vector[s1] = v61
    v159 = v159.updated(3, v14)
    v9 = v9.copy(p1 = v71)
    val v104: s1 = v159(3)
    val v126: s2 = f110(v75)
    v159 = v159.updated(3, v28)
    v9 = v9.copy(p0 = v104)
    v126
  }
  def f81(v0: s1): s1 = {
    var v5: s1 = v0
    val v6: s0 = v5.p0
    val v9: s1 = f86(v0)
    var v48: s1 = v9
    v48 = v48.copy(p0 = v6)
    v48
  }
  def f73(v0: s2): s2 = {
    val v1: s2 = f110(v0)
    val v7: s2 = f82(v1)
    var v6: s2 = v7
    var v2: s2 = v1
    val v3: s1 = v7.p1
    val v9: s2 = s2(v3, v3)
    v6 = v6.copy(p1 = v3)
    val v29: s1 = f88(v3)
    val v8: Vector[s2] = Vector(v9, v2, v1, v6, v2, v1, v6)
    var v21: Vector[s2] = v8
    v21 = v21.updated(1, v7)
    var v39: s2 = v0
    val v17: s2 = v8(5)
    val v30: s2 = f110(v9)
    v21 = v21.updated(2, v30)
    val v41: s1 = v2.p1
    val v57: s1 = v7.p0
    v2 = v2.copy(p0 = v29)
    v21 = v21.updated(1, v39)
    v21 = v21.updated(1, v2)
    val v104: s2 = f92(v17)
    v39 = v39.copy(p1 = v41)
    v39 = v39.copy(p0 = v57)
    val v83: s2 = v21(6)
    v39 = v104
    var v165: s2 = v83
    v21 = v21.updated(3, v165)
    v165
  }
  def f63(v0: Vector[s2], v1: Vector[Vector[s2]], v2: s3): Vector[s2] = {
    var v7: Vector[Vector[s2]] = v1
    val v3: s2 = v0(0)
    val v6: s2 = f82(v3)
    v7 = v7.updated(0, v0)
    val v9: s1 = v6.p1
    val v12: s1 = v6.p1
    var v11: s2 = v6
    val v13: s2 = f82(v3)
    val v16: Vector[s2] = v1(0)
    v11 = v11.copy(p1 = v12)
    v11 = v13
    var v19: s1 = v9
    v7 = v7.updated(0, v16)
    v11 = v11.copy(p1 = v19)
    v7 = v7.updated(0, v0)
    val v24: s0 = v9.p0
    v7 = v7.updated(0, v0)
    v19 = v19.copy(p0 = v24)
    var v42: Vector[s2] = v0
    v7 = v7.updated(0, v42)
    val v39: Vector[s2] = v7(0)
    v7 = v7.updated(0, v39)
    v42 = v42.updated(0, v11)
    var v41: Vector[s2] = v42
    v41 = v39
    v7 = v1
    v7 = v1
    v41 = v41.updated(0, v11)
    var v31: Vector[s2] = v41
    v7 = v7.updated(0, v42)
    var v97: Vector[s2] = v31
    v42 = v42.updated(0, v11)
    v97
  }
  def f58(v0: s1, v1: s1): s1 = {
    val v2: s1 = f88(v0)
    val v10: s1 = f86(v2)
    val v3: s2 = s2(v2, v1)
    var v22: s2 = v3
    v22 = v22.copy(p0 = v10)
    val v24: s1 = v22.p1
    v24
  }
  def f38(v0: s2): s2 = {
    val v2: s1 = v0.p1
    val v5: s1 = f86(v2)
    val v3: s1 = f81(v5)
    var v7: s2 = v0
    val v10: s1 = f88(v2)
    v7 = v7.copy(p0 = v10)
    val v9: s1 = v7.p1
    var v16: s2 = v7
    v16 = v16.copy(p1 = v2)
    val v25: s1 = f81(v2)
    val v63: s1 = f58(v3, v9)
    v16 = v16.copy(p0 = v9)
    v16 = v16.copy(p0 = v25)
    v16 = v16.copy(p1 = v25)
    val v56: s1 = f86(v63)
    v7 = v7.copy(p1 = v56)
    v16
  }
  @noinline
  def f0(v0: s3, v1: Vector[s2], v2: Vector[Vector[s2]], v3: Double): Double = {
    var v4: Vector[s2] = v1
    var v5: Vector[s2] = v4
    val v8: Vector[s2] = f63(v5, v2, v0)
    val v11: s2 = v0.p1
    val v13: s1 = v11.p1
    val v7: s1 = v11.p1
    val v10: s1 = f88(v7)
    var v9: Vector[s2] = v4
    val v31: s2 = f73(v11)
    var v20: s2 = v11
    v20 = v20.copy(p0 = v13)
    val v15: s2 = v5(0)
    val v27: Double = v3 + v3
    v20 = v20.copy(p0 = v10)
    v5 = v8
    val v29: s2 = v9(0)
    v4 = v4.updated(0, v29)
    val v45: Vector[s2] = Vector(v11)
    var v61: s3 = v0
    val v39: s1 = v20.p0
    val v51: s2 = f38(v31)
    val v62: s2 = s2(v39, v7)
    v4 = v45
    v4 = v4.updated(0, v29)
    val v40: Double = v61.p0
    v9 = v9.updated(0, v62)
    val v48: s1 = v15.p1
    val v37: s0 = v48.p0
    val v36: Double = v37.p1
    val v70: Vector[Double] = Vector(v36, v27, v3, v36, v40, v36, v36)
    v4 = v4.updated(0, v62)
    val v160: Double = v61.p0
    var v168: Double = v160
    val v252: Double = v70(5)
    v9 = v9.updated(0, v51)
    val v129: Double = v27 + v168
    val v138: Double = v129 * v252
    v138
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(0.0, s2(s1(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), 4.0)), s1(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), 8.0))))
    val v1: Vector[s2] = Vector(s2(s1(s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)), 12.0)), s1(s0(Vector(Vector(13.0), Vector(14.0), Vector(15.0)), 16.0))))
    val v2: Vector[Vector[s2]] = Vector(Vector(s2(s1(s0(Vector(Vector(17.0), Vector(18.0), Vector(19.0)), 20.0)), s1(s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), 24.0)))))
    val v3: Double = 25.0
    val start = nanoTime()
    var result: Double = 25.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}