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
    p0: s0,
    p1: s1
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s7 (
    p0: Vector[s3],
    p1: s1,
    p2: Vector[s2]
  )
  def f4(v0: Double): Double = {
    var v5: Double = v0
    var v1: Double = v5
    var v2: Double = v5
    var v4: Double = v5
    val v10: Vector[Double] = Vector(v2, v2, v4, v0, v4)
    var v9: Double = v1
    var v6: Double = v9
    var v3: Vector[Double] = v10
    v5 = v6
    val v15: Double = v3(0)
    var v26: Vector[Double] = v3
    v26 = v10
    v26 = v26.updated(3, v15)
    val v63: Double = v26(0)
    v3 = v26
    var v66: Double = v63
    v66
  }
  @noinline
  def f0(v0: s7, v1: s1, v2: Double): Double = {
    val v8: Double = f4(v2)
    val v5: Double = f4(v8)
    val v9: Double = f4(v8)
    val v25: Double = v5 - v9
    val v44: Double = v8 * v25
    v44
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(Vector(s3(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), Vector(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))))), s3(Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)))), Vector(Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))))), s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), Vector(s2(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))), s1(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0))))), s2(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))), s1(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0))), s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))))))
    val v1: s1 = s1(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0))), s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0))))
    val v2: Double = 66.0
    val start = nanoTime()
    var result: Double = 66.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}