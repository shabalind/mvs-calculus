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
    p0: s0,
    p1: s1
  )
  def f55(v0: s3): s3 = {
    val v2: s1 = v0.p1
    val v6: s0 = v0.p0
    var v15: s0 = v6
    var v5: s3 = v0
    val v1: s0 = v5.p0
    val v7: Vector[Vector[Double]] = v1.p1
    v15 = v15.copy(p0 = v7)
    v5 = v5.copy(p0 = v6)
    var v9: s0 = v15
    v5 = v5.copy(p1 = v2)
    val v18: s0 = v0.p0
    var v11: s1 = v2
    var v25: s1 = v11
    val v23: s0 = v11.p1
    val v16: Vector[s0] = v25.p0
    val v13: Vector[s0] = Vector(v23, v15)
    val v29: s0 = v13(1)
    v15 = v9
    val v27: Vector[Vector[s0]] = Vector(v16, v16, v16, v16)
    val v37: Vector[s0] = v27(1)
    v11 = v11.copy(p1 = v18)
    v11 = v11.copy(p0 = v37)
    v5 = v5.copy(p1 = v25)
    v5 = v5.copy(p0 = v29)
    v5
  }
  def f31(v0: s3, v1: s3): s3 = {
    val v7: s3 = f55(v1)
    val v5: s1 = v0.p1
    var v19: s1 = v5
    var v24: s3 = v7
    v24 = v24.copy(p1 = v19)
    v24
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v3: s3 = f31(v0, v0)
    val v6: s1 = v3.p1
    val v11: s0 = v6.p1
    val v22: Vector[Vector[Double]] = v11.p1
    var v35: Vector[Vector[Double]] = v22
    val v62: Vector[Double] = v35(0)
    val v72: Double = v62(0)
    v35 = v35.updated(1, v62)
    v72
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s1(Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}