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
  case class s5 (
    p0: Vector[s0],
    p1: s0
  )
  case class s8 (
    p0: Vector[s0],
    p1: Vector[s5]
  )
  def f40(v0: Double): Double = {
    var v4: Double = v0
    var v7: Double = v4
    v7 = v0
    var v6: Double = v0
    var v5: Double = v0
    val v2: Double = v6 + v7
    var v11: Double = v6
    val v12: Vector[Double] = Vector(v11, v5)
    var v14: Double = v2
    var v21: Vector[Double] = v12
    var v25: Vector[Double] = v21
    val v41: Double = v25(1)
    v25 = v25.updated(1, v14)
    v41
  }
  @noinline
  def f0(v0: s1, v1: s8, v2: Double): Double = {
    val v9: s0 = v0.p0
    val v60: Vector[Vector[Double]] = v9.p0
    var v31: Double = v2
    val v42: Vector[Double] = v60(0)
    val v45: Double = f40(v31)
    val v82: Double = v42(0)
    var v32: Vector[Double] = v42
    v32 = v32.updated(0, v82)
    var v55: Vector[Double] = v32
    val v87: Double = v55(0)
    val v86: Double = f40(v45)
    v32 = v32.updated(0, v86)
    v32 = v32.updated(0, v2)
    v87
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))))
    val v1: s8 = s8(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), Vector(s5(Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), s5(Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))), s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))))))
    val v2: Double = 55.0
    val start = nanoTime()
    var result: Double = 55.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}