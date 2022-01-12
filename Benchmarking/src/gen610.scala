import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  def f37(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p3
    val v1: Vector[Vector[Double]] = v0.p0
    var v6: s0 = v0
    val v4: Vector[Vector[Double]] = v6.p2
    val v3: Vector[Vector[Double]] = v6.p3
    val v5: Vector[Double] = v7(0)
    v6 = v6.copy(p3 = v3)
    v6 = v6.copy(p1 = v5)
    var v15: Vector[Vector[Double]] = v4
    v6 = v0
    val v10: Vector[Vector[Double]] = v6.p3
    val v21: Vector[Double] = v4(0)
    v6 = v0
    val v31: Vector[Double] = v15(1)
    v6 = v6.copy(p1 = v31)
    val v22: Vector[s0] = Vector(v6, v6, v0)
    v6 = v6.copy(p1 = v21)
    val v56: Vector[Vector[Double]] = v0.p0
    val v28: s0 = v22(2)
    var v79: Vector[Vector[Double]] = v10
    v6 = v6.copy(p0 = v79)
    v6 = v6.copy(p0 = v1)
    v6 = v6.copy(p0 = v56)
    v28
  }
  def f27(v0: s1): s1 = {
    var v5: s1 = v0
    val v1: s0 = v0.p0
    val v6: s0 = f37(v1)
    val v4: s0 = f37(v6)
    v5 = v5.copy(p0 = v4)
    var v7: s0 = v4
    v7 = v4
    var v8: s0 = v6
    var v14: s1 = v0
    v5 = v5.copy(p0 = v8)
    val v11: Vector[Double] = v7.p1
    val v2: Vector[Vector[Double]] = v1.p3
    v8 = v8.copy(p1 = v11)
    v7 = v7.copy(p0 = v2)
    val v21: Vector[Double] = v2(0)
    val v36: Double = v21(0)
    val v18: Vector[Vector[s0]] = v14.p1
    val v20: Vector[Vector[Double]] = v4.p0
    val v51: s0 = f37(v1)
    var v41: s0 = v1
    val v30: Vector[s0] = v18(2)
    val v42: s0 = v0.p0
    val v32: s0 = v30(0)
    v7 = v6
    val v46: Vector[Vector[s0]] = v0.p1
    var v57: Vector[Double] = v21
    val v141: Vector[Vector[Double]] = v7.p3
    val v61: Vector[Vector[Double]] = v41.p2
    val v26: Vector[Vector[s0]] = v5.p1
    val v59: Vector[Double] = v61(0)
    var v44: s1 = v14
    val v83: s0 = v44.p0
    val v27: Double = v59(0)
    v14 = v14.copy(p1 = v26)
    v41 = v41.copy(p2 = v61)
    val v39: Vector[Vector[s0]] = v44.p1
    val v80: s0 = f37(v83)
    v41 = v51
    val v94: s0 = f37(v4)
    v44 = v44.copy(p0 = v94)
    val v78: Vector[Double] = v61(1)
    v7 = v7.copy(p1 = v78)
    val v47: Vector[Vector[s0]] = v14.p1
    var v50: s1 = v44
    v50 = v50.copy(p0 = v6)
    v44 = v44.copy(p0 = v80)
    val v85: s0 = v50.p0
    val v99: Vector[Vector[s0]] = v5.p1
    val v53: Vector[Vector[s0]] = v50.p1
    val v91: Vector[s1] = Vector(v44, v50, v50, v5, v14, v14)
    val v102: s0 = f37(v8)
    val v137: s1 = v91(5)
    var v205: Vector[Vector[Double]] = v61
    val v132: s0 = v137.p0
    v7 = v85
    v8 = v8.copy(p3 = v20)
    v50 = v50.copy(p0 = v80)
    v44 = v44.copy(p0 = v32)
    v57 = v57.updated(0, v36)
    val v100: Vector[Double] = v61(1)
    val v281: s0 = v50.p0
    v14 = v14.copy(p0 = v281)
    v57 = v57.updated(0, v27)
    v14 = v14.copy(p0 = v102)
    v5 = v5.copy(p1 = v46)
    v5 = v5.copy(p1 = v53)
    v8 = v8.copy(p1 = v57)
    v205 = v205.updated(1, v100)
    v5 = v5.copy(p0 = v42)
    var v114: Vector[Vector[s0]] = v99
    v8 = v8.copy(p3 = v141)
    v44 = v44.copy(p1 = v39)
    v7 = v7.copy(p2 = v205)
    v5 = v5.copy(p0 = v85)
    v44 = v44.copy(p0 = v132)
    v14 = v14.copy(p1 = v47)
    v7 = v7.copy(p0 = v20)
    v44 = v44.copy(p1 = v114)
    var v164: s1 = v14
    var v177: s1 = v137
    v164 = v164.copy(p1 = v46)
    v177 = v164
    v177
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v7: s1 = f27(v0)
    val v8: s1 = f27(v7)
    val v6: s1 = f27(v0)
    val v10: s1 = f27(v6)
    val v4: Vector[Vector[s0]] = v8.p1
    var v9: Vector[Vector[s0]] = v4
    val v49: Vector[s0] = v9(0)
    val v39: s0 = v10.p0
    val v53: Double = v1 * v1
    var v65: Vector[s0] = v49
    v9 = v9.updated(1, v65)
    val v63: s0 = f37(v39)
    var v55: s0 = v63
    val v59: Vector[Vector[Double]] = v55.p0
    var v57: Vector[Vector[Double]] = v59
    val v136: Vector[Vector[Vector[Double]]] = Vector(v57, v57)
    var v81: Vector[Vector[Vector[Double]]] = v136
    val v31: Vector[Vector[Double]] = v136(1)
    v55 = v55.copy(p0 = v31)
    val v62: s0 = v49(0)
    v81 = v136
    val v54: Vector[Double] = v59(0)
    val v122: Vector[Vector[Double]] = v62.p3
    var v86: Vector[Vector[Double]] = v122
    val v95: Double = v1 / v53
    val v88: Vector[Vector[Double]] = v81(0)
    val v93: Vector[Double] = v86(0)
    var v165: Vector[Double] = v54
    v55 = v55.copy(p0 = v88)
    v165 = v93
    v86 = v86.updated(0, v93)
    v9 = v9.updated(1, v65)
    v86 = v86.updated(0, v165)
    v86 = v86.updated(0, v54)
    v165 = v165.updated(0, v95)
    val v77: Double = v165(0)
    v77
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0)), Vector(1.0), Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0)), Vector(6.0), Vector(Vector(7.0), Vector(8.0)), Vector(Vector(9.0)))), Vector(s0(Vector(Vector(10.0)), Vector(11.0), Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), Vector(s0(Vector(Vector(15.0)), Vector(16.0), Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0))))))
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