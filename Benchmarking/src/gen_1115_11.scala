import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  case class s5 (
    p0: Vector[s2],
    p1: s0
  )
  def f31(v0: Double): Double = {
    var v2: Double = v0
    v2 = v0
    var v1: Double = v0
    var v3: Double = v0
    val v5: Double = v0 + v2
    val v11: Double = v1 * v5
    var v20: Double = v11
    var v32: Double = v20
    val v10: Vector[Double] = Vector(v32, v3, v0)
    var v41: Vector[Double] = v10
    var v31: Vector[Double] = v41
    var v51: Vector[Double] = v31
    v20 = v3
    val v26: Double = v51(1)
    v31 = v31.updated(1, v5)
    v26
  }
  def f29(v0: Double): Double = {
    val v6: Double = f31(v0)
    var v1: Double = v6
    var v2: Double = v0
    val v8: Vector[Double] = Vector(v6, v0)
    var v10: Double = v2
    var v4: Vector[Double] = v8
    v4 = v4.updated(0, v10)
    val v7: Double = f31(v6)
    v2 = v1
    v2 = v7
    var v25: Vector[Double] = v4
    val v28: Double = v25(1)
    val v33: Double = f31(v28)
    v25 = v25.updated(0, v0)
    v33
  }
  @noinline
  def f0(v0: Vector[s5], v1: s2, v2: Double): Double = {
    var v8: Double = v2
    v8 = v2
    val v61: Double = f29(v8)
    var v236: Double = v61
    v236
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(Vector(s2(Vector(Vector(s0(Vector(Vector(0.0))))), s1(s0(Vector(Vector(1.0))), s0(Vector(Vector(2.0))))), s2(Vector(Vector(s0(Vector(Vector(3.0))))), s1(s0(Vector(Vector(4.0))), s0(Vector(Vector(5.0))))), s2(Vector(Vector(s0(Vector(Vector(6.0))))), s1(s0(Vector(Vector(7.0))), s0(Vector(Vector(8.0)))))), s0(Vector(Vector(9.0)))))
    val v1: s2 = s2(Vector(Vector(s0(Vector(Vector(10.0))))), s1(s0(Vector(Vector(11.0))), s0(Vector(Vector(12.0)))))
    val v2: Double = 13.0
    val start = nanoTime()
    var result: Double = 13.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}