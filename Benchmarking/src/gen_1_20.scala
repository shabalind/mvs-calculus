import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0,
    p2: s0,
    p3: s0,
    p4: Vector[s0]
  )
  case class s3 (
    p0: s0
  )
  @noinline
  def f0(v0: Vector[s1], v1: s3, v2: Double): Double = {
    val v3: s1 = v0(0)
    val v8: s0 = v3.p3
    val v24: Vector[Vector[Double]] = v8.p1
    val v32: Vector[Vector[Double]] = v8.p1
    val v30: Vector[Vector[Double]] = v8.p0
    val v14: Vector[Double] = v24(0)
    val v37: Vector[Double] = v32(2)
    var v47: Vector[Vector[Double]] = v24
    var v83: Vector[Vector[Double]] = v47
    v47 = v47.updated(0, v14)
    var v35: Vector[Vector[Double]] = v30
    v83 = v83.updated(1, v37)
    v35 = v35.updated(0, v37)
    v35 = v35.updated(0, v37)
    v35 = v35.updated(0, v37)
    val v53: Vector[Double] = v35(0)
    val v77: Double = v53(0)
    val v139: Vector[Double] = v83(1)
    v35 = v35.updated(0, v139)
    v77
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), s1(Vector(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), s1(Vector(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))
    val v1: s3 = s3(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))))
    val v2: Double = 64.0
    val start = nanoTime()
    var result: Double = 64.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}