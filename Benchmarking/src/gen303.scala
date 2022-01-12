import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Double,
    p1: s0
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: s2
  )
  def f100(v0: Vector[s2], v1: s0): s0 = {
    val v4: Vector[Vector[Double]] = v1.p1
    val v3: Vector[Vector[Double]] = v1.p0
    var v7: Vector[s2] = v0
    val v2: Vector[Double] = v3(0)
    var v5: Vector[Double] = v2
    val v11: Vector[Vector[Double]] = v1.p1
    val v6: s2 = v7(0)
    val v9: Vector[Vector[Double]] = v1.p0
    v7 = v7.updated(0, v6)
    val v18: s0 = v6.p1
    var v59: s0 = v18
    var v15: Vector[Double] = v5
    var v49: s2 = v6
    val v32: Double = v15(0)
    v5 = v5.updated(0, v32)
    var v35: Vector[Vector[Double]] = v4
    val v30: s0 = v49.p1
    v59 = v59.copy(p0 = v9)
    v59 = v59.copy(p1 = v11)
    v49 = v49.copy(p1 = v59)
    v49 = v49.copy(p0 = v32)
    v7 = v7.updated(0, v49)
    var v21: s0 = v30
    v21 = v21.copy(p1 = v35)
    v49 = v49.copy(p0 = v32)
    v35 = v35.updated(1, v15)
    v21
  }
  def f87(v0: Vector[s2]): Vector[s2] = {
    val v4: Vector[Vector[s2]] = Vector(v0)
    val v7: s2 = v0(0)
    var v3: Vector[s2] = v0
    val v1: Vector[s2] = v4(0)
    var v8: s2 = v7
    val v2: s0 = v8.p1
    var v10: s0 = v2
    val v19: Vector[s2] = v4(0)
    val v5: s0 = f100(v1, v10)
    val v14: s2 = v19(0)
    var v24: Vector[s2] = v3
    val v12: s0 = f100(v19, v10)
    val v26: s2 = v1(0)
    val v30: Vector[s2] = Vector(v14, v7, v8, v8, v26)
    v8 = v8.copy(p1 = v12)
    val v20: Vector[Vector[Double]] = v12.p0
    val v21: s0 = f100(v24, v5)
    val v45: s0 = f100(v24, v10)
    v8 = v8.copy(p1 = v21)
    val v41: Double = v7.p0
    val v46: s2 = v30(2)
    v10 = v10.copy(p0 = v20)
    v8 = v8.copy(p1 = v10)
    v3 = v3.updated(0, v7)
    var v198: Vector[s2] = v0
    v198 = v198.updated(0, v46)
    v8 = v8.copy(p1 = v45)
    v8 = v8.copy(p0 = v41)
    v198
  }
  def f73(v0: s0): s0 = {
    var v3: s0 = v0
    val v5: Vector[Vector[Double]] = v3.p0
    val v7: Vector[Double] = v5(0)
    val v2: Double = v7(0)
    val v13: Vector[Double] = v5(0)
    v3 = v3.copy(p0 = v5)
    v3 = v3.copy(p0 = v5)
    v3 = v3.copy(p0 = v5)
    var v14: Vector[Vector[Double]] = v5
    v14 = v14.updated(0, v13)
    val v4: Vector[Double] = v14(0)
    var v8: Vector[Vector[Double]] = v5
    val v9: Vector[Vector[Double]] = v3.p1
    v14 = v14.updated(0, v7)
    val v23: Vector[Vector[Double]] = v0.p1
    var v19: Vector[Vector[Double]] = v23
    val v11: Vector[Double] = v14(0)
    val v34: Vector[Vector[Double]] = v3.p0
    v3 = v3.copy(p1 = v9)
    val v20: Vector[Vector[Double]] = v0.p1
    val v15: Vector[Vector[Double]] = v0.p1
    v14 = v14.updated(0, v4)
    val v26: Vector[Vector[Double]] = v3.p1
    val v31: Vector[Double] = v14(0)
    v3 = v3.copy(p0 = v34)
    v3 = v3.copy(p1 = v19)
    v3 = v3.copy(p0 = v5)
    var v28: Vector[Vector[Double]] = v20
    var v27: Vector[Double] = v13
    v3 = v0
    var v64: s0 = v0
    var v37: Vector[Vector[Double]] = v5
    val v38: Vector[Double] = v37(0)
    v19 = v19.updated(1, v38)
    var v41: s0 = v64
    v3 = v3.copy(p1 = v28)
    v3 = v3.copy(p0 = v14)
    v14 = v14.updated(0, v31)
    v64 = v64.copy(p1 = v15)
    var v40: Vector[Double] = v27
    var v110: Vector[Vector[Double]] = v14
    v37 = v37.updated(0, v11)
    v64 = v64.copy(p1 = v26)
    val v33: Vector[Vector[Double]] = v0.p0
    val v103: Vector[Double] = v19(1)
    var v52: Vector[Double] = v13
    v19 = v19.updated(1, v52)
    val v50: Vector[Double] = v110(0)
    v64 = v64.copy(p0 = v8)
    v41 = v41.copy(p1 = v9)
    v28 = v28.updated(0, v50)
    v37 = v37.updated(0, v40)
    v14 = v33
    v28 = v28.updated(1, v40)
    v19 = v19.updated(1, v103)
    v40 = v40.updated(0, v2)
    val v53: Vector[Vector[Double]] = v3.p1
    v64 = v64.copy(p1 = v53)
    v64 = v64.copy(p1 = v20)
    v19 = v19.updated(1, v7)
    v41
  }
  def f32(v0: Double): Double = {
    var v2: Double = v0
    val v6: Vector[Double] = Vector(v2, v0, v0, v0, v2, v0, v0)
    val v7: Double = v6(4)
    var v8: Vector[Double] = v6
    v8 = v8.updated(0, v7)
    val v11: Double = v6(5)
    var v9: Double = v2
    val v10: Double = v6(2)
    val v1: Double = v8(2)
    v8 = v8.updated(4, v9)
    v8 = v8.updated(1, v10)
    v8 = v8.updated(0, v11)
    v8 = v8.updated(2, v2)
    v8 = v8.updated(5, v11)
    v8 = v8.updated(5, v0)
    v8 = v8.updated(2, v1)
    var v86: Vector[Double] = v8
    val v19: Double = v86(3)
    v19
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v4: Vector[Vector[s2]] = v0.p0
    val v6: Vector[s2] = v4(0)
    val v3: s2 = v0.p1
    val v11: Double = f32(v1)
    val v7: s2 = v0.p1
    val v8: Double = v1 + v11
    val v10: Double = f32(v8)
    val v16: Vector[s2] = f87(v6)
    val v12: s2 = v0.p1
    val v19: s0 = v3.p1
    val v22: s0 = v7.p1
    val v24: s2 = v16(0)
    var v34: s2 = v12
    var v69: s2 = v34
    val v44: Double = v69.p0
    v69 = v69.copy(p1 = v22)
    v69 = v69.copy(p0 = v10)
    val v54: s0 = f73(v19)
    v69 = v24
    v34 = v34.copy(p1 = v22)
    val v97: s0 = v3.p1
    v34 = v34.copy(p1 = v97)
    v69 = v69.copy(p1 = v54)
    v44
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(Vector(s2(0.0, s0(Vector(Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))))), s2(4.0, s0(Vector(Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))))
    val v1: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}