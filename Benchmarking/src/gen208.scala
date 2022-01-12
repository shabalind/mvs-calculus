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
    p1: s1
  )
  def f84(v0: s3): s3 = {
    var v5: s3 = v0
    val v4: s1 = v0.p1
    var v8: s1 = v4
    var v7: s3 = v5
    var v3: s3 = v0
    val v9: s0 = v8.p1
    v3 = v3.copy(p1 = v4)
    val v11: Vector[Vector[Double]] = v9.p0
    var v10: s1 = v4
    var v14: s0 = v9
    val v13: s0 = v8.p0
    val v21: Vector[Vector[Double]] = v14.p1
    var v12: s3 = v0
    v10 = v10.copy(p1 = v9)
    v8 = v8.copy(p0 = v14)
    v3 = v7
    var v19: s3 = v7
    v14 = v14.copy(p0 = v11)
    var v24: s1 = v4
    v8 = v8.copy(p1 = v13)
    val v36: Vector[Vector[Double]] = v9.p0
    var v25: s0 = v9
    val v17: s1 = v12.p1
    val v56: s1 = s1(v25, v13)
    val v34: s0 = s0(v11, v21)
    v25 = v25.copy(p0 = v11)
    var v64: s3 = v12
    v64 = v64.copy(p1 = v4)
    v10 = v10.copy(p0 = v13)
    v5 = v5.copy(p1 = v56)
    v14 = v14.copy(p0 = v36)
    v25 = v25.copy(p1 = v21)
    v7 = v3
    val v85: Vector[s0] = v12.p0
    v19 = v19.copy(p1 = v10)
    v3 = v3.copy(p0 = v85)
    val v118: Vector[s0] = v64.p0
    val v97: s1 = v3.p1
    v7 = v7.copy(p1 = v24)
    v7 = v7.copy(p1 = v97)
    val v179: s0 = v17.p0
    v19 = v0
    v8 = v8.copy(p0 = v25)
    v24 = v24.copy(p0 = v34)
    v12 = v12.copy(p0 = v118)
    v24 = v24.copy(p0 = v179)
    v19
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v2: s3 = f84(v0)
    val v26: Vector[s0] = v2.p0
    val v19: s0 = v26(1)
    val v50: Vector[Vector[Double]] = v19.p0
    val v78: Vector[Double] = v50(2)
    val v112: Double = v78(0)
    v112
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s1(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))))
    val v1: Double = 25.0
    val start = nanoTime()
    var result: Double = 25.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}