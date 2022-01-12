import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s7 (
    p0: s1,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Vector[Vector[s4]], v2: s7, v3: Double): Double = {
    val v5: Vector[s4] = v1(2)
    val v4: s4 = v5(0)
    val v18: s0 = v0(0)
    val v15: Vector[s0] = v4.p0
    val v32: Vector[Double] = v18.p0
    val v40: s0 = v15(2)
    val v38: Double = v32(1)
    val v66: Vector[Double] = v40.p0
    val v78: Double = v66(0)
    val v220: Double = v78 * v38
    v220
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(0.0, 1.0), Vector(Vector(2.0))))
    val v1: Vector[Vector[s4]] = Vector(Vector(s4(Vector(s0(Vector(3.0, 4.0), Vector(Vector(5.0))), s0(Vector(6.0, 7.0), Vector(Vector(8.0))), s0(Vector(9.0, 10.0), Vector(Vector(11.0)))), Vector(s1(s0(Vector(12.0, 13.0), Vector(Vector(14.0))), Vector(Vector(s0(Vector(15.0, 16.0), Vector(Vector(17.0)))), Vector(s0(Vector(18.0, 19.0), Vector(Vector(20.0))))))))), Vector(s4(Vector(s0(Vector(21.0, 22.0), Vector(Vector(23.0))), s0(Vector(24.0, 25.0), Vector(Vector(26.0))), s0(Vector(27.0, 28.0), Vector(Vector(29.0)))), Vector(s1(s0(Vector(30.0, 31.0), Vector(Vector(32.0))), Vector(Vector(s0(Vector(33.0, 34.0), Vector(Vector(35.0)))), Vector(s0(Vector(36.0, 37.0), Vector(Vector(38.0))))))))), Vector(s4(Vector(s0(Vector(39.0, 40.0), Vector(Vector(41.0))), s0(Vector(42.0, 43.0), Vector(Vector(44.0))), s0(Vector(45.0, 46.0), Vector(Vector(47.0)))), Vector(s1(s0(Vector(48.0, 49.0), Vector(Vector(50.0))), Vector(Vector(s0(Vector(51.0, 52.0), Vector(Vector(53.0)))), Vector(s0(Vector(54.0, 55.0), Vector(Vector(56.0))))))))))
    val v2: s7 = s7(s1(s0(Vector(57.0, 58.0), Vector(Vector(59.0))), Vector(Vector(s0(Vector(60.0, 61.0), Vector(Vector(62.0)))), Vector(s0(Vector(63.0, 64.0), Vector(Vector(65.0)))))), Vector(s0(Vector(66.0, 67.0), Vector(Vector(68.0))), s0(Vector(69.0, 70.0), Vector(Vector(71.0))), s0(Vector(72.0, 73.0), Vector(Vector(74.0)))))
    val v3: Double = 75.0
    val start = nanoTime()
    var result: Double = 75.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}