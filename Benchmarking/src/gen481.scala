import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[Vector[s1]]
  )
  case class s4 (
    p0: s2,
    p1: s0
  )
  def f39(v0: Double): Double = {
    var v1: Double = v0
    val v7: Double = v0 + v1
    var v8: Double = v1
    var v5: Double = v1
    var v3: Double = v1
    val v13: Double = v1 * v5
    var v9: Double = v0
    v5 = v8
    v3 = v8
    val v10: Vector[Double] = Vector(v7)
    var v11: Vector[Double] = v10
    v11 = v11.updated(0, v13)
    val v17: Double = v11(0)
    val v30: Double = v11(0)
    v11 = v11.updated(0, v30)
    v11 = v11.updated(0, v3)
    var v14: Double = v8
    var v16: Vector[Double] = v10
    v16 = v16.updated(0, v7)
    val v36: Double = v10(0)
    var v34: Double = v7
    var v24: Double = v9
    v16 = v16.updated(0, v14)
    v16 = v16.updated(0, v17)
    var v21: Double = v24
    val v70: Double = v16(0)
    var v46: Vector[Double] = v16
    val v59: Vector[Double] = Vector(v21, v30, v70, v1)
    val v37: Double = v46(0)
    v46 = v46.updated(0, v36)
    var v71: Vector[Double] = v59
    v16 = v16.updated(0, v36)
    var v31: Vector[Double] = v59
    var v55: Double = v24
    val v52: Double = v59(3)
    v11 = v11.updated(0, v37)
    val v26: Double = v71(3)
    v16 = v16.updated(0, v34)
    val v100: Vector[Vector[Double]] = Vector(v31, v59, v31)
    v46 = v46.updated(0, v52)
    v31 = v31.updated(3, v3)
    v71 = v71.updated(3, v3)
    v11 = v11.updated(0, v55)
    v16 = v16.updated(0, v13)
    val v128: Vector[Double] = v100(2)
    v46 = v46.updated(0, v26)
    val v136: Double = v128(0)
    v5 = v52
    v136
  }
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    val v13: Double = v1 / v1
    val v4: Double = f39(v13)
    var v76: Double = v4
    var v60: Double = v76
    v60
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), Vector(Vector(s1(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), Vector(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))))), Vector(s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))))), Vector(s1(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0)), Vector(Vector(26.0), Vector(27.0))))))))), s0(Vector(Vector(28.0)), Vector(Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))))
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