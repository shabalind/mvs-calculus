import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s5 (
    p0: s0,
    p1: Vector[s0]
  )
  def f39(v0: Vector[s5]): Vector[s5] = {
    var v6: Vector[s5] = v0
    var v7: Vector[s5] = v6
    val v5: s5 = v7(0)
    val v8: s5 = v7(0)
    var v2: s5 = v8
    v6 = v6.updated(0, v8)
    val v25: Vector[s0] = v5.p1
    v7 = v7.updated(0, v8)
    val v9: s0 = v5.p0
    var v12: Vector[s5] = v0
    val v13: s5 = v6(0)
    var v18: s5 = v8
    val v20: s5 = v0(0)
    val v41: Vector[s0] = v18.p1
    v2 = v2.copy(p1 = v41)
    v12 = v12.updated(0, v2)
    v2 = v2.copy(p1 = v25)
    v18 = v18.copy(p1 = v25)
    val v30: Vector[s0] = v13.p1
    v18 = v18.copy(p1 = v30)
    var v58: s5 = v20
    v6 = v6.updated(0, v2)
    var v65: s0 = v9
    v12 = v7
    v12 = v12.updated(0, v58)
    v58 = v58.copy(p0 = v65)
    v6 = v6.updated(0, v13)
    var v108: Vector[s5] = v0
    var v48: Vector[s5] = v108
    val v176: s5 = v48(0)
    v58 = v176
    v6 = v108
    v12
  }
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    val v3: Vector[s5] = f39(v0)
    val v6: s5 = v3(0)
    val v2: s5 = v3(0)
    var v16: s5 = v2
    val v18: Vector[s0] = v16.p1
    v16 = v16.copy(p1 = v18)
    val v23: s0 = v18(0)
    val v20: s0 = v6.p0
    val v10: Vector[Vector[Double]] = v23.p0
    v16 = v6
    var v14: s0 = v23
    val v38: Vector[Double] = v10(0)
    v16 = v16.copy(p0 = v14)
    v16 = v16.copy(p0 = v20)
    val v31: Vector[s0] = v6.p1
    val v36: Vector[Vector[Double]] = v23.p0
    val v27: Double = v38(0)
    v14 = v14.copy(p0 = v36)
    var v32: Double = v1
    v32 = v27
    v16 = v16.copy(p1 = v31)
    v32 = v27
    v32
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(s0(Vector(Vector(0.0), Vector(1.0)), Vector(2.0, 3.0)), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(6.0, 7.0)))))
    val v1: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}