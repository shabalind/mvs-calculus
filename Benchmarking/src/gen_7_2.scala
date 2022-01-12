import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0,
    p2: Vector[s0],
    p3: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s1
  )
  case class s3 (
    p0: s1,
    p1: s2
  )
  def f17(v0: s1): s1 = {
    var v3: s1 = v0
    val v2: s0 = v3.p1
    val v1: s0 = v0.p1
    var v12: s0 = v2
    var v5: s1 = v3
    v3 = v3.copy(p1 = v1)
    var v9: s0 = v2
    v5 = v5.copy(p3 = v1)
    v9 = v12
    val v7: Double = v2.p0
    v12 = v12.copy(p0 = v7)
    v3 = v3.copy(p1 = v9)
    v5 = v0
    v5
  }
  def f6(v0: s3): s3 = {
    val v2: Vector[s3] = Vector(v0, v0, v0, v0, v0)
    var v4: s3 = v0
    val v1: s3 = v2(2)
    val v5: s1 = v4.p0
    val v3: s2 = v1.p1
    val v7: s1 = f17(v5)
    v4 = v0
    val v13: s1 = v3.p1
    v4 = v4.copy(p0 = v7)
    val v19: s1 = f17(v5)
    val v29: s1 = f17(v19)
    val v40: Vector[s1] = v3.p0
    val v43: s2 = s2(v40, v29)
    v4 = v4.copy(p0 = v13)
    val v70: s1 = v43.p1
    v4 = v4.copy(p0 = v70)
    var v67: s3 = v4
    v67
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    var v3: s3 = v0
    val v2: s3 = f6(v3)
    val v7: s1 = v2.p0
    v3 = v3.copy(p0 = v7)
    val v4: s1 = f17(v7)
    val v8: s2 = v0.p1
    val v6: s3 = s3(v7, v8)
    v3 = v3.copy(p0 = v7)
    v3 = v3.copy(p1 = v8)
    val v10: s2 = v6.p1
    val v30: s1 = v8.p1
    v3 = v3.copy(p1 = v8)
    val v25: Vector[s0] = v4.p2
    val v46: s0 = v25(0)
    v3 = v3.copy(p0 = v4)
    v3 = v3.copy(p1 = v10)
    v3 = v3.copy(p0 = v30)
    val v83: Double = v46.p0
    v83
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s1(Vector(Vector(s0(0.0, Vector(Vector(1.0))))), s0(2.0, Vector(Vector(3.0))), Vector(s0(4.0, Vector(Vector(5.0))), s0(6.0, Vector(Vector(7.0))), s0(8.0, Vector(Vector(9.0)))), s0(10.0, Vector(Vector(11.0)))), s2(Vector(s1(Vector(Vector(s0(12.0, Vector(Vector(13.0))))), s0(14.0, Vector(Vector(15.0))), Vector(s0(16.0, Vector(Vector(17.0))), s0(18.0, Vector(Vector(19.0))), s0(20.0, Vector(Vector(21.0)))), s0(22.0, Vector(Vector(23.0)))), s1(Vector(Vector(s0(24.0, Vector(Vector(25.0))))), s0(26.0, Vector(Vector(27.0))), Vector(s0(28.0, Vector(Vector(29.0))), s0(30.0, Vector(Vector(31.0))), s0(32.0, Vector(Vector(33.0)))), s0(34.0, Vector(Vector(35.0)))), s1(Vector(Vector(s0(36.0, Vector(Vector(37.0))))), s0(38.0, Vector(Vector(39.0))), Vector(s0(40.0, Vector(Vector(41.0))), s0(42.0, Vector(Vector(43.0))), s0(44.0, Vector(Vector(45.0)))), s0(46.0, Vector(Vector(47.0))))), s1(Vector(Vector(s0(48.0, Vector(Vector(49.0))))), s0(50.0, Vector(Vector(51.0))), Vector(s0(52.0, Vector(Vector(53.0))), s0(54.0, Vector(Vector(55.0))), s0(56.0, Vector(Vector(57.0)))), s0(58.0, Vector(Vector(59.0))))))
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