import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Double]
  )
  def f27(v0: s0, v1: Vector[s0], v2: s0, v3: s0): s0 = {
    var v8: Vector[s0] = v1
    v8 = v8.updated(2, v2)
    val v7: s0 = v8(2)
    val v6: Vector[s0] = Vector(v7, v0, v2, v3, v3, v0, v2)
    v8 = v1
    val v9: s0 = v6(2)
    v8 = v8.updated(2, v9)
    var v23: Vector[s0] = v6
    var v20: Vector[s0] = v23
    v23 = v6
    v23 = v23.updated(1, v2)
    var v45: Vector[s0] = v8
    val v50: s0 = v45(1)
    v8 = v45
    val v84: Vector[Vector[s0]] = Vector(v20, v20, v6)
    var v49: Vector[s0] = v6
    var v58: Vector[Vector[s0]] = v84
    val v114: Vector[Vector[Vector[s0]]] = Vector(v58)
    var v95: Vector[Vector[Vector[s0]]] = v114
    val v94: Vector[Vector[s0]] = v95(0)
    var v117: Vector[s0] = v49
    val v113: Vector[s0] = v94(0)
    v58 = v58.updated(0, v117)
    v49 = v49.updated(1, v7)
    val v180: s0 = v113(5)
    v49 = v49.updated(1, v50)
    v180
  }
  def f25(v0: s0): s0 = {
    var v5: s0 = v0
    val v7: Vector[Double] = v5.p1
    val v8: Vector[Double] = v0.p0
    var v2: Vector[Double] = v8
    var v3: Vector[Double] = v2
    var v1: Vector[Double] = v8
    val v9: Vector[Double] = v0.p1
    val v4: Double = v1(0)
    v5 = v0
    v5 = v5.copy(p0 = v8)
    v5 = v5.copy(p0 = v2)
    v1 = v1.updated(0, v4)
    v5 = v5.copy(p1 = v1)
    val v6: Double = v7(0)
    var v12: Vector[Double] = v1
    val v22: Double = v2(0)
    v12 = v12.updated(0, v22)
    val v24: Double = v12(0)
    v12 = v12.updated(0, v22)
    var v13: Double = v24
    var v33: Double = v13
    v5 = v5.copy(p1 = v12)
    v5 = v0
    var v19: Vector[Double] = v3
    val v38: Double = v2(0)
    val v23: Vector[Double] = v0.p0
    var v31: s0 = v5
    v5 = v5.copy(p1 = v12)
    var v27: s0 = v0
    v27 = v27.copy(p0 = v7)
    val v59: Vector[Double] = v0.p1
    val v61: Vector[Double] = v31.p1
    val v20: Double = v23(0)
    val v34: Vector[Double] = v5.p1
    v33 = v13
    v27 = v31
    val v32: Vector[Double] = v0.p1
    val v46: Double = v59(0)
    val v42: Vector[Double] = v0.p0
    v27 = v27.copy(p0 = v42)
    val v41: Double = v61(0)
    val v54: Double = v9(0)
    v2 = v2.updated(0, v46)
    val v57: Double = v12(0)
    val v120: Vector[Double] = v5.p1
    v5 = v5.copy(p1 = v32)
    val v75: Vector[Double] = v31.p0
    v3 = v3.updated(0, v6)
    v5 = v5.copy(p1 = v120)
    v3 = v3.updated(0, v46)
    var v47: Vector[Double] = v2
    v19 = v19.updated(0, v54)
    v5 = v5.copy(p0 = v19)
    v31 = v31.copy(p1 = v34)
    v5 = v5.copy(p1 = v23)
    v12 = v12.updated(0, v57)
    val v79: Vector[Double] = Vector(v20, v41, v33)
    val v103: Vector[Double] = v27.p0
    val v179: Vector[Double] = v27.p0
    v27 = v27.copy(p1 = v47)
    v5 = v5.copy(p0 = v23)
    val v185: Vector[Double] = v31.p0
    v27 = v27.copy(p1 = v103)
    var v141: Vector[Double] = v7
    var v97: s0 = v0
    val v176: Vector[Double] = v97.p0
    v27 = v27.copy(p0 = v120)
    v31 = v31.copy(p1 = v75)
    var v76: Vector[Double] = v79
    v47 = v47.updated(0, v38)
    v31 = v31.copy(p1 = v185)
    val v306: Double = v76(2)
    val v208: Double = v306 * v24
    val v276: Vector[Vector[Double]] = Vector(v179, v9)
    var v160: Vector[Vector[Double]] = v276
    val v214: Vector[Double] = v160(1)
    v27 = v27.copy(p1 = v141)
    v19 = v19.updated(0, v41)
    v97 = v97.copy(p1 = v214)
    v27 = v27.copy(p0 = v176)
    v3 = v3.updated(0, v208)
    v27
  }
  def f7(v0: s0): s0 = {
    val v5: s0 = f25(v0)
    var v4: s0 = v5
    var v3: s0 = v4
    val v7: Vector[Double] = v3.p1
    val v11: s0 = s0(v7, v7)
    v3 = v4
    val v14: s0 = f25(v11)
    v14
  }
  @noinline
  def f0(v0: s0, v1: Vector[s0], v2: Double): Double = {
    val v5: s0 = f27(v0, v1, v0, v0)
    val v3: s0 = f7(v5)
    val v12: Vector[Double] = v3.p0
    val v9: Vector[Double] = v5.p0
    val v18: s0 = s0(v12, v9)
    val v39: Vector[Double] = v18.p1
    val v42: Double = v39(0)
    v42
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(0.0), Vector(1.0))
    val v1: Vector[s0] = Vector(s0(Vector(2.0), Vector(3.0)), s0(Vector(4.0), Vector(5.0)), s0(Vector(6.0), Vector(7.0)))
    val v2: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}