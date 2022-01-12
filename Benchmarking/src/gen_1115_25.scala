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
  case class s7 (
    p0: Vector[s1],
    p1: s0
  )
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Vector[Vector[s7]], v2: Double): Double = {
    val v12: Vector[s1] = v0(0)
    val v7: s1 = v12(0)
    val v8: Vector[s0] = v7.p0
    val v15: s0 = v8(1)
    val v9: s1 = s1(v8, v15)
    val v14: Vector[s0] = v9.p0
    val v39: s0 = v14(1)
    val v48: Vector[Vector[Double]] = v39.p1
    val v58: Vector[Double] = v48(0)
    val v202: Double = v58(0)
    v202
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))))
    val v1: Vector[Vector[s7]] = Vector(Vector(s7(Vector(s1(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s1(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))))))
    val v2: Double = 40.0
    val start = nanoTime()
    var result: Double = 40.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}