import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: s2, v1: Vector[Vector[s2]], v2: Double): Double = {
    val v5: Vector[s2] = v1(2)
    val v12: s2 = v5(0)
    val v15: Vector[Vector[s0]] = v12.p1
    val v14: Vector[s0] = v15(0)
    val v33: Vector[s0] = v15(0)
    var v21: Vector[s0] = v33
    v21 = v14
    val v48: s0 = v21(0)
    val v31: Vector[Vector[Double]] = v48.p1
    val v108: Vector[Double] = v31(0)
    val v132: Double = v108(0)
    v132
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))), Vector(Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))))))
    val v1: Vector[Vector[s2]] = Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))))), Vector(s2(Vector(Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))), Vector(Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))))))), Vector(s2(Vector(Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))))))
    val v2: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}