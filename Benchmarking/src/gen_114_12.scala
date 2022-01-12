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
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v2: s2 = v0(1)
    val v3: Vector[s0] = v2.p1
    val v10: s0 = v3(2)
    val v23: Vector[Vector[Double]] = v10.p0
    val v37: Vector[Vector[Double]] = v10.p0
    val v16: s0 = v3(1)
    var v20: s0 = v16
    val v24: Vector[Double] = v23(0)
    var v28: s0 = v16
    var v25: Vector[Vector[Double]] = v23
    v25 = v25.updated(0, v24)
    val v21: Vector[Double] = v37(0)
    v28 = v28.copy(p0 = v37)
    val v30: Vector[Vector[Double]] = v20.p0
    var v34: s0 = v20
    val v65: Vector[Vector[Double]] = v28.p1
    v25 = v25.updated(0, v21)
    val v26: Vector[Vector[Double]] = v10.p0
    val v46: Vector[Vector[Double]] = v20.p0
    v34 = v34.copy(p1 = v65)
    val v75: Vector[Vector[Double]] = v20.p1
    val v64: Vector[Double] = v65(0)
    v34 = v34.copy(p1 = v65)
    v28 = v28.copy(p0 = v23)
    val v136: Vector[Vector[Double]] = v34.p1
    v28 = v28.copy(p0 = v46)
    v20 = v20.copy(p1 = v136)
    v34 = v34.copy(p0 = v26)
    val v84: Vector[Vector[Double]] = v16.p1
    var v69: Vector[Vector[Double]] = v30
    v20 = v20.copy(p0 = v25)
    val v95: Vector[Double] = v37(0)
    v20 = v20.copy(p1 = v84)
    v20 = v20.copy(p0 = v69)
    val v120: Double = v64(0)
    v28 = v28.copy(p1 = v65)
    v28 = v28.copy(p1 = v75)
    v69 = v69.updated(0, v95)
    v120
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), s2(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)))), Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))))
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