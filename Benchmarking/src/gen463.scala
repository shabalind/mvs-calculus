import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Vector[Vector[s0]], v2: Double): Double = {
    val v10: Vector[Vector[Double]] = v0.p0
    val v18: Vector[Double] = v10(2)
    val v14: Double = v18(0)
    val v28: Vector[Vector[Double]] = v0.p1
    var v41: Vector[Vector[Double]] = v28
    val v15: Double = v14 - v14
    val v21: Vector[Double] = v41(1)
    var v72: Vector[Double] = v21
    v72 = v72.updated(0, v14)
    v72 = v72.updated(0, v14)
    var v183: Double = v14
    v72 = v72.updated(0, v15)
    val v79: Double = v72(0)
    v72 = v72.updated(0, v79)
    val v148: Double = v14 + v79
    val v87: Vector[Double] = Vector(v148, v183, v183)
    val v236: Double = v87(2)
    v236
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))))
    val v2: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}