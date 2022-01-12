import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f80(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Vector[Double]] = v0.p0
    var v2: Vector[Vector[Double]] = v5
    val v4: s0 = s0(v2, v1)
    val v9: Vector[Vector[Double]] = v4.p0
    v2 = v5
    val v11: Vector[Double] = v9(0)
    v2 = v2.updated(0, v11)
    v2 = v9
    val v22: Vector[Vector[Double]] = v4.p1
    val v41: s0 = s0(v9, v22)
    v41
  }
  def f73(v0: s0): s0 = {
    val v5: s0 = f80(v0)
    val v3: Vector[Vector[Double]] = v5.p0
    val v4: Vector[Vector[Double]] = v0.p0
    val v1: s0 = f80(v0)
    val v8: Vector[Vector[Double]] = v5.p1
    val v7: s0 = f80(v0)
    var v10: s0 = v1
    val v12: Vector[Vector[Double]] = v10.p1
    v10 = v10.copy(p0 = v4)
    val v27: Vector[Vector[Double]] = v0.p1
    val v16: Vector[Vector[Double]] = v0.p1
    v10 = v10.copy(p1 = v8)
    val v26: s0 = f80(v7)
    v10 = v10.copy(p1 = v16)
    val v44: s0 = f80(v10)
    val v59: Vector[Vector[Double]] = v44.p0
    val v43: s0 = f80(v26)
    v10 = v10.copy(p0 = v59)
    val v36: Vector[Vector[Double]] = v43.p0
    val v39: s0 = f80(v43)
    val v45: s0 = s0(v36, v16)
    v10 = v10.copy(p1 = v12)
    v10 = v10.copy(p0 = v36)
    v10 = v10.copy(p0 = v3)
    val v53: Vector[Vector[Double]] = v39.p0
    v10 = v10.copy(p1 = v16)
    val v126: s0 = f80(v44)
    v10 = v10.copy(p0 = v53)
    v10 = v10.copy(p1 = v27)
    v10 = v10.copy(p0 = v53)
    v10 = v10.copy(p0 = v53)
    val v98: s0 = f80(v126)
    val v65: Vector[Vector[Double]] = v45.p1
    v10 = v10.copy(p1 = v65)
    v10 = v10.copy(p0 = v59)
    val v105: s0 = f80(v98)
    v105
  }
  def f65(v0: s0): s0 = {
    var v1: s0 = v0
    var v3: s0 = v1
    val v2: Vector[Vector[Double]] = v1.p1
    v3 = v3.copy(p1 = v2)
    v3
  }
  def f35(v0: s0): s0 = {
    val v3: s0 = f65(v0)
    var v5: s0 = v0
    var v6: s0 = v5
    val v1: s0 = f73(v5)
    val v2: Vector[Vector[Double]] = v1.p1
    val v25: s0 = f80(v3)
    var v11: s0 = v25
    var v22: s0 = v6
    var v36: Vector[Vector[Double]] = v2
    v5 = v5.copy(p1 = v2)
    v5 = v1
    val v17: s0 = f80(v11)
    v11 = v11.copy(p1 = v2)
    v5 = v5.copy(p1 = v36)
    val v34: Vector[Vector[Double]] = v22.p1
    v11 = v11.copy(p1 = v34)
    val v33: Vector[Vector[Double]] = v17.p0
    val v37: Vector[Vector[Double]] = v0.p0
    var v20: Vector[Vector[Double]] = v33
    val v69: s0 = f65(v1)
    v5 = v5.copy(p0 = v33)
    v6 = v6.copy(p0 = v20)
    v36 = v34
    var v48: Vector[Vector[Double]] = v37
    v22 = v22.copy(p0 = v48)
    v69
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    var v8: s0 = v0
    var v2: s0 = v0
    val v4: Vector[Vector[Double]] = v0.p0
    val v6: Vector[Vector[Double]] = v8.p1
    val v14: s0 = f35(v2)
    v2 = v2.copy(p1 = v6)
    v8 = v8.copy(p0 = v4)
    val v42: s0 = f73(v14)
    val v52: Vector[Vector[Double]] = v42.p1
    val v44: Vector[Double] = v52(0)
    val v69: Double = v44(0)
    var v71: Double = v69
    v71
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))
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