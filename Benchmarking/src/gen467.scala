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
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  def f96(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Double] = v2(0)
    var v1: Vector[Vector[Double]] = v2
    val v7: Vector[Double] = v2(0)
    v1 = v1.updated(0, v7)
    var v5: s0 = v0
    val v8: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Double] = v1(0)
    var v13: s0 = v5
    var v9: s0 = v13
    var v10: s0 = v0
    v10 = v0
    val v14: Double = v4(0)
    var v11: s0 = v5
    var v18: Vector[Double] = v7
    val v16: Vector[Vector[Double]] = v10.p1
    val v21: Vector[Double] = v1(1)
    v11 = v11.copy(p0 = v1)
    val v15: Double = v21(0)
    var v25: Vector[Double] = v21
    v5 = v5.copy(p1 = v8)
    val v40: Double = v18(0)
    v1 = v1.updated(1, v21)
    val v36: Double = v40 + v15
    v18 = v18.updated(0, v40)
    val v68: Vector[Vector[Double]] = v9.p0
    val v43: Vector[Vector[Double]] = v9.p0
    var v47: s0 = v11
    val v26: Vector[Double] = v68(1)
    v25 = v25.updated(0, v14)
    v1 = v1.updated(0, v6)
    val v39: Vector[Vector[Double]] = v13.p0
    val v49: Vector[s0] = Vector(v47, v10, v47, v5)
    var v38: Vector[s0] = v49
    var v56: Vector[s0] = v49
    v1 = v1.updated(1, v26)
    val v59: Vector[Vector[Double]] = v47.p1
    v25 = v25.updated(0, v36)
    val v58: s0 = s0(v68, v59)
    val v77: Vector[Vector[Double]] = v11.p1
    v38 = v38.updated(3, v58)
    val v89: s0 = s0(v1, v16)
    val v32: Vector[Vector[Double]] = v13.p0
    val v62: s0 = v56(3)
    var v28: Vector[s0] = v38
    val v75: s0 = v28(3)
    val v57: s0 = s0(v39, v77)
    var v106: Vector[Vector[Double]] = v77
    var v92: s0 = v89
    v28 = v28.updated(0, v57)
    v10 = v10.copy(p0 = v32)
    val v125: Vector[Vector[Double]] = v62.p1
    v10 = v10.copy(p1 = v125)
    val v84: Vector[Vector[Double]] = v92.p0
    val v86: s0 = s0(v43, v8)
    v106 = v106.updated(0, v25)
    val v123: Vector[Vector[Double]] = v86.p1
    var v78: Vector[Vector[Double]] = v106
    v10 = v10.copy(p0 = v43)
    v92 = v92.copy(p1 = v123)
    v11 = v11.copy(p0 = v84)
    v56 = v56.updated(3, v89)
    v5 = v5.copy(p1 = v78)
    v75
  }
  def f50(v0: s1): s1 = {
    var v5: s1 = v0
    val v7: s0 = v0.p0
    v5 = v5.copy(p0 = v7)
    val v1: Vector[s0] = Vector(v7, v7, v7, v7)
    var v4: s0 = v7
    var v3: s0 = v4
    val v6: s0 = f96(v3)
    val v11: s0 = f96(v6)
    val v17: s0 = f96(v4)
    val v15: s0 = f96(v4)
    val v10: s0 = f96(v4)
    var v20: s1 = v5
    v20 = v20.copy(p0 = v11)
    val v30: Vector[s0] = v20.p1
    val v33: Vector[Vector[Double]] = v17.p0
    val v28: s0 = f96(v10)
    v4 = v4.copy(p0 = v33)
    val v14: s0 = f96(v3)
    v20 = v20.copy(p0 = v28)
    val v51: s0 = v1(2)
    var v43: s1 = v20
    val v42: s0 = f96(v15)
    val v186: s0 = f96(v42)
    val v78: Vector[s0] = v43.p1
    v43 = v43.copy(p1 = v78)
    v43 = v43.copy(p1 = v78)
    v5 = v5.copy(p0 = v17)
    v43 = v43.copy(p1 = v30)
    v43 = v43.copy(p1 = v30)
    v5 = v5.copy(p0 = v14)
    v43 = v43.copy(p0 = v15)
    val v159: Vector[Vector[Double]] = v51.p1
    v43 = v43.copy(p1 = v78)
    v5 = v5.copy(p1 = v78)
    v3 = v3.copy(p1 = v159)
    val v224: Vector[s0] = v43.p1
    val v258: s1 = s1(v186, v224)
    v258
  }
  def f29(v0: s1): s1 = {
    val v4: s0 = v0.p0
    val v7: s1 = f50(v0)
    val v2: s1 = f50(v7)
    val v5: s0 = v0.p0
    val v14: Vector[s0] = v0.p1
    val v8: s0 = f96(v5)
    val v6: s1 = f50(v2)
    var v1: s0 = v8
    val v3: s1 = s1(v1, v14)
    val v9: s1 = f50(v2)
    var v10: s1 = v3
    var v29: s0 = v5
    var v15: s0 = v29
    var v11: Vector[s0] = v14
    var v19: s1 = v9
    var v23: Vector[s0] = v11
    val v12: s0 = v23(1)
    v11 = v11.updated(0, v12)
    v19 = v19.copy(p0 = v4)
    val v18: s0 = f96(v29)
    v1 = v18
    var v33: s0 = v4
    val v36: s1 = s1(v4, v23)
    var v21: s0 = v8
    val v17: Vector[Vector[Double]] = v33.p0
    val v22: s0 = v36.p0
    val v25: s0 = f96(v18)
    var v28: Vector[Vector[Double]] = v17
    val v44: s0 = v11(0)
    val v37: Vector[Vector[Double]] = v21.p0
    v23 = v23.updated(1, v22)
    val v57: Vector[s0] = v36.p1
    val v62: s1 = f50(v6)
    v23 = v23.updated(1, v44)
    v15 = v15.copy(p0 = v37)
    val v48: Vector[s1] = Vector(v9, v36, v0, v10, v19, v0, v10)
    v11 = v11.updated(1, v1)
    val v60: s0 = f96(v8)
    v21 = v21.copy(p0 = v28)
    var v39: Vector[s1] = v48
    v21 = v25
    val v104: Vector[s0] = v62.p1
    v19 = v19.copy(p1 = v104)
    v19 = v19.copy(p0 = v15)
    val v94: s1 = v39(0)
    v19 = v19.copy(p1 = v57)
    val v121: Vector[Vector[Double]] = v60.p1
    v19 = v19.copy(p0 = v60)
    v21 = v21.copy(p1 = v121)
    v94
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v8: Vector[s1] = v0.p0
    val v9: s1 = v8(1)
    val v43: s1 = f29(v9)
    val v22: Double = v1 * v1
    val v44: s0 = v43.p0
    val v33: s0 = f96(v44)
    val v34: Vector[Vector[Double]] = v33.p0
    val v32: Vector[Double] = v34(0)
    val v59: Double = v32(0)
    val v298: Double = v22 - v59
    v298
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))))), s1(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))), s1(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)))))), Vector(Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))))))
    val v1: Double = 33.0
    val start = nanoTime()
    var result: Double = 33.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}