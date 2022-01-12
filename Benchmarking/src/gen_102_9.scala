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
  def f19(v0: Double): Double = {
    var v7: Double = v0
    var v1: Double = v7
    var v5: Double = v1
    var v6: Double = v0
    var v2: Double = v5
    var v4: Double = v1
    var v10: Double = v1
    var v3: Double = v6
    val v12: Double = v1 / v5
    v5 = v10
    var v8: Double = v12
    var v27: Double = v8
    var v29: Double = v3
    var v23: Double = v8
    val v31: Vector[Double] = Vector(v27, v1, v4, v29, v1)
    var v36: Vector[Double] = v31
    val v40: Double = v31(0)
    v36 = v36.updated(4, v40)
    v36 = v36.updated(1, v1)
    val v41: Double = v36(4)
    val v63: Double = v41 + v2
    v36 = v36.updated(0, v23)
    v63
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v5: Double = f19(v1)
    val v7: Double = f19(v5)
    var v4: Double = v1
    val v9: Double = f19(v1)
    val v24: Double = f19(v7)
    val v47: Double = v24 + v9
    val v83: Double = v4 * v47
    v83
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))), Vector(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), Vector(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}