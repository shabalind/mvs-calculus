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
  def f63(v0: Double): Double = {
    var v5: Double = v0
    var v7: Double = v0
    var v4: Double = v5
    var v1: Double = v0
    var v2: Double = v4
    var v8: Double = v2
    var v3: Double = v1
    var v15: Double = v7
    v5 = v8
    var v11: Double = v15
    var v16: Double = v1
    val v33: Vector[Double] = Vector(v7, v3, v11, v16, v1, v5)
    v11 = v0
    var v14: Vector[Double] = v33
    var v21: Double = v3
    v11 = v16
    v14 = v33
    v14 = v14.updated(4, v21)
    val v27: Double = v14(2)
    v27
  }
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    val v2: Double = v1 + v1
    val v7: Double = f63(v2)
    var v14: Double = v7
    var v15: Double = v7
    val v28: Vector[Double] = Vector(v15, v1, v15, v7, v14, v2, v15)
    var v18: Vector[Double] = v28
    var v56: Double = v14
    v15 = v14
    v18 = v18.updated(2, v2)
    val v60: Double = v18(1)
    v56 = v15
    val v113: Double = v56 - v60
    v113
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))))), s3(s1(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), s3(s1(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))))))
    val v1: Double = 27.0
    val start = nanoTime()
    var result: Double = 27.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}