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
  case class s3 (
    p0: s1,
    p1: Vector[s0]
  )
  def f35(v0: s1): s1 = {
    var v1: s1 = v0
    var v2: s1 = v0
    val v7: Vector[s0] = v0.p1
    val v4: s0 = v7(0)
    val v3: s0 = v7(0)
    var v9: s1 = v1
    v1 = v1.copy(p1 = v7)
    var v8: s1 = v0
    var v16: s0 = v4
    v9 = v9.copy(p0 = v16)
    v9 = v0
    var v12: s1 = v1
    v9 = v2
    v2 = v2.copy(p0 = v3)
    val v22: Vector[Vector[Double]] = v3.p0
    val v28: Vector[s0] = v12.p1
    v9 = v9.copy(p1 = v28)
    val v17: Vector[Vector[Double]] = v3.p1
    val v34: s0 = v7(0)
    v1 = v1.copy(p0 = v34)
    val v52: s0 = v9.p0
    val v64: s0 = v1.p0
    v16 = v16.copy(p1 = v17)
    v12 = v12.copy(p0 = v64)
    v12 = v12.copy(p0 = v34)
    v16 = v16.copy(p0 = v22)
    v9 = v8
    v9 = v9.copy(p0 = v64)
    v16 = v52
    v9
  }
  def f20(v0: s1): s1 = {
    val v1: s1 = f35(v0)
    val v5: s1 = f35(v1)
    val v11: s1 = f35(v0)
    val v3: s1 = f35(v1)
    var v9: s1 = v11
    val v6: Vector[s1] = Vector(v1, v3, v5)
    val v4: Vector[s0] = v9.p1
    val v10: s1 = f35(v5)
    val v2: Vector[s1] = Vector(v10, v3, v3, v11, v11)
    val v14: s1 = f35(v11)
    var v22: Vector[s0] = v4
    val v43: s1 = v6(2)
    v9 = v9.copy(p1 = v22)
    var v31: Vector[s1] = v2
    v31 = v31.updated(4, v43)
    val v42: s1 = f35(v14)
    val v59: s1 = v31(2)
    val v147: s1 = f35(v59)
    val v49: s0 = v42.p0
    v9 = v9.copy(p1 = v4)
    v22 = v22.updated(0, v49)
    val v98: s0 = v147.p0
    val v226: s1 = s1(v98, v22)
    v226
  }
  def f3(v0: s1): s1 = {
    val v3: s1 = f20(v0)
    val v4: s1 = f20(v0)
    var v2: s1 = v0
    val v8: Vector[s0] = v3.p1
    val v6: s0 = v0.p0
    val v1: s1 = f35(v0)
    val v5: s1 = s1(v6, v8)
    val v7: Vector[s1] = Vector(v3, v0, v5, v1, v1, v5, v0)
    val v10: Vector[s0] = v2.p1
    val v13: s1 = f20(v2)
    v2 = v2.copy(p1 = v10)
    val v15: s1 = f35(v13)
    var v21: Vector[s1] = v7
    v21 = v21.updated(3, v2)
    v2 = v2.copy(p1 = v10)
    var v14: Vector[s1] = v21
    v21 = v21.updated(0, v0)
    val v32: Vector[s0] = v1.p1
    val v22: s1 = v14(1)
    var v27: s1 = v22
    v21 = v21.updated(1, v15)
    val v56: s1 = v14(2)
    v21 = v7
    v14 = v14.updated(6, v4)
    v2 = v2.copy(p0 = v6)
    var v67: Vector[s1] = v14
    var v98: Vector[s1] = v67
    val v47: Vector[s0] = v22.p1
    v27 = v27.copy(p1 = v8)
    v2 = v2.copy(p1 = v32)
    val v51: s1 = f20(v27)
    v27 = v27.copy(p1 = v10)
    var v145: Vector[s1] = v98
    v14 = v14.updated(1, v56)
    v21 = v21.updated(5, v1)
    v14 = v145
    v2 = v2.copy(p1 = v47)
    v51
  }
  @noinline
  def f0(v0: Vector[s0], v1: s1, v2: Double): Double = {
    val v5: s0 = v1.p0
    val v6: s0 = v1.p0
    val v7: Double = v2 + v2
    var v9: s1 = v1
    val v17: s0 = v0(2)
    val v10: s3 = s3(v9, v0)
    v9 = v9.copy(p0 = v6)
    var v11: s0 = v5
    v9 = v9.copy(p0 = v17)
    var v30: Vector[s0] = v0
    val v16: s0 = v30(0)
    v9 = v9.copy(p0 = v16)
    val v19: s1 = v10.p0
    val v41: Double = v7 + v7
    v30 = v30.updated(2, v16)
    val v24: s0 = v19.p0
    v9 = v9.copy(p0 = v5)
    val v29: s1 = f3(v9)
    v30 = v30.updated(1, v6)
    val v26: Vector[s0] = v29.p1
    v30 = v30.updated(2, v11)
    var v32: Double = v2
    var v39: Double = v2
    val v60: Vector[Vector[s0]] = Vector(v30, v30, v30, v30, v0, v0)
    var v44: Vector[Vector[s0]] = v60
    val v50: Vector[Vector[Double]] = v24.p0
    val v85: s0 = v30(2)
    val v54: Vector[s0] = v44(5)
    v11 = v11.copy(p0 = v50)
    val v74: Double = v2 / v41
    val v149: s0 = v26(0)
    val v51: Vector[Vector[s0]] = Vector(v0, v0, v54, v30, v0, v0, v0)
    v44 = v44.updated(2, v54)
    val v33: Vector[s0] = v51(4)
    v9 = v9.copy(p0 = v85)
    val v121: Vector[Double] = v50(0)
    v44 = v44.updated(1, v30)
    val v89: Vector[s0] = v51(6)
    val v61: Double = v121(0)
    var v75: Double = v61
    val v168: Vector[Vector[Double]] = v5.p1
    v9 = v9.copy(p0 = v16)
    v9 = v9.copy(p0 = v149)
    val v108: s0 = s0(v50, v168)
    val v115: Double = v74 / v32
    v30 = v33
    val v65: Double = v75 - v39
    v9 = v9.copy(p0 = v108)
    v44 = v44.updated(0, v89)
    val v197: Double = v65 / v115
    v197
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))
    val v1: s1 = s1(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))))
    val v2: Double = 25.0
    val start = nanoTime()
    var result: Double = 25.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}