import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v7: s0 = v0(0)
    var v5: Vector[s0] = v0
    val v4: Vector[Vector[Double]] = v7.p1
    val v3: s0 = v0(0)
    val v9: Vector[Vector[Double]] = v7.p1
    val v2: Vector[Vector[Double]] = v7.p0
    var v6: Vector[s0] = v0
    val v17: s0 = s0(v2, v4)
    var v10: Vector[Vector[Double]] = v2
    var v13: s0 = v3
    val v8: Vector[Double] = v2(1)
    val v11: Vector[Vector[Double]] = v13.p1
    val v12: Vector[Vector[Double]] = v3.p1
    v13 = v13.copy(p1 = v11)
    val v22: Vector[Double] = v2(0)
    v6 = v6.updated(0, v17)
    val v15: Vector[Vector[Double]] = v17.p0
    v13 = v13.copy(p1 = v9)
    val v31: Vector[Double] = v4(2)
    var v46: Vector[Vector[Double]] = v15
    val v29: s0 = v6(0)
    v10 = v10.updated(1, v22)
    val v16: Vector[Vector[Double]] = v13.p0
    v13 = v13.copy(p1 = v11)
    var v23: Vector[s0] = v0
    val v24: Vector[Vector[Double]] = v3.p1
    val v19: s0 = v5(0)
    val v43: Vector[Vector[Double]] = v17.p1
    val v45: Vector[Vector[Double]] = v29.p1
    v13 = v13.copy(p1 = v24)
    v10 = v10.updated(1, v31)
    v23 = v23.updated(0, v3)
    v46 = v46.updated(0, v8)
    v13 = v13.copy(p1 = v43)
    v6 = v6.updated(0, v29)
    val v39: Vector[Vector[Double]] = v19.p1
    val v28: Vector[Vector[Double]] = v7.p1
    v13 = v13.copy(p1 = v28)
    v23 = v23.updated(0, v29)
    val v55: s0 = s0(v46, v39)
    val v51: Vector[Vector[Double]] = v55.p1
    v13 = v13.copy(p0 = v15)
    v46 = v46.updated(1, v31)
    v13 = v13.copy(p0 = v10)
    val v34: Vector[Vector[Double]] = v17.p1
    v13 = v13.copy(p1 = v39)
    v13 = v13.copy(p1 = v51)
    v13 = v13.copy(p0 = v46)
    v13 = v13.copy(p1 = v28)
    v13 = v13.copy(p1 = v51)
    v6 = v6.updated(0, v7)
    val v53: Vector[Double] = v34(0)
    var v42: Vector[s0] = v23
    v13 = v13.copy(p1 = v39)
    v46 = v46.updated(1, v22)
    val v40: s0 = v42(0)
    v13 = v13.copy(p1 = v45)
    v13 = v13.copy(p0 = v16)
    v10 = v10.updated(1, v53)
    val v65: Vector[Vector[Double]] = v29.p1
    v23 = v0
    v13 = v13.copy(p1 = v12)
    val v87: Vector[Double] = v51(2)
    v5 = v5.updated(0, v40)
    val v156: Double = v87(0)
    v46 = v16
    v13 = v13.copy(p1 = v65)
    v156
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))))
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