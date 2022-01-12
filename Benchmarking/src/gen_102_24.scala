import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  case class s4 (
    p0: Vector[s0],
    p1: s2
  )
  def f49(v0: Double): Double = {
    val v3: Double = v0 + v0
    var v5: Double = v3
    var v4: Double = v3
    v4 = v5
    var v7: Double = v0
    v4 = v5
    val v10: Vector[Double] = Vector(v4, v7, v7)
    var v20: Vector[Double] = v10
    val v32: Double = v20(2)
    v32
  }
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    var v2: Double = v1
    val v20: Double = f49(v2)
    val v17: Double = v20 / v1
    v17
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s2(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), Vector(Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))))))))
    val v1: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}