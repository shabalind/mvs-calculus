import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: Vector[s0]
  )
  def f36(v0: Double): Double = {
    var v2: Double = v0
    var v7: Double = v2
    var v3: Double = v7
    v3
  }
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    val v7: Double = f36(v1)
    var v5: Double = v7
    val v4: Double = f36(v5)
    var v17: Double = v1
    v17 = v5
    val v41: Double = v5 + v4
    val v190: Double = v5 / v17
    val v137: Double = v41 + v190
    v137
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s2(Vector(s0(Vector(0.0, 1.0), Vector(Vector(2.0))), s0(Vector(3.0, 4.0), Vector(Vector(5.0))), s0(Vector(6.0, 7.0), Vector(Vector(8.0)))), s1(s0(Vector(9.0, 10.0), Vector(Vector(11.0))), Vector(Vector(s0(Vector(12.0, 13.0), Vector(Vector(14.0)))), Vector(s0(Vector(15.0, 16.0), Vector(Vector(17.0))))), s0(Vector(18.0, 19.0), Vector(Vector(20.0))))), Vector(s0(Vector(21.0, 22.0), Vector(Vector(23.0))))))
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