import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s5 (
    p0: s2,
    p1: s2
  )
  def f21(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v5: Vector[Double] = v0(0)
    var v1: Vector[Vector[Double]] = v0
    val v4: Vector[Vector[Vector[Double]]] = Vector(v1, v1, v0, v0)
    val v9: Vector[Vector[Double]] = v4(3)
    v1 = v1.updated(0, v5)
    val v20: Vector[Double] = v9(1)
    v1 = v1.updated(0, v20)
    val v49: Vector[Vector[Vector[Vector[Double]]]] = Vector(v4, v4, v4, v4, v4, v4, v4)
    val v45: Vector[Vector[Vector[Double]]] = v49(3)
    val v68: Vector[Vector[Double]] = v45(2)
    v68
  }
  @noinline
  def f0(v0: s5, v1: Double): Double = {
    val v8: s2 = v0.p1
    val v10: s1 = v8.p0
    val v18: s0 = v10.p0
    val v22: Vector[Vector[Double]] = v18.p0
    val v78: Vector[Vector[Double]] = f21(v22)
    val v37: Vector[Double] = v78(0)
    val v214: Double = v37(0)
    v214
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s2(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))), s1(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))), s2(s1(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), Vector(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))))), s1(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))), Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))))
    val v1: Double = 60.0
    val start = nanoTime()
    var result: Double = 60.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}