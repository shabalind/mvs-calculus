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
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v7: s2 = v0(0)
    val v5: Vector[s0] = v7.p0
    val v2: s0 = v5(1)
    val v12: Vector[Vector[Double]] = v2.p1
    val v10: Vector[Vector[Double]] = v2.p1
    val v26: Vector[Vector[Double]] = v2.p1
    val v92: Vector[Double] = v12(1)
    val v90: Double = v92(0)
    val v217: Vector[Double] = v26(0)
    val v127: Vector[Double] = v10(1)
    val v124: Double = v127(0)
    val v145: Double = v217(0)
    val v103: Double = v124 - v145
    val v161: Double = v103 + v90
    val v285: Double = v103 - v161
    v285
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), Vector(s1(Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))))))
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