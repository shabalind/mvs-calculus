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
    p1: s1
  )
  case class s3 (
    p0: Vector[s1],
    p1: s1
  )
  case class s4 (
    p0: Vector[s1],
    p1: Vector[s2]
  )
  case class s5 (
    p0: s4,
    p1: Vector[Vector[s3]]
  )
  case class s8 (
    p0: s0,
    p1: s5
  )
  case class s10 (
    p0: s8
  )
  def f56(v0: Double): Double = {
    var v3: Double = v0
    var v5: Double = v0
    var v15: Double = v0
    var v4: Double = v0
    var v1: Double = v0
    var v7: Double = v4
    var v9: Double = v15
    v4 = v5
    var v8: Double = v7
    var v11: Double = v8
    var v10: Double = v1
    var v21: Double = v15
    var v30: Double = v3
    v21 = v4
    val v25: Vector[Double] = Vector(v11, v11, v9, v30, v10)
    val v27: Double = v25(0)
    var v57: Vector[Double] = v25
    var v36: Vector[Double] = v57
    v36 = v36.updated(3, v7)
    v57 = v57.updated(2, v27)
    var v72: Vector[Double] = v36
    v72 = v72.updated(4, v21)
    var v32: Vector[Double] = v72
    var v38: Vector[Double] = v32
    var v60: Vector[Double] = v38
    val v42: Double = v60(0)
    v42
  }
  @noinline
  def f0(v0: s10, v1: Double): Double = {
    var v8: Double = v1
    val v5: Double = v1 + v8
    val v7: Double = f56(v8)
    var v37: Double = v1
    val v54: Double = v37 + v7
    val v120: Double = v5 * v54
    v37 = v8
    v120
  }
  def benchmark(): Unit = {
    val v0: s10 = s10(s8(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s5(s4(Vector(s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), Vector(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))))), Vector(s2(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s1(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))))))), s2(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s1(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), Vector(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0)))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))))))), Vector(Vector(s3(Vector(s1(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), Vector(Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))), s1(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), Vector(Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0)))), Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))))), s1(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), Vector(Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))))), s1(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), Vector(Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0)))), Vector(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))))))))))))
    val v1: Double = 96.0
    val start = nanoTime()
    var result: Double = 96.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}