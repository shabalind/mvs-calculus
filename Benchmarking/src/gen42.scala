import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  def f92(v0: s0): s0 = {
    val v1: Vector[s0] = Vector(v0, v0, v0, v0)
    val v7: s0 = v1(1)
    val v6: s0 = v1(0)
    val v4: s0 = v1(3)
    val v9: s0 = v1(3)
    val v14: Vector[Double] = v9.p0
    val v13: Double = v14(1)
    var v18: Double = v13
    var v25: Vector[s0] = v1
    val v22: s0 = v25(2)
    v25 = v25.updated(1, v4)
    val v35: Vector[Double] = v4.p0
    v25 = v25.updated(2, v22)
    v25 = v25.updated(3, v6)
    val v34: s0 = v1(2)
    val v36: s0 = v25(3)
    var v98: Vector[Double] = v35
    v25 = v25.updated(2, v34)
    val v83: Vector[Vector[Double]] = v6.p1
    var v57: s0 = v0
    val v84: Vector[Double] = v57.p0
    val v55: Vector[Double] = v7.p0
    var v71: s0 = v6
    val v117: s0 = v1(1)
    val v86: Vector[Double] = v22.p0
    v25 = v25.updated(3, v71)
    v71 = v71.copy(p0 = v55)
    var v67: Vector[Double] = v35
    v67 = v67.updated(1, v18)
    v71 = v71.copy(p0 = v84)
    var v113: s0 = v36
    v57 = v57.copy(p0 = v67)
    v113 = v113.copy(p0 = v86)
    v57 = v57.copy(p0 = v98)
    v57 = v117
    v71 = v71.copy(p1 = v83)
    v113
  }
  @noinline
  def f0(v0: s0, v1: s0, v2: Double): Double = {
    var v6: s0 = v1
    val v3: Vector[Vector[Double]] = v1.p1
    val v5: s0 = f92(v6)
    val v16: Vector[Double] = v1.p0
    val v12: Vector[Double] = v3(2)
    v6 = v6.copy(p0 = v16)
    val v35: Vector[Double] = v3(0)
    var v29: Vector[Vector[Double]] = v3
    val v30: Vector[Double] = v3(1)
    val v23: Vector[Vector[Double]] = v5.p1
    var v47: Vector[Vector[Double]] = v29
    v47 = v47.updated(2, v12)
    v47 = v47.updated(1, v35)
    v6 = v6.copy(p1 = v47)
    v6 = v6.copy(p1 = v3)
    val v70: Vector[Double] = v23(0)
    v29 = v29.updated(1, v30)
    v6 = v6.copy(p1 = v23)
    val v87: Vector[Double] = v29(1)
    val v51: Double = v70(0)
    v47 = v47.updated(2, v87)
    v29 = v29.updated(0, v35)
    v47 = v47.updated(0, v87)
    v51
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))
    val v1: s0 = s0(Vector(5.0, 6.0), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))
    val v2: Double = 10.0
    val start = nanoTime()
    var result: Double = 10.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}