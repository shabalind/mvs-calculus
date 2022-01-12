import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s1,
    p1: Vector[Vector[s1]]
  )
  def f78(v0: s0): s0 = {
    var v4: s0 = v0
    val v7: Vector[Vector[Double]] = v4.p0
    val v1: Vector[Vector[Double]] = v4.p1
    v4 = v0
    v4 = v4.copy(p1 = v1)
    v4 = v4.copy(p0 = v7)
    val v34: Vector[Vector[Double]] = v4.p0
    val v29: Vector[Vector[Double]] = v0.p1
    val v20: Vector[Vector[Double]] = v0.p0
    v4 = v4.copy(p1 = v1)
    v4 = v4.copy(p0 = v20)
    v4 = v4.copy(p1 = v29)
    v4 = v4.copy(p0 = v34)
    val v28: Vector[Vector[Double]] = v0.p1
    v4 = v4.copy(p1 = v28)
    var v83: s0 = v4
    v83
  }
  def f68(v0: Vector[s0]): Vector[s0] = {
    val v6: s0 = v0(0)
    val v7: Vector[Vector[Double]] = v6.p1
    var v8: Vector[Vector[Double]] = v7
    var v3: s0 = v6
    val v4: Vector[Vector[Double]] = v3.p0
    var v5: Vector[s0] = v0
    v3 = v6
    var v12: Vector[s0] = v5
    val v15: s0 = f78(v6)
    val v19: Vector[Double] = v4(1)
    val v9: Vector[Vector[Double]] = v6.p0
    val v17: s0 = f78(v6)
    v12 = v12.updated(0, v6)
    val v14: s0 = v0(0)
    v3 = v3.copy(p1 = v7)
    var v34: Vector[Double] = v19
    var v16: s0 = v14
    val v30: Vector[Vector[Double]] = v15.p0
    val v21: s0 = v12(0)
    var v33: Vector[Vector[Double]] = v30
    v12 = v12.updated(0, v6)
    v33 = v33.updated(0, v34)
    v16 = v16.copy(p1 = v8)
    val v32: Vector[Vector[Double]] = v21.p0
    v8 = v8.updated(0, v34)
    v12 = v12.updated(0, v3)
    v3 = v3.copy(p0 = v32)
    v16 = v16.copy(p0 = v9)
    v12 = v12.updated(0, v21)
    v3 = v3.copy(p0 = v33)
    val v97: Vector[Vector[Double]] = v17.p1
    v3 = v3.copy(p0 = v32)
    v5 = v5.updated(0, v16)
    v16 = v16.copy(p1 = v97)
    var v169: Vector[s0] = v12
    v169
  }
  def f33(v0: s3, v1: s0): s0 = {
    val v5: s0 = f78(v1)
    var v7: s0 = v1
    val v12: Vector[Vector[Double]] = v1.p1
    v7 = v7.copy(p1 = v12)
    val v25: Vector[Vector[Double]] = v5.p0
    v7 = v7.copy(p1 = v12)
    v7 = v7.copy(p0 = v25)
    v7
  }
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    val v5: s3 = v0(0)
    val v3: s1 = v5.p0
    val v12: Vector[Vector[s0]] = v3.p1
    val v8: Vector[s0] = v12(0)
    val v6: s0 = v8(0)
    val v9: Vector[s0] = f68(v8)
    val v16: s0 = v9(0)
    var v11: Vector[s0] = v9
    v11 = v11.updated(0, v16)
    val v19: s0 = v11(0)
    v11 = v9
    val v25: Vector[Vector[s0]] = v3.p1
    val v78: Vector[Vector[Double]] = v19.p1
    v11 = v11.updated(0, v6)
    val v60: Vector[s0] = v25(0)
    v11 = v60
    val v22: s0 = f33(v5, v19)
    v11 = v11.updated(0, v6)
    v11 = v11.updated(0, v19)
    var v47: Vector[Vector[Double]] = v78
    v11 = v11.updated(0, v22)
    v11 = v11.updated(0, v16)
    val v113: Vector[Double] = v47(0)
    val v79: Double = v113(0)
    v79
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), Vector(Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))))), Vector(Vector(s1(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))))))))
    val v1: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}