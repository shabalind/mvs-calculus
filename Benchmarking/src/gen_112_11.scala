import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s0,
    p2: s0,
    p3: Double
  )
  case class s5 (
    p0: s2,
    p1: s2
  )
  @noinline
  def f0(v0: s5, v1: s2, v2: s1, v3: s1, v4: Double): Double = {
    val v7: Vector[s0] = v3.p0
    val v12: s0 = v7(0)
    val v14: s0 = v7(0)
    var v11: s0 = v12
    var v23: Vector[s0] = v7
    val v10: Vector[Vector[Double]] = v11.p0
    val v18: s0 = v7(0)
    val v13: s0 = v7(0)
    val v9: Vector[Vector[Double]] = v13.p0
    v23 = v23.updated(0, v13)
    v23 = v23.updated(0, v12)
    v11 = v14
    val v19: s0 = v7(0)
    val v39: s0 = v7(0)
    val v64: s0 = v23(0)
    v23 = v23.updated(0, v18)
    val v68: s0 = v7(0)
    v11 = v11.copy(p0 = v10)
    v23 = v23.updated(0, v19)
    val v88: Vector[Vector[Vector[Double]]] = Vector(v10, v9)
    val v72: Vector[Vector[Double]] = v88(1)
    var v71: Vector[Vector[Double]] = v10
    v23 = v23.updated(0, v68)
    val v120: Vector[Double] = v71(0)
    v23 = v23.updated(0, v39)
    val v107: Double = v120(0)
    v11 = v64
    v11 = v11.copy(p0 = v72)
    v107
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s2(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))), 8.0), s2(s1(Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0)))), s0(Vector(Vector(11.0)), Vector(Vector(12.0)))), s0(Vector(Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0))), 17.0))
    val v1: s2 = s2(s1(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0)))), s0(Vector(Vector(20.0)), Vector(Vector(21.0)))), s0(Vector(Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0))), 26.0)
    val v2: s1 = s1(Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0)))), s0(Vector(Vector(29.0)), Vector(Vector(30.0))))
    val v3: s1 = s1(Vector(s0(Vector(Vector(31.0)), Vector(Vector(32.0)))), s0(Vector(Vector(33.0)), Vector(Vector(34.0))))
    val v4: Double = 35.0
    val start = nanoTime()
    var result: Double = 35.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}