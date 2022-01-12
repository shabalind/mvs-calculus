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
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: s1,
    p2: Double
  )
  def f66(v0: s0): s0 = {
    var v4: s0 = v0
    val v5: Vector[Vector[Double]] = v4.p0
    val v1: s1 = s1(v0, v0)
    v4 = v4.copy(p0 = v5)
    val v3: Vector[Double] = v5(0)
    var v6: Vector[Double] = v3
    var v7: Vector[Vector[Double]] = v5
    v7 = v7.updated(0, v3)
    val v12: Vector[Vector[Double]] = v4.p1
    val v2: s0 = v1.p1
    val v9: Vector[Double] = v7(0)
    val v19: Vector[Vector[Double]] = v4.p1
    val v10: Vector[Double] = v7(0)
    var v8: Vector[Double] = v10
    v4 = v4.copy(p0 = v7)
    v4 = v4.copy(p0 = v5)
    var v22: s1 = v1
    val v11: Vector[Vector[Double]] = v0.p1
    val v15: Double = v3(0)
    v8 = v8.updated(0, v15)
    val v50: Vector[Vector[Double]] = v0.p0
    val v17: Vector[Vector[Double]] = Vector(v3, v9, v6, v3, v10, v9, v8)
    var v36: s1 = v1
    v7 = v7.updated(0, v8)
    v4 = v4.copy(p1 = v5)
    var v25: Vector[Vector[Double]] = v50
    v6 = v6.updated(0, v15)
    v22 = v22.copy(p1 = v2)
    val v30: s0 = v22.p1
    val v33: Vector[Double] = v19(0)
    val v41: s0 = v22.p0
    v22 = v22.copy(p1 = v0)
    val v29: s0 = s0(v12, v12)
    v22 = v22.copy(p1 = v29)
    val v31: s0 = v36.p0
    val v21: Vector[Double] = v5(0)
    v25 = v25.updated(0, v33)
    v22 = v22.copy(p0 = v4)
    v22 = v22.copy(p0 = v31)
    v36 = v36.copy(p0 = v30)
    val v23: Vector[Vector[Double]] = v30.p0
    v36 = v36.copy(p0 = v30)
    val v49: Vector[Double] = v17(3)
    val v45: Double = v49(0)
    v4 = v4.copy(p1 = v23)
    val v39: s0 = s0(v25, v5)
    var v47: s0 = v41
    val v56: s0 = v36.p0
    val v55: s0 = v1.p1
    val v40: Vector[Vector[Double]] = v47.p1
    v25 = v25.updated(0, v21)
    v36 = v36.copy(p0 = v55)
    v4 = v4.copy(p0 = v40)
    v36 = v36.copy(p1 = v39)
    val v66: s2 = s2(v22, v56)
    val v92: s0 = v66.p1
    v22 = v22.copy(p0 = v2)
    v4 = v4.copy(p1 = v5)
    v36 = v36.copy(p0 = v4)
    v4 = v4.copy(p1 = v11)
    v4 = v4.copy(p0 = v11)
    v8 = v8.updated(0, v45)
    v92
  }
  def f60(v0: s1): s1 = {
    val v2: s0 = v0.p1
    var v4: s1 = v0
    val v3: s0 = f66(v2)
    val v11: Vector[Vector[Double]] = v3.p1
    var v8: s0 = v3
    v8 = v8.copy(p0 = v11)
    val v21: s0 = f66(v8)
    var v39: s1 = v4
    v4 = v0
    v4 = v4.copy(p1 = v21)
    val v44: s0 = f66(v2)
    val v52: s0 = v4.p1
    v39 = v39.copy(p0 = v21)
    v4 = v4.copy(p0 = v44)
    val v113: s2 = s2(v39, v52)
    val v138: s1 = v113.p0
    v138
  }
  def f53(v0: s1, v1: s1): s1 = {
    val v5: s1 = f60(v0)
    val v3: s1 = f60(v5)
    var v7: s1 = v1
    val v6: s0 = v7.p0
    val v8: Vector[Vector[Double]] = v6.p1
    v7 = v7.copy(p1 = v6)
    var v9: s0 = v6
    v9 = v9.copy(p0 = v8)
    v9 = v9.copy(p0 = v8)
    v9 = v9.copy(p0 = v8)
    var v10: s0 = v6
    v7 = v7.copy(p0 = v9)
    val v26: Vector[Vector[Double]] = v10.p0
    val v37: s0 = f66(v6)
    val v36: s0 = v3.p1
    v7 = v7.copy(p1 = v10)
    val v38: s1 = s1(v36, v37)
    v9 = v9.copy(p1 = v26)
    v38
  }
  def f47(v0: s1): s1 = {
    val v4: s1 = f53(v0, v0)
    val v3: s1 = f60(v0)
    val v7: s0 = v0.p1
    var v5: s0 = v7
    val v2: Vector[Vector[Double]] = v7.p0
    val v10: Vector[Vector[Double]] = v7.p1
    val v6: s0 = f66(v5)
    var v11: s1 = v0
    val v8: s0 = f66(v7)
    v5 = v6
    val v16: s1 = f53(v3, v4)
    var v12: s0 = v8
    val v25: s0 = v0.p1
    v12 = v12.copy(p0 = v10)
    var v13: s1 = v11
    v12 = v12.copy(p0 = v10)
    v5 = v5.copy(p0 = v2)
    v5 = v5.copy(p1 = v2)
    val v14: s1 = f53(v0, v16)
    val v36: s0 = v14.p1
    v13 = v13.copy(p0 = v6)
    var v33: s1 = v13
    var v21: s0 = v6
    val v68: s1 = f53(v4, v33)
    val v39: s0 = v33.p0
    val v32: s1 = f53(v68, v13)
    val v93: s0 = v3.p0
    v11 = v11.copy(p0 = v12)
    val v47: s0 = v16.p0
    v33 = v33.copy(p1 = v36)
    v13 = v13.copy(p1 = v93)
    v33 = v33.copy(p0 = v21)
    v5 = v47
    v33 = v33.copy(p0 = v39)
    v11 = v11.copy(p1 = v25)
    v32
  }
  @noinline
  def f0(v0: Vector[s3], v1: Vector[s0], v2: Double): Double = {
    var v11: Vector[s0] = v1
    val v9: s0 = v11(1)
    val v13: s0 = f66(v9)
    val v21: s1 = s1(v13, v13)
    val v17: s1 = f53(v21, v21)
    val v25: s1 = f47(v17)
    var v35: s1 = v25
    val v53: s0 = v1(1)
    v11 = v11.updated(1, v9)
    v35 = v35.copy(p1 = v13)
    val v60: s0 = v35.p0
    val v32: Vector[Vector[Double]] = v60.p1
    v11 = v11.updated(1, v53)
    v11 = v11.updated(1, v13)
    val v54: Vector[Double] = v32(0)
    val v174: Double = v54(0)
    v174
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))))), s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0)))), 16.0), s3(Vector(s1(s0(Vector(Vector(17.0)), Vector(Vector(18.0))), s0(Vector(Vector(19.0)), Vector(Vector(20.0)))), s1(s0(Vector(Vector(21.0)), Vector(Vector(22.0))), s0(Vector(Vector(23.0)), Vector(Vector(24.0)))), s1(s0(Vector(Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0))))), s1(s0(Vector(Vector(29.0)), Vector(Vector(30.0))), s0(Vector(Vector(31.0)), Vector(Vector(32.0)))), 33.0))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0))))
    val v2: Double = 38.0
    val start = nanoTime()
    var result: Double = 38.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}