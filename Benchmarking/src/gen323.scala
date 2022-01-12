import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: s0,
    p2: Vector[s0]
  )
  case class s3 (
    p0: Vector[s1],
    p1: s2,
    p2: Vector[s0]
  )
  def f52(v0: Double): Double = {
    var v6: Double = v0
    var v7: Double = v0
    val v2: Vector[Double] = Vector(v7)
    v7 = v6
    val v5: Double = v0 - v7
    var v3: Vector[Double] = v2
    var v4: Vector[Double] = v2
    v4 = v4.updated(0, v0)
    v6 = v7
    var v11: Vector[Double] = v4
    var v1: Double = v5
    var v8: Double = v5
    var v9: Double = v0
    var v13: Vector[Double] = v4
    v13 = v13.updated(0, v8)
    var v16: Vector[Double] = v13
    val v23: Vector[Vector[Double]] = Vector(v13, v2, v13, v11, v3)
    val v17: Vector[Double] = v23(2)
    var v18: Vector[Vector[Double]] = v23
    val v19: Double = v16(0)
    var v14: Vector[Double] = v11
    v11 = v11.updated(0, v1)
    var v15: Vector[Double] = v14
    val v27: Vector[Double] = v18(2)
    v18 = v18.updated(1, v27)
    v11 = v11.updated(0, v6)
    val v35: Double = v15(0)
    var v37: Vector[Vector[Double]] = v18
    val v78: Vector[Double] = v37(4)
    val v83: Double = v35 / v9
    v13 = v13.updated(0, v19)
    v11 = v78
    val v103: Double = v17(0)
    v13 = v13.updated(0, v83)
    v103
  }
  @noinline
  def f0(v0: Vector[s3], v1: s0, v2: Double): Double = {
    var v21: Double = v2
    val v40: Double = f52(v21)
    v21 = v2
    v40
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), Vector(Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0)))))), s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), Vector(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0)))))), s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), Vector(Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0))))))), s2(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0))))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0))))), s3(Vector(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), Vector(Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0)))))), s1(s0(Vector(Vector(28.0)), Vector(Vector(29.0))), Vector(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0)))))), s1(s0(Vector(Vector(32.0)), Vector(Vector(33.0))), Vector(Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0))))))), s2(s0(Vector(Vector(36.0)), Vector(Vector(37.0))), s0(Vector(Vector(38.0)), Vector(Vector(39.0))), Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0))))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0))), s0(Vector(Vector(46.0)), Vector(Vector(47.0))))))
    val v1: s0 = s0(Vector(Vector(48.0)), Vector(Vector(49.0)))
    val v2: Double = 50.0
    val start = nanoTime()
    var result: Double = 50.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}