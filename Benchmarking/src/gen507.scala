import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f39(v0: Double): Double = {
    var v3: Double = v0
    var v4: Double = v3
    var v2: Double = v3
    var v1: Double = v0
    var v13: Double = v0
    var v6: Double = v1
    var v10: Double = v3
    var v5: Double = v6
    val v16: Vector[Double] = Vector(v6, v2, v2, v5, v3, v4, v5)
    val v15: Double = v16(5)
    var v12: Vector[Double] = v16
    val v35: Vector[Vector[Double]] = Vector(v12, v16, v16, v12, v16, v12, v12)
    val v19: Vector[Vector[Double]] = Vector(v12, v16, v12, v16, v16, v12, v12)
    v12 = v12.updated(4, v4)
    var v24: Double = v15
    var v14: Vector[Double] = v12
    val v37: Vector[Double] = v19(1)
    v14 = v14.updated(5, v4)
    val v31: Double = v12(4)
    val v23: Vector[Double] = v19(0)
    val v45: Vector[Double] = v19(4)
    var v40: Vector[Vector[Double]] = v35
    v12 = v12.updated(4, v15)
    v40 = v40.updated(2, v45)
    v14 = v14.updated(5, v6)
    val v32: Vector[Vector[Vector[Double]]] = Vector(v40, v35, v19, v40)
    v40 = v40.updated(6, v14)
    var v18: Vector[Vector[Vector[Double]]] = v32
    val v28: Vector[Double] = v19(6)
    v40 = v40.updated(0, v28)
    val v22: Vector[Vector[Double]] = v18(3)
    v13 = v24
    val v62: Vector[Vector[Double]] = v32(2)
    val v52: Double = v4 - v2
    val v27: Vector[Double] = v35(6)
    v18 = v18.updated(3, v19)
    v10 = v3
    var v59: Vector[Double] = v14
    val v51: Vector[Double] = v62(2)
    v14 = v14.updated(3, v10)
    val v85: Double = v16(4)
    v12 = v12.updated(1, v13)
    val v36: Double = v51(6)
    v59 = v59.updated(3, v24)
    val v109: Vector[Double] = v22(5)
    v12 = v51
    val v47: Double = v37(4)
    v40 = v40.updated(0, v28)
    v1 = v85
    v18 = v18.updated(2, v19)
    val v79: Vector[Vector[Double]] = Vector(v27, v23, v59, v109, v12)
    val v170: Vector[Double] = v79(4)
    v5 = v31
    val v179: Double = v170(2)
    v13 = v52
    v12 = v12.updated(6, v47)
    v14 = v14.updated(1, v10)
    val v185: Double = v36 - v179
    v185
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    var v4: Double = v1
    val v7: Vector[Vector[Double]] = v0.p0
    val v8: Vector[Double] = v7(0)
    val v11: Double = f39(v1)
    val v21: Double = f39(v11)
    val v12: Double = v8(0)
    v4 = v12
    var v50: Double = v4
    val v34: Vector[Vector[Double]] = v0.p1
    val v39: Vector[Double] = v34(0)
    var v175: Vector[Double] = v39
    val v124: Double = v175(0)
    var v77: Double = v21
    val v166: Double = f39(v50)
    v77 = v124
    v175 = v175.updated(0, v166)
    v77
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))
    val v1: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}