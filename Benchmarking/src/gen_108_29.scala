import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: s1, v2: Double): Double = {
    var v6: Vector[Vector[s0]] = v0
    val v4: Vector[s0] = v6(0)
    val v7: s0 = v4(0)
    val v3: s0 = v4(0)
    val v9: Vector[Vector[Double]] = v3.p0
    val v26: Vector[s0] = v0(1)
    val v23: Vector[Double] = v9(0)
    val v29: Vector[Vector[Double]] = v7.p0
    var v42: Vector[Vector[Double]] = v29
    val v27: Vector[Double] = v42(0)
    var v46: Vector[Vector[Double]] = v42
    v6 = v6.updated(2, v4)
    v46 = v46.updated(2, v23)
    var v59: Vector[Double] = v27
    v42 = v42.updated(2, v59)
    val v78: Vector[Double] = v29(2)
    v46 = v46.updated(2, v78)
    val v93: Vector[Double] = v29(0)
    v46 = v46.updated(1, v93)
    val v178: Vector[Double] = v46(1)
    v6 = v6.updated(2, v26)
    val v183: Double = v178(0)
    v46 = v46.updated(2, v23)
    v183
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)))))
    val v1: s1 = s1(s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0))))
    val v2: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}