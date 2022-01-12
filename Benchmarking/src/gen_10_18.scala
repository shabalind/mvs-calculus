import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[Vector[s0]],
    p2: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: Vector[s0]
  )
  def f108(v0: Double): Double = {
    var v7: Double = v0
    var v5: Double = v0
    var v6: Double = v0
    var v9: Double = v7
    var v2: Double = v7
    var v3: Double = v6
    var v16: Double = v7
    var v15: Double = v0
    val v12: Double = v16 - v3
    var v4: Double = v16
    val v30: Double = v16 - v4
    var v33: Double = v6
    var v22: Double = v30
    var v20: Double = v3
    val v41: Vector[Double] = Vector(v33, v16, v3, v22, v12, v12)
    var v18: Vector[Double] = v41
    val v25: Double = v18(2)
    val v53: Double = v18(5)
    var v42: Double = v53
    val v59: Double = v41(5)
    var v24: Vector[Double] = v41
    var v28: Double = v9
    v24 = v24.updated(0, v5)
    var v49: Vector[Double] = v24
    var v71: Vector[Double] = v49
    v24 = v24.updated(1, v25)
    val v37: Vector[Vector[Double]] = Vector(v41)
    var v43: Vector[Double] = v41
    v49 = v49.updated(0, v12)
    val v56: Vector[Double] = v37(0)
    val v85: Vector[Vector[Double]] = Vector(v56, v18, v41, v49, v41, v24)
    v24 = v24.updated(5, v28)
    var v45: Vector[Vector[Double]] = v85
    var v44: Vector[Vector[Double]] = v85
    v45 = v44
    v2 = v59
    v24 = v71
    v22 = v42
    var v123: Vector[Vector[Double]] = v44
    v71 = v71.updated(3, v2)
    var v47: Vector[Vector[Double]] = v123
    v123 = v123.updated(4, v43)
    v43 = v24
    v24 = v24.updated(2, v28)
    var v89: Vector[Vector[Double]] = v47
    val v94: Vector[Vector[Vector[Double]]] = Vector(v89, v47, v47, v45, v123, v44, v45)
    v2 = v7
    var v103: Vector[Vector[Vector[Double]]] = v94
    v43 = v43.updated(4, v0)
    v18 = v18.updated(0, v9)
    var v100: Vector[Vector[Vector[Double]]] = v103
    val v78: Vector[Vector[Double]] = v100(4)
    v71 = v71.updated(0, v20)
    val v80: Vector[Double] = v78(4)
    v49 = v49.updated(5, v15)
    val v259: Double = v80(3)
    v259
  }
  def f73(v0: Double): Double = {
    val v7: Double = f108(v0)
    var v5: Double = v0
    val v4: Double = f108(v7)
    var v11: Double = v5
    var v8: Double = v4
    val v14: Vector[Double] = Vector(v8, v11, v11, v5)
    val v9: Double = v14(1)
    val v26: Double = f108(v0)
    var v12: Vector[Double] = v14
    val v19: Double = v12(2)
    var v40: Vector[Double] = v12
    var v20: Vector[Double] = v40
    val v24: Double = f108(v5)
    val v43: Double = f108(v26)
    v12 = v12.updated(3, v7)
    v40 = v14
    var v25: Vector[Double] = v12
    var v22: Vector[Double] = v25
    val v28: Double = v20(3)
    val v32: Double = f108(v9)
    var v59: Vector[Double] = v25
    val v79: Double = v14(0)
    var v61: Vector[Double] = v14
    v20 = v20.updated(2, v32)
    var v57: Vector[Double] = v59
    var v42: Vector[Double] = v40
    v12 = v12.updated(1, v4)
    val v34: Double = v40(0)
    val v44: Double = v14(3)
    var v41: Vector[Double] = v59
    var v103: Vector[Double] = v61
    val v134: Double = f108(v26)
    var v75: Vector[Double] = v61
    v40 = v40.updated(2, v19)
    val v63: Double = f108(v44)
    v103 = v103.updated(2, v134)
    val v52: Double = v41(3)
    v42 = v22
    v41 = v41.updated(2, v34)
    v59 = v59.updated(0, v52)
    v57 = v61
    v40 = v40.updated(0, v8)
    val v62: Double = v14(3)
    v57 = v57.updated(3, v79)
    var v139: Vector[Double] = v61
    v41 = v41.updated(0, v24)
    val v114: Vector[Vector[Double]] = Vector(v57, v103, v139, v75, v61, v42, v12)
    v61 = v61.updated(0, v62)
    v61 = v40
    v59 = v59.updated(0, v43)
    val v81: Vector[Double] = v114(6)
    v12 = v12.updated(2, v28)
    val v119: Double = f108(v63)
    var v133: Vector[Double] = v81
    v25 = v25.updated(2, v119)
    var v181: Double = v5
    val v116: Double = v133(0)
    val v135: Double = f108(v116)
    v139 = v139.updated(1, v19)
    v42 = v42.updated(3, v181)
    v41 = v41.updated(2, v135)
    v135
  }
  @noinline
  def f0(v0: Vector[s1], v1: s3, v2: s2, v3: Double): Double = {
    val v6: Vector[s0] = v2.p2
    val v28: s0 = v6(1)
    var v13: Double = v3
    val v25: Vector[Vector[Double]] = v28.p1
    val v26: Vector[Double] = v25(0)
    var v34: Vector[Double] = v26
    val v50: Double = f73(v13)
    var v60: Vector[Double] = v34
    val v46: Double = v60(0)
    v60 = v60.updated(0, v3)
    val v38: Double = v34(0)
    v34 = v34.updated(0, v13)
    var v49: Vector[Double] = v26
    val v87: Double = v3 + v13
    v34 = v34.updated(0, v38)
    v49 = v34
    v60 = v60.updated(0, v50)
    v60 = v60.updated(0, v87)
    v34 = v34.updated(0, v46)
    val v119: Double = v49(0)
    v119
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))))
    val v1: s3 = s3(s1(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))
    val v2: s2 = s2(Vector(s1(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), s1(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))))), Vector(Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))))), Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0)))))
    val v3: Double = 78.0
    val start = nanoTime()
    var result: Double = 78.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}