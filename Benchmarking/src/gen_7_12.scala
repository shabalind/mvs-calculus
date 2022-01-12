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
    p1: s1
  )
  case class s3 (
    p0: Vector[s0]
  )
  case class s4 (
    p0: s3,
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: Vector[s4], v1: s0, v2: Vector[s2], v3: Vector[s1], v4: Double): Double = {
    val v7: Vector[Vector[Double]] = v1.p1
    var v19: s0 = v1
    val v21: Vector[Vector[Double]] = v19.p1
    val v47: Vector[Vector[Double]] = v1.p0
    v19 = v19.copy(p1 = v7)
    val v43: Vector[Double] = v21(1)
    val v39: Double = v43(0)
    val v137: Vector[Double] = v47(0)
    var v116: Vector[Vector[Double]] = v21
    v19 = v19.copy(p1 = v116)
    v116 = v116.updated(1, v137)
    v116 = v116.updated(1, v43)
    v39
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s3(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))))), Vector(s1(Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))))), s4(s3(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), Vector(s1(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))))))
    val v1: s0 = s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))
    val v2: Vector[s2] = Vector(s2(s1(Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))))), s1(Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))))), s2(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))), s1(Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0)))))), s2(s1(Vector(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))), s1(Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))))))
    val v3: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))))))
    val v4: Double = 56.0
    val start = nanoTime()
    var result: Double = 56.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}