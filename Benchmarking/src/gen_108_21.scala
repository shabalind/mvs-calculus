import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s5 (
    p0: s2
  )
  def f31(v0: s5): s5 = {
    val v3: s2 = v0.p0
    val v7: s5 = s5(v3)
    val v14: s2 = v7.p0
    val v21: Vector[s2] = Vector(v3, v3, v14, v3)
    val v26: s2 = v21(0)
    var v36: s5 = v0
    val v24: s2 = v21(2)
    v36 = v36.copy(p0 = v26)
    v36 = v36.copy(p0 = v24)
    var v107: s5 = v36
    v107
  }
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    val v9: s5 = v0(2)
    val v8: s5 = v0(2)
    val v16: s2 = v9.p0
    val v11: s5 = f31(v8)
    val v10: s2 = v11.p0
    val v32: s2 = v9.p0
    var v45: s2 = v16
    v45 = v10
    val v52: s0 = v32.p0
    val v31: s0 = v45.p1
    val v79: Vector[Vector[Double]] = v31.p0
    var v74: s0 = v52
    var v87: Vector[Vector[Double]] = v79
    val v47: Vector[Vector[Double]] = v74.p0
    val v118: Vector[Double] = v87(2)
    val v66: Vector[Double] = v47(2)
    v87 = v87.updated(0, v66)
    var v78: Vector[Vector[Double]] = v47
    val v129: Vector[Double] = v79(2)
    v78 = v78.updated(2, v129)
    val v132: Double = v118(0)
    val v134: Vector[Double] = v78(0)
    v87 = v87.updated(2, v134)
    v132
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))), s5(s2(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))), s5(s2(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))))
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