import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[Double]],
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v5: Vector[Vector[Double]] = v0.p0
    var v4: Double = v1
    var v14: Vector[Vector[Double]] = v5
    val v3: Vector[Double] = v5(0)
    v14 = v14.updated(0, v3)
    v14 = v14.updated(0, v3)
    var v10: Vector[Vector[Double]] = v5
    val v19: Vector[Double] = v14(0)
    val v13: Vector[Vector[Double]] = v0.p0
    val v18: Double = v1 - v1
    val v20: Double = v19(0)
    val v17: Vector[Double] = v10(0)
    v10 = v10.updated(0, v17)
    val v44: Vector[Double] = v10(0)
    v10 = v10.updated(0, v3)
    v10 = v10.updated(0, v17)
    val v25: Vector[Double] = v13(0)
    v14 = v14.updated(0, v25)
    var v26: Vector[Double] = v44
    val v32: Double = v44(0)
    v14 = v14.updated(0, v25)
    v26 = v26.updated(0, v4)
    val v40: Double = v17(0)
    v14 = v14.updated(0, v17)
    var v34: Double = v32
    v26 = v26.updated(0, v34)
    v14 = v14.updated(0, v26)
    val v149: Double = v3(0)
    val v52: Double = v19(0)
    val v228: Vector[Double] = Vector(v40, v18, v149, v34, v52)
    v26 = v26.updated(0, v20)
    val v188: Double = v228(4)
    v188
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(0.0)), Vector(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0))), s0(Vector(Vector(7.0), Vector(8.0), Vector(9.0)))))
    val v1: Double = 10.0
    val start = nanoTime()
    var result: Double = 10.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}