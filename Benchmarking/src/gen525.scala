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
    p0: s0,
    p1: Vector[Vector[s1]]
  )
  def f80(v0: s1): s1 = {
    val v5: s0 = v0.p1
    val v1: Vector[Vector[Double]] = v5.p0
    var v7: s0 = v5
    var v4: s1 = v0
    var v12: Vector[Vector[Double]] = v1
    val v9: Vector[Vector[Double]] = v7.p0
    var v2: Vector[Vector[Double]] = v9
    val v11: Vector[Vector[Double]] = v7.p0
    v7 = v7.copy(p0 = v12)
    var v16: s1 = v0
    val v18: Vector[Double] = v11(0)
    v12 = v12.updated(0, v18)
    val v20: s0 = v4.p0
    var v29: s1 = v4
    val v19: Vector[Double] = v12(0)
    var v13: s1 = v0
    var v22: s0 = v20
    val v36: s0 = v13.p0
    val v23: s0 = v29.p1
    val v24: s0 = v29.p1
    val v14: Vector[Vector[Double]] = v36.p1
    val v31: Vector[Vector[Double]] = v24.p1
    v12 = v12.updated(0, v19)
    var v68: Vector[Vector[Double]] = v31
    val v25: Vector[Double] = v14(1)
    val v30: s0 = s0(v2, v68)
    val v28: Double = v18(0)
    v13 = v13.copy(p0 = v22)
    val v57: Vector[Double] = v14(0)
    var v37: Vector[Double] = v57
    val v59: Vector[Double] = v1(0)
    v37 = v37.updated(0, v28)
    val v38: s0 = v16.p0
    v68 = v68.updated(1, v37)
    v29 = v29.copy(p0 = v38)
    v13 = v13.copy(p0 = v36)
    val v51: s0 = v4.p1
    v7 = v7.copy(p1 = v31)
    val v77: s0 = v4.p1
    v4 = v4.copy(p0 = v77)
    v68 = v68.updated(1, v59)
    v4 = v4.copy(p0 = v23)
    v2 = v2.updated(0, v25)
    val v97: s1 = s1(v30, v51)
    v97
  }
  def f79(v0: s2): s2 = {
    val v1: s0 = v0.p0
    val v9: s0 = v0.p0
    var v12: s0 = v1
    var v10: s2 = v0
    var v17: s2 = v10
    val v15: Vector[Vector[Double]] = v9.p1
    v10 = v10.copy(p0 = v12)
    v10 = v17
    val v16: Vector[s2] = Vector(v10, v17)
    val v23: s2 = v16(0)
    val v33: s2 = v16(0)
    var v45: s0 = v12
    val v27: s1 = s1(v9, v45)
    val v84: s1 = f80(v27)
    val v115: s1 = f80(v27)
    val v39: s0 = v84.p0
    v12 = v12.copy(p1 = v15)
    val v46: s0 = v115.p1
    val v165: Vector[Vector[Double]] = v46.p0
    val v107: s0 = v23.p0
    v10 = v10.copy(p0 = v39)
    v12 = v12.copy(p0 = v165)
    v17 = v17.copy(p0 = v107)
    v33
  }
  def f73(v0: s0): s0 = {
    var v7: s0 = v0
    val v4: Vector[Vector[Double]] = v7.p0
    val v6: Vector[s0] = Vector(v7, v0)
    var v5: s0 = v0
    val v2: Vector[Vector[Double]] = v5.p1
    v7 = v0
    val v1: Vector[Vector[Double]] = v7.p0
    var v14: Vector[Vector[Double]] = v2
    val v13: Vector[Double] = v1(0)
    v14 = v2
    v7 = v7.copy(p1 = v14)
    var v11: s0 = v7
    val v18: Vector[Double] = v1(0)
    v14 = v14.updated(0, v18)
    val v8: Vector[Vector[Double]] = v11.p1
    v11 = v11.copy(p1 = v8)
    val v12: Vector[Double] = v14(0)
    val v9: Vector[Vector[Double]] = v11.p1
    v14 = v14.updated(2, v12)
    v5 = v5.copy(p1 = v9)
    val v19: Vector[Vector[Double]] = v7.p1
    val v15: Vector[Vector[Double]] = v11.p0
    v7 = v7.copy(p1 = v19)
    val v20: Vector[Double] = v2(2)
    var v17: Vector[Vector[Double]] = v4
    v5 = v5.copy(p1 = v2)
    var v10: Vector[Vector[Double]] = v17
    v7 = v7.copy(p0 = v10)
    var v33: Vector[Vector[Double]] = v9
    val v26: Vector[Vector[Double]] = v5.p1
    val v23: Vector[Vector[Double]] = v5.p1
    val v24: s0 = v6(0)
    v10 = v10.updated(0, v13)
    v11 = v11.copy(p0 = v15)
    v17 = v17.updated(0, v20)
    v11 = v11.copy(p0 = v4)
    val v42: Vector[Double] = v33(0)
    val v34: s0 = v6(0)
    v10 = v10.updated(0, v13)
    v11 = v11.copy(p0 = v10)
    v17 = v17.updated(0, v20)
    v33 = v19
    v5 = v24
    v11 = v11.copy(p1 = v23)
    val v54: Vector[Double] = v9(0)
    v5 = v5.copy(p1 = v8)
    var v102: s0 = v24
    val v116: Vector[Vector[Double]] = v0.p1
    val v57: Vector[Vector[Double]] = v34.p0
    v14 = v14.updated(0, v42)
    v7 = v7.copy(p1 = v2)
    val v47: Vector[Vector[Double]] = v5.p1
    var v44: s0 = v102
    v14 = v14.updated(0, v54)
    var v101: Vector[Vector[Double]] = v26
    v7 = v7.copy(p1 = v101)
    v10 = v10.updated(0, v42)
    v44 = v44.copy(p1 = v116)
    v102 = v102.copy(p1 = v9)
    v102 = v102.copy(p0 = v15)
    v7 = v7.copy(p1 = v47)
    v44 = v44.copy(p0 = v57)
    v44
  }
  def f54(v0: s2, v1: Vector[s1]): s2 = {
    val v11: s0 = v0.p0
    var v18: s2 = v0
    var v28: s0 = v11
    v18 = v18.copy(p0 = v28)
    v18
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v3: s2 = f79(v0)
    val v7: Vector[Vector[s1]] = v0.p1
    val v9: Vector[s1] = v7(0)
    val v12: s0 = v0.p0
    var v14: s0 = v12
    val v11: s2 = f54(v3, v9)
    val v17: s0 = f73(v14)
    v14 = v12
    val v32: Vector[Vector[Double]] = v17.p0
    val v29: Vector[Double] = v32(0)
    val v36: Vector[Vector[Double]] = v14.p1
    val v53: Double = v29(0)
    var v52: s0 = v12
    val v45: Vector[Vector[Double]] = v17.p1
    v14 = v14.copy(p1 = v45)
    v52 = v52.copy(p1 = v36)
    val v69: s0 = v11.p0
    v14 = v52
    v52 = v52.copy(p1 = v36)
    val v61: Vector[Vector[Double]] = v69.p1
    v52 = v52.copy(p1 = v61)
    v52 = v52.copy(p1 = v61)
    v53
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(Vector(s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}