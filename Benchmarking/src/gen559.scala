import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  def f111(v0: Double): Double = {
    var v2: Double = v0
    var v3: Double = v2
    val v6: Double = v0 - v3
    var v5: Double = v6
    v5
  }
  def f102(v0: Double): Double = {
    val v4: Double = f111(v0)
    var v7: Double = v4
    var v2: Double = v4
    var v8: Double = v2
    val v6: Double = f111(v7)
    val v1: Double = f111(v6)
    val v12: Double = f111(v1)
    var v15: Double = v8
    val v3: Double = f111(v12)
    v7 = v12
    val v5: Double = f111(v7)
    var v10: Double = v6
    val v13: Double = f111(v4)
    val v19: Double = f111(v7)
    val v24: Double = f111(v19)
    var v18: Double = v4
    var v39: Double = v18
    val v11: Double = f111(v39)
    var v34: Double = v5
    var v30: Double = v19
    val v40: Double = f111(v30)
    var v44: Double = v13
    var v28: Double = v24
    val v35: Vector[Double] = Vector(v11, v40, v44, v39, v10)
    val v38: Vector[Double] = Vector(v34, v13, v2, v44, v15, v10)
    val v46: Double = f111(v3)
    var v31: Vector[Double] = v35
    val v47: Vector[Vector[Double]] = Vector(v31, v31, v35)
    val v80: Vector[Double] = v47(0)
    val v67: Double = v38(3)
    v31 = v31.updated(3, v6)
    v31 = v31.updated(4, v46)
    val v91: Double = v80(2)
    v31 = v31.updated(0, v67)
    v31 = v31.updated(1, v30)
    v31 = v31.updated(1, v28)
    v91
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v4: Vector[s1] = v0(0)
    val v3: s1 = v4(0)
    val v6: s0 = v3.p0
    val v14: Vector[Vector[Double]] = v6.p1
    val v29: Vector[Double] = v14(1)
    val v34: Double = v29(0)
    val v62: Double = f102(v34)
    v62
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))))), Vector(s1(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))))))
    val v1: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}