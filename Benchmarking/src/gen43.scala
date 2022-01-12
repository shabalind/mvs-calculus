import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v2: Double = v1 + v1
    var v8: Double = v2
    val v6: Double = v1 + v2
    val v18: Vector[Double] = Vector(v2, v8, v8)
    val v11: s0 = v0.p0
    var v16: Vector[Double] = v18
    val v15: Vector[s0] = Vector(v11, v11, v11, v11, v11, v11, v11)
    v16 = v16.updated(2, v2)
    val v10: Double = v16(1)
    val v17: Double = v16(0)
    val v21: Double = v10 / v17
    val v24: s0 = v15(2)
    v16 = v16.updated(2, v6)
    v16 = v16.updated(0, v6)
    val v22: Vector[Double] = v24.p1
    v16 = v16.updated(1, v21)
    v16 = v22
    v17
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(2.0, 3.0, 4.0)), s1(Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(7.0, 8.0, 9.0))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(12.0, 13.0, 14.0)), s0(Vector(Vector(15.0), Vector(16.0)), Vector(17.0, 18.0, 19.0)), s0(Vector(Vector(20.0), Vector(21.0)), Vector(22.0, 23.0, 24.0)))))
    val v1: Double = 25.0
    val start = nanoTime()
    var result: Double = 25.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}