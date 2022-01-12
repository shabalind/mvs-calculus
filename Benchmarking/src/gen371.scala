import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Double
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[Vector[s1]]
  )
  case class s4 (
    p0: s1,
    p1: s1
  )
  case class s7 (
    p0: s2,
    p1: s4
  )
  def f118(v0: s4): s4 = {
    var v3: s4 = v0
    val v1: s1 = v3.p0
    val v2: Double = v1.p1
    var v7: s4 = v0
    val v6: Vector[Vector[s0]] = v1.p0
    v7 = v7.copy(p1 = v1)
    v3 = v0
    var v12: s4 = v7
    val v11: s1 = s1(v6, v2)
    val v10: s1 = v0.p1
    val v14: s1 = v12.p1
    v7 = v7.copy(p0 = v11)
    v3 = v3.copy(p1 = v10)
    v3 = v3.copy(p0 = v14)
    v7 = v7.copy(p0 = v1)
    v12
  }
  def f114(v0: s7, v1: Vector[s1]): Vector[s1] = {
    val v8: s4 = v0.p1
    var v3: s7 = v0
    var v7: Vector[s1] = v1
    var v2: s7 = v3
    val v6: s1 = v7(1)
    var v13: s1 = v6
    var v11: s7 = v3
    val v12: s2 = v3.p0
    val v15: Vector[Vector[s1]] = v12.p1
    v11 = v2
    v11 = v11.copy(p1 = v8)
    val v26: s4 = f118(v8)
    v11 = v11.copy(p0 = v12)
    val v10: s1 = v1(1)
    val v18: s1 = v1(1)
    v2 = v2.copy(p0 = v12)
    val v32: s4 = v2.p1
    val v19: Vector[s1] = v15(0)
    val v28: s4 = v11.p1
    val v24: s4 = f118(v28)
    var v25: s4 = v26
    v3 = v3.copy(p1 = v25)
    val v57: s1 = v19(0)
    val v14: Vector[Vector[s0]] = v57.p0
    v7 = v7.updated(1, v18)
    val v66: s1 = v24.p1
    v2 = v2.copy(p0 = v12)
    v2 = v0
    var v48: s2 = v12
    v7 = v7.updated(2, v13)
    v11 = v11.copy(p0 = v48)
    val v78: s1 = v32.p0
    val v94: s2 = v11.p0
    v48 = v48.copy(p0 = v7)
    v13 = v13.copy(p0 = v14)
    v7 = v7.updated(2, v10)
    v25 = v25.copy(p1 = v78)
    v25 = v25.copy(p0 = v6)
    val v147: Vector[s1] = v94.p0
    v13 = v66
    v147
  }
  def f102(v0: s1): s1 = {
    val v2: Double = v0.p1
    val v1: Vector[Vector[s0]] = v0.p0
    val v3: Vector[Vector[s0]] = v0.p0
    val v5: Vector[s0] = v3(0)
    val v6: Vector[s0] = v1(0)
    var v4: Vector[Vector[s0]] = v1
    val v10: Double = v0.p1
    v4 = v1
    val v9: Vector[Vector[s0]] = v0.p0
    v4 = v4.updated(0, v6)
    val v11: Double = v0.p1
    val v17: s0 = v6(0)
    val v12: Vector[Vector[s0]] = v0.p0
    val v13: Vector[s0] = v3(0)
    val v19: s1 = s1(v12, v10)
    val v36: Double = v19.p1
    var v28: Vector[s0] = v5
    v4 = v4.updated(0, v5)
    var v47: Vector[s0] = v13
    val v27: s1 = s1(v9, v11)
    var v46: s1 = v0
    v4 = v4.updated(0, v28)
    val v70: Vector[s1] = Vector(v0, v46, v27, v46)
    v46 = v46.copy(p1 = v2)
    val v52: Double = v19.p1
    v46 = v46.copy(p1 = v36)
    var v34: Vector[s0] = v47
    v46 = v46.copy(p0 = v12)
    v34 = v34.updated(0, v17)
    val v74: s0 = v34(0)
    val v78: Vector[Vector[Double]] = v17.p1
    val v87: Vector[Vector[Double]] = v74.p1
    val v159: s1 = v70(3)
    v4 = v9
    var v71: s0 = v17
    v46 = v46.copy(p0 = v4)
    val v84: Vector[Double] = v87(0)
    v46 = v46.copy(p1 = v52)
    var v51: Vector[Vector[Double]] = v78
    v51 = v51.updated(0, v84)
    v4 = v4.updated(0, v5)
    v34 = v6
    v71 = v71.copy(p1 = v51)
    v47 = v13
    v28 = v28.updated(0, v71)
    v159
  }
  def f94(v0: s2, v1: s4): s2 = {
    var v6: s2 = v0
    val v11: Vector[Vector[s1]] = v6.p1
    val v10: Vector[s1] = v0.p0
    v6 = v6.copy(p1 = v11)
    v6 = v6.copy(p0 = v10)
    v6
  }
  def f92(v0: s4): s4 = {
    val v1: s1 = v0.p0
    val v6: s1 = f102(v1)
    val v2: s4 = f118(v0)
    var v8: s1 = v1
    val v17: Double = v1.p1
    val v15: s4 = f118(v2)
    val v27: Vector[Vector[s0]] = v6.p0
    val v43: s4 = f118(v15)
    val v31: s1 = v43.p1
    v8 = v8.copy(p0 = v27)
    v8 = v8.copy(p1 = v17)
    v8 = v8.copy(p1 = v17)
    val v105: s4 = s4(v8, v31)
    v105
  }
  def f50(v0: s1): s1 = {
    val v2: Double = v0.p1
    var v12: Double = v2
    var v5: s1 = v0
    val v9: Double = v2 + v2
    v5 = v5.copy(p1 = v12)
    v5 = v5.copy(p1 = v2)
    v5 = v5.copy(p1 = v9)
    v5
  }
  def f35(v0: s2): s2 = {
    val v6: Vector[s1] = v0.p0
    val v7: s1 = v6(0)
    var v4: s2 = v0
    val v3: s1 = v6(1)
    v4 = v4.copy(p0 = v6)
    val v5: Vector[Vector[s1]] = Vector(v6, v6, v6, v6, v6)
    v4 = v4.copy(p0 = v6)
    val v2: s1 = v6(0)
    v4 = v4.copy(p0 = v6)
    val v8: s1 = f102(v7)
    var v1: Vector[Vector[s1]] = v5
    val v10: s4 = s4(v2, v2)
    val v9: s4 = f92(v10)
    var v13: s4 = v9
    v13 = v13.copy(p0 = v3)
    var v12: Vector[Vector[s1]] = v1
    val v21: s1 = v6(1)
    var v20: s2 = v0
    val v17: s1 = f50(v8)
    v13 = v13.copy(p0 = v17)
    val v18: Vector[s1] = v4.p0
    val v19: Vector[s1] = v20.p0
    val v31: s2 = f94(v20, v13)
    val v28: s4 = f118(v13)
    val v32: Vector[s1] = v12(2)
    val v27: Vector[s1] = v12(0)
    val v46: s4 = f118(v28)
    val v25: Vector[s1] = v12(1)
    v4 = v4.copy(p0 = v25)
    val v47: Vector[Vector[s1]] = v31.p1
    val v29: s7 = s7(v31, v28)
    var v33: s2 = v4
    val v70: Vector[s1] = f114(v29, v27)
    val v58: s1 = f50(v3)
    var v61: s1 = v58
    v1 = v1.updated(0, v18)
    val v52: s1 = v6(1)
    v12 = v12.updated(0, v18)
    v20 = v20.copy(p0 = v19)
    v1 = v1.updated(3, v27)
    var v67: s2 = v33
    v13 = v13.copy(p0 = v61)
    val v81: Vector[s1] = v67.p0
    v13 = v13.copy(p1 = v21)
    v12 = v12.updated(2, v27)
    val v179: Vector[s1] = v31.p0
    v20 = v20.copy(p0 = v179)
    v1 = v1.updated(0, v32)
    v4 = v4.copy(p1 = v47)
    v67 = v67.copy(p1 = v47)
    val v126: s2 = f94(v31, v46)
    v12 = v12.updated(3, v81)
    v20 = v20.copy(p0 = v70)
    v13 = v13.copy(p0 = v52)
    v126
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v4: Vector[s1] = v0.p0
    val v3: s1 = v4(2)
    val v10: s1 = f50(v3)
    val v6: s2 = f35(v0)
    val v30: Vector[Double] = Vector(v1, v1, v1)
    val v14: s2 = f35(v6)
    var v31: s1 = v10
    var v28: s2 = v14
    val v51: Double = v30(1)
    val v49: Double = v31.p1
    var v48: Double = v49
    val v82: Vector[Vector[s1]] = v28.p1
    val v180: Vector[s1] = v82(1)
    val v131: Double = v51 - v48
    val v116: s1 = v180(0)
    val v70: Vector[Vector[s0]] = v116.p0
    v31 = v31.copy(p0 = v70)
    v131
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))), 3.0), s1(Vector(Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0))))), 7.0), s1(Vector(Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0))))), 11.0)), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))), 15.0)), Vector(s1(Vector(Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0))))), 19.0))))
    val v1: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}