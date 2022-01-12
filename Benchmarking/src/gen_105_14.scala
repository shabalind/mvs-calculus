import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Double,
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Double): Double = {
    var v8: Vector[Vector[s2]] = v0
    var v4: Double = v1
    var v5: Vector[Vector[s2]] = v0
    var v6: Double = v4
    val v2: Vector[s2] = v0(0)
    v5 = v5.updated(0, v2)
    v5 = v5.updated(0, v2)
    val v3: Vector[s2] = v0(0)
    val v9: Vector[s2] = v8(0)
    val v10: s2 = v9(0)
    val v17: s1 = v10.p1
    val v12: s0 = v17.p1
    val v26: Vector[Vector[Double]] = v12.p1
    var v20: Double = v6
    v5 = v5.updated(0, v9)
    val v21: s0 = v17.p0
    var v58: s0 = v12
    v58 = v58.copy(p1 = v26)
    val v65: Vector[Vector[Double]] = v21.p3
    val v36: Vector[Vector[Double]] = v58.p0
    val v45: Vector[Double] = v36(0)
    var v63: Vector[Double] = v45
    val v75: Double = v1 + v20
    var v54: Vector[Vector[s2]] = v5
    v5 = v5.updated(0, v3)
    v58 = v58.copy(p2 = v75)
    val v39: Vector[s2] = v54(0)
    v5 = v5.updated(0, v3)
    v58 = v58.copy(p2 = v20)
    val v126: Double = v63(0)
    v8 = v8.updated(0, v39)
    v58 = v58.copy(p3 = v65)
    v5 = v0
    v126
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), 5.0, Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s1(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0)), 17.0, Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0)), 29.0, Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))))
    val v1: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}