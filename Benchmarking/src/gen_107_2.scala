import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0],
    p2: s0,
    p3: s0,
    p4: s0,
    p5: s0,
    p6: s0,
    p7: Vector[s0]
  )
  def f97(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p1
    val v1: Vector[Vector[Double]] = v0.p1
    val v15: Vector[Vector[Double]] = v0.p0
    val v8: Vector[Vector[Double]] = v0.p0
    val v28: Vector[Vector[Double]] = v0.p0
    val v14: Vector[Vector[Double]] = v0.p0
    val v16: Vector[Double] = v28(1)
    val v18: Vector[Vector[Double]] = v0.p1
    var v19: s0 = v0
    val v17: Vector[Vector[Double]] = v19.p1
    v19 = v19.copy(p0 = v15)
    val v20: Vector[Vector[Double]] = v19.p0
    val v30: Vector[Vector[Double]] = v19.p1
    v19 = v19.copy(p1 = v1)
    var v37: Vector[Double] = v16
    v19 = v19.copy(p1 = v15)
    v19 = v19.copy(p1 = v20)
    var v42: s0 = v19
    v19 = v19.copy(p0 = v8)
    val v29: Vector[Vector[Double]] = v19.p0
    v19 = v19.copy(p0 = v4)
    var v59: Vector[Vector[Double]] = v30
    val v62: Vector[Vector[Double]] = v0.p1
    v42 = v42.copy(p0 = v18)
    v42 = v42.copy(p1 = v62)
    val v43: Vector[Vector[Double]] = v42.p1
    val v65: Vector[Vector[Double]] = v0.p0
    v19 = v19.copy(p1 = v1)
    v19 = v19.copy(p1 = v59)
    var v39: Vector[Vector[Double]] = v29
    var v66: Vector[Vector[Double]] = v28
    v42 = v42.copy(p1 = v39)
    var v52: Vector[Vector[Double]] = v28
    v19 = v19.copy(p0 = v65)
    v19 = v19.copy(p0 = v43)
    v42 = v42.copy(p1 = v66)
    v19 = v19.copy(p0 = v17)
    v42 = v42.copy(p0 = v29)
    v39 = v39.updated(1, v37)
    v42 = v42.copy(p1 = v52)
    v66 = v14
    v42 = v42.copy(p0 = v20)
    v42
  }
  def f90(v0: s0): s0 = {
    val v6: s0 = f97(v0)
    v6
  }
  def f87(v0: s0, v1: s0): s0 = {
    var v4: s0 = v1
    var v7: s0 = v4
    val v3: s0 = f97(v0)
    val v6: Vector[Vector[Double]] = v0.p1
    val v5: s0 = f97(v0)
    val v9: s0 = f90(v4)
    val v8: s0 = s0(v6, v6)
    var v11: s0 = v5
    v7 = v7.copy(p0 = v6)
    val v15: s0 = f90(v5)
    val v29: Vector[Vector[Double]] = v7.p0
    var v2: s0 = v3
    val v22: Vector[Vector[Double]] = v7.p1
    val v10: s0 = f97(v5)
    val v14: s0 = f90(v4)
    v7 = v7.copy(p1 = v29)
    val v18: Vector[Vector[Double]] = v10.p0
    val v16: Vector[Vector[Double]] = v15.p0
    v7 = v7.copy(p0 = v18)
    val v19: Vector[s0] = Vector(v14, v9, v11, v1, v2, v3, v11)
    val v13: Vector[Double] = v18(1)
    val v28: Double = v13(0)
    val v17: Vector[Vector[Double]] = v5.p0
    val v20: s0 = f90(v11)
    val v26: s0 = v19(0)
    var v24: Vector[s0] = v19
    val v55: Vector[Vector[Double]] = v2.p1
    val v34: s0 = f90(v26)
    val v42: s0 = f97(v8)
    v4 = v4.copy(p1 = v17)
    val v21: s0 = f90(v8)
    v7 = v7.copy(p1 = v22)
    val v45: s0 = v19(1)
    v7 = v7.copy(p0 = v29)
    v2 = v8
    val v25: Vector[Vector[Double]] = v9.p0
    v7 = v7.copy(p0 = v29)
    val v23: Vector[Double] = v22(0)
    v24 = v24.updated(6, v45)
    v24 = v24.updated(3, v20)
    val v82: s0 = v24(4)
    v24 = v24.updated(1, v3)
    val v43: Vector[Vector[Double]] = v11.p1
    v24 = v24.updated(0, v34)
    v24 = v24.updated(2, v42)
    val v69: Vector[Vector[Double]] = v82.p1
    val v44: Vector[Vector[Double]] = v3.p1
    v11 = v11.copy(p0 = v43)
    v2 = v2.copy(p1 = v16)
    var v46: Vector[Vector[Double]] = v25
    v11 = v11.copy(p0 = v69)
    var v96: Vector[Double] = v23
    v24 = v24.updated(1, v2)
    v46 = v46.updated(0, v96)
    v24 = v24.updated(6, v4)
    val v73: Double = v96(0)
    var v71: s0 = v21
    var v76: Vector[s0] = v24
    v96 = v96.updated(0, v28)
    v71 = v71.copy(p1 = v44)
    v2 = v2.copy(p0 = v17)
    v96 = v96.updated(0, v73)
    v7 = v7.copy(p0 = v29)
    v71 = v71.copy(p1 = v46)
    v76 = v76.updated(0, v71)
    val v206: s0 = v76(6)
    v11 = v11.copy(p1 = v55)
    v46 = v18
    v2 = v26
    v206
  }
  def f78(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p1
    var v6: s0 = v0
    val v2: s0 = f87(v6, v6)
    v6 = v6.copy(p1 = v4)
    v2
  }
  def f54(v0: s1, v1: s0): s0 = {
    var v3: s0 = v1
    val v4: Vector[Vector[Double]] = v1.p1
    val v10: Vector[Vector[Double]] = v3.p0
    var v25: Vector[Vector[Double]] = v10
    val v21: Vector[Vector[Double]] = v3.p0
    v3 = v3.copy(p1 = v10)
    var v50: Vector[Vector[Double]] = v25
    v25 = v4
    v3 = v3.copy(p1 = v50)
    var v63: s0 = v3
    v63 = v63.copy(p0 = v21)
    v3 = v3.copy(p1 = v25)
    v63
  }
  @noinline
  def f0(v0: s0, v1: Vector[s0], v2: s1, v3: Double): Double = {
    var v6: Vector[s0] = v1
    val v4: s0 = v6(0)
    val v13: s0 = v6(1)
    var v11: s0 = v0
    val v14: Vector[Vector[Double]] = v13.p1
    var v5: s0 = v13
    v5 = v5.copy(p1 = v14)
    val v24: Vector[Double] = v14(0)
    val v17: s0 = f54(v2, v0)
    val v22: Vector[Vector[Double]] = v4.p0
    v6 = v6.updated(2, v11)
    v11 = v11.copy(p1 = v14)
    v6 = v6.updated(2, v0)
    var v20: Vector[Vector[Double]] = v14
    v5 = v5.copy(p0 = v20)
    v5 = v5.copy(p1 = v20)
    v5 = v5.copy(p1 = v22)
    val v31: Vector[Vector[Double]] = v5.p0
    var v77: Vector[Vector[Double]] = v31
    v6 = v1
    val v38: Vector[Double] = v20(1)
    v11 = v11.copy(p1 = v77)
    val v56: s0 = f78(v17)
    var v69: Vector[Vector[Double]] = v22
    v11 = v11.copy(p1 = v69)
    v11 = v11.copy(p1 = v14)
    var v50: Vector[Double] = v38
    v5 = v5.copy(p0 = v69)
    v11 = v11.copy(p1 = v20)
    v20 = v20.updated(0, v38)
    v11 = v11.copy(p0 = v20)
    v69 = v69.updated(0, v50)
    v69 = v69.updated(0, v24)
    v50 = v38
    v6 = v6.updated(0, v56)
    val v95: Double = v50(0)
    v95
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))))
    val v2: s1 = s1(Vector(Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))))), Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)))))
    val v3: Double = 64.0
    val start = nanoTime()
    var result: Double = 64.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}