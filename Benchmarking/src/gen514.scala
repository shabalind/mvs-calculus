import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f20(v0: s1): s1 = {
    var v7: s1 = v0
    val v3: Vector[s0] = v0.p1
    val v2: Vector[s0] = v0.p1
    v7 = v7.copy(p1 = v2)
    val v28: Vector[s0] = v0.p0
    val v23: Vector[s0] = v7.p1
    val v29: Vector[s0] = v0.p1
    v7 = v7.copy(p1 = v2)
    val v35: Vector[s0] = v0.p1
    v7 = v7.copy(p1 = v29)
    v7 = v7.copy(p1 = v3)
    v7 = v7.copy(p1 = v23)
    var v47: s1 = v7
    v7 = v7.copy(p1 = v35)
    v47 = v47.copy(p0 = v28)
    var v86: s1 = v47
    v86
  }
  def f2(v0: Double, v1: s1): Double = {
    val v27: Double = v0 + v0
    var v68: Double = v27
    v68
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v7: Vector[s1] = v0(0)
    var v8: Vector[Vector[s1]] = v0
    val v4: s1 = v7(0)
    v8 = v8.updated(0, v7)
    val v2: Vector[s1] = v0(0)
    val v9: Vector[s1] = v0(0)
    val v3: s1 = f20(v4)
    val v5: Vector[s1] = v8(0)
    v8 = v8.updated(0, v2)
    val v6: s1 = v5(0)
    v8 = v8.updated(0, v9)
    val v20: Double = f2(v1, v3)
    v8 = v8.updated(0, v5)
    val v11: Vector[s1] = v0(0)
    v8 = v0
    v8 = v8.updated(0, v7)
    val v17: Vector[s0] = v4.p1
    var v24: s1 = v3
    v8 = v8.updated(0, v7)
    val v32: Double = f2(v20, v4)
    val v18: Vector[s0] = v6.p0
    v8 = v8.updated(0, v5)
    v24 = v24.copy(p0 = v18)
    var v19: s1 = v6
    val v23: s1 = f20(v19)
    var v30: s1 = v6
    v19 = v19.copy(p0 = v18)
    v8 = v8.updated(0, v2)
    val v55: Double = v20 * v32
    var v44: Vector[s1] = v11
    v44 = v44.updated(0, v30)
    var v33: s1 = v23
    val v48: s1 = f20(v33)
    val v53: s1 = f20(v48)
    v30 = v19
    v33 = v33.copy(p1 = v17)
    val v50: Double = f2(v55, v53)
    v8 = v8.updated(0, v7)
    v8 = v8.updated(0, v44)
    val v57: Vector[s0] = v24.p0
    v8 = v8.updated(0, v44)
    v8 = v8.updated(0, v44)
    v8 = v8.updated(0, v11)
    v33 = v33.copy(p0 = v57)
    v50
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))))))
    val v1: Double = 9.0
    val start = nanoTime()
    var result: Double = 9.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}