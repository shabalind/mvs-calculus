import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s1]
  )
  case class s3 (
    p0: s2,
    p1: Vector[s0]
  )
  case class s4 (
    p0: s2,
    p1: s2
  )
  def f87(v0: s3, v1: s3, v2: s3): s3 = {
    val v7: s2 = v0.p0
    var v6: s2 = v7
    var v9: s3 = v0
    val v4: Vector[s1] = v6.p1
    val v3: Vector[Vector[s1]] = Vector(v4, v4, v4, v4, v4)
    var v13: s2 = v7
    v9 = v9.copy(p0 = v7)
    var v8: s3 = v9
    var v10: Vector[s1] = v4
    val v14: s2 = v2.p0
    val v12: Vector[s1] = v3(3)
    val v29: s1 = v14.p0
    v10 = v10.updated(2, v29)
    var v37: s2 = v13
    var v19: s2 = v14
    val v26: s1 = v6.p0
    v37 = v37.copy(p0 = v29)
    var v35: s3 = v8
    val v27: s1 = v10(1)
    v19 = v19.copy(p1 = v12)
    val v54: Vector[s0] = v8.p1
    var v40: s1 = v27
    v9 = v2
    v13 = v13.copy(p1 = v10)
    v19 = v19.copy(p0 = v40)
    v8 = v8.copy(p0 = v37)
    val v44: Vector[s2] = Vector(v19, v7, v7, v6, v13)
    val v49: s2 = v35.p0
    val v20: s2 = v44(4)
    v35 = v35.copy(p0 = v49)
    v35 = v35.copy(p1 = v54)
    val v65: Vector[s0] = v26.p1
    v19 = v19.copy(p0 = v40)
    val v68: s2 = v35.p0
    v13 = v13.copy(p0 = v27)
    v6 = v20
    val v55: s1 = v4(2)
    v8 = v8.copy(p0 = v68)
    v40 = v40.copy(p1 = v65)
    val v96: s2 = v8.p0
    v37 = v37.copy(p1 = v10)
    val v117: Vector[s1] = v96.p1
    v10 = v117
    v40 = v55
    v35 = v35.copy(p0 = v49)
    val v75: s1 = v96.p0
    v8 = v9
    val v118: Vector[s0] = v75.p1
    v19 = v19.copy(p1 = v4)
    v40 = v40.copy(p1 = v65)
    v6 = v6.copy(p0 = v40)
    v40 = v40.copy(p1 = v118)
    v8
  }
  def f86(v0: s3, v1: s4, v2: s2): s4 = {
    var v21: s4 = v1
    v21
  }
  def f85(v0: s3): s3 = {
    val v5: s3 = f87(v0, v0, v0)
    val v4: s3 = f87(v5, v5, v0)
    var v2: s3 = v0
    var v3: s3 = v0
    v2 = v4
    val v1: Vector[s0] = v3.p1
    val v8: s3 = f87(v5, v0, v5)
    v3 = v3.copy(p1 = v1)
    val v14: s3 = f87(v2, v3, v5)
    var v11: s3 = v4
    val v17: s3 = f87(v0, v0, v2)
    val v22: s3 = f87(v0, v14, v0)
    val v21: s2 = v5.p0
    var v16: s2 = v21
    val v47: s3 = f87(v8, v11, v4)
    val v19: s3 = f87(v47, v3, v8)
    v3 = v47
    v2 = v2.copy(p1 = v1)
    v3 = v47
    val v24: s3 = f87(v4, v22, v3)
    val v28: Vector[s0] = v17.p1
    var v45: s3 = v4
    val v49: s3 = f87(v14, v3, v11)
    val v40: s3 = f87(v14, v8, v19)
    val v34: Vector[s0] = v0.p1
    val v43: s3 = f87(v40, v24, v11)
    var v58: s2 = v16
    v58 = v21
    val v78: s3 = f87(v11, v3, v17)
    val v57: s3 = f87(v47, v3, v78)
    v45 = v45.copy(p0 = v21)
    val v32: s3 = f87(v43, v4, v8)
    val v79: s3 = f87(v57, v47, v43)
    val v102: s3 = f87(v5, v40, v11)
    v45 = v45.copy(p1 = v34)
    val v77: s3 = f87(v8, v8, v14)
    var v170: Vector[s0] = v28
    v45 = v45.copy(p0 = v58)
    val v70: s3 = f87(v57, v79, v22)
    val v111: s3 = f87(v77, v32, v49)
    val v129: s3 = f87(v43, v77, v102)
    val v130: s3 = f87(v70, v129, v47)
    val v122: s3 = f87(v102, v0, v111)
    var v200: s3 = v47
    v200 = v200.copy(p1 = v170)
    val v142: s3 = f87(v45, v122, v200)
    val v216: s3 = f87(v130, v70, v142)
    v216
  }
  def f77(v0: s3): s3 = {
    val v3: s2 = v0.p0
    val v1: s3 = f85(v0)
    var v6: s3 = v1
    v6 = v6.copy(p0 = v3)
    val v8: s4 = s4(v3, v3)
    val v15: s4 = f86(v0, v8, v3)
    val v49: s2 = v15.p0
    v6 = v6.copy(p0 = v49)
    v6
  }
  def f35(v0: s3): s3 = {
    val v4: s3 = f77(v0)
    var v5: s3 = v4
    var v6: s3 = v5
    val v7: s3 = f87(v0, v0, v6)
    val v1: s3 = f87(v6, v7, v5)
    v1
  }
  @noinline
  def f0(v0: s3, v1: Vector[Vector[s3]], v2: s1, v3: s2, v4: Double): Double = {
    val v6: Vector[s3] = v1(0)
    val v17: s3 = v6(0)
    val v9: Vector[s3] = v1(0)
    val v15: s3 = f35(v17)
    var v34: s3 = v15
    v34 = v34.copy(p0 = v3)
    val v21: s3 = v9(0)
    val v61: Vector[s0] = v34.p1
    v34 = v34.copy(p0 = v3)
    var v104: s3 = v21
    val v66: s0 = v61(1)
    val v80: Vector[Vector[Double]] = v66.p0
    val v101: Vector[Double] = v80(0)
    val v109: Double = v101(0)
    val v127: Double = v4 - v4
    val v108: Vector[s0] = v104.p1
    v104 = v15
    val v135: Double = v109 + v127
    v34 = v34.copy(p1 = v108)
    v135
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), s1(Vector(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))))), Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))))), s1(Vector(Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))))
    val v1: Vector[Vector[s3]] = Vector(Vector(s3(s2(s1(Vector(Vector(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))))), Vector(s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))))), s1(Vector(Vector(s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))))), Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))), s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))), s1(Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))))), Vector(s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))))))), Vector(s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0))), s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))))))
    val v2: s1 = s1(Vector(Vector(s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0))))), Vector(s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0)))))
    val v3: s2 = s2(s1(Vector(Vector(s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0))))), Vector(s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0))))), Vector(s0(Vector(Vector(111.0)), Vector(Vector(112.0), Vector(113.0))), s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0))))), s1(Vector(Vector(s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0))))), Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0))), s0(Vector(Vector(123.0)), Vector(Vector(124.0), Vector(125.0))))), s1(Vector(Vector(s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0))))), Vector(s0(Vector(Vector(129.0)), Vector(Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0)))))))
    val v4: Double = 135.0
    val start = nanoTime()
    var result: Double = 135.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}