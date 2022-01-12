import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: s2,
    p1: Vector[s1]
  )
  case class s4 (
    p0: Vector[s2],
    p1: s0
  )
  case class s5 (
    p0: Vector[s2],
    p1: Vector[s0]
  )
  def f23(v0: s2, v1: s0): s0 = {
    val v6: Vector[Vector[Double]] = v1.p1
    val v5: s0 = v0.p1
    var v8: Vector[Vector[Double]] = v6
    val v2: Vector[Vector[Double]] = v1.p0
    var v9: Vector[Vector[Double]] = v8
    var v3: s2 = v0
    val v11: Vector[Double] = v2(0)
    var v13: s0 = v5
    v9 = v9.updated(0, v11)
    v3 = v3.copy(p1 = v5)
    var v17: s0 = v13
    v17 = v17.copy(p0 = v2)
    val v23: Vector[s0] = v0.p0
    v13 = v13.copy(p1 = v9)
    val v15: Vector[Vector[Double]] = v13.p0
    v3 = v0
    v3 = v3.copy(p0 = v23)
    v13 = v13.copy(p1 = v15)
    val v28: Vector[Vector[Double]] = v17.p1
    var v20: Vector[s0] = v23
    val v21: s0 = v3.p1
    var v16: Vector[s0] = v23
    var v19: Vector[Vector[Double]] = v28
    var v36: s2 = v3
    v13 = v13.copy(p0 = v6)
    var v70: s2 = v36
    val v27: s0 = v23(1)
    v17 = v27
    val v22: s0 = v70.p1
    v13 = v13.copy(p0 = v8)
    val v29: Vector[Vector[Double]] = v27.p1
    v13 = v13.copy(p1 = v29)
    var v79: Vector[Vector[Double]] = v15
    val v65: Vector[s0] = v70.p0
    v70 = v70.copy(p0 = v23)
    val v50: Vector[s0] = v70.p0
    val v33: Vector[s0] = v70.p0
    v17 = v17.copy(p0 = v8)
    var v32: s2 = v70
    v3 = v3.copy(p0 = v33)
    var v48: s0 = v5
    v16 = v23
    v32 = v32.copy(p0 = v20)
    v3 = v3.copy(p0 = v16)
    v36 = v36.copy(p1 = v13)
    var v105: s2 = v32
    v36 = v36.copy(p1 = v21)
    v48 = v48.copy(p0 = v19)
    v36 = v36.copy(p1 = v22)
    var v86: s2 = v70
    v70 = v70.copy(p0 = v16)
    val v185: Vector[s2] = Vector(v105, v105, v86, v3, v86, v32, v70)
    val v167: s2 = v185(6)
    val v68: s0 = v167.p1
    val v128: Vector[s0] = v0.p0
    v17 = v17.copy(p1 = v79)
    v32 = v32.copy(p0 = v50)
    val v279: Vector[s0] = v32.p0
    v48 = v48.copy(p1 = v9)
    v17 = v17.copy(p1 = v19)
    v32 = v32.copy(p0 = v279)
    v70 = v70.copy(p0 = v65)
    v105 = v105.copy(p0 = v128)
    v32 = v32.copy(p1 = v48)
    v32 = v32.copy(p0 = v23)
    v68
  }
  def f4(v0: s4): s4 = {
    var v3: s4 = v0
    val v6: Vector[s2] = v0.p0
    var v8: Vector[s2] = v6
    val v1: s2 = v8(0)
    val v2: s2 = v6(0)
    val v5: s0 = v1.p1
    v8 = v8.updated(0, v1)
    val v9: s2 = v8(0)
    v8 = v6
    var v11: Vector[s2] = v8
    val v10: s0 = f23(v2, v5)
    v11 = v11.updated(0, v2)
    val v15: s2 = v11(0)
    v11 = v11.updated(0, v1)
    var v12: s0 = v5
    v8 = v8.updated(0, v15)
    v11 = v11.updated(0, v2)
    val v20: s0 = v3.p1
    val v19: s0 = v1.p1
    v8 = v8.updated(0, v15)
    v11 = v11.updated(0, v15)
    v11 = v11.updated(0, v9)
    val v31: s2 = v11(0)
    val v30: s0 = f23(v31, v20)
    val v16: s2 = v8(0)
    val v36: Vector[s0] = Vector(v20, v10, v12, v5, v30)
    val v29: Vector[s0] = v16.p0
    var v46: s2 = v16
    v11 = v11.updated(0, v2)
    v11 = v11.updated(0, v15)
    v8 = v8.updated(0, v31)
    val v41: s0 = v36(3)
    val v43: Vector[Vector[Double]] = v19.p0
    val v22: Vector[Double] = v43(0)
    val v59: s0 = v46.p1
    v8 = v8.updated(0, v2)
    val v106: s4 = s4(v8, v41)
    var v38: Vector[Vector[Double]] = v43
    v38 = v38.updated(0, v22)
    v46 = v46.copy(p0 = v29)
    v38 = v38.updated(0, v22)
    v38 = v38.updated(0, v22)
    v8 = v8.updated(0, v2)
    v3 = v3.copy(p1 = v59)
    v12 = v12.copy(p0 = v38)
    v106
  }
  @noinline
  def f0(v0: Vector[s4], v1: Vector[s3], v2: Vector[s5], v3: Vector[s0], v4: Double): Double = {
    val v6: s4 = v0(0)
    val v8: s0 = v3(1)
    var v5: s0 = v8
    val v19: s4 = f4(v6)
    val v25: s0 = v19.p1
    val v11: Vector[s2] = v19.p0
    val v26: s2 = v11(0)
    val v37: s0 = f23(v26, v8)
    val v45: s0 = v26.p1
    val v44: s0 = f23(v26, v8)
    val v33: s2 = s2(v3, v45)
    var v42: s2 = v26
    v42 = v26
    val v43: s0 = f23(v42, v44)
    val v61: Vector[Vector[Double]] = v43.p0
    v5 = v5.copy(p1 = v61)
    val v39: Vector[Vector[Double]] = v37.p1
    val v85: Vector[Vector[Double]] = v25.p1
    v5 = v5.copy(p1 = v85)
    val v99: s0 = f23(v33, v5)
    val v106: Vector[Double] = v61(0)
    var v128: Vector[Double] = v106
    v42 = v42.copy(p1 = v99)
    v42 = v42.copy(p1 = v45)
    val v86: Double = v128(0)
    v5 = v5.copy(p1 = v39)
    v86
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), s4(Vector(s2(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0)), Vector(Vector(13.0))))), s0(Vector(Vector(14.0)), Vector(Vector(15.0)))), s4(Vector(s2(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0)))), s0(Vector(Vector(20.0)), Vector(Vector(21.0))))), s0(Vector(Vector(22.0)), Vector(Vector(23.0)))))
    val v1: Vector[s3] = Vector(s3(s2(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0)))), s0(Vector(Vector(28.0)), Vector(Vector(29.0)))), Vector(s1(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0))), s0(Vector(Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0))), s0(Vector(Vector(38.0)), Vector(Vector(39.0))))), s1(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0)))), Vector(s0(Vector(Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0))))))))
    val v2: Vector[s5] = Vector(s5(Vector(s2(Vector(s0(Vector(Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0)))), s0(Vector(Vector(54.0)), Vector(Vector(55.0)))), s2(Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0))), s0(Vector(Vector(58.0)), Vector(Vector(59.0)))), s0(Vector(Vector(60.0)), Vector(Vector(61.0))))), Vector(s0(Vector(Vector(62.0)), Vector(Vector(63.0))))), s5(Vector(s2(Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0)), Vector(Vector(67.0)))), s0(Vector(Vector(68.0)), Vector(Vector(69.0)))), s2(Vector(s0(Vector(Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0)))), s0(Vector(Vector(74.0)), Vector(Vector(75.0))))), Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0))))), s5(Vector(s2(Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0))), s0(Vector(Vector(80.0)), Vector(Vector(81.0)))), s0(Vector(Vector(82.0)), Vector(Vector(83.0)))), s2(Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0))), s0(Vector(Vector(86.0)), Vector(Vector(87.0)))), s0(Vector(Vector(88.0)), Vector(Vector(89.0))))), Vector(s0(Vector(Vector(90.0)), Vector(Vector(91.0))))))
    val v3: Vector[s0] = Vector(s0(Vector(Vector(92.0)), Vector(Vector(93.0))), s0(Vector(Vector(94.0)), Vector(Vector(95.0))))
    val v4: Double = 96.0
    val start = nanoTime()
    var result: Double = 96.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}