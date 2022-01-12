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
    p0: s2,
    p1: s1
  )
  @noinline
  def f0(v0: Vector[s3], v1: Vector[s0], v2: s0, v3: Vector[Vector[s2]], v4: Double): Double = {
    val v8: Vector[Vector[Double]] = v2.p1
    val v6: Vector[Double] = v8(1)
    val v9: Double = v6(0)
    val v20: Vector[Vector[Double]] = v2.p1
    val v33: Vector[Double] = Vector(v9, v4, v4, v9, v4, v4, v9)
    var v24: Vector[Double] = v33
    val v43: Vector[Double] = v20(1)
    val v15: Double = v43(0)
    var v53: Vector[Double] = v6
    val v40: Double = v53(0)
    v24 = v24.updated(0, v40)
    val v105: Double = v24(0)
    v53 = v53.updated(0, v15)
    v105
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s1(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))))
    val v2: s0 = s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))
    val v3: Vector[Vector[s2]] = Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))))), s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))))))
    val v4: Double = 70.0
    val start = nanoTime()
    var result: Double = 70.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}