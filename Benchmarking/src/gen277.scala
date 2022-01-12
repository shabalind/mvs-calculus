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
  case class s3 (
    p0: Double,
    p1: s0
  )
  case class s4 (
    p0: s3,
    p1: s3
  )
  case class s6 (
    p0: Vector[s3],
    p1: s4
  )
  def f112(v0: s6): s6 = {
    var v6: s6 = v0
    var v1: s6 = v6
    var v4: s6 = v1
    val v3: s4 = v1.p1
    v6 = v6.copy(p1 = v3)
    v4
  }
  def f89(v0: s0, v1: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p3
    var v3: s0 = v0
    val v8: Vector[Vector[Double]] = v3.p2
    val v4: Vector[Vector[Double]] = v0.p2
    var v9: s0 = v1
    val v2: Vector[Vector[Double]] = v9.p3
    v9 = v9.copy(p3 = v6)
    val v5: Vector[Double] = v8(0)
    var v15: s0 = v0
    val v22: Vector[Vector[Double]] = v15.p2
    var v12: s0 = v15
    var v13: Vector[Double] = v5
    val v7: Double = v13(0)
    v15 = v15.copy(p1 = v8)
    v9 = v9.copy(p2 = v4)
    v12 = v12.copy(p2 = v4)
    val v11: Double = v13(0)
    val v10: Double = v5(0)
    v13 = v13.updated(0, v10)
    v15 = v15.copy(p0 = v8)
    var v17: Vector[Double] = v5
    v12 = v12.copy(p0 = v22)
    val v26: Vector[Vector[Double]] = v15.p0
    val v16: Double = v7 - v11
    val v14: Vector[Vector[Double]] = v15.p3
    v9 = v9.copy(p1 = v14)
    v13 = v13.updated(0, v16)
    v3 = v3.copy(p0 = v2)
    val v25: Vector[Double] = v2(0)
    v13 = v13.updated(0, v11)
    v9 = v9.copy(p3 = v22)
    v15 = v15.copy(p3 = v2)
    v17 = v17.updated(0, v16)
    v3 = v3.copy(p0 = v2)
    v15 = v15.copy(p0 = v8)
    v15 = v15.copy(p2 = v8)
    var v84: Vector[Vector[Double]] = v26
    var v51: s0 = v3
    v84 = v84.updated(0, v17)
    val v43: s1 = s1(v51, v12)
    var v61: s1 = v43
    var v149: Vector[Vector[Double]] = v8
    val v52: Vector[Double] = v149(0)
    v3 = v3.copy(p1 = v84)
    v84 = v84.updated(0, v52)
    val v58: s0 = v61.p1
    v15 = v15.copy(p2 = v149)
    v84 = v84.updated(0, v25)
    v15 = v15.copy(p2 = v22)
    v61 = v61.copy(p0 = v12)
    v58
  }
  def f81(v0: s6): s6 = {
    val v1: s4 = v0.p1
    var v3: s6 = v0
    v3 = v0
    val v5: s4 = v3.p1
    v3 = v3.copy(p1 = v5)
    val v8: Vector[s4] = Vector(v5, v1, v5, v1, v5, v1, v5)
    var v6: s6 = v0
    v6 = v6.copy(p1 = v5)
    var v16: s6 = v6
    val v25: s4 = v8(6)
    v16 = v16.copy(p1 = v25)
    v6 = v6.copy(p1 = v25)
    v16
  }
  def f62(v0: s6): s6 = {
    var v2: s6 = v0
    var v6: s6 = v2
    val v10: Vector[s3] = v6.p0
    v2 = v2.copy(p0 = v10)
    v6
  }
  def f6(v0: s4, v1: Double): Double = {
    val v8: s3 = v0.p0
    val v11: s0 = v8.p1
    var v12: s0 = v11
    val v10: s0 = f89(v12, v11)
    val v26: s0 = f89(v11, v11)
    val v43: s0 = f89(v26, v26)
    val v23: s0 = f89(v10, v43)
    val v33: Vector[Vector[Double]] = v23.p2
    val v47: Vector[Double] = v33(0)
    val v68: Double = v8.p0
    val v51: Double = v47(0)
    val v53: Double = v51 * v68
    v12 = v12.copy(p2 = v33)
    v53
  }
  @noinline
  def f0(v0: Vector[s6], v1: Double): Double = {
    var v7: Double = v1
    val v2: s6 = v0(0)
    val v4: s6 = f62(v2)
    val v6: s6 = f81(v4)
    val v11: s6 = f62(v2)
    var v9: Double = v7
    var v10: s6 = v6
    val v12: s6 = f112(v11)
    val v16: s6 = v0(0)
    val v14: s6 = f112(v10)
    val v21: Vector[s6] = Vector(v14, v6, v4, v12, v16, v2)
    var v20: Double = v9
    val v37: s6 = f62(v10)
    val v39: s6 = v21(2)
    val v42: Vector[s3] = v37.p0
    v10 = v10.copy(p0 = v42)
    v10 = v10.copy(p0 = v42)
    val v68: s4 = v39.p1
    v10 = v10.copy(p0 = v42)
    v10 = v10.copy(p0 = v42)
    val v150: Double = f6(v68, v20)
    val v134: Double = v150 * v1
    v134
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(Vector(s3(0.0, s0(Vector(Vector(1.0)), Vector(Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0))))), s4(s3(5.0, s0(Vector(Vector(6.0)), Vector(Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0)))), s3(10.0, s0(Vector(Vector(11.0)), Vector(Vector(12.0)), Vector(Vector(13.0)), Vector(Vector(14.0)))))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}