import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  def f48(v0: Double): Double = {
    var v4: Double = v0
    var v6: Double = v0
    var v7: Double = v0
    var v3: Double = v6
    var v11: Double = v6
    var v1: Double = v7
    var v15: Double = v4
    v11 = v4
    var v2: Double = v3
    v11 = v3
    val v25: Vector[Double] = Vector(v0, v0, v4, v7)
    var v5: Vector[Double] = v25
    var v16: Vector[Double] = v5
    val v14: Double = v4 - v15
    v5 = v5.updated(1, v6)
    var v32: Double = v7
    val v10: Double = v25(1)
    v16 = v16.updated(3, v14)
    val v8: Double = v25(1)
    val v19: Double = v16(2)
    v16 = v16.updated(2, v32)
    var v18: Vector[Double] = v16
    v18 = v18.updated(0, v1)
    var v22: Vector[Double] = v25
    var v35: Vector[Double] = v25
    v5 = v5.updated(0, v8)
    v22 = v22.updated(1, v3)
    var v31: Vector[Double] = v35
    var v40: Vector[Double] = v16
    val v34: Double = v31(1)
    var v49: Double = v11
    v22 = v22.updated(1, v2)
    val v46: Double = v22(0)
    v22 = v22.updated(1, v11)
    val v138: Double = v25(3)
    var v57: Double = v4
    val v37: Double = v40(3)
    val v48: Double = v31(0)
    v22 = v22.updated(2, v8)
    var v50: Double = v0
    v16 = v16.updated(1, v49)
    v22 = v22.updated(3, v57)
    v22 = v22.updated(3, v6)
    v31 = v31.updated(2, v19)
    v22 = v22.updated(2, v50)
    var v58: Double = v138
    v16 = v16.updated(2, v14)
    val v38: Double = v18(0)
    v18 = v18.updated(0, v1)
    val v55: Vector[Double] = Vector(v6, v46, v10, v34, v37, v48)
    var v54: Vector[Double] = v55
    var v97: Vector[Double] = v54
    v97 = v97.updated(2, v58)
    val v85: Double = v97(0)
    v35 = v35.updated(3, v85)
    v31 = v31.updated(1, v50)
    v31 = v31.updated(1, v14)
    v16 = v16.updated(0, v57)
    v5 = v5.updated(3, v11)
    var v71: Vector[Double] = v97
    v5 = v5.updated(0, v4)
    v22 = v22.updated(2, v38)
    var v183: Vector[Double] = v71
    var v96: Vector[Double] = v183
    v96 = v96.updated(5, v32)
    val v134: Double = v96(2)
    v134
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v4: Vector[s0] = v0.p0
    val v5: s0 = v4(1)
    val v11: Vector[Double] = Vector(v1, v1, v1, v1, v1)
    val v6: Double = f48(v1)
    val v24: Double = v11(0)
    var v15: Vector[Double] = v11
    val v17: Vector[Vector[Double]] = v5.p1
    val v16: Double = v24 + v1
    var v13: s0 = v5
    v13 = v13.copy(p1 = v17)
    val v21: Vector[Vector[Double]] = v13.p0
    val v43: Double = v1 / v1
    v15 = v15.updated(3, v6)
    v15 = v15.updated(3, v24)
    val v33: Vector[Double] = v21(0)
    val v55: Double = v15(2)
    v15 = v15.updated(4, v16)
    var v35: Double = v1
    val v27: Double = v33(0)
    v15 = v15.updated(4, v43)
    val v19: Double = f48(v35)
    v15 = v15.updated(1, v19)
    v15 = v15.updated(4, v27)
    v55
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))
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