import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f81(v0: Double): Double = {
    var v6: Double = v0
    var v3: Double = v6
    v6 = v0
    var v1: Double = v6
    var v4: Double = v1
    var v10: Double = v0
    var v2: Double = v3
    var v9: Double = v4
    var v5: Double = v6
    var v12: Double = v10
    var v21: Double = v5
    val v27: Vector[Double] = Vector(v0, v12, v2, v3)
    var v61: Vector[Double] = v27
    v61 = v61.updated(1, v9)
    val v16: Vector[Vector[Double]] = Vector(v61, v27, v27, v61)
    val v33: Double = v61(0)
    v61 = v61.updated(2, v33)
    var v34: Vector[Vector[Double]] = v16
    val v53: Vector[Double] = v34(3)
    var v32: Vector[Vector[Double]] = v34
    var v37: Vector[Vector[Double]] = v32
    val v40: Vector[Double] = v37(1)
    v61 = v61.updated(3, v21)
    val v71: Vector[Double] = v34(1)
    val v48: Vector[Vector[Double]] = Vector(v71, v71, v71, v27, v53, v71, v40)
    v32 = v32.updated(1, v61)
    val v101: Vector[Double] = v48(5)
    v34 = v16
    val v112: Double = v101(3)
    v112
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v2: Vector[Vector[Double]] = v0.p0
    var v10: Double = v1
    val v9: Vector[Double] = v2(2)
    var v17: Vector[Double] = v9
    val v75: Vector[Vector[Double]] = Vector(v17, v9, v17, v9, v9)
    val v23: Double = v10 + v1
    val v29: Double = f81(v1)
    v10 = v29
    var v34: Vector[Vector[Double]] = v75
    val v73: Double = v23 - v1
    v34 = v34.updated(1, v9)
    val v59: Vector[Double] = v34(0)
    val v33: Vector[Double] = v75(3)
    var v63: Vector[Vector[Double]] = v75
    v63 = v63.updated(4, v59)
    v63 = v63.updated(0, v59)
    v17 = v17.updated(0, v73)
    v63 = v63.updated(1, v33)
    val v62: Double = v17(0)
    v17 = v17.updated(0, v23)
    var v111: Vector[Vector[Double]] = v63
    v17 = v17.updated(0, v62)
    val v189: Vector[Double] = v111(1)
    val v190: Double = v189(0)
    val v107: Vector[Double] = v111(0)
    v63 = v63.updated(4, v107)
    v190
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}