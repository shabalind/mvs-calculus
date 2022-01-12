import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: Vector[s1],
    p1: s0
  )
  @noinline
  def f0(v0: s2, v1: Vector[s0], v2: s2, v3: Vector[s3], v4: Double): Double = {
    val v5: Double = v4 * v4
    var v15: Double = v5
    val v6: Vector[Vector[s1]] = v0.p1
    val v16: Double = v5 * v15
    val v27: Vector[s1] = v6(0)
    val v24: Double = v5 + v16
    val v14: s1 = v27(0)
    var v34: Double = v16
    val v42: Double = v5 - v24
    var v127: Double = v34
    val v102: Double = v14.p0
    val v74: Double = v102 - v42
    val v159: Double = v127 + v74
    v159
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(0.0, s0(Vector(Vector(1.0)), Vector(Vector(2.0)))), Vector(Vector(s1(3.0, s0(Vector(Vector(4.0)), Vector(Vector(5.0))))), Vector(s1(6.0, s0(Vector(Vector(7.0)), Vector(Vector(8.0)))))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0))), s0(Vector(Vector(11.0)), Vector(Vector(12.0))))
    val v2: s2 = s2(s1(13.0, s0(Vector(Vector(14.0)), Vector(Vector(15.0)))), Vector(Vector(s1(16.0, s0(Vector(Vector(17.0)), Vector(Vector(18.0))))), Vector(s1(19.0, s0(Vector(Vector(20.0)), Vector(Vector(21.0)))))))
    val v3: Vector[s3] = Vector(s3(Vector(s1(22.0, s0(Vector(Vector(23.0)), Vector(Vector(24.0))))), s0(Vector(Vector(25.0)), Vector(Vector(26.0)))), s3(Vector(s1(27.0, s0(Vector(Vector(28.0)), Vector(Vector(29.0))))), s0(Vector(Vector(30.0)), Vector(Vector(31.0)))), s3(Vector(s1(32.0, s0(Vector(Vector(33.0)), Vector(Vector(34.0))))), s0(Vector(Vector(35.0)), Vector(Vector(36.0)))))
    val v4: Double = 37.0
    val start = nanoTime()
    var result: Double = 37.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}