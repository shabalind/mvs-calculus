import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[s2]
  )
  def f77(v0: Vector[s0]): Vector[s0] = {
    val v6: s0 = v0(1)
    var v3: s0 = v6
    val v4: s0 = v0(0)
    v3 = v6
    var v7: Vector[s0] = v0
    val v5: Vector[s0] = Vector(v6, v4, v4, v3, v6)
    val v9: s0 = v5(0)
    val v1: s0 = v5(0)
    val v2: Vector[Vector[Double]] = v4.p1
    val v17: Vector[Vector[Double]] = v9.p0
    v3 = v3.copy(p0 = v17)
    v7 = v7.updated(1, v1)
    v3 = v9
    v3 = v3.copy(p1 = v2)
    v3 = v3.copy(p1 = v2)
    v7 = v7.updated(1, v6)
    v7
  }
  def f64(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p1
    val v8: Vector[Vector[Double]] = v0.p0
    var v3: Vector[Vector[Double]] = v8
    val v7: Vector[Double] = v4(1)
    var v6: Vector[Double] = v7
    val v1: Vector[Double] = v3(0)
    v3 = v8
    v6 = v1
    var v12: Vector[Vector[Double]] = v8
    v3 = v3.updated(0, v7)
    val v15: Vector[Double] = v12(0)
    v3 = v3.updated(0, v15)
    val v21: Vector[Vector[Double]] = v0.p1
    var v13: s0 = v0
    val v23: Double = v7(0)
    v6 = v6.updated(0, v23)
    val v19: Vector[Double] = v21(0)
    v6 = v6.updated(0, v23)
    var v25: s0 = v13
    val v10: s0 = s0(v3, v21)
    v3 = v3.updated(0, v6)
    v3 = v3.updated(0, v7)
    v3 = v3.updated(0, v15)
    val v28: Vector[s0] = Vector(v0, v10, v0)
    val v34: Vector[s0] = f77(v28)
    val v61: Vector[Vector[Double]] = v25.p0
    val v56: Vector[Double] = v61(0)
    var v50: Vector[s0] = v34
    val v52: s0 = v50(1)
    v12 = v12.updated(0, v56)
    v3 = v3.updated(0, v19)
    v52
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v2: Vector[s2] = v0.p0
    val v3: s2 = v2(0)
    val v8: Vector[s0] = v3.p0
    val v20: s0 = v8(1)
    val v27: s0 = f64(v20)
    val v52: Vector[Vector[Double]] = v27.p1
    var v64: Vector[Vector[Double]] = v52
    val v95: Vector[Double] = v64(1)
    val v100: Double = v95(0)
    v100
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))))), Vector(s2(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)))), Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))))))
    val v1: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}