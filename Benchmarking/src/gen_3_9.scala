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
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: s2
  )
  def f21(v0: s0): s0 = {
    var v7: s0 = v0
    v7 = v0
    val v5: Vector[s0] = Vector(v7, v7, v7, v0, v0, v0, v0)
    val v4: Vector[s0] = Vector(v0, v7, v0, v0, v0, v7, v7)
    val v2: s0 = v5(4)
    val v3: Vector[Vector[Double]] = v7.p1
    var v6: Vector[Vector[Double]] = v3
    val v11: s0 = v4(5)
    v7 = v7.copy(p1 = v6)
    var v10: s0 = v11
    var v9: s0 = v2
    v10 = v10.copy(p1 = v6)
    var v15: s0 = v0
    val v14: Vector[Double] = v3(0)
    v10 = v10.copy(p1 = v6)
    v6 = v6.updated(1, v14)
    v6 = v6.updated(1, v14)
    val v17: Vector[Vector[Double]] = v2.p0
    val v41: Vector[Vector[Double]] = v7.p1
    val v16: Vector[Vector[Double]] = v9.p0
    val v18: Vector[Double] = v41(1)
    var v19: Vector[Double] = v14
    v6 = v6.updated(1, v19)
    val v20: s0 = v5(3)
    v6 = v6.updated(1, v14)
    val v30: s0 = v4(5)
    val v29: Vector[Vector[Double]] = v20.p0
    var v21: s0 = v2
    val v22: Vector[Double] = v17(0)
    val v23: Vector[Vector[Double]] = v11.p0
    v21 = v21.copy(p0 = v29)
    v6 = v6.updated(0, v14)
    val v31: s0 = v5(4)
    var v27: Vector[s0] = v5
    v10 = v10.copy(p0 = v29)
    v15 = v15.copy(p0 = v16)
    val v51: s0 = v27(4)
    val v55: s0 = v27(5)
    val v49: Double = v19(0)
    v21 = v9
    v27 = v27.updated(4, v21)
    val v40: Vector[Double] = v23(0)
    var v37: Double = v49
    v19 = v19.updated(0, v49)
    v19 = v19.updated(0, v49)
    v27 = v27.updated(3, v21)
    v6 = v6.updated(0, v18)
    v6 = v6.updated(0, v22)
    val v60: Vector[Vector[Double]] = v15.p1
    v10 = v10.copy(p1 = v60)
    v21 = v31
    val v46: Vector[Vector[Double]] = v20.p0
    v9 = v9.copy(p0 = v23)
    val v42: s0 = v5(4)
    val v36: s2 = s2(v31, v30)
    val v73: Vector[Vector[Double]] = v42.p1
    v7 = v7.copy(p1 = v6)
    v19 = v19.updated(0, v37)
    v19 = v19.updated(0, v49)
    val v74: s0 = v36.p0
    val v63: Vector[Vector[Double]] = v55.p1
    val v52: Vector[Vector[Double]] = v10.p0
    v27 = v27.updated(0, v74)
    v7 = v7.copy(p0 = v52)
    v6 = v6.updated(0, v40)
    v9 = v9.copy(p1 = v73)
    v9 = v9.copy(p0 = v23)
    v6 = v6.updated(0, v22)
    v9 = v9.copy(p0 = v46)
    v9 = v9.copy(p1 = v63)
    v51
  }
  @noinline
  def f0(v0: s3, v1: s1, v2: Vector[s3], v3: Double): Double = {
    var v5: s3 = v0
    var v7: s3 = v5
    var v9: s3 = v7
    val v8: s2 = v5.p1
    val v14: Vector[s0] = v9.p0
    val v13: s0 = v14(0)
    val v21: s3 = v2(0)
    val v17: s0 = f21(v13)
    var v22: s0 = v17
    v5 = v9
    val v33: Vector[Vector[Double]] = v17.p1
    v9 = v9.copy(p0 = v14)
    val v51: s0 = v8.p0
    val v45: Vector[Vector[Double]] = v51.p1
    var v66: Vector[Vector[Double]] = v33
    val v98: s2 = v21.p1
    val v60: Vector[Vector[Double]] = v22.p1
    val v106: Vector[Double] = v60(1)
    v22 = v22.copy(p1 = v45)
    v7 = v7.copy(p1 = v98)
    v22 = v22.copy(p1 = v33)
    v22 = v22.copy(p1 = v66)
    val v93: Double = v106(0)
    v93
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), s2(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))))
    val v1: s1 = s1(Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))))), Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))))
    val v2: Vector[s3] = Vector(s3(Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), s2(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))))))
    val v3: Double = 50.0
    val start = nanoTime()
    var result: Double = 50.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}