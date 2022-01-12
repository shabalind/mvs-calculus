import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: s0, v2: s0, v3: s0, v4: Vector[s0], v5: Double): Double = {
    val v28: s0 = v4(2)
    val v9: Vector[Vector[Double]] = v28.p1
    var v13: Vector[Vector[Double]] = v9
    val v15: Vector[Double] = v13(1)
    var v16: Vector[Double] = v15
    var v59: Vector[Double] = v16
    val v36: Double = v59(0)
    val v29: Double = v15(0)
    v16 = v16.updated(0, v36)
    v59 = v59.updated(0, v5)
    val v94: Vector[Vector[Double]] = v1.p1
    val v37: Vector[Vector[Double]] = v3.p1
    var v87: Double = v36
    var v39: Double = v87
    v59 = v59.updated(0, v29)
    v13 = v13.updated(0, v16)
    v13 = v94
    v13 = v37
    v39
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))
    val v1: s0 = s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))
    val v2: s0 = s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))
    val v3: s0 = s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))
    val v4: Vector[s0] = Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))))
    val v5: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}