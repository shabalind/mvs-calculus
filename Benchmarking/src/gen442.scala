import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Vector[s0], v2: Double): Double = {
    val v8: s0 = v0(1)
    var v6: s0 = v8
    val v5: Vector[Double] = v6.p1
    val v11: Vector[Double] = v6.p1
    val v3: Double = v5(1)
    val v12: Vector[Double] = v8.p1
    val v9: Vector[Double] = v6.p1
    v6 = v6.copy(p1 = v9)
    val v19: s0 = v0(2)
    val v20: Double = v3 * v3
    val v16: s0 = v1(1)
    v6 = v6.copy(p1 = v12)
    v6 = v6.copy(p1 = v11)
    val v42: Vector[Double] = v16.p1
    v6 = v6.copy(p1 = v42)
    val v35: Vector[Vector[Double]] = v19.p0
    v6 = v6.copy(p0 = v35)
    v20
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0, 4.0)), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(8.0, 9.0)), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(13.0, 14.0)))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(18.0, 19.0)), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(23.0, 24.0)), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(28.0, 29.0)))
    val v2: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}