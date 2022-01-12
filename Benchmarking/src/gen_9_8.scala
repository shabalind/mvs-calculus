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
  case class s3 (
    p0: s1,
    p1: s0
  )
  def f47(v0: Vector[s0]): Vector[s0] = {
    var v1: Vector[s0] = v0
    val v3: s0 = v0(0)
    val v2: s0 = v1(1)
    val v4: Vector[Vector[Double]] = v3.p0
    v1 = v1.updated(1, v2)
    v1 = v1.updated(0, v2)
    v1 = v0
    v1 = v0
    var v5: Vector[s0] = v0
    val v10: Vector[Vector[Double]] = v3.p1
    v1 = v1.updated(0, v2)
    v5 = v5.updated(0, v3)
    val v18: Vector[Vector[Double]] = v3.p0
    val v16: Vector[Vector[Double]] = v3.p1
    val v22: Vector[Vector[Double]] = v2.p0
    v5 = v5.updated(1, v3)
    var v20: s0 = v2
    v20 = v20.copy(p0 = v18)
    v5 = v5.updated(0, v20)
    val v46: Vector[Vector[Double]] = v3.p1
    v20 = v20.copy(p1 = v4)
    v20 = v20.copy(p1 = v10)
    v1 = v1.updated(0, v3)
    v20 = v20.copy(p1 = v10)
    v20 = v20.copy(p0 = v22)
    v20 = v20.copy(p0 = v46)
    val v34: Vector[Vector[Double]] = v3.p1
    v1 = v1.updated(1, v20)
    v20 = v20.copy(p0 = v34)
    var v41: s0 = v3
    v41 = v41.copy(p0 = v22)
    v1 = v5
    var v78: s0 = v20
    v41 = v41.copy(p0 = v16)
    var v53: Vector[s0] = v1
    v53 = v53.updated(1, v78)
    v53 = v53.updated(0, v41)
    v53
  }
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    val v7: s3 = v0(0)
    val v2: s1 = v7.p0
    val v9: Vector[s0] = v2.p0
    val v21: s0 = v9(0)
    val v12: Vector[s0] = f47(v9)
    var v22: Vector[s0] = v12
    v22 = v22.updated(1, v21)
    val v56: s0 = v22(0)
    val v44: Vector[s0] = v2.p0
    v22 = v44
    val v47: Vector[Vector[Double]] = v56.p1
    var v63: Vector[Vector[Double]] = v47
    val v80: Vector[Double] = v63(0)
    val v146: Double = v80(0)
    v146
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), s3(s1(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0))))), s0(Vector(Vector(14.0)), Vector(Vector(15.0)))))
    val v1: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}