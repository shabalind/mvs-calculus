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
  case class s3 (
    p0: Vector[s0],
    p1: s0
  )
  def f115(v0: s3): s3 = {
    val v6: s0 = v0.p1
    var v5: s3 = v0
    val v3: Vector[s0] = v5.p0
    v5 = v5.copy(p1 = v6)
    val v2: s0 = v3(2)
    var v7: s0 = v2
    val v4: Vector[Vector[Double]] = v7.p1
    val v14: s0 = v3(0)
    val v18: Vector[s0] = v0.p0
    var v13: s0 = v7
    v7 = v7.copy(p1 = v4)
    var v10: s3 = v5
    var v12: s3 = v10
    v7 = v7.copy(p1 = v4)
    val v27: Vector[Vector[Double]] = v7.p1
    v7 = v7.copy(p1 = v27)
    var v21: s3 = v12
    val v24: Vector[s0] = v21.p0
    v5 = v5.copy(p0 = v18)
    var v38: s0 = v13
    v12 = v12.copy(p1 = v38)
    v12 = v12.copy(p0 = v24)
    val v51: Vector[Vector[Double]] = v14.p0
    v12 = v12.copy(p1 = v38)
    var v54: s3 = v12
    v21 = v21.copy(p0 = v24)
    var v48: s3 = v54
    v38 = v13
    v38 = v38.copy(p0 = v51)
    v48
  }
  def f113(v0: s0): s0 = {
    var v3: s0 = v0
    v3 = v0
    val v12: Vector[Vector[Double]] = v3.p1
    var v9: s0 = v0
    v9 = v9.copy(p1 = v12)
    v9
  }
  def f100(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p0
    var v5: Vector[Vector[Double]] = v3
    val v9: Vector[Vector[Double]] = v0.p0
    val v4: s0 = f113(v0)
    val v15: Vector[Double] = v9(2)
    v5 = v5.updated(0, v15)
    val v20: s0 = f113(v0)
    val v22: s0 = f113(v4)
    val v11: s1 = s1(v0, v22)
    val v24: s0 = f113(v4)
    var v28: s1 = v11
    v28 = v28.copy(p1 = v22)
    val v17: s0 = f113(v4)
    v28 = v28.copy(p1 = v20)
    v28 = v28.copy(p1 = v24)
    val v27: Vector[Vector[Double]] = v20.p1
    val v92: Vector[Double] = v27(0)
    v5 = v5.updated(0, v92)
    v28 = v28.copy(p0 = v24)
    val v86: s0 = f113(v0)
    val v38: s0 = f113(v17)
    v28 = v28.copy(p1 = v38)
    v28 = v28.copy(p0 = v22)
    val v74: Vector[Vector[Double]] = v20.p0
    val v77: s0 = v28.p0
    val v121: s0 = f113(v77)
    val v104: Vector[Vector[Vector[Double]]] = Vector(v5, v74)
    v28 = v28.copy(p0 = v86)
    val v185: Vector[Vector[Double]] = v104(1)
    var v106: s0 = v121
    v106 = v106.copy(p0 = v185)
    v106
  }
  def f96(v0: s3): s3 = {
    val v7: s3 = f115(v0)
    val v29: s3 = f115(v7)
    var v18: s3 = v29
    v18
  }
  def f61(v0: s0): s0 = {
    var v3: s0 = v0
    val v6: Vector[Vector[Double]] = v0.p0
    v3 = v3.copy(p0 = v6)
    val v4: Vector[Vector[Double]] = v0.p1
    val v1: Vector[Double] = v4(0)
    val v12: s0 = f113(v3)
    var v7: Vector[Double] = v1
    var v23: Vector[Vector[Double]] = v6
    v23 = v23.updated(1, v7)
    v23 = v23.updated(1, v1)
    v23 = v23.updated(1, v1)
    var v35: s0 = v12
    v23 = v23.updated(0, v1)
    v35 = v35.copy(p0 = v23)
    val v19: Vector[Vector[Double]] = v0.p1
    val v49: Vector[Double] = v19(0)
    v23 = v23.updated(2, v49)
    v35
  }
  def f42(v0: s3): s3 = {
    val v2: s3 = f115(v0)
    val v4: s3 = f115(v2)
    val v8: s3 = f96(v0)
    val v5: s0 = v8.p1
    val v6: s1 = s1(v5, v5)
    val v1: Vector[s0] = v8.p0
    val v11: s3 = f115(v2)
    val v25: s0 = v1(2)
    val v10: s0 = f113(v5)
    val v3: s0 = f61(v25)
    val v18: s0 = f100(v25)
    val v19: s0 = v6.p1
    var v12: s3 = v4
    v12 = v12.copy(p1 = v18)
    val v13: Vector[s0] = v2.p0
    val v21: Vector[s0] = Vector(v19, v10, v19)
    val v59: s3 = f115(v0)
    var v48: s3 = v11
    v12 = v12.copy(p0 = v21)
    val v32: s3 = s3(v13, v18)
    val v57: Vector[s3] = Vector(v32, v2, v48, v32, v0, v59, v12)
    v48 = v48.copy(p0 = v1)
    var v61: s3 = v0
    val v40: s3 = v57(3)
    val v70: s3 = v57(4)
    val v62: Vector[s3] = Vector(v40, v70, v32, v11, v61, v61)
    v48 = v48.copy(p0 = v13)
    val v215: s3 = v62(0)
    var v124: s3 = v215
    v48 = v48.copy(p1 = v3)
    v48 = v48.copy(p0 = v13)
    v124
  }
  @noinline
  def f0(v0: s0, v1: s3, v2: Double): Double = {
    val v5: s0 = f100(v0)
    var v7: s3 = v1
    val v4: s3 = f96(v7)
    val v8: s0 = v4.p1
    v7 = v7.copy(p1 = v8)
    val v11: s3 = f42(v4)
    val v12: Vector[s0] = Vector(v0, v5, v5)
    var v14: s3 = v1
    v7 = v7.copy(p1 = v8)
    val v49: s0 = v14.p1
    val v21: Vector[Vector[Double]] = v0.p0
    val v22: s0 = v11.p1
    val v23: s0 = f113(v22)
    var v53: s0 = v22
    val v41: Vector[Vector[Double]] = v23.p1
    v7 = v7.copy(p1 = v49)
    val v33: Vector[Double] = v41(0)
    v14 = v14.copy(p0 = v12)
    val v34: Double = v33(0)
    v53 = v53.copy(p0 = v21)
    v7 = v7.copy(p1 = v53)
    val v64: s0 = v4.p1
    v7 = v7.copy(p1 = v64)
    v34
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))
    val v1: s3 = s3(Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))))
    val v2: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}