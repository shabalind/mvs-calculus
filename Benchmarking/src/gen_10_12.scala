import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f21(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v1: Vector[Vector[Double]] = v0
    var v13: Vector[Vector[Double]] = v1
    v13
  }
  def f12(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v7: Vector[Vector[Double]] = v2
    val v3: Vector[Vector[Double]] = f21(v0)
    var v9: Vector[Vector[Double]] = v2
    val v8: Vector[Double] = v2(2)
    v9 = v9.updated(0, v8)
    val v6: Double = v8(0)
    v9 = v9.updated(0, v8)
    val v4: Vector[Double] = v3(2)
    val v28: Vector[Double] = v0(0)
    v9 = v9.updated(0, v8)
    val v12: Double = v8(0)
    val v16: Vector[Vector[Double]] = f21(v7)
    val v18: Vector[Double] = v16(0)
    v7 = v7.updated(1, v28)
    v9 = v9.updated(0, v18)
    v9 = v9.updated(1, v4)
    v7 = v7.updated(1, v18)
    var v36: Vector[Vector[Double]] = v9
    val v30: Vector[Double] = v0(0)
    val v15: Vector[Vector[Double]] = f21(v36)
    val v23: Vector[Vector[Double]] = f21(v2)
    val v34: Vector[Double] = v16(1)
    v36 = v36.updated(1, v34)
    val v78: Vector[Double] = v23(1)
    var v54: Vector[Double] = v34
    val v87: Vector[Double] = v3(0)
    val v67: Vector[Double] = v0(1)
    v7 = v7.updated(1, v67)
    v9 = v9.updated(0, v54)
    v54 = v54.updated(0, v12)
    v36 = v36.updated(1, v78)
    v9 = v9.updated(1, v30)
    var v91: Vector[Double] = v87
    v54 = v54.updated(0, v6)
    v54 = v91
    v15
  }
  def f4(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v3: Vector[Vector[Double]] = v0
    val v1: Vector[Double] = v0(0)
    val v5: Vector[Double] = v0(1)
    val v7: Vector[Vector[Double]] = f12(v3, v0, v3)
    v3 = v3.updated(2, v1)
    val v13: Vector[Vector[Double]] = f12(v3, v0, v7)
    var v4: Vector[Vector[Double]] = v0
    val v8: Vector[Vector[Double]] = f12(v13, v0, v0)
    val v2: Vector[Vector[Double]] = f12(v0, v8, v13)
    var v9: Vector[Vector[Double]] = v4
    val v21: Vector[Double] = v13(1)
    v3 = v3.updated(2, v21)
    v9 = v9.updated(2, v21)
    val v15: Vector[Vector[Double]] = f21(v4)
    v9 = v9.updated(1, v21)
    val v20: Vector[Vector[Double]] = f21(v8)
    val v33: Double = v1(0)
    var v28: Vector[Vector[Double]] = v15
    val v35: Vector[Vector[Double]] = f21(v15)
    var v12: Vector[Vector[Double]] = v28
    val v37: Vector[Vector[Double]] = f12(v9, v0, v7)
    v3 = v3.updated(0, v5)
    var v25: Vector[Vector[Double]] = v9
    v28 = v8
    val v43: Vector[Vector[Double]] = f21(v9)
    val v32: Vector[Vector[Double]] = f21(v25)
    val v22: Vector[Vector[Double]] = f12(v43, v37, v20)
    v12 = v12.updated(0, v1)
    val v52: Vector[Vector[Double]] = f12(v12, v22, v25)
    var v62: Vector[Vector[Double]] = v32
    val v60: Vector[Double] = v43(0)
    val v44: Vector[Vector[Double]] = f21(v62)
    val v55: Vector[Double] = v43(2)
    v3 = v52
    v28 = v28.updated(1, v60)
    var v66: Double = v33
    val v51: Vector[Double] = v35(2)
    v28 = v28.updated(0, v5)
    var v48: Vector[Double] = v51
    val v149: Vector[Vector[Double]] = f21(v2)
    val v112: Vector[Vector[Double]] = f21(v12)
    v28 = v62
    var v73: Double = v66
    var v63: Vector[Vector[Double]] = v62
    var v89: Vector[Vector[Double]] = v44
    v63 = v63.updated(1, v21)
    val v76: Vector[Double] = v149(2)
    v3 = v3.updated(1, v55)
    v28 = v28.updated(2, v76)
    val v95: Vector[Double] = v35(2)
    var v103: Vector[Double] = v48
    val v97: Vector[Double] = v62(0)
    v25 = v25.updated(1, v103)
    val v143: Double = v95(0)
    val v69: Vector[Vector[Double]] = f21(v112)
    val v91: Vector[Vector[Double]] = f12(v63, v89, v69)
    v48 = v48.updated(0, v143)
    v48 = v48.updated(0, v73)
    val v158: Vector[Vector[Double]] = f12(v15, v69, v91)
    v63 = v63.updated(1, v97)
    val v201: Vector[Vector[Double]] = f12(v158, v7, v63)
    v201
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Double): Double = {
    val v9: Vector[Double] = v1(1)
    val v7: Double = v9(0)
    var v10: Double = v7
    val v12: Vector[Vector[Double]] = f21(v1)
    val v85: Vector[Double] = v0(0)
    val v98: Vector[Vector[Double]] = f4(v12)
    val v30: Vector[Double] = v98(0)
    val v44: Double = v85(0)
    val v50: Double = v30(0)
    val v47: Double = v44 + v50
    val v53: Double = v10 + v47
    v53
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(2.0), Vector(3.0), Vector(4.0))
    val v2: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}