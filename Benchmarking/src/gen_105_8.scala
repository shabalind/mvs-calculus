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
    p0: s1,
    p1: s0
  )
  def f47(v0: s1): s1 = {
    val v5: Vector[s0] = v0.p1
    var v9: s1 = v0
    val v1: Vector[s0] = v0.p1
    var v15: s1 = v9
    val v11: Vector[s1] = Vector(v0, v15, v15, v15)
    var v18: Vector[s1] = v11
    v15 = v15.copy(p1 = v5)
    v18 = v18.updated(3, v9)
    v9 = v9.copy(p1 = v5)
    val v23: s1 = v11(0)
    var v19: Vector[s0] = v1
    val v16: s1 = v18(0)
    val v28: s0 = v19(2)
    v9 = v16
    v9 = v9.copy(p0 = v28)
    v23
  }
  def f29(v0: s2, v1: s0): s0 = {
    var v3: s0 = v1
    val v2: Vector[Vector[Double]] = v1.p1
    val v7: s1 = v0.p0
    val v6: Vector[Double] = v2(2)
    val v9: s1 = f47(v7)
    val v10: Double = v6(0)
    val v13: Vector[Double] = v2(2)
    val v14: Vector[Double] = v2(1)
    var v41: Double = v10
    val v22: s0 = v9.p0
    val v27: Double = v41 + v10
    val v19: Vector[Vector[Double]] = v22.p0
    v3 = v3.copy(p0 = v2)
    val v33: Vector[Vector[Double]] = v3.p1
    val v26: Vector[Double] = v33(2)
    var v59: Vector[Double] = v26
    var v45: Vector[Vector[Double]] = v19
    val v44: Vector[Double] = v33(1)
    v45 = v45.updated(1, v44)
    v45 = v45.updated(1, v44)
    v59 = v59.updated(0, v41)
    val v61: Vector[Double] = v19(1)
    var v38: Vector[Vector[Double]] = v2
    v3 = v3.copy(p0 = v19)
    v59 = v59.updated(0, v27)
    v45 = v45.updated(1, v59)
    val v47: Double = v6(0)
    v38 = v38.updated(2, v44)
    v45 = v45.updated(1, v14)
    v38 = v38.updated(0, v26)
    v45 = v45.updated(1, v44)
    val v144: s0 = s0(v38, v38)
    v38 = v38.updated(2, v59)
    v38 = v38.updated(1, v26)
    v45 = v45.updated(1, v61)
    v59 = v59.updated(0, v47)
    v3 = v3.copy(p1 = v45)
    v38 = v38.updated(1, v44)
    v45 = v45.updated(0, v13)
    v59 = v59.updated(0, v41)
    v144
  }
  def f24(v0: s0): s0 = {
    var v1: s0 = v0
    var v6: s0 = v0
    val v5: Vector[Vector[Double]] = v0.p0
    val v7: Vector[Vector[Double]] = v0.p1
    v1 = v1.copy(p1 = v7)
    val v4: Vector[Vector[Double]] = v1.p0
    v6 = v6.copy(p1 = v4)
    val v8: Vector[Double] = v4(2)
    var v3: Vector[Vector[Double]] = v4
    val v12: Double = v8(0)
    val v11: s0 = s0(v4, v3)
    v6 = v6.copy(p1 = v7)
    v1 = v1.copy(p0 = v7)
    var v24: s0 = v0
    var v15: Vector[Vector[Double]] = v7
    val v10: Vector[Vector[Double]] = v24.p1
    v15 = v10
    var v14: Double = v12
    var v13: Vector[Vector[Double]] = v5
    var v16: Vector[Double] = v8
    var v18: Vector[Vector[Double]] = v5
    val v19: Double = v8(0)
    var v28: s0 = v0
    v18 = v18.updated(2, v16)
    val v27: Vector[Double] = v7(2)
    var v35: Double = v19
    val v46: Vector[Vector[Double]] = v11.p1
    val v30: Vector[Vector[Double]] = v28.p0
    v3 = v3.updated(0, v8)
    val v21: Vector[Vector[Double]] = v1.p1
    val v34: Vector[Vector[Double]] = v28.p0
    v13 = v13.updated(2, v16)
    val v44: Vector[Vector[Double]] = v11.p0
    val v51: Vector[Vector[Vector[Double]]] = Vector(v15)
    v15 = v15.updated(1, v16)
    v6 = v6.copy(p0 = v5)
    val v20: Double = v14 * v35
    var v29: Vector[Vector[Vector[Double]]] = v51
    v16 = v16.updated(0, v20)
    v35 = v14
    var v47: Double = v35
    v6 = v6.copy(p1 = v13)
    val v36: Vector[Vector[Double]] = v6.p0
    v13 = v13.updated(2, v27)
    var v31: Vector[Vector[Double]] = v36
    v3 = v3.updated(1, v27)
    v29 = v29.updated(0, v46)
    v1 = v1.copy(p1 = v21)
    val v57: Vector[Vector[Double]] = v28.p0
    val v59: s0 = s0(v31, v18)
    v6 = v6.copy(p1 = v57)
    v35 = v47
    val v63: Vector[Vector[Double]] = v0.p0
    v6 = v6.copy(p1 = v44)
    var v54: s0 = v6
    val v65: Vector[Vector[Double]] = v29(0)
    val v45: Vector[Double] = v63(0)
    val v72: Vector[Double] = v4(0)
    val v73: Vector[Vector[Double]] = v59.p1
    val v95: Vector[Vector[Double]] = v59.p1
    v31 = v31.updated(1, v8)
    v28 = v28.copy(p1 = v63)
    var v140: Vector[Double] = v45
    v28 = v28.copy(p1 = v95)
    v18 = v18.updated(1, v45)
    v1 = v1.copy(p0 = v4)
    val v70: Vector[Vector[Double]] = v54.p0
    v31 = v31.updated(1, v72)
    v28 = v28.copy(p0 = v10)
    v6 = v6.copy(p1 = v34)
    v31 = v31.updated(0, v72)
    v13 = v13.updated(1, v45)
    v24 = v24.copy(p0 = v30)
    val v101: Vector[Vector[Double]] = v11.p1
    val v69: Vector[Vector[Double]] = v54.p0
    var v112: Vector[Double] = v16
    v18 = v18.updated(1, v112)
    v54 = v54.copy(p0 = v69)
    var v122: s0 = v59
    v28 = v28.copy(p1 = v65)
    v122 = v122.copy(p1 = v70)
    v24 = v24.copy(p0 = v7)
    v1 = v1.copy(p0 = v101)
    v28 = v28.copy(p1 = v44)
    var v251: s0 = v122
    var v156: s0 = v251
    v24 = v24.copy(p0 = v73)
    v31 = v31.updated(0, v27)
    v112 = v140
    v156
  }
  def f14(v0: s2): s2 = {
    val v4: s0 = v0.p1
    var v3: s2 = v0
    val v1: s0 = f24(v4)
    v3 = v3.copy(p1 = v1)
    val v5: s0 = f29(v0, v4)
    var v2: s2 = v0
    v2 = v2.copy(p1 = v4)
    v2 = v2.copy(p1 = v1)
    val v9: s0 = v2.p1
    val v7: s0 = f29(v2, v9)
    val v11: s1 = v0.p0
    var v18: s1 = v11
    val v12: s0 = v2.p1
    var v6: s0 = v5
    val v35: s1 = f47(v11)
    val v17: s0 = v18.p0
    val v14: s0 = f24(v12)
    val v28: s1 = v2.p0
    var v29: s2 = v2
    val v32: s2 = s2(v35, v14)
    v6 = v12
    val v34: s1 = f47(v28)
    val v19: s2 = s2(v34, v9)
    v2 = v3
    val v26: s0 = f29(v32, v17)
    v29 = v29.copy(p0 = v18)
    val v50: s1 = f47(v28)
    var v47: s1 = v35
    var v41: s2 = v29
    val v39: Vector[s2] = Vector(v0, v29, v2, v41, v0)
    v3 = v3.copy(p1 = v12)
    val v21: s0 = v2.p1
    v47 = v47.copy(p0 = v6)
    val v59: s2 = v39(0)
    v3 = v3.copy(p0 = v18)
    val v40: Vector[s2] = Vector(v3, v19, v0, v29, v2, v32)
    val v114: s0 = f29(v3, v26)
    var v64: Vector[s2] = v39
    val v124: s2 = v40(5)
    val v77: s1 = f47(v28)
    v47 = v47.copy(p0 = v114)
    v47 = v47.copy(p0 = v7)
    val v80: s2 = v64(4)
    v29 = v29.copy(p0 = v47)
    var v60: Vector[s2] = v40
    val v63: s2 = v60(5)
    val v177: s2 = v39(0)
    v60 = v60.updated(2, v124)
    v64 = v64.updated(1, v177)
    v2 = v2.copy(p1 = v21)
    val v99: s0 = v77.p0
    val v94: s0 = f24(v99)
    v64 = v64.updated(1, v63)
    v18 = v18.copy(p0 = v17)
    val v176: Vector[s2] = Vector(v41, v32, v177, v80, v0, v3, v63)
    v64 = v64.updated(2, v59)
    v41 = v41.copy(p0 = v50)
    val v106: s2 = v176(2)
    v29 = v29.copy(p1 = v94)
    v106
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v6: Double = v1
    val v5: s2 = f14(v0)
    val v3: s1 = v5.p0
    var v4: Double = v1
    var v9: Double = v6
    val v8: s1 = f47(v3)
    val v23: Vector[s0] = v8.p1
    val v17: s0 = v23(1)
    var v16: Double = v6
    val v47: Vector[Vector[Double]] = v17.p0
    var v41: Double = v9
    val v31: Vector[Double] = v47(2)
    var v26: Vector[Double] = v31
    v26 = v26.updated(0, v16)
    v26 = v26.updated(0, v16)
    var v64: Double = v41
    v26 = v26.updated(0, v16)
    v26 = v26.updated(0, v6)
    v26 = v26.updated(0, v16)
    var v53: Vector[Double] = v26
    v53 = v53.updated(0, v64)
    v53 = v53.updated(0, v4)
    val v102: Double = v53(0)
    v53 = v53.updated(0, v64)
    v53 = v53.updated(0, v4)
    v102
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))
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