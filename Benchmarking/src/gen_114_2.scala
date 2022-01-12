import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  def f93(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p2
    val v12: Vector[Vector[Double]] = v0.p3
    val v3: Vector[Double] = v12(1)
    val v7: Vector[Double] = v12(0)
    val v8: Vector[Vector[Double]] = v0.p3
    val v25: Vector[Vector[Double]] = v0.p0
    var v15: Vector[Vector[Double]] = v12
    val v17: s0 = s0(v2, v15, v25, v15)
    val v30: Vector[Vector[Double]] = v17.p1
    v15 = v15.updated(0, v3)
    var v20: Vector[Vector[Double]] = v8
    val v28: Vector[Vector[Double]] = v0.p1
    v20 = v20.updated(1, v7)
    val v27: Vector[Vector[Double]] = v0.p2
    val v35: s0 = s0(v27, v20, v27, v30)
    val v48: Vector[Double] = v28(0)
    val v40: Vector[Vector[Double]] = v35.p0
    v15 = v15.updated(1, v48)
    val v124: s0 = s0(v25, v30, v40, v12)
    v124
  }
  def f89(v0: s0): s0 = {
    val v1: s0 = f93(v0)
    val v2: s0 = f93(v0)
    val v10: Vector[Vector[Double]] = v2.p1
    val v24: Vector[Vector[Double]] = v1.p0
    val v12: Vector[Vector[Double]] = v2.p3
    val v15: s0 = s0(v24, v12, v24, v10)
    val v186: s0 = f93(v15)
    v186
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v7: Vector[Vector[Double]] = v0.p2
    var v4: s0 = v0
    val v5: Vector[Vector[Double]] = v4.p1
    var v8: Vector[Vector[Double]] = v7
    var v10: s0 = v4
    val v3: Vector[Double] = v7(0)
    v4 = v0
    v4 = v0
    val v18: s0 = f89(v10)
    val v16: Vector[Vector[Double]] = v18.p1
    val v11: Vector[Vector[Double]] = v10.p3
    val v14: Vector[Vector[Double]] = v10.p2
    val v43: Vector[Vector[Double]] = v18.p3
    val v15: Vector[Vector[Vector[Double]]] = Vector(v7, v8)
    v8 = v8.updated(1, v3)
    val v22: s0 = f89(v10)
    val v24: s0 = f89(v4)
    var v34: s0 = v22
    v8 = v8.updated(0, v3)
    val v25: Vector[Double] = v5(1)
    v8 = v8.updated(2, v25)
    val v36: Vector[Vector[Double]] = v34.p0
    val v66: s0 = f93(v4)
    v8 = v8.updated(0, v3)
    v4 = v4.copy(p2 = v7)
    val v32: Vector[Vector[Double]] = v24.p1
    val v41: Vector[Vector[Double]] = v15(0)
    v8 = v8.updated(0, v3)
    v8 = v8.updated(2, v3)
    v8 = v8.updated(2, v3)
    v8 = v8.updated(2, v25)
    v10 = v10.copy(p1 = v43)
    val v27: Vector[Vector[Double]] = v34.p0
    val v30: Vector[Vector[Double]] = v66.p1
    v4 = v4.copy(p2 = v8)
    v4 = v4.copy(p0 = v14)
    var v31: Vector[Double] = v25
    val v37: s0 = f89(v0)
    v34 = v34.copy(p1 = v11)
    v4 = v4.copy(p0 = v27)
    v31 = v31.updated(0, v1)
    v34 = v34.copy(p2 = v36)
    val v53: Vector[Vector[Double]] = v15(0)
    v4 = v4.copy(p0 = v41)
    val v46: Vector[Vector[Double]] = v37.p3
    v34 = v34.copy(p2 = v7)
    v8 = v8.updated(2, v31)
    v34 = v34.copy(p1 = v32)
    val v152: Vector[Vector[Double]] = v34.p1
    v34 = v34.copy(p1 = v16)
    v10 = v10.copy(p0 = v53)
    v4 = v4.copy(p1 = v46)
    v10 = v10.copy(p3 = v152)
    val v115: Double = v31(0)
    v10 = v10.copy(p3 = v30)
    val v172: Vector[Vector[Double]] = v15(0)
    v10 = v10.copy(p2 = v172)
    v10 = v10.copy(p1 = v43)
    v115
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))
    val v1: Double = 10.0
    val start = nanoTime()
    var result: Double = 10.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}