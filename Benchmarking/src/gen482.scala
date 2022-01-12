import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0],
    p2: Vector[s0],
    p3: s0,
    p4: Vector[s0],
    p5: s0,
    p6: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s3 (
    p0: s2,
    p1: s0
  )
  def f47(v0: s3, v1: s3): s3 = {
    val v4: s2 = v0.p0
    val v5: Vector[s0] = v4.p0
    var v7: s2 = v4
    val v6: s0 = v5(0)
    val v18: Vector[s0] = v7.p0
    v7 = v7.copy(p0 = v18)
    v7 = v7.copy(p0 = v5)
    val v56: s3 = s3(v7, v6)
    v56
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v5: s3 = f47(v0, v0)
    var v2: Double = v1
    val v7: Vector[s3] = Vector(v5)
    val v3: s3 = v7(0)
    val v11: s2 = v3.p0
    var v32: s2 = v11
    val v18: Double = v1 - v1
    val v24: Vector[s1] = v32.p1
    val v22: s1 = v24(0)
    val v37: Vector[s0] = v32.p0
    val v38: Double = v2 + v18
    v32 = v32.copy(p0 = v37)
    val v43: s0 = v22.p3
    val v63: Vector[Vector[Double]] = v43.p0
    v32 = v32.copy(p1 = v24)
    var v42: Vector[s0] = v37
    val v48: Vector[Double] = v63(2)
    val v36: Double = v48(0)
    v32 = v32.copy(p0 = v42)
    val v145: Double = v36 * v38
    v145
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))
    val v1: Double = 60.0
    val start = nanoTime()
    var result: Double = 60.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}