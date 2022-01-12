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
    p0: s0,
    p1: s1
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: Vector[s0]
  )
  def f19(v0: s3, v1: s3, v2: s3): s3 = {
    val v6: Vector[Vector[s1]] = v2.p0
    var v4: s3 = v0
    v4 = v4.copy(p0 = v6)
    v4 = v0
    v4
  }
  def f9(v0: s3, v1: Vector[s3]): s3 = {
    v0
  }
  @noinline
  def f0(v0: Vector[s2], v1: Vector[Vector[s3]], v2: Double): Double = {
    val v4: Vector[s3] = v1(1)
    var v5: Double = v2
    val v8: s3 = v4(0)
    var v9: Double = v5
    val v10: s3 = f19(v8, v8, v8)
    val v15: s3 = f9(v10, v4)
    val v11: Vector[s0] = v15.p1
    val v34: s0 = v11(1)
    val v40: Vector[Vector[Double]] = v34.p0
    var v24: Double = v5
    val v22: Vector[Double] = v40(1)
    val v43: Double = v22(0)
    v9 = v2
    val v29: Double = v24 - v2
    val v118: Double = v43 + v29
    v5 = v9
    v118
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s1(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))))))
    val v1: Vector[Vector[s3]] = Vector(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))))))), Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))))))), Vector(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))))))
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