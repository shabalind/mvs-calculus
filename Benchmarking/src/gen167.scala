import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s0
  )
  case class s4 (
    p0: s0,
    p1: Vector[s3],
    p2: Vector[s0]
  )
  case class s6 (
    p0: s4,
    p1: Vector[s1]
  )
  def f96(v0: s3): s3 = {
    val v6: s0 = v0.p0
    val v1: s0 = v0.p0
    var v7: s3 = v0
    v7 = v7.copy(p0 = v6)
    var v3: s3 = v7
    var v10: s0 = v1
    var v25: s0 = v6
    val v18: Vector[Vector[Double]] = v25.p1
    var v14: s3 = v7
    var v19: s0 = v1
    v14 = v14.copy(p0 = v10)
    v10 = v10.copy(p1 = v18)
    val v36: s0 = v3.p0
    var v22: s3 = v14
    v25 = v6
    val v58: s0 = v7.p0
    v7 = v7.copy(p0 = v36)
    v14 = v14.copy(p0 = v1)
    v3 = v3.copy(p0 = v58)
    val v50: Vector[Vector[Double]] = v1.p0
    v25 = v25.copy(p0 = v50)
    v14 = v14.copy(p0 = v19)
    v22
  }
  def f20(v0: s3, v1: s6): s3 = {
    val v6: s3 = f96(v0)
    val v11: s3 = f96(v6)
    v11
  }
  @noinline
  def f0(v0: s3, v1: s6, v2: Double): Double = {
    val v7: s3 = f20(v0, v1)
    val v11: s0 = v7.p0
    val v23: Vector[Vector[Double]] = v11.p1
    val v40: Double = v2 / v2
    var v51: Double = v40
    val v47: Vector[Double] = v23(0)
    val v19: Double = v47(0)
    var v37: Vector[Double] = v47
    v37 = v37.updated(0, v40)
    var v31: Double = v2
    v37 = v37.updated(0, v40)
    v37 = v37.updated(0, v19)
    v37 = v37.updated(0, v40)
    v37 = v37.updated(0, v51)
    v37 = v37.updated(0, v40)
    val v140: Double = v37(0)
    v37 = v37.updated(0, v31)
    v37 = v37.updated(0, v19)
    v37 = v37.updated(0, v140)
    v140
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))
    val v1: s6 = s6(s4(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), Vector(s3(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), s3(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))), Vector(s1(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))))), s1(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)))))))
    val v2: Double = 39.0
    val start = nanoTime()
    var result: Double = 39.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}