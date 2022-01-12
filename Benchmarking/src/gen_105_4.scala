import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  @noinline
  def f0(v0: Vector[s2], v1: s1, v2: Vector[s0], v3: Double): Double = {
    val v7: s0 = v2(0)
    var v6: Double = v3
    val v13: Vector[Vector[Double]] = v7.p0
    var v12: Double = v3
    val v18: Vector[Double] = v13(0)
    var v35: Vector[Double] = v18
    var v45: Vector[Vector[Double]] = v13
    var v70: Double = v3
    var v33: Double = v70
    val v50: Vector[Double] = v45(1)
    v45 = v45.updated(0, v35)
    v45 = v13
    v12 = v33
    val v106: Double = v50(0)
    v35 = v35.updated(0, v12)
    v35 = v35.updated(0, v6)
    v35 = v35.updated(0, v12)
    v106
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s1(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))))
    val v1: s1 = s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))
    val v3: Double = 21.0
    val start = nanoTime()
    var result: Double = 21.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}