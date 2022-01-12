import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f38(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p1
    val v2: Vector[Vector[Vector[Double]]] = Vector(v1, v1, v1, v1)
    var v4: Vector[Vector[Vector[Double]]] = v2
    val v3: Vector[Vector[Double]] = v2(1)
    val v13: Vector[Vector[Double]] = v0.p0
    var v9: Vector[Vector[Vector[Double]]] = v2
    val v12: Vector[Vector[Double]] = v0.p0
    val v15: Vector[Vector[Double]] = v4(1)
    v4 = v2
    val v16: s0 = s0(v15, v13)
    var v81: Vector[Vector[Vector[Double]]] = v2
    val v19: Vector[Vector[Double]] = v81(3)
    v4 = v4.updated(0, v12)
    val v35: Vector[Vector[Double]] = v16.p1
    var v27: s0 = v16
    v4 = v4.updated(2, v19)
    var v29: s0 = v27
    val v51: Vector[Vector[Double]] = v27.p1
    val v36: Vector[Vector[Double]] = v9(0)
    val v71: Vector[Vector[Double]] = v29.p1
    val v46: Vector[Vector[Double]] = v9(3)
    v29 = v29.copy(p1 = v3)
    v27 = v27.copy(p1 = v51)
    v29 = v29.copy(p0 = v46)
    v29 = v29.copy(p0 = v71)
    v29 = v29.copy(p1 = v35)
    v27 = v27.copy(p0 = v36)
    v29 = v29.copy(p1 = v46)
    v4 = v4.updated(2, v19)
    v29
  }
  def f1(v0: Vector[s0]): Vector[s0] = {
    var v2: Vector[s0] = v0
    val v6: s0 = v2(2)
    val v5: Vector[Vector[Double]] = v6.p0
    var v3: s0 = v6
    val v7: Vector[Double] = v5(1)
    val v1: Vector[Vector[Double]] = v3.p1
    var v8: Vector[Vector[Double]] = v5
    v3 = v3.copy(p1 = v8)
    val v19: s0 = f38(v6)
    val v42: s0 = f38(v19)
    val v4: Vector[Vector[Double]] = v3.p0
    val v9: s0 = f38(v6)
    val v13: s0 = f38(v3)
    val v10: Vector[Vector[Double]] = Vector(v7)
    var v11: Vector[Double] = v7
    v8 = v8.updated(1, v11)
    var v18: Vector[Vector[Double]] = v1
    var v14: Vector[Vector[Double]] = v10
    v8 = v8.updated(1, v11)
    var v23: Vector[Vector[Double]] = v14
    val v17: Vector[Double] = v23(0)
    val v21: s0 = f38(v13)
    val v22: s0 = f38(v6)
    val v26: Vector[Vector[Double]] = v3.p1
    v3 = v3.copy(p0 = v4)
    v3 = v3.copy(p0 = v18)
    val v43: Vector[Vector[Double]] = v21.p1
    val v30: Vector[Vector[Double]] = v21.p0
    v3 = v3.copy(p0 = v30)
    v3 = v3.copy(p0 = v4)
    val v20: Vector[Vector[Double]] = v9.p0
    var v33: Vector[Vector[Double]] = v14
    v3 = v3.copy(p1 = v20)
    v2 = v2.updated(2, v42)
    v3 = v3.copy(p0 = v26)
    v33 = v14
    v3 = v3.copy(p0 = v5)
    val v44: Vector[Vector[Double]] = v3.p1
    val v51: Vector[Vector[Double]] = v3.p1
    var v63: Vector[s0] = v0
    v18 = v18.updated(0, v11)
    val v49: Vector[Vector[Double]] = v3.p0
    val v52: Vector[Vector[Double]] = v42.p1
    val v85: s0 = f38(v22)
    val v73: s0 = s0(v51, v49)
    val v104: s0 = f38(v9)
    var v75: Vector[Vector[Double]] = v30
    val v94: Vector[Vector[Double]] = v42.p0
    v3 = v3.copy(p0 = v75)
    v63 = v63.updated(2, v73)
    v3 = v3.copy(p1 = v51)
    val v76: Vector[Double] = v33(0)
    val v74: s0 = f38(v85)
    v33 = v33.updated(0, v17)
    var v84: Vector[Vector[Double]] = v52
    val v45: Vector[Vector[Double]] = v19.p0
    val v71: Vector[Double] = v26(1)
    v3 = v3.copy(p0 = v26)
    v3 = v3.copy(p0 = v45)
    val v193: Vector[Vector[Double]] = v104.p0
    v3 = v3.copy(p1 = v94)
    v3 = v3.copy(p0 = v43)
    v3 = v3.copy(p0 = v26)
    v3 = v3.copy(p1 = v44)
    val v259: Vector[Vector[Double]] = v42.p1
    v3 = v3.copy(p0 = v193)
    v84 = v84.updated(2, v71)
    val v120: Vector[Double] = v259(2)
    val v148: Vector[Vector[Double]] = v74.p1
    v3 = v3.copy(p1 = v148)
    v75 = v75.updated(1, v120)
    var v126: Vector[s0] = v63
    v3 = v3.copy(p1 = v84)
    v8 = v8.updated(1, v76)
    v126
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    var v3: s1 = v0
    var v5: s1 = v3
    val v13: Vector[s0] = v3.p1
    val v4: s0 = v13(0)
    val v10: s0 = f38(v4)
    var v9: Vector[s0] = v13
    v5 = v5.copy(p1 = v13)
    val v14: Vector[s0] = v3.p1
    val v8: s0 = f38(v4)
    val v11: Vector[s0] = v0.p0
    val v12: Vector[s0] = f1(v11)
    val v15: s0 = v11(2)
    v3 = v3.copy(p1 = v9)
    v5 = v5.copy(p1 = v13)
    v9 = v9.updated(0, v10)
    val v30: s0 = v14(0)
    var v22: s0 = v15
    var v45: Vector[s0] = v12
    val v39: Vector[s0] = v5.p1
    val v41: Vector[s0] = v3.p0
    v3 = v3.copy(p0 = v12)
    val v40: s0 = f38(v22)
    val v32: s0 = f38(v40)
    val v33: s0 = v41(2)
    val v28: Vector[Vector[Double]] = v30.p1
    val v54: s0 = v45(2)
    val v42: Vector[Double] = v28(0)
    val v35: Vector[Vector[Double]] = v8.p0
    v3 = v3.copy(p1 = v39)
    v22 = v22.copy(p0 = v28)
    v45 = v45.updated(0, v8)
    var v57: Vector[Double] = v42
    v9 = v9.updated(0, v33)
    val v96: s0 = f38(v22)
    v57 = v57.updated(0, v1)
    val v89: Vector[Vector[Double]] = v54.p1
    var v77: Vector[Vector[Double]] = v89
    val v46: Vector[Vector[Double]] = v32.p1
    val v47: Vector[Double] = v46(2)
    v3 = v3.copy(p0 = v45)
    var v212: Vector[Double] = v57
    val v59: Vector[Double] = v77(2)
    v22 = v22.copy(p1 = v35)
    v77 = v77.updated(0, v47)
    v77 = v77.updated(2, v212)
    var v121: Vector[Vector[Double]] = v89
    v57 = v57.updated(0, v1)
    val v151: Double = v59(0)
    v22 = v22.copy(p1 = v121)
    v3 = v3.copy(p1 = v14)
    v9 = v9.updated(0, v96)
    v77 = v77.updated(0, v47)
    v151
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}