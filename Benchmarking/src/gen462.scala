import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  def f80(v0: Double): Double = {
    var v2: Double = v0
    val v7: Vector[Double] = Vector(v0, v2)
    var v6: Vector[Double] = v7
    val v3: Double = v7(1)
    var v1: Vector[Double] = v7
    v1 = v1.updated(0, v3)
    var v15: Double = v0
    val v14: Double = v7(0)
    var v5: Double = v2
    val v9: Double = v1(0)
    var v10: Double = v2
    var v8: Vector[Double] = v7
    val v11: Vector[Vector[Double]] = Vector(v7, v8, v8, v8, v6, v6)
    var v13: Double = v15
    val v16: Vector[Double] = v11(2)
    var v31: Double = v15
    var v25: Vector[Double] = v8
    val v28: Double = v25(1)
    val v32: Double = v14 - v10
    var v21: Double = v32
    var v18: Vector[Double] = v1
    var v23: Double = v28
    val v39: Double = v25(0)
    val v35: Double = v16(1)
    v15 = v10
    v5 = v13
    v8 = v8.updated(0, v14)
    val v27: Double = v18(1)
    var v76: Vector[Vector[Double]] = v11
    val v46: Vector[Double] = Vector(v15, v9, v0, v27, v27, v32, v39)
    var v59: Vector[Double] = v46
    val v74: Double = v8(1)
    val v83: Double = v31 - v2
    var v71: Double = v14
    var v54: Double = v35
    v1 = v1.updated(0, v9)
    var v112: Double = v74
    val v82: Double = v59(4)
    v8 = v8.updated(0, v54)
    v8 = v8.updated(0, v83)
    val v136: Vector[Double] = Vector(v32, v21, v112, v5, v27, v23, v82)
    val v149: Double = v136(4)
    v25 = v25.updated(1, v71)
    val v109: Vector[Double] = v76(5)
    v18 = v109
    v149
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v5: Double = f80(v1)
    val v18: Double = v1 * v5
    var v22: Double = v18
    val v61: Vector[Double] = Vector(v1, v5, v18, v22, v1, v18, v18)
    var v233: Vector[Double] = v61
    var v154: Vector[Double] = v233
    val v136: Double = v154(6)
    v136
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), Vector(s1(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))), Vector(s1(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))))
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