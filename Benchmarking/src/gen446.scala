import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  def f65(v0: Double): Double = {
    var v1: Double = v0
    var v8: Double = v0
    var v7: Double = v1
    var v3: Double = v7
    v7 = v0
    var v5: Double = v0
    var v6: Double = v3
    var v16: Double = v7
    val v17: Vector[Double] = Vector(v16, v0, v16, v7, v16, v7, v6)
    v16 = v8
    val v21: Double = v17(3)
    v1 = v21
    v1 = v3
    val v14: Double = v17(4)
    var v9: Vector[Double] = v17
    val v13: Vector[Vector[Double]] = Vector(v17, v17, v9, v9)
    val v30: Vector[Double] = v13(1)
    v9 = v9.updated(6, v6)
    var v25: Vector[Vector[Double]] = v13
    v25 = v13
    val v23: Vector[Double] = v25(2)
    var v31: Vector[Vector[Double]] = v13
    var v18: Vector[Vector[Double]] = v31
    val v24: Vector[Double] = v18(0)
    v9 = v9.updated(2, v5)
    v31 = v31.updated(1, v23)
    v25 = v25.updated(0, v9)
    v31 = v31.updated(1, v30)
    val v19: Double = v23(2)
    val v47: Vector[Double] = v18(1)
    v25 = v25.updated(1, v47)
    v31 = v31.updated(0, v30)
    var v55: Vector[Double] = v24
    v25 = v25.updated(1, v55)
    val v58: Double = v14 / v19
    v58
  }
  @noinline
  def f0(v0: s1, v1: Vector[s2], v2: Double): Double = {
    val v13: Double = f65(v2)
    var v37: Double = v13
    var v42: Double = v37
    v42
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))
    val v1: Vector[s2] = Vector(s2(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s1(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)))))))
    val v2: Double = 27.0
    val start = nanoTime()
    var result: Double = 27.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}