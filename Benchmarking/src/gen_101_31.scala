import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s7 (
    p0: Vector[s1],
    p1: Vector[Vector[s1]]
  )
  def f88(v0: Vector[s0]): Vector[s0] = {
    var v42: Vector[s0] = v0
    val v44: s0 = v42(0)
    v42 = v42.updated(0, v44)
    v42
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: s7, v2: Double): Double = {
    val v7: Vector[s0] = v0(1)
    val v22: Vector[s0] = f88(v7)
    val v59: s0 = v22(0)
    val v160: Vector[Vector[Double]] = v59.p0
    val v45: Vector[Double] = v160(2)
    val v85: Double = v45(0)
    var v98: Double = v85
    v98
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))))
    val v1: s7 = s7(Vector(s1(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), Vector(Vector(s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))))
    val v2: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}