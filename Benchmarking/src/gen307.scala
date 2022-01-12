import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  def f67(v0: Double): Double = {
    var v5: Double = v0
    val v3: Vector[Double] = Vector(v5, v0)
    val v10: Double = v3(0)
    v10
  }
  def f12(v0: Double): Double = {
    var v7: Double = v0
    val v1: Double = f67(v7)
    val v5: Double = f67(v7)
    val v3: Double = f67(v7)
    val v6: Double = f67(v3)
    val v2: Double = f67(v3)
    val v10: Double = f67(v1)
    val v8: Vector[Double] = Vector(v5, v6, v2, v10, v10, v6)
    var v14: Vector[Double] = v8
    val v12: Double = f67(v7)
    val v22: Double = v14(4)
    val v24: Double = f67(v6)
    v14 = v14.updated(4, v2)
    val v41: Double = f67(v22)
    v14 = v14.updated(4, v7)
    var v28: Double = v24
    v14 = v14.updated(3, v22)
    val v79: Double = f67(v22)
    v14 = v14.updated(0, v12)
    val v71: Vector[Double] = Vector(v5, v79)
    var v42: Vector[Double] = v71
    var v119: Vector[Double] = v42
    val v88: Vector[Vector[Double]] = Vector(v71, v71, v119)
    v14 = v14.updated(5, v28)
    v7 = v41
    val v130: Vector[Double] = v88(1)
    val v149: Double = v130(1)
    v149
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v13: Double = f12(v1)
    val v8: Double = f12(v13)
    var v16: Double = v1
    v16 = v8
    var v12: Double = v16
    v12 = v16
    val v79: Double = f67(v12)
    var v60: Double = v79
    v60
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}