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
    p0: Vector[s1],
    p1: s0
  )
  case class s3 (
    p0: s2,
    p1: Vector[s0]
  )
  def f14(v0: s0, v1: s0): s0 = {
    var v4: s0 = v0
    val v7: s1 = s1(v1, v4)
    val v8: Vector[Vector[Double]] = v0.p0
    val v5: Vector[Vector[Vector[Double]]] = Vector(v8, v8, v8, v8, v8, v8)
    val v12: s0 = v7.p1
    var v16: Vector[Vector[Vector[Double]]] = v5
    val v10: Vector[Vector[Double]] = v16(1)
    v16 = v16.updated(1, v8)
    val v17: Vector[Vector[Double]] = v5(2)
    v4 = v4.copy(p0 = v10)
    val v34: Vector[Double] = v17(1)
    val v24: Vector[Vector[Double]] = Vector(v34)
    var v21: Vector[Vector[Double]] = v24
    val v87: Vector[Vector[Double]] = v16(5)
    var v35: Vector[Vector[Double]] = v24
    val v60: s0 = s0(v87, v35)
    val v69: Vector[Vector[Double]] = v12.p1
    var v47: s0 = v60
    v47 = v47.copy(p1 = v69)
    v4 = v4.copy(p1 = v21)
    v47
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v7: Vector[s0] = v0.p1
    val v5: s0 = v7(0)
    val v3: s0 = f14(v5, v5)
    val v8: Vector[Vector[Double]] = v3.p0
    val v10: Vector[Double] = v8(1)
    val v141: Double = v10(0)
    v141
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s1(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))), Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}