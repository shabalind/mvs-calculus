import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  case class s4 (
    p0: Vector[s2],
    p1: Vector[s3]
  )
  case class s5 (
    p0: s4
  )
  case class s6 (
    p0: s2,
    p1: s1
  )
  def f59(v0: s0): s0 = {
    val v7: Vector[s0] = Vector(v0)
    val v3: s0 = v7(0)
    val v15: Vector[Vector[Double]] = v0.p0
    val v18: Vector[Vector[Double]] = v3.p1
    val v17: s0 = s0(v15, v18)
    v17
  }
  def f22(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p1
    var v7: s0 = v0
    val v3: Vector[Vector[Double]] = v0.p0
    var v1: Vector[Vector[Double]] = v5
    val v11: Vector[Vector[Double]] = v7.p0
    val v2: Vector[Double] = v3(0)
    val v10: s0 = f59(v7)
    val v9: Vector[Vector[Double]] = v10.p1
    val v4: Vector[Double] = v5(1)
    val v13: Vector[Double] = v1(1)
    val v8: s0 = f59(v7)
    var v15: Vector[Vector[Double]] = v3
    var v16: Vector[Vector[Double]] = v1
    val v19: Vector[Vector[Vector[Double]]] = Vector(v16, v5, v16, v9, v1, v16, v5)
    var v14: Vector[Vector[Vector[Double]]] = v19
    val v24: s0 = f59(v8)
    val v18: s0 = f59(v7)
    val v20: Vector[Double] = v11(0)
    val v22: Vector[Vector[Double]] = v24.p1
    val v26: s0 = f59(v8)
    v7 = v7.copy(p0 = v15)
    val v34: Vector[Vector[Double]] = v18.p0
    val v51: Vector[Vector[Double]] = v24.p1
    val v56: Vector[Vector[Double]] = v8.p1
    var v65: Vector[Vector[Vector[Double]]] = v14
    val v43: Vector[Vector[Double]] = v0.p1
    v7 = v7.copy(p0 = v3)
    v7 = v7.copy(p1 = v43)
    val v55: s0 = f59(v26)
    v65 = v65.updated(0, v51)
    v7 = v7.copy(p0 = v3)
    v15 = v15.updated(0, v4)
    val v69: Vector[Vector[Double]] = v65(4)
    val v149: Vector[Vector[Double]] = v8.p0
    val v47: s0 = f59(v7)
    v1 = v1.updated(0, v20)
    val v42: Vector[Vector[Double]] = v47.p0
    v7 = v7.copy(p0 = v149)
    var v50: Vector[Vector[Double]] = v34
    val v113: s0 = f59(v8)
    v1 = v1.updated(0, v13)
    v7 = v7.copy(p0 = v50)
    var v70: s0 = v10
    v7 = v7.copy(p1 = v69)
    v70 = v70.copy(p0 = v42)
    val v152: Vector[Vector[Double]] = v55.p1
    val v63: Vector[Vector[Double]] = v113.p0
    val v219: Vector[Vector[Double]] = v14(4)
    val v141: Vector[Vector[Double]] = v26.p0
    v14 = v14.updated(5, v9)
    v50 = v50.updated(0, v2)
    v70 = v70.copy(p0 = v63)
    v7 = v7.copy(p1 = v56)
    v14 = v14.updated(0, v22)
    v70 = v70.copy(p0 = v141)
    v65 = v65.updated(2, v152)
    v70 = v70.copy(p1 = v69)
    v70 = v70.copy(p1 = v219)
    v70
  }
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: Vector[s6], v2: s5, v3: Double): Double = {
    val v4: Vector[s3] = v0(0)
    val v7: s3 = v4(0)
    val v8: s0 = v7.p0
    val v16: s0 = f22(v8)
    val v17: s0 = f59(v16)
    val v47: Vector[Vector[Double]] = v17.p0
    val v55: Vector[Double] = v47(0)
    val v82: Double = v55(0)
    v82
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s1(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))))))
    val v1: Vector[s6] = Vector(s6(s2(s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))))), s1(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))), s1(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), Vector(s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0)))))), s6(s2(s1(s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))), Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))), s1(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))), Vector(s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0)))))), s1(s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))), s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0)))))), s6(s2(s1(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))), Vector(s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))))), s1(s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0))), Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))), s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0)))))), s1(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0))), Vector(s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0)))))))
    val v2: s5 = s5(s4(Vector(s2(s1(s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0))), s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0))))), s1(s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0))), Vector(s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0))))))), Vector(s3(s0(Vector(Vector(111.0)), Vector(Vector(112.0), Vector(113.0))), s1(s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0))), Vector(s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0)))))))))
    val v3: Double = 123.0
    val start = nanoTime()
    var result: Double = 123.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}