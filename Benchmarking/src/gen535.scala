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
    p1: s1
  )
  case class s3 (
    p0: s0,
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: s2, v1: s2, v2: s3, v3: Double): Double = {
    val v4: s0 = v2.p0
    val v8: s1 = v1.p1
    var v5: s1 = v8
    val v9: s0 = v8.p0
    v5 = v5.copy(p0 = v4)
    val v39: Vector[s1] = Vector(v5, v8, v5, v8)
    var v15: Vector[s1] = v39
    v15 = v15.updated(2, v5)
    val v25: s1 = v15(0)
    v5 = v5.copy(p1 = v9)
    val v19: s1 = v39(0)
    val v13: s0 = v25.p0
    val v46: Vector[Vector[Double]] = v13.p1
    v15 = v15.updated(3, v19)
    val v31: Vector[Double] = v46(0)
    val v65: Double = v31(0)
    v65
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))), s1(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))))
    val v1: s2 = s2(Vector(s1(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))), s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))))
    val v2: s3 = s3(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), Vector(s1(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))))))
    val v3: Double = 44.0
    val start = nanoTime()
    var result: Double = 44.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}