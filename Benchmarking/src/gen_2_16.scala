import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s4 (
    p0: s0,
    p1: s2,
    p2: s0
  )
  def f86(v0: s0, v1: s0): s0 = {
    var v5: s0 = v0
    val v3: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Double] = v3(0)
    val v7: Vector[Vector[Double]] = v5.p0
    val v2: Vector[Vector[Double]] = v5.p1
    v5 = v5.copy(p1 = v7)
    val v13: Vector[Vector[Double]] = v1.p1
    val v10: Vector[Double] = v3(0)
    val v19: Vector[Double] = v3(0)
    val v12: Vector[Double] = v2(0)
    v5 = v5.copy(p0 = v3)
    var v18: Vector[Vector[Double]] = v13
    val v11: Vector[Vector[Double]] = v0.p0
    var v30: s0 = v5
    v18 = v18.updated(0, v19)
    val v21: Vector[Double] = v11(0)
    v18 = v18.updated(0, v19)
    val v23: Vector[Double] = v3(0)
    v18 = v18.updated(0, v21)
    val v24: Vector[Vector[Double]] = Vector(v10, v21, v4, v23, v12, v23, v4)
    var v35: s0 = v30
    v30 = v30.copy(p0 = v18)
    val v71: Vector[Double] = v24(1)
    v18 = v18.updated(0, v71)
    v35 = v35.copy(p1 = v2)
    v35
  }
  def f62(v0: s0): s0 = {
    val v5: s0 = f86(v0, v0)
    val v10: s0 = f86(v5, v5)
    v10
  }
  def f17(v0: s2, v1: Double): Double = {
    var v2: Double = v1
    val v5: s0 = v0.p0
    val v7: s0 = f62(v5)
    val v9: s0 = f86(v5, v7)
    val v6: Vector[Vector[Double]] = v9.p0
    val v12: Vector[Double] = v6(0)
    var v24: Vector[Double] = v12
    v24 = v24.updated(0, v2)
    val v25: Double = v24(0)
    v24 = v24.updated(0, v25)
    var v55: Double = v25
    val v49: Double = v12(0)
    v24 = v24.updated(0, v49)
    v55
  }
  @noinline
  def f0(v0: Vector[s2], v1: Vector[s4], v2: Double): Double = {
    var v55: Double = v2
    val v15: s2 = v0(0)
    val v23: Double = v55 + v2
    val v14: Vector[Double] = Vector(v23, v23, v23)
    var v47: Vector[Double] = v14
    val v16: Double = f17(v15, v23)
    val v42: Double = v47(0)
    v47 = v47.updated(2, v42)
    v55 = v23
    v47 = v47.updated(2, v16)
    v55 = v42
    val v121: Double = v23 / v42
    v47 = v47.updated(2, v23)
    v121
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), s2(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), s2(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0))))))
    val v1: Vector[s4] = Vector(s4(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s2(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0))))), s0(Vector(Vector(34.0)), Vector(Vector(35.0)))))
    val v2: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}