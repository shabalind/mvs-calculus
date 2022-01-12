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
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s1],
    p1: s0
  )
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v2: Vector[s1] = v0.p0
    val v3: s1 = v2(0)
    val v7: Vector[s0] = v3.p0
    val v11: s0 = v7(0)
    val v12: s0 = v7(0)
    val v18: Vector[Vector[Double]] = v11.p1
    var v43: Double = v1
    val v34: Vector[Double] = v18(0)
    val v14: Vector[Vector[Double]] = v12.p0
    val v60: Double = v43 - v43
    val v58: Vector[Vector[Vector[Double]]] = Vector(v14, v14, v14, v14, v14, v14)
    val v61: Vector[Vector[Double]] = v58(2)
    var v36: Double = v60
    val v56: Double = v34(0)
    val v53: Vector[Double] = v61(1)
    v43 = v56
    v43 = v36
    val v180: Double = v53(0)
    val v112: Double = v60 + v180
    v112
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))
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