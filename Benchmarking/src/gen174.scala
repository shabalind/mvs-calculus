import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f20(v0: Vector[Double], v1: Double): Double = {
    var v4: Vector[Double] = v0
    var v3: Vector[Double] = v4
    val v5: Vector[Vector[Double]] = Vector(v3, v0, v3, v4)
    val v8: Vector[Double] = v5(3)
    val v15: Vector[Vector[Double]] = Vector(v3, v0, v4, v8, v4)
    val v17: Double = v0(0)
    v4 = v4.updated(0, v17)
    var v41: Vector[Vector[Double]] = v15
    val v42: Vector[Double] = v41(4)
    val v166: Double = v42(0)
    val v105: Double = v17 * v166
    v41 = v41.updated(4, v4)
    v105
  }
  @noinline
  def f0(v0: Vector[s0], v1: Vector[Vector[s0]], v2: Double): Double = {
    var v12: Vector[Vector[s0]] = v1
    val v15: Vector[s0] = v12(0)
    var v21: Vector[s0] = v15
    val v24: s0 = v21(0)
    v21 = v21.updated(0, v24)
    val v20: Vector[Vector[Double]] = v24.p0
    val v38: Vector[Double] = v20(1)
    val v52: Double = f20(v38, v2)
    v52
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))
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