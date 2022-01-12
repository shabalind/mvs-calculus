import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f2(v0: s0): s0 = {
    var v5: s0 = v0
    val v6: Vector[Vector[Double]] = v5.p1
    v5 = v5.copy(p1 = v6)
    v5 = v5.copy(p1 = v6)
    v5 = v5.copy(p1 = v6)
    val v10: Vector[Vector[Double]] = v0.p1
    var v9: Vector[Vector[Double]] = v10
    v5 = v5.copy(p1 = v9)
    v5
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v3: Vector[Vector[Double]] = v0.p1
    var v7: Double = v1
    var v6: s0 = v0
    var v5: Double = v7
    v6 = v6.copy(p1 = v3)
    val v4: s0 = f2(v6)
    val v8: s0 = f2(v0)
    val v12: Vector[Double] = v3(1)
    val v10: Vector[Vector[Double]] = v4.p0
    val v15: s0 = f2(v6)
    val v13: s0 = f2(v8)
    val v17: Vector[Vector[Double]] = v4.p0
    val v9: s0 = f2(v13)
    var v16: Vector[Double] = v12
    val v24: Vector[Double] = v17(0)
    val v19: s0 = f2(v4)
    v5 = v7
    v6 = v6.copy(p0 = v10)
    val v18: s0 = f2(v8)
    var v21: Vector[Vector[Double]] = v3
    v6 = v6.copy(p0 = v17)
    v6 = v6.copy(p0 = v17)
    val v23: Vector[Vector[Double]] = v8.p1
    val v36: Double = v24(0)
    v21 = v21.updated(2, v16)
    val v46: Double = v24(0)
    val v44: s0 = f2(v15)
    v21 = v21.updated(0, v16)
    val v31: Vector[Double] = v10(0)
    v21 = v21.updated(2, v24)
    val v47: Vector[Double] = v17(0)
    var v35: Vector[Double] = v16
    val v20: Vector[Vector[Double]] = v4.p1
    v21 = v21.updated(1, v35)
    val v42: Vector[Vector[Double]] = v13.p1
    var v25: Vector[Vector[Double]] = v3
    v6 = v6.copy(p1 = v25)
    val v41: Vector[Vector[Vector[Double]]] = Vector(v3, v23, v20, v20, v3, v3)
    val v26: Vector[Vector[Double]] = v19.p1
    v6 = v6.copy(p0 = v10)
    val v50: Vector[Double] = v25(0)
    v6 = v44
    val v56: Vector[Vector[Double]] = v9.p0
    var v62: Vector[Double] = v12
    v25 = v25.updated(1, v62)
    val v105: Vector[Vector[Double]] = v15.p0
    val v58: Vector[Vector[Vector[Double]]] = Vector(v42)
    val v54: Vector[Vector[Double]] = v41(5)
    v16 = v16.updated(0, v7)
    v6 = v6.copy(p0 = v56)
    v35 = v35.updated(0, v7)
    v62 = v62.updated(0, v1)
    val v197: s0 = f2(v18)
    val v33: Vector[Vector[Double]] = v58(0)
    v21 = v21.updated(2, v50)
    v21 = v54
    val v149: Vector[Double] = v23(1)
    var v71: Vector[Vector[Double]] = v25
    val v83: s0 = s0(v10, v54)
    val v69: s0 = f2(v18)
    val v185: Vector[Vector[Double]] = v83.p0
    v6 = v69
    v21 = v21.updated(0, v149)
    val v161: Vector[Vector[Double]] = v197.p0
    val v78: Vector[Double] = v26(1)
    var v82: Double = v1
    v62 = v62.updated(0, v46)
    v6 = v6.copy(p0 = v161)
    val v311: Vector[Double] = Vector(v82, v1, v36, v5, v46, v36, v36)
    val v183: s0 = s0(v185, v21)
    v16 = v16.updated(0, v36)
    v6 = v6.copy(p0 = v105)
    v25 = v25.updated(0, v78)
    val v72: Vector[Vector[Double]] = v183.p1
    v25 = v25.updated(2, v47)
    val v178: Double = v311(5)
    v6 = v6.copy(p1 = v72)
    v6 = v6.copy(p0 = v185)
    v71 = v71.updated(0, v31)
    v6 = v6.copy(p1 = v33)
    v6 = v6.copy(p1 = v71)
    v6 = v6.copy(p0 = v161)
    v178
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))
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