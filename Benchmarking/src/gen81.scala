import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  def f87(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p0
    val v5: s1 = s1(v0, v0)
    var v2: s1 = v5
    val v7: s0 = v5.p0
    var v4: s0 = v0
    v4 = v7
    var v10: s0 = v4
    var v8: s0 = v7
    val v13: s1 = s1(v8, v10)
    var v11: s1 = v13
    var v9: s0 = v0
    val v17: Vector[Vector[Double]] = v9.p0
    var v14: s1 = v2
    var v12: s0 = v0
    val v15: Vector[Vector[Double]] = v7.p0
    val v29: s0 = v5.p0
    val v26: s0 = v11.p0
    val v16: Vector[Vector[Double]] = v8.p0
    v2 = v2.copy(p0 = v7)
    val v18: Vector[Vector[Double]] = v0.p0
    val v24: Vector[Vector[Vector[Double]]] = Vector(v15, v18, v16, v1, v15, v17, v18)
    v11 = v11.copy(p1 = v8)
    val v36: Vector[Vector[Double]] = v9.p1
    v10 = v10.copy(p1 = v36)
    v2 = v2.copy(p1 = v29)
    val v41: Vector[Vector[Double]] = v24(6)
    v2 = v2.copy(p1 = v10)
    val v39: Vector[Vector[Double]] = v4.p0
    v2 = v2.copy(p1 = v7)
    v10 = v10.copy(p0 = v39)
    val v74: Vector[s0] = Vector(v26, v12, v0, v10, v0)
    v11 = v14
    var v67: Vector[s0] = v74
    val v107: s0 = v67(0)
    v14 = v14.copy(p0 = v4)
    v4 = v4.copy(p0 = v41)
    v107
  }
  def f86(v0: s1): s1 = {
    val v4: s0 = v0.p0
    var v2: s0 = v4
    val v7: s0 = v0.p0
    val v6: s0 = f87(v7)
    var v12: s1 = v0
    val v11: s0 = f87(v2)
    val v10: Vector[Vector[Double]] = v7.p1
    val v1: s0 = f87(v6)
    val v8: s1 = s1(v1, v4)
    v2 = v2.copy(p1 = v10)
    var v22: s1 = v8
    val v19: s0 = f87(v11)
    val v33: s0 = f87(v7)
    var v47: s1 = v12
    val v51: s0 = v22.p1
    v47 = v47.copy(p1 = v2)
    var v60: s0 = v51
    v22 = v22.copy(p1 = v33)
    v47 = v47.copy(p1 = v19)
    v47 = v47.copy(p0 = v60)
    v47
  }
  def f85(v0: s0): s0 = {
    var v1: s0 = v0
    val v4: s0 = f87(v1)
    v1 = v0
    val v6: s0 = f87(v4)
    v1 = v6
    val v5: s0 = f87(v4)
    val v11: Vector[Vector[Double]] = v1.p1
    val v7: s0 = f87(v1)
    val v17: Vector[Vector[Double]] = v5.p1
    val v14: Vector[Vector[Double]] = v5.p0
    v1 = v1.copy(p1 = v11)
    v1 = v1.copy(p0 = v14)
    v1 = v1.copy(p1 = v17)
    val v13: s0 = f87(v7)
    val v43: s0 = f87(v4)
    val v66: s0 = f87(v0)
    val v35: s1 = s1(v0, v66)
    val v70: s0 = v35.p1
    var v38: s1 = v35
    v38 = v38.copy(p1 = v70)
    val v100: Vector[s1] = Vector(v38, v35)
    v38 = v38.copy(p1 = v13)
    var v58: Vector[s1] = v100
    val v91: s1 = v58(0)
    v38 = v38.copy(p1 = v43)
    val v229: s0 = v91.p1
    v58 = v58.updated(1, v38)
    v229
  }
  def f81(v0: s0): s0 = {
    val v5: s0 = f87(v0)
    val v6: Vector[Vector[Double]] = v5.p0
    val v7: Vector[Double] = v6(1)
    var v1: s0 = v5
    val v10: Vector[Vector[Double]] = v1.p1
    var v16: Vector[Vector[Double]] = v6
    var v14: s0 = v1
    val v23: Vector[Vector[Double]] = v0.p1
    v16 = v16.updated(1, v7)
    val v79: Vector[Double] = v23(1)
    v14 = v14.copy(p1 = v10)
    val v37: s0 = f85(v14)
    v1 = v1.copy(p0 = v16)
    v16 = v16.updated(0, v79)
    v16 = v16.updated(1, v79)
    v16 = v16.updated(1, v7)
    var v56: Vector[Vector[Double]] = v6
    v14 = v14.copy(p0 = v56)
    v37
  }
  def f78(v0: s0): s0 = {
    val v3: s0 = f87(v0)
    var v2: s0 = v0
    val v1: Vector[Vector[Double]] = v2.p0
    val v5: s0 = f81(v0)
    val v7: Vector[Vector[Double]] = v2.p1
    val v13: Vector[Vector[Double]] = v3.p0
    val v8: Vector[Double] = v13(2)
    val v6: Vector[Double] = v13(0)
    val v4: Vector[Vector[Double]] = Vector(v8, v8, v8, v8, v8, v6, v8)
    val v11: s0 = f85(v2)
    v2 = v2.copy(p1 = v7)
    v2 = v2.copy(p0 = v1)
    var v23: s0 = v11
    val v9: Vector[Vector[Double]] = v0.p1
    v2 = v2.copy(p0 = v13)
    v23 = v23.copy(p0 = v13)
    val v19: Vector[Vector[Double]] = v23.p1
    v23 = v23.copy(p0 = v13)
    val v22: Vector[Vector[Double]] = v3.p0
    v2 = v3
    val v40: s0 = f85(v0)
    val v21: s0 = f81(v40)
    var v27: Vector[Vector[Double]] = v13
    v2 = v2.copy(p0 = v1)
    val v28: Vector[Vector[Double]] = v23.p1
    val v46: Vector[Vector[Double]] = v23.p0
    val v25: Vector[Vector[Double]] = v2.p1
    val v49: Vector[Vector[Double]] = v3.p0
    val v43: Vector[Vector[Double]] = v21.p1
    v2 = v2.copy(p0 = v27)
    val v36: s0 = f87(v11)
    val v31: s0 = f81(v5)
    val v55: s0 = f81(v36)
    val v34: Vector[Double] = v27(2)
    val v76: s0 = f85(v3)
    v2 = v2.copy(p1 = v19)
    v27 = v27.updated(2, v34)
    v2 = v76
    val v58: Vector[Vector[Double]] = v55.p1
    val v53: s0 = f81(v5)
    val v95: Vector[Vector[Vector[Double]]] = Vector(v25, v9, v58)
    val v84: Vector[Double] = v4(4)
    val v37: Vector[Vector[Double]] = v95(2)
    val v80: Vector[Vector[Double]] = v53.p0
    v2 = v2.copy(p1 = v43)
    val v41: Vector[Vector[Double]] = v95(0)
    val v180: s0 = f87(v53)
    val v142: Vector[Vector[Double]] = v31.p0
    v23 = v23.copy(p0 = v46)
    v23 = v23.copy(p1 = v7)
    v2 = v2.copy(p0 = v1)
    val v93: Vector[Vector[Double]] = v5.p1
    val v94: Vector[Double] = v4(0)
    v2 = v2.copy(p1 = v93)
    v27 = v27.updated(1, v84)
    v2 = v2.copy(p0 = v1)
    v2 = v2.copy(p0 = v49)
    v2 = v2.copy(p0 = v46)
    val v202: s0 = s0(v46, v41)
    v23 = v23.copy(p1 = v28)
    v23 = v23.copy(p1 = v7)
    var v247: Vector[Vector[Double]] = v37
    v27 = v27.updated(0, v94)
    v23 = v23.copy(p1 = v247)
    val v136: Vector[Vector[Double]] = v95(2)
    val v353: Vector[Vector[Double]] = v180.p1
    v23 = v23.copy(p1 = v353)
    v2 = v2.copy(p0 = v80)
    v2 = v2.copy(p0 = v46)
    v23 = v23.copy(p0 = v22)
    v23 = v23.copy(p1 = v136)
    v2 = v2.copy(p0 = v142)
    v202
  }
  def f71(v0: s0, v1: s0): s0 = {
    val v7: s0 = f78(v1)
    val v2: Vector[Vector[Double]] = v1.p0
    val v4: Vector[Vector[Double]] = v1.p0
    val v13: Vector[Double] = v4(0)
    var v11: Vector[Vector[Double]] = v4
    v11 = v11.updated(1, v13)
    val v10: s0 = f81(v7)
    val v6: Vector[Vector[Double]] = v1.p0
    val v9: s0 = f87(v1)
    var v23: s0 = v9
    val v15: Vector[Vector[Double]] = v7.p1
    v23 = v23.copy(p1 = v15)
    val v25: s0 = f87(v9)
    val v17: Vector[Vector[Double]] = v10.p1
    val v27: s1 = s1(v23, v1)
    val v18: s0 = f81(v23)
    v23 = v23.copy(p1 = v17)
    val v37: Vector[Vector[Double]] = v10.p1
    v23 = v23.copy(p0 = v11)
    v23 = v23.copy(p1 = v15)
    v23 = v23.copy(p1 = v37)
    val v81: s1 = f86(v27)
    val v83: s1 = f86(v27)
    val v111: s1 = f86(v83)
    v23 = v23.copy(p1 = v17)
    val v72: s0 = f85(v18)
    val v75: s0 = v81.p0
    val v127: s0 = v111.p1
    v23 = v23.copy(p0 = v6)
    val v45: s0 = v111.p1
    v23 = v23.copy(p0 = v2)
    val v82: Vector[s0] = Vector(v25, v72, v45, v75, v9, v127)
    var v97: Vector[s0] = v82
    val v110: s0 = v97(1)
    v110
  }
  def f4(v0: Vector[s0]): Vector[s0] = {
    val v1: s0 = v0(0)
    var v4: Vector[s0] = v0
    val v6: Vector[Vector[s0]] = Vector(v0, v4, v4, v0)
    v4 = v4.updated(0, v1)
    v4 = v4.updated(0, v1)
    v4 = v4.updated(0, v1)
    val v44: Vector[s0] = v6(2)
    var v98: Vector[Vector[s0]] = v6
    val v104: Vector[s0] = v98(0)
    v98 = v98.updated(0, v44)
    v104
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v7: Vector[s0] = v0(0)
    var v3: Vector[Vector[s0]] = v0
    val v10: Vector[s0] = f4(v7)
    val v13: s0 = v10(0)
    v3 = v3.updated(0, v10)
    val v15: Vector[s0] = v3(0)
    val v12: s0 = v15(0)
    val v23: s0 = f71(v13, v12)
    val v25: Vector[Vector[Double]] = v23.p0
    var v27: Vector[Vector[Double]] = v25
    val v45: Vector[Double] = v27(0)
    var v127: Vector[Double] = v45
    val v94: Double = v127(0)
    v94
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))))
    val v1: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}