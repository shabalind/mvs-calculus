import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: s0,
    p3: s0,
    p4: s0,
    p5: s0
  )
  def f20(v0: s1): s1 = {
    val v5: s0 = v0.p0
    var v3: s0 = v5
    val v2: Vector[Vector[Double]] = v5.p0
    val v15: s0 = v0.p0
    v3 = v3.copy(p0 = v2)
    val v6: Vector[s1] = Vector(v0, v0, v0, v0, v0, v0)
    val v9: Vector[Vector[Double]] = v3.p0
    v3 = v3.copy(p0 = v2)
    val v13: s1 = v6(5)
    val v34: Vector[Vector[Double]] = v15.p0
    v3 = v3.copy(p0 = v34)
    val v22: s1 = v6(0)
    val v38: Vector[Vector[Double]] = v3.p0
    v3 = v3.copy(p0 = v38)
    val v29: s0 = v13.p5
    var v42: Vector[Vector[Double]] = v38
    v3 = v3.copy(p0 = v9)
    var v43: s0 = v29
    var v63: s1 = v22
    var v82: s1 = v63
    v43 = v43.copy(p0 = v42)
    v63 = v63.copy(p3 = v43)
    v82
  }
  def f14(v0: Vector[Double]): Vector[Double] = {
    val v2: Double = v0(0)
    var v7: Double = v2
    var v4: Vector[Double] = v0
    val v6: Double = v4(0)
    v4 = v4.updated(0, v6)
    var v1: Vector[Double] = v0
    v4 = v4.updated(0, v7)
    val v15: Double = v4(0)
    v1 = v1.updated(0, v7)
    val v3: Vector[Vector[Double]] = Vector(v0, v1)
    val v20: Vector[Double] = v3(0)
    val v13: Double = v20(0)
    v4 = v4.updated(0, v15)
    var v11: Vector[Double] = v4
    val v9: Vector[Vector[Double]] = Vector(v0, v4, v0)
    v4 = v1
    var v17: Double = v13
    v4 = v4.updated(0, v2)
    var v14: Vector[Vector[Double]] = v9
    val v25: Vector[Double] = v14(1)
    var v19: Vector[Vector[Double]] = v9
    v19 = v19.updated(0, v11)
    val v26: Vector[Double] = v19(0)
    var v43: Vector[Double] = v25
    v43 = v43.updated(0, v17)
    v14 = v14.updated(0, v4)
    v14 = v19
    v19 = v19.updated(2, v26)
    v43
  }
  def f13(v0: s0, v1: s1, v2: s1): s0 = {
    val v3: s0 = v1.p5
    val v4: Vector[Vector[Double]] = v0.p0
    val v6: Vector[Double] = v4(0)
    val v7: Vector[Double] = v4(0)
    var v9: s0 = v3
    val v5: Vector[Double] = v4(1)
    val v14: s0 = v1.p5
    v9 = v9.copy(p0 = v4)
    val v13: s0 = v1.p5
    val v35: Vector[Vector[Double]] = v3.p0
    var v11: Vector[Vector[Double]] = v35
    val v10: Vector[Double] = v4(1)
    val v12: s0 = s0(v35)
    val v15: s1 = f20(v1)
    v9 = v9.copy(p0 = v35)
    v9 = v13
    v11 = v11.updated(0, v5)
    val v32: Vector[Vector[Double]] = v3.p0
    val v39: Vector[Double] = v11(1)
    v11 = v11.updated(0, v7)
    v9 = v9.copy(p0 = v32)
    v9 = v9.copy(p0 = v35)
    v9 = v9.copy(p0 = v35)
    var v23: s1 = v2
    val v26: Double = v39(0)
    val v54: Vector[Vector[Double]] = v9.p0
    v23 = v23.copy(p5 = v9)
    v23 = v23.copy(p0 = v12)
    v11 = v11.updated(1, v7)
    val v33: Vector[Vector[Double]] = v3.p0
    val v34: Vector[Double] = f14(v10)
    v9 = v9.copy(p0 = v33)
    v11 = v11.updated(0, v34)
    val v56: Vector[Vector[Double]] = v3.p0
    v11 = v11.updated(1, v39)
    v9 = v9.copy(p0 = v54)
    v23 = v23.copy(p3 = v3)
    var v49: Vector[Double] = v34
    val v21: Vector[Double] = v56(0)
    val v50: s0 = v2.p4
    v23 = v23.copy(p2 = v0)
    v9 = v9.copy(p0 = v33)
    v23 = v23.copy(p2 = v3)
    val v46: Double = v10(0)
    var v37: Vector[Vector[Double]] = v35
    var v101: Vector[Double] = v6
    v37 = v37.updated(0, v49)
    v37 = v37.updated(1, v101)
    v23 = v23.copy(p2 = v50)
    v37 = v37.updated(0, v6)
    v37 = v37.updated(0, v49)
    v9 = v9.copy(p0 = v37)
    v9 = v9.copy(p0 = v35)
    var v62: s1 = v15
    var v63: Vector[Double] = v21
    var v85: Double = v46
    v37 = v37.updated(1, v63)
    val v243: s1 = f20(v23)
    val v113: s0 = v62.p4
    v23 = v23.copy(p5 = v14)
    val v171: s0 = v243.p0
    val v91: Double = v5(0)
    v62 = v62.copy(p5 = v9)
    v23 = v23.copy(p1 = v113)
    v101 = v101.updated(0, v85)
    v101 = v101.updated(0, v91)
    var v187: s0 = v171
    v63 = v63.updated(0, v26)
    v187
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v6: Vector[s1] = v0(0)
    val v2: Vector[s1] = v0(0)
    val v3: s1 = v6(0)
    val v9: s1 = v2(0)
    val v10: s1 = v6(0)
    val v4: s0 = v10.p5
    var v11: s1 = v9
    var v19: s1 = v9
    v19 = v19.copy(p2 = v4)
    val v13: s0 = f13(v4, v11, v3)
    val v30: s0 = f13(v13, v19, v10)
    val v31: s0 = v11.p1
    val v28: s1 = v6(0)
    v19 = v19.copy(p4 = v31)
    val v41: Vector[Vector[Double]] = v30.p0
    val v50: s0 = v28.p1
    val v42: Double = v1 + v1
    val v79: Vector[Double] = Vector(v1, v1, v1, v42)
    val v43: Double = v79(0)
    v19 = v19.copy(p4 = v13)
    val v60: Vector[Double] = v41(1)
    val v93: Double = v60(0)
    v19 = v19.copy(p2 = v50)
    val v142: Double = v93 * v43
    v142
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0))), s0(Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0))))), Vector(s1(s0(Vector(Vector(12.0), Vector(13.0))), s0(Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0))), s0(Vector(Vector(22.0), Vector(23.0))))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}