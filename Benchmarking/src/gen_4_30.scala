import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: s1
  )
  case class s9 (
    p0: s1,
    p1: Vector[Vector[s3]]
  )
  def f47(v0: Double): Double = {
    val v5: Double = v0 / v0
    var v3: Double = v5
    var v13: Double = v3
    v3 = v5
    var v10: Double = v13
    var v1: Double = v10
    var v14: Double = v1
    var v21: Double = v14
    var v20: Double = v21
    v20
  }
  def f15(v0: Double): Double = {
    val v4: Double = v0 / v0
    val v1: Double = f47(v4)
    val v2: Vector[Double] = Vector(v1, v1, v4, v4)
    val v5: Double = f47(v0)
    var v8: Double = v1
    var v7: Vector[Double] = v2
    val v6: Double = v7(2)
    v7 = v7.updated(2, v1)
    v7 = v7.updated(2, v4)
    val v9: Double = v2(2)
    var v12: Vector[Double] = v2
    val v14: Double = f47(v9)
    val v10: Double = f47(v0)
    var v11: Vector[Double] = v12
    val v18: Double = v7(1)
    var v21: Vector[Double] = v11
    val v28: Double = v7(3)
    var v16: Double = v6
    val v22: Double = v5 + v4
    val v35: Double = f47(v22)
    var v19: Double = v18
    v16 = v35
    v12 = v12.updated(3, v6)
    v12 = v12.updated(3, v19)
    val v36: Vector[Double] = Vector(v35, v6, v10, v16)
    v12 = v12.updated(2, v22)
    var v39: Vector[Double] = v36
    val v40: Double = f47(v28)
    v12 = v12.updated(1, v5)
    val v30: Double = v39(0)
    val v29: Double = v21(3)
    val v41: Vector[Vector[Double]] = Vector(v36, v39, v11, v2, v39)
    v21 = v12
    val v57: Double = v21(3)
    var v55: Vector[Vector[Double]] = v41
    var v83: Double = v8
    v11 = v11.updated(0, v5)
    var v54: Vector[Vector[Double]] = v55
    v7 = v7.updated(2, v57)
    val v47: Double = f47(v83)
    v55 = v54
    v11 = v11.updated(2, v29)
    val v95: Double = v30 * v4
    v21 = v21.updated(2, v28)
    v39 = v39.updated(2, v14)
    val v34: Vector[Double] = v54(1)
    v11 = v11.updated(3, v47)
    var v77: Double = v40
    v21 = v21.updated(2, v77)
    v12 = v12.updated(2, v30)
    val v66: Double = v34(3)
    v7 = v7.updated(0, v95)
    v66
  }
  @noinline
  def f0(v0: s9, v1: Double): Double = {
    val v6: s1 = v0.p0
    val v7: s0 = v6.p1
    var v18: Double = v1
    val v21: Vector[Vector[Double]] = v7.p0
    val v47: Vector[Double] = v21(0)
    val v74: Double = v47(0)
    val v117: Double = f15(v74)
    val v129: Double = f47(v18)
    val v146: Double = v117 / v129
    v146
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(Vector(s3(s2(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))))))))
    val v1: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}