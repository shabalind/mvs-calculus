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
  case class s2 (
    p0: Vector[s0],
    p1: Vector[Vector[s1]]
  )
  def f76(v0: Double): Double = {
    var v2: Double = v0
    var v4: Double = v0
    var v8: Double = v4
    val v1: Double = v8 / v2
    v2 = v4
    var v5: Double = v2
    var v10: Double = v1
    var v6: Double = v2
    var v7: Double = v1
    v5 = v8
    var v20: Double = v5
    val v21: Vector[Double] = Vector(v10, v6, v5, v7, v4)
    var v32: Vector[Double] = v21
    v32 = v32.updated(3, v20)
    val v29: Double = v32(0)
    v29
  }
  def f34(v0: Double): Double = {
    val v5: Double = f76(v0)
    val v2: Double = f76(v5)
    var v1: Double = v5
    val v19: Double = v2 * v1
    val v16: Double = f76(v5)
    val v29: Double = f76(v16)
    var v20: Double = v29
    val v13: Vector[Double] = Vector(v20, v29, v19)
    val v23: Double = v13(0)
    v23
  }
  @noinline
  def f0(v0: Vector[s0], v1: s2, v2: Double): Double = {
    var v3: Double = v2
    var v57: Double = v3
    val v19: Double = f34(v57)
    val v41: Double = f76(v19)
    v41
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))
    val v1: s2 = s2(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(Vector(s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))))
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