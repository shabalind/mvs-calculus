import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f22(v0: Double): Double = {
    var v5: Double = v0
    var v2: Double = v0
    var v7: Double = v5
    v2 = v7
    var v4: Double = v7
    var v8: Double = v4
    var v6: Double = v2
    var v1: Double = v0
    var v11: Double = v0
    var v17: Double = v8
    val v10: Vector[Double] = Vector(v8, v6)
    var v16: Vector[Double] = v10
    v16 = v16.updated(1, v17)
    val v38: Double = v8 / v11
    var v9: Vector[Double] = v16
    var v30: Double = v8
    v16 = v10
    var v23: Vector[Double] = v10
    var v15: Double = v1
    var v22: Double = v2
    val v51: Double = v10(0)
    v16 = v16.updated(1, v51)
    val v20: Double = v51 / v22
    var v42: Vector[Double] = v10
    v16 = v16.updated(0, v15)
    val v61: Double = v10(1)
    val v21: Double = v16(0)
    val v19: Double = v10(0)
    val v29: Vector[Double] = Vector(v21, v7, v51, v5)
    v16 = v16.updated(1, v19)
    var v33: Vector[Double] = v9
    v33 = v9
    val v85: Vector[Vector[Double]] = Vector(v29, v29, v29, v29, v29)
    val v27: Double = v10(0)
    v42 = v42.updated(0, v30)
    var v55: Vector[Double] = v29
    val v37: Double = v5 * v0
    val v35: Double = v55(2)
    val v80: Double = v33(1)
    val v36: Double = v23(0)
    val v59: Vector[Double] = v85(2)
    val v122: Double = v59(3)
    val v57: Vector[Double] = Vector(v6, v1, v35)
    v16 = v42
    var v93: Vector[Double] = v57
    val v165: Double = v57(1)
    val v104: Double = v93(1)
    val v44: Double = v33(0)
    v23 = v23.updated(0, v27)
    v93 = v57
    val v107: Vector[Double] = Vector(v38, v15, v36, v37, v80, v104, v61)
    var v202: Vector[Double] = v107
    val v65: Double = v202(2)
    var v128: Double = v44
    v33 = v33.updated(1, v165)
    v9 = v9.updated(0, v21)
    v55 = v55.updated(3, v20)
    v202 = v202.updated(3, v122)
    v23 = v23.updated(1, v128)
    v65
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v7: Vector[Vector[Double]] = v0.p1
    val v11: Vector[Vector[Double]] = v0.p0
    val v3: Vector[Double] = v7(2)
    val v8: Vector[Double] = v11(1)
    val v13: Double = f22(v1)
    var v27: Double = v13
    var v19: Vector[Vector[Double]] = v11
    v19 = v19.updated(0, v8)
    val v23: Vector[Double] = v19(0)
    v19 = v19.updated(1, v3)
    val v31: Double = v23(0)
    val v251: Double = f22(v27)
    val v74: Double = v31 * v251
    v74
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))
    val v1: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}