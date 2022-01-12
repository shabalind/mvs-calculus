import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  def f33(v0: Double): Double = {
    var v5: Double = v0
    var v7: Double = v5
    val v4: Vector[Double] = Vector(v5)
    v5 = v7
    var v2: Vector[Double] = v4
    var v3: Vector[Double] = v2
    var v16: Vector[Double] = v3
    var v8: Double = v0
    v3 = v3.updated(0, v8)
    v3 = v3.updated(0, v5)
    v2 = v2.updated(0, v7)
    v3 = v3.updated(0, v8)
    v16 = v16.updated(0, v0)
    v3 = v3.updated(0, v5)
    val v24: Double = v16(0)
    v3 = v3.updated(0, v24)
    v24
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v7: Double = f33(v1)
    val v9: Double = f33(v7)
    val v10: Double = f33(v1)
    val v13: Double = f33(v9)
    val v25: Double = f33(v13)
    val v24: Vector[Double] = Vector(v9)
    val v30: Double = v24(0)
    val v33: Double = v24(0)
    val v146: Vector[Double] = Vector(v25, v25, v10, v30, v33, v10)
    var v89: Vector[Double] = v146
    val v115: Double = v89(1)
    v115
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))
    val v1: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}