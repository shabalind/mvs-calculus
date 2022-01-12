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
  def f60(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Vector[Double]] = v0.p0
    var v5: s0 = v0
    v5 = v5.copy(p0 = v4)
    val v6: Vector[Vector[Double]] = v5.p1
    val v1: Vector[Vector[Double]] = v5.p1
    var v22: s0 = v5
    v5 = v5.copy(p0 = v2)
    var v29: s0 = v22
    val v31: Vector[Vector[Double]] = v5.p1
    v5 = v5.copy(p1 = v31)
    var v16: s0 = v29
    v22 = v22.copy(p1 = v1)
    v16 = v16.copy(p1 = v6)
    v16
  }
  def f59(v0: Vector[Double], v1: s0): s0 = {
    var v5: s0 = v1
    val v4: Double = v0(0)
    val v6: s0 = f60(v1)
    var v2: Vector[Double] = v0
    v2 = v2.updated(0, v4)
    v5 = v6
    val v10: s0 = f60(v1)
    val v9: Vector[Vector[Double]] = v1.p0
    val v8: s0 = f60(v1)
    val v13: Vector[Vector[Double]] = v1.p0
    val v15: Vector[Vector[Double]] = v8.p0
    var v21: Vector[Vector[Double]] = v15
    v5 = v5.copy(p0 = v13)
    v2 = v2.updated(0, v4)
    val v12: s0 = f60(v10)
    val v14: Double = v0(0)
    var v11: Vector[Double] = v2
    val v22: s0 = f60(v6)
    val v24: Vector[Vector[Double]] = v22.p1
    val v32: s0 = f60(v5)
    val v31: Vector[Double] = Vector(v14, v14, v4, v14, v14)
    val v26: Vector[Vector[Double]] = v22.p1
    var v41: Vector[Vector[Double]] = v24
    val v55: Double = v31(2)
    val v19: s0 = f60(v32)
    val v25: s0 = f60(v12)
    v2 = v2.updated(0, v4)
    val v47: Vector[Vector[Double]] = v32.p0
    v5 = v5.copy(p0 = v13)
    val v59: Vector[Vector[Double]] = v25.p1
    var v106: Vector[Vector[Double]] = v26
    val v37: s0 = f60(v32)
    var v50: Vector[Vector[Double]] = v24
    val v45: s0 = s0(v9, v106)
    val v68: Vector[Vector[Double]] = v37.p0
    v5 = v5.copy(p1 = v41)
    v106 = v106.updated(0, v2)
    var v56: Vector[Vector[Double]] = v15
    val v125: Vector[Double] = v26(0)
    v56 = v56.updated(1, v2)
    v5 = v5.copy(p0 = v56)
    var v96: Vector[Vector[Double]] = v21
    val v116: Vector[Double] = v59(0)
    v50 = v50.updated(0, v116)
    val v63: Vector[Double] = v68(0)
    v5 = v19
    v5 = v5.copy(p1 = v24)
    v11 = v11.updated(0, v55)
    v21 = v21.updated(1, v116)
    v5 = v5.copy(p0 = v47)
    val v79: Vector[Double] = v96(1)
    v41 = v41.updated(0, v11)
    v96 = v96.updated(1, v63)
    var v61: Vector[Double] = v0
    v50 = v50.updated(0, v0)
    v106 = v106.updated(0, v79)
    v5 = v5.copy(p1 = v41)
    v5 = v5.copy(p1 = v50)
    v56 = v56.updated(0, v125)
    v106 = v106.updated(0, v11)
    v96 = v96.updated(1, v2)
    v2 = v61
    v45
  }
  def f52(v0: s0): s0 = {
    var v7: s0 = v0
    val v3: Vector[Vector[Double]] = v0.p0
    var v8: s0 = v7
    v7 = v7.copy(p0 = v3)
    var v1: Vector[Vector[Double]] = v3
    var v2: s0 = v0
    var v11: Vector[Vector[Double]] = v1
    val v4: Vector[Vector[Double]] = v8.p0
    val v23: Vector[Double] = v4(0)
    val v13: Double = v23(0)
    val v38: Vector[Vector[Double]] = v0.p0
    val v41: s0 = f60(v7)
    val v17: Vector[Double] = v1(0)
    var v16: Double = v13
    val v49: s0 = f59(v23, v2)
    v2 = v2.copy(p0 = v3)
    v8 = v8.copy(p0 = v11)
    val v27: Vector[Vector[Double]] = v0.p1
    var v24: Vector[Double] = v17
    v2 = v2.copy(p1 = v27)
    v24 = v24.updated(0, v16)
    val v50: s0 = f59(v24, v49)
    val v42: s0 = f60(v41)
    v2 = v2.copy(p0 = v38)
    v8 = v42
    v50
  }
  def f22(v0: s0): s0 = {
    val v4: s0 = f60(v0)
    val v1: s0 = f52(v4)
    val v11: s0 = f60(v4)
    val v3: Vector[Vector[Double]] = v11.p1
    val v16: Vector[Double] = v3(0)
    val v28: s0 = f59(v16, v1)
    v28
  }
  @noinline
  def f0(v0: s1, v1: s1, v2: s0, v3: Vector[s0], v4: Double): Double = {
    val v23: s0 = v3(1)
    val v77: s0 = f22(v23)
    val v73: Vector[Vector[Double]] = v77.p1
    val v132: Vector[Double] = v73(0)
    val v66: Double = v132(0)
    v66
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))))
    val v1: s1 = s1(Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)))), Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))))
    val v2: s0 = s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)))
    val v3: Vector[s0] = Vector(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))))
    val v4: Double = 45.0
    val start = nanoTime()
    var result: Double = 45.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}