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
  @noinline
  def f0(v0: s1, v1: s1, v2: s1, v3: Vector[s1], v4: Double): Double = {
    val v6: s1 = v3(0)
    val v15: s0 = v6.p0
    val v41: Vector[Vector[Double]] = v15.p0
    val v44: Vector[Double] = v41(0)
    var v31: Vector[Double] = v44
    val v54: Double = v31(0)
    var v65: Vector[Double] = v44
    v65 = v65.updated(0, v54)
    val v68: Double = v65(0)
    val v71: Double = v31(0)
    v31 = v31.updated(0, v71)
    v65 = v65.updated(0, v54)
    v68
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))
    val v1: s1 = s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))))
    val v2: s1 = s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))))
    val v3: Vector[s1] = Vector(s1(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), Vector(s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))))
    val v4: Double = 48.0
    val start = nanoTime()
    var result: Double = 48.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}