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
  def f0(v0: s1, v1: Double): Double = {
    val v4: s0 = v0.p1
    val v2: Vector[s0] = Vector(v4, v4, v4, v4, v4)
    val v6: s0 = v2(1)
    val v3: s0 = v2(0)
    val v7: s0 = v0.p1
    val v9: Vector[Vector[Double]] = v3.p1
    val v19: Vector[Vector[Double]] = v6.p1
    val v31: Vector[Double] = v19(1)
    val v15: Double = v31(0)
    val v45: Vector[Double] = v9(2)
    val v26: Double = v15 - v15
    val v40: Vector[Vector[Double]] = v7.p0
    val v51: Vector[Double] = v40(0)
    var v36: Vector[Double] = v31
    v36 = v36.updated(0, v26)
    val v68: Double = v51(0)
    v36 = v36.updated(0, v68)
    var v125: Double = v15
    var v72: Double = v125
    var v58: Vector[Double] = v45
    val v80: Double = v72 - v15
    var v59: Vector[Double] = v31
    val v91: Vector[Vector[Double]] = Vector(v58, v45, v45, v36)
    v36 = v59
    val v210: Vector[Double] = v91(2)
    var v123: Vector[Double] = v210
    v58 = v58.updated(0, v80)
    val v81: Double = v123(0)
    v81
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}