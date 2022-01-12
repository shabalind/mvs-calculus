import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: s0,
    p3: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: Vector[s3],
    p1: Double
  )
  case class s7 (
    p0: Vector[s4]
  )
  case class s11 (
    p0: Vector[s7],
    p1: s0
  )
  @noinline
  def f0(v0: s7, v1: Vector[s11], v2: Double): Double = {
    val v6: Vector[s4] = v0.p0
    val v4: s4 = v6(0)
    var v5: Vector[s11] = v1
    val v13: s11 = v1(0)
    val v8: s11 = v5(0)
    v5 = v5.updated(0, v13)
    val v10: s0 = v8.p1
    val v19: Double = v4.p1
    val v18: Double = v10.p1
    v5 = v5.updated(0, v8)
    val v24: s4 = v6(0)
    val v23: Double = v19 / v18
    val v48: Double = v24.p1
    val v124: Double = v19 * v48
    val v178: Double = v124 + v23
    var v118: Double = v178
    v118
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(Vector(s4(Vector(s3(s1(s0(Vector(Vector(0.0)), 1.0), s0(Vector(Vector(2.0)), 3.0), s0(Vector(Vector(4.0)), 5.0), Vector(s0(Vector(Vector(6.0)), 7.0))), Vector(Vector(s0(Vector(Vector(8.0)), 9.0)), Vector(s0(Vector(Vector(10.0)), 11.0)), Vector(s0(Vector(Vector(12.0)), 13.0))))), 14.0)))
    val v1: Vector[s11] = Vector(s11(Vector(s7(Vector(s4(Vector(s3(s1(s0(Vector(Vector(15.0)), 16.0), s0(Vector(Vector(17.0)), 18.0), s0(Vector(Vector(19.0)), 20.0), Vector(s0(Vector(Vector(21.0)), 22.0))), Vector(Vector(s0(Vector(Vector(23.0)), 24.0)), Vector(s0(Vector(Vector(25.0)), 26.0)), Vector(s0(Vector(Vector(27.0)), 28.0))))), 29.0))), s7(Vector(s4(Vector(s3(s1(s0(Vector(Vector(30.0)), 31.0), s0(Vector(Vector(32.0)), 33.0), s0(Vector(Vector(34.0)), 35.0), Vector(s0(Vector(Vector(36.0)), 37.0))), Vector(Vector(s0(Vector(Vector(38.0)), 39.0)), Vector(s0(Vector(Vector(40.0)), 41.0)), Vector(s0(Vector(Vector(42.0)), 43.0))))), 44.0))), s7(Vector(s4(Vector(s3(s1(s0(Vector(Vector(45.0)), 46.0), s0(Vector(Vector(47.0)), 48.0), s0(Vector(Vector(49.0)), 50.0), Vector(s0(Vector(Vector(51.0)), 52.0))), Vector(Vector(s0(Vector(Vector(53.0)), 54.0)), Vector(s0(Vector(Vector(55.0)), 56.0)), Vector(s0(Vector(Vector(57.0)), 58.0))))), 59.0)))), s0(Vector(Vector(60.0)), 61.0)))
    val v2: Double = 62.0
    val start = nanoTime()
    var result: Double = 62.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}