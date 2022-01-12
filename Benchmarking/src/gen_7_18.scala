import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s3 (
    p0: s0,
    p1: s0
  )
  case class s5 (
    p0: s3,
    p1: Vector[Vector[Double]]
  )
  def f8(v0: Double): Double = {
    var v5: Double = v0
    v5 = v0
    val v4: Double = v0 / v5
    var v3: Double = v4
    var v7: Double = v3
    var v23: Double = v4
    var v2: Double = v23
    var v6: Double = v4
    var v10: Double = v4
    var v11: Double = v3
    var v16: Double = v23
    var v18: Double = v10
    val v13: Double = v2 * v6
    var v17: Double = v13
    v17 = v16
    var v21: Double = v11
    var v37: Double = v4
    val v39: Double = v3 + v6
    var v31: Double = v7
    v6 = v21
    var v45: Double = v39
    var v32: Double = v5
    var v60: Double = v0
    v11 = v3
    var v65: Double = v16
    val v58: Vector[Double] = Vector(v2, v60, v65)
    var v26: Vector[Double] = v58
    v26 = v26.updated(0, v3)
    v26 = v26.updated(2, v31)
    v26 = v26.updated(2, v32)
    v26 = v26.updated(1, v45)
    v26 = v26.updated(2, v37)
    v26 = v26.updated(1, v18)
    var v51: Vector[Double] = v26
    v26 = v26.updated(2, v17)
    v26 = v26.updated(1, v17)
    v26 = v26.updated(1, v17)
    val v81: Double = v51(0)
    v26 = v26.updated(2, v17)
    v81
  }
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    var v5: Double = v1
    val v4: Double = f8(v1)
    val v3: Double = f8(v4)
    val v37: Double = f8(v3)
    val v45: Double = v5 - v37
    v45
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), Vector(Vector(4.0), Vector(5.0), Vector(6.0))), s5(s3(s0(Vector(Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0)))), Vector(Vector(11.0), Vector(12.0), Vector(13.0))))
    val v1: Double = 14.0
    val start = nanoTime()
    var result: Double = 14.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}