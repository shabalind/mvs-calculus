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
  case class s3 (
    p0: s1,
    p1: s1
  )
  def f9(v0: s3): s3 = {
    val v7: s1 = v0.p1
    var v3: s3 = v0
    val v1: Vector[s0] = v7.p0
    var v10: s3 = v3
    var v24: Vector[s0] = v1
    var v12: s1 = v7
    v10 = v10.copy(p0 = v7)
    val v16: s1 = v10.p0
    val v22: s0 = v24(1)
    v10 = v10.copy(p1 = v16)
    v24 = v24.updated(1, v22)
    v10 = v10.copy(p0 = v12)
    v12 = v12.copy(p0 = v24)
    v10 = v3
    v10
  }
  def f4(v0: s0, v1: s3): s0 = {
    val v2: s3 = f9(v1)
    var v3: s3 = v2
    val v6: Vector[Vector[Double]] = v0.p0
    val v8: Vector[Vector[Vector[Double]]] = Vector(v6)
    val v7: Vector[Vector[Double]] = v0.p1
    val v15: s3 = f9(v2)
    val v10: s1 = v3.p0
    val v12: s3 = f9(v15)
    val v9: s0 = v10.p1
    val v25: Vector[Vector[Double]] = v9.p1
    val v19: s1 = v1.p0
    val v27: Vector[Vector[Double]] = v8(0)
    val v30: s1 = v12.p1
    v3 = v3.copy(p0 = v19)
    var v42: Vector[Vector[Double]] = v25
    v3 = v3.copy(p1 = v10)
    val v22: Vector[s0] = Vector(v9, v9, v0, v0)
    var v58: Vector[s0] = v22
    val v70: s0 = v10.p1
    v3 = v3.copy(p0 = v30)
    v3 = v3.copy(p0 = v10)
    var v59: s1 = v30
    val v81: s0 = s0(v27, v42)
    val v29: Vector[s0] = v10.p0
    v3 = v3.copy(p0 = v59)
    var v44: Vector[s0] = v29
    v59 = v59.copy(p1 = v70)
    v59 = v59.copy(p0 = v29)
    v59 = v59.copy(p0 = v44)
    v3 = v3.copy(p1 = v10)
    v42 = v7
    val v83: s0 = v58(3)
    v58 = v58.updated(2, v81)
    v44 = v44.updated(2, v9)
    v59 = v59.copy(p1 = v0)
    v83
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    var v7: Double = v1
    val v6: Vector[s1] = v0(0)
    val v4: s1 = v6(0)
    var v15: Double = v1
    val v11: s0 = v4.p1
    val v29: s3 = s3(v4, v4)
    val v14: s0 = f4(v11, v29)
    val v16: Vector[Vector[Double]] = v14.p0
    val v17: Double = v7 - v15
    val v26: Vector[Double] = v16(0)
    val v25: Double = v26(0)
    val v48: Double = v17 * v25
    v48
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), Vector(s1(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), Vector(s1(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0)))), s0(Vector(Vector(22.0)), Vector(Vector(23.0))))))
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