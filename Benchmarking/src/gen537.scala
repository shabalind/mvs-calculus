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
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s6 (
    p0: s1,
    p1: s2
  )
  def f56(v0: Double): Double = {
    var v7: Double = v0
    var v3: Double = v7
    var v1: Double = v3
    var v6: Double = v3
    var v8: Double = v7
    var v9: Double = v1
    var v4: Double = v8
    var v22: Double = v1
    val v13: Vector[Double] = Vector(v6)
    var v34: Vector[Double] = v13
    val v18: Double = v13(0)
    val v19: Double = v34(0)
    v34 = v34.updated(0, v18)
    val v16: Double = v34(0)
    var v24: Double = v9
    v34 = v34.updated(0, v24)
    v34 = v34.updated(0, v18)
    var v81: Double = v4
    val v33: Vector[Double] = Vector(v1, v9, v22, v22, v22, v19)
    var v45: Vector[Double] = v33
    v34 = v34.updated(0, v81)
    v34 = v34.updated(0, v16)
    v45 = v45.updated(4, v6)
    val v38: Double = v45(1)
    v38
  }
  @noinline
  def f0(v0: Vector[s6], v1: Double): Double = {
    val v8: Double = f56(v1)
    val v2: Double = f56(v8)
    var v17: Double = v2
    v17
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))))), s2(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))))), s6(s1(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), s2(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}