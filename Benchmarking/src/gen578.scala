import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[Vector[s1]],
    p1: Vector[s1]
  )
  def f70(v0: Double): Double = {
    val v6: Vector[Double] = Vector(v0, v0)
    var v1: Vector[Double] = v6
    val v3: Double = v6(1)
    val v5: Double = v6(1)
    val v9: Double = v6(1)
    val v10: Double = v0 - v3
    val v2: Vector[Vector[Double]] = Vector(v1, v6, v1, v1)
    v1 = v1.updated(0, v0)
    var v12: Double = v5
    var v31: Double = v0
    var v19: Vector[Vector[Double]] = v2
    var v21: Vector[Double] = v1
    var v13: Vector[Double] = v1
    v19 = v19.updated(2, v13)
    val v17: Vector[Double] = v2(0)
    v1 = v1.updated(1, v10)
    val v15: Vector[Double] = v2(3)
    v21 = v15
    val v16: Vector[Double] = v19(2)
    v13 = v13.updated(0, v12)
    var v38: Double = v0
    v1 = v1.updated(1, v9)
    val v43: Vector[Double] = v19(2)
    var v20: Vector[Vector[Double]] = v2
    var v40: Vector[Vector[Double]] = v19
    v19 = v19.updated(2, v13)
    val v22: Vector[Double] = v20(1)
    val v57: Double = v43(0)
    var v25: Vector[Double] = v16
    val v32: Double = v25(0)
    var v85: Vector[Vector[Double]] = v40
    var v26: Vector[Vector[Double]] = v85
    v13 = v17
    val v61: Vector[Double] = Vector(v3, v57, v31, v32, v10, v38)
    v25 = v21
    var v70: Vector[Double] = v61
    var v82: Vector[Double] = v25
    v85 = v85.updated(2, v82)
    v85 = v26
    val v67: Double = v70(3)
    var v100: Vector[Vector[Double]] = v85
    v19 = v19.updated(0, v22)
    v19 = v100
    v67
  }
  def f67(v0: Double): Double = {
    val v6: Double = f70(v0)
    val v5: Vector[Double] = Vector(v0)
    val v4: Double = f70(v6)
    val v10: Double = v5(0)
    val v1: Double = v5(0)
    val v7: Double = f70(v10)
    var v3: Vector[Double] = v5
    val v2: Double = v3(0)
    val v9: Double = f70(v10)
    val v11: Double = v7 - v6
    v3 = v3.updated(0, v1)
    var v13: Double = v9
    var v17: Double = v13
    val v14: Double = f70(v11)
    val v26: Double = f70(v2)
    v13 = v0
    val v41: Double = f70(v17)
    val v28: Double = v4 + v26
    val v25: Vector[Double] = Vector(v17, v14, v2, v28, v0)
    var v29: Vector[Double] = v25
    val v42: Double = v29(0)
    val v68: Double = v42 / v41
    v68
  }
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    val v6: Double = f67(v1)
    val v7: Double = f67(v6)
    val v39: Double = f70(v7)
    v39
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))))), Vector(s1(Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))))))
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