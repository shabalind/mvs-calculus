import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]],
    p2: s0,
    p3: Vector[Double]
  )
  def f5(v0: Double): Double = {
    val v1: Double = v0 + v0
    var v7: Double = v1
    var v2: Double = v1
    var v10: Double = v0
    var v15: Double = v7
    var v4: Double = v15
    var v24: Double = v1
    val v6: Vector[Double] = Vector(v1, v24, v0, v10, v1, v0, v4)
    val v16: Double = v6(3)
    val v21: Double = v6(4)
    var v13: Vector[Double] = v6
    v13 = v13.updated(5, v21)
    val v28: Vector[Double] = Vector(v2)
    val v42: Vector[Vector[Double]] = Vector(v28)
    val v14: Double = v13(0)
    val v30: Vector[Double] = v42(0)
    v13 = v13.updated(4, v14)
    v13 = v13.updated(5, v4)
    var v66: Vector[Double] = v13
    var v44: Double = v16
    v66 = v66.updated(5, v14)
    val v46: Double = v66(6)
    val v95: Double = v66(6)
    v13 = v13.updated(4, v24)
    v13 = v13.updated(0, v44)
    v13 = v13.updated(4, v21)
    val v98: Vector[Double] = v42(0)
    var v55: Vector[Double] = v98
    v55 = v55.updated(0, v95)
    val v191: Double = v30(0)
    v55 = v28
    val v78: Double = v55(0)
    v13 = v13.updated(3, v95)
    v55 = v55.updated(0, v46)
    v66 = v66.updated(1, v10)
    v66 = v66.updated(4, v191)
    v78
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v4: Double = f5(v1)
    val v21: Double = f5(v1)
    val v49: Double = v21 - v4
    val v54: Double = f5(v49)
    v54
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(0.0), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), Vector(Vector(s0(Vector(4.0), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(8.0), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(12.0), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), s0(Vector(16.0), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), Vector(20.0, 21.0, 22.0))
    val v1: Double = 23.0
    val start = nanoTime()
    var result: Double = 23.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}