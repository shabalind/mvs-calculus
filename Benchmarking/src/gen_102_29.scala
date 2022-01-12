import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: Vector[s0]
  )
  case class s4 (
    p0: s1,
    p1: s2
  )
  case class s6 (
    p0: Vector[Vector[s3]],
    p1: Vector[Double]
  )
  def f20(v0: Vector[Double]): Vector[Double] = {
    val v3: Double = v0(1)
    var v7: Vector[Double] = v0
    var v5: Double = v3
    val v8: Double = v0(0)
    v7 = v7.updated(1, v5)
    var v1: Double = v8
    var v6: Vector[Double] = v7
    var v4: Vector[Double] = v7
    var v2: Vector[Double] = v6
    val v13: Double = v0(1)
    var v20: Vector[Double] = v2
    var v10: Double = v13
    val v11: Double = v6(0)
    val v9: Double = v20(1)
    var v15: Vector[Double] = v20
    v6 = v20
    var v22: Double = v8
    var v14: Vector[Double] = v2
    var v17: Double = v13
    var v12: Vector[Double] = v4
    val v19: Double = v7(0)
    v2 = v2.updated(0, v3)
    var v18: Double = v19
    var v16: Vector[Double] = v7
    var v23: Vector[Double] = v7
    var v29: Double = v10
    val v21: Double = v22 - v1
    val v25: Double = v9 * v17
    var v24: Vector[Double] = v7
    val v26: Double = v4(0)
    v15 = v15.updated(1, v17)
    v15 = v6
    var v67: Double = v21
    val v51: Double = v24(1)
    var v46: Double = v25
    val v50: Double = v23(1)
    var v33: Double = v50
    v15 = v15.updated(1, v46)
    val v54: Double = v7(1)
    var v37: Vector[Double] = v14
    val v28: Double = v16(1)
    val v72: Double = v14(1)
    v7 = v6
    v2 = v2.updated(0, v33)
    val v55: Double = v12(1)
    var v73: Double = v8
    v16 = v16.updated(0, v26)
    val v70: Double = v7(1)
    v67 = v72
    v6 = v6.updated(1, v51)
    v15 = v15.updated(0, v72)
    var v32: Vector[Double] = v2
    v15 = v15.updated(1, v22)
    val v38: Double = v16(0)
    v6 = v6.updated(1, v54)
    v23 = v23.updated(0, v10)
    var v58: Vector[Double] = v12
    var v47: Double = v54
    v14 = v0
    var v63: Vector[Double] = v37
    v23 = v23.updated(0, v55)
    val v79: Double = v2(0)
    var v99: Vector[Double] = v6
    v20 = v20.updated(1, v46)
    var v36: Vector[Double] = v63
    val v140: Double = v2(0)
    v63 = v63.updated(0, v10)
    var v93: Double = v72
    var v83: Vector[Double] = v36
    var v86: Vector[Double] = v36
    var v59: Double = v140
    v32 = v32.updated(1, v18)
    val v64: Double = v12(0)
    var v208: Double = v29
    var v53: Vector[Double] = v7
    val v118: Double = v15(0)
    val v113: Vector[Vector[Double]] = Vector(v83, v53, v20, v32, v0, v53, v86)
    v36 = v36.updated(0, v38)
    var v115: Vector[Vector[Double]] = v113
    val v68: Vector[Double] = v113(0)
    val v87: Vector[Double] = v115(3)
    var v61: Vector[Double] = v68
    val v119: Double = v53(0)
    val v66: Double = v32(0)
    v36 = v36.updated(1, v10)
    v99 = v99.updated(0, v21)
    v20 = v20.updated(1, v66)
    var v60: Double = v208
    val v121: Vector[Vector[Double]] = Vector(v15, v58, v6, v61)
    v61 = v61.updated(0, v11)
    var v75: Vector[Vector[Double]] = v121
    v20 = v20.updated(1, v59)
    v6 = v6.updated(0, v28)
    v14 = v14.updated(1, v140)
    var v108: Vector[Vector[Double]] = v75
    val v85: Vector[Vector[Double]] = Vector(v87, v4)
    v36 = v36.updated(1, v47)
    val v111: Double = v118 + v93
    v36 = v36.updated(1, v73)
    var v206: Vector[Vector[Double]] = v85
    v63 = v63.updated(1, v119)
    v4 = v4.updated(1, v67)
    val v116: Vector[Double] = v108(0)
    val v109: Vector[Double] = v206(0)
    v83 = v83.updated(1, v79)
    v58 = v58.updated(0, v70)
    v61 = v61.updated(0, v111)
    v23 = v23.updated(1, v64)
    v12 = v99
    v61 = v61.updated(0, v60)
    v32 = v32.updated(1, v72)
    v14 = v109
    v116
  }
  @noinline
  def f0(v0: s2, v1: s6, v2: Vector[s0], v3: s4, v4: s3, v5: Double): Double = {
    val v7: Double = v5 - v5
    var v14: s6 = v1
    var v31: Double = v7
    val v56: Vector[Double] = v14.p1
    val v19: Vector[Double] = f20(v56)
    val v26: Double = v19(1)
    val v85: Double = v26 - v31
    val v261: Double = v31 / v85
    v261
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0))))
    val v1: s6 = s6(Vector(Vector(s3(Vector(s1(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)))))), Vector(s3(Vector(s1(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))), Vector(s3(Vector(s1(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0), Vector(41.0))))))), Vector(42.0, 43.0))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0))), s0(Vector(Vector(47.0), Vector(48.0), Vector(49.0))))
    val v3: s4 = s4(s1(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0))), s0(Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), s2(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0))), s0(Vector(Vector(59.0), Vector(60.0), Vector(61.0)))))
    val v4: s3 = s3(Vector(s1(s0(Vector(Vector(62.0), Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0))))), Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0))), s0(Vector(Vector(71.0), Vector(72.0), Vector(73.0)))))
    val v5: Double = 74.0
    val start = nanoTime()
    var result: Double = 74.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}