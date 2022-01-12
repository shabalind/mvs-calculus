import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f81(v0: s0, v1: s0): s0 = {
    v0
  }
  def f74(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p1
    var v2: Vector[Vector[Double]] = v4
    val v1: Vector[Vector[Double]] = v0.p1
    val v3: s0 = f81(v0, v0)
    val v6: s0 = f81(v3, v0)
    var v5: Vector[Vector[Double]] = v2
    var v11: s0 = v3
    v11 = v11.copy(p0 = v5)
    val v8: Vector[Double] = v4(2)
    v11 = v11.copy(p1 = v5)
    v11 = v11.copy(p0 = v5)
    val v15: Vector[Double] = v1(2)
    val v18: Vector[Vector[Double]] = v3.p1
    val v19: Vector[Double] = v5(2)
    val v9: s0 = f81(v6, v6)
    v5 = v5.updated(1, v15)
    val v21: Vector[Vector[Double]] = v6.p0
    v11 = v11.copy(p1 = v5)
    v2 = v2.updated(2, v8)
    var v14: s0 = v6
    v2 = v2.updated(1, v19)
    val v22: s0 = f81(v14, v0)
    v11 = v11.copy(p1 = v5)
    val v17: Vector[Double] = v18(0)
    var v29: s0 = v22
    v29 = v29.copy(p0 = v5)
    v11 = v11.copy(p0 = v21)
    v5 = v5.updated(2, v17)
    val v26: s0 = f81(v0, v9)
    val v33: s0 = f81(v9, v0)
    val v103: Vector[Vector[Double]] = v26.p0
    val v78: s0 = f81(v22, v11)
    v29 = v29.copy(p1 = v1)
    v14 = v33
    val v60: s0 = f81(v78, v26)
    var v66: s0 = v22
    val v48: Vector[Vector[Double]] = v29.p0
    v29 = v29.copy(p0 = v1)
    val v129: Vector[Vector[Double]] = v60.p1
    var v67: s0 = v66
    var v79: Vector[Double] = v8
    var v95: s0 = v60
    v11 = v11.copy(p0 = v48)
    v66 = v66.copy(p1 = v103)
    val v57: s0 = f81(v0, v6)
    var v153: s0 = v6
    v67 = v67.copy(p0 = v48)
    val v115: s0 = f81(v153, v95)
    var v137: Vector[Vector[Double]] = v129
    v66 = v66.copy(p1 = v18)
    val v91: Vector[Vector[Double]] = v57.p1
    v67 = v67.copy(p1 = v21)
    v95 = v95.copy(p0 = v91)
    val v121: s0 = f81(v67, v6)
    val v139: s0 = f81(v121, v115)
    v137 = v137.updated(1, v79)
    v66 = v66.copy(p0 = v137)
    v139
  }
  def f67(v0: s0): s0 = {
    var v3: s0 = v0
    val v6: Vector[s0] = Vector(v3)
    var v1: s0 = v0
    val v4: s0 = f74(v1)
    val v12: Vector[Vector[Double]] = v4.p0
    v3 = v3.copy(p0 = v12)
    var v5: Vector[Vector[Double]] = v12
    val v11: Vector[Double] = v5(1)
    var v10: s0 = v3
    v3 = v3.copy(p0 = v5)
    val v24: Vector[Vector[Double]] = v10.p0
    val v19: s0 = v6(0)
    v5 = v5.updated(1, v11)
    v3 = v3.copy(p0 = v24)
    v19
  }
  def f56(v0: s0): s0 = {
    val v4: s0 = f67(v0)
    val v11: s0 = f67(v0)
    val v26: s0 = f74(v4)
    val v25: s0 = f74(v11)
    val v20: s0 = f74(v11)
    val v114: s0 = f74(v4)
    val v79: s0 = f81(v25, v26)
    val v140: Vector[Vector[Double]] = v114.p1
    val v93: s0 = f81(v79, v20)
    val v249: Vector[Vector[Double]] = v93.p0
    val v175: s0 = s0(v140, v249)
    v175
  }
  def f50(v0: s0): s0 = {
    var v4: s0 = v0
    val v3: s0 = f74(v0)
    val v2: Vector[Vector[Double]] = v3.p0
    val v7: s0 = f56(v4)
    val v8: s0 = f56(v0)
    val v15: s0 = f81(v0, v8)
    val v10: Vector[s0] = Vector(v3, v7)
    val v20: Vector[s0] = Vector(v15, v4)
    val v19: s0 = v20(0)
    v4 = v4.copy(p0 = v2)
    val v50: s0 = v10(1)
    val v64: s0 = f67(v50)
    val v58: s0 = f81(v19, v64)
    v58
  }
  def f45(v0: s0): s0 = {
    val v8: s0 = f67(v0)
    val v19: s0 = f50(v0)
    val v15: s0 = f50(v19)
    val v25: Vector[s0] = Vector(v19, v19, v15, v0, v8, v19)
    var v30: Vector[s0] = v25
    val v104: s0 = v30(5)
    v104
  }
  def f9(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p1
    val v3: s0 = f81(v0, v0)
    var v2: s0 = v3
    val v4: Vector[Vector[Double]] = v2.p1
    val v11: Vector[Vector[Double]] = v2.p1
    val v10: Vector[Double] = v4(2)
    var v17: Vector[Vector[Double]] = v4
    val v21: Vector[Vector[Double]] = v3.p1
    v2 = v2.copy(p0 = v6)
    v17 = v17.updated(0, v10)
    v2 = v2.copy(p0 = v4)
    var v18: s0 = v3
    v18 = v18.copy(p0 = v11)
    val v20: Vector[Double] = v11(1)
    v2 = v2.copy(p0 = v17)
    v17 = v17.updated(1, v10)
    v17 = v17.updated(1, v20)
    var v31: s0 = v18
    v31 = v31.copy(p0 = v21)
    v31
  }
  @noinline
  def f0(v0: s0, v1: Vector[s1], v2: Double): Double = {
    val v5: s0 = f9(v0)
    val v8: s0 = f45(v0)
    var v3: Double = v2
    val v17: Vector[Vector[Double]] = v8.p1
    val v15: Vector[Double] = v17(2)
    val v9: Vector[Vector[Double]] = v5.p0
    var v13: Vector[Double] = v15
    val v20: Vector[Double] = v9(1)
    val v21: Vector[Vector[Double]] = v8.p0
    val v14: Vector[Double] = v21(2)
    val v26: Double = v13(0)
    v13 = v13.updated(0, v3)
    val v32: Double = v20(0)
    v13 = v13.updated(0, v32)
    val v23: Double = v14(0)
    val v112: Double = v26 / v23
    v13 = v13.updated(0, v112)
    v112
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))
    val v1: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s1(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))))))
    val v2: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}