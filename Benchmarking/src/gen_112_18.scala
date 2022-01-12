import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s1]
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  def f19(v0: Double, v1: s1): Double = {
    val v6: Vector[s0] = v1.p1
    val v4: s0 = v6(0)
    val v17: Vector[Vector[Double]] = v4.p1
    val v18: Vector[Double] = v17(1)
    val v36: Double = v18(0)
    var v72: Double = v36
    v72
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v6: s2 = v0.p0
    var v3: s2 = v6
    var v11: s2 = v3
    var v10: s2 = v11
    var v8: Double = v1
    val v2: Vector[s1] = v3.p0
    val v7: s2 = v0.p0
    var v21: s3 = v0
    val v9: s1 = v2(0)
    val v20: Vector[s1] = v11.p1
    v21 = v21.copy(p0 = v3)
    v10 = v10.copy(p1 = v2)
    val v23: s1 = v2(0)
    val v25: Double = f19(v1, v9)
    val v41: Double = f19(v25, v23)
    val v26: Double = v41 - v1
    v3 = v7
    val v30: s1 = v2(0)
    v21 = v21.copy(p1 = v10)
    v10 = v10.copy(p0 = v20)
    var v35: Vector[s1] = v20
    val v34: s2 = v21.p1
    v3 = v3.copy(p0 = v35)
    v11 = v11.copy(p0 = v20)
    v21 = v0
    val v45: Double = v26 * v8
    val v63: s2 = v0.p1
    val v230: Vector[s1] = v34.p0
    v3 = v3.copy(p0 = v230)
    val v87: Vector[s1] = v63.p0
    val v156: Double = f19(v45, v30)
    v3 = v3.copy(p1 = v87)
    v156
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))))), Vector(s1(Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))), s2(Vector(s1(Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))), Vector(s1(Vector(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))))), Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))))))
    val v1: Double = 48.0
    val start = nanoTime()
    var result: Double = 48.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}