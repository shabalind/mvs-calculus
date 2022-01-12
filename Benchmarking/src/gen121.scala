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
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: s2
  )
  def f80(v0: Vector[s0]): Vector[s0] = {
    val v2: Vector[Vector[s0]] = Vector(v0)
    var v8: Vector[Vector[s0]] = v2
    var v9: Vector[Vector[s0]] = v8
    val v38: Vector[s0] = v9(0)
    v9 = v8
    v8 = v8.updated(0, v0)
    v8 = v8.updated(0, v38)
    v9 = v8
    v8 = v8.updated(0, v0)
    val v49: Vector[s0] = v8(0)
    v49
  }
  def f57(v0: Double, v1: s1): Double = {
    val v5: Vector[s0] = v1.p1
    val v4: Vector[s0] = f80(v5)
    val v9: s0 = v5(0)
    val v13: s0 = v4(1)
    val v26: Vector[Vector[Double]] = v9.p0
    val v57: Vector[Vector[Double]] = v13.p0
    var v51: Vector[Vector[Double]] = v57
    val v43: Vector[Vector[Vector[Double]]] = Vector(v57, v51, v26, v51)
    val v124: Vector[Vector[Double]] = v43(2)
    val v82: Vector[Double] = v124(0)
    val v120: Double = v82(0)
    v120
  }
  @noinline
  def f0(v0: s1, v1: s3, v2: Double): Double = {
    val v3: Double = f57(v2, v0)
    var v7: Double = v2
    v7 = v3
    var v39: Double = v7
    v39
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))))
    val v1: s3 = s3(Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), s2(Vector(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))))
    val v2: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}