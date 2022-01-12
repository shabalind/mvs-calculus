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
  def f97(v0: s0): s0 = {
    var v7: s0 = v0
    val v1: Vector[Vector[Double]] = v7.p1
    val v9: Vector[Double] = v1(2)
    v7 = v7.copy(p1 = v1)
    v7 = v7.copy(p1 = v1)
    val v4: Vector[Double] = v1(0)
    val v6: Vector[Vector[Double]] = v7.p1
    var v8: Vector[Vector[Double]] = v6
    v8 = v8.updated(0, v9)
    val v3: Vector[Vector[Double]] = v7.p0
    val v11: Vector[Vector[Double]] = v0.p1
    v8 = v8.updated(2, v4)
    val v5: Vector[Double] = v3(1)
    v8 = v8.updated(1, v5)
    v7 = v7.copy(p1 = v11)
    v7 = v7.copy(p1 = v8)
    v7 = v7.copy(p0 = v3)
    v7
  }
  def f95(v0: Vector[s0]): Vector[s0] = {
    val v6: s0 = v0(0)
    val v4: s0 = f97(v6)
    var v3: Vector[s0] = v0
    v3 = v3.updated(0, v4)
    v3 = v3.updated(0, v4)
    var v2: Vector[s0] = v3
    val v12: s1 = s1(v6, v6)
    val v11: s0 = v12.p0
    val v29: s0 = f97(v11)
    v3 = v3.updated(0, v29)
    val v89: s0 = v2(0)
    v2 = v2.updated(0, v89)
    v2 = v3
    v2
  }
  def f94(v0: s0): s0 = {
    var v7: s0 = v0
    val v1: s0 = f97(v7)
    val v5: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Vector[Double]] = v0.p1
    val v8: Vector[Double] = v5(2)
    val v9: Vector[Double] = v5(0)
    var v3: Vector[Double] = v9
    val v11: s0 = f97(v7)
    val v2: Vector[Vector[Double]] = v1.p1
    v3 = v9
    val v10: Vector[Vector[Double]] = v1.p0
    var v12: Vector[Vector[Double]] = v10
    val v13: Vector[Double] = v2(1)
    val v26: Double = v9(0)
    var v18: Vector[Vector[Double]] = v2
    v3 = v8
    val v25: Vector[Double] = v4(2)
    val v20: Vector[Vector[Double]] = v0.p1
    var v22: Vector[Vector[Double]] = v20
    v7 = v7.copy(p1 = v2)
    var v29: Double = v26
    val v32: s0 = f97(v7)
    v18 = v18.updated(0, v8)
    v12 = v12.updated(1, v8)
    v18 = v18.updated(2, v13)
    var v70: Double = v29
    val v42: Vector[Double] = v12(0)
    v12 = v10
    val v39: Vector[Vector[Double]] = v32.p1
    v3 = v3.updated(0, v29)
    v7 = v7.copy(p1 = v18)
    v7 = v7.copy(p1 = v39)
    val v37: Vector[s0] = Vector(v11)
    v22 = v22.updated(2, v3)
    v18 = v18.updated(1, v42)
    v22 = v22.updated(1, v3)
    val v51: s0 = v37(0)
    v18 = v18.updated(0, v9)
    v18 = v18.updated(0, v25)
    v18 = v18.updated(0, v3)
    var v86: s0 = v51
    v7 = v7.copy(p0 = v12)
    v86 = v86.copy(p1 = v22)
    v29 = v70
    v86
  }
  def f88(v0: s0): s0 = {
    var v2: s0 = v0
    val v6: s0 = f97(v0)
    val v7: Vector[Vector[Double]] = v6.p0
    v2 = v2.copy(p0 = v7)
    v2 = v2.copy(p0 = v7)
    val v3: Vector[Vector[Double]] = v2.p1
    var v4: Vector[Vector[Double]] = v7
    val v1: Vector[Double] = v7(0)
    var v5: Vector[Double] = v1
    v4 = v4.updated(0, v5)
    val v8: s0 = f94(v0)
    val v11: Double = v1(0)
    v4 = v4.updated(1, v5)
    val v15: Vector[Vector[Double]] = v6.p1
    val v19: s0 = f97(v0)
    val v14: Double = v11 + v11
    v5 = v5.updated(0, v14)
    v2 = v2.copy(p0 = v4)
    v2 = v2.copy(p1 = v15)
    val v35: Vector[Vector[Double]] = v6.p1
    val v24: s0 = f94(v8)
    val v45: Vector[Vector[Double]] = v24.p1
    val v33: Vector[Vector[Double]] = v19.p1
    v2 = v2.copy(p1 = v3)
    v2 = v2.copy(p1 = v35)
    v2 = v2.copy(p1 = v33)
    val v61: s0 = f97(v2)
    v2 = v2.copy(p0 = v4)
    v2 = v2.copy(p1 = v45)
    v2 = v2.copy(p1 = v15)
    v4 = v4.updated(1, v5)
    v61
  }
  def f86(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p0
    val v2: s0 = f88(v0)
    val v4: Vector[Double] = v3(1)
    val v5: Vector[Vector[Double]] = v2.p0
    val v1: s0 = f94(v2)
    val v9: Vector[Vector[Double]] = v2.p0
    val v7: Vector[Vector[Double]] = v2.p1
    var v18: s0 = v0
    v18 = v18.copy(p1 = v7)
    val v11: s0 = f94(v18)
    val v23: Vector[Vector[Double]] = v18.p0
    val v43: s0 = s0(v5, v7)
    val v14: s0 = f88(v18)
    var v12: Vector[Vector[Double]] = v7
    v18 = v18.copy(p1 = v7)
    v18 = v18.copy(p0 = v23)
    val v47: Vector[Vector[Double]] = v14.p1
    var v15: s0 = v43
    var v34: Vector[Vector[Double]] = v12
    val v32: s0 = f88(v15)
    val v13: s0 = f94(v0)
    val v22: s0 = f94(v18)
    var v35: s0 = v11
    val v26: Vector[Vector[Double]] = v35.p0
    val v27: s0 = f88(v1)
    var v41: Vector[Vector[Double]] = v7
    v15 = v15.copy(p1 = v34)
    val v54: s0 = s0(v26, v47)
    val v110: s0 = f97(v27)
    val v61: Vector[Vector[Double]] = v32.p1
    val v72: Vector[Double] = v61(1)
    var v57: Vector[Vector[Double]] = v9
    val v45: s0 = f97(v13)
    val v142: Vector[Vector[Double]] = v45.p0
    v34 = v41
    v35 = v22
    val v108: s0 = f94(v110)
    v34 = v34.updated(0, v72)
    v35 = v35.copy(p0 = v142)
    val v94: Vector[Double] = v57(1)
    val v80: Vector[Vector[Double]] = v108.p1
    v35 = v35.copy(p1 = v7)
    v35 = v35.copy(p0 = v9)
    v18 = v18.copy(p1 = v80)
    v18 = v18.copy(p1 = v61)
    v34 = v34.updated(2, v4)
    val v95: s0 = f97(v54)
    val v85: s0 = f88(v1)
    v18 = v18.copy(p0 = v23)
    v34 = v34.updated(0, v72)
    v35 = v85
    v34 = v34.updated(0, v94)
    v57 = v9
    v18 = v18.copy(p1 = v7)
    v18 = v18.copy(p1 = v41)
    v95
  }
  def f80(v0: Vector[s0]): Vector[s0] = {
    val v2: Vector[s0] = f95(v0)
    val v5: Vector[s0] = f95(v0)
    val v8: Vector[s0] = f95(v2)
    val v3: s0 = v5(0)
    var v1: Vector[s0] = v8
    var v4: s0 = v3
    var v7: s0 = v4
    val v15: s0 = f97(v4)
    val v10: s0 = f94(v15)
    val v9: Vector[Vector[Double]] = v10.p1
    v7 = v7.copy(p1 = v9)
    val v11: s0 = f88(v7)
    val v13: Vector[Vector[Double]] = v3.p0
    val v14: s0 = f86(v3)
    v4 = v4.copy(p1 = v9)
    v1 = v1.updated(0, v11)
    val v19: s0 = v0(0)
    val v24: Vector[Vector[Double]] = v19.p0
    val v27: Vector[Vector[Double]] = v7.p0
    v1 = v1.updated(0, v14)
    val v35: Vector[Vector[Double]] = v4.p0
    v4 = v4.copy(p0 = v35)
    v4 = v4.copy(p0 = v24)
    v7 = v7.copy(p0 = v13)
    v7 = v7.copy(p0 = v27)
    var v28: Vector[Vector[Double]] = v35
    v7 = v7.copy(p0 = v35)
    v4 = v4.copy(p0 = v28)
    val v68: Vector[s0] = f95(v1)
    v7 = v7.copy(p0 = v27)
    v68
  }
  def f78(v0: s0, v1: s0): s0 = {
    val v9: s0 = f94(v1)
    val v6: Vector[Vector[Double]] = v9.p1
    val v11: Vector[Vector[Double]] = v1.p1
    val v7: Vector[Vector[Double]] = v0.p0
    var v28: s0 = v0
    v28 = v28.copy(p1 = v11)
    val v13: Vector[Vector[Double]] = v1.p1
    v28 = v28.copy(p0 = v7)
    val v71: Vector[Vector[Double]] = v9.p0
    var v29: s0 = v28
    val v22: s1 = s1(v0, v28)
    val v72: s0 = v22.p0
    v29 = v29.copy(p0 = v71)
    val v37: Vector[Vector[Double]] = v72.p0
    v28 = v28.copy(p1 = v6)
    v29 = v29.copy(p1 = v13)
    v29 = v29.copy(p0 = v37)
    v29
  }
  def f45(v0: Vector[s0]): Vector[s0] = {
    val v2: Vector[s0] = f80(v0)
    val v7: s0 = v2(0)
    val v6: s0 = v2(0)
    val v9: s0 = f78(v7, v7)
    val v1: s0 = v2(0)
    val v4: s0 = f78(v9, v6)
    var v5: s0 = v9
    val v3: s0 = v0(0)
    val v8: s0 = v0(0)
    val v15: s1 = s1(v4, v3)
    val v10: s0 = v15.p0
    var v13: s0 = v10
    v5 = v10
    val v27: s0 = f86(v5)
    var v12: s0 = v10
    val v34: Vector[Vector[Double]] = v12.p0
    var v17: s0 = v8
    var v18: Vector[s0] = v0
    val v30: Vector[Vector[Double]] = v1.p1
    v13 = v13.copy(p1 = v30)
    v18 = v18.updated(0, v13)
    v5 = v5.copy(p0 = v34)
    var v20: Vector[s0] = v18
    val v19: Vector[Vector[Double]] = v27.p0
    v17 = v17.copy(p0 = v19)
    val v46: s0 = v15.p1
    v18 = v18.updated(0, v17)
    v12 = v12.copy(p1 = v30)
    v5 = v46
    val v57: Vector[Vector[Double]] = v27.p0
    v18 = v18.updated(0, v8)
    var v73: Vector[Vector[Double]] = v30
    v5 = v5.copy(p0 = v57)
    v17 = v17.copy(p1 = v73)
    v20
  }
  @noinline
  def f0(v0: Vector[s0], v1: s1, v2: Double): Double = {
    val v8: s0 = v0(0)
    var v7: Double = v2
    v7 = v2
    v7 = v2
    var v15: s1 = v1
    val v9: s0 = v0(0)
    v15 = v15.copy(p0 = v8)
    val v6: s0 = v0(0)
    v7 = v2
    var v10: Double = v7
    val v13: s0 = v15.p1
    val v19: s0 = v0(0)
    var v23: Vector[s0] = v0
    var v34: Double = v7
    v23 = v23.updated(0, v6)
    v34 = v10
    val v22: s0 = v0(0)
    v34 = v2
    val v29: s0 = v1.p0
    var v14: Double = v10
    val v35: Vector[s0] = f45(v23)
    val v51: s0 = v35(0)
    val v38: Double = v34 - v34
    v23 = v23.updated(0, v9)
    v15 = v15.copy(p1 = v19)
    var v27: Double = v7
    val v53: Vector[Vector[Double]] = v51.p0
    val v65: Vector[Double] = v53(0)
    v23 = v23.updated(0, v13)
    val v47: Double = v65(0)
    var v31: Vector[Double] = v65
    var v95: Vector[Double] = v31
    val v82: Double = v95(0)
    v10 = v27
    v95 = v95.updated(0, v82)
    v95 = v95.updated(0, v14)
    val v81: Double = v47 * v82
    v15 = v15.copy(p0 = v22)
    v15 = v15.copy(p1 = v29)
    var v170: Double = v81
    v27 = v14
    v31 = v31.updated(0, v38)
    v170
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))))
    val v1: s1 = s1(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))
    val v2: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}