import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s7 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  def f13(v0: Double): Double = {
    var v1: Double = v0
    var v6: Double = v1
    var v7: Double = v6
    var v4: Double = v7
    val v5: Double = v4 / v4
    var v2: Double = v6
    var v8: Double = v6
    var v9: Double = v2
    val v13: Double = v4 + v2
    var v11: Double = v13
    val v15: Double = v11 / v11
    var v12: Double = v9
    var v14: Double = v9
    val v28: Vector[Double] = Vector(v14, v8, v13)
    var v24: Vector[Double] = v28
    var v22: Vector[Double] = v24
    val v26: Double = v9 * v15
    var v45: Double = v6
    v24 = v24.updated(2, v5)
    val v35: Double = v24(2)
    val v49: Double = v22(1)
    val v53: Vector[Double] = Vector(v26, v12, v5, v49, v45, v12)
    var v36: Vector[Double] = v53
    val v86: Double = v53(5)
    var v68: Vector[Double] = v53
    var v61: Vector[Double] = v68
    v68 = v68.updated(2, v86)
    val v124: Double = v53(5)
    v68 = v68.updated(0, v9)
    val v66: Double = v22(1)
    val v59: Double = v61(0)
    val v48: Double = v68(4)
    val v37: Double = v66 * v59
    val v30: Double = v36(1)
    var v60: Double = v35
    val v64: Vector[Double] = Vector(v60, v48)
    v68 = v61
    val v73: Double = v64(0)
    val v77: Double = v64(1)
    v22 = v22.updated(1, v77)
    v36 = v36.updated(2, v124)
    v61 = v61.updated(1, v49)
    v45 = v73
    v24 = v24.updated(1, v30)
    var v293: Double = v37
    v293
  }
  @noinline
  def f0(v0: Vector[Vector[s7]], v1: Double): Double = {
    var v5: Double = v1
    val v6: Double = f13(v1)
    val v2: Double = f13(v1)
    var v7: Double = v5
    v5 = v2
    var v8: Double = v6
    var v34: Double = v7
    v34 = v8
    val v87: Double = v34 / v5
    v87
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s7]] = Vector(Vector(s7(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), Vector(s1(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))))), Vector(s7(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))))), Vector(s7(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))), Vector(s1(Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))))))))
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