import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f74(v0: Vector[s0]): Vector[s0] = {
    val v4: s0 = v0(0)
    var v5: s0 = v4
    val v1: s0 = v0(0)
    val v6: Vector[Vector[Double]] = v4.p1
    val v8: Vector[Double] = v6(0)
    val v9: s0 = v0(0)
    var v3: s0 = v5
    val v2: Vector[Double] = v6(1)
    val v14: Vector[Vector[Double]] = v9.p1
    var v15: Vector[Vector[Double]] = v14
    v5 = v5.copy(p0 = v6)
    v15 = v15.updated(1, v2)
    v5 = v5.copy(p0 = v6)
    val v19: s0 = v0(0)
    var v21: Vector[s0] = v0
    var v24: s0 = v3
    var v51: s0 = v5
    v51 = v51.copy(p1 = v15)
    v21 = v21.updated(0, v1)
    v15 = v15.updated(1, v8)
    var v57: Vector[s0] = v21
    v21 = v21.updated(0, v51)
    v57 = v57.updated(0, v24)
    v5 = v5.copy(p1 = v6)
    v21 = v21.updated(0, v19)
    v21 = v21.updated(0, v9)
    v57
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v3: Vector[s0] = v0(0)
    val v6: Vector[s0] = f74(v3)
    var v11: Vector[s0] = v6
    val v8: Vector[s0] = f74(v11)
    val v10: Vector[s0] = f74(v8)
    val v24: s0 = v8(0)
    var v29: s0 = v24
    val v25: Vector[Vector[Double]] = v29.p1
    val v43: s0 = v10(0)
    var v47: Vector[Vector[Double]] = v25
    val v63: Vector[Vector[Double]] = v29.p0
    v29 = v29.copy(p0 = v63)
    val v39: Vector[Vector[Double]] = v43.p0
    v29 = v29.copy(p1 = v25)
    v29 = v29.copy(p0 = v39)
    val v117: Vector[Double] = v47(1)
    v11 = v11.updated(0, v43)
    v29 = v29.copy(p1 = v47)
    val v72: Double = v117(0)
    v72
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}