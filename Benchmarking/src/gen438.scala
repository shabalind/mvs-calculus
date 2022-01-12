import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]],
    p5: Vector[Vector[Double]],
    p6: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  def f18(v0: Double): Double = {
    var v1: Double = v0
    var v6: Double = v0
    var v5: Double = v6
    var v2: Double = v6
    var v7: Double = v0
    v5 = v2
    var v4: Double = v1
    val v13: Vector[Double] = Vector(v1, v6, v0)
    val v14: Double = v13(1)
    val v8: Double = v13(1)
    val v17: Double = v13(1)
    var v10: Vector[Double] = v13
    v10 = v10.updated(1, v0)
    v10 = v10.updated(1, v4)
    val v32: Double = v13(1)
    var v19: Vector[Double] = v13
    v10 = v10.updated(0, v0)
    var v45: Double = v14
    var v15: Vector[Double] = v10
    val v46: Double = v10(1)
    var v22: Double = v32
    v10 = v10.updated(0, v17)
    val v29: Double = v15(2)
    v19 = v19.updated(1, v46)
    val v30: Double = v13(1)
    v10 = v10.updated(1, v8)
    val v41: Vector[Double] = Vector(v29, v30, v45, v22, v7, v5)
    var v43: Vector[Double] = v41
    val v25: Double = v43(5)
    val v31: Double = v41(3)
    val v33: Double = v19(2)
    v43 = v43.updated(2, v25)
    v43 = v43.updated(2, v33)
    val v39: Double = v43(3)
    var v27: Double = v5
    v43 = v43.updated(5, v27)
    val v56: Double = v25 + v39
    v15 = v15.updated(2, v31)
    v19 = v19.updated(1, v2)
    v2 = v6
    v56
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v4: Double = f18(v1)
    val v6: Double = f18(v4)
    val v30: Double = v6 * v6
    var v66: Double = v6
    var v19: Double = v66
    v19 = v30
    v19
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0)), Vector(Vector(11.0)), Vector(Vector(12.0), Vector(13.0))), s0(Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0)), Vector(Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))))
    val v1: Double = 28.0
    val start = nanoTime()
    var result: Double = 28.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}