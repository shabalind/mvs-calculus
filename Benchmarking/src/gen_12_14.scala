import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s1],
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v4: Vector[Double] = Vector(v1, v1, v1)
    var v5: Vector[Double] = v4
    var v6: Vector[Double] = v5
    var v9: Vector[Double] = v4
    val v12: Double = v1 / v1
    v9 = v9.updated(2, v1)
    v5 = v6
    var v13: Vector[Double] = v4
    val v25: Double = v6(0)
    var v34: Double = v1
    val v22: Double = v5(0)
    v9 = v13
    var v35: Vector[Double] = v6
    v35 = v35.updated(1, v25)
    val v47: Double = v35(2)
    v13 = v13.updated(1, v34)
    v6 = v13
    val v102: Double = v9(1)
    v5 = v5.updated(1, v102)
    v5 = v5.updated(1, v12)
    v13 = v5
    v13 = v13.updated(1, v22)
    v5 = v35
    v47
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))))), Vector(s1(Vector(Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))))))
    val v1: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}