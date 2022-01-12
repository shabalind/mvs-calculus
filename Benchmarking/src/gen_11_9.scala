import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double]
  )
  case class s2 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  def f84(v0: s2): s2 = {
    val v1: Vector[Vector[s0]] = v0.p1
    var v3: Vector[Vector[s0]] = v1
    val v4: s0 = v0.p0
    val v6: Vector[s0] = v3(0)
    var v2: s2 = v0
    v3 = v3.updated(1, v6)
    var v5: Vector[s0] = v6
    val v9: s0 = v0.p0
    v2 = v2.copy(p0 = v4)
    val v16: Vector[Vector[s0]] = v2.p1
    v2 = v2.copy(p0 = v4)
    v3 = v3.updated(1, v5)
    v2 = v2.copy(p1 = v3)
    v3 = v3.updated(0, v6)
    v5 = v5.updated(0, v9)
    v5 = v5.updated(0, v4)
    val v13: s2 = s2(v4, v16)
    v5 = v5.updated(0, v9)
    v13
  }
  def f75(v0: s0, v1: s0): s0 = {
    var v6: s0 = v0
    var v3: s0 = v6
    v3 = v1
    val v4: Vector[Double] = v0.p0
    val v9: Vector[Double] = v6.p0
    var v13: s0 = v3
    val v11: Vector[Double] = v1.p0
    val v19: s0 = s0(v4)
    v13 = v13.copy(p0 = v11)
    var v24: Vector[Double] = v4
    v13 = v1
    v6 = v3
    val v18: Vector[Double] = v13.p0
    var v12: Vector[Double] = v24
    var v26: Vector[Double] = v9
    var v31: Vector[Double] = v12
    v3 = v3.copy(p0 = v24)
    val v34: Vector[Double] = v19.p0
    val v22: Vector[Vector[Double]] = Vector(v26, v4, v31, v34, v18, v11)
    val v29: Vector[Double] = v22(4)
    v24 = v29
    v13
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v7: s2 = v0(0)
    val v2: s2 = f84(v7)
    val v8: s2 = f84(v2)
    val v18: s0 = v8.p0
    val v19: s0 = f75(v18, v18)
    val v23: s0 = f75(v19, v19)
    val v69: Vector[Double] = v23.p0
    val v100: Double = v69(1)
    v100
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s0(Vector(0.0, 1.0)), Vector(Vector(s0(Vector(2.0, 3.0))), Vector(s0(Vector(4.0, 5.0))))), s2(s0(Vector(6.0, 7.0)), Vector(Vector(s0(Vector(8.0, 9.0))), Vector(s0(Vector(10.0, 11.0))))))
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