import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  def f29(v0: Double): Double = {
    var v5: Double = v0
    var v3: Double = v0
    var v8: Double = v3
    var v2: Double = v3
    val v7: Vector[Double] = Vector(v5, v5, v5)
    val v4: Double = v7(0)
    val v6: Double = v7(1)
    var v12: Double = v8
    val v10: Double = v7(2)
    val v13: Double = v7(2)
    var v18: Vector[Double] = v7
    v2 = v4
    v18 = v18.updated(2, v13)
    var v15: Vector[Double] = v7
    var v28: Vector[Double] = v15
    v8 = v13
    var v16: Vector[Double] = v28
    v15 = v15.updated(1, v6)
    var v20: Vector[Double] = v28
    v18 = v18.updated(0, v12)
    val v67: Double = v15(2)
    val v23: Vector[Vector[Double]] = Vector(v28, v16, v28, v18, v18, v28, v15)
    v28 = v28.updated(0, v0)
    v15 = v15.updated(1, v67)
    var v40: Double = v2
    v18 = v18.updated(0, v2)
    var v29: Double = v0
    val v55: Double = v20(2)
    val v33: Vector[Double] = v23(6)
    v28 = v28.updated(1, v40)
    var v26: Vector[Vector[Double]] = v23
    v15 = v15.updated(1, v4)
    val v25: Double = v13 * v29
    v18 = v18.updated(1, v25)
    var v86: Vector[Vector[Double]] = v26
    v28 = v28.updated(0, v55)
    v20 = v20.updated(2, v10)
    v86 = v86.updated(1, v33)
    val v101: Vector[Double] = v26(4)
    val v99: Double = v101(1)
    val v80: Double = v7(1)
    var v92: Vector[Double] = v20
    var v47: Double = v80
    var v93: Double = v99
    val v144: Vector[Double] = v86(0)
    var v74: Vector[Double] = v144
    v74 = v74.updated(2, v10)
    val v168: Double = v16(0)
    val v88: Double = v74(1)
    val v191: Vector[Double] = Vector(v47, v80)
    v18 = v18.updated(2, v168)
    v86 = v86.updated(1, v92)
    v20 = v20.updated(0, v93)
    var v272: Vector[Double] = v191
    val v94: Double = v272(0)
    v74 = v74.updated(0, v94)
    v88
  }
  @noinline
  def f0(v0: s0, v1: s2, v2: Vector[s1], v3: Double): Double = {
    var v7: Double = v3
    val v14: Double = f29(v7)
    v7 = v3
    val v29: Double = v7 - v14
    v29
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))
    val v1: s2 = s2(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))))
    val v2: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))
    val v3: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}