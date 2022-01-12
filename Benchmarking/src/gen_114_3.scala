import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  def f70(v0: s1): s1 = {
    val v4: s0 = v0.p1
    val v7: s0 = v0.p1
    val v5: Vector[Vector[Double]] = v7.p0
    val v6: Vector[Double] = v5(0)
    var v2: s0 = v7
    val v10: Vector[Vector[Double]] = v7.p1
    var v8: s1 = v0
    val v13: Vector[Double] = v10(1)
    val v3: Vector[Vector[Double]] = v4.p1
    val v9: s0 = s0(v5, v10, v5, v5)
    var v11: Vector[Vector[Double]] = v3
    var v15: s1 = v0
    val v18: Double = v6(0)
    var v36: Vector[Double] = v13
    var v17: Double = v18
    v2 = v2.copy(p0 = v5)
    v11 = v11.updated(1, v13)
    v11 = v11.updated(1, v13)
    v11 = v11.updated(0, v13)
    val v117: Vector[Double] = v5(0)
    val v41: Vector[Double] = v10(0)
    val v14: Double = v17 + v17
    val v26: Vector[Double] = v5(0)
    val v23: Double = v6(0)
    v36 = v36.updated(0, v14)
    val v29: Vector[Double] = v3(1)
    v36 = v26
    val v27: s0 = v15.p1
    v11 = v11.updated(1, v13)
    var v35: Vector[Double] = v41
    v2 = v2.copy(p2 = v5)
    val v58: Vector[Vector[Double]] = Vector(v117, v35, v29, v35, v35)
    val v32: s0 = v15.p1
    var v44: Vector[Vector[Double]] = v5
    var v53: Vector[Vector[Double]] = v5
    val v28: Vector[Double] = v44(0)
    val v37: Vector[Double] = v44(0)
    v53 = v53.updated(0, v29)
    v15 = v15.copy(p0 = v32)
    var v48: s1 = v8
    val v73: Vector[Double] = v58(2)
    val v79: s0 = v48.p0
    val v71: Vector[Vector[Double]] = v7.p0
    v48 = v48.copy(p0 = v9)
    v35 = v35.updated(0, v23)
    val v67: s1 = s1(v27, v2)
    var v50: s1 = v0
    v44 = v44.updated(0, v36)
    v50 = v50.copy(p1 = v32)
    var v42: Double = v14
    val v47: s0 = v48.p1
    v36 = v36.updated(0, v14)
    v44 = v44.updated(0, v73)
    v11 = v11.updated(0, v73)
    var v61: Vector[Vector[Double]] = v53
    v2 = v7
    val v65: Vector[Vector[Double]] = v32.p2
    val v51: Vector[Double] = v11(0)
    v44 = v44.updated(0, v117)
    v61 = v61.updated(0, v37)
    v2 = v2.copy(p2 = v61)
    v50 = v50.copy(p1 = v7)
    val v60: s0 = v50.p1
    val v75: Vector[Vector[Double]] = v60.p1
    val v178: s0 = v50.p1
    val v70: s0 = v48.p1
    val v84: Vector[Double] = v58(2)
    v36 = v36.updated(0, v42)
    v48 = v48.copy(p1 = v70)
    v44 = v44.updated(0, v84)
    val v121: s0 = v0.p0
    v15 = v15.copy(p1 = v60)
    val v43: Vector[Vector[Double]] = v47.p0
    val v96: Vector[Double] = v58(2)
    var v191: s1 = v67
    v50 = v8
    val v78: Vector[Vector[Double]] = v121.p0
    v61 = v61.updated(0, v51)
    v36 = v36.updated(0, v18)
    v61 = v43
    v2 = v2.copy(p3 = v71)
    v36 = v28
    v2 = v2.copy(p0 = v43)
    v191 = v191.copy(p0 = v178)
    v35 = v35.updated(0, v18)
    v11 = v11.updated(0, v96)
    v15 = v15.copy(p0 = v79)
    v191 = v191.copy(p1 = v178)
    v50 = v50.copy(p1 = v32)
    val v243: s0 = s0(v78, v75, v61, v65)
    v8 = v8.copy(p0 = v243)
    v191
  }
  def f68(v0: s0): s0 = {
    var v3: s0 = v0
    val v5: Vector[Vector[Double]] = v3.p2
    val v6: s1 = s1(v3, v3)
    val v1: s1 = f70(v6)
    var v12: s1 = v6
    var v14: s1 = v1
    val v7: Vector[Double] = v5(0)
    val v8: s1 = f70(v1)
    val v11: s1 = f70(v12)
    var v4: Vector[Vector[Double]] = v5
    v14 = v14.copy(p0 = v0)
    v12 = v12.copy(p1 = v3)
    var v17: Vector[Double] = v7
    val v15: s1 = f70(v11)
    val v28: Vector[Vector[Double]] = v0.p3
    val v23: s1 = f70(v8)
    v4 = v4.updated(0, v17)
    var v20: Vector[Vector[Double]] = v4
    val v18: s0 = v23.p0
    val v31: s1 = f70(v14)
    val v19: Vector[Vector[Double]] = v3.p1
    var v30: s0 = v18
    val v16: s0 = v31.p1
    val v32: s1 = f70(v23)
    val v34: s1 = f70(v23)
    var v29: Vector[Vector[Double]] = v19
    val v40: s0 = v32.p1
    val v35: Vector[Double] = v28(0)
    val v52: Vector[s1] = Vector(v15, v15, v11)
    val v21: Double = v17(0)
    v29 = v29.updated(1, v35)
    val v39: Double = v21 / v21
    var v123: Vector[Vector[Double]] = v5
    val v48: Vector[Double] = v123(0)
    val v38: Vector[Double] = v19(0)
    v12 = v12.copy(p1 = v16)
    v14 = v14.copy(p1 = v40)
    val v36: s1 = f70(v34)
    v30 = v30.copy(p0 = v123)
    v123 = v123.updated(0, v17)
    val v103: s1 = v52(2)
    val v102: Vector[Double] = v20(0)
    v12 = v36
    val v97: s1 = v52(1)
    val v109: Double = v21 - v39
    v17 = v17.updated(0, v109)
    v14 = v14.copy(p0 = v16)
    val v160: s1 = f70(v103)
    val v107: s0 = v160.p0
    v14 = v14.copy(p0 = v16)
    v29 = v29.updated(1, v48)
    v29 = v29.updated(1, v38)
    v12 = v12.copy(p1 = v107)
    v3 = v3.copy(p1 = v29)
    v123 = v123.updated(0, v102)
    val v427: s0 = v97.p0
    v12 = v12.copy(p0 = v30)
    var v79: s0 = v427
    v79
  }
  def f65(v0: s1): s1 = {
    val v5: Vector[s1] = Vector(v0)
    val v4: s1 = v5(0)
    var v6: s1 = v4
    val v15: s1 = v5(0)
    val v16: s0 = v15.p1
    v6 = v6.copy(p0 = v16)
    v6
  }
  def f64(v0: s0, v1: s1): s0 = {
    var v8: s0 = v0
    val v20: s0 = f68(v8)
    var v11: s0 = v20
    var v32: s0 = v11
    val v41: s0 = f68(v32)
    val v42: Vector[Vector[Double]] = v41.p0
    v11 = v11.copy(p3 = v42)
    v32
  }
  @noinline
  def f0(v0: Vector[s0], v1: s0, v2: Double): Double = {
    val v4: Double = v2 / v2
    val v7: Vector[Vector[Double]] = v1.p2
    val v8: s1 = s1(v1, v1)
    val v16: Vector[Double] = v7(0)
    val v15: s1 = f70(v8)
    val v18: s0 = f64(v1, v15)
    var v17: Double = v4
    var v29: Vector[Double] = v16
    var v19: Vector[Vector[Double]] = v7
    val v26: s1 = f65(v8)
    v29 = v29.updated(0, v17)
    v19 = v7
    val v47: s0 = v26.p1
    val v35: Vector[Double] = v19(0)
    val v20: Vector[Double] = v19(0)
    val v58: Vector[Vector[Double]] = v47.p1
    v29 = v29.updated(0, v17)
    val v65: Vector[Vector[Double]] = v18.p2
    val v69: Vector[Double] = v58(1)
    val v93: Vector[Double] = v58(1)
    v29 = v35
    v19 = v19.updated(0, v20)
    val v77: Double = v69(0)
    v29 = v29.updated(0, v77)
    v19 = v19.updated(0, v29)
    var v60: Vector[Vector[Double]] = v65
    var v136: Vector[Vector[Double]] = v60
    v19 = v19.updated(0, v93)
    v136 = v136.updated(0, v29)
    v60 = v60.updated(0, v69)
    val v64: Vector[Double] = v136(0)
    var v131: Vector[Vector[Double]] = v19
    val v166: Double = v29(0)
    v60 = v131
    v19 = v19.updated(0, v64)
    v166
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0))))
    val v1: s0 = s0(Vector(Vector(5.0)), Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0)))
    val v2: Double = 10.0
    val start = nanoTime()
    var result: Double = 10.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}