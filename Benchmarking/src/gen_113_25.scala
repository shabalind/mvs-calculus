import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v7: Double = v1
    var v2: Double = v1
    val v26: Vector[Double] = Vector(v1, v1, v1, v7, v2, v7, v7)
    var v30: Vector[Double] = v26
    var v29: Vector[Double] = v26
    v29 = v29.updated(6, v1)
    val v58: Double = v29(4)
    v29 = v30
    v30 = v30.updated(5, v7)
    v30 = v30.updated(6, v2)
    var v242: Double = v58
    var v198: Double = v242
    v198
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s1(Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))))
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