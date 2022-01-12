import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f30(v0: Double): Double = {
    var v6: Double = v0
    val v3: Double = v6 * v0
    val v4: Double = v6 * v3
    var v2: Double = v6
    var v1: Double = v2
    var v7: Double = v3
    var v15: Double = v4
    val v21: Vector[Double] = Vector(v15, v4)
    var v22: Vector[Double] = v21
    v22 = v22.updated(1, v7)
    v22 = v22.updated(0, v0)
    v22 = v22.updated(0, v1)
    val v13: Double = v22(0)
    v6 = v7
    v13
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v4: Double = f30(v1)
    val v12: Double = f30(v1)
    val v7: Double = f30(v1)
    var v19: Double = v1
    var v51: Double = v12
    val v30: Double = f30(v51)
    val v38: Vector[Double] = Vector(v51, v4, v19, v1, v30, v7)
    val v49: Double = v38(5)
    v51 = v1
    var v56: Vector[Double] = v38
    val v61: Double = f30(v1)
    v56 = v56.updated(3, v49)
    v56 = v56.updated(3, v61)
    var v74: Vector[Double] = v56
    val v96: Double = v74(1)
    v74 = v74.updated(1, v7)
    v96
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))
    val v1: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}