import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s3 (
    p0: Vector[s0],
    p1: s0
  )
  def f22(v0: s3): s3 = {
    var v5: s3 = v0
    var v7: s3 = v5
    val v4: Vector[s3] = Vector(v5, v7)
    val v3: s0 = v5.p1
    val v8: Vector[s0] = v7.p0
    val v12: s0 = v8(1)
    val v14: s3 = s3(v8, v3)
    v5 = v5.copy(p0 = v8)
    v7 = v7.copy(p1 = v12)
    val v13: s3 = v4(0)
    val v15: s0 = v13.p1
    v5 = v5.copy(p1 = v15)
    v14
  }
  def f9(v0: Vector[s0]): Vector[s0] = {
    val v5: s0 = v0(2)
    val v1: Vector[Vector[Double]] = v5.p0
    val v4: s0 = v0(2)
    val v2: Vector[Double] = v5.p1
    var v13: s0 = v5
    val v11: s0 = v0(0)
    var v17: Vector[s0] = v0
    v13 = v13.copy(p0 = v1)
    val v10: Vector[Double] = v11.p1
    v13 = v13.copy(p0 = v1)
    v17 = v17.updated(2, v13)
    v13 = v13.copy(p1 = v10)
    v13 = v13.copy(p1 = v2)
    val v56: s3 = s3(v17, v4)
    val v34: s3 = f22(v56)
    val v49: s3 = f22(v34)
    val v93: s3 = f22(v49)
    val v59: s3 = f22(v93)
    v17 = v0
    val v63: s3 = f22(v59)
    val v123: s3 = f22(v63)
    val v111: Vector[s0] = v123.p0
    v111
  }
  def f3(v0: Double): Double = {
    var v6: Double = v0
    var v7: Double = v0
    var v3: Double = v6
    var v5: Double = v6
    var v10: Double = v5
    var v12: Double = v10
    v12 = v3
    v12 = v7
    v12
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    var v7: s3 = v0
    val v6: Double = f3(v1)
    val v3: s0 = v7.p1
    v7 = v7.copy(p1 = v3)
    v7 = v7.copy(p1 = v3)
    v7 = v7.copy(p1 = v3)
    val v20: s3 = f22(v0)
    var v11: s0 = v3
    val v12: Vector[Double] = v3.p1
    val v14: Vector[Vector[Double]] = v3.p0
    val v17: Vector[Double] = v14(1)
    var v32: Vector[Double] = v17
    var v22: s0 = v3
    var v21: s0 = v3
    val v35: s0 = v20.p1
    var v25: Vector[Vector[Double]] = v14
    var v28: s0 = v35
    val v27: Vector[s0] = v7.p0
    v28 = v28.copy(p0 = v14)
    var v75: Vector[Vector[Double]] = v14
    val v52: s0 = v27(2)
    var v43: Vector[Double] = v32
    var v61: Vector[Vector[Double]] = v75
    val v44: Vector[Vector[Double]] = v11.p0
    v75 = v44
    var v60: s0 = v21
    val v81: Vector[s0] = f9(v27)
    val v69: s0 = v27(1)
    v75 = v75.updated(0, v43)
    v32 = v32.updated(0, v6)
    v7 = v7.copy(p1 = v22)
    v25 = v25.updated(2, v17)
    v22 = v22.copy(p1 = v12)
    var v49: s0 = v28
    v21 = v21.copy(p0 = v25)
    val v70: Vector[Double] = v11.p1
    val v53: Vector[Double] = v69.p1
    var v48: s0 = v52
    val v110: s0 = v81(1)
    val v56: Vector[Double] = v110.p1
    v7 = v7.copy(p1 = v60)
    v21 = v21.copy(p1 = v56)
    v28 = v28.copy(p0 = v14)
    var v68: Vector[Double] = v17
    v49 = v49.copy(p1 = v70)
    val v100: Vector[Double] = v49.p1
    v28 = v28.copy(p0 = v25)
    v75 = v75.updated(0, v68)
    v21 = v21.copy(p1 = v100)
    v75 = v75.updated(2, v17)
    val v74: Double = v100(0)
    v25 = v25.updated(0, v32)
    v28 = v28.copy(p0 = v61)
    v60 = v69
    v28 = v28.copy(p1 = v53)
    v7 = v7.copy(p1 = v48)
    v74
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0, 4.0)), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(8.0, 9.0)), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(13.0, 14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(18.0, 19.0)))
    val v1: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}