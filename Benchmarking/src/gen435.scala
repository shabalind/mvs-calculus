import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  def f18(v0: s0): s0 = {
    var v7: s0 = v0
    val v4: Vector[Vector[Double]] = v0.p2
    val v6: Vector[Double] = v4(2)
    val v2: Vector[Double] = v4(1)
    var v5: s0 = v7
    v5 = v5.copy(p1 = v4)
    v5 = v5.copy(p2 = v4)
    v5 = v5.copy(p2 = v4)
    var v3: s0 = v5
    val v8: Vector[Double] = v4(1)
    val v1: Vector[Vector[Double]] = v7.p2
    var v15: Vector[Vector[Double]] = v1
    val v13: Vector[Double] = v1(2)
    var v20: Vector[Vector[Double]] = v1
    val v9: Vector[Vector[Double]] = v0.p1
    var v12: Vector[Vector[Double]] = v9
    var v11: Vector[Vector[Double]] = v12
    var v17: Vector[Double] = v13
    val v14: Vector[Vector[Double]] = v0.p2
    val v28: Vector[Vector[Double]] = v3.p2
    v15 = v15.updated(0, v13)
    var v21: Vector[Vector[Double]] = v1
    val v18: Vector[Vector[Double]] = v3.p2
    v21 = v21.updated(2, v2)
    v21 = v21.updated(1, v6)
    v21 = v21.updated(0, v6)
    val v36: Vector[Vector[Double]] = v7.p0
    v20 = v11
    v5 = v5.copy(p2 = v9)
    v11 = v11.updated(0, v6)
    v5 = v5.copy(p2 = v11)
    val v19: Vector[Vector[Double]] = v7.p0
    var v25: Vector[Vector[Double]] = v19
    var v26: Vector[Vector[Double]] = v25
    v7 = v7.copy(p1 = v15)
    val v50: Vector[Vector[Double]] = v7.p0
    v7 = v7.copy(p0 = v50)
    v3 = v3.copy(p1 = v14)
    val v41: s0 = s0(v26, v28, v21)
    v15 = v15.updated(2, v17)
    v3 = v3.copy(p0 = v26)
    v7 = v7.copy(p0 = v36)
    var v38: Vector[Double] = v2
    v25 = v25.updated(0, v13)
    v26 = v26.updated(0, v8)
    v5 = v5.copy(p2 = v18)
    val v61: Vector[Vector[Double]] = v5.p0
    val v120: Double = v6(0)
    var v93: Vector[Double] = v38
    val v47: Vector[Double] = v20(0)
    val v46: Double = v47(0)
    val v49: Vector[Vector[Double]] = v3.p2
    v3 = v3.copy(p0 = v61)
    v26 = v26.updated(1, v93)
    v3 = v3.copy(p0 = v50)
    val v69: Vector[Vector[Double]] = v41.p0
    var v62: s0 = v41
    v38 = v38.updated(0, v120)
    v38 = v38.updated(0, v46)
    var v65: s0 = v62
    v5 = v5.copy(p2 = v12)
    v62 = v62.copy(p1 = v49)
    v65 = v65.copy(p0 = v69)
    v65
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    var v6: s1 = v0
    var v4: s1 = v6
    val v2: s0 = v4.p0
    val v5: s0 = f18(v2)
    val v8: Vector[Vector[Double]] = v5.p0
    val v9: Vector[Double] = v8(0)
    val v15: Double = v9(0)
    val v27: Double = v9(0)
    val v22: Vector[s0] = v6.p1
    val v28: Double = v1 + v15
    var v59: Vector[Double] = v9
    val v41: s0 = v22(0)
    v59 = v59.updated(0, v27)
    val v123: Vector[Vector[Double]] = v5.p1
    val v54: Vector[Double] = v123(2)
    val v52: Double = v54(0)
    v4 = v4.copy(p1 = v22)
    v59 = v59.updated(0, v52)
    var v39: Vector[s0] = v22
    v59 = v59.updated(0, v1)
    val v61: Double = v59(0)
    v59 = v59.updated(0, v27)
    val v45: Double = v61 / v28
    val v135: s0 = v39(1)
    v59 = v59.updated(0, v27)
    v6 = v6.copy(p0 = v41)
    v4 = v4.copy(p0 = v135)
    v45
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))))
    val v1: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}