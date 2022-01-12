import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  def f1(v0: s2): s2 = {
    val v4: s0 = v0.p1
    var v1: s0 = v4
    val v2: Vector[Vector[Double]] = v4.p1
    var v6: Vector[Vector[Double]] = v2
    v1 = v1.copy(p1 = v6)
    val v5: Vector[Double] = v6(2)
    val v12: s0 = v0.p0
    v6 = v6.updated(0, v5)
    val v21: Vector[Vector[Double]] = v12.p1
    v6 = v6.updated(2, v5)
    val v18: s0 = v0.p1
    var v11: s2 = v0
    v11 = v11.copy(p0 = v4)
    val v17: s0 = v11.p0
    v11 = v11.copy(p1 = v12)
    val v15: s0 = v11.p1
    var v30: Vector[Vector[Double]] = v21
    v11 = v11.copy(p0 = v1)
    var v28: s0 = v18
    v11 = v11.copy(p0 = v15)
    val v48: Vector[s2] = Vector(v0, v11)
    val v74: s2 = v48(0)
    v11 = v11.copy(p1 = v28)
    v11 = v11.copy(p1 = v17)
    v28 = v28.copy(p1 = v30)
    v74
  }
  @noinline
  def f0(v0: s2, v1: Vector[s2], v2: Double): Double = {
    val v6: s2 = f1(v0)
    val v14: s0 = v6.p1
    val v24: Vector[Vector[Double]] = v14.p1
    val v26: Vector[Double] = v24(2)
    val v69: Double = v26(0)
    v69
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))
    val v1: Vector[s2] = Vector(s2(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), s2(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))
    val v2: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}