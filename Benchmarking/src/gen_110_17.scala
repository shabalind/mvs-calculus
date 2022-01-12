import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[Double]]
  )
  case class s6 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  @noinline
  def f0(v0: Vector[Vector[s6]], v1: Double): Double = {
    val v7: Vector[s6] = v0(1)
    var v3: Double = v1
    val v2: s6 = v7(0)
    val v5: s1 = v2.p1
    val v10: s1 = v2.p1
    var v39: Double = v3
    val v45: Vector[Vector[Double]] = v10.p0
    val v59: Vector[Vector[Double]] = v5.p0
    var v38: Vector[Vector[Double]] = v59
    v38 = v45
    var v63: Double = v1
    val v79: Vector[Double] = v38(0)
    var v87: Vector[Double] = v79
    val v123: Double = v87(0)
    v38 = v38.updated(0, v79)
    v87 = v87.updated(0, v63)
    v63 = v39
    v123
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s6]] = Vector(Vector(s6(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))))), s1(Vector(Vector(9.0))))), Vector(s6(Vector(Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0), Vector(12.0)))), Vector(s0(Vector(Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0))))), s1(Vector(Vector(19.0))))))
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