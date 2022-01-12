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
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: s0
  )
  def f37(v0: Vector[Double]): Vector[Double] = {
    var v6: Vector[Double] = v0
    val v4: Double = v6(0)
    v6 = v6.updated(0, v4)
    var v1: Double = v4
    v6 = v6.updated(0, v1)
    var v3: Double = v1
    val v8: Vector[Double] = Vector(v4, v3, v1, v4, v4, v3, v4)
    var v7: Vector[Double] = v0
    val v12: Double = v8(4)
    val v5: Double = v0(0)
    v6 = v6.updated(0, v12)
    var v9: Double = v12
    v7 = v7.updated(0, v1)
    v6 = v6.updated(0, v9)
    val v53: Vector[Vector[Double]] = Vector(v0, v0, v7, v7, v6, v7, v6)
    val v67: Vector[Double] = v53(3)
    val v34: Double = v8(4)
    val v68: Vector[Double] = v53(5)
    val v72: Double = v68(0)
    var v52: Vector[Double] = v67
    v7 = v7.updated(0, v34)
    v6 = v6.updated(0, v5)
    v52 = v52.updated(0, v72)
    v52
  }
  def f32(v0: s2, v1: s0): s2 = {
    val v7: s0 = v0.p0
    var v3: s2 = v0
    v3 = v3.copy(p1 = v7)
    val v4: Vector[s2] = Vector(v0, v3, v3)
    v3 = v3.copy(p1 = v7)
    v3 = v3.copy(p1 = v1)
    val v8: s0 = v3.p1
    val v2: s2 = v4(0)
    val v13: Vector[s2] = Vector(v2)
    var v22: Vector[s2] = v13
    v3 = v3.copy(p1 = v8)
    val v23: s0 = v0.p1
    v3 = v3.copy(p0 = v7)
    v3 = v3.copy(p1 = v23)
    val v45: s2 = v22(0)
    var v89: Vector[s2] = v13
    val v53: s2 = v89(0)
    v89 = v89.updated(0, v2)
    v89 = v89.updated(0, v45)
    v89 = v89.updated(0, v3)
    v22 = v13
    v22 = v89
    v53
  }
  def f28(v0: s0): s0 = {
    var v6: s0 = v0
    var v3: s0 = v6
    var v5: s0 = v3
    val v7: Vector[Vector[Double]] = v3.p0
    var v8: Vector[Vector[Double]] = v7
    val v1: Vector[Vector[Double]] = v0.p0
    val v12: Vector[Double] = v7(1)
    var v2: Vector[Double] = v12
    val v18: Vector[Vector[Double]] = v6.p1
    val v9: Vector[Double] = v8(0)
    val v21: Vector[Double] = f37(v2)
    v8 = v8.updated(1, v9)
    val v25: Vector[Double] = v18(0)
    v3 = v3.copy(p1 = v18)
    v8 = v8.updated(0, v21)
    var v10: Vector[Double] = v25
    val v20: s2 = s2(v5, v6)
    val v19: s2 = f32(v20, v6)
    v5 = v5.copy(p0 = v1)
    var v22: Vector[Vector[Double]] = v1
    v22 = v22.updated(0, v21)
    val v55: Vector[Vector[Double]] = v5.p1
    var v44: s2 = v20
    v3 = v3.copy(p1 = v18)
    v22 = v8
    v3 = v3.copy(p0 = v1)
    val v62: Vector[Double] = v55(2)
    v8 = v8.updated(0, v62)
    v8 = v8.updated(0, v10)
    val v69: Double = v62(0)
    val v80: s2 = f32(v19, v3)
    var v72: s2 = v44
    val v42: s0 = v72.p0
    v8 = v8.updated(0, v25)
    v3 = v3.copy(p0 = v22)
    val v52: s2 = f32(v80, v42)
    v44 = v44.copy(p1 = v0)
    v6 = v6.copy(p0 = v8)
    val v81: s2 = f32(v52, v3)
    v2 = v2.updated(0, v69)
    val v154: s0 = v81.p0
    v8 = v8.updated(1, v62)
    v154
  }
  def f15(v0: s0): s0 = {
    var v2: s0 = v0
    val v6: Vector[Vector[Double]] = v0.p1
    v2 = v2.copy(p1 = v6)
    v2
  }
  def f8(v0: s0): s0 = {
    var v1: s0 = v0
    var v7: s0 = v1
    val v8: s0 = f15(v7)
    val v2: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Vector[Double]] = v7.p1
    val v9: Vector[Vector[Double]] = v1.p1
    val v10: Vector[Double] = v5(2)
    val v4: Vector[Vector[Double]] = v7.p0
    v7 = v7.copy(p0 = v4)
    val v3: Vector[Double] = v9(0)
    var v6: Vector[Vector[Double]] = v4
    val v23: s0 = f28(v0)
    val v24: Vector[Double] = v2(2)
    val v16: Vector[Double] = f37(v3)
    val v17: s0 = f15(v0)
    v6 = v6.updated(1, v16)
    val v15: s0 = f28(v1)
    val v43: Double = v16(0)
    v7 = v7.copy(p1 = v9)
    val v18: Vector[Double] = f37(v3)
    val v22: Vector[Double] = v9(0)
    val v29: Vector[Vector[Double]] = v8.p0
    val v27: Vector[Double] = f37(v10)
    val v45: Vector[Double] = f37(v18)
    val v26: s0 = f15(v15)
    val v50: Vector[Vector[Double]] = v17.p1
    val v25: Vector[Vector[Double]] = v26.p0
    val v66: Double = v43 - v43
    val v30: Double = v27(0)
    val v48: Vector[Vector[Double]] = v17.p1
    var v41: Double = v30
    val v58: Double = v24(0)
    var v34: Vector[Double] = v22
    val v67: Vector[Vector[Double]] = v15.p1
    v34 = v34.updated(0, v30)
    val v83: Vector[Double] = f37(v10)
    val v51: Vector[Vector[Double]] = v23.p0
    v1 = v1.copy(p1 = v50)
    v6 = v6.updated(0, v34)
    val v126: Double = v58 * v66
    v34 = v34.updated(0, v126)
    v34 = v34.updated(0, v41)
    v1 = v1.copy(p0 = v51)
    val v76: Double = v10(0)
    var v131: Vector[Vector[Double]] = v48
    val v138: s0 = s0(v25, v131)
    v131 = v131.updated(2, v45)
    v34 = v34.updated(0, v76)
    v7 = v7.copy(p0 = v6)
    v131 = v131.updated(2, v83)
    v7 = v7.copy(p1 = v2)
    v7 = v7.copy(p0 = v29)
    val v120: s0 = f28(v138)
    v7 = v7.copy(p1 = v67)
    v120
  }
  @noinline
  def f0(v0: Vector[s2], v1: s3, v2: Double): Double = {
    val v4: s0 = v1.p1
    val v9: Double = v2 + v2
    val v15: Vector[Vector[Double]] = v4.p0
    val v12: Double = v9 + v2
    var v13: s0 = v4
    v13 = v13.copy(p0 = v15)
    val v10: s0 = f15(v13)
    val v27: s0 = f8(v10)
    var v21: Double = v12
    v13 = v13.copy(p0 = v15)
    val v42: Vector[Vector[Double]] = v27.p0
    val v55: Vector[Double] = v42(1)
    v13 = v4
    val v53: Double = v55(0)
    val v50: Double = v21 * v53
    v13 = v13.copy(p0 = v42)
    v50
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), s2(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))))
    val v1: s3 = s3(Vector(s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), s1(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), Vector(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))))
    val v2: Double = 45.0
    val start = nanoTime()
    var result: Double = 45.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}