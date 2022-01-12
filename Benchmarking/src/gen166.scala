import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0],
    p2: s0,
    p3: s0,
    p4: Vector[Vector[Double]],
    p5: Vector[s0]
  )
  def f52(v0: s0): s0 = {
    val v5: Double = v0.p0
    val v7: Double = v0.p0
    var v1: s0 = v0
    v1 = v1.copy(p0 = v5)
    v1 = v1.copy(p0 = v5)
    var v4: s0 = v1
    val v8: Vector[Vector[Double]] = v1.p1
    val v3: Vector[Double] = v8(0)
    var v9: Double = v7
    v1 = v0
    val v6: Vector[Vector[Double]] = v4.p1
    var v16: Vector[Double] = v3
    var v21: Vector[Vector[Double]] = v8
    var v11: Double = v9
    val v19: Vector[Double] = v6(0)
    val v56: s0 = s0(v11, v8)
    val v28: Double = v19(0)
    v21 = v21.updated(0, v16)
    v1 = v1.copy(p1 = v21)
    v16 = v16.updated(0, v28)
    v1 = v1.copy(p0 = v28)
    v56
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v5: s1 = v0(1)
    var v7: s1 = v5
    val v6: Vector[s0] = v5.p1
    v7 = v7.copy(p5 = v6)
    val v2: Vector[s0] = v5.p1
    v7 = v7.copy(p1 = v2)
    v7 = v7.copy(p5 = v2)
    v7 = v7.copy(p1 = v2)
    val v4: s0 = v6(1)
    var v10: s1 = v7
    var v46: s1 = v10
    val v27: s0 = v2(0)
    val v26: s0 = v10.p3
    val v22: s0 = f52(v26)
    v10 = v10.copy(p2 = v27)
    v46 = v46.copy(p3 = v26)
    val v25: s1 = v0(1)
    val v123: Vector[s0] = v46.p1
    val v38: s0 = v25.p2
    v10 = v10.copy(p2 = v22)
    v10 = v10.copy(p3 = v4)
    v10 = v10.copy(p5 = v123)
    v10 = v10.copy(p1 = v123)
    var v62: s0 = v26
    v7 = v7.copy(p2 = v38)
    val v208: Double = v62.p0
    v208
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(Vector(s0(0.0, Vector(Vector(1.0))))), Vector(s0(2.0, Vector(Vector(3.0))), s0(4.0, Vector(Vector(5.0))), s0(6.0, Vector(Vector(7.0)))), s0(8.0, Vector(Vector(9.0))), s0(10.0, Vector(Vector(11.0))), Vector(Vector(12.0), Vector(13.0)), Vector(s0(14.0, Vector(Vector(15.0))), s0(16.0, Vector(Vector(17.0))), s0(18.0, Vector(Vector(19.0))))), s1(Vector(Vector(s0(20.0, Vector(Vector(21.0))))), Vector(s0(22.0, Vector(Vector(23.0))), s0(24.0, Vector(Vector(25.0))), s0(26.0, Vector(Vector(27.0)))), s0(28.0, Vector(Vector(29.0))), s0(30.0, Vector(Vector(31.0))), Vector(Vector(32.0), Vector(33.0)), Vector(s0(34.0, Vector(Vector(35.0))), s0(36.0, Vector(Vector(37.0))), s0(38.0, Vector(Vector(39.0))))))
    val v1: Double = 40.0
    val start = nanoTime()
    var result: Double = 40.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}