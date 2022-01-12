import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  case class s6 (
    p0: s2,
    p1: s0
  )
  @noinline
  def f0(v0: s6, v1: Double): Double = {
    val v4: s0 = v0.p1
    var v6: s0 = v4
    val v13: Vector[Vector[Double]] = v4.p0
    val v7: Vector[Double] = v13(1)
    v6 = v6.copy(p0 = v13)
    val v9: Vector[Vector[Double]] = v6.p0
    var v18: Vector[Vector[Double]] = v9
    val v11: Vector[Vector[Double]] = v6.p0
    var v14: Vector[Vector[Double]] = v9
    v6 = v6.copy(p0 = v11)
    var v23: Vector[Vector[Double]] = v18
    val v41: Double = v7(0)
    val v31: Vector[Double] = v13(0)
    var v22: Vector[Double] = v7
    v6 = v6.copy(p0 = v14)
    val v21: Vector[Vector[Double]] = v4.p0
    v23 = v23.updated(2, v31)
    v22 = v22.updated(0, v41)
    v22 = v7
    val v33: Vector[Double] = v18(2)
    v18 = v18.updated(0, v31)
    v23 = v23.updated(2, v22)
    v6 = v6.copy(p0 = v13)
    v6 = v6.copy(p0 = v21)
    v18 = v18.updated(2, v22)
    val v26: Vector[Double] = v23(1)
    v18 = v18.updated(2, v26)
    val v61: Double = v33(0)
    v23 = v23.updated(0, v33)
    v61
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s1(Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), Vector(Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))))
    val v1: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}