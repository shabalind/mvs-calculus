import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v7: s1 = v0(1)
    val v3: s1 = v0(0)
    var v5: Vector[s1] = v0
    val v6: s1 = v5(1)
    v5 = v5.updated(1, v3)
    var v8: Vector[s1] = v0
    v8 = v8.updated(1, v6)
    val v21: s1 = v8(0)
    v8 = v8.updated(1, v7)
    v5 = v5.updated(1, v6)
    val v12: s1 = v5(1)
    val v17: s0 = v21.p0
    val v10: Vector[Double] = Vector(v1)
    val v27: s1 = v0(0)
    val v20: Vector[Vector[Double]] = v17.p0
    var v25: s1 = v27
    val v29: Vector[Vector[Double]] = v17.p0
    val v32: s0 = v12.p1
    val v36: s0 = v12.p0
    v25 = v25.copy(p0 = v36)
    var v30: Vector[Vector[Double]] = v29
    val v39: s0 = s0(v30, v30)
    v25 = v25.copy(p0 = v39)
    val v93: Vector[Double] = v20(1)
    var v59: Vector[Vector[Double]] = v30
    var v84: s1 = v25
    v30 = v30.updated(0, v93)
    val v72: Vector[Double] = v59(0)
    v84 = v7
    v84 = v84.copy(p0 = v32)
    v59 = v59.updated(0, v10)
    var v52: Vector[Double] = v72
    v5 = v5.updated(1, v84)
    v30 = v30.updated(1, v72)
    v30 = v30.updated(0, v93)
    val v138: Double = v52(0)
    v138
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), s1(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))))
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