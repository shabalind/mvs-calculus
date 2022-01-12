import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f42(v0: Double): Double = {
    var v4: Double = v0
    val v1: Double = v4 - v4
    var v6: Double = v4
    var v3: Double = v4
    var v9: Double = v4
    var v7: Double = v6
    var v5: Double = v3
    var v10: Double = v9
    var v11: Double = v0
    var v16: Double = v3
    var v8: Double = v10
    var v13: Double = v3
    var v21: Double = v11
    var v41: Double = v4
    val v19: Double = v16 - v7
    var v25: Double = v5
    var v70: Double = v41
    var v35: Double = v25
    var v23: Double = v1
    var v31: Double = v8
    var v53: Double = v31
    v4 = v53
    var v38: Double = v21
    val v51: Vector[Double] = Vector(v19)
    val v40: Vector[Vector[Double]] = Vector(v51)
    val v66: Vector[Double] = v40(0)
    var v43: Vector[Double] = v66
    val v45: Double = v43(0)
    var v60: Double = v38
    var v88: Vector[Double] = v43
    v88 = v88.updated(0, v9)
    v88 = v88.updated(0, v23)
    v43 = v88
    v88 = v88.updated(0, v13)
    val v36: Double = v35 * v45
    v7 = v70
    v88 = v88.updated(0, v60)
    v43 = v43.updated(0, v41)
    var v71: Double = v36
    v43 = v43.updated(0, v38)
    v71
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v7: Double = v1 * v1
    var v3: Double = v7
    val v5: Double = f42(v3)
    var v57: Double = v5
    v57
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))
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