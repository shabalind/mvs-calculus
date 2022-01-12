import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s3 (
    p0: s2,
    p1: s1,
    p2: Vector[s1]
  )
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: Double): Double = {
    var v5: Vector[Vector[s3]] = v0
    val v3: Vector[s3] = v5(0)
    val v4: s3 = v3(0)
    val v6: s2 = v4.p0
    val v8: Vector[s0] = v6.p1
    val v2: s0 = v8(1)
    var v12: Vector[Vector[s3]] = v0
    v5 = v12
    v12 = v12.updated(0, v3)
    var v19: s0 = v2
    v5 = v5.updated(0, v3)
    val v29: s0 = v8(2)
    val v26: Vector[Vector[Double]] = v19.p0
    val v57: Vector[s3] = v12(0)
    v5 = v5.updated(0, v57)
    v19 = v19.copy(p0 = v26)
    val v74: Vector[Double] = v26(0)
    val v39: Double = v74(0)
    val v50: Vector[Vector[Double]] = v29.p1
    v19 = v19.copy(p1 = v50)
    v5 = v0
    v39
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))), Vector(s1(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))), s1(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))))))))
    val v1: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}