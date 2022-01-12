import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s0,
    p2: s0
  )
  case class s3 (
    p0: s0,
    p1: s0
  )
  def f34(v0: s3): s3 = {
    var v6: s3 = v0
    var v7: s3 = v0
    var v3: s3 = v0
    var v2: s3 = v6
    val v4: s0 = v7.p0
    val v1: Vector[s3] = Vector(v3, v6, v0, v2, v0, v3)
    v2 = v2.copy(p1 = v4)
    v2 = v2.copy(p1 = v4)
    v7 = v7.copy(p0 = v4)
    val v9: s0 = v6.p1
    val v18: s0 = v7.p1
    val v17: s0 = v2.p0
    v6 = v6.copy(p1 = v17)
    var v33: s3 = v6
    var v12: s3 = v33
    v2 = v2.copy(p1 = v17)
    val v20: s3 = v1(4)
    v7 = v7.copy(p1 = v4)
    v2 = v2.copy(p0 = v17)
    v3 = v3.copy(p0 = v18)
    v2 = v2.copy(p0 = v9)
    val v22: s0 = v12.p0
    var v45: s3 = v20
    v6 = v6.copy(p1 = v4)
    v7 = v7.copy(p0 = v4)
    v33 = v33.copy(p0 = v18)
    v45 = v45.copy(p1 = v22)
    v45
  }
  def f33(v0: s1): s1 = {
    val v5: Vector[s0] = v0.p0
    var v7: s1 = v0
    val v3: Vector[s0] = v7.p0
    var v2: Vector[s0] = v5
    val v8: s0 = v5(1)
    val v10: s0 = v3(2)
    var v1: s0 = v8
    val v4: Vector[s0] = v0.p0
    v7 = v7.copy(p1 = v1)
    val v12: Vector[Vector[Double]] = v1.p0
    v2 = v2.updated(0, v10)
    var v17: s1 = v7
    val v9: s0 = v4(2)
    v2 = v2.updated(2, v10)
    v17 = v17.copy(p0 = v2)
    var v6: Vector[Vector[Double]] = v12
    v17 = v17.copy(p1 = v1)
    v1 = v1.copy(p0 = v6)
    val v14: s2 = s2(v17, v10, v8)
    val v16: Vector[Vector[Double]] = v1.p0
    val v25: s0 = v4(1)
    v2 = v2.updated(1, v8)
    v1 = v1.copy(p0 = v16)
    v17 = v17.copy(p1 = v25)
    val v26: s0 = v14.p2
    v7 = v7.copy(p1 = v9)
    v17 = v7
    v7 = v7.copy(p0 = v3)
    v2 = v2.updated(0, v26)
    v17 = v17.copy(p1 = v8)
    v7 = v7.copy(p1 = v1)
    var v29: s1 = v17
    v29
  }
  def f24(v0: Double): Double = {
    var v2: Double = v0
    var v4: Double = v0
    var v3: Double = v4
    var v7: Double = v4
    var v6: Double = v2
    val v8: Vector[Double] = Vector(v0, v4, v2, v4, v7)
    var v11: Vector[Double] = v8
    var v10: Double = v6
    val v9: Double = v11(1)
    var v12: Vector[Double] = v8
    val v22: Double = v12(4)
    v4 = v22
    val v13: Vector[Vector[Double]] = Vector(v8, v12, v11, v8, v8, v11, v11)
    v12 = v12.updated(3, v7)
    v11 = v11.updated(3, v2)
    val v17: Double = v12(3)
    v11 = v11.updated(2, v7)
    val v35: Double = v12(1)
    v11 = v11.updated(2, v10)
    var v20: Vector[Vector[Double]] = v13
    v12 = v12.updated(0, v17)
    v7 = v17
    v4 = v3
    v12 = v12.updated(2, v35)
    v20 = v13
    var v14: Vector[Vector[Double]] = v20
    val v27: Vector[Double] = v14(0)
    val v56: Double = v27(2)
    v4 = v0
    v12 = v12.updated(3, v9)
    v56
  }
  def f22(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    var v3: Vector[Vector[Double]] = v5
    val v7: Vector[Vector[Double]] = v0.p0
    val v1: Vector[Double] = v7(0)
    val v9: Double = v1(0)
    val v10: s0 = s0(v3, v9)
    var v11: Vector[Double] = v1
    v3 = v7
    val v14: Double = v1(0)
    val v17: Vector[Double] = v7(0)
    var v8: s0 = v0
    var v25: Double = v14
    val v18: Double = v1(0)
    v25 = v18
    val v13: Vector[Vector[Double]] = v0.p0
    val v19: Double = v17(0)
    v8 = v8.copy(p1 = v25)
    v8 = v10
    val v23: Double = v1(0)
    v8 = v8.copy(p1 = v23)
    var v28: s0 = v0
    v8 = v10
    var v48: Vector[Vector[Double]] = v13
    v48 = v48.updated(0, v17)
    val v30: Double = v11(0)
    v28 = v28.copy(p1 = v19)
    var v33: s0 = v10
    v8 = v8.copy(p1 = v30)
    v33 = v33.copy(p1 = v23)
    v33 = v33.copy(p0 = v7)
    v8 = v8.copy(p0 = v5)
    v48 = v48.updated(0, v17)
    var v50: s0 = v33
    var v43: s0 = v50
    val v60: Double = v28.p1
    val v74: s3 = s3(v0, v43)
    var v37: s3 = v74
    var v71: s3 = v37
    v50 = v50.copy(p0 = v48)
    val v81: s3 = f34(v74)
    v8 = v8.copy(p0 = v3)
    v8 = v8.copy(p1 = v60)
    val v59: s0 = v81.p1
    val v132: s3 = f34(v74)
    val v85: s0 = v74.p1
    val v96: s0 = v71.p0
    val v148: Vector[Vector[Double]] = v8.p0
    v37 = v37.copy(p1 = v59)
    v33 = v8
    val v94: Vector[Vector[Double]] = v85.p0
    v71 = v132
    v37 = v37.copy(p1 = v33)
    v43 = v43.copy(p0 = v148)
    v8 = v8.copy(p0 = v94)
    v8 = v8.copy(p0 = v148)
    v96
  }
  @noinline
  def f0(v0: Vector[s2], v1: Vector[s2], v2: Vector[s1], v3: Double): Double = {
    var v8: Vector[s2] = v0
    val v4: s2 = v8(0)
    val v9: s0 = v4.p2
    v8 = v8.updated(0, v4)
    var v14: s2 = v4
    val v7: Vector[Vector[Double]] = v9.p0
    v14 = v14.copy(p2 = v9)
    val v5: s0 = f22(v9)
    v8 = v8.updated(1, v4)
    v14 = v14.copy(p2 = v5)
    val v13: s0 = v14.p1
    v8 = v8.updated(0, v14)
    val v10: Double = f24(v3)
    val v6: Double = v13.p1
    val v16: s1 = v2(0)
    val v11: s1 = f33(v16)
    val v28: s2 = v1(0)
    v14 = v14.copy(p0 = v11)
    v8 = v8.updated(1, v28)
    var v37: s0 = v9
    var v70: Double = v10
    v37 = v37.copy(p0 = v7)
    val v42: Double = v70 * v6
    val v45: Double = v37.p1
    v70 = v45
    v42
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s1(Vector(s0(Vector(Vector(0.0)), 1.0), s0(Vector(Vector(2.0)), 3.0), s0(Vector(Vector(4.0)), 5.0)), s0(Vector(Vector(6.0)), 7.0)), s0(Vector(Vector(8.0)), 9.0), s0(Vector(Vector(10.0)), 11.0)), s2(s1(Vector(s0(Vector(Vector(12.0)), 13.0), s0(Vector(Vector(14.0)), 15.0), s0(Vector(Vector(16.0)), 17.0)), s0(Vector(Vector(18.0)), 19.0)), s0(Vector(Vector(20.0)), 21.0), s0(Vector(Vector(22.0)), 23.0)))
    val v1: Vector[s2] = Vector(s2(s1(Vector(s0(Vector(Vector(24.0)), 25.0), s0(Vector(Vector(26.0)), 27.0), s0(Vector(Vector(28.0)), 29.0)), s0(Vector(Vector(30.0)), 31.0)), s0(Vector(Vector(32.0)), 33.0), s0(Vector(Vector(34.0)), 35.0)))
    val v2: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(36.0)), 37.0), s0(Vector(Vector(38.0)), 39.0), s0(Vector(Vector(40.0)), 41.0)), s0(Vector(Vector(42.0)), 43.0)), s1(Vector(s0(Vector(Vector(44.0)), 45.0), s0(Vector(Vector(46.0)), 47.0), s0(Vector(Vector(48.0)), 49.0)), s0(Vector(Vector(50.0)), 51.0)), s1(Vector(s0(Vector(Vector(52.0)), 53.0), s0(Vector(Vector(54.0)), 55.0), s0(Vector(Vector(56.0)), 57.0)), s0(Vector(Vector(58.0)), 59.0)))
    val v3: Double = 60.0
    val start = nanoTime()
    var result: Double = 60.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}