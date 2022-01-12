import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0],
    p2: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: Vector[s1]
  )
  def f38(v0: s0): s0 = {
    var v4: s0 = v0
    var v6: s0 = v0
    val v7: Vector[s0] = Vector(v6, v0, v4, v6)
    val v8: s0 = v7(3)
    val v1: s0 = v7(2)
    var v9: Vector[s0] = v7
    val v11: s0 = v9(0)
    v9 = v9.updated(1, v1)
    val v5: Vector[Vector[Double]] = v6.p0
    val v14: Vector[Vector[Double]] = v1.p0
    var v17: Vector[Vector[Double]] = v14
    v17 = v14
    v6 = v6.copy(p0 = v17)
    val v26: Vector[Vector[Double]] = v8.p1
    v4 = v4.copy(p1 = v26)
    v6 = v6.copy(p0 = v5)
    v9 = v9.updated(3, v8)
    v11
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v3: s0 = v0.p0
    var v6: Double = v1
    var v11: s2 = v0
    val v10: s0 = f38(v3)
    val v15: s0 = v11.p0
    val v14: s0 = f38(v10)
    val v23: Vector[Vector[Double]] = v15.p1
    val v31: Vector[Double] = v23(0)
    val v47: Double = v31(0)
    var v45: Double = v6
    var v54: Double = v45
    val v130: Double = v54 / v54
    v11 = v11.copy(p0 = v14)
    val v185: Double = v47 + v130
    v185
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))), Vector(s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))))
    val v1: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}