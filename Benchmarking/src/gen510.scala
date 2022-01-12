import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s3 (
    p0: s0,
    p1: Vector[s0]
  )
  def f2(v0: s3): s3 = {
    var v5: s3 = v0
    var v3: s3 = v5
    val v4: Vector[s0] = v3.p1
    val v6: s0 = v5.p0
    val v10: Vector[Vector[Double]] = v6.p0
    var v8: s3 = v3
    v3 = v3.copy(p1 = v4)
    val v7: s0 = v4(0)
    v3 = v3.copy(p1 = v4)
    var v2: s3 = v8
    val v1: s0 = v4(1)
    v2 = v2.copy(p0 = v1)
    val v13: Vector[Vector[Double]] = v7.p0
    var v15: Vector[Vector[Double]] = v10
    var v22: s0 = v7
    v15 = v13
    val v19: Vector[s0] = v3.p1
    val v17: Vector[s0] = v5.p1
    val v18: s0 = v8.p0
    val v12: Vector[Double] = v13(1)
    val v14: Vector[Double] = v13(0)
    v3 = v3.copy(p0 = v18)
    v22 = v22.copy(p0 = v15)
    val v20: Vector[Double] = v10(0)
    v15 = v15.updated(0, v14)
    v15 = v15.updated(1, v20)
    v15 = v15.updated(0, v14)
    v3 = v3.copy(p1 = v17)
    v15 = v15.updated(0, v14)
    v2 = v2.copy(p0 = v22)
    v15 = v15.updated(1, v12)
    v15 = v15.updated(1, v12)
    val v44: Vector[s0] = v3.p1
    val v50: s0 = v19(1)
    v22 = v22.copy(p0 = v15)
    v8 = v8.copy(p1 = v44)
    v8 = v8.copy(p0 = v50)
    v2
  }
  @noinline
  def f0(v0: s3, v1: Vector[s3], v2: Double): Double = {
    val v5: s3 = v1(0)
    val v7: s3 = f2(v0)
    var v4: s3 = v7
    val v9: s3 = f2(v4)
    var v6: s3 = v0
    var v13: Vector[s3] = v1
    val v18: Vector[s0] = v5.p1
    v6 = v6.copy(p1 = v18)
    val v12: s3 = f2(v9)
    v4 = v4.copy(p1 = v18)
    val v27: s3 = v13(0)
    v13 = v13.updated(0, v4)
    var v14: s3 = v0
    v13 = v13.updated(0, v0)
    val v22: s3 = f2(v7)
    val v38: Vector[s0] = v6.p1
    val v11: Vector[s0] = v12.p1
    val v20: s0 = v9.p0
    val v28: Vector[Vector[Double]] = v20.p0
    val v35: s0 = v11(1)
    val v25: s3 = f2(v14)
    val v23: s0 = v14.p0
    val v48: s0 = v38(0)
    v14 = v14.copy(p0 = v48)
    v13 = v13.updated(0, v6)
    v6 = v6.copy(p0 = v23)
    v4 = v4.copy(p1 = v38)
    val v33: s3 = f2(v22)
    val v30: Vector[s0] = v25.p1
    val v26: s3 = f2(v6)
    val v41: s3 = f2(v26)
    val v139: Vector[Double] = v28(1)
    val v64: Vector[s0] = v27.p1
    val v49: Vector[s0] = v0.p1
    v4 = v4.copy(p0 = v48)
    val v88: s3 = f2(v41)
    v6 = v6.copy(p1 = v30)
    val v62: Double = v139(0)
    val v81: s3 = f2(v33)
    v4 = v4.copy(p1 = v49)
    val v148: s3 = f2(v88)
    v6 = v6.copy(p0 = v35)
    v13 = v13.updated(0, v9)
    var v122: s3 = v81
    v4 = v4.copy(p1 = v64)
    v13 = v13.updated(0, v122)
    v13 = v13.updated(0, v148)
    v6 = v6.copy(p0 = v35)
    v62
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))))
    val v1: Vector[s3] = Vector(s3(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))))
    val v2: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}