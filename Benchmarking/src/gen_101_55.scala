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
    p1: Vector[s0]
  )
  def f1(v0: Double, v1: Vector[s1]): Double = {
    v0
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v4: Double = f1(v1, v0)
    val v6: Vector[Vector[s1]] = Vector(v0, v0, v0, v0)
    var v3: Double = v4
    var v9: Double = v3
    var v22: Vector[Vector[s1]] = v6
    v22 = v22.updated(3, v0)
    v22 = v22.updated(0, v0)
    val v31: Double = f1(v9, v0)
    val v68: Vector[s1] = v22(2)
    var v43: Vector[Vector[s1]] = v22
    val v40: Double = f1(v31, v68)
    v22 = v43
    v40
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))), s1(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)), Vector(Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))))))
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