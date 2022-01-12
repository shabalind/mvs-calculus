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
    p0: s0,
    p1: s1
  )
  def f76(v0: Double): Double = {
    val v5: Double = v0 - v0
    var v4: Double = v5
    val v7: Vector[Double] = Vector(v5, v0, v4, v0, v0)
    val v8: Double = v7(4)
    val v2: Vector[Double] = Vector(v5, v4, v8, v5, v5, v5, v5)
    val v15: Double = v2(2)
    var v26: Double = v15
    v26
  }
  def f45(v0: Double): Double = {
    var v2: Double = v0
    val v4: Double = f76(v2)
    val v8: Double = f76(v0)
    val v7: Double = f76(v8)
    val v10: Vector[Double] = Vector(v4, v2)
    val v13: Double = v10(0)
    val v24: Double = f76(v13)
    val v14: Double = f76(v24)
    val v30: Double = v10(1)
    var v22: Vector[Double] = v10
    val v50: Double = f76(v13)
    val v40: Double = f76(v24)
    v22 = v22.updated(1, v7)
    v22 = v22.updated(1, v8)
    var v42: Vector[Double] = v10
    val v31: Double = f76(v40)
    val v33: Double = v42(1)
    v42 = v42.updated(0, v50)
    val v71: Double = v42(0)
    var v55: Vector[Double] = v22
    v22 = v22.updated(0, v71)
    v42 = v42.updated(1, v14)
    val v60: Double = v55(1)
    v55 = v55.updated(1, v33)
    v55 = v55.updated(1, v31)
    v42 = v42.updated(0, v30)
    v42 = v42.updated(0, v50)
    v60
  }
  @noinline
  def f0(v0: s2, v1: Vector[Vector[s0]], v2: Double): Double = {
    val v4: Double = f45(v2)
    v4
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s1(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))
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