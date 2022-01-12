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
  case class s3 (
    p0: s1,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    var v7: Double = v1
    val v4: s3 = v0(2)
    val v3: s1 = v4.p0
    var v13: s1 = v3
    val v9: s0 = v13.p0
    v13 = v13.copy(p0 = v9)
    var v28: s0 = v9
    var v14: s0 = v28
    val v15: Vector[Vector[Double]] = v14.p1
    val v18: Vector[Double] = v15(2)
    val v19: Double = v18(0)
    v14 = v14.copy(p1 = v15)
    val v21: Vector[Vector[Double]] = v14.p0
    val v59: s0 = s0(v21, v15)
    v13 = v13.copy(p0 = v59)
    val v27: Double = v7 + v19
    v27
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))), s3(s1(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), s3(s1(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))))))
    val v1: Double = 45.0
    val start = nanoTime()
    var result: Double = 45.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}