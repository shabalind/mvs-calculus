import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f12(v0: Double): Double = {
    val v2: Double = v0 + v0
    var v7: Double = v2
    val v4: Vector[Double] = Vector(v7, v0, v7)
    val v6: Double = v4(1)
    v7 = v0
    var v3: Double = v2
    val v5: Double = v4(2)
    var v8: Double = v5
    val v13: Double = v4(1)
    var v1: Vector[Double] = v4
    var v10: Vector[Double] = v4
    v1 = v1.updated(0, v7)
    v10 = v10.updated(1, v3)
    val v25: Double = v1(0)
    val v23: Vector[Double] = Vector(v6, v6, v7, v6, v13, v13, v6)
    var v18: Vector[Double] = v23
    val v9: Double = v23(1)
    val v19: Double = v6 / v25
    v1 = v1.updated(2, v6)
    v1 = v1.updated(1, v8)
    val v21: Double = v2 + v7
    var v37: Vector[Double] = v10
    val v73: Double = v10(0)
    v18 = v18.updated(6, v19)
    var v38: Vector[Double] = v23
    var v20: Vector[Double] = v18
    val v35: Double = v4(0)
    var v63: Vector[Double] = v20
    val v48: Double = v37(1)
    v18 = v18.updated(2, v21)
    var v52: Double = v6
    val v56: Double = v38(1)
    v18 = v18.updated(1, v35)
    v38 = v38.updated(6, v48)
    v1 = v1.updated(2, v52)
    v20 = v20.updated(4, v56)
    v3 = v73
    var v77: Vector[Double] = v38
    val v148: Double = v63(4)
    v63 = v63.updated(2, v8)
    v18 = v77
    v20 = v20.updated(5, v9)
    v148
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v21: Double = f12(v1)
    val v17: Double = f12(v21)
    v17
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))
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