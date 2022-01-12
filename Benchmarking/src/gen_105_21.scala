import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s2,
    p1: s0
  )
  def f28(v0: Double): Double = {
    var v3: Double = v0
    var v5: Double = v3
    var v6: Double = v0
    var v2: Double = v5
    var v4: Double = v2
    var v12: Double = v6
    var v1: Double = v3
    var v23: Double = v6
    v1 = v6
    var v9: Double = v0
    v1 = v12
    val v8: Vector[Double] = Vector(v23, v4, v5, v5, v9, v0, v1)
    val v43: Double = v8(1)
    v43
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v2: Double = f28(v1)
    var v15: Double = v2
    v15
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))))
    val v1: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}