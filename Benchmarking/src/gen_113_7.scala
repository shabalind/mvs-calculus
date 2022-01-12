import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s8 (
    p0: s0,
    p1: s4
  )
  def f19(v0: s0, v1: s8): s8 = {
    var v6: s8 = v1
    v6
  }
  @noinline
  def f0(v0: s8, v1: Double): Double = {
    var v5: s8 = v0
    val v3: s0 = v5.p0
    val v6: s8 = f19(v3, v5)
    v5 = v5.copy(p0 = v3)
    v5 = v0
    v5 = v5.copy(p0 = v3)
    val v4: s0 = v6.p0
    var v13: s0 = v4
    val v11: Vector[Vector[Double]] = v3.p1
    val v9: s4 = v0.p1
    v13 = v13.copy(p1 = v11)
    var v2: Vector[Vector[Double]] = v11
    val v7: Vector[Double] = v2(0)
    val v20: s8 = f19(v13, v6)
    var v8: Vector[Double] = v7
    val v24: Vector[Vector[Double]] = v3.p0
    v8 = v7
    v5 = v5.copy(p0 = v3)
    val v23: s8 = f19(v3, v20)
    val v36: Vector[Vector[Double]] = v4.p1
    val v26: Double = v7(0)
    v2 = v2.updated(0, v7)
    val v22: Double = v26 / v26
    val v35: s0 = s0(v24, v2)
    val v48: Vector[Vector[Double]] = v13.p0
    var v30: Vector[Double] = v8
    v2 = v2.updated(0, v7)
    val v56: Vector[Vector[Double]] = v35.p0
    val v37: Vector[Double] = v56(1)
    v2 = v2.updated(0, v37)
    v8 = v8.updated(0, v26)
    v8 = v8.updated(0, v22)
    val v33: Double = v8(0)
    v30 = v30.updated(0, v26)
    v13 = v35
    v5 = v5.copy(p1 = v9)
    val v109: s0 = v23.p0
    v5 = v5.copy(p0 = v109)
    v2 = v2.updated(0, v30)
    v30 = v8
    v13 = v13.copy(p1 = v36)
    val v92: s0 = s0(v48, v36)
    v13 = v13.copy(p0 = v56)
    v5 = v5.copy(p0 = v92)
    v5 = v5.copy(p1 = v9)
    v33
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s4(Vector(Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))))
    val v1: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}