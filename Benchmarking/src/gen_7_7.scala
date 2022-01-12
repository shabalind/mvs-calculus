import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  def f13(v0: s1): s1 = {
    val v2: Vector[s0] = v0.p0
    var v1: Vector[s0] = v2
    var v3: s1 = v0
    v3 = v3.copy(p0 = v2)
    v3 = v3.copy(p0 = v1)
    var v7: Vector[s0] = v2
    var v6: s1 = v0
    var v4: s1 = v6
    var v5: Vector[s0] = v1
    val v12: s0 = v1(1)
    val v8: Vector[Vector[Double]] = v12.p1
    var v9: s1 = v4
    var v15: Vector[Vector[Double]] = v8
    var v10: s0 = v12
    val v34: Vector[s0] = v9.p0
    v3 = v3.copy(p0 = v5)
    var v81: s1 = v3
    v81 = v81.copy(p1 = v10)
    v1 = v1.updated(1, v12)
    v3 = v3.copy(p0 = v2)
    v81 = v81.copy(p1 = v10)
    v3 = v3.copy(p0 = v34)
    v4 = v4.copy(p0 = v7)
    v1 = v1.updated(1, v12)
    v10 = v10.copy(p1 = v15)
    v5 = v5.updated(0, v10)
    v81
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v7: s1 = v0(1)
    val v6: s1 = v0(2)
    val v3: s1 = f13(v6)
    val v8: s1 = f13(v6)
    val v23: Vector[s0] = v7.p0
    var v10: s1 = v3
    val v13: Vector[s0] = v7.p0
    var v25: Vector[s0] = v13
    v10 = v10.copy(p0 = v13)
    val v9: s0 = v25(1)
    val v24: s1 = f13(v8)
    v10 = v10.copy(p0 = v23)
    val v56: Vector[Vector[Double]] = v9.p0
    v10 = v10.copy(p1 = v9)
    val v43: Vector[Double] = v56(0)
    val v47: s0 = v24.p1
    val v44: s0 = v10.p1
    val v42: Double = v43(0)
    v25 = v25.updated(1, v44)
    v25 = v25.updated(0, v47)
    v42
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), s1(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), s1(Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)))))
    val v1: Double = 27.0
    val start = nanoTime()
    var result: Double = 27.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}