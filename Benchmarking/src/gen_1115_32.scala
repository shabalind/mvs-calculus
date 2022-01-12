import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]],
    p5: Vector[Double],
    p6: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    var v7: Double = v1
    val v6: Vector[Vector[s0]] = v0.p0
    val v15: Vector[s0] = v6(0)
    var v31: Double = v7
    val v13: Vector[Double] = Vector(v31, v1, v31, v1, v1)
    val v46: s0 = v15(0)
    val v55: Vector[Vector[Double]] = v46.p2
    val v53: Vector[Double] = v55(0)
    val v52: Double = v13(0)
    val v74: Double = v13(4)
    val v149: Double = v53(0)
    val v116: Double = v53(0)
    var v109: Double = v52
    val v312: Double = v116 - v74
    v31 = v149
    val v347: Double = v109 - v312
    v347
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(11.0, 12.0, 13.0), Vector(Vector(14.0), Vector(15.0))))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)), Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(27.0, 28.0, 29.0), Vector(Vector(30.0), Vector(31.0))))
    val v1: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}