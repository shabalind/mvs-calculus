import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f1(v0: Double): Double = {
    var v6: Double = v0
    var v3: Double = v6
    var v11: Double = v0
    val v4: Vector[Double] = Vector(v11)
    val v15: Double = v4(0)
    var v2: Vector[Double] = v4
    v11 = v3
    var v10: Vector[Double] = v2
    v2 = v2.updated(0, v15)
    val v30: Double = v2(0)
    var v28: Vector[Double] = v10
    v2 = v2.updated(0, v30)
    val v13: Double = v28(0)
    v10 = v4
    v13
  }
  @noinline
  def f0(v0: s2, v1: Vector[s2], v2: Double): Double = {
    var v5: Double = v2
    val v8: Vector[s0] = v0.p1
    val v7: Double = v5 * v5
    v5 = v2
    val v46: s0 = v8(0)
    val v23: Vector[Vector[Double]] = v46.p0
    val v44: Double = f1(v7)
    val v33: Vector[Double] = v23(0)
    var v38: Vector[Double] = v33
    val v26: Double = v38(0)
    v38 = v38.updated(0, v44)
    v26
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))))
    val v1: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))))), s2(Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), s2(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))), Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))))))
    val v2: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}