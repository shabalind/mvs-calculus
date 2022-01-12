import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s4 (
    p0: s3,
    p1: Double
  )
  case class s5 (
    p0: Vector[s0],
    p1: Vector[s2]
  )
  case class s7 (
    p0: s5,
    p1: Vector[s4]
  )
  case class s8 (
    p0: Double
  )
  case class s13 (
    p0: s7,
    p1: s0
  )
  def f52(v0: s3): s3 = {
    val v6: Vector[s0] = v0.p1
    val v4: s0 = v6(0)
    val v1: Vector[s0] = v0.p1
    val v7: s0 = v1(1)
    val v5: Double = v4.p1
    val v9: s4 = s4(v0, v5)
    var v2: Vector[s0] = v6
    v2 = v2.updated(1, v4)
    val v15: Vector[Vector[Double]] = v7.p0
    v2 = v1
    v2 = v2.updated(0, v4)
    val v13: s0 = v2(0)
    val v8: Vector[Double] = v15(1)
    var v18: s3 = v0
    val v14: s0 = v6(0)
    v18 = v18.copy(p1 = v6)
    val v24: s3 = v9.p0
    val v27: Double = v8(0)
    v18 = v18.copy(p1 = v6)
    val v19: Double = v13.p1
    v18 = v18.copy(p1 = v6)
    val v26: Vector[Double] = v15(0)
    v18 = v18.copy(p1 = v6)
    val v31: Double = v26(0)
    v2 = v2.updated(0, v7)
    var v25: s4 = v9
    v2 = v2.updated(1, v4)
    val v21: s0 = v1(0)
    v2 = v2.updated(1, v4)
    var v32: s3 = v0
    var v33: s0 = v4
    v2 = v2.updated(0, v4)
    val v40: s3 = v9.p0
    v18 = v18.copy(p1 = v2)
    v2 = v2.updated(0, v13)
    v32 = v32.copy(p1 = v1)
    v25 = v25.copy(p1 = v5)
    var v22: Vector[s0] = v2
    v22 = v22.updated(1, v7)
    val v28: s0 = v22(1)
    v18 = v18.copy(p1 = v6)
    val v45: Vector[s0] = v18.p0
    var v46: Vector[s0] = v45
    v22 = v22.updated(1, v33)
    v2 = v6
    val v35: Vector[s0] = v18.p0
    val v110: s0 = s0(v15, v19)
    v25 = v25.copy(p1 = v27)
    v2 = v6
    val v60: s0 = v35(2)
    v22 = v22.updated(0, v110)
    v25 = v25.copy(p0 = v24)
    val v74: s3 = v25.p0
    v25 = v25.copy(p0 = v32)
    val v36: Vector[s0] = Vector(v33, v28, v14, v21, v7, v7)
    val v88: Vector[Vector[Double]] = v14.p0
    var v39: s4 = v25
    v33 = v33.copy(p0 = v88)
    var v34: s4 = v25
    v25 = v34
    val v50: Vector[s0] = v32.p1
    v39 = v39.copy(p0 = v74)
    v25 = v25.copy(p0 = v18)
    val v70: s0 = v36(4)
    v39 = v39.copy(p0 = v0)
    v25 = v39
    v39 = v39.copy(p0 = v40)
    var v68: s3 = v74
    v32 = v32.copy(p0 = v46)
    v2 = v2.updated(1, v28)
    v46 = v46.updated(1, v4)
    v22 = v22.updated(1, v70)
    var v66: Vector[s0] = v50
    v66 = v66.updated(1, v13)
    v66 = v22
    v32 = v32.copy(p0 = v46)
    v32 = v32.copy(p1 = v1)
    v2 = v2.updated(0, v60)
    v34 = v34.copy(p1 = v31)
    v68 = v68.copy(p0 = v45)
    v68 = v68.copy(p1 = v66)
    v68
  }
  def f51(v0: s3): s3 = {
    val v5: Vector[s0] = v0.p1
    val v7: s0 = v5(1)
    var v6: s3 = v0
    val v3: s0 = v5(1)
    val v4: s0 = v5(0)
    val v8: s3 = f52(v6)
    var v1: s3 = v8
    val v2: Vector[s0] = v8.p1
    var v9: s3 = v6
    var v11: s0 = v7
    val v12: Double = v3.p1
    var v25: Vector[s0] = v2
    var v18: Vector[s0] = v5
    val v17: s0 = v5(1)
    var v26: Double = v12
    v9 = v9.copy(p1 = v5)
    val v31: s3 = f52(v8)
    var v21: Double = v26
    val v19: s3 = f52(v31)
    val v28: Vector[s0] = v9.p0
    val v36: s3 = f52(v1)
    val v47: Vector[s0] = v19.p1
    var v32: s3 = v36
    v9 = v36
    val v66: s4 = s4(v36, v21)
    v1 = v1.copy(p0 = v28)
    v6 = v6.copy(p1 = v2)
    v18 = v18.updated(1, v7)
    val v101: Double = v17.p1
    v25 = v25.updated(0, v4)
    v11 = v11.copy(p1 = v101)
    v9 = v9.copy(p1 = v47)
    v32 = v32.copy(p1 = v18)
    v18 = v25
    val v242: Vector[s0] = v31.p1
    v6 = v6.copy(p1 = v25)
    v32 = v32.copy(p1 = v242)
    val v115: s3 = v66.p0
    val v133: Vector[s0] = v115.p1
    v18 = v18.updated(0, v11)
    v6 = v6.copy(p1 = v133)
    v32
  }
  def f33(v0: s3): s3 = {
    val v2: s3 = f52(v0)
    val v1: Vector[s0] = v0.p0
    val v3: Vector[s0] = v0.p0
    val v7: Vector[s0] = v0.p1
    val v8: s0 = v3(1)
    val v10: Vector[s0] = v2.p1
    val v12: Vector[s0] = v0.p1
    val v9: s0 = v1(2)
    var v17: Vector[s0] = v10
    v17 = v17.updated(0, v9)
    val v20: s0 = v7(0)
    val v13: Vector[s0] = v0.p0
    val v5: s3 = f52(v0)
    v17 = v17.updated(0, v20)
    v17 = v12
    val v22: s3 = f52(v5)
    v17 = v17.updated(0, v8)
    var v19: s3 = v2
    val v25: Vector[s0] = v19.p0
    v19 = v19.copy(p1 = v10)
    v19 = v22
    v19 = v19.copy(p0 = v25)
    v17 = v17.updated(1, v9)
    v19 = v19.copy(p0 = v13)
    val v38: s3 = f52(v19)
    var v91: s3 = v38
    v19 = v2
    v19 = v19.copy(p1 = v12)
    val v73: s3 = f52(v19)
    v19 = v19.copy(p1 = v17)
    v19 = v73
    v91
  }
  def f22(v0: s4): s4 = {
    val v5: s3 = v0.p0
    var v4: s4 = v0
    v4 = v4.copy(p0 = v5)
    var v6: s4 = v0
    var v18: s4 = v6
    val v25: s3 = f52(v5)
    val v15: Double = v18.p1
    v6 = v6.copy(p1 = v15)
    var v21: s4 = v0
    val v32: s8 = s8(v15)
    val v63: Double = v32.p0
    val v85: s3 = f52(v25)
    v6 = v4
    val v38: Double = v32.p0
    v4 = v4.copy(p1 = v38)
    var v64: Double = v63
    v6 = v6.copy(p0 = v85)
    v4 = v21
    v18 = v18.copy(p1 = v64)
    v18
  }
  def f16(v0: s4): s4 = {
    var v4: s4 = v0
    val v1: s4 = f22(v4)
    val v2: s3 = v4.p0
    var v6: s3 = v2
    v4 = v4.copy(p0 = v2)
    v4 = v4.copy(p0 = v2)
    val v5: s4 = f22(v1)
    val v7: s3 = f51(v2)
    v4 = v4.copy(p0 = v7)
    val v13: s4 = f22(v1)
    val v11: s3 = f51(v6)
    val v17: s3 = v13.p0
    val v10: Vector[s0] = v17.p0
    v6 = v7
    val v18: s0 = v10(0)
    var v22: s3 = v17
    val v27: Vector[s0] = v2.p1
    val v36: Vector[s0] = v17.p0
    val v46: Vector[s0] = v11.p0
    v22 = v22.copy(p0 = v36)
    var v97: s4 = v13
    v22 = v22.copy(p1 = v27)
    v97 = v97.copy(p0 = v2)
    v6 = v6.copy(p0 = v36)
    v97 = v5
    v4 = v4.copy(p0 = v22)
    val v76: Double = v18.p1
    val v54: s3 = v13.p0
    v22 = v22.copy(p1 = v27)
    v97 = v97.copy(p0 = v54)
    v4 = v4.copy(p1 = v76)
    v22 = v22.copy(p0 = v46)
    v4 = v4.copy(p0 = v22)
    v97
  }
  @noinline
  def f0(v0: s13, v1: Double): Double = {
    val v7: s7 = v0.p0
    var v4: s7 = v7
    var v5: Double = v1
    var v15: Double = v5
    val v12: Vector[s4] = v4.p1
    val v18: Double = v15 - v5
    val v17: s4 = v12(2)
    v4 = v4.copy(p1 = v12)
    var v36: s4 = v17
    val v26: s4 = f16(v36)
    v36 = v36.copy(p1 = v15)
    var v52: Double = v1
    v36 = v36.copy(p1 = v18)
    v15 = v52
    val v53: s3 = v26.p0
    var v44: Double = v52
    val v79: s3 = f52(v53)
    val v189: s3 = f33(v79)
    val v99: s4 = s4(v189, v44)
    val v135: Double = v99.p1
    v135
  }
  def benchmark(): Unit = {
    val v0: s13 = s13(s7(s5(Vector(s0(Vector(Vector(0.0), Vector(1.0)), 2.0)), Vector(s2(s1(Vector(Vector(s0(Vector(Vector(3.0), Vector(4.0)), 5.0))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), 8.0), s0(Vector(Vector(9.0), Vector(10.0)), 11.0), s0(Vector(Vector(12.0), Vector(13.0)), 14.0))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), 17.0), s0(Vector(Vector(18.0), Vector(19.0)), 20.0), s0(Vector(Vector(21.0), Vector(22.0)), 23.0))))), Vector(s4(s3(Vector(s0(Vector(Vector(24.0), Vector(25.0)), 26.0), s0(Vector(Vector(27.0), Vector(28.0)), 29.0), s0(Vector(Vector(30.0), Vector(31.0)), 32.0)), Vector(s0(Vector(Vector(33.0), Vector(34.0)), 35.0), s0(Vector(Vector(36.0), Vector(37.0)), 38.0))), 39.0), s4(s3(Vector(s0(Vector(Vector(40.0), Vector(41.0)), 42.0), s0(Vector(Vector(43.0), Vector(44.0)), 45.0), s0(Vector(Vector(46.0), Vector(47.0)), 48.0)), Vector(s0(Vector(Vector(49.0), Vector(50.0)), 51.0), s0(Vector(Vector(52.0), Vector(53.0)), 54.0))), 55.0), s4(s3(Vector(s0(Vector(Vector(56.0), Vector(57.0)), 58.0), s0(Vector(Vector(59.0), Vector(60.0)), 61.0), s0(Vector(Vector(62.0), Vector(63.0)), 64.0)), Vector(s0(Vector(Vector(65.0), Vector(66.0)), 67.0), s0(Vector(Vector(68.0), Vector(69.0)), 70.0))), 71.0))), s0(Vector(Vector(72.0), Vector(73.0)), 74.0))
    val v1: Double = 75.0
    val start = nanoTime()
    var result: Double = 75.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}