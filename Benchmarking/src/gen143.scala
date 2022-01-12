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
    p0: s0,
    p1: s1
  )
  def f43(v0: s3): s3 = {
    val v5: Vector[s3] = Vector(v0)
    val v3: s3 = v5(0)
    val v12: s3 = v5(0)
    var v8: Vector[s3] = v5
    v8 = v8.updated(0, v12)
    v8 = v8.updated(0, v0)
    v8 = v8.updated(0, v3)
    var v25: Vector[s3] = v8
    var v188: Vector[s3] = v25
    val v145: s3 = v188(0)
    v145
  }
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: Double): Double = {
    val v4: Vector[s3] = v0(0)
    val v5: s3 = v4(0)
    val v12: Vector[Double] = Vector(v1)
    val v6: s3 = f43(v5)
    val v8: Double = v12(0)
    val v14: s0 = v6.p0
    var v15: Vector[Double] = v12
    val v9: Vector[Vector[Double]] = v14.p1
    val v21: Vector[Double] = v9(2)
    val v23: Double = v21(0)
    v15 = v15.updated(0, v23)
    val v29: Double = v8 + v8
    v15 = v21
    var v58: Vector[Double] = v21
    val v43: Double = v58(0)
    v58 = v58.updated(0, v8)
    v58 = v58.updated(0, v29)
    val v105: Double = v15(0)
    val v118: Double = v23 + v105
    v15 = v15.updated(0, v29)
    val v185: Double = v118 / v43
    v185
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))))), Vector(s3(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))))
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