import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Double]
  )
  def f55(v0: Vector[Double]): Vector[Double] = {
    var v3: Vector[Double] = v0
    val v1: Double = v0(0)
    var v6: Double = v1
    val v4: Double = v0(1)
    val v2: Double = v3(0)
    v3 = v3.updated(0, v1)
    val v10: Double = v0(0)
    v3 = v3.updated(0, v6)
    var v5: Double = v2
    var v9: Double = v2
    var v8: Vector[Double] = v0
    v3 = v3.updated(0, v1)
    v8 = v8.updated(1, v1)
    v8 = v8.updated(0, v4)
    val v13: Double = v3(0)
    var v21: Vector[Double] = v0
    v21 = v21.updated(0, v4)
    v3 = v3.updated(0, v4)
    val v45: Double = v8(1)
    var v12: Vector[Double] = v3
    val v25: Double = v3(0)
    val v34: Double = v8(1)
    var v23: Double = v25
    v3 = v3.updated(1, v25)
    v8 = v8.updated(1, v34)
    val v29: Double = v0(0)
    v8 = v8.updated(1, v1)
    v8 = v8.updated(1, v25)
    v8 = v8.updated(0, v45)
    v21 = v21.updated(1, v9)
    var v43: Double = v1
    val v24: Double = v0(1)
    var v50: Double = v1
    val v16: Double = v3(1)
    val v18: Double = v12(1)
    var v19: Vector[Double] = v8
    val v66: Vector[Vector[Double]] = Vector(v3, v19, v12, v3)
    var v33: Double = v13
    val v55: Vector[Double] = v66(2)
    var v83: Vector[Vector[Double]] = v66
    val v57: Double = v43 + v9
    val v82: Double = v21(0)
    val v72: Vector[Vector[Double]] = Vector(v12, v8, v12, v55)
    val v31: Vector[Double] = v83(0)
    v43 = v16
    var v74: Vector[Vector[Double]] = v83
    v12 = v12.updated(0, v82)
    val v56: Vector[Double] = v74(3)
    val v54: Vector[Double] = v66(1)
    var v42: Vector[Double] = v56
    v8 = v8.updated(1, v10)
    v3 = v3.updated(1, v50)
    val v60: Vector[Double] = v72(0)
    var v91: Vector[Double] = v42
    v12 = v91
    var v38: Vector[Double] = v60
    var v63: Double = v5
    v91 = v91.updated(1, v63)
    v74 = v74.updated(2, v19)
    val v51: Double = v31(0)
    val v69: Double = v31(1)
    var v76: Double = v51
    v12 = v12.updated(0, v33)
    v8 = v8.updated(0, v24)
    val v90: Double = v21(1)
    var v152: Vector[Double] = v38
    val v180: Vector[Double] = v66(3)
    v3 = v3.updated(0, v76)
    val v103: Vector[Double] = Vector(v18, v57, v45, v24, v6, v69, v63)
    val v73: Double = v103(3)
    v74 = v74.updated(1, v180)
    v8 = v8.updated(1, v90)
    v8 = v8.updated(1, v69)
    v152 = v152.updated(0, v9)
    v38 = v38.updated(1, v1)
    v74 = v74.updated(0, v54)
    v21 = v21.updated(0, v29)
    var v151: Vector[Double] = v152
    v151 = v151.updated(0, v82)
    v19 = v19.updated(1, v73)
    v38 = v38.updated(1, v23)
    v151
  }
  def f53(v0: Double): Double = {
    var v7: Double = v0
    var v5: Double = v0
    var v2: Double = v5
    val v6: Vector[Double] = Vector(v0, v0)
    var v8: Vector[Double] = v6
    val v10: Double = v6(1)
    val v9: Vector[Double] = f55(v8)
    val v13: Double = v9(1)
    val v11: Double = v6(1)
    v8 = v8.updated(0, v2)
    v8 = v8.updated(1, v0)
    val v21: Vector[Double] = Vector(v13, v13, v11, v0, v13, v10, v10)
    var v27: Vector[Double] = v21
    v27 = v27.updated(6, v11)
    var v15: Vector[Double] = v21
    v2 = v7
    var v25: Vector[Double] = v15
    v27 = v25
    v7 = v11
    val v68: Double = v27(3)
    v68
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v6: Double = f53(v1)
    val v3: Vector[Double] = v0.p4
    val v11: Double = v3(1)
    var v4: Double = v11
    v4 = v11
    val v15: Double = v4 / v6
    var v49: Double = v15
    v49
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0)), Vector(5.0, 6.0))
    val v1: Double = 7.0
    val start = nanoTime()
    var result: Double = 7.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}