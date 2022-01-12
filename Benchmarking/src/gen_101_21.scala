import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: s0
  )
  def f2(v0: Vector[Double]): Vector[Double] = {
    var v2: Vector[Double] = v0
    val v5: Double = v2(0)
    var v1: Double = v5
    val v3: Vector[Vector[Double]] = Vector(v0, v0)
    v2 = v2.updated(0, v1)
    v2 = v2.updated(0, v5)
    var v9: Double = v1
    var v6: Vector[Double] = v0
    v6 = v6.updated(0, v9)
    v6 = v6.updated(0, v1)
    var v8: Vector[Vector[Double]] = v3
    val v11: Double = v2(0)
    val v22: Vector[Vector[Double]] = Vector(v0, v6)
    var v21: Vector[Vector[Double]] = v3
    v2 = v2.updated(0, v1)
    v21 = v21.updated(0, v6)
    v8 = v8.updated(1, v0)
    v8 = v8.updated(1, v2)
    val v28: Vector[Double] = v22(1)
    var v48: Vector[Vector[Double]] = v8
    val v45: Vector[Double] = v48(0)
    v48 = v48.updated(0, v28)
    v2 = v2.updated(0, v11)
    v48 = v21
    v45
  }
  @noinline
  def f0(v0: Vector[s1], v1: Vector[Vector[s0]], v2: Double): Double = {
    val v5: s1 = v0(0)
    val v3: s0 = v5.p0
    val v14: Vector[Vector[Double]] = v3.p0
    val v49: Vector[Double] = v14(0)
    val v41: Vector[Double] = f2(v49)
    val v21: Vector[Double] = f2(v41)
    val v30: Double = v21(0)
    v30
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))))
    val v2: Double = 28.0
    val start = nanoTime()
    var result: Double = 28.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}