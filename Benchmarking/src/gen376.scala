import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s3 (
    p0: s0,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: Double): Double = {
    val v6: Vector[s3] = v0(1)
    var v5: Vector[Vector[s3]] = v0
    val v8: s3 = v6(0)
    val v2: Vector[s3] = v5(1)
    v5 = v5.updated(0, v2)
    val v14: Vector[s3] = v5(0)
    var v10: Vector[Vector[s3]] = v5
    val v3: s3 = v14(0)
    v10 = v10.updated(1, v14)
    val v12: Vector[s0] = v3.p1
    val v18: Vector[s3] = v0(1)
    v10 = v10.updated(1, v2)
    v5 = v10
    v5 = v5.updated(0, v2)
    val v30: s0 = v12(1)
    val v21: Vector[Vector[Double]] = v30.p1
    v10 = v10.updated(1, v2)
    val v37: Vector[Double] = v21(0)
    v10 = v0
    var v44: Vector[Double] = v37
    v10 = v10.updated(0, v2)
    v5 = v5.updated(0, v6)
    v5 = v5.updated(1, v14)
    v10 = v0
    val v43: Double = v44(0)
    var v118: Double = v43
    v5 = v5.updated(0, v18)
    var v82: Vector[s3] = v18
    var v110: Vector[s3] = v82
    v110 = v110.updated(0, v8)
    val v223: Double = v37(0)
    val v187: Double = v223 / v118
    v10 = v10.updated(0, v110)
    v187
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))), Vector(s3(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))))))
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