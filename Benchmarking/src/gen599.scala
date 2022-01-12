import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  def f9(v0: s0): s0 = {
    var v1: s0 = v0
    var v7: s0 = v1
    var v8: s0 = v0
    var v3: s0 = v8
    val v11: Vector[Vector[Double]] = v3.p1
    val v10: Vector[Vector[Double]] = v3.p1
    var v4: s0 = v7
    val v9: Vector[Double] = v10(0)
    val v18: Vector[Double] = v11(2)
    val v16: Vector[Vector[Double]] = v0.p0
    var v35: Vector[Double] = v9
    val v27: Vector[Vector[Double]] = v8.p1
    var v15: Vector[Vector[Double]] = v16
    v15 = v15.updated(0, v35)
    val v13: s0 = s0(v16, v27)
    val v22: Vector[Double] = v15(0)
    var v17: s0 = v4
    v15 = v15.updated(0, v22)
    v15 = v15.updated(0, v18)
    var v19: Vector[Vector[Double]] = v16
    val v28: Double = v9(0)
    val v20: Double = v35(0)
    var v30: Vector[Vector[Double]] = v15
    val v23: Vector[s0] = Vector(v4, v7, v13, v17, v8, v3)
    var v57: Vector[s0] = v23
    val v43: Vector[Vector[Double]] = v13.p1
    var v48: Vector[s0] = v57
    val v21: Vector[Vector[Vector[Double]]] = Vector(v30, v15, v16, v30, v16, v19, v16)
    v57 = v57.updated(3, v1)
    val v79: Vector[Vector[Double]] = v13.p1
    v3 = v3.copy(p0 = v30)
    val v58: Vector[Vector[Double]] = v17.p0
    val v46: s0 = s0(v30, v11)
    v4 = v4.copy(p1 = v10)
    v15 = v19
    val v53: Vector[Vector[Double]] = v1.p0
    v57 = v57.updated(2, v0)
    val v121: Vector[Vector[Vector[Double]]] = Vector(v58)
    v8 = v8.copy(p1 = v79)
    v4 = v4.copy(p0 = v53)
    v1 = v1.copy(p1 = v43)
    var v76: Vector[Vector[Double]] = v27
    val v44: Vector[Vector[Double]] = v4.p1
    val v71: Vector[Double] = v76(2)
    val v78: Vector[Vector[Double]] = v121(0)
    val v113: s0 = v57(2)
    v30 = v30.updated(0, v71)
    var v64: Double = v28
    v17 = v17.copy(p0 = v78)
    v3 = v3.copy(p0 = v53)
    val v110: Double = v64 / v20
    val v66: s0 = v48(1)
    v7 = v7.copy(p1 = v79)
    var v62: Double = v110
    v35 = v35.updated(0, v62)
    val v215: Vector[Vector[Double]] = v3.p0
    val v90: Vector[Vector[Double]] = v66.p0
    v3 = v3.copy(p0 = v15)
    v17 = v46
    val v183: Vector[Vector[Double]] = v113.p1
    var v219: s0 = v8
    v4 = v4.copy(p0 = v215)
    val v204: Vector[Vector[Double]] = v21(0)
    v4 = v4.copy(p0 = v15)
    val v173: Vector[Vector[Double]] = v219.p1
    v219 = v219.copy(p0 = v204)
    v3 = v3.copy(p1 = v183)
    val v178: s0 = s0(v90, v44)
    v3 = v3.copy(p1 = v173)
    v8 = v8.copy(p1 = v11)
    v3 = v3.copy(p1 = v11)
    v178
  }
  @noinline
  def f0(v0: Vector[s2], v1: Vector[s2], v2: Double): Double = {
    var v7: Double = v2
    val v12: Double = v7 * v7
    val v3: s2 = v1(0)
    val v16: Vector[s0] = v3.p1
    var v8: Double = v12
    val v20: s0 = v16(0)
    val v93: s0 = f9(v20)
    val v99: Vector[Vector[Double]] = v93.p0
    val v70: Vector[Double] = v99(0)
    var v85: Vector[Double] = v70
    var v89: Double = v8
    val v81: Double = v85(0)
    val v88: Double = v89 + v2
    var v91: Double = v2
    val v378: Double = v88 - v12
    val v152: Vector[Double] = Vector(v91, v378, v12, v378, v81, v81, v12)
    var v301: Vector[Double] = v152
    val v150: Double = v301(6)
    v150
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))), s2(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), s2(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))
    val v1: Vector[s2] = Vector(s2(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))))))
    val v2: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}