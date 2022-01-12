import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: Vector[s2], v1: Vector[s3], v2: s2, v3: Double): Double = {
    val v6: s1 = v2.p0
    val v8: Vector[s0] = v6.p0
    var v21: s2 = v2
    v21 = v21.copy(p0 = v6)
    val v25: s0 = v8(0)
    v21 = v21.copy(p1 = v25)
    var v18: s0 = v25
    v21 = v21.copy(p0 = v6)
    v21 = v21.copy(p0 = v6)
    var v29: s0 = v25
    v21 = v21.copy(p1 = v18)
    var v20: s0 = v25
    val v36: s0 = v2.p1
    v21 = v21.copy(p1 = v20)
    v21 = v21.copy(p1 = v29)
    val v38: Vector[Vector[Double]] = v36.p1
    val v69: s0 = v21.p1
    val v70: Vector[Vector[Double]] = v36.p1
    v20 = v20.copy(p1 = v38)
    val v86: Vector[Vector[Double]] = v69.p1
    val v93: Vector[Double] = v86(0)
    v18 = v18.copy(p1 = v70)
    val v116: Double = v93(0)
    v116
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))))
    val v1: Vector[s3] = Vector(s3(Vector(s1(Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))))), Vector(Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))))))
    val v2: s2 = s2(s1(Vector(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))
    val v3: Double = 48.0
    val start = nanoTime()
    var result: Double = 48.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}