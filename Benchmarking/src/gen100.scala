import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s1],
    p2: Vector[s1]
  )
  case class s3 (
    p0: Vector[s1],
    p1: s0
  )
  case class s4 (
    p0: Vector[Vector[s2]]
  )
  case class s5 (
    p0: Vector[s3],
    p1: Vector[s2]
  )
  case class s6 (
    p0: s5,
    p1: s1
  )
  def f82(v0: s2): s2 = {
    val v7: Vector[s1] = v0.p0
    var v4: Vector[s1] = v7
    val v5: s1 = v4(1)
    var v6: s1 = v5
    val v9: Double = v6.p0
    var v3: Double = v9
    v6 = v6.copy(p0 = v9)
    v4 = v4.updated(1, v5)
    val v10: s1 = v4(1)
    val v2: s1 = v7(0)
    var v18: s2 = v0
    var v1: Double = v3
    v4 = v4.updated(1, v10)
    val v13: s1 = v7(1)
    var v8: Vector[s1] = v4
    v18 = v18.copy(p1 = v8)
    val v17: Vector[s1] = v18.p2
    v4 = v4.updated(1, v13)
    var v14: s1 = v5
    var v11: Vector[s1] = v17
    v8 = v8.updated(1, v14)
    val v15: Vector[s1] = v18.p2
    v6 = v6.copy(p0 = v3)
    var v20: s1 = v13
    var v26: Double = v9
    v11 = v11.updated(0, v20)
    v4 = v4.updated(0, v13)
    var v16: s1 = v14
    val v30: s1 = v11(0)
    v4 = v4.updated(0, v16)
    v4 = v4.updated(1, v2)
    v16 = v16.copy(p0 = v26)
    val v21: Vector[Double] = Vector(v1, v1)
    val v22: s1 = v4(0)
    v11 = v11.updated(0, v20)
    v6 = v6.copy(p0 = v26)
    v11 = v11.updated(0, v6)
    v11 = v11.updated(1, v30)
    var v44: s2 = v18
    v4 = v4.updated(1, v22)
    val v49: Vector[s1] = v44.p2
    v14 = v14.copy(p0 = v26)
    val v38: s2 = s2(v11, v17, v4)
    v18 = v18.copy(p1 = v8)
    var v39: Vector[Double] = v21
    v6 = v6.copy(p0 = v3)
    var v32: s2 = v38
    v8 = v8.updated(0, v22)
    v39 = v39.updated(1, v3)
    v44 = v44.copy(p2 = v49)
    var v59: s2 = v32
    v4 = v4.updated(1, v5)
    v11 = v11.updated(0, v13)
    val v78: Double = v39(0)
    val v58: Vector[s1] = v44.p2
    v32 = v32.copy(p1 = v15)
    val v159: s1 = v58(0)
    v8 = v8.updated(0, v159)
    v14 = v14.copy(p0 = v78)
    v59
  }
  def f80(v0: s2): s2 = {
    val v6: s2 = f82(v0)
    val v9: s2 = f82(v0)
    val v2: s2 = f82(v6)
    val v5: Vector[s1] = v2.p1
    val v12: s2 = f82(v9)
    var v18: s2 = v12
    v18 = v18.copy(p2 = v5)
    v18 = v18.copy(p1 = v5)
    v18 = v12
    val v79: s2 = f82(v18)
    v79
  }
  def f78(v0: Vector[s3]): Vector[s3] = {
    var v2: Vector[s3] = v0
    val v8: s3 = v2(0)
    var v10: s3 = v8
    v2 = v2.updated(0, v10)
    val v23: s0 = v10.p1
    val v18: s0 = v10.p1
    v10 = v10.copy(p1 = v18)
    val v39: s3 = v0(1)
    v10 = v10.copy(p1 = v23)
    v2 = v2.updated(1, v39)
    var v53: Vector[s3] = v2
    var v55: Vector[s3] = v0
    v2 = v2.updated(2, v10)
    v53 = v0
    v2 = v55
    v53
  }
  def f76(v0: s1): s1 = {
    val v5: Double = v0.p0
    val v6: Double = v0.p0
    val v8: Double = v0.p0
    var v7: Double = v6
    var v16: s1 = v0
    var v13: s1 = v0
    v16 = v13
    v16 = v16.copy(p0 = v8)
    v16 = v16.copy(p0 = v7)
    v16 = v16.copy(p0 = v5)
    v16
  }
  def f71(v0: s1): s1 = {
    val v3: s1 = f76(v0)
    val v4: s1 = f76(v0)
    var v7: s1 = v0
    val v1: s1 = f76(v3)
    val v12: Double = v0.p0
    val v5: s1 = f76(v3)
    val v8: s1 = f76(v1)
    val v6: Vector[Double] = Vector(v12, v12, v12, v12, v12, v12, v12)
    val v9: Double = v6(3)
    val v10: Double = v8.p0
    v7 = v7.copy(p0 = v10)
    v7 = v7.copy(p0 = v10)
    v7 = v7.copy(p0 = v10)
    v7 = v0
    val v16: Double = v4.p0
    val v11: s1 = f76(v4)
    val v15: Double = v6(1)
    v7 = v7.copy(p0 = v15)
    v7 = v7.copy(p0 = v9)
    val v28: s1 = f76(v11)
    val v56: Double = v5.p0
    v7 = v7.copy(p0 = v56)
    val v78: s1 = f76(v28)
    v7 = v7.copy(p0 = v12)
    v7 = v7.copy(p0 = v16)
    val v173: Double = v78.p0
    v7 = v7.copy(p0 = v173)
    v7
  }
  def f56(v0: s2): s2 = {
    var v6: s2 = v0
    val v5: Vector[s1] = v0.p0
    val v7: s2 = f80(v6)
    val v8: s2 = f80(v0)
    v6 = v6.copy(p2 = v5)
    v6 = v6.copy(p0 = v5)
    v6 = v6.copy(p1 = v5)
    var v2: s2 = v7
    v6 = v8
    val v23: s2 = f80(v2)
    val v30: s2 = f82(v23)
    v30
  }
  def f34(v0: s5): s5 = {
    v0
  }
  def f32(v0: s6): s6 = {
    v0
  }
  def f25(v0: s5): s5 = {
    var v3: s5 = v0
    val v7: Vector[s2] = v3.p1
    v3 = v3.copy(p1 = v7)
    val v1: Vector[s3] = v3.p0
    val v2: Vector[s2] = v0.p1
    v3 = v0
    val v5: s5 = f34(v3)
    var v8: s5 = v5
    var v9: s5 = v3
    val v11: Vector[s3] = f78(v1)
    val v6: Vector[s2] = v3.p1
    val v4: Vector[s3] = v5.p0
    val v13: s2 = v6(0)
    val v15: Vector[s5] = Vector(v8, v9, v9, v0)
    v9 = v9.copy(p0 = v4)
    val v18: s2 = f56(v13)
    val v21: Vector[s2] = v3.p1
    var v69: Vector[s2] = v21
    v69 = v69.updated(1, v18)
    v69 = v69.updated(0, v13)
    v3 = v3.copy(p1 = v69)
    val v51: Vector[s3] = v8.p0
    v8 = v8.copy(p0 = v51)
    v9 = v9.copy(p1 = v2)
    v8 = v8.copy(p0 = v11)
    val v65: s5 = v15(2)
    v69 = v2
    v65
  }
  def f12(v0: s6): s6 = {
    val v3: s1 = v0.p1
    var v4: s6 = v0
    val v10: s6 = f32(v4)
    val v6: s5 = v10.p0
    val v8: s5 = f25(v6)
    v4 = v4.copy(p0 = v8)
    val v15: s1 = v10.p1
    val v16: s6 = f32(v4)
    v4 = v16
    val v20: s6 = f32(v4)
    v4 = v4.copy(p0 = v6)
    val v17: s5 = v20.p0
    val v38: s5 = v10.p0
    v4 = v4.copy(p0 = v8)
    v4 = v4.copy(p0 = v17)
    val v87: s1 = f71(v15)
    v4 = v4.copy(p1 = v3)
    var v112: s6 = v0
    v112 = v112.copy(p1 = v87)
    v112 = v112.copy(p0 = v38)
    val v125: s5 = f25(v38)
    v112 = v112.copy(p1 = v87)
    val v123: s5 = f25(v125)
    v112 = v112.copy(p0 = v123)
    val v209: Vector[s6] = Vector(v112, v16, v112)
    val v76: s6 = v209(2)
    v76
  }
  @noinline
  def f0(v0: s1, v1: s0, v2: Vector[s4], v3: s6, v4: s0, v5: Double): Double = {
    val v21: Vector[Vector[Double]] = v1.p1
    val v14: s6 = f12(v3)
    val v25: s1 = v14.p1
    val v27: Vector[Double] = v21(2)
    val v45: Double = v25.p0
    var v37: Vector[Double] = v27
    val v23: Double = v25.p0
    v37 = v37.updated(0, v23)
    val v39: Double = v37(0)
    val v146: Double = v39 * v45
    v146
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(0.0)
    val v1: s0 = s0(Vector(Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))
    val v2: Vector[s4] = Vector(s4(Vector(Vector(s2(Vector(s1(5.0), s1(6.0)), Vector(s1(7.0), s1(8.0)), Vector(s1(9.0), s1(10.0)))), Vector(s2(Vector(s1(11.0), s1(12.0)), Vector(s1(13.0), s1(14.0)), Vector(s1(15.0), s1(16.0)))), Vector(s2(Vector(s1(17.0), s1(18.0)), Vector(s1(19.0), s1(20.0)), Vector(s1(21.0), s1(22.0)))))))
    val v3: s6 = s6(s5(Vector(s3(Vector(s1(23.0), s1(24.0)), s0(Vector(Vector(25.0)), Vector(Vector(26.0), Vector(27.0), Vector(28.0)))), s3(Vector(s1(29.0), s1(30.0)), s0(Vector(Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))), s3(Vector(s1(35.0), s1(36.0)), s0(Vector(Vector(37.0)), Vector(Vector(38.0), Vector(39.0), Vector(40.0))))), Vector(s2(Vector(s1(41.0), s1(42.0)), Vector(s1(43.0), s1(44.0)), Vector(s1(45.0), s1(46.0))), s2(Vector(s1(47.0), s1(48.0)), Vector(s1(49.0), s1(50.0)), Vector(s1(51.0), s1(52.0))))), s1(53.0))
    val v4: s0 = s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0), Vector(57.0)))
    val v5: Double = 58.0
    val start = nanoTime()
    var result: Double = 58.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}