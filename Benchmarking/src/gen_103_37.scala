import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s3 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: Double): Double = {
    val v5: Vector[s3] = v0(0)
    val v2: s3 = v5(0)
    val v7: s0 = v2.p1
    val v4: Vector[Vector[Double]] = v7.p0
    val v10: s0 = v2.p1
    val v19: Vector[Vector[Double]] = v10.p0
    val v13: s3 = v5(0)
    val v8: s0 = v13.p0
    val v14: Vector[Vector[Double]] = v8.p1
    val v23: Vector[Vector[Double]] = v7.p2
    val v27: s0 = s0(v19, v14, v4)
    val v50: Vector[Vector[Double]] = v27.p0
    val v38: Vector[Vector[Vector[Double]]] = Vector(v23, v19, v50)
    val v59: Vector[Vector[Double]] = v38(2)
    val v122: Vector[Double] = v59(1)
    val v279: Double = v122(0)
    v279
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0))), s0(Vector(Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0))))))
    val v1: Double = 14.0
    val start = nanoTime()
    var result: Double = 14.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}