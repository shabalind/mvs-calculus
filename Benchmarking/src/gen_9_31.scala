import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s6 (
    p0: s0,
    p1: s0
  )
  case class s8 (
    p0: s0
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: s8, v2: Vector[s6], v3: Double): Double = {
    var v16: Double = v3
    val v15: Vector[s0] = v0(1)
    val v35: s0 = v15(0)
    val v17: Vector[Vector[Double]] = v35.p1
    val v20: Vector[Double] = v17(0)
    val v39: Double = v16 * v3
    var v63: Vector[Double] = v20
    val v100: Double = v20(0)
    val v71: Double = v63(0)
    val v94: Double = v39 - v71
    val v98: Double = v100 * v94
    val v146: Double = v98 / v39
    v146
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))))
    val v1: s8 = s8(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))
    val v2: Vector[s6] = Vector(s6(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))
    val v3: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}