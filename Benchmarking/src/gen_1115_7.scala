import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  def f30(v0: s2, v1: Double): Double = {
    val v6: Vector[Double] = Vector(v1, v1, v1)
    var v7: Vector[Double] = v6
    val v3: Double = v6(2)
    val v12: Double = v7(0)
    v7 = v7.updated(2, v12)
    v7 = v7.updated(2, v3)
    val v11: Double = v7(0)
    v7 = v6
    v7 = v7.updated(1, v11)
    var v28: Double = v1
    val v33: Double = v6(1)
    v28 = v33
    val v61: Double = v11 + v12
    v28 = v33
    val v77: Double = v28 + v61
    v7 = v7.updated(0, v61)
    v77
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v2: Double = v1 + v1
    val v11: s2 = v0.p1
    var v4: Double = v2
    val v7: s0 = v11.p0
    val v21: Vector[Vector[Double]] = v7.p0
    val v9: Double = f30(v11, v2)
    val v12: Vector[Double] = v21(0)
    v4 = v9
    var v22: Vector[Double] = v12
    val v17: Double = v22(0)
    v22 = v22.updated(0, v1)
    var v29: Double = v17
    v22 = v22.updated(0, v4)
    v29
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), s2(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}