import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[Double]]
  )
  case class s4 (
    p0: Double,
    p1: s0
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v4: s2 = v0
    val v6: Vector[Vector[Double]] = v4.p1
    val v2: s1 = v0.p0
    val v3: Vector[Vector[s0]] = v2.p0
    val v11: Vector[Vector[Double]] = v4.p1
    val v8: s1 = v4.p0
    val v12: Vector[Double] = v6(0)
    v4 = v4.copy(p1 = v11)
    val v9: Vector[s2] = Vector(v0, v0)
    var v15: Vector[Double] = v12
    v15 = v12
    val v14: s0 = v8.p1
    val v21: Double = v1 + v1
    val v18: Vector[s0] = v3(0)
    v4 = v4.copy(p0 = v8)
    v4 = v4.copy(p0 = v2)
    var v20: Vector[s0] = v18
    val v24: Double = v15(0)
    val v28: s2 = v9(0)
    val v29: Double = v15(0)
    val v30: s0 = v20(0)
    var v25: Double = v29
    val v23: Double = v25 * v21
    val v43: s1 = s1(v3, v30)
    v4 = v4.copy(p0 = v43)
    val v46: Vector[Double] = v11(0)
    val v57: Double = v1 / v25
    v15 = v46
    val v50: s1 = v28.p0
    v4 = v4.copy(p0 = v50)
    v25 = v24
    v15 = v15.updated(0, v23)
    val v67: s4 = s4(v57, v14)
    val v92: Double = v67.p0
    v92
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), Vector(Vector(8.0), Vector(9.0), Vector(10.0)))
    val v1: Double = 11.0
    val start = nanoTime()
    var result: Double = 11.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}