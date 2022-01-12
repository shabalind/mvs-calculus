import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s5 (
    p0: s1
  )
  def f32(v0: s0, v1: s1): s0 = {
    val v4: Vector[Vector[s0]] = v1.p1
    var v5: Vector[Vector[s0]] = v4
    val v7: Vector[s0] = v5(2)
    val v6: Vector[s0] = v5(1)
    v5 = v5.updated(1, v7)
    val v10: s0 = v1.p0
    var v24: Vector[s0] = v6
    v24 = v24.updated(0, v10)
    val v59: s0 = v24(0)
    v24 = v24.updated(0, v10)
    v59
  }
  @noinline
  def f0(v0: Vector[s2], v1: Vector[s5], v2: s1, v3: s2, v4: Double): Double = {
    var v8: s1 = v2
    val v10: s0 = v3.p0
    val v13: s0 = f32(v10, v8)
    val v16: s0 = f32(v13, v8)
    val v34: Vector[Vector[Double]] = v16.p0
    var v98: Vector[Vector[Double]] = v34
    val v124: Vector[Double] = v98(0)
    var v82: Vector[Double] = v124
    val v78: Double = v82(0)
    v78
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s2(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))))
    val v1: Vector[s5] = Vector(s5(s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))), Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))))))
    val v2: s1 = s1(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), Vector(Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))))
    val v3: s2 = s2(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))))
    val v4: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}