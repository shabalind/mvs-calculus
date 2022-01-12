import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v4: Vector[Vector[s0]] = v0.p1
    val v6: Vector[s0] = v4(0)
    val v3: s0 = v0.p0
    val v9: s0 = v6(0)
    var v11: s0 = v9
    val v16: Vector[Vector[Double]] = v3.p1
    val v21: Vector[Vector[Double]] = v11.p0
    val v13: Vector[Double] = v16(1)
    val v25: Vector[Vector[Double]] = v11.p0
    val v19: s0 = v0.p0
    var v51: Vector[Vector[Double]] = v16
    var v29: Vector[Vector[Double]] = v51
    val v40: Double = v13(0)
    var v36: Vector[Vector[Double]] = v51
    val v35: Vector[Vector[Double]] = v19.p0
    val v39: Vector[Double] = v29(0)
    val v50: Double = v13(0)
    var v41: Vector[Double] = v13
    v41 = v41.updated(0, v40)
    var v44: Vector[Double] = v41
    v11 = v11.copy(p1 = v36)
    v44 = v39
    val v27: Vector[Double] = v29(2)
    v41 = v41.updated(0, v50)
    v36 = v36.updated(2, v39)
    val v46: Vector[Double] = v25(1)
    val v97: Vector[Double] = v35(1)
    val v31: Double = v50 * v50
    var v115: Vector[Vector[Double]] = v21
    v11 = v11.copy(p1 = v51)
    v44 = v97
    v36 = v36.updated(0, v97)
    val v126: Vector[Double] = v25(1)
    v29 = v29.updated(0, v44)
    val v80: Double = v27(0)
    var v134: Double = v31
    v11 = v11.copy(p0 = v115)
    val v200: Double = v126(0)
    v134 = v80
    v115 = v115.updated(1, v46)
    val v76: Double = v200 * v134
    v76
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))))
    val v1: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}