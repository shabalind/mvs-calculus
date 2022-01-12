import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s5 (
    p0: s1,
    p1: Vector[s1],
    p2: Vector[Vector[s0]]
  )
  def f43(v0: Double): Double = {
    var v3: Double = v0
    var v7: Double = v0
    val v6: Vector[Double] = Vector(v0, v0, v7, v3, v3, v0)
    var v2: Vector[Double] = v6
    val v9: Double = v2(1)
    v9
  }
  def f9(v0: Double): Double = {
    var v12: Double = v0
    var v8: Double = v12
    v8
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: s5, v2: Double): Double = {
    var v11: Double = v2
    var v48: Double = v2
    val v28: Double = f9(v11)
    var v29: Double = v11
    val v39: Double = f9(v28)
    val v70: Double = f43(v39)
    val v56: Double = v48 - v70
    v11 = v29
    v56
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))))), Vector(s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))))))
    val v1: s5 = s5(s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0))))), Vector(s1(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0)))))), Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0)))), Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0))))))
    val v2: Double = 28.0
    val start = nanoTime()
    var result: Double = 28.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}