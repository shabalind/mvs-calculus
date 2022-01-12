import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s2,
    p1: Vector[Vector[s0]]
  )
  def f74(v0: Vector[Vector[s0]]): Vector[Vector[s0]] = {
    var v8: Vector[Vector[s0]] = v0
    val v1: Vector[s0] = v8(1)
    var v3: Vector[Vector[s0]] = v0
    v3 = v3.updated(0, v1)
    val v5: Vector[s0] = v0(1)
    v8 = v8.updated(0, v1)
    v3 = v3.updated(0, v1)
    v8 = v8.updated(0, v5)
    v3 = v3.updated(1, v1)
    v3 = v8
    var v6: Vector[s0] = v1
    var v13: Vector[Vector[s0]] = v0
    val v9: Vector[s0] = v3(2)
    v3 = v3.updated(1, v9)
    val v19: Vector[s0] = v8(1)
    val v22: s0 = v9(0)
    v8 = v8.updated(1, v19)
    var v18: Vector[Vector[s0]] = v3
    v18 = v13
    v6 = v6.updated(0, v22)
    v18 = v18.updated(2, v6)
    v18
  }
  def f57(v0: s3, v1: Vector[Vector[s0]]): Vector[Vector[s0]] = {
    val v3: Vector[Vector[s0]] = f74(v1)
    val v6: Vector[Vector[s0]] = f74(v3)
    val v17: Vector[Vector[s0]] = f74(v6)
    v17
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: s3, v2: Double): Double = {
    val v5: Vector[Vector[s0]] = f57(v1, v0)
    val v8: Vector[s0] = v5(2)
    val v13: s0 = v8(0)
    val v16: Vector[Vector[Double]] = v13.p1
    val v84: Vector[Double] = v16(0)
    val v81: Double = v84(0)
    var v110: Double = v81
    v110
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))))
    val v1: s3 = s3(s2(s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))))), Vector(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))))
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