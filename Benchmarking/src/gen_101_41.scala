import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f28(v0: s0): s0 = {
    var v7: s0 = v0
    var v5: s0 = v7
    val v4: Vector[Vector[Double]] = v5.p0
    var v9: Vector[Vector[Double]] = v4
    val v1: Vector[Double] = v4(0)
    v9 = v9.updated(0, v1)
    val v6: Vector[Vector[Vector[Double]]] = Vector(v4, v9, v4, v9, v4, v4, v9)
    var v3: Vector[Vector[Vector[Double]]] = v6
    val v10: Double = v1(0)
    val v8: Vector[Vector[Double]] = v5.p1
    val v14: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Double] = v8(0)
    val v20: Vector[Vector[Double]] = v0.p0
    var v15: Vector[Vector[Double]] = v8
    var v13: Vector[Double] = v1
    var v17: Vector[Vector[Vector[Double]]] = v6
    v5 = v5.copy(p1 = v15)
    val v24: Vector[Vector[Double]] = v5.p0
    val v12: Vector[Vector[Double]] = v5.p1
    val v11: Vector[Vector[Double]] = v0.p0
    val v28: Vector[Vector[Double]] = v17(2)
    v3 = v3.updated(2, v28)
    val v29: Double = v10 * v10
    var v19: Vector[Double] = v2
    var v26: Vector[Double] = v1
    v9 = v14
    v3 = v3.updated(4, v28)
    v5 = v5.copy(p1 = v8)
    val v39: Vector[Vector[Double]] = v6(2)
    var v46: s0 = v0
    var v23: Vector[Double] = v26
    val v25: Double = v29 + v10
    var v35: Vector[Vector[Double]] = v8
    val v27: Vector[s0] = Vector(v7, v5, v5)
    var v57: s0 = v46
    v9 = v9.updated(1, v23)
    val v67: s0 = v27(1)
    val v48: Vector[Vector[Double]] = v3(1)
    val v44: Vector[Vector[Double]] = v46.p1
    val v37: Vector[Vector[Double]] = v67.p1
    v5 = v5.copy(p0 = v24)
    val v81: Vector[Vector[Double]] = v0.p1
    val v61: s0 = s0(v48, v12)
    v46 = v46.copy(p0 = v11)
    val v78: Vector[Vector[Double]] = v67.p1
    val v47: Vector[Vector[Vector[Double]]] = Vector(v48, v39, v20)
    v46 = v61
    v9 = v9.updated(2, v19)
    v46 = v46.copy(p1 = v44)
    v19 = v19.updated(0, v25)
    v5 = v5.copy(p0 = v20)
    var v68: s0 = v57
    v46 = v46.copy(p1 = v81)
    v9 = v9.updated(2, v13)
    val v55: Vector[Vector[Double]] = v47(1)
    v5 = v5.copy(p1 = v78)
    val v53: Vector[Vector[Double]] = v6(1)
    v7 = v61
    v17 = v17.updated(1, v53)
    var v186: s0 = v68
    v186 = v186.copy(p1 = v35)
    v35 = v37
    v15 = v15.updated(0, v26)
    v15 = v15.updated(0, v26)
    v68 = v68.copy(p0 = v4)
    v186 = v186.copy(p0 = v24)
    v186 = v186.copy(p0 = v55)
    v186
  }
  def f10(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p0
    val v5: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Vector[Double]] = v0.p1
    val v9: Vector[Double] = v4(1)
    var v13: Vector[Vector[Double]] = v5
    val v15: s0 = s0(v3, v13)
    v13 = v13.updated(0, v9)
    val v16: Vector[Double] = v13(0)
    v13 = v2
    val v142: s0 = f28(v15)
    v13 = v13.updated(0, v16)
    val v59: s0 = f28(v142)
    v59
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v7: s0 = f28(v0)
    var v4: s0 = v0
    val v2: Vector[Vector[Double]] = v4.p0
    val v6: s0 = f10(v7)
    var v3: s0 = v0
    val v8: s0 = f28(v0)
    v4 = v8
    val v13: Vector[Vector[Vector[Double]]] = Vector(v2, v2, v2, v2, v2)
    val v18: Vector[Vector[Double]] = v13(0)
    val v16: Vector[Double] = v18(0)
    v4 = v4.copy(p0 = v2)
    v4 = v4.copy(p0 = v18)
    val v20: Vector[Vector[Double]] = v3.p1
    v4 = v4.copy(p1 = v20)
    val v19: Vector[Vector[Double]] = v6.p1
    v4 = v4.copy(p1 = v19)
    val v35: Double = v16(0)
    val v36: Vector[Vector[Double]] = v0.p1
    v3 = v3.copy(p1 = v20)
    var v31: Vector[Vector[Double]] = v36
    var v30: Vector[Vector[Double]] = v36
    v4 = v4.copy(p1 = v20)
    val v90: Vector[Vector[Double]] = v3.p1
    val v58: Vector[Double] = v36(0)
    val v83: Vector[Double] = v30(0)
    v4 = v4.copy(p1 = v31)
    val v108: Double = v35 + v1
    v4 = v4.copy(p1 = v90)
    v30 = v30.updated(0, v58)
    v3 = v3.copy(p1 = v19)
    v31 = v31.updated(0, v83)
    v108
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