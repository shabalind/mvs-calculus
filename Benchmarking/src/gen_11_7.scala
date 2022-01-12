import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[Vector[s0]],
    p1: s2
  )
  def f41(v0: s0, v1: Vector[s0]): s0 = {
    var v6: Vector[s0] = v1
    val v7: s0 = v1(0)
    var v3: Vector[s0] = v6
    val v15: s2 = s2(v7, v3)
    val v13: s0 = v6(2)
    v3 = v3.updated(0, v13)
    val v30: Vector[s0] = v15.p1
    var v45: Vector[s0] = v30
    val v34: s0 = v3(1)
    v45 = v45.updated(2, v34)
    val v37: s0 = v45(1)
    v37
  }
  def f28(v0: s3): s3 = {
    val v3: s2 = v0.p1
    var v7: s3 = v0
    var v5: s2 = v3
    val v1: Vector[s2] = Vector(v5, v3, v5, v5, v5, v3)
    v7 = v7.copy(p1 = v5)
    var v2: s2 = v3
    var v9: s2 = v2
    v7 = v7.copy(p1 = v9)
    var v8: Vector[s2] = v1
    val v13: s0 = v5.p0
    val v17: s2 = v8(5)
    val v6: Vector[Vector[Double]] = v13.p1
    var v11: s3 = v0
    var v12: s3 = v11
    v9 = v9.copy(p0 = v13)
    val v44: s2 = v8(4)
    v8 = v8.updated(4, v44)
    val v54: s0 = v17.p0
    var v34: s0 = v54
    v5 = v5.copy(p0 = v34)
    v2 = v2.copy(p0 = v13)
    val v31: Vector[s0] = v3.p1
    val v28: s2 = v8(4)
    v5 = v5.copy(p0 = v54)
    v7 = v12
    val v79: s0 = f41(v54, v31)
    val v49: Vector[Double] = v54.p0
    val v73: s2 = v12.p1
    v8 = v8.updated(0, v9)
    var v126: Vector[s0] = v31
    val v42: s2 = v7.p1
    v34 = v34.copy(p0 = v49)
    v11 = v11.copy(p1 = v73)
    v126 = v126.updated(1, v13)
    val v146: Vector[Vector[Double]] = v79.p1
    v9 = v9.copy(p1 = v126)
    v12 = v12.copy(p1 = v9)
    v7 = v7.copy(p1 = v28)
    val v105: Vector[s0] = v42.p1
    v8 = v8.updated(2, v42)
    v34 = v34.copy(p1 = v146)
    v2 = v2.copy(p1 = v105)
    v34 = v34.copy(p1 = v6)
    v12
  }
  def f25(v0: Vector[s0]): Vector[s0] = {
    v0
  }
  def f17(v0: s3): s3 = {
    val v6: s3 = f28(v0)
    var v5: s3 = v0
    var v7: s3 = v6
    val v2: s2 = v6.p1
    v7 = v7.copy(p1 = v2)
    val v4: Vector[Vector[s0]] = v5.p0
    val v9: Vector[Vector[s0]] = v7.p0
    v5 = v5.copy(p0 = v9)
    val v12: Vector[s0] = v9(2)
    var v21: s2 = v2
    val v30: s0 = v12(0)
    val v29: Vector[s0] = v2.p1
    v5 = v5.copy(p0 = v4)
    val v24: Vector[s0] = f25(v12)
    v7 = v7.copy(p1 = v2)
    var v35: Vector[s0] = v29
    val v23: Vector[Vector[s0]] = v6.p0
    val v19: s3 = s3(v23, v21)
    val v27: s0 = v35(2)
    val v53: s0 = v24(0)
    val v32: s3 = f28(v19)
    var v80: Vector[s0] = v29
    val v95: s0 = v12(0)
    var v58: Vector[Vector[s0]] = v4
    val v87: s0 = f41(v95, v29)
    val v42: s2 = v19.p1
    val v142: Vector[s0] = v42.p1
    val v68: s1 = s1(v58, v87)
    val v79: Vector[Vector[s0]] = v68.p0
    v21 = v21.copy(p1 = v29)
    v21 = v21.copy(p1 = v80)
    var v110: Vector[Vector[s0]] = v79
    v35 = v35.updated(0, v30)
    v21 = v21.copy(p0 = v53)
    v80 = v80.updated(0, v27)
    v21 = v21.copy(p1 = v142)
    v7 = v7.copy(p0 = v110)
    v32
  }
  def f4(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p1
    var v2: Vector[Vector[Double]] = v4
    val v6: Vector[Double] = v4(2)
    v2 = v2.updated(0, v6)
    v2 = v2.updated(0, v6)
    var v32: Vector[Vector[Double]] = v4
    val v12: Vector[Vector[Vector[Double]]] = Vector(v32, v4, v2, v4)
    val v9: Vector[Double] = v2(2)
    val v14: Vector[Vector[Double]] = v12(1)
    v32 = v32.updated(1, v6)
    var v34: s0 = v0
    val v45: Vector[Double] = v34.p0
    v32 = v32.updated(2, v9)
    val v39: s0 = s0(v45, v14)
    v34 = v34.copy(p1 = v4)
    v39
  }
  def f1(v0: s2): s2 = {
    var v3: s2 = v0
    var v2: s2 = v3
    var v4: s2 = v0
    var v5: s2 = v4
    val v6: s0 = v5.p0
    val v1: s0 = v5.p0
    var v7: s2 = v0
    v2 = v2.copy(p0 = v1)
    var v13: s0 = v6
    val v9: Vector[Double] = v13.p0
    val v14: s0 = f4(v6)
    var v8: s2 = v5
    val v12: Vector[s0] = v0.p1
    v3 = v3.copy(p1 = v12)
    v3 = v3.copy(p0 = v6)
    v7 = v7.copy(p1 = v12)
    v13 = v13.copy(p0 = v9)
    var v15: s2 = v2
    val v24: s0 = v12(0)
    v8 = v3
    val v20: s0 = v12(1)
    v4 = v4.copy(p1 = v12)
    val v31: s0 = f41(v24, v12)
    val v16: s0 = v12(1)
    val v30: s0 = f4(v20)
    val v23: Vector[Vector[Double]] = v20.p1
    var v27: Vector[s0] = v12
    v27 = v27.updated(0, v20)
    var v81: s0 = v13
    v27 = v27.updated(2, v31)
    v5 = v5.copy(p0 = v16)
    v27 = v27.updated(1, v81)
    var v57: Vector[s0] = v12
    val v33: s0 = f41(v24, v57)
    val v67: Vector[s0] = v7.p1
    v27 = v27.updated(1, v16)
    val v42: s0 = v15.p0
    v3 = v3.copy(p1 = v12)
    v27 = v27.updated(1, v42)
    v81 = v81.copy(p1 = v23)
    v57 = v57.updated(2, v1)
    val v95: s0 = v67(2)
    v57 = v57.updated(2, v1)
    v57 = v57.updated(0, v95)
    val v83: Vector[Double] = v13.p0
    val v103: s0 = v8.p0
    val v72: s0 = f4(v30)
    v5 = v5.copy(p1 = v12)
    val v64: s2 = s2(v33, v27)
    val v77: s0 = f41(v30, v57)
    v8 = v8.copy(p0 = v72)
    v27 = v27.updated(1, v103)
    v13 = v13.copy(p0 = v83)
    v7 = v7.copy(p0 = v77)
    v27 = v27.updated(1, v14)
    v64
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    var v4: s3 = v0
    val v3: s2 = v4.p1
    val v6: s3 = f28(v0)
    val v5: s3 = f17(v0)
    val v15: s0 = v3.p0
    val v14: s2 = v6.p1
    val v12: s0 = f4(v15)
    val v23: s2 = f1(v14)
    v4 = v4.copy(p1 = v23)
    val v27: Vector[Vector[s0]] = v5.p0
    val v21: Vector[Double] = v12.p0
    v4 = v4.copy(p0 = v27)
    val v73: Vector[Vector[Double]] = Vector(v21, v21, v21, v21, v21, v21)
    val v139: Vector[Double] = v73(4)
    v4 = v6
    val v140: Double = v139(0)
    val v253: Double = v1 * v140
    v253
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(Vector(s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), Vector(s0(Vector(5.0, 6.0), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(10.0, 11.0), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))), s2(s0(Vector(15.0, 16.0), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), Vector(s0(Vector(20.0, 21.0), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(25.0, 26.0), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(30.0, 31.0), Vector(Vector(32.0), Vector(33.0), Vector(34.0))))))
    val v1: Double = 35.0
    val start = nanoTime()
    var result: Double = 35.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}