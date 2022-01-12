import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  def f23(v0: Double): Double = {
    var v7: Double = v0
    var v5: Double = v0
    var v2: Double = v5
    var v1: Double = v2
    var v6: Double = v7
    val v4: Double = v6 / v7
    var v8: Double = v4
    var v19: Double = v4
    v6 = v1
    val v15: Double = v8 / v19
    val v9: Vector[Double] = Vector(v1, v6, v15, v19, v8, v1, v0)
    var v35: Vector[Double] = v9
    val v13: Double = v35(1)
    val v25: Vector[Double] = Vector(v1)
    val v31: Double = v25(0)
    val v24: Vector[Vector[Double]] = Vector(v35, v35)
    v35 = v35.updated(6, v13)
    val v49: Vector[Double] = v24(1)
    var v12: Vector[Double] = v25
    v35 = v35.updated(5, v4)
    val v75: Double = v12(0)
    val v43: Double = v49(1)
    v7 = v31
    v35 = v35.updated(3, v75)
    v43
  }
  @noinline
  def f0(v0: Vector[s1], v1: s0, v2: Double): Double = {
    var v36: Double = v2
    var v22: Double = v36
    val v15: Double = f23(v2)
    val v40: Double = f23(v15)
    val v25: Double = f23(v40)
    val v28: Double = v2 / v22
    val v42: Double = v28 + v25
    v36 = v28
    v42
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))))
    val v1: s0 = s0(Vector(Vector(4.0)), Vector(Vector(5.0)))
    val v2: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}