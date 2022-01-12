import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s1,
    p1: Double
  )
  case class s4 (
    p0: s2,
    p1: s0
  )
  case class s5 (
    p0: s1,
    p1: Vector[Vector[s2]]
  )
  case class s6 (
    p0: s4,
    p1: Vector[s2]
  )
  case class s8 (
    p0: s6,
    p1: s5
  )
  @noinline
  def f0(v0: s3, v1: s8, v2: s2, v3: Double): Double = {
    val v11: Vector[Vector[s1]] = v2.p1
    val v14: Vector[s1] = v11(1)
    val v30: s1 = v14(0)
    val v13: s0 = v30.p0
    val v62: Vector[Vector[Double]] = v13.p0
    val v49: Vector[Double] = v62(0)
    val v126: Vector[Double] = v62(0)
    val v93: Double = v126(0)
    var v68: Vector[Double] = v49
    v68 = v68.updated(0, v93)
    val v106: Double = v68(0)
    v106
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s1(s0(Vector(Vector(0.0))), s0(Vector(Vector(1.0)))), 2.0)
    val v1: s8 = s8(s6(s4(s2(s1(s0(Vector(Vector(3.0))), s0(Vector(Vector(4.0)))), Vector(Vector(s1(s0(Vector(Vector(5.0))), s0(Vector(Vector(6.0))))), Vector(s1(s0(Vector(Vector(7.0))), s0(Vector(Vector(8.0))))))), s0(Vector(Vector(9.0)))), Vector(s2(s1(s0(Vector(Vector(10.0))), s0(Vector(Vector(11.0)))), Vector(Vector(s1(s0(Vector(Vector(12.0))), s0(Vector(Vector(13.0))))), Vector(s1(s0(Vector(Vector(14.0))), s0(Vector(Vector(15.0))))))), s2(s1(s0(Vector(Vector(16.0))), s0(Vector(Vector(17.0)))), Vector(Vector(s1(s0(Vector(Vector(18.0))), s0(Vector(Vector(19.0))))), Vector(s1(s0(Vector(Vector(20.0))), s0(Vector(Vector(21.0))))))), s2(s1(s0(Vector(Vector(22.0))), s0(Vector(Vector(23.0)))), Vector(Vector(s1(s0(Vector(Vector(24.0))), s0(Vector(Vector(25.0))))), Vector(s1(s0(Vector(Vector(26.0))), s0(Vector(Vector(27.0))))))))), s5(s1(s0(Vector(Vector(28.0))), s0(Vector(Vector(29.0)))), Vector(Vector(s2(s1(s0(Vector(Vector(30.0))), s0(Vector(Vector(31.0)))), Vector(Vector(s1(s0(Vector(Vector(32.0))), s0(Vector(Vector(33.0))))), Vector(s1(s0(Vector(Vector(34.0))), s0(Vector(Vector(35.0)))))))), Vector(s2(s1(s0(Vector(Vector(36.0))), s0(Vector(Vector(37.0)))), Vector(Vector(s1(s0(Vector(Vector(38.0))), s0(Vector(Vector(39.0))))), Vector(s1(s0(Vector(Vector(40.0))), s0(Vector(Vector(41.0)))))))))))
    val v2: s2 = s2(s1(s0(Vector(Vector(42.0))), s0(Vector(Vector(43.0)))), Vector(Vector(s1(s0(Vector(Vector(44.0))), s0(Vector(Vector(45.0))))), Vector(s1(s0(Vector(Vector(46.0))), s0(Vector(Vector(47.0)))))))
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