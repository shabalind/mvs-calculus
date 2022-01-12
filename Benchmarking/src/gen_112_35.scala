import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  def f38(v0: Double): Double = {
    var v6: Double = v0
    v6 = v0
    var v4: Double = v6
    var v3: Double = v4
    var v7: Double = v6
    var v1: Double = v3
    var v10: Double = v1
    val v8: Double = v6 * v10
    var v13: Double = v4
    v7 = v0
    var v18: Double = v8
    var v15: Double = v4
    var v2: Double = v1
    var v22: Double = v15
    var v12: Double = v1
    var v27: Double = v1
    var v30: Double = v8
    var v17: Double = v27
    var v31: Double = v13
    val v19: Double = v7 - v7
    v27 = v15
    var v40: Double = v12
    val v25: Vector[Double] = Vector(v40, v6, v10, v2, v30, v15)
    var v120: Vector[Double] = v25
    v120 = v120.updated(2, v18)
    v120 = v120.updated(1, v1)
    var v52: Vector[Double] = v25
    v15 = v3
    var v70: Vector[Double] = v52
    v70 = v70.updated(4, v31)
    v52 = v52.updated(5, v17)
    var v77: Vector[Double] = v70
    v52 = v52.updated(0, v17)
    v77 = v120
    v70 = v70.updated(2, v18)
    v70 = v70.updated(4, v18)
    v70 = v70.updated(1, v19)
    val v145: Double = v77(4)
    v70 = v70.updated(5, v22)
    v145
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v19: Double = f38(v1)
    val v33: Double = v19 * v1
    val v51: Double = f38(v33)
    v51
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))
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