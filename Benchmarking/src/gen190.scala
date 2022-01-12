import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  case class s4 (
    p0: Vector[s3]
  )
  def f52(v0: Double): Double = {
    var v1: Double = v0
    var v6: Double = v0
    var v5: Double = v1
    val v7: Double = v5 / v0
    val v3: Vector[Double] = Vector(v1, v7, v6, v0, v1, v5, v0)
    var v13: Vector[Double] = v3
    var v15: Vector[Double] = v13
    v13 = v13.updated(1, v6)
    v13 = v13.updated(0, v6)
    val v10: Double = v15(0)
    var v18: Vector[Double] = v3
    var v23: Vector[Double] = v15
    v18 = v18.updated(0, v10)
    var v17: Vector[Double] = v23
    val v24: Double = v23(0)
    val v16: Vector[Vector[Double]] = Vector(v23, v18, v15, v13)
    v13 = v13.updated(5, v10)
    var v14: Vector[Double] = v13
    val v45: Vector[Double] = v16(1)
    val v20: Double = v15(6)
    val v33: Double = v14(0)
    val v28: Vector[Double] = v16(3)
    v18 = v18.updated(4, v33)
    var v40: Vector[Double] = v28
    val v37: Vector[Double] = v16(0)
    v14 = v14.updated(4, v24)
    var v70: Vector[Double] = v28
    val v39: Vector[Vector[Double]] = Vector(v70, v13, v40, v70, v45, v37, v17)
    val v32: Vector[Double] = v39(3)
    val v31: Double = v32(0)
    val v103: Double = v40(5)
    v40 = v40.updated(0, v20)
    val v77: Double = v3(2)
    v15 = v15.updated(5, v77)
    v15 = v15.updated(5, v103)
    v31
  }
  @noinline
  def f0(v0: s2, v1: Vector[s4], v2: Vector[s2], v3: Double): Double = {
    var v5: Double = v3
    var v10: Double = v5
    val v4: Double = f52(v10)
    v4
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))))
    val v1: Vector[s4] = Vector(s4(Vector(s3(s2(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), s2(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0)))))), s3(s2(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0))))), s2(s0(Vector(Vector(32.0)), Vector(Vector(33.0))), Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0))), s0(Vector(Vector(38.0)), Vector(Vector(39.0)))))))))
    val v2: Vector[s2] = Vector(s2(s0(Vector(Vector(40.0)), Vector(Vector(41.0))), Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0))), s0(Vector(Vector(46.0)), Vector(Vector(47.0))))))
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