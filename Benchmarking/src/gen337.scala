import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[s1], v1: s0, v2: Double): Double = {
    val v7: s1 = v0(0)
    val v3: s0 = v7.p0
    var v6: Double = v2
    val v14: Vector[Vector[Double]] = v3.p1
    val v13: Vector[Vector[Double]] = v3.p0
    val v11: Vector[Double] = v13(1)
    var v19: Vector[Double] = v11
    var v37: Vector[Vector[Double]] = v14
    v37 = v37.updated(0, v19)
    v37 = v37.updated(0, v11)
    val v18: Vector[Vector[Double]] = v1.p2
    var v25: Vector[Vector[Double]] = v18
    v19 = v19.updated(0, v6)
    val v50: Vector[Double] = v37(0)
    val v21: Vector[Double] = v25(0)
    v37 = v37.updated(0, v21)
    val v130: Double = v50(0)
    v130
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), s1(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))))
    val v1: s0 = s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))
    val v2: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}