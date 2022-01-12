import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s2,
    p1: Vector[Vector[Double]]
  )
  def f53(v0: s3): s3 = {
    v0
  }
  def f51(v0: Double): Double = {
    var v5: Double = v0
    var v1: Double = v5
    v1 = v5
    var v6: Double = v0
    var v3: Double = v1
    var v2: Double = v6
    var v9: Double = v6
    var v10: Double = v2
    val v18: Vector[Double] = Vector(v2, v0, v10, v3)
    val v13: Vector[Vector[Double]] = Vector(v18, v18, v18, v18, v18, v18)
    val v21: Vector[Double] = v13(2)
    v1 = v9
    val v58: Double = v21(3)
    v9 = v2
    v58
  }
  def f41(v0: s2): s2 = {
    val v5: s1 = v0.p0
    var v4: s2 = v0
    val v2: Vector[Vector[s0]] = v0.p1
    v4 = v4.copy(p0 = v5)
    val v7: Vector[s0] = v2(2)
    val v13: s0 = v5.p1
    v4 = v4.copy(p0 = v5)
    val v1: Vector[s0] = v2(2)
    val v9: Vector[Vector[s0]] = v4.p1
    val v11: s0 = v5.p1
    var v6: Vector[Vector[s0]] = v2
    val v8: Vector[s0] = v6(2)
    v4 = v4.copy(p1 = v6)
    v6 = v6.updated(2, v8)
    v6 = v9
    val v17: Vector[Vector[s0]] = v4.p1
    val v31: Vector[Vector[s0]] = v0.p1
    v4 = v4.copy(p1 = v31)
    v6 = v6.updated(1, v7)
    var v18: s0 = v11
    val v102: s1 = v0.p0
    var v104: s1 = v102
    v104 = v104.copy(p0 = v13)
    val v95: s2 = s2(v104, v17)
    v104 = v104.copy(p1 = v18)
    v6 = v6.updated(0, v1)
    val v149: Vector[Vector[Double]] = v18.p0
    v18 = v18.copy(p0 = v149)
    v95
  }
  def f39(v0: s3, v1: s2): s3 = {
    val v4: s2 = f41(v1)
    val v10: s2 = f41(v4)
    val v8: Vector[Vector[s0]] = v10.p1
    val v13: Vector[s0] = v8(1)
    val v16: s0 = v13(0)
    val v42: s3 = f53(v0)
    val v77: Vector[Vector[Double]] = v16.p0
    var v51: s3 = v42
    val v119: s3 = f53(v51)
    v51 = v51.copy(p1 = v77)
    v119
  }
  @noinline
  def f0(v0: s2, v1: Vector[s3], v2: Double): Double = {
    val v8: s3 = v1(1)
    val v6: s3 = v1(1)
    val v7: s3 = f39(v6, v0)
    val v9: s3 = f39(v7, v0)
    var v12: s3 = v8
    val v16: s3 = f39(v12, v0)
    val v23: Vector[Vector[Double]] = v16.p1
    v12 = v12.copy(p1 = v23)
    val v25: Vector[Double] = v23(0)
    val v18: Double = f51(v2)
    val v37: Double = v25(0)
    var v40: Vector[Double] = v25
    val v36: Vector[Vector[Double]] = v9.p1
    val v85: Double = v40(0)
    v12 = v12.copy(p1 = v36)
    val v122: Double = v37 / v85
    v40 = v40.updated(0, v18)
    v122
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(s0(Vector(Vector(0.0)), Vector(1.0, 2.0)), s0(Vector(Vector(3.0)), Vector(4.0, 5.0))), Vector(Vector(s0(Vector(Vector(6.0)), Vector(7.0, 8.0))), Vector(s0(Vector(Vector(9.0)), Vector(10.0, 11.0))), Vector(s0(Vector(Vector(12.0)), Vector(13.0, 14.0)))))
    val v1: Vector[s3] = Vector(s3(s2(s1(s0(Vector(Vector(15.0)), Vector(16.0, 17.0)), s0(Vector(Vector(18.0)), Vector(19.0, 20.0))), Vector(Vector(s0(Vector(Vector(21.0)), Vector(22.0, 23.0))), Vector(s0(Vector(Vector(24.0)), Vector(25.0, 26.0))), Vector(s0(Vector(Vector(27.0)), Vector(28.0, 29.0))))), Vector(Vector(30.0))), s3(s2(s1(s0(Vector(Vector(31.0)), Vector(32.0, 33.0)), s0(Vector(Vector(34.0)), Vector(35.0, 36.0))), Vector(Vector(s0(Vector(Vector(37.0)), Vector(38.0, 39.0))), Vector(s0(Vector(Vector(40.0)), Vector(41.0, 42.0))), Vector(s0(Vector(Vector(43.0)), Vector(44.0, 45.0))))), Vector(Vector(46.0))))
    val v2: Double = 47.0
    val start = nanoTime()
    var result: Double = 47.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}