import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: Vector[s3], v1: Vector[s2], v2: Double): Double = {
    val v6: s3 = v0(0)
    val v17: Vector[Vector[s1]] = v6.p0
    val v8: Vector[s1] = v17(0)
    val v15: s3 = v0(0)
    val v18: Vector[Vector[s0]] = v15.p1
    val v27: Vector[s0] = v18(0)
    val v32: s1 = v8(0)
    var v43: Vector[s0] = v27
    val v61: s0 = v43(0)
    val v96: Vector[s0] = v32.p1
    v43 = v43.updated(0, v61)
    var v98: Vector[s0] = v96
    val v51: s0 = v98(0)
    val v113: Vector[Vector[Double]] = v51.p1
    val v75: Vector[Double] = v113(1)
    v98 = v43
    val v165: Double = v75(0)
    v165
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(Vector(Vector(s1(Vector(s0(0.0, Vector(Vector(1.0), Vector(2.0))), s0(3.0, Vector(Vector(4.0), Vector(5.0)))), Vector(s0(6.0, Vector(Vector(7.0), Vector(8.0))))))), Vector(Vector(s0(9.0, Vector(Vector(10.0), Vector(11.0)))), Vector(s0(12.0, Vector(Vector(13.0), Vector(14.0)))))))
    val v1: Vector[s2] = Vector(s2(Vector(s1(Vector(s0(15.0, Vector(Vector(16.0), Vector(17.0))), s0(18.0, Vector(Vector(19.0), Vector(20.0)))), Vector(s0(21.0, Vector(Vector(22.0), Vector(23.0)))))), Vector(s0(24.0, Vector(Vector(25.0), Vector(26.0))), s0(27.0, Vector(Vector(28.0), Vector(29.0))))), s2(Vector(s1(Vector(s0(30.0, Vector(Vector(31.0), Vector(32.0))), s0(33.0, Vector(Vector(34.0), Vector(35.0)))), Vector(s0(36.0, Vector(Vector(37.0), Vector(38.0)))))), Vector(s0(39.0, Vector(Vector(40.0), Vector(41.0))), s0(42.0, Vector(Vector(43.0), Vector(44.0))))))
    val v2: Double = 45.0
    val start = nanoTime()
    var result: Double = 45.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}