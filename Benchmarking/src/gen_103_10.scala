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
  @noinline
  def f0(v0: s0, v1: Vector[s1], v2: Vector[s0], v3: Double): Double = {
    val v6: s1 = v1(0)
    val v7: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Vector[Double]] = v0.p0
    val v14: s0 = v6.p0
    val v15: s1 = v1(2)
    val v16: Vector[Double] = v7(0)
    val v12: s0 = v15.p1
    val v4: Vector[Vector[Double]] = v12.p1
    val v10: s1 = v1(0)
    val v20: s0 = v10.p0
    var v13: s0 = v20
    var v23: Vector[Vector[Double]] = v5
    val v17: Vector[Double] = v23(0)
    v23 = v23.updated(0, v16)
    val v27: s0 = v6.p1
    var v33: s1 = v10
    v33 = v33.copy(p1 = v14)
    val v45: s0 = v33.p0
    v33 = v33.copy(p1 = v27)
    val v40: Vector[Double] = v23(0)
    val v25: Vector[Vector[Double]] = v45.p1
    val v49: Double = v40(0)
    v23 = v23.updated(0, v40)
    var v62: Vector[Double] = v17
    v62 = v40
    v13 = v13.copy(p1 = v4)
    val v47: Vector[Double] = v25(1)
    val v88: Double = v49 / v49
    val v66: Double = v47(0)
    v23 = v23.updated(0, v47)
    v23 = v23.updated(0, v62)
    var v134: Double = v88
    v33 = v33.copy(p0 = v13)
    v62 = v62.updated(0, v49)
    v62 = v62.updated(0, v66)
    v13 = v13.copy(p0 = v23)
    var v107: Double = v134
    v107
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))
    val v1: Vector[s1] = Vector(s1(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), s1(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s1(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)))))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))))
    val v3: Double = 27.0
    val start = nanoTime()
    var result: Double = 27.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}