import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  def f18(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p0
    val v8: Vector[Vector[Double]] = v0.p0
    val v6: Vector[Vector[Double]] = v0.p0
    val v2: s0 = s0(v8, v6, v7)
    val v17: Vector[Vector[Double]] = v0.p2
    val v11: Vector[Vector[Double]] = v0.p0
    val v40: Vector[Vector[Double]] = v0.p1
    val v26: s0 = s0(v17, v11, v6)
    var v56: s0 = v26
    val v51: s1 = s1(v2, v56)
    var v52: s1 = v51
    v56 = v56.copy(p0 = v40)
    val v62: s0 = v52.p1
    v56 = v56.copy(p0 = v7)
    val v100: s0 = v52.p0
    v52 = v52.copy(p0 = v62)
    v100
  }
  def f15(v0: s1, v1: Vector[s0]): Vector[s0] = {
    val v3: s0 = v0.p1
    var v44: Vector[s0] = v1
    v44 = v44.updated(0, v3)
    v44 = v1
    v44
  }
  def f12(v0: s0): s0 = {
    var v3: s0 = v0
    val v6: s0 = f18(v0)
    val v7: s0 = f18(v6)
    var v1: s0 = v6
    val v4: Vector[Vector[Double]] = v6.p0
    val v8: s1 = s1(v0, v0)
    val v9: Vector[Vector[Double]] = v6.p1
    val v5: Vector[Vector[Double]] = v1.p1
    var v13: s0 = v7
    val v11: s0 = f18(v7)
    val v14: s0 = f18(v7)
    val v18: s1 = s1(v1, v6)
    val v16: s0 = v8.p0
    val v20: s0 = f18(v14)
    var v21: s1 = v18
    val v23: Vector[Vector[Double]] = v1.p0
    v1 = v1.copy(p1 = v23)
    var v35: s1 = v18
    val v36: Vector[Vector[Double]] = v20.p0
    val v44: Vector[Vector[Double]] = v14.p0
    v1 = v1.copy(p2 = v5)
    var v42: s1 = v21
    v1 = v1.copy(p1 = v44)
    v3 = v3.copy(p2 = v9)
    v3 = v3.copy(p2 = v5)
    v42 = v42.copy(p1 = v16)
    val v58: Vector[s0] = Vector(v3)
    v35 = v35.copy(p1 = v11)
    val v37: s0 = v18.p1
    v1 = v1.copy(p2 = v4)
    v35 = v35.copy(p1 = v7)
    var v68: s1 = v42
    val v96: Vector[s0] = f15(v68, v58)
    val v27: Vector[s0] = f15(v21, v96)
    val v29: s0 = v27(0)
    var v52: s1 = v18
    val v65: s0 = v52.p1
    v1 = v1.copy(p1 = v36)
    var v66: s1 = v35
    val v118: Vector[s0] = f15(v8, v96)
    val v64: s0 = v68.p0
    val v98: s0 = v66.p0
    v1 = v65
    val v82: s0 = v118(0)
    v66 = v66.copy(p0 = v6)
    val v117: s1 = s1(v65, v13)
    v66 = v66.copy(p0 = v29)
    v52 = v52.copy(p0 = v20)
    v52 = v117
    v42 = v42.copy(p0 = v37)
    val v95: s0 = f18(v82)
    v68 = v68.copy(p1 = v95)
    v35 = v35.copy(p0 = v64)
    v35 = v35.copy(p1 = v3)
    v98
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v6: s0 = v0.p0
    val v3: s0 = f12(v6)
    var v2: s1 = v0
    var v10: s1 = v2
    v2 = v2.copy(p0 = v3)
    val v15: s0 = v10.p1
    val v20: s0 = v0.p0
    v10 = v10.copy(p1 = v20)
    val v39: Vector[Vector[Double]] = v15.p2
    val v16: s0 = f12(v3)
    v10 = v10.copy(p0 = v16)
    val v14: Vector[Double] = v39(0)
    val v50: Double = v14(0)
    v50
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0)), Vector(Vector(5.0))))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}