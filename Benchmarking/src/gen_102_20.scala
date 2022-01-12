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
    p0: Vector[Vector[s0]],
    p1: s1
  )
  case class s4 (
    p0: Vector[s0],
    p1: s2
  )
  @noinline
  def f0(v0: s4, v1: s1, v2: Vector[s0], v3: Double): Double = {
    val v13: s0 = v2(0)
    val v12: Vector[Vector[Double]] = v13.p0
    val v20: s0 = v2(0)
    val v21: Vector[Vector[Double]] = v20.p1
    var v35: Vector[Vector[Double]] = v21
    val v80: Vector[Double] = v35(0)
    var v43: Vector[Double] = v80
    val v88: Double = v80(0)
    val v76: Vector[Double] = v12(0)
    val v64: Vector[Double] = v35(0)
    val v65: Vector[Double] = v12(0)
    v35 = v35.updated(1, v43)
    val v62: Double = v43(0)
    var v70: Vector[Double] = v80
    val v86: Double = v64(0)
    v43 = v43.updated(0, v88)
    val v140: Double = v70(0)
    v70 = v70.updated(0, v86)
    v35 = v35.updated(1, v76)
    v43 = v43.updated(0, v140)
    v35 = v35.updated(0, v65)
    v62
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), s2(Vector(Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), s1(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), Vector(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)))), Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))))))
    val v1: s1 = s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), Vector(Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))))))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))
    val v3: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}