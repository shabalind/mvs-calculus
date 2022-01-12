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
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s2,
    p1: s1
  )
  case class s7 (
    p0: Vector[s1],
    p1: s3
  )
  def f2(v0: Vector[Vector[s0]]): Vector[Vector[s0]] = {
    var v3: Vector[Vector[s0]] = v0
    v3 = v0
    var v1: Vector[Vector[s0]] = v0
    var v2: Vector[Vector[s0]] = v1
    var v6: Vector[Vector[s0]] = v0
    val v7: Vector[s0] = v1(1)
    v3 = v3.updated(2, v7)
    var v4: Vector[Vector[s0]] = v6
    var v8: Vector[s0] = v7
    val v9: Vector[s0] = v1(1)
    v3 = v3.updated(1, v8)
    val v5: s0 = v8(0)
    var v12: s0 = v5
    val v16: s0 = v8(0)
    val v20: Vector[Vector[Double]] = v12.p1
    v1 = v1.updated(1, v8)
    val v10: Vector[Vector[Double]] = v16.p0
    var v11: Vector[Vector[Double]] = v20
    val v21: Vector[Vector[Double]] = v5.p0
    val v15: Vector[Vector[Double]] = v16.p0
    val v22: Vector[Vector[Double]] = v5.p0
    var v14: Vector[Vector[Double]] = v21
    val v25: s0 = v8(0)
    val v34: Vector[Double] = v14(1)
    val v24: Vector[Vector[Double]] = v16.p1
    val v13: s0 = s0(v21, v20)
    var v43: Vector[s0] = v7
    v12 = v12.copy(p1 = v20)
    val v32: Vector[Double] = v15(0)
    val v30: Vector[Vector[Double]] = v25.p0
    val v17: Vector[Vector[Double]] = v25.p1
    var v33: Vector[Double] = v32
    v3 = v3.updated(1, v9)
    v4 = v4.updated(0, v43)
    v3 = v3.updated(2, v43)
    var v29: Vector[Vector[Double]] = v20
    val v39: Double = v32(0)
    val v35: Vector[Vector[Double]] = v13.p1
    val v19: Double = v34(0)
    v14 = v14.updated(0, v33)
    val v26: Vector[Double] = v17(1)
    val v73: s0 = v8(0)
    v12 = v12.copy(p1 = v29)
    var v58: Vector[s0] = v9
    v4 = v4.updated(1, v58)
    v11 = v20
    val v59: Vector[s0] = v2(2)
    v33 = v33.updated(0, v19)
    val v97: Vector[s0] = v6(2)
    val v31: s0 = v97(0)
    val v36: Vector[Vector[Double]] = v73.p0
    val v48: s0 = s0(v36, v35)
    v58 = v58.updated(0, v48)
    val v38: Double = v19 * v39
    val v93: Vector[Vector[Double]] = v25.p0
    v12 = v12.copy(p1 = v29)
    val v37: Vector[s0] = v4(2)
    v11 = v11.updated(1, v26)
    var v23: s0 = v31
    val v70: Vector[Vector[Vector[Double]]] = Vector(v17, v35, v24)
    val v84: Vector[Vector[Double]] = v48.p1
    v23 = v23.copy(p1 = v17)
    var v52: Vector[Double] = v26
    v14 = v14.updated(1, v52)
    v12 = v12.copy(p1 = v20)
    val v104: s0 = v59(0)
    val v81: Vector[Vector[Double]] = v70(0)
    v12 = v12.copy(p1 = v84)
    v12 = v12.copy(p0 = v93)
    v12 = v12.copy(p0 = v15)
    val v45: Vector[Vector[Double]] = v23.p1
    val v86: Vector[s0] = v3(1)
    v23 = v23.copy(p0 = v22)
    val v124: s1 = s1(v12, v6)
    var v51: Double = v19
    v2 = v2.updated(0, v8)
    val v56: s0 = v124.p0
    v23 = v23.copy(p1 = v84)
    val v66: Vector[s0] = v3(0)
    var v90: Vector[s0] = v9
    v11 = v11.updated(0, v34)
    v33 = v33.updated(0, v38)
    val v78: Double = v19 + v51
    v12 = v12.copy(p1 = v17)
    v4 = v4.updated(0, v9)
    val v72: Vector[Vector[Double]] = v104.p1
    v90 = v90.updated(0, v56)
    v8 = v7
    v2 = v2.updated(1, v37)
    v12 = v12.copy(p0 = v36)
    var v169: Vector[Vector[s0]] = v3
    v169 = v169.updated(0, v90)
    v43 = v43.updated(0, v31)
    v90 = v90.updated(0, v25)
    v169 = v169.updated(2, v66)
    v23 = v23.copy(p1 = v81)
    val v155: Double = v78 * v51
    v23 = v23.copy(p0 = v30)
    v23 = v23.copy(p1 = v72)
    v12 = v12.copy(p1 = v45)
    v52 = v52.updated(0, v155)
    v3 = v3.updated(1, v86)
    val v100: Vector[s0] = v2(0)
    v12 = v12.copy(p0 = v10)
    v12 = v12.copy(p1 = v11)
    v2 = v2.updated(0, v58)
    v2 = v2.updated(1, v100)
    v8 = v8.updated(0, v12)
    v169
  }
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    val v5: s3 = v0.p1
    val v4: s2 = v5.p0
    val v11: Vector[Vector[s0]] = v4.p1
    val v16: Vector[Vector[s0]] = f2(v11)
    val v12: Vector[s0] = v16(0)
    val v18: s0 = v12(0)
    var v13: s0 = v18
    val v26: Vector[Vector[Double]] = v13.p0
    val v37: Vector[Double] = v26(0)
    v13 = v13.copy(p0 = v26)
    val v63: Vector[Vector[Double]] = v13.p0
    v13 = v13.copy(p0 = v63)
    v13 = v13.copy(p0 = v26)
    v13 = v13.copy(p0 = v26)
    val v159: Double = v37(0)
    v159
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))))), s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), Vector(Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))), Vector(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))))), s1(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))), Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0)))), Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))), s3(s2(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)))), Vector(Vector(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0)))), Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0)))))), s1(s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), Vector(Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0)))), Vector(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0)))), Vector(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0))))))))
    val v1: Double = 105.0
    val start = nanoTime()
    var result: Double = 105.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}