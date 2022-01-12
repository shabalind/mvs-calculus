import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  def f76(v0: s0, v1: s0, v2: s0, v3: s0, v4: s0): s0 = {
    val v7: Vector[Vector[Double]] = v3.p1
    val v5: Vector[Vector[Double]] = v1.p1
    val v10: Vector[Vector[Double]] = v4.p1
    var v12: s0 = v2
    var v16: s0 = v2
    v16 = v16.copy(p1 = v7)
    v16 = v16.copy(p2 = v10)
    val v53: Vector[Vector[Double]] = v4.p0
    val v26: Vector[Vector[Double]] = v12.p1
    val v18: Vector[Vector[Double]] = v4.p0
    v16 = v16.copy(p2 = v18)
    var v17: s0 = v1
    val v40: Vector[Vector[Double]] = v3.p1
    v17 = v17.copy(p2 = v7)
    val v64: Vector[Vector[Double]] = v17.p1
    val v23: s0 = s0(v10, v18, v53)
    v16 = v16.copy(p1 = v64)
    var v44: s0 = v17
    val v41: Vector[Vector[Double]] = v2.p2
    val v39: Vector[s0] = Vector(v44, v17, v0, v2, v16)
    v12 = v17
    val v28: s0 = s0(v53, v40, v64)
    v17 = v17.copy(p1 = v5)
    var v42: Vector[s0] = v39
    v17 = v17.copy(p1 = v41)
    val v32: Vector[Vector[Double]] = v16.p0
    v17 = v17.copy(p2 = v26)
    val v56: Vector[Vector[Double]] = v23.p1
    v42 = v42.updated(3, v28)
    v42 = v42.updated(4, v17)
    val v58: s0 = v42(0)
    v42 = v42.updated(3, v2)
    v12 = v12.copy(p0 = v40)
    v12 = v12.copy(p2 = v53)
    v16 = v16.copy(p2 = v56)
    v16 = v16.copy(p1 = v32)
    v58
  }
  def f72(v0: s0): s0 = {
    val v2: s0 = f76(v0, v0, v0, v0, v0)
    var v5: s0 = v2
    val v7: s0 = f76(v0, v5, v0, v5, v2)
    val v8: s0 = f76(v7, v5, v5, v0, v5)
    var v6: s0 = v5
    val v1: Vector[Vector[Double]] = v0.p2
    val v3: Vector[Vector[Double]] = v2.p1
    val v4: s0 = f76(v2, v6, v5, v6, v0)
    val v12: s0 = f76(v2, v4, v5, v8, v0)
    v5 = v5.copy(p1 = v3)
    val v16: s0 = f76(v6, v2, v12, v8, v5)
    val v19: s0 = s0(v1, v1, v1)
    val v13: s0 = f76(v5, v19, v2, v7, v0)
    val v28: s0 = f76(v12, v0, v13, v16, v13)
    var v56: s0 = v28
    v56
  }
  def f71(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p1
    var v4: Vector[Vector[Double]] = v6
    var v1: Vector[Vector[Double]] = v6
    var v5: s0 = v0
    var v2: Vector[Vector[Double]] = v6
    var v8: Vector[Vector[Double]] = v6
    val v10: s0 = s0(v6, v4, v1)
    v5 = v5.copy(p1 = v8)
    v5 = v5.copy(p0 = v4)
    var v7: s0 = v10
    val v17: s0 = f72(v5)
    v5 = v5.copy(p0 = v2)
    val v11: s0 = f76(v5, v5, v5, v7, v5)
    v2 = v8
    val v13: s0 = f76(v5, v11, v17, v11, v17)
    v13
  }
  def f70(v0: s0): s0 = {
    var v4: s0 = v0
    var v6: s0 = v4
    val v7: s0 = f72(v0)
    val v5: s0 = f72(v7)
    val v10: s0 = f71(v6)
    val v2: s0 = f71(v0)
    val v3: Vector[Vector[Double]] = v7.p2
    val v8: s0 = f72(v2)
    val v18: Vector[Vector[Double]] = v8.p1
    val v24: s0 = f76(v2, v5, v4, v0, v7)
    v4 = v10
    val v12: Vector[Vector[Double]] = v4.p2
    val v11: Vector[Vector[Double]] = v24.p2
    v6 = v24
    v6 = v6.copy(p1 = v12)
    val v29: Vector[Double] = v18(0)
    v6 = v6.copy(p0 = v18)
    val v16: Vector[s0] = Vector(v6, v24, v8, v2, v2)
    val v34: Vector[Vector[Double]] = v10.p2
    v6 = v6.copy(p0 = v3)
    v4 = v4.copy(p0 = v11)
    v6 = v6.copy(p1 = v34)
    var v59: Vector[Vector[Double]] = v11
    v6 = v6.copy(p1 = v59)
    v59 = v59.updated(1, v29)
    val v32: s0 = v16(0)
    v32
  }
  @noinline
  def f0(v0: s0, v1: s0, v2: Double): Double = {
    val v4: Vector[Vector[Double]] = v0.p2
    val v5: s0 = f70(v1)
    val v3: Vector[Vector[Double]] = v5.p2
    var v6: Vector[Vector[Double]] = v3
    val v11: Vector[Double] = v4(2)
    var v26: Vector[Double] = v11
    v6 = v6.updated(2, v11)
    v6 = v6.updated(0, v11)
    val v28: Vector[Double] = v6(2)
    v26 = v26.updated(0, v2)
    val v25: Double = v26(0)
    v6 = v6.updated(1, v28)
    var v39: Double = v2
    val v32: Double = v26(0)
    v26 = v26.updated(0, v2)
    v26 = v26.updated(0, v32)
    v26 = v28
    var v44: Double = v39
    v26 = v26.updated(0, v44)
    v25
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0), Vector(8.0)))
    val v1: s0 = s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))
    val v2: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}