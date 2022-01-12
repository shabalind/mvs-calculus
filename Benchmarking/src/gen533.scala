import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  def f85(v0: s0, v1: Vector[Double]): s0 = {
    val v17: s1 = s1(v0, v0)
    var v33: s0 = v0
    var v32: s1 = v17
    v32 = v32.copy(p1 = v33)
    val v18: s0 = v32.p0
    v18
  }
  def f83(v0: s1, v1: s0): s1 = {
    val v3: Vector[s1] = Vector(v0, v0, v0, v0, v0, v0)
    val v7: s1 = v3(0)
    val v4: s0 = v7.p1
    val v5: s1 = v3(4)
    val v8: s0 = v5.p1
    val v10: Vector[Vector[Double]] = v4.p0
    var v2: Vector[s1] = v3
    var v15: Vector[s1] = v2
    val v9: Vector[Double] = v10(1)
    v2 = v15
    val v12: s0 = f85(v1, v9)
    v2 = v2.updated(3, v5)
    val v24: s1 = v15(0)
    val v22: s0 = f85(v12, v9)
    val v23: s1 = v15(0)
    v2 = v2.updated(4, v24)
    val v45: Vector[Vector[Double]] = v1.p1
    var v33: s1 = v23
    v33 = v33.copy(p0 = v1)
    v2 = v2.updated(0, v24)
    v15 = v15.updated(1, v5)
    v33 = v33.copy(p0 = v12)
    val v29: Vector[Vector[Double]] = v1.p0
    val v48: Vector[Double] = v29(1)
    val v50: s1 = v3(2)
    val v70: s0 = f85(v22, v48)
    val v63: Vector[Double] = v45(0)
    var v43: s0 = v8
    val v44: s0 = f85(v70, v63)
    val v140: Vector[Vector[Double]] = v44.p0
    var v80: s1 = v24
    v2 = v3
    v80 = v80.copy(p0 = v70)
    v15 = v15.updated(2, v23)
    v15 = v15.updated(5, v50)
    val v111: Vector[Vector[Double]] = v44.p1
    v15 = v15.updated(4, v33)
    v43 = v43.copy(p1 = v111)
    v80 = v80.copy(p1 = v43)
    v43 = v43.copy(p0 = v140)
    v80
  }
  def f82(v0: s1): s1 = {
    val v2: Vector[s1] = Vector(v0, v0, v0, v0, v0)
    val v8: s0 = v0.p1
    val v6: s1 = f83(v0, v8)
    var v5: s0 = v8
    val v7: Vector[Vector[Double]] = v8.p1
    var v4: Vector[s1] = v2
    v4 = v4.updated(3, v6)
    v4 = v4.updated(2, v0)
    val v3: Vector[Vector[Double]] = v8.p0
    val v10: s1 = f83(v0, v5)
    var v1: s1 = v6
    v5 = v5.copy(p1 = v7)
    val v13: s1 = v4(3)
    val v12: Vector[Double] = v7(0)
    v4 = v4.updated(3, v10)
    var v15: Vector[Vector[Double]] = v3
    v15 = v15.updated(0, v12)
    v15 = v15.updated(0, v12)
    val v27: s0 = f85(v5, v12)
    val v37: Vector[Double] = v15(0)
    val v35: s0 = f85(v8, v12)
    v5 = v5.copy(p0 = v15)
    val v29: s0 = f85(v5, v37)
    v1 = v1.copy(p1 = v27)
    val v23: Vector[Double] = v7(0)
    v1 = v1.copy(p1 = v8)
    val v47: Vector[Vector[Double]] = v35.p0
    v4 = v4.updated(4, v1)
    v5 = v5.copy(p0 = v47)
    v1 = v1.copy(p1 = v5)
    val v57: s0 = v13.p1
    val v48: s1 = s1(v29, v57)
    v5 = v5.copy(p1 = v15)
    v1 = v1.copy(p1 = v57)
    v15 = v15.updated(1, v23)
    v5 = v5.copy(p0 = v15)
    v1 = v1.copy(p1 = v5)
    v48
  }
  def f79(v0: s0, v1: s0): s0 = {
    var v7: s0 = v1
    val v3: s1 = s1(v1, v0)
    val v5: s1 = f82(v3)
    var v11: s1 = v5
    var v6: s1 = v11
    val v9: s1 = f83(v11, v1)
    val v4: s1 = f82(v6)
    val v13: s0 = v4.p0
    val v14: s0 = v9.p1
    val v19: s0 = v3.p0
    v6 = v6.copy(p0 = v7)
    val v30: Vector[Vector[Double]] = v14.p0
    val v26: Vector[Double] = v30(0)
    var v20: Vector[Double] = v26
    var v25: s1 = v5
    val v24: s0 = f85(v1, v20)
    val v33: s1 = f83(v9, v24)
    val v34: Vector[s1] = Vector(v9, v4, v5, v25, v33)
    val v63: Vector[Vector[Double]] = v13.p0
    v7 = v7.copy(p1 = v63)
    val v27: s1 = v34(4)
    val v46: s0 = v4.p0
    val v49: s0 = v33.p0
    v6 = v6.copy(p1 = v19)
    val v125: s0 = v5.p1
    val v55: Vector[Vector[Double]] = v46.p0
    val v65: s0 = v27.p0
    v6 = v6.copy(p1 = v125)
    v7 = v7.copy(p0 = v55)
    v25 = v25.copy(p0 = v49)
    v65
  }
  def f72(v0: s0): s0 = {
    var v4: s0 = v0
    var v5: s0 = v4
    val v6: Vector[Vector[Double]] = v5.p1
    val v7: Vector[Vector[Double]] = v0.p0
    v4 = v4.copy(p1 = v7)
    val v13: Vector[s0] = Vector(v5, v0, v5, v5, v5, v5)
    v4 = v4.copy(p1 = v6)
    val v17: s0 = v13(3)
    val v35: Vector[Vector[Double]] = v17.p0
    val v45: s0 = f79(v5, v17)
    v5 = v5.copy(p1 = v35)
    v45
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: s0, v2: Double): Double = {
    val v4: s0 = f72(v1)
    val v6: Vector[Vector[Double]] = v4.p0
    val v3: Vector[Double] = v6(1)
    val v15: Vector[Double] = v6(0)
    val v24: Double = v3(0)
    val v87: Double = v15(0)
    val v65: Double = v87 + v24
    v65
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))))), Vector(s1(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))))))
    val v1: s0 = s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))
    val v2: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}