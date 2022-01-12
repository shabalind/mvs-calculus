import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double,
    p1: s0
  )
  case class s4 (
    p0: s0,
    p1: Vector[Vector[s1]]
  )
  case class s5 (
    p0: s4,
    p1: Vector[s1]
  )
  case class s6 (
    p0: s0,
    p1: s5
  )
  def f57(v0: Double): Double = {
    var v7: Double = v0
    var v6: Double = v7
    var v4: Double = v7
    var v5: Double = v0
    v5 = v0
    var v10: Double = v0
    val v13: Vector[Double] = Vector(v7, v0, v10, v5)
    val v8: Double = v5 + v4
    val v9: Double = v13(0)
    val v20: Double = v13(0)
    var v29: Vector[Double] = v13
    val v17: Vector[Double] = Vector(v10)
    var v30: Vector[Double] = v17
    val v15: Double = v29(2)
    var v21: Vector[Double] = v29
    v30 = v30.updated(0, v6)
    val v27: Double = v13(1)
    var v37: Double = v9
    v30 = v30.updated(0, v8)
    var v39: Vector[Double] = v29
    val v45: Double = v21(0)
    var v35: Double = v0
    v21 = v21.updated(0, v6)
    val v46: Double = v39(0)
    var v61: Vector[Double] = v13
    var v26: Vector[Double] = v13
    val v40: Double = v13(2)
    var v36: Vector[Double] = v39
    v26 = v26.updated(0, v37)
    val v87: Double = v30(0)
    var v73: Vector[Double] = v29
    val v56: Double = v40 - v87
    v29 = v29.updated(0, v37)
    val v72: Vector[Vector[Double]] = Vector(v61, v29, v26, v39, v13, v73)
    val v104: Vector[Vector[Double]] = Vector(v36)
    var v147: Vector[Vector[Double]] = v72
    var v55: Vector[Vector[Double]] = v104
    v73 = v73.updated(0, v37)
    val v161: Vector[Double] = v147(1)
    val v43: Double = v36(1)
    var v112: Vector[Vector[Double]] = v72
    var v81: Vector[Vector[Double]] = v55
    v36 = v36.updated(0, v43)
    v81 = v81.updated(0, v13)
    val v75: Vector[Double] = v112(3)
    val v70: Vector[Double] = v72(5)
    var v126: Double = v15
    v36 = v36.updated(1, v126)
    v26 = v26.updated(0, v56)
    v147 = v147.updated(0, v70)
    val v169: Vector[Double] = v72(1)
    val v106: Vector[Double] = v81(0)
    v81 = v81.updated(0, v169)
    var v145: Vector[Double] = v106
    val v230: Double = v145(3)
    v30 = v30.updated(0, v46)
    v147 = v147.updated(0, v75)
    v21 = v21.updated(3, v35)
    v81 = v81.updated(0, v161)
    v55 = v55.updated(0, v61)
    v36 = v36.updated(0, v27)
    v21 = v21.updated(2, v20)
    v39 = v39.updated(0, v45)
    v36 = v36.updated(1, v7)
    v230
  }
  def f3(v0: Double): Double = {
    var v1: Double = v0
    v1 = v0
    var v6: Double = v1
    val v5: Double = f57(v1)
    var v4: Double = v0
    val v7: Double = f57(v5)
    val v10: Double = f57(v7)
    val v8: Double = v0 + v5
    val v15: Double = v7 / v0
    val v9: Double = f57(v7)
    var v11: Double = v7
    val v3: Double = f57(v15)
    var v19: Double = v15
    var v14: Double = v4
    val v21: Vector[Double] = Vector(v6, v6, v6, v3, v9, v0, v14)
    var v16: Vector[Double] = v21
    v16 = v16.updated(6, v11)
    var v29: Double = v19
    v16 = v16.updated(6, v29)
    v16 = v16.updated(6, v8)
    v1 = v14
    v16 = v16.updated(5, v10)
    val v32: Double = v16(4)
    v32
  }
  @noinline
  def f0(v0: Vector[s4], v1: Vector[s6], v2: Double): Double = {
    val v5: s6 = v1(2)
    val v10: s0 = v5.p0
    val v4: Vector[Vector[Double]] = v10.p0
    val v9: Vector[Double] = v4(0)
    val v14: Double = v9(0)
    var v27: Double = v2
    val v57: Double = f3(v27)
    v27 = v14
    v57
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(Vector(s1(3.0, s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0))))))))
    val v1: Vector[s6] = Vector(s6(s0(Vector(Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s5(s4(s0(Vector(Vector(10.0)), Vector(Vector(11.0), Vector(12.0))), Vector(Vector(s1(13.0, s0(Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0))))))), Vector(s1(17.0, s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)))), s1(21.0, s0(Vector(Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), s1(25.0, s0(Vector(Vector(26.0)), Vector(Vector(27.0), Vector(28.0))))))), s6(s0(Vector(Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s5(s4(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), Vector(Vector(s1(35.0, s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))))))), Vector(s1(39.0, s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0)))), s1(43.0, s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0)))), s1(47.0, s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))))))), s6(s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))), s5(s4(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))), Vector(Vector(s1(57.0, s0(Vector(Vector(58.0)), Vector(Vector(59.0), Vector(60.0))))))), Vector(s1(61.0, s0(Vector(Vector(62.0)), Vector(Vector(63.0), Vector(64.0)))), s1(65.0, s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0)))), s1(69.0, s0(Vector(Vector(70.0)), Vector(Vector(71.0), Vector(72.0))))))))
    val v2: Double = 73.0
    val start = nanoTime()
    var result: Double = 73.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}