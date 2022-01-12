import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  def f4(v0: Double): Double = {
    var v3: Double = v0
    var v2: Double = v3
    var v8: Double = v0
    var v9: Double = v8
    var v22: Double = v2
    var v10: Double = v22
    var v37: Double = v3
    val v25: Double = v10 + v37
    var v14: Double = v0
    var v26: Double = v9
    var v48: Double = v26
    val v89: Vector[Double] = Vector(v22, v0)
    var v40: Vector[Double] = v89
    var v24: Vector[Double] = v40
    v24 = v24.updated(1, v48)
    v40 = v40.updated(0, v26)
    v40 = v40.updated(0, v14)
    var v42: Vector[Double] = v89
    val v35: Vector[Vector[Double]] = Vector(v40)
    var v34: Vector[Vector[Double]] = v35
    val v50: Vector[Double] = v34(0)
    v34 = v34.updated(0, v42)
    val v73: Double = v42(1)
    val v80: Vector[Double] = v34(0)
    v34 = v34.updated(0, v24)
    v42 = v42.updated(1, v25)
    var v90: Vector[Vector[Double]] = v34
    var v53: Vector[Vector[Double]] = v34
    val v118: Double = v50(0)
    v90 = v90.updated(0, v80)
    var v99: Double = v73
    v40 = v40.updated(0, v99)
    v90 = v53
    val v95: Vector[Double] = v90(0)
    v34 = v34.updated(0, v95)
    v118
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v8: Double = f4(v1)
    val v5: Double = f4(v8)
    val v10: Double = f4(v5)
    v10
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0))), s0(Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0)))), s0(Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0))))
    val v1: Double = 21.0
    val start = nanoTime()
    var result: Double = 21.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}