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
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: s0
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: s2
  )
  case class s6 (
    p0: Vector[s1],
    p1: s4
  )
  case class s8 (
    p0: Vector[s0],
    p1: Vector[Vector[s1]]
  )
  case class s9 (
    p0: Vector[Vector[s8]],
    p1: s6
  )
  def f55(v0: s6, v1: s8): s6 = {
    val v6: Vector[s1] = v0.p0
    val v12: Vector[Vector[s1]] = v1.p1
    val v14: s4 = v0.p1
    val v25: s2 = v14.p1
    val v34: Vector[s1] = v12(0)
    val v24: s6 = s6(v6, v14)
    val v32: Vector[Vector[s1]] = v25.p0
    val v59: Vector[s1] = v32(0)
    var v22: s6 = v24
    var v67: s6 = v0
    v67 = v22
    var v40: Vector[s1] = v59
    v22 = v22.copy(p1 = v14)
    v40 = v34
    v22 = v0
    v22 = v22.copy(p0 = v40)
    v67 = v67.copy(p1 = v14)
    v67
  }
  def f46(v0: Vector[s8]): Vector[s8] = {
    val v3: s8 = v0(0)
    var v2: Vector[s8] = v0
    v2 = v2.updated(0, v3)
    var v4: Vector[s8] = v0
    val v7: s8 = v0(0)
    v2 = v2.updated(0, v7)
    val v8: s8 = v4(0)
    v2 = v2.updated(0, v7)
    v2 = v2.updated(0, v8)
    v2 = v2.updated(0, v3)
    v4 = v4.updated(0, v8)
    val v74: s8 = v2(0)
    v4 = v4.updated(0, v74)
    v2
  }
  def f21(v0: s0, v1: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    val v9: s1 = s1(v1, v0)
    var v2: Vector[Vector[Double]] = v6
    val v3: s0 = v9.p1
    val v13: Vector[Vector[Double]] = v3.p0
    val v18: s0 = v9.p0
    val v5: Vector[Vector[Vector[Double]]] = Vector(v2, v6, v13, v13)
    var v11: s1 = v9
    val v8: Vector[Vector[Double]] = v0.p0
    val v14: Vector[Vector[Double]] = v18.p0
    v11 = v11.copy(p0 = v1)
    val v7: Vector[Vector[Double]] = v5(3)
    val v10: Vector[Double] = v8(1)
    val v69: s0 = v11.p1
    v11 = v11.copy(p1 = v69)
    var v26: s0 = v18
    v2 = v2.updated(0, v10)
    val v31: Vector[Vector[Double]] = v69.p1
    v26 = v1
    var v34: s1 = v9
    v26 = v26.copy(p1 = v31)
    val v57: s0 = v11.p0
    val v44: Vector[Double] = v14(1)
    val v62: s0 = v34.p1
    val v40: Vector[Vector[Double]] = v0.p1
    v2 = v2.updated(0, v44)
    v34 = v34.copy(p0 = v26)
    var v43: Vector[Vector[Double]] = v31
    var v64: s1 = v9
    v11 = v11.copy(p1 = v57)
    v11 = v11.copy(p1 = v62)
    v26 = v26.copy(p1 = v40)
    v43 = v40
    v64 = v64.copy(p0 = v57)
    val v80: s0 = s0(v7, v43)
    v11 = v64
    v80
  }
  def f4(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p1
    val v13: s0 = f21(v0, v0)
    val v7: Vector[Vector[Double]] = v0.p1
    val v1: Vector[Double] = v4(0)
    val v16: Vector[Double] = v7(0)
    var v15: Vector[Vector[Double]] = v7
    val v8: s1 = s1(v0, v13)
    val v9: s0 = f21(v0, v13)
    val v10: s0 = f21(v13, v13)
    val v20: Vector[Double] = v15(0)
    v15 = v15.updated(0, v1)
    val v14: s0 = v8.p1
    val v42: s0 = f21(v13, v9)
    v15 = v15.updated(0, v1)
    val v35: s0 = v8.p0
    var v26: s0 = v9
    val v29: Vector[Double] = v7(0)
    val v25: Vector[Double] = v15(0)
    var v54: s0 = v14
    var v22: s0 = v35
    v15 = v15.updated(0, v16)
    val v73: s0 = f21(v42, v13)
    val v38: s0 = v8.p0
    v15 = v15.updated(0, v29)
    val v72: Vector[s0] = Vector(v38, v26, v73, v10, v35, v35)
    v54 = v54.copy(p1 = v4)
    v15 = v15.updated(0, v25)
    val v61: s0 = f21(v22, v14)
    v26 = v26.copy(p1 = v4)
    v22 = v22.copy(p1 = v4)
    val v36: Vector[Vector[Double]] = v26.p1
    v15 = v15.updated(0, v20)
    v22 = v54
    v54 = v54.copy(p1 = v4)
    v15 = v15.updated(0, v16)
    val v116: s0 = v72(5)
    v26 = v26.copy(p1 = v15)
    val v308: s0 = f21(v61, v116)
    var v80: s0 = v10
    v22 = v22.copy(p1 = v36)
    v54 = v80
    v308
  }
  @noinline
  def f0(v0: s9, v1: Double): Double = {
    var v10: s9 = v0
    val v3: Vector[Vector[s8]] = v10.p0
    val v5: Vector[s8] = v3(0)
    val v12: s8 = v5(0)
    val v8: Vector[s0] = v12.p0
    var v9: s9 = v10
    var v18: Vector[Vector[s8]] = v3
    var v15: Vector[Vector[s8]] = v18
    var v19: Vector[s0] = v8
    val v11: Vector[s8] = f46(v5)
    v9 = v0
    val v33: s0 = v19(0)
    var v20: s9 = v10
    v20 = v20.copy(p0 = v15)
    v15 = v15.updated(1, v5)
    val v34: s0 = f4(v33)
    val v28: Vector[s8] = v18(0)
    val v35: Vector[Vector[Double]] = v34.p0
    val v56: Vector[s8] = v15(0)
    val v30: Vector[Vector[s8]] = v0.p0
    v9 = v9.copy(p0 = v30)
    val v26: s0 = f21(v34, v33)
    val v16: Vector[s8] = f46(v5)
    v19 = v19.updated(0, v26)
    v15 = v15.updated(1, v56)
    val v63: s6 = v9.p1
    v10 = v10.copy(p0 = v18)
    v18 = v15
    val v103: Vector[Double] = v35(0)
    v10 = v9
    val v49: Vector[s8] = f46(v28)
    val v73: s6 = v20.p1
    val v58: s6 = f55(v73, v12)
    v18 = v18.updated(0, v28)
    v18 = v18.updated(0, v16)
    v9 = v9.copy(p1 = v58)
    v15 = v15.updated(0, v49)
    v15 = v15.updated(0, v16)
    v15 = v15.updated(1, v28)
    v18 = v18.updated(0, v11)
    v10 = v10.copy(p1 = v63)
    val v231: Double = v103(0)
    v231
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(Vector(Vector(s8(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(Vector(s1(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))))))), Vector(s8(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), Vector(Vector(s1(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))))))), s6(Vector(s1(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))))), s4(Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))), s2(Vector(Vector(s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))))), Vector(s1(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)))))))
    val v1: Double = 51.0
    val start = nanoTime()
    var result: Double = 51.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}