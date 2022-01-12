import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0
  )
  def f70(v0: s0): s0 = {
    v0
  }
  def f68(v0: s0): s0 = {
    var v1: s0 = v0
    val v5: Vector[Vector[Double]] = v1.p0
    val v2: Vector[s0] = Vector(v0)
    val v9: s0 = f70(v1)
    var v3: Vector[s0] = v2
    val v12: Vector[Vector[Double]] = v1.p0
    v1 = v1.copy(p0 = v5)
    val v18: Vector[Vector[Vector[Double]]] = Vector(v12, v5, v5, v5, v5, v5)
    val v10: s0 = f70(v9)
    v3 = v3.updated(0, v9)
    val v8: s0 = f70(v10)
    val v17: Vector[Vector[Double]] = v18(1)
    val v13: Vector[Vector[Double]] = v10.p0
    val v22: s0 = f70(v10)
    v1 = v1.copy(p0 = v12)
    val v36: s0 = f70(v22)
    v1 = v1.copy(p0 = v17)
    v1 = v1.copy(p0 = v13)
    val v39: s0 = f70(v8)
    v3 = v3.updated(0, v39)
    var v31: Vector[s0] = v3
    var v32: Vector[Vector[Vector[Double]]] = v18
    val v42: Vector[Vector[Double]] = v36.p1
    val v34: Vector[Vector[Double]] = v32(0)
    val v113: s0 = s0(v34, v42)
    val v41: s0 = v31(0)
    val v100: Vector[Vector[Double]] = v41.p0
    v32 = v32.updated(0, v100)
    v113
  }
  def f13(v0: Vector[s1]): Vector[s1] = {
    v0
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v7: Vector[s1] = f13(v0)
    val v5: s1 = v7(0)
    val v11: s1 = v7(0)
    val v14: s1 = v7(0)
    var v4: s1 = v5
    val v18: s0 = v14.p0
    val v34: s0 = v11.p0
    val v16: s0 = f68(v34)
    val v17: s0 = v4.p0
    val v35: s1 = v0(0)
    v4 = v4.copy(p0 = v18)
    val v69: s0 = f70(v16)
    v4 = v4.copy(p0 = v69)
    v4 = v4.copy(p0 = v17)
    val v39: Vector[Vector[Double]] = v17.p1
    v4 = v4.copy(p0 = v17)
    val v24: Vector[Double] = v39(2)
    val v54: s0 = v35.p0
    val v38: Vector[Vector[Double]] = v54.p0
    val v82: s0 = s0(v38, v39)
    var v104: Vector[Double] = v24
    v4 = v4.copy(p0 = v82)
    v4 = v4.copy(p0 = v16)
    v4 = v4.copy(p0 = v69)
    val v144: Double = v104(0)
    v144
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))))
    val v1: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}