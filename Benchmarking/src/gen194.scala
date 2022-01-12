import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  def f81(v0: Double): Double = {
    var v6: Double = v0
    var v1: Double = v6
    var v5: Double = v6
    var v3: Double = v5
    var v9: Double = v3
    var v13: Double = v0
    var v4: Double = v6
    val v2: Vector[Double] = Vector(v5, v0, v13, v4, v1, v5)
    val v10: Double = v2(3)
    val v14: Double = v2(2)
    var v19: Vector[Double] = v2
    val v12: Double = v2(4)
    val v17: Double = v2(3)
    v19 = v19.updated(5, v6)
    val v16: Double = v19(5)
    val v43: Vector[Double] = Vector(v17, v9, v14, v16, v10, v14, v9)
    v19 = v19.updated(0, v9)
    val v20: Vector[Vector[Double]] = Vector(v43, v43, v43, v43, v43, v43)
    v19 = v19.updated(1, v12)
    v6 = v4
    var v32: Vector[Double] = v2
    var v25: Vector[Vector[Double]] = v20
    val v23: Vector[Double] = v20(4)
    v1 = v12
    var v33: Vector[Vector[Double]] = v25
    v32 = v19
    val v41: Vector[Double] = v33(0)
    val v71: Double = v32(2)
    v9 = v71
    val v121: Double = v41(5)
    v33 = v33.updated(4, v23)
    v121
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v6: Vector[s0] = v0.p1
    val v4: s0 = v6(2)
    val v18: Vector[Vector[Double]] = v4.p1
    val v14: Vector[Double] = v18(0)
    val v39: Double = v14(0)
    val v24: Double = f81(v39)
    v24
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(0.0, Vector(Vector(1.0), Vector(2.0))), Vector(s0(3.0, Vector(Vector(4.0), Vector(5.0))), s0(6.0, Vector(Vector(7.0), Vector(8.0))), s0(9.0, Vector(Vector(10.0), Vector(11.0)))))
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