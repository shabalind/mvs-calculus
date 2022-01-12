import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f26(v0: s0, v1: s0, v2: s0): s0 = {
    var v3: s0 = v1
    var v4: s0 = v0
    v3 = v4
    val v7: Vector[Vector[Double]] = v3.p1
    val v5: Vector[Double] = v7(0)
    v3 = v3.copy(p1 = v7)
    val v14: Double = v5(0)
    val v13: Vector[Vector[Double]] = v1.p0
    var v23: Double = v14
    val v21: Vector[Vector[Double]] = v0.p1
    val v20: Vector[Vector[Double]] = v4.p0
    v4 = v4.copy(p0 = v13)
    val v15: Vector[Double] = v20(0)
    var v24: Vector[Vector[Double]] = v20
    v24 = v24.updated(0, v5)
    var v18: Vector[Vector[Double]] = v24
    v4 = v4.copy(p0 = v20)
    var v19: s0 = v2
    v4 = v4.copy(p0 = v18)
    var v34: Vector[Vector[Double]] = v18
    v24 = v24.updated(1, v5)
    var v47: s0 = v4
    v19 = v19.copy(p0 = v24)
    var v44: Vector[Double] = v15
    v4 = v4.copy(p1 = v21)
    v3 = v3.copy(p0 = v34)
    val v51: Vector[Vector[Double]] = v3.p1
    v44 = v44.updated(0, v23)
    v19 = v19.copy(p1 = v7)
    val v37: Vector[s0] = Vector(v3, v47, v0, v4, v2, v19)
    val v70: s0 = v37(3)
    v19 = v19.copy(p1 = v51)
    val v102: Vector[Vector[Double]] = v70.p1
    var v60: Vector[Double] = v44
    v47 = v47.copy(p1 = v102)
    v44 = v44.updated(0, v23)
    v44 = v44.updated(0, v23)
    val v107: s0 = v37(2)
    v24 = v24.updated(1, v60)
    v107
  }
  def f25(v0: s0): s0 = {
    var v2: s0 = v0
    val v1: Vector[Vector[Double]] = v2.p1
    val v7: Vector[Vector[Double]] = v0.p0
    var v4: Vector[Vector[Double]] = v1
    val v3: s0 = f26(v2, v0, v2)
    v2 = v0
    val v5: s0 = f26(v3, v2, v0)
    val v6: Vector[Double] = v7(1)
    val v9: s0 = f26(v3, v5, v3)
    val v8: Vector[Vector[Double]] = v3.p1
    val v34: Vector[Double] = v7(1)
    val v13: Vector[Vector[Double]] = v3.p0
    v2 = v2.copy(p1 = v8)
    val v17: s0 = f26(v3, v2, v3)
    var v21: Vector[Vector[Double]] = v7
    var v10: Vector[Vector[Double]] = v4
    val v15: Vector[Double] = v7(1)
    val v45: Vector[Vector[Double]] = v3.p1
    val v23: s0 = f26(v3, v0, v17)
    var v14: s0 = v9
    val v24: s0 = s0(v13, v8)
    val v22: Vector[Double] = v8(0)
    v4 = v4.updated(0, v34)
    v21 = v13
    val v40: s0 = f26(v9, v2, v2)
    val v49: s0 = f26(v0, v0, v23)
    val v26: s0 = f26(v40, v49, v40)
    val v42: s0 = f26(v26, v3, v14)
    val v41: Vector[Vector[Double]] = Vector(v22, v15, v22, v6, v34, v6)
    val v32: s0 = f26(v23, v2, v26)
    v4 = v45
    val v62: s0 = f26(v42, v0, v26)
    val v28: s0 = f26(v62, v32, v17)
    v14 = v14.copy(p1 = v10)
    val v44: Vector[Vector[Double]] = v26.p1
    val v81: Vector[Vector[Double]] = v28.p1
    val v54: s0 = f26(v9, v42, v26)
    val v61: s0 = f26(v9, v40, v24)
    v2 = v2.copy(p0 = v21)
    val v102: s0 = f26(v26, v62, v5)
    val v89: Vector[Vector[Double]] = v24.p0
    val v56: s0 = f26(v42, v42, v26)
    val v100: Vector[Double] = v41(2)
    var v88: Vector[Vector[Double]] = v10
    val v57: Vector[Vector[Double]] = v102.p0
    val v55: Vector[Vector[Double]] = v49.p0
    var v103: Vector[Vector[Double]] = v57
    v14 = v14.copy(p1 = v81)
    v14 = v14.copy(p1 = v8)
    v14 = v14.copy(p1 = v88)
    v2 = v2.copy(p0 = v89)
    v14 = v14.copy(p0 = v55)
    v21 = v21.updated(0, v100)
    val v118: s0 = f26(v62, v14, v14)
    v14 = v14.copy(p0 = v103)
    v2 = v2.copy(p1 = v44)
    val v65: s0 = f26(v102, v42, v42)
    v2 = v2.copy(p1 = v8)
    val v98: s0 = f26(v65, v9, v3)
    v14 = v118
    val v157: s0 = f26(v54, v61, v56)
    val v128: s0 = f26(v17, v98, v157)
    v128
  }
  def f23(v0: s0, v1: s0): s0 = {
    var v5: s0 = v1
    val v7: s0 = f25(v1)
    val v13: Vector[Vector[Double]] = v5.p0
    var v11: s0 = v5
    var v15: s0 = v5
    val v14: Vector[Vector[Double]] = v15.p1
    val v19: Vector[Vector[Double]] = v7.p0
    val v3: Vector[Double] = v13(1)
    val v52: s0 = f25(v1)
    val v26: Vector[Vector[Double]] = v0.p1
    var v40: Vector[Vector[Double]] = v13
    val v27: Vector[Vector[Double]] = v52.p0
    v15 = v15.copy(p0 = v40)
    v5 = v5.copy(p1 = v26)
    v40 = v40.updated(0, v3)
    val v66: Vector[Double] = v14(0)
    var v38: Vector[Vector[Double]] = v19
    v11 = v11.copy(p0 = v27)
    val v67: s0 = s0(v38, v14)
    v15 = v15.copy(p0 = v40)
    v40 = v40.updated(0, v66)
    val v55: s0 = f26(v67, v11, v11)
    v15 = v15.copy(p1 = v26)
    var v97: s0 = v55
    v97
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Vector[Vector[s0]], v2: s0, v3: s0, v4: Vector[Vector[s0]], v5: Double): Double = {
    val v9: s0 = f23(v3, v3)
    val v11: Vector[Vector[Double]] = v9.p1
    val v31: Vector[Double] = v11(0)
    val v50: Double = v31(0)
    v50
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))))
    val v2: s0 = s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))
    val v3: s0 = s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))
    val v4: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))), Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)))))
    val v5: Double = 27.0
    val start = nanoTime()
    var result: Double = 27.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}