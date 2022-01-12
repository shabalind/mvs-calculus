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
  case class s7 (
    p0: Vector[s1]
  )
  def f5(v0: Double): Double = {
    var v4: Double = v0
    var v1: Double = v4
    val v7: Double = v4 + v0
    var v3: Double = v4
    v4 = v3
    var v2: Double = v1
    var v6: Double = v3
    v2 = v0
    var v11: Double = v2
    v3 = v4
    var v5: Double = v2
    var v13: Double = v11
    var v17: Double = v3
    var v15: Double = v6
    var v18: Double = v11
    var v30: Double = v17
    v17 = v30
    var v51: Double = v15
    var v21: Double = v13
    var v33: Double = v15
    var v40: Double = v15
    var v42: Double = v15
    var v59: Double = v21
    var v108: Double = v5
    val v39: Vector[Double] = Vector(v7, v42, v51, v59, v17, v18, v33)
    v15 = v11
    var v92: Vector[Double] = v39
    v92 = v92.updated(5, v40)
    v92 = v92.updated(3, v0)
    v92 = v92.updated(3, v108)
    val v63: Double = v92(6)
    v92 = v92.updated(6, v108)
    v63
  }
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    val v7: Double = f5(v1)
    val v8: Vector[Double] = Vector(v7, v1, v7, v7, v1)
    val v24: Double = f5(v7)
    val v22: Double = v8(3)
    val v30: Double = f5(v22)
    var v190: Double = v24
    var v96: Double = v190
    val v55: Double = v30 - v96
    v55
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))))), s7(Vector(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0)))))), s7(Vector(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0)))), s1(s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0)))))))
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