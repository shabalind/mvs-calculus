import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f55(v0: s1, v1: Vector[s0]): Vector[s0] = {
    val v10: Vector[s0] = v0.p0
    val v15: s1 = s1(v10, v1)
    val v57: Vector[s0] = v15.p0
    v57
  }
  @noinline
  def f0(v0: s1, v1: Vector[s1], v2: Vector[s1], v3: Double): Double = {
    val v5: Vector[s0] = v0.p0
    val v9: Vector[s0] = f55(v0, v5)
    val v4: s0 = v9(0)
    val v22: Vector[Vector[Double]] = v4.p1
    val v30: Vector[Double] = v22(0)
    val v45: Double = v30(0)
    v45
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))))
    val v1: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))))))
    val v2: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), s1(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))), Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))))))
    val v3: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}