import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  case class s3 (
    p0: Vector[s2],
    p1: s0
  )
  case class s4 (
    p0: Vector[s1],
    p1: s0
  )
  case class s9 (
    p0: s4,
    p1: s3
  )
  @noinline
  def f0(v0: s9, v1: Vector[s1], v2: Double): Double = {
    var v13: Double = v2
    val v14: s3 = v0.p1
    val v11: s0 = v14.p1
    val v35: Vector[Vector[Double]] = v11.p0
    val v50: Vector[Double] = v35(0)
    var v51: Vector[Double] = v50
    val v52: Double = v51(0)
    val v62: Double = v50(0)
    val v39: Vector[Double] = Vector(v52, v2, v52, v13, v62, v2, v13)
    val v49: Double = v39(0)
    val v161: Double = v50(0)
    v51 = v51.updated(0, v161)
    v51 = v51.updated(0, v49)
    v49
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(s4(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0))))), Vector(s0(Vector(Vector(1.0))))), s1(Vector(Vector(s0(Vector(Vector(2.0))))), Vector(s0(Vector(Vector(3.0)))))), s0(Vector(Vector(4.0)))), s3(Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(5.0))))), Vector(s0(Vector(Vector(6.0))))), s1(Vector(Vector(s0(Vector(Vector(7.0))))), Vector(s0(Vector(Vector(8.0))))), s1(Vector(Vector(s0(Vector(Vector(9.0))))), Vector(s0(Vector(Vector(10.0)))))), s0(Vector(Vector(11.0)))), s2(Vector(s1(Vector(Vector(s0(Vector(Vector(12.0))))), Vector(s0(Vector(Vector(13.0))))), s1(Vector(Vector(s0(Vector(Vector(14.0))))), Vector(s0(Vector(Vector(15.0))))), s1(Vector(Vector(s0(Vector(Vector(16.0))))), Vector(s0(Vector(Vector(17.0)))))), s0(Vector(Vector(18.0)))), s2(Vector(s1(Vector(Vector(s0(Vector(Vector(19.0))))), Vector(s0(Vector(Vector(20.0))))), s1(Vector(Vector(s0(Vector(Vector(21.0))))), Vector(s0(Vector(Vector(22.0))))), s1(Vector(Vector(s0(Vector(Vector(23.0))))), Vector(s0(Vector(Vector(24.0)))))), s0(Vector(Vector(25.0))))), s0(Vector(Vector(26.0)))))
    val v1: Vector[s1] = Vector(s1(Vector(Vector(s0(Vector(Vector(27.0))))), Vector(s0(Vector(Vector(28.0))))))
    val v2: Double = 29.0
    val start = nanoTime()
    var result: Double = 29.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}