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
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s0],
    p2: s0
  )
  case class s4 (
    p0: s2,
    p1: Vector[Double]
  )
  case class s5 (
    p0: s4,
    p1: s2
  )
  case class s7 (
    p0: Vector[s2],
    p1: s5
  )
  def f46(v0: s1, v1: s4): s4 = {
    var v12: s4 = v1
    val v31: s2 = v12.p0
    v12 = v12.copy(p0 = v31)
    v12
  }
  def f41(v0: Vector[s2]): Vector[s2] = {
    val v5: s2 = v0(2)
    var v3: Vector[s2] = v0
    val v6: s2 = v3(0)
    v3 = v3.updated(2, v6)
    var v8: Vector[s2] = v3
    v3 = v3.updated(0, v5)
    v8 = v8.updated(2, v6)
    v8
  }
  def f39(v0: s2): s2 = {
    var v4: s2 = v0
    var v1: s2 = v4
    val v3: Vector[s2] = Vector(v1)
    val v5: s2 = v3(0)
    var v7: Vector[s2] = v3
    val v2: s2 = v7(0)
    val v6: s2 = v7(0)
    val v9: Vector[s0] = v6.p0
    v7 = v7.updated(0, v1)
    val v13: Vector[s0] = v4.p1
    val v10: s0 = v4.p2
    v1 = v0
    var v8: Vector[s0] = v13
    val v15: Vector[s0] = v5.p1
    val v14: s0 = v9(0)
    val v20: Vector[s2] = Vector(v5, v0, v1, v1, v1)
    v8 = v8.updated(0, v14)
    var v18: Vector[s0] = v9
    v4 = v0
    val v11: Vector[s2] = Vector(v1, v1, v4)
    v7 = v7.updated(0, v0)
    v7 = v7.updated(0, v0)
    v7 = v7.updated(0, v0)
    var v19: s2 = v2
    var v37: Vector[s0] = v18
    v18 = v18.updated(0, v10)
    val v57: s0 = v0.p2
    v7 = v7.updated(0, v19)
    val v39: Vector[s2] = f41(v11)
    var v49: Vector[s2] = v39
    val v35: Vector[s0] = v1.p0
    v19 = v19.copy(p0 = v9)
    v4 = v4.copy(p0 = v35)
    val v53: Vector[s2] = f41(v11)
    val v81: s0 = v13(1)
    v8 = v8.updated(0, v57)
    val v51: Vector[s0] = v6.p0
    val v65: s2 = v53(1)
    val v143: s2 = v49(1)
    v37 = v37.updated(0, v81)
    v7 = v7.updated(0, v143)
    val v76: Vector[Vector[s2]] = Vector(v20, v20, v20, v20)
    v1 = v1.copy(p0 = v51)
    val v149: Vector[s2] = v76(2)
    v19 = v19.copy(p0 = v35)
    val v136: s2 = v149(2)
    var v87: Vector[s0] = v15
    v19 = v19.copy(p1 = v87)
    v4 = v4.copy(p1 = v8)
    v49 = v49.updated(0, v65)
    v4 = v4.copy(p0 = v37)
    v19 = v19.copy(p2 = v57)
    v19 = v19.copy(p1 = v13)
    v136
  }
  def f33(v0: s0, v1: s2): s2 = {
    var v4: s2 = v1
    val v5: s2 = f39(v4)
    v4 = v4.copy(p2 = v0)
    v4 = v4.copy(p2 = v0)
    v5
  }
  def f23(v0: s2): s2 = {
    val v6: s2 = f39(v0)
    val v3: Vector[s0] = v6.p0
    var v5: s2 = v0
    v5 = v5.copy(p0 = v3)
    v5 = v5.copy(p0 = v3)
    var v4: Vector[s0] = v3
    val v1: Vector[s0] = v0.p1
    var v13: s2 = v5
    val v11: s0 = v3(0)
    val v17: s0 = v1(1)
    v4 = v4.updated(0, v17)
    v13 = v13.copy(p1 = v1)
    val v60: Vector[Vector[Double]] = v11.p0
    var v25: Vector[Vector[Double]] = v60
    v5 = v5.copy(p2 = v17)
    val v23: s0 = v1(0)
    var v18: s0 = v17
    val v10: s2 = f33(v18, v13)
    v13 = v13.copy(p1 = v1)
    v13 = v13.copy(p0 = v4)
    v25 = v60
    val v38: s2 = f33(v23, v10)
    v18 = v18.copy(p0 = v25)
    v13 = v13.copy(p0 = v3)
    v25 = v60
    v4 = v4.updated(0, v23)
    val v94: s2 = f33(v23, v38)
    v94
  }
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    val v3: Vector[s7] = Vector(v0, v0, v0, v0)
    val v13: s7 = v3(3)
    val v11: s5 = v13.p1
    val v9: s4 = v11.p0
    val v15: s2 = v11.p1
    var v23: s4 = v9
    val v28: s2 = f23(v15)
    v23 = v23.copy(p0 = v15)
    var v29: s4 = v23
    val v38: s2 = f23(v28)
    v23 = v23.copy(p0 = v38)
    val v31: s2 = f23(v28)
    val v32: Vector[s0] = v15.p1
    val v60: s2 = f23(v15)
    val v22: s2 = f23(v60)
    val v50: s2 = f23(v31)
    v29 = v29.copy(p0 = v22)
    val v155: s0 = v32(0)
    val v39: s1 = s1(v155, v155)
    val v94: s4 = f46(v39, v29)
    v29 = v29.copy(p0 = v22)
    val v85: s2 = v23.p0
    val v117: s2 = f33(v155, v50)
    v23 = v94
    val v79: s2 = f39(v85)
    val v103: s0 = v79.p2
    val v70: Vector[Vector[Double]] = v103.p0
    val v72: s2 = f23(v117)
    v29 = v29.copy(p0 = v72)
    v29 = v9
    val v224: Vector[Double] = v70(0)
    var v161: Vector[Double] = v224
    val v286: Double = v161(0)
    v286
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s5(s4(s2(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), Vector(24.0, 25.0)), s2(Vector(s0(Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0)))), Vector(s0(Vector(Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0)))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0))))))
    val v1: Double = 38.0
    val start = nanoTime()
    var result: Double = 38.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}