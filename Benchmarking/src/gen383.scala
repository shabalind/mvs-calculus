import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: s0
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[s1]
  )
  case class s3 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[s3],
    p1: s2
  )
  def f11(v0: s0): s0 = {
    val v3: s1 = s1(v0)
    val v7: s0 = v3.p0
    val v11: Vector[Vector[Double]] = v0.p0
    var v13: Vector[Vector[Double]] = v11
    val v1: Vector[Double] = v13(0)
    v13 = v13.updated(0, v1)
    val v9: Double = v1(0)
    var v6: Double = v9
    v13 = v13.updated(0, v1)
    val v16: Vector[Double] = v7.p1
    v13 = v13.updated(0, v1)
    v13 = v13.updated(0, v1)
    v13 = v11
    var v31: Vector[Double] = v1
    var v69: Vector[Double] = v31
    var v24: Vector[Double] = v16
    val v45: s0 = s0(v13, v24)
    v13 = v13.updated(0, v69)
    v69 = v69.updated(0, v6)
    v45
  }
  def f10(v0: Vector[Vector[s0]]): Vector[Vector[s0]] = {
    var v6: Vector[Vector[s0]] = v0
    val v4: Vector[Vector[Vector[s0]]] = Vector(v6, v6, v6, v6, v6, v0)
    val v8: Vector[Vector[s0]] = v4(2)
    val v9: Vector[s0] = v0(1)
    var v3: Vector[Vector[Vector[s0]]] = v4
    v3 = v3.updated(0, v8)
    v6 = v6.updated(1, v9)
    val v111: Vector[Vector[s0]] = v3(5)
    val v51: Vector[s0] = v8(0)
    var v128: Vector[Vector[s0]] = v111
    v128 = v128.updated(1, v51)
    v128
  }
  def f6(v0: Vector[s0]): Vector[s0] = {
    val v5: Vector[Vector[s0]] = Vector(v0)
    var v4: Vector[Vector[s0]] = v5
    v4 = v4.updated(0, v0)
    val v3: Vector[s0] = v4(0)
    val v2: Vector[s0] = v5(0)
    val v14: Vector[Vector[Vector[s0]]] = Vector(v4, v4, v4, v5, v4, v5, v4)
    v4 = v4.updated(0, v3)
    val v49: Vector[s0] = v5(0)
    val v41: Vector[s0] = v5(0)
    val v29: Vector[Vector[s0]] = Vector(v2, v3, v2, v49, v3, v49, v41)
    val v31: Vector[Vector[s0]] = v14(5)
    val v47: Vector[s0] = v29(1)
    v4 = v31
    v47
  }
  def f3(v0: s3, v1: s0, v2: Vector[Vector[s0]]): s0 = {
    val v6: Vector[Vector[s0]] = f10(v2)
    val v7: Vector[s0] = v6(0)
    val v4: s0 = f11(v1)
    var v9: s3 = v0
    v9 = v9.copy(p0 = v4)
    val v13: s0 = v7(0)
    val v10: Vector[Double] = v4.p1
    val v14: s0 = f11(v13)
    var v39: Vector[Vector[s0]] = v6
    val v20: Vector[s0] = v2(1)
    val v43: s0 = v9.p0
    var v46: s0 = v43
    val v36: Vector[s0] = v2(0)
    var v40: Vector[Vector[s0]] = v39
    v46 = v46.copy(p1 = v10)
    v9 = v9.copy(p0 = v14)
    val v33: Vector[Vector[Double]] = v43.p0
    val v42: Vector[s0] = v40(1)
    v39 = v39.updated(0, v20)
    val v65: Vector[Double] = v46.p1
    val v107: s1 = s1(v14)
    var v35: Vector[s0] = v36
    val v60: s0 = v107.p0
    v40 = v40.updated(0, v36)
    v39 = v39.updated(1, v35)
    val v76: s0 = v42(0)
    var v97: s0 = v76
    var v51: Vector[Double] = v65
    var v93: Vector[Double] = v51
    v9 = v9.copy(p0 = v60)
    v97 = v97.copy(p1 = v65)
    val v127: Vector[s0] = v9.p1
    v97 = v97.copy(p1 = v93)
    v97 = v97.copy(p0 = v33)
    v9 = v9.copy(p1 = v127)
    v97
  }
  @noinline
  def f0(v0: Vector[Vector[s4]], v1: Double): Double = {
    val v7: Vector[s4] = v0(2)
    val v2: s4 = v7(0)
    val v12: s2 = v2.p1
    val v9: Vector[Vector[s0]] = v12.p0
    val v10: Vector[s3] = v2.p0
    val v18: s3 = v10(1)
    var v25: Vector[Vector[s0]] = v9
    v25 = v9
    val v49: Vector[s0] = v18.p1
    var v71: s3 = v18
    val v36: Vector[s0] = f6(v49)
    val v27: s0 = v36(1)
    v71 = v71.copy(p0 = v27)
    val v61: s0 = f3(v71, v27, v25)
    v71 = v71.copy(p1 = v36)
    val v62: Vector[s0] = f6(v49)
    val v57: Vector[s0] = f6(v62)
    v71 = v71.copy(p1 = v36)
    val v195: Vector[Vector[Double]] = v61.p0
    val v102: Vector[Vector[s0]] = f10(v25)
    v71 = v71.copy(p1 = v36)
    val v133: Vector[s0] = f6(v57)
    val v206: Vector[s0] = v102(1)
    v25 = v25.updated(1, v206)
    val v122: Vector[Double] = v195(0)
    v71 = v71.copy(p1 = v133)
    val v132: Double = v122(0)
    v132
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s4]] = Vector(Vector(s4(Vector(s3(s0(Vector(Vector(0.0)), Vector(1.0, 2.0)), Vector(s0(Vector(Vector(3.0)), Vector(4.0, 5.0)), s0(Vector(Vector(6.0)), Vector(7.0, 8.0)))), s3(s0(Vector(Vector(9.0)), Vector(10.0, 11.0)), Vector(s0(Vector(Vector(12.0)), Vector(13.0, 14.0)), s0(Vector(Vector(15.0)), Vector(16.0, 17.0))))), s2(Vector(Vector(s0(Vector(Vector(18.0)), Vector(19.0, 20.0))), Vector(s0(Vector(Vector(21.0)), Vector(22.0, 23.0)))), Vector(s1(s0(Vector(Vector(24.0)), Vector(25.0, 26.0))), s1(s0(Vector(Vector(27.0)), Vector(28.0, 29.0))), s1(s0(Vector(Vector(30.0)), Vector(31.0, 32.0))))))), Vector(s4(Vector(s3(s0(Vector(Vector(33.0)), Vector(34.0, 35.0)), Vector(s0(Vector(Vector(36.0)), Vector(37.0, 38.0)), s0(Vector(Vector(39.0)), Vector(40.0, 41.0)))), s3(s0(Vector(Vector(42.0)), Vector(43.0, 44.0)), Vector(s0(Vector(Vector(45.0)), Vector(46.0, 47.0)), s0(Vector(Vector(48.0)), Vector(49.0, 50.0))))), s2(Vector(Vector(s0(Vector(Vector(51.0)), Vector(52.0, 53.0))), Vector(s0(Vector(Vector(54.0)), Vector(55.0, 56.0)))), Vector(s1(s0(Vector(Vector(57.0)), Vector(58.0, 59.0))), s1(s0(Vector(Vector(60.0)), Vector(61.0, 62.0))), s1(s0(Vector(Vector(63.0)), Vector(64.0, 65.0))))))), Vector(s4(Vector(s3(s0(Vector(Vector(66.0)), Vector(67.0, 68.0)), Vector(s0(Vector(Vector(69.0)), Vector(70.0, 71.0)), s0(Vector(Vector(72.0)), Vector(73.0, 74.0)))), s3(s0(Vector(Vector(75.0)), Vector(76.0, 77.0)), Vector(s0(Vector(Vector(78.0)), Vector(79.0, 80.0)), s0(Vector(Vector(81.0)), Vector(82.0, 83.0))))), s2(Vector(Vector(s0(Vector(Vector(84.0)), Vector(85.0, 86.0))), Vector(s0(Vector(Vector(87.0)), Vector(88.0, 89.0)))), Vector(s1(s0(Vector(Vector(90.0)), Vector(91.0, 92.0))), s1(s0(Vector(Vector(93.0)), Vector(94.0, 95.0))), s1(s0(Vector(Vector(96.0)), Vector(97.0, 98.0))))))))
    val v1: Double = 99.0
    val start = nanoTime()
    var result: Double = 99.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}