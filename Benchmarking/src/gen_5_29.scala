import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: s0, v2: Vector[s0], v3: Vector[Vector[s0]], v4: s0, v5: s0, v6: s0, v7: Double): Double = {
    val v9: Vector[Vector[Double]] = v5.p0
    var v21: Vector[Vector[Double]] = v9
    val v35: Vector[Double] = v21(0)
    var v28: Vector[Double] = v35
    val v64: Double = v28(0)
    val v68: Vector[Vector[Double]] = v0.p3
    val v30: Vector[Double] = v68(0)
    v21 = v21.updated(0, v30)
    v28 = v28.updated(0, v7)
    val v81: Vector[Double] = v21(0)
    v28 = v81
    v64
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0)), Vector(Vector(2.0)), Vector(Vector(3.0)))
    val v1: s0 = s0(Vector(Vector(4.0)), Vector(Vector(5.0)), Vector(Vector(6.0)), Vector(Vector(7.0)))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0)), Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)), Vector(Vector(14.0)), Vector(Vector(15.0))))
    val v3: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0)), Vector(Vector(18.0)), Vector(Vector(19.0)))))
    val v4: s0 = s0(Vector(Vector(20.0)), Vector(Vector(21.0)), Vector(Vector(22.0)), Vector(Vector(23.0)))
    val v5: s0 = s0(Vector(Vector(24.0)), Vector(Vector(25.0)), Vector(Vector(26.0)), Vector(Vector(27.0)))
    val v6: s0 = s0(Vector(Vector(28.0)), Vector(Vector(29.0)), Vector(Vector(30.0)), Vector(Vector(31.0)))
    val v7: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}