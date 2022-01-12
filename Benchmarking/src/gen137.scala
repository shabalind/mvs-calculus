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
    p0: Vector[s1],
    p1: s0
  )
  case class s7 (
    p0: Vector[s2],
    p1: s0
  )
  def f90(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    val v9: Vector[Vector[Double]] = v0.p1
    val v4: s0 = s0(v6, v9)
    val v12: Vector[s0] = Vector(v0, v0, v4)
    var v7: Vector[s0] = v12
    v7 = v7.updated(0, v4)
    val v10: s0 = v7(1)
    val v33: s0 = v12(2)
    val v26: s0 = v12(0)
    val v22: Vector[s0] = Vector(v33, v26, v0, v10, v4, v26)
    val v83: s0 = v22(5)
    v7 = v7.updated(0, v4)
    v83
  }
  def f15(v0: s0): s0 = {
    val v5: s0 = f90(v0)
    val v9: s0 = f90(v5)
    val v7: s0 = f90(v9)
    val v51: Vector[Vector[Double]] = v9.p1
    var v28: s0 = v7
    v28 = v28.copy(p0 = v51)
    v28
  }
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    val v7: s0 = v0.p1
    var v9: Double = v1
    val v26: s0 = f15(v7)
    val v20: s0 = f90(v26)
    var v27: Double = v9
    val v58: Vector[Vector[Double]] = v20.p0
    val v72: Vector[Double] = v58(1)
    val v34: Double = v72(0)
    val v54: Double = v27 - v9
    var v79: Double = v54
    val v163: Double = v79 / v34
    v163
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(Vector(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}