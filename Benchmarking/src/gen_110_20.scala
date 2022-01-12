import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Double]
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: s0
  )
  def f96(v0: Double): Double = {
    var v1: Double = v0
    var v6: Double = v0
    var v3: Double = v6
    var v4: Double = v0
    v6 = v3
    var v2: Double = v4
    var v8: Double = v0
    var v9: Double = v0
    var v12: Double = v9
    var v5: Double = v1
    var v13: Double = v5
    val v11: Vector[Double] = Vector(v0, v12, v3, v13, v12)
    var v7: Double = v1
    var v16: Vector[Double] = v11
    var v24: Double = v8
    var v22: Double = v6
    val v35: Double = v11(1)
    val v28: Double = v16(0)
    v16 = v16.updated(4, v2)
    var v14: Double = v22
    v16 = v16.updated(1, v28)
    var v45: Vector[Double] = v16
    var v36: Vector[Double] = v45
    var v30: Vector[Double] = v16
    val v50: Vector[Vector[Double]] = Vector(v11, v30, v45, v11)
    v45 = v45.updated(2, v14)
    val v51: Double = v11(1)
    var v32: Vector[Vector[Double]] = v50
    var v102: Vector[Vector[Double]] = v50
    v16 = v16.updated(4, v7)
    val v39: Vector[Double] = v32(2)
    var v73: Vector[Double] = v36
    v30 = v30.updated(1, v51)
    v16 = v16.updated(1, v35)
    val v174: Double = v39(1)
    v73 = v73.updated(4, v2)
    v30 = v30.updated(2, v14)
    v32 = v102
    v73 = v73.updated(3, v24)
    v102 = v102.updated(1, v73)
    v174
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v7: s0 = v0.p1
    val v4: Vector[Vector[Double]] = v7.p0
    val v3: Double = v1 * v1
    val v6: Double = f96(v3)
    val v8: Vector[Double] = v4(0)
    val v9: Double = v8(0)
    val v21: Double = f96(v9)
    val v18: Double = v21 / v6
    val v27: Double = f96(v6)
    var v43: Double = v1
    var v109: Double = v43
    val v136: Double = v27 * v109
    val v214: Double = v136 * v18
    v214
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(8.0))), Vector(s1(Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0))), s0(Vector(Vector(13.0)), Vector(Vector(14.0), Vector(15.0), Vector(16.0)))), Vector(17.0)))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0), Vector(21.0))))
    val v1: Double = 22.0
    val start = nanoTime()
    var result: Double = 22.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}