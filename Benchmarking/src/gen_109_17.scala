import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  @noinline
  def f0(v0: s3, v1: Vector[s0], v2: Double): Double = {
    val v6: s0 = v1(0)
    val v3: Vector[Vector[Double]] = v6.p0
    var v10: Vector[Vector[Double]] = v3
    val v16: Vector[Double] = v10(0)
    v10 = v10.updated(1, v16)
    var v31: Vector[Double] = v16
    val v39: Double = v31(0)
    var v27: Vector[Double] = v16
    v27 = v27.updated(0, v2)
    val v50: Double = v27(0)
    v27 = v27.updated(0, v50)
    val v188: Double = v39 + v50
    v188
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s1(Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))))
    val v2: Double = 25.0
    val start = nanoTime()
    var result: Double = 25.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}