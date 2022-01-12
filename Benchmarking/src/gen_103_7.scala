import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f12(v0: Double): Double = {
    var v3: Double = v0
    var v5: Double = v0
    var v7: Double = v5
    var v2: Double = v3
    v5 = v7
    var v1: Double = v0
    var v9: Double = v1
    var v4: Double = v2
    v7 = v9
    var v8: Double = v9
    var v11: Double = v5
    val v12: Vector[Double] = Vector(v9, v8)
    var v16: Vector[Double] = v12
    var v21: Vector[Double] = v12
    v16 = v16.updated(1, v0)
    v8 = v7
    val v43: Double = v21(0)
    var v35: Vector[Double] = v16
    v16 = v16.updated(1, v5)
    var v36: Vector[Double] = v21
    v16 = v16.updated(0, v43)
    v36 = v36.updated(0, v3)
    val v37: Double = v36(0)
    v35 = v35.updated(1, v3)
    v36 = v36.updated(1, v3)
    v16 = v16.updated(0, v37)
    var v42: Vector[Double] = v16
    v21 = v42
    var v31: Vector[Double] = v35
    var v52: Vector[Double] = v31
    v31 = v31.updated(0, v4)
    v52 = v52.updated(1, v11)
    val v40: Double = v52(0)
    v16 = v16.updated(1, v5)
    v31 = v31.updated(0, v0)
    v40
  }
  @noinline
  def f0(v0: Double): Double = {
    val v6: Vector[Double] = Vector(v0, v0, v0, v0, v0, v0, v0)
    var v5: Vector[Double] = v6
    var v7: Double = v0
    var v4: Double = v7
    val v2: Double = f12(v0)
    var v1: Vector[Double] = v5
    val v3: Double = f12(v0)
    var v12: Vector[Double] = v6
    val v10: Double = v1(6)
    var v11: Double = v4
    val v17: Double = f12(v7)
    var v13: Double = v2
    val v21: Double = v6(5)
    val v35: Double = v12(1)
    v13 = v3
    v5 = v5.updated(6, v3)
    var v34: Double = v17
    val v22: Double = f12(v17)
    val v49: Vector[Vector[Double]] = Vector(v12)
    val v30: Double = v5(4)
    val v47: Double = f12(v35)
    v12 = v12.updated(6, v21)
    val v28: Double = f12(v30)
    val v42: Vector[Double] = v49(0)
    val v60: Double = f12(v34)
    val v54: Double = f12(v10)
    v1 = v1.updated(4, v47)
    val v63: Double = f12(v4)
    val v67: Double = f12(v11)
    val v186: Vector[Double] = v49(0)
    val v101: Double = v186(3)
    val v50: Double = v42(0)
    var v135: Double = v22
    v12 = v12.updated(0, v28)
    v5 = v5.updated(0, v63)
    val v93: Double = f12(v13)
    val v197: Double = f12(v35)
    val v230: Double = f12(v60)
    v1 = v1.updated(1, v50)
    val v94: Double = f12(v197)
    val v282: Vector[Double] = Vector(v230, v94, v54, v135, v67, v35)
    val v178: Double = v282(3)
    v1 = v1.updated(6, v93)
    v5 = v5.updated(0, v101)
    v178
  }
  def benchmark(): Unit = {
    val v0: Double = 0.0
    val start = nanoTime()
    var result: Double = 0.0
    (1 to 1000).foreach { _ =>
      result = f0(v0)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}