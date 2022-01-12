import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0]
  )
  def f17(v0: Vector[s1]): Vector[s1] = {
    val v3: s1 = v0(1)
    val v5: s1 = v0(1)
    val v4: Vector[s0] = v5.p0
    val v9: Vector[s0] = v3.p0
    val v22: s1 = s1(v9)
    var v77: Vector[s1] = v0
    var v78: s1 = v22
    v78 = v78.copy(p0 = v4)
    v77 = v77.updated(1, v78)
    v77
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v6: Vector[s1] = f17(v0)
    val v8: s1 = v6(0)
    val v7: Vector[s0] = v8.p0
    val v11: Vector[s0] = v8.p0
    val v13: s0 = v7(2)
    val v14: Vector[Vector[Double]] = v13.p1
    val v33: s0 = v11(2)
    val v73: Vector[Double] = v14(0)
    val v47: Vector[Vector[Double]] = v33.p0
    val v145: Double = v73(0)
    var v102: Vector[Vector[Double]] = v47
    val v96: Vector[Double] = v102(1)
    val v211: Double = v96(0)
    val v109: Double = v211 - v145
    v109
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s1(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}