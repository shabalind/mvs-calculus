import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[Vector[s1]]
  )
  case class s4 (
    p0: s1,
    p1: s3
  )
  def f49(v0: s4): s4 = {
    var v44: s4 = v0
    var v73: s4 = v44
    v73
  }
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    var v7: Double = v1
    val v2: s4 = f49(v0)
    val v3: s3 = v2.p1
    val v9: Vector[s0] = v3.p0
    val v6: s0 = v9(1)
    val v35: Vector[Vector[Double]] = v6.p2
    val v26: Vector[Double] = v35(0)
    val v31: Double = v26(0)
    val v82: Double = v31 - v7
    v82
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0)))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0)), Vector(Vector(14.0)))), s3(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)), Vector(Vector(24.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0)), Vector(Vector(29.0)))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0)), Vector(Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0)), Vector(Vector(39.0))))))))
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