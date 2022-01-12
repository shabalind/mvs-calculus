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
  def f23(v0: s0, v1: s0): s0 = {
    var v7: s0 = v1
    val v4: Vector[Vector[Double]] = v0.p0
    val v3: Vector[Double] = v4(1)
    v7 = v7.copy(p0 = v4)
    val v13: Vector[Vector[Double]] = v7.p0
    val v8: Double = v3(0)
    v7 = v7.copy(p0 = v13)
    var v12: Vector[Double] = v3
    v7 = v7.copy(p0 = v13)
    val v20: Vector[Vector[Double]] = v0.p1
    val v27: Vector[Vector[Double]] = v7.p1
    val v14: Vector[Double] = v4(1)
    v12 = v14
    val v23: Vector[Vector[Double]] = v7.p1
    val v9: Vector[Vector[Double]] = v0.p0
    val v16: Vector[Double] = v20(1)
    var v18: Vector[Vector[Double]] = v9
    v18 = v18.updated(1, v16)
    v7 = v7.copy(p0 = v9)
    var v35: Vector[Vector[Double]] = v27
    val v24: Vector[Double] = v13(1)
    v12 = v12.updated(0, v8)
    var v28: s0 = v0
    var v49: s0 = v0
    var v26: s0 = v1
    v26 = v26.copy(p1 = v23)
    v28 = v26
    val v25: Vector[Double] = v20(1)
    var v43: Vector[Vector[Double]] = v27
    v49 = v49.copy(p0 = v9)
    v49 = v26
    v28 = v28.copy(p1 = v27)
    v43 = v43.updated(1, v12)
    val v50: Vector[Double] = v18(2)
    v35 = v35.updated(1, v25)
    val v46: Vector[Vector[Double]] = v1.p0
    var v31: Vector[Vector[Double]] = v46
    val v40: Vector[Double] = v43(1)
    v28 = v28.copy(p0 = v31)
    v31 = v31.updated(1, v40)
    v43 = v43.updated(0, v50)
    v7 = v7.copy(p1 = v35)
    v49 = v49.copy(p1 = v27)
    val v95: Vector[s0] = Vector(v26, v1, v28, v26, v49)
    val v114: s0 = v95(0)
    v31 = v31.updated(0, v24)
    v114
  }
  def f14(v0: s0): s0 = {
    var v3: s0 = v0
    var v4: s0 = v3
    var v7: s0 = v0
    v7 = v0
    val v5: Vector[s0] = Vector(v0, v4, v7, v3, v0, v4)
    val v2: s0 = v5(4)
    val v9: s0 = v5(5)
    val v1: s0 = v5(0)
    val v8: s0 = v5(1)
    val v10: Vector[Vector[Double]] = v8.p0
    val v15: s0 = f23(v2, v0)
    val v6: s0 = f23(v15, v15)
    v3 = v3.copy(p0 = v10)
    val v14: s0 = f23(v2, v9)
    val v12: s0 = f23(v15, v4)
    val v20: Vector[Vector[Double]] = v6.p1
    val v13: Vector[Vector[Double]] = v1.p1
    val v21: s0 = f23(v0, v3)
    val v26: s0 = f23(v8, v21)
    v4 = v4.copy(p0 = v10)
    var v30: Vector[s0] = v5
    val v33: s0 = f23(v8, v21)
    val v22: s0 = f23(v6, v7)
    val v24: s0 = f23(v14, v1)
    val v47: s0 = f23(v6, v7)
    var v19: Vector[Vector[Double]] = v20
    var v37: Vector[Vector[Double]] = v13
    val v45: s0 = f23(v22, v3)
    val v38: Vector[Vector[Double]] = v45.p0
    val v29: s0 = f23(v7, v33)
    v3 = v3.copy(p1 = v13)
    v4 = v4.copy(p1 = v13)
    val v25: Vector[Vector[Double]] = v7.p0
    val v44: s0 = f23(v26, v15)
    val v40: Vector[Vector[Double]] = v22.p1
    val v80: s0 = s0(v10, v40)
    v3 = v3.copy(p0 = v10)
    val v53: s0 = f23(v47, v12)
    val v52: s0 = f23(v47, v4)
    val v50: Vector[Vector[Double]] = v53.p1
    val v42: Vector[Vector[Double]] = v2.p1
    v4 = v4.copy(p1 = v19)
    v7 = v7.copy(p0 = v25)
    val v61: Vector[Double] = v10(0)
    v4 = v4.copy(p1 = v50)
    v4 = v4.copy(p1 = v42)
    val v109: Vector[Vector[Double]] = v21.p0
    val v69: s0 = f23(v1, v29)
    val v96: Vector[Vector[Double]] = v6.p0
    val v66: Vector[Vector[Double]] = v52.p1
    val v74: Vector[Vector[Double]] = v44.p0
    v7 = v7.copy(p0 = v74)
    val v122: Vector[Vector[Double]] = v80.p0
    val v78: s0 = f23(v24, v80)
    v7 = v7.copy(p1 = v37)
    val v104: Vector[Vector[Double]] = v15.p1
    val v111: s0 = v30(2)
    v3 = v3.copy(p1 = v37)
    val v128: s0 = f23(v21, v26)
    v7 = v7.copy(p0 = v96)
    v4 = v4.copy(p0 = v38)
    val v212: Vector[Vector[Double]] = v45.p1
    v3 = v3.copy(p0 = v122)
    v19 = v19.updated(0, v61)
    val v87: s0 = f23(v78, v69)
    val v90: s0 = f23(v87, v128)
    v7 = v7.copy(p1 = v66)
    v4 = v4.copy(p1 = v212)
    val v164: s0 = f23(v111, v90)
    v7 = v7.copy(p1 = v212)
    v4 = v4.copy(p1 = v104)
    v4 = v4.copy(p0 = v109)
    v3 = v3.copy(p1 = v212)
    v7 = v7.copy(p0 = v10)
    v164
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v2: s1 = v0(1)
    val v19: Vector[s0] = v2.p1
    val v15: s0 = v19(0)
    val v18: Vector[Vector[s0]] = Vector(v19)
    var v11: s0 = v15
    val v28: Vector[Vector[Double]] = v11.p0
    v11 = v15
    val v43: Vector[s0] = v18(0)
    val v69: s0 = f14(v15)
    val v16: Vector[Vector[Double]] = v69.p0
    v11 = v11.copy(p0 = v28)
    val v61: Vector[s0] = v18(0)
    v11 = v11.copy(p0 = v16)
    val v25: s0 = v61(1)
    val v42: Vector[Vector[Vector[Double]]] = Vector(v28, v16, v16, v28)
    v11 = v11.copy(p0 = v16)
    val v93: Vector[Vector[Double]] = v42(2)
    val v97: Vector[Double] = v93(1)
    v11 = v11.copy(p0 = v16)
    val v104: Double = v97(0)
    val v68: s0 = v43(0)
    v11 = v11.copy(p0 = v16)
    val v81: Vector[Vector[Double]] = v25.p1
    v11 = v11.copy(p1 = v81)
    val v143: Vector[Vector[Double]] = v25.p1
    val v58: Vector[Vector[Double]] = v15.p0
    v11 = v11.copy(p1 = v143)
    val v180: Vector[Vector[Double]] = v68.p0
    v11 = v11.copy(p0 = v28)
    v11 = v11.copy(p0 = v180)
    v11 = v11.copy(p0 = v58)
    v104
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), s1(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))))
    val v1: Double = 40.0
    val start = nanoTime()
    var result: Double = 40.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}