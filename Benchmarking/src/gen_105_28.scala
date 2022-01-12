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
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v2: s2 = v0(0)
    val v8: s2 = v0(0)
    val v10: s0 = v2.p1
    val v17: s0 = v8.p1
    val v24: Vector[Vector[Double]] = v17.p0
    var v3: Vector[Vector[Double]] = v24
    val v16: Vector[Double] = v3(0)
    val v14: Vector[Double] = v3(0)
    val v9: Vector[Vector[Double]] = v10.p1
    val v15: Vector[Double] = v9(1)
    val v35: Vector[Double] = v3(0)
    val v50: Vector[Vector[Double]] = Vector(v15, v15, v35, v14, v16)
    val v49: Vector[Double] = v50(4)
    val v96: Double = v49(0)
    v96
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))))
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