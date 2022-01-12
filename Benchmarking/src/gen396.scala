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
  case class s3 (
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  def f72(v0: Vector[Vector[s0]]): Vector[Vector[s0]] = {
    val v6: Vector[s0] = v0(0)
    val v7: s0 = v6(0)
    val v3: Vector[s0] = v0(0)
    var v9: s0 = v7
    val v12: Vector[Vector[Double]] = v7.p0
    val v2: Vector[s0] = v0(0)
    val v1: Vector[Vector[Double]] = v9.p1
    var v4: Vector[s0] = v2
    val v13: s0 = v3(0)
    val v10: Vector[Vector[Double]] = v13.p0
    var v5: Vector[s0] = v3
    val v16: s0 = v6(0)
    v4 = v4.updated(0, v7)
    var v20: s0 = v9
    v9 = v20
    v9 = v9.copy(p1 = v12)
    var v23: s0 = v13
    v20 = v20.copy(p1 = v12)
    var v35: s0 = v7
    val v29: Vector[Vector[Double]] = v35.p0
    val v31: Vector[s0] = v0(0)
    val v17: s0 = v5(0)
    v20 = v20.copy(p1 = v12)
    var v43: s0 = v13
    var v59: Vector[Vector[Double]] = v29
    v35 = v35.copy(p1 = v59)
    val v58: s1 = s1(v4, v23)
    val v78: Vector[Vector[Double]] = v16.p0
    var v66: s1 = v58
    val v64: Vector[s0] = v66.p0
    val v76: s0 = s0(v1, v59)
    v4 = v4.updated(0, v43)
    v9 = v9.copy(p1 = v29)
    val v57: Vector[Vector[Double]] = v76.p0
    var v60: Vector[Vector[Double]] = v57
    val v97: Vector[s0] = v58.p0
    val v51: s0 = v31(0)
    val v149: s0 = v97(0)
    v23 = v23.copy(p0 = v1)
    v5 = v5.updated(0, v51)
    val v68: Vector[Double] = v10(1)
    v23 = v23.copy(p1 = v60)
    v43 = v43.copy(p1 = v1)
    val v133: Vector[Vector[Double]] = v9.p1
    v60 = v57
    val v70: Vector[Vector[Double]] = v16.p1
    v9 = v9.copy(p1 = v133)
    var v124: Vector[Vector[s0]] = v0
    val v55: Vector[Vector[Double]] = v43.p0
    val v85: Vector[Vector[Double]] = v149.p0
    v5 = v5.updated(0, v35)
    v20 = v20.copy(p0 = v70)
    val v108: Vector[Vector[Double]] = v76.p1
    v20 = v20.copy(p0 = v55)
    v59 = v59.updated(2, v68)
    v124 = v124.updated(1, v64)
    v35 = v35.copy(p1 = v57)
    v4 = v4.updated(0, v17)
    v5 = v5.updated(0, v20)
    v20 = v20.copy(p0 = v85)
    v35 = v35.copy(p0 = v108)
    v66 = v66.copy(p0 = v97)
    v9 = v9.copy(p0 = v108)
    v23 = v23.copy(p1 = v78)
    v124
  }
  def f66(v0: Vector[s1]): Vector[s1] = {
    var v5: Vector[s1] = v0
    val v8: s1 = v0(0)
    val v6: s1 = v0(0)
    var v3: s1 = v6
    val v4: Vector[s0] = v3.p0
    val v1: s1 = v5(0)
    var v11: Vector[s1] = v5
    val v2: Vector[s0] = v8.p0
    v3 = v3.copy(p0 = v4)
    val v10: s0 = v8.p1
    val v15: s0 = v1.p1
    v11 = v11.updated(0, v1)
    val v17: s1 = v5(0)
    v5 = v5.updated(0, v17)
    val v22: Vector[s1] = Vector(v8)
    v11 = v11.updated(0, v17)
    v3 = v3.copy(p0 = v2)
    v5 = v5.updated(0, v3)
    val v38: s0 = v6.p1
    v3 = v3.copy(p1 = v38)
    v3 = v3.copy(p1 = v15)
    v3 = v3.copy(p1 = v10)
    val v34: s1 = v0(0)
    v5 = v5.updated(0, v3)
    val v56: s1 = v0(0)
    val v36: s0 = v34.p1
    v3 = v3.copy(p1 = v36)
    v3 = v3.copy(p0 = v4)
    v5 = v22
    val v42: s0 = v56.p1
    v3 = v3.copy(p1 = v36)
    v5 = v5.updated(0, v8)
    v3 = v3.copy(p1 = v42)
    v11 = v11.updated(0, v34)
    v11
  }
  def f4(v0: s3): s3 = {
    v0
  }
  def f2(v0: s3): s3 = {
    var v6: s3 = v0
    val v1: Vector[s1] = v0.p0
    val v4: Vector[s3] = Vector(v6, v6)
    val v9: s3 = f4(v6)
    val v7: Vector[s1] = f66(v1)
    val v3: s1 = v1(0)
    val v10: Vector[s1] = f66(v7)
    val v18: s3 = f4(v6)
    var v2: Vector[s3] = v4
    val v8: s1 = v10(0)
    val v11: Vector[s1] = Vector(v8, v8, v3, v8)
    val v16: s1 = v11(0)
    var v12: Vector[s1] = v7
    val v19: Vector[Vector[s0]] = v9.p1
    var v31: Vector[Vector[s0]] = v19
    val v44: Vector[s0] = v16.p0
    val v29: s3 = s3(v7, v19)
    val v50: Vector[s1] = f66(v12)
    val v33: s0 = v44(0)
    val v38: Vector[s0] = v31(1)
    var v43: s1 = v3
    val v24: Vector[Vector[s0]] = f72(v19)
    val v45: Vector[Vector[s0]] = f72(v31)
    val v32: Vector[s1] = f66(v50)
    val v85: s3 = v4(0)
    var v71: s3 = v85
    v12 = v12.updated(0, v43)
    val v36: Vector[s1] = f66(v10)
    val v39: Vector[Vector[s0]] = f72(v24)
    v12 = v12.updated(0, v43)
    val v61: s3 = v2(1)
    v2 = v2.updated(1, v18)
    v6 = v6.copy(p0 = v12)
    val v54: Vector[s1] = f66(v7)
    val v115: Vector[s1] = v29.p0
    var v56: Vector[s0] = v38
    v2 = v2.updated(1, v9)
    val v89: Vector[Vector[s0]] = v71.p1
    v6 = v6.copy(p1 = v89)
    v6 = v6.copy(p0 = v36)
    v31 = v31.updated(0, v56)
    val v80: Vector[Vector[s1]] = Vector(v10, v10, v54, v32, v50, v115, v36)
    val v102: Vector[s1] = v80(5)
    v71 = v71.copy(p0 = v102)
    v71 = v71.copy(p1 = v39)
    v56 = v56.updated(0, v33)
    v71 = v71.copy(p1 = v45)
    v61
  }
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    val v3: s3 = v0(1)
    val v12: Double = v1 * v1
    val v8: s3 = f2(v3)
    val v2: Vector[Double] = Vector(v1, v12, v12, v12)
    val v13: s3 = f4(v8)
    val v11: Vector[Vector[s0]] = v13.p1
    var v24: Double = v12
    var v9: Double = v12
    var v30: Vector[Double] = v2
    v30 = v30.updated(1, v1)
    v30 = v30.updated(3, v24)
    val v10: Double = v30(2)
    v30 = v30.updated(2, v9)
    val v43: Vector[s0] = v11(0)
    val v36: s0 = v43(0)
    v9 = v10
    val v96: Vector[Vector[Double]] = v36.p1
    val v69: Vector[Double] = v96(0)
    val v99: Double = v69(0)
    v30 = v30.updated(2, v99)
    v10
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))), s3(Vector(s1(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))))), Vector(Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))), Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))), s3(Vector(s1(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))))), Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0)))), Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))))))
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