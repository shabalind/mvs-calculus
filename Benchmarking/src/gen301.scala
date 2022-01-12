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
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s3 (
    p0: s2,
    p1: Vector[s1]
  )
  def f40(v0: s2): s2 = {
    val v3: s0 = v0.p1
    val v1: Vector[Vector[Double]] = v3.p0
    val v4: s0 = v0.p1
    var v8: s2 = v0
    var v17: s2 = v0
    val v7: Vector[Double] = v1(1)
    var v9: s0 = v4
    v9 = v9.copy(p0 = v1)
    val v11: s0 = v8.p1
    v17 = v17.copy(p1 = v11)
    v9 = v9.copy(p0 = v1)
    var v30: s2 = v17
    val v23: Vector[Vector[Double]] = v3.p1
    val v37: Vector[Vector[s0]] = v8.p0
    val v16: Vector[s0] = v37(0)
    v9 = v9.copy(p0 = v1)
    val v36: s0 = v30.p1
    v8 = v8.copy(p1 = v36)
    var v47: Vector[Vector[Double]] = v23
    v9 = v9.copy(p1 = v47)
    val v72: s0 = v16(0)
    v8 = v8.copy(p1 = v9)
    v47 = v47.updated(0, v7)
    v8 = v8.copy(p1 = v4)
    v8 = v30
    v17 = v17.copy(p1 = v11)
    v30 = v30.copy(p1 = v72)
    v8
  }
  def f33(v0: Vector[s0]): Vector[s0] = {
    val v1: Vector[Vector[s0]] = Vector(v0, v0, v0)
    var v7: Vector[Vector[s0]] = v1
    v7 = v1
    v7 = v7.updated(1, v0)
    v7 = v1
    v7 = v1
    v7 = v7.updated(2, v0)
    v7 = v1
    val v26: Vector[s0] = v7(2)
    v26
  }
  def f6(v0: s0, v1: Vector[Vector[s0]], v2: Double, v3: s0, v4: s3): Double = {
    v2
  }
  def f3(v0: s3): s3 = {
    var v2: s3 = v0
    val v5: s2 = v2.p0
    var v7: s3 = v0
    var v4: s2 = v5
    var v3: s3 = v7
    var v10: s3 = v7
    var v8: s2 = v4
    v3 = v3.copy(p0 = v8)
    val v9: s2 = v3.p0
    var v37: s3 = v10
    val v30: s2 = f40(v9)
    val v16: s2 = f40(v9)
    val v38: Vector[Vector[s0]] = v30.p0
    val v25: Vector[s1] = v7.p1
    var v31: s3 = v0
    val v34: Vector[s0] = v38(0)
    val v41: Vector[s0] = f33(v34)
    val v42: s0 = v41(0)
    v37 = v37.copy(p1 = v25)
    v37 = v37.copy(p0 = v30)
    v10 = v10.copy(p0 = v16)
    v7 = v7.copy(p0 = v30)
    val v24: s1 = v25(0)
    v2 = v2.copy(p0 = v16)
    v8 = v8.copy(p1 = v42)
    var v49: Vector[s1] = v25
    v49 = v49.updated(0, v24)
    v49 = v49.updated(0, v24)
    v10 = v10.copy(p1 = v49)
    v10 = v0
    v10 = v10.copy(p1 = v49)
    v10 = v31
    v10 = v10.copy(p1 = v49)
    v49 = v49.updated(0, v24)
    v37
  }
  @noinline
  def f0(v0: s3, v1: Vector[Vector[s0]], v2: Double): Double = {
    val v8: s2 = v0.p0
    val v6: Vector[s0] = v1(1)
    val v3: Vector[s0] = v1(0)
    val v7: s0 = v8.p1
    val v5: s0 = v3(0)
    var v10: s0 = v5
    val v31: Vector[Vector[Double]] = v7.p1
    val v9: Vector[Double] = v31(1)
    v10 = v5
    val v29: Vector[Vector[s0]] = Vector(v3, v6, v3, v6, v3, v3, v6)
    val v12: s3 = f3(v0)
    val v18: Double = f6(v10, v1, v2, v10, v0)
    val v21: Vector[s0] = v29(4)
    v10 = v10.copy(p1 = v31)
    val v40: Vector[Vector[Double]] = v10.p0
    var v23: Vector[Vector[Double]] = v40
    var v41: Vector[Vector[s0]] = v1
    val v76: s0 = v21(0)
    v23 = v23.updated(0, v9)
    v10 = v10.copy(p1 = v40)
    val v34: s3 = f3(v12)
    v10 = v10.copy(p1 = v23)
    v10 = v10.copy(p1 = v40)
    v41 = v41.updated(2, v21)
    val v65: s2 = v0.p0
    v41 = v41.updated(0, v21)
    val v50: s0 = v65.p1
    v10 = v10.copy(p1 = v23)
    val v124: Double = f6(v50, v41, v18, v76, v34)
    v124
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s1(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))))
    val v2: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}