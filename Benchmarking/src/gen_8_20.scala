import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  case class s5 (
    p0: s2,
    p1: s3,
    p2: s0,
    p3: s0
  )
  case class s10 (
    p0: Vector[s3],
    p1: s5
  )
  def f86(v0: Double): Double = {
    var v7: Double = v0
    var v4: Double = v7
    var v1: Double = v0
    var v2: Double = v0
    var v3: Double = v0
    var v14: Double = v2
    var v10: Double = v2
    var v18: Double = v1
    v4 = v14
    var v17: Double = v4
    var v35: Double = v10
    val v22: Vector[Double] = Vector(v17, v35, v3, v18)
    val v26: Double = v22(1)
    v26
  }
  def f70(v0: Double): Double = {
    var v3: Double = v0
    var v6: Double = v3
    val v5: Double = f86(v3)
    val v7: Double = f86(v0)
    var v8: Double = v5
    var v4: Double = v3
    var v13: Double = v8
    val v14: Double = f86(v7)
    val v25: Double = f86(v3)
    val v24: Double = f86(v13)
    var v33: Double = v24
    var v64: Double = v6
    val v35: Double = f86(v7)
    var v50: Double = v4
    var v57: Double = v25
    var v37: Double = v24
    val v29: Vector[Double] = Vector(v35, v33, v5, v57, v6, v37)
    val v49: Double = f86(v35)
    var v41: Double = v50
    val v56: Double = f86(v64)
    val v73: Double = v29(2)
    val v44: Double = v29(4)
    val v52: Vector[Double] = Vector(v49, v49, v14, v24, v44, v41)
    var v71: Vector[Double] = v52
    var v87: Double = v56
    val v94: Double = v29(1)
    v71 = v71.updated(4, v94)
    v71 = v71.updated(1, v64)
    val v92: Double = v29(0)
    val v79: Double = v71(1)
    v71 = v71.updated(5, v87)
    val v66: Double = v79 + v92
    v71 = v71.updated(4, v73)
    v66
  }
  @noinline
  def f0(v0: s1, v1: s10, v2: Double): Double = {
    var v4: Double = v2
    val v52: Double = v2 + v4
    val v42: Double = f70(v52)
    val v60: Double = f70(v42)
    v60
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))
    val v1: s10 = s10(Vector(s3(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s1(Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))))), s3(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s1(Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))))))), s5(s2(Vector(s1(Vector(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))))), s1(Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0)))))), s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0)))), s3(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))), s1(Vector(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0)))))), s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0)))))
    val v2: Double = 96.0
    val start = nanoTime()
    var result: Double = 96.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}