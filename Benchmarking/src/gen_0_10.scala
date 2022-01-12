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
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v6: Vector[s1] = v0(1)
    val v12: s1 = v6(0)
    val v9: s0 = v12.p0
    var v10: s0 = v9
    val v8: s1 = v6(0)
    val v32: Vector[Vector[Double]] = v10.p1
    var v18: s1 = v8
    var v17: s0 = v9
    var v11: Vector[Vector[Double]] = v32
    var v20: Vector[Vector[Double]] = v32
    var v22: s1 = v18
    val v43: s0 = v8.p0
    var v34: s0 = v17
    val v13: Vector[Double] = v20(0)
    val v14: s0 = v22.p0
    v18 = v18.copy(p0 = v17)
    v20 = v20.updated(0, v13)
    val v30: Vector[Vector[Double]] = v43.p0
    var v26: s0 = v43
    val v21: Vector[Double] = v11(0)
    v17 = v17.copy(p0 = v30)
    v34 = v34.copy(p0 = v30)
    v34 = v17
    v18 = v18.copy(p0 = v26)
    v22 = v22.copy(p0 = v26)
    val v36: Vector[Double] = v11(0)
    v26 = v26.copy(p1 = v11)
    val v41: s0 = v22.p0
    v20 = v20.updated(0, v36)
    val v31: Vector[Vector[Double]] = v17.p1
    val v71: Vector[Vector[Double]] = Vector(v13, v36, v13)
    val v68: Vector[Vector[Double]] = v34.p1
    v20 = v20.updated(0, v36)
    v22 = v22.copy(p0 = v9)
    val v27: Vector[Double] = v31(0)
    v26 = v14
    val v62: Vector[Double] = v71(1)
    v11 = v11.updated(0, v62)
    val v35: Vector[Vector[Double]] = v14.p0
    v20 = v20.updated(0, v21)
    var v66: Vector[Vector[Double]] = v30
    val v37: Vector[Vector[Double]] = v41.p1
    v26 = v26.copy(p0 = v66)
    val v121: Vector[Double] = v66(1)
    val v48: Vector[Vector[Double]] = v10.p0
    v66 = v66.updated(2, v62)
    v66 = v66.updated(2, v27)
    val v110: Double = v121(0)
    v34 = v34.copy(p0 = v35)
    v26 = v26.copy(p0 = v48)
    v17 = v17.copy(p1 = v68)
    v10 = v10.copy(p1 = v37)
    v110
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))))), Vector(s1(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))))
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