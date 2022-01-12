import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Double
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0],
    p2: s0,
    p3: s1,
    p4: Vector[s1]
  )
  def f107(v0: Double): Double = {
    var v5: Double = v0
    var v6: Double = v5
    var v2: Double = v5
    var v1: Double = v2
    v2 = v5
    var v4: Double = v5
    val v3: Double = v6 * v2
    var v11: Double = v4
    val v10: Double = v11 / v3
    var v19: Double = v0
    var v15: Double = v11
    val v12: Vector[Double] = Vector(v11, v15, v10, v19, v1, v4)
    var v21: Vector[Double] = v12
    v21 = v21.updated(2, v6)
    var v18: Vector[Double] = v21
    var v23: Double = v5
    v18 = v18.updated(5, v5)
    v21 = v21.updated(4, v0)
    v18 = v18.updated(3, v11)
    v21 = v21.updated(1, v23)
    val v37: Double = v18(3)
    val v34: Vector[Double] = Vector(v6)
    var v24: Double = v37
    val v33: Double = v34(0)
    v18 = v18.updated(3, v37)
    v24 = v37
    var v51: Double = v33
    v21 = v21.updated(4, v51)
    v24
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v10: Double = f107(v1)
    var v13: Double = v10
    val v17: Double = v1 * v1
    v13 = v17
    v13
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)), 3.0), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0)), 7.0)), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0)), 11.0), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)), 15.0), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0)), 19.0)), Vector(s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0)), 23.0), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)), 27.0)))))
    val v1: Double = 28.0
    val start = nanoTime()
    var result: Double = 28.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}