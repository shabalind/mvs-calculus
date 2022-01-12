import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: Double
  )
  case class s4 (
    p0: s3,
    p1: s1
  )
  def f12(v0: s0): s0 = {
    val v2: Vector[Double] = v0.p0
    val v7: Double = v2(0)
    var v4: s0 = v0
    v4 = v4.copy(p0 = v2)
    val v9: Vector[Vector[Double]] = v0.p1
    val v1: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Double] = v4.p0
    var v13: Vector[Vector[Double]] = v9
    v4 = v4.copy(p0 = v5)
    var v19: s0 = v4
    val v30: Vector[Double] = v1(1)
    v4 = v4.copy(p1 = v13)
    var v11: Vector[Vector[Double]] = v9
    v19 = v19.copy(p1 = v13)
    val v17: Vector[Double] = v4.p0
    var v25: Vector[Vector[Double]] = v13
    val v27: Vector[Double] = v19.p0
    val v22: Vector[Double] = Vector(v7, v7)
    val v52: Vector[Double] = v11(2)
    v19 = v19.copy(p0 = v27)
    var v47: Vector[Double] = v30
    v13 = v13.updated(0, v47)
    v19 = v19.copy(p0 = v17)
    val v57: s0 = s0(v27, v11)
    v19 = v19.copy(p0 = v22)
    v13 = v13.updated(1, v52)
    v19 = v19.copy(p1 = v25)
    v13 = v13.updated(0, v30)
    v57
  }
  def f11(v0: Vector[s0]): Vector[s0] = {
    var v5: Vector[s0] = v0
    var v4: Vector[s0] = v0
    var v2: Vector[s0] = v5
    var v3: Vector[s0] = v0
    var v7: Vector[s0] = v4
    val v6: s0 = v3(0)
    val v8: s0 = f12(v6)
    v3 = v0
    val v1: Vector[Double] = v8.p0
    val v11: Vector[Vector[Double]] = v6.p1
    val v10: s0 = v0(1)
    val v9: s0 = f12(v6)
    v7 = v7.updated(1, v8)
    val v18: s0 = s0(v1, v11)
    v4 = v3
    val v16: s0 = f12(v9)
    val v26: Vector[Vector[s0]] = Vector(v7, v7, v0, v0, v2)
    v2 = v2.updated(0, v10)
    val v41: s0 = f12(v9)
    v7 = v7.updated(1, v16)
    var v33: Vector[Vector[s0]] = v26
    val v94: Vector[s0] = v33(4)
    v7 = v7.updated(0, v41)
    v5 = v5.updated(0, v18)
    v94
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    var v5: Vector[s1] = v0
    val v4: s1 = v5(1)
    val v7: Vector[Vector[s0]] = v4.p0
    var v11: s1 = v4
    val v3: Vector[s0] = v7(0)
    v11 = v11.copy(p0 = v7)
    var v9: Vector[Vector[s0]] = v7
    v11 = v11.copy(p0 = v9)
    v11 = v11.copy(p0 = v9)
    val v13: Vector[s0] = v11.p1
    v9 = v9.updated(0, v3)
    val v10: Vector[s0] = f11(v13)
    val v12: Vector[s0] = f11(v10)
    val v38: s0 = v3(0)
    val v23: Vector[Vector[Double]] = v38.p1
    v5 = v5.updated(2, v11)
    var v14: s0 = v38
    v11 = v11.copy(p1 = v12)
    var v25: s0 = v38
    var v18: Vector[s0] = v3
    v25 = v25.copy(p1 = v23)
    var v41: Vector[s0] = v18
    val v22: s0 = v41(0)
    val v21: s0 = f12(v25)
    v25 = v25.copy(p1 = v23)
    val v61: s3 = s3(v11, v1)
    val v56: s0 = v3(0)
    val v40: s4 = s4(v61, v4)
    var v68: Vector[s0] = v41
    v14 = v56
    v14 = v14.copy(p1 = v23)
    v14 = v14.copy(p1 = v23)
    val v42: Vector[Double] = v21.p0
    v14 = v14.copy(p1 = v23)
    val v47: s3 = v40.p0
    v18 = v18.updated(0, v14)
    v9 = v9.updated(0, v41)
    v25 = v25.copy(p0 = v42)
    var v52: Vector[Vector[Double]] = v23
    val v130: Double = v47.p1
    v14 = v14.copy(p1 = v52)
    v68 = v68.updated(0, v22)
    v14 = v14.copy(p0 = v42)
    v11 = v11.copy(p1 = v13)
    v9 = v9.updated(1, v68)
    v130
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(Vector(s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), Vector(s0(Vector(5.0, 6.0), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))), Vector(s0(Vector(10.0, 11.0), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(15.0, 16.0), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), s1(Vector(Vector(s0(Vector(20.0, 21.0), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), Vector(s0(Vector(25.0, 26.0), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), Vector(s0(Vector(30.0, 31.0), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), s0(Vector(35.0, 36.0), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), s1(Vector(Vector(s0(Vector(40.0, 41.0), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))), Vector(s0(Vector(45.0, 46.0), Vector(Vector(47.0), Vector(48.0), Vector(49.0))))), Vector(s0(Vector(50.0, 51.0), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), s0(Vector(55.0, 56.0), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))
    val v1: Double = 60.0
    val start = nanoTime()
    var result: Double = 60.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}