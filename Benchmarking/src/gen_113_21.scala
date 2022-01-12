import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s4 (
    p0: Vector[s1],
    p1: Vector[s2]
  )
  def f18(v0: Double): Double = {
    var v3: Double = v0
    var v6: Double = v0
    var v4: Double = v6
    var v7: Double = v0
    var v5: Double = v7
    var v8: Double = v0
    var v1: Double = v3
    val v22: Vector[Double] = Vector(v4)
    val v9: Double = v22(0)
    val v12: Double = v22(0)
    val v13: Double = v22(0)
    var v28: Double = v8
    var v29: Double = v1
    v7 = v0
    val v20: Double = v22(0)
    val v56: Vector[Double] = Vector(v20, v9, v6, v9, v8)
    var v64: Vector[Double] = v56
    v29 = v5
    val v48: Double = v22(0)
    var v50: Vector[Double] = v64
    val v74: Double = v22(0)
    v50 = v50.updated(2, v13)
    var v84: Vector[Double] = v50
    v84 = v56
    v84 = v84.updated(0, v48)
    v84 = v84.updated(0, v12)
    v28 = v74
    v84 = v84.updated(0, v28)
    v50 = v50.updated(3, v29)
    var v165: Vector[Double] = v84
    val v136: Double = v165(2)
    v136
  }
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    var v16: Double = v1
    val v14: Double = f18(v16)
    val v94: Double = f18(v14)
    v94
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))))), Vector(s2(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))))))
    val v1: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}