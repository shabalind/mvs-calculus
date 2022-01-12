import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0],
    p2: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[Vector[s1]]
  )
  def f72(v0: s0): s0 = {
    val v3: Vector[s0] = Vector(v0)
    val v1: s0 = v3(0)
    val v7: s0 = v3(0)
    val v4: Vector[Vector[Double]] = v1.p0
    val v11: Vector[Vector[Double]] = v1.p1
    var v5: Vector[Vector[Double]] = v4
    val v2: Vector[Vector[Double]] = v0.p0
    var v23: s0 = v7
    v23 = v23.copy(p1 = v11)
    v23 = v23.copy(p0 = v5)
    v23 = v23.copy(p0 = v4)
    v23 = v23.copy(p0 = v5)
    v23 = v23.copy(p0 = v4)
    val v30: Vector[Vector[Double]] = v23.p1
    val v18: s0 = s0(v4, v30)
    v23 = v23.copy(p0 = v4)
    val v32: Vector[Vector[Double]] = v18.p0
    v23 = v23.copy(p0 = v2)
    var v89: s0 = v18
    v23 = v23.copy(p0 = v32)
    v89
  }
  def f70(v0: s0): s0 = {
    val v1: s0 = f72(v0)
    val v6: Vector[Vector[Double]] = v0.p1
    var v3: Vector[Vector[Double]] = v6
    val v8: Vector[Vector[Double]] = v0.p1
    var v7: s0 = v1
    v7 = v7.copy(p1 = v8)
    var v21: Vector[Vector[Double]] = v8
    val v12: Vector[Vector[Double]] = v7.p0
    var v15: Vector[Vector[Double]] = v12
    val v17: Vector[Double] = v3(0)
    var v11: Vector[Vector[Double]] = v21
    var v10: Vector[Double] = v17
    val v14: Vector[Double] = v11(0)
    v21 = v21.updated(0, v14)
    val v34: Vector[Double] = v12(0)
    val v35: s0 = s0(v15, v3)
    val v42: Double = v10(0)
    v7 = v7.copy(p1 = v11)
    v21 = v21.updated(0, v10)
    var v20: Double = v42
    val v74: Double = v20 * v42
    v11 = v11.updated(0, v34)
    val v94: s0 = f72(v35)
    v3 = v3.updated(0, v14)
    v10 = v10.updated(0, v74)
    v94
  }
  @noinline
  def f0(v0: s0, v1: s3, v2: Double): Double = {
    val v6: s0 = f70(v0)
    val v19: Vector[Vector[Double]] = v6.p1
    val v11: Vector[Double] = v19(0)
    val v16: Double = v11(0)
    val v26: Double = v2 + v16
    v26
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))
    val v1: s3 = s3(Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))))))
    val v2: Double = 21.0
    val start = nanoTime()
    var result: Double = 21.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}