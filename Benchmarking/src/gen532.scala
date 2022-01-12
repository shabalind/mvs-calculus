import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  case class s7 (
    p0: s0,
    p1: s0
  )
  case class s8 (
    p0: s4,
    p1: Vector[s7]
  )
  def f2(v0: Double): Double = {
    var v3: Double = v0
    var v6: Double = v3
    var v4: Double = v6
    var v7: Double = v0
    var v5: Double = v3
    var v11: Double = v0
    var v8: Double = v4
    val v2: Vector[Double] = Vector(v5, v3, v4, v8, v3, v7)
    val v1: Double = v11 * v8
    val v10: Double = v2(0)
    val v12: Double = v2(5)
    val v9: Double = v2(2)
    var v17: Double = v9
    val v16: Vector[Vector[Double]] = Vector(v2, v2)
    val v19: Vector[Double] = Vector(v12, v6, v17)
    var v43: Double = v1
    var v22: Vector[Double] = v2
    val v35: Vector[Double] = v16(1)
    val v20: Vector[Double] = v16(1)
    v22 = v22.updated(4, v12)
    var v25: Vector[Double] = v19
    val v37: Double = v25(2)
    var v34: Vector[Double] = v22
    var v61: Double = v1
    var v45: Double = v37
    var v40: Vector[Double] = v20
    var v76: Vector[Double] = v2
    var v39: Double = v43
    v34 = v22
    v76 = v35
    val v63: Double = v17 / v39
    val v50: Double = v34(3)
    v40 = v40.updated(2, v12)
    v34 = v34.updated(3, v3)
    val v67: Double = v76(2)
    val v83: Double = v50 / v67
    v22 = v22.updated(4, v63)
    v17 = v45
    v34 = v40
    val v131: Double = v83 / v10
    v5 = v0
    v40 = v40.updated(0, v61)
    v34 = v34.updated(1, v3)
    v131
  }
  @noinline
  def f0(v0: Vector[s8], v1: Double): Double = {
    var v3: Double = v1
    val v7: Double = f2(v1)
    val v5: Vector[Double] = Vector(v1, v7, v1, v1, v3)
    val v24: Double = v5(3)
    val v57: Double = f2(v3)
    v3 = v57
    v24
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(s4(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))), Vector(s7(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), s7(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))))), s8(s4(Vector(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0)))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))))), Vector(Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))))), Vector(s7(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), s7(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))))))
    val v1: Double = 80.0
    val start = nanoTime()
    var result: Double = 80.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}