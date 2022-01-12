import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  def f2(v0: Double): Double = {
    var v1: Double = v0
    var v9: Double = v1
    var v8: Double = v1
    var v2: Double = v0
    var v5: Double = v2
    val v19: Double = v1 * v9
    var v11: Double = v5
    var v32: Double = v19
    var v25: Double = v5
    val v20: Double = v25 - v25
    val v31: Vector[Double] = Vector(v9)
    var v43: Vector[Double] = v31
    v43 = v43.updated(0, v20)
    v43 = v43.updated(0, v32)
    v43 = v43.updated(0, v5)
    v43 = v43.updated(0, v8)
    v43 = v43.updated(0, v11)
    var v39: Vector[Double] = v43
    val v38: Double = v39(0)
    v43 = v43.updated(0, v20)
    var v42: Double = v38
    v43 = v43.updated(0, v5)
    v39 = v39.updated(0, v25)
    v39 = v39.updated(0, v25)
    v42
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v3: Vector[Vector[Double]] = v0.p2
    val v5: Vector[Double] = v3(1)
    val v6: Double = v1 + v1
    val v2: Double = f2(v6)
    val v9: Vector[Vector[Double]] = v0.p2
    var v7: Vector[Double] = v5
    v7 = v7.updated(0, v1)
    var v11: Vector[Double] = v5
    v11 = v11.updated(0, v1)
    v7 = v7.updated(0, v2)
    val v20: Double = f2(v2)
    val v17: Vector[Double] = v9(0)
    v11 = v11.updated(0, v20)
    val v47: Double = f2(v6)
    val v18: Double = v11(0)
    val v30: Double = f2(v6)
    val v26: Double = f2(v30)
    val v52: Double = v17(0)
    var v40: Double = v47
    v7 = v7.updated(0, v52)
    val v15: Double = v40 * v26
    val v35: Double = f2(v18)
    val v94: Double = f2(v30)
    val v48: Double = f2(v18)
    v11 = v11.updated(0, v35)
    v11 = v7
    v7 = v7.updated(0, v15)
    v11 = v11.updated(0, v94)
    v48
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0)))
    val v1: Double = 7.0
    val start = nanoTime()
    var result: Double = 7.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}