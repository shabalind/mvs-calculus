import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: s2
  )
  case class s7 (
    p0: Vector[s4],
    p1: Vector[Vector[s2]]
  )
  def f98(v0: Double): Double = {
    var v3: Double = v0
    var v5: Double = v3
    var v2: Double = v5
    var v11: Double = v0
    var v1: Double = v2
    var v9: Double = v2
    var v10: Double = v11
    val v14: Vector[Double] = Vector(v9, v9, v10, v9, v3, v9)
    val v28: Vector[Vector[Double]] = Vector(v14)
    val v20: Vector[Double] = v28(0)
    v10 = v1
    v1 = v10
    val v21: Double = v14(1)
    val v26: Vector[Double] = v28(0)
    val v22: Vector[Double] = v28(0)
    var v34: Double = v9
    val v23: Double = v20(4)
    v10 = v23
    var v16: Vector[Vector[Double]] = v28
    v16 = v16.updated(0, v26)
    val v36: Vector[Double] = Vector(v21, v21, v0, v34, v3)
    val v58: Vector[Double] = Vector(v5)
    val v50: Vector[Double] = v28(0)
    val v25: Double = v58(0)
    val v35: Vector[Double] = v28(0)
    v16 = v16.updated(0, v35)
    var v120: Vector[Double] = v36
    var v59: Vector[Double] = v120
    val v117: Vector[Double] = v16(0)
    v59 = v59.updated(0, v23)
    v16 = v16.updated(0, v22)
    v16 = v16.updated(0, v26)
    val v68: Double = v120(0)
    var v83: Vector[Double] = v117
    v83 = v83.updated(2, v68)
    v120 = v59
    v83 = v83.updated(0, v25)
    v83 = v50
    val v175: Double = v83(0)
    v175
  }
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    var v2: Double = v1
    val v6: Double = f98(v2)
    var v24: Double = v6
    val v15: Double = f98(v24)
    v15
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(Vector(s4(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))))), s2(Vector(Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))))), s4(Vector(Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), s2(Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))))), Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), Vector(s2(Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))))), s7(Vector(s4(Vector(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))))), s2(Vector(Vector(s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))))), s4(Vector(Vector(s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))))), s2(Vector(Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))))), Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))))), Vector(s2(Vector(Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))))), s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))))), s7(Vector(s4(Vector(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))))), s2(Vector(Vector(s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))))), s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))))), s4(Vector(Vector(s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))), s2(Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))))), s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0)))))), Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))))), s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0))))), Vector(s2(Vector(Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0))))), s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0))))))))
    val v1: Double = 90.0
    val start = nanoTime()
    var result: Double = 90.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}