import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s4 (
    p0: s1,
    p1: Vector[s1]
  )
  def f33(v0: s1): s1 = {
    var v4: s1 = v0
    var v8: s1 = v0
    val v6: Vector[s0] = v4.p1
    v8 = v8.copy(p1 = v6)
    var v3: Vector[s0] = v6
    val v5: Vector[s0] = v8.p1
    val v1: s0 = v5(0)
    val v7: Vector[s0] = v0.p1
    v3 = v7
    var v10: s0 = v1
    var v2: s0 = v1
    v3 = v3.updated(0, v10)
    v3 = v3.updated(0, v2)
    v4 = v4.copy(p1 = v3)
    v8 = v8.copy(p1 = v3)
    v8 = v8.copy(p1 = v5)
    v4 = v4.copy(p1 = v5)
    v8
  }
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    var v5: Double = v1
    val v10: s1 = v0.p0
    val v3: s1 = f33(v10)
    val v8: Vector[s0] = v3.p0
    val v9: s0 = v8(0)
    val v20: Vector[Vector[Double]] = v9.p1
    var v16: Double = v1
    val v23: Vector[Double] = v20(0)
    val v25: Double = v5 - v16
    var v53: Vector[Double] = v23
    v53 = v53.updated(0, v25)
    var v43: Double = v16
    val v120: Double = v53(0)
    v53 = v53.updated(0, v1)
    v53 = v53.updated(0, v43)
    v120
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))))), Vector(s1(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))))))
    val v1: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}