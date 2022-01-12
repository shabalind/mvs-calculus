import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  def f27(v0: Double): Double = {
    var v7: Double = v0
    var v3: Double = v7
    var v4: Double = v3
    val v6: Vector[Double] = Vector(v0, v3)
    val v2: Double = v6(1)
    val v12: Double = v6(0)
    val v15: Double = v6(1)
    v4 = v15
    val v8: Vector[Vector[Double]] = Vector(v6)
    v4 = v12
    val v11: Vector[Double] = v8(0)
    val v13: Vector[Double] = v8(0)
    val v34: Double = v13(1)
    val v48: Vector[Double] = Vector(v4)
    var v26: Vector[Double] = v48
    v26 = v26.updated(0, v15)
    val v35: Double = v11(0)
    var v30: Vector[Double] = v48
    var v72: Vector[Double] = v30
    v72 = v72.updated(0, v35)
    var v100: Vector[Double] = v72
    v30 = v30.updated(0, v12)
    v100 = v100.updated(0, v34)
    v100 = v100.updated(0, v2)
    val v64: Vector[Vector[Double]] = Vector(v26, v100)
    val v62: Vector[Double] = v64(1)
    val v142: Double = v62(0)
    v142
  }
  def f7(v0: s0, v1: s0): s0 = {
    val v6: Vector[s0] = Vector(v1, v1, v1)
    val v7: Vector[Vector[Double]] = v1.p0
    val v2: Vector[Vector[Double]] = v1.p1
    val v4: s0 = v6(1)
    val v19: Vector[Vector[Double]] = v4.p1
    var v21: Vector[Vector[Double]] = v19
    val v12: Vector[Double] = v2(2)
    v21 = v21.updated(1, v12)
    val v45: s0 = s0(v7, v21)
    v21 = v21.updated(0, v12)
    val v41: Vector[Double] = v7(0)
    v21 = v21.updated(1, v41)
    v45
  }
  @noinline
  def f0(v0: s2, v1: s2, v2: Double): Double = {
    val v7: s0 = v0.p1
    var v8: Double = v2
    val v5: s0 = f7(v7, v7)
    val v10: Double = f27(v2)
    val v16: Vector[Vector[Double]] = v5.p1
    val v12: Vector[Double] = v16(2)
    v8 = v10
    val v144: Double = f27(v2)
    val v43: Double = f27(v8)
    val v69: Double = f27(v144)
    val v88: Double = v12(0)
    val v74: Double = v43 * v69
    val v145: Double = v88 - v74
    v145
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
    val v1: s2 = s2(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))
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