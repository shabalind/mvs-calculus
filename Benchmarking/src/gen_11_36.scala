import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0],
    p2: Vector[Vector[s0]],
    p3: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s0,
    p1: s0
  )
  case class s5 (
    p0: s1,
    p1: Vector[s3]
  )
  def f94(v0: Double): Double = {
    var v4: Double = v0
    var v1: Double = v0
    var v6: Double = v1
    var v7: Double = v1
    v7 = v1
    var v9: Double = v7
    var v3: Double = v1
    var v2: Double = v9
    var v5: Double = v4
    val v13: Vector[Double] = Vector(v9, v0, v4, v6)
    val v17: Vector[Vector[Double]] = Vector(v13, v13, v13)
    v3 = v0
    val v10: Vector[Double] = v17(0)
    val v14: Vector[Double] = v17(0)
    var v18: Vector[Double] = v14
    var v19: Vector[Double] = v10
    val v35: Double = v18(2)
    v19 = v19.updated(0, v3)
    val v30: Double = v14(0)
    val v41: Vector[Double] = Vector(v35, v2, v5)
    v18 = v18.updated(3, v30)
    val v32: Double = v19(2)
    v7 = v32
    val v92: Double = v41(1)
    v18 = v18.updated(3, v0)
    v92
  }
  @noinline
  def f0(v0: s0, v1: s5, v2: Double): Double = {
    val v4: Vector[Vector[Double]] = v0.p0
    val v20: Vector[Double] = v4(0)
    val v61: Double = v20(0)
    val v41: Double = v61 / v2
    val v76: Double = f94(v61)
    val v39: Double = v76 - v41
    v39
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(1.0, 2.0, 3.0))
    val v1: s5 = s5(s1(s0(Vector(Vector(4.0)), Vector(5.0, 6.0, 7.0)), Vector(s0(Vector(Vector(8.0)), Vector(9.0, 10.0, 11.0)), s0(Vector(Vector(12.0)), Vector(13.0, 14.0, 15.0))), Vector(Vector(s0(Vector(Vector(16.0)), Vector(17.0, 18.0, 19.0))), Vector(s0(Vector(Vector(20.0)), Vector(21.0, 22.0, 23.0)))), Vector(Vector(s0(Vector(Vector(24.0)), Vector(25.0, 26.0, 27.0))), Vector(s0(Vector(Vector(28.0)), Vector(29.0, 30.0, 31.0))), Vector(s0(Vector(Vector(32.0)), Vector(33.0, 34.0, 35.0))))), Vector(s3(s0(Vector(Vector(36.0)), Vector(37.0, 38.0, 39.0)), s0(Vector(Vector(40.0)), Vector(41.0, 42.0, 43.0))), s3(s0(Vector(Vector(44.0)), Vector(45.0, 46.0, 47.0)), s0(Vector(Vector(48.0)), Vector(49.0, 50.0, 51.0)))))
    val v2: Double = 52.0
    val start = nanoTime()
    var result: Double = 52.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}