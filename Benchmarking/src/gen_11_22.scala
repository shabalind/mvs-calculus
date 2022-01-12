import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s4 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s5 (
    p0: Vector[s0],
    p1: Vector[Vector[s4]]
  )
  def f26(v0: s5, v1: s0): s0 = {
    val v5: Vector[s5] = Vector(v0, v0, v0, v0, v0)
    val v10: s5 = v5(3)
    val v11: Vector[Vector[s4]] = v10.p1
    val v14: Vector[s4] = v11(1)
    val v24: s4 = v14(0)
    val v41: s4 = v14(0)
    var v38: s4 = v41
    val v87: Vector[s0] = v38.p1
    val v56: Vector[s0] = v24.p1
    v38 = v38.copy(p1 = v87)
    val v119: Vector[s0] = v38.p0
    v38 = v38.copy(p1 = v56)
    val v90: s0 = v119(0)
    v90
  }
  @noinline
  def f0(v0: s4, v1: s5, v2: s0, v3: Double): Double = {
    val v9: s0 = f26(v1, v2)
    val v40: Vector[Vector[Double]] = v9.p1
    val v149: Vector[Double] = v40(1)
    val v157: Double = v149(0)
    v157
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))
    val v1: s5 = s5(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), Vector(Vector(s4(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))), Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))))), Vector(s4(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0)))), Vector(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))))))
    val v2: s0 = s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))
    val v3: Double = 52.0
    val start = nanoTime()
    var result: Double = 52.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}