import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f39(v0: Double): Double = {
    var v6: Double = v0
    var v3: Double = v0
    var v1: Double = v3
    var v2: Double = v0
    var v5: Double = v6
    var v4: Double = v5
    v5 = v4
    val v9: Vector[Double] = Vector(v2, v0)
    v1 = v6
    v2 = v1
    val v10: Vector[Vector[Double]] = Vector(v9, v9, v9, v9, v9, v9)
    var v15: Double = v4
    val v33: Vector[Double] = v10(5)
    var v20: Double = v1
    var v40: Double = v15
    val v90: Double = v33(1)
    val v58: Double = v90 + v20
    var v115: Double = v40
    val v192: Vector[Double] = Vector(v58, v115, v0, v58)
    var v216: Vector[Double] = v192
    var v155: Vector[Double] = v216
    var v131: Vector[Double] = v155
    var v110: Vector[Double] = v131
    val v187: Double = v110(3)
    v187
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    var v8: Double = v1
    val v4: Double = f39(v1)
    val v11: Double = f39(v4)
    val v2: Double = f39(v8)
    val v9: Vector[Double] = Vector(v2, v1, v2, v1, v11)
    val v24: Double = f39(v2)
    v8 = v1
    var v39: Vector[Double] = v9
    val v58: Double = v39(1)
    v39 = v39.updated(2, v24)
    v58
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)), Vector(Vector(9.0)), Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)), Vector(Vector(15.0)), Vector(Vector(16.0)), Vector(Vector(17.0)))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)), Vector(Vector(21.0)), Vector(Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0)), Vector(Vector(28.0)), Vector(Vector(29.0)))))), Vector(s1(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0)), Vector(Vector(33.0)), Vector(Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0)), Vector(Vector(39.0)), Vector(Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)), Vector(Vector(45.0)), Vector(Vector(46.0)), Vector(Vector(47.0)))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0)), Vector(Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0)), Vector(Vector(58.0)), Vector(Vector(59.0)))))), Vector(s1(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0)), Vector(Vector(63.0)), Vector(Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0)), Vector(Vector(69.0)), Vector(Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0)), Vector(Vector(75.0)), Vector(Vector(76.0)), Vector(Vector(77.0)))), Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0)), Vector(Vector(81.0)), Vector(Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0)), Vector(Vector(88.0)), Vector(Vector(89.0)))))))
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