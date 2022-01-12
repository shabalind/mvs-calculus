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
  case class s2 (
    p0: s1,
    p1: s1
  )
  def f3(v0: Double): Double = {
    var v6: Double = v0
    var v2: Double = v6
    var v1: Double = v0
    var v7: Double = v1
    var v3: Double = v6
    var v4: Double = v3
    var v10: Double = v4
    var v8: Double = v4
    var v21: Double = v10
    var v13: Double = v4
    var v14: Double = v6
    val v11: Double = v21 / v13
    var v27: Double = v14
    val v12: Vector[Double] = Vector(v7, v7, v6, v6, v21, v4, v11)
    var v23: Vector[Double] = v12
    v23 = v23.updated(4, v4)
    v23 = v23.updated(3, v14)
    val v29: Double = v23(5)
    val v33: Double = v23(6)
    v23 = v23.updated(2, v8)
    var v34: Double = v2
    val v19: Double = v12(1)
    v23 = v23.updated(0, v10)
    v14 = v29
    v23 = v23.updated(6, v7)
    val v64: Vector[Double] = Vector(v33, v1, v11, v34, v4, v27)
    v27 = v33
    v23 = v23.updated(4, v33)
    var v53: Vector[Double] = v64
    var v86: Vector[Double] = v53
    v53 = v53.updated(4, v19)
    v23 = v23.updated(0, v10)
    val v126: Double = v86(1)
    v126
  }
  @noinline
  def f0(v0: Vector[s1], v1: Vector[Double], v2: Vector[s1], v3: Vector[s2], v4: Double): Double = {
    var v12: Vector[Double] = v1
    v12 = v1
    var v18: Double = v4
    val v28: Double = v12(0)
    var v16: Vector[Double] = v1
    v16 = v16.updated(0, v4)
    val v41: Double = f3(v4)
    v12 = v12.updated(0, v4)
    v16 = v16.updated(1, v18)
    v12 = v1
    v12 = v12.updated(0, v41)
    v16 = v16.updated(1, v28)
    var v50: Vector[Double] = v1
    v12 = v50
    val v52: Double = f3(v41)
    val v131: Double = f3(v52)
    var v157: Vector[Double] = v16
    val v96: Double = v157(1)
    v16 = v16.updated(1, v131)
    v96
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), s1(Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))))
    val v1: Vector[Double] = Vector(18.0, 19.0)
    val v2: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0))), s0(Vector(Vector(23.0)), Vector(Vector(24.0), Vector(25.0)))), s0(Vector(Vector(26.0)), Vector(Vector(27.0), Vector(28.0)))))
    val v3: Vector[s2] = Vector(s2(s1(Vector(s0(Vector(Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), s0(Vector(Vector(35.0)), Vector(Vector(36.0), Vector(37.0)))), s1(Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0), Vector(40.0))), s0(Vector(Vector(41.0)), Vector(Vector(42.0), Vector(43.0)))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0))))), s2(s1(Vector(s0(Vector(Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0)), Vector(Vector(51.0), Vector(52.0)))), s0(Vector(Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))), s1(Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0))), s0(Vector(Vector(59.0)), Vector(Vector(60.0), Vector(61.0)))), s0(Vector(Vector(62.0)), Vector(Vector(63.0), Vector(64.0))))), s2(s1(Vector(s0(Vector(Vector(65.0)), Vector(Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0)))), s0(Vector(Vector(71.0)), Vector(Vector(72.0), Vector(73.0)))), s1(Vector(s0(Vector(Vector(74.0)), Vector(Vector(75.0), Vector(76.0))), s0(Vector(Vector(77.0)), Vector(Vector(78.0), Vector(79.0)))), s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0))))))
    val v4: Double = 83.0
    val start = nanoTime()
    var result: Double = 83.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}