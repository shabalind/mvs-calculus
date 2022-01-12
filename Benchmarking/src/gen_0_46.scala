import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f20(v0: s0): s0 = {
    var v5: s0 = v0
    val v7: Vector[Vector[Double]] = v5.p1
    val v2: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Vector[Double]] = v0.p0
    val v13: s0 = s0(v2, v7)
    var v10: s0 = v0
    v10 = v10.copy(p1 = v7)
    v10 = v10.copy(p0 = v4)
    val v42: Vector[Double] = v7(0)
    v5 = v5.copy(p0 = v2)
    v5 = v5.copy(p0 = v2)
    var v35: Vector[Vector[Double]] = v7
    val v23: Vector[Vector[Double]] = v13.p1
    val v28: Vector[Double] = v35(0)
    v5 = v5.copy(p1 = v35)
    v35 = v35.updated(1, v42)
    val v18: Vector[Double] = v2(0)
    v10 = v10.copy(p1 = v23)
    var v20: Vector[Double] = v28
    val v48: Vector[Vector[Double]] = v10.p0
    v10 = v10.copy(p1 = v35)
    v35 = v35.updated(0, v20)
    v10 = v10.copy(p0 = v4)
    val v33: Vector[Double] = v48(0)
    v35 = v35.updated(1, v18)
    var v61: Vector[Double] = v33
    v35 = v35.updated(0, v61)
    v10
  }
  def f9(v0: s0): s0 = {
    val v8: s0 = f20(v0)
    val v13: s0 = f20(v8)
    val v10: s0 = f20(v13)
    v10
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v3: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Vector[Double]] = v0.p1
    var v6: s0 = v0
    v6 = v6.copy(p1 = v3)
    val v11: Vector[Vector[Double]] = v6.p1
    val v14: s0 = f9(v6)
    var v9: Vector[Vector[Double]] = v5
    val v17: s0 = f20(v14)
    v6 = v6.copy(p1 = v11)
    val v26: Vector[Vector[Double]] = v17.p0
    var v21: s0 = v17
    val v34: s0 = f20(v14)
    val v19: s0 = f20(v14)
    val v23: Vector[Double] = v26(1)
    val v42: Vector[Double] = v26(2)
    v6 = v6.copy(p1 = v9)
    v9 = v9.updated(0, v23)
    var v22: s0 = v34
    v6 = v6.copy(p1 = v9)
    val v33: Vector[Vector[Double]] = v21.p1
    val v53: Double = v42(0)
    v6 = v6.copy(p1 = v9)
    v6 = v6.copy(p1 = v33)
    val v51: Vector[Vector[Double]] = v14.p0
    v21 = v21.copy(p0 = v51)
    val v58: Double = v53 + v53
    val v115: Vector[Vector[Double]] = v19.p0
    v6 = v6.copy(p1 = v33)
    v21 = v21.copy(p0 = v115)
    val v174: Vector[Vector[Double]] = v22.p0
    v21 = v21.copy(p0 = v174)
    v58
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))
    val v1: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}