import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0],
    p2: Vector[s1],
    p3: s1
  )
  case class s3 (
    p0: s0,
    p1: Vector[s1]
  )
  def f115(v0: s3, v1: s0): s3 = {
    var v3: s3 = v0
    val v6: Vector[Vector[Double]] = v1.p0
    val v2: Vector[Double] = v6(1)
    val v8: Vector[Vector[Double]] = v1.p1
    v3 = v3.copy(p0 = v1)
    val v5: Vector[Vector[Double]] = v1.p0
    var v11: Vector[Vector[Double]] = v5
    val v9: Vector[Double] = v11(0)
    v11 = v11.updated(0, v2)
    val v34: s0 = v0.p0
    var v17: Vector[Vector[Double]] = v8
    v3 = v3.copy(p0 = v1)
    val v25: Vector[Vector[Double]] = v34.p0
    v17 = v17.updated(0, v9)
    v3 = v3.copy(p0 = v34)
    v3 = v3.copy(p0 = v34)
    val v43: s0 = s0(v25, v17)
    v11 = v11.updated(1, v9)
    var v49: s3 = v3
    v49 = v49.copy(p0 = v43)
    v49
  }
  @noinline
  def f0(v0: s3, v1: s2, v2: Double): Double = {
    val v3: s0 = v0.p0
    val v7: s3 = f115(v0, v3)
    val v8: Vector[s1] = v7.p1
    val v14: s1 = v8(1)
    val v13: Vector[s0] = v14.p0
    val v18: s0 = v13(0)
    val v51: Vector[Vector[Double]] = v18.p0
    val v60: Vector[Double] = v51(0)
    val v41: Double = v60(0)
    v41
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), Vector(s1(Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))))), s1(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))))))
    val v1: s2 = s2(s1(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))), Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)))), Vector(s1(Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))))), s1(Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)))))), s1(Vector(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))))))
    val v2: Double = 45.0
    val start = nanoTime()
    var result: Double = 45.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}