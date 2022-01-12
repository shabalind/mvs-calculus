import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: Vector[Vector[s0]],
    p3: s0
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s6 (
    p0: Vector[Vector[s0]],
    p1: Vector[s2]
  )
  def f27(v0: Double): Double = {
    var v3: Double = v0
    var v5: Double = v0
    var v2: Double = v3
    v5 = v3
    val v13: Double = v0 + v2
    var v6: Double = v3
    var v8: Double = v13
    val v7: Double = v2 * v0
    var v1: Double = v6
    var v10: Double = v3
    var v11: Double = v0
    v2 = v13
    var v4: Double = v5
    var v14: Double = v4
    val v9: Vector[Double] = Vector(v7, v7, v3, v10, v11)
    var v12: Vector[Double] = v9
    var v17: Vector[Double] = v12
    var v23: Double = v1
    v17 = v17.updated(3, v6)
    v17 = v17.updated(0, v23)
    var v42: Double = v0
    v10 = v42
    v17 = v17.updated(2, v8)
    val v27: Double = v17(1)
    v17 = v17.updated(3, v14)
    v27
  }
  @noinline
  def f0(v0: s6, v1: Vector[s1], v2: Double): Double = {
    var v8: Double = v2
    val v30: Double = v8 / v8
    val v41: Double = f27(v2)
    val v68: Double = v30 + v41
    var v182: Double = v41
    val v175: Double = v68 * v182
    v175
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(Vector(Vector(s0(Vector(Vector(0.0)), Vector(1.0)))), Vector(s2(s0(Vector(Vector(2.0)), Vector(3.0)), s0(Vector(Vector(4.0)), Vector(5.0)))))
    val v1: Vector[s1] = Vector(s1(s0(Vector(Vector(6.0)), Vector(7.0)), s0(Vector(Vector(8.0)), Vector(9.0)), Vector(Vector(s0(Vector(Vector(10.0)), Vector(11.0))), Vector(s0(Vector(Vector(12.0)), Vector(13.0))), Vector(s0(Vector(Vector(14.0)), Vector(15.0)))), s0(Vector(Vector(16.0)), Vector(17.0))), s1(s0(Vector(Vector(18.0)), Vector(19.0)), s0(Vector(Vector(20.0)), Vector(21.0)), Vector(Vector(s0(Vector(Vector(22.0)), Vector(23.0))), Vector(s0(Vector(Vector(24.0)), Vector(25.0))), Vector(s0(Vector(Vector(26.0)), Vector(27.0)))), s0(Vector(Vector(28.0)), Vector(29.0))), s1(s0(Vector(Vector(30.0)), Vector(31.0)), s0(Vector(Vector(32.0)), Vector(33.0)), Vector(Vector(s0(Vector(Vector(34.0)), Vector(35.0))), Vector(s0(Vector(Vector(36.0)), Vector(37.0))), Vector(s0(Vector(Vector(38.0)), Vector(39.0)))), s0(Vector(Vector(40.0)), Vector(41.0))))
    val v2: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}