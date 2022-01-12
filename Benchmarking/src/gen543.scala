import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[Vector[s1]]
  )
  def f16(v0: s3): s3 = {
    var v3: s3 = v0
    var v1: s3 = v0
    var v8: s3 = v0
    var v6: s3 = v1
    var v7: s3 = v3
    val v5: Vector[s0] = v0.p0
    v1 = v1.copy(p0 = v5)
    v7 = v7.copy(p0 = v5)
    var v2: s3 = v1
    v1 = v1.copy(p0 = v5)
    v1 = v2
    v7 = v7.copy(p0 = v5)
    v1 = v1.copy(p0 = v5)
    val v20: Vector[s3] = Vector(v7, v1, v2, v2, v2, v8, v6)
    var v17: Vector[s0] = v5
    v17 = v5
    v8 = v8.copy(p0 = v17)
    val v33: Vector[Vector[s1]] = v3.p1
    val v67: s3 = v20(3)
    v7 = v7.copy(p1 = v33)
    v67
  }
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    val v5: s3 = v0(1)
    var v4: Double = v1
    val v8: s3 = f16(v5)
    val v20: Vector[s0] = v8.p0
    val v11: s0 = v20(2)
    val v41: Vector[Vector[Double]] = v11.p1
    val v14: Vector[Double] = v41(2)
    val v51: Double = v14(0)
    val v195: Double = v51 / v4
    v195
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))))))))), s3(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))), Vector(Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))))))))))
    val v1: Double = 56.0
    val start = nanoTime()
    var result: Double = 56.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}