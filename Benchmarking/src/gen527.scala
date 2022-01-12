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
    p2: Vector[Vector[s0]],
    p3: s0
  )
  def f106(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p0
    var v2: s0 = v0
    v2 = v2.copy(p0 = v7)
    v2 = v2.copy(p0 = v7)
    v2
  }
  def f103(v0: Vector[s0], v1: s0): s0 = {
    val v7: Vector[Vector[s0]] = Vector(v0, v0, v0, v0, v0)
    val v5: Vector[s0] = v7(2)
    var v59: Vector[Vector[s0]] = v7
    val v74: Vector[s0] = v59(1)
    v59 = v7
    v59 = v59.updated(1, v5)
    val v126: s0 = v74(0)
    v126
  }
  def f98(v0: s0, v1: Vector[s0]): s0 = {
    var v5: s0 = v0
    val v7: s0 = f106(v5)
    val v3: s0 = v1(0)
    var v6: Vector[s0] = v1
    val v11: Vector[Vector[Double]] = v0.p0
    val v9: s0 = v6(0)
    var v15: Vector[Vector[Double]] = v11
    v5 = v5.copy(p0 = v15)
    v5 = v5.copy(p0 = v15)
    val v14: s0 = v6(0)
    val v16: Vector[Double] = v11(2)
    val v21: Vector[s0] = Vector(v3, v5, v0, v9, v7, v14, v7)
    v15 = v15.updated(1, v16)
    val v25: s0 = v21(3)
    v25
  }
  def f96(v0: s0): s0 = {
    var v5: s0 = v0
    val v2: Vector[Vector[Double]] = v0.p0
    val v4: s0 = f106(v0)
    val v3: Vector[Vector[Double]] = v5.p0
    val v7: Vector[Vector[Double]] = v0.p0
    val v16: s0 = f106(v4)
    val v18: s0 = f106(v4)
    v5 = v5.copy(p0 = v7)
    val v20: Vector[Vector[Double]] = v16.p1
    val v13: Vector[Vector[Double]] = v18.p1
    v5 = v5.copy(p0 = v3)
    v5 = v5.copy(p1 = v20)
    val v14: Vector[Vector[Double]] = v5.p1
    v5 = v5.copy(p0 = v2)
    val v33: Vector[Vector[Double]] = v5.p1
    v5 = v5.copy(p1 = v14)
    val v27: s0 = s0(v3, v13)
    v5 = v5.copy(p1 = v13)
    v5 = v5.copy(p1 = v33)
    val v108: Vector[Vector[Double]] = v4.p1
    var v40: s0 = v27
    v40 = v40.copy(p1 = v108)
    var v114: Vector[Vector[Double]] = v20
    v40 = v40.copy(p1 = v114)
    v40
  }
  def f93(v0: s0): s0 = {
    val v3: s0 = f106(v0)
    val v1: s0 = f106(v0)
    val v6: Vector[Vector[Double]] = v1.p0
    var v8: Vector[Vector[Double]] = v6
    val v11: Vector[Double] = v6(1)
    val v10: s0 = f106(v3)
    val v12: Vector[Vector[Double]] = v0.p1
    var v26: s0 = v1
    v26 = v26.copy(p0 = v8)
    v8 = v8.updated(0, v11)
    val v14: Vector[Vector[Double]] = v3.p0
    val v22: Vector[Vector[Double]] = v10.p0
    var v24: Vector[Vector[Double]] = v12
    val v19: s0 = f96(v26)
    v26 = v26.copy(p0 = v22)
    v26 = v26.copy(p0 = v6)
    v26 = v26.copy(p1 = v24)
    v26 = v26.copy(p0 = v14)
    v19
  }
  def f83(v0: s0): s0 = {
    val v7: s0 = f106(v0)
    val v6: Vector[Vector[Double]] = v0.p1
    var v1: s0 = v7
    v1 = v1.copy(p1 = v6)
    val v3: s0 = f96(v0)
    val v35: s0 = f96(v0)
    val v14: Vector[Vector[Double]] = v0.p0
    val v31: s0 = f106(v35)
    val v42: Vector[Vector[Double]] = v31.p1
    val v50: s0 = f96(v1)
    v1 = v1.copy(p1 = v42)
    v1 = v1.copy(p0 = v14)
    val v129: s0 = f106(v50)
    val v66: Vector[s0] = Vector(v129, v50, v31, v3, v31)
    val v59: s0 = v66(3)
    val v151: s0 = f96(v59)
    v151
  }
  def f78(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p0
    val v7: s0 = f83(v0)
    val v4: Vector[s0] = Vector(v0)
    var v2: s0 = v7
    val v9: s0 = f103(v4, v0)
    v2 = v2.copy(p0 = v3)
    val v5: s0 = f93(v7)
    v2 = v2.copy(p0 = v3)
    var v17: s0 = v0
    val v14: s0 = v4(0)
    val v18: s0 = f96(v7)
    var v13: Vector[Vector[Double]] = v3
    val v21: s0 = f83(v5)
    v2 = v2.copy(p0 = v13)
    val v30: Vector[Vector[Double]] = v21.p1
    val v20: Vector[Double] = v13(0)
    val v22: s0 = f83(v17)
    val v25: s0 = f98(v0, v4)
    val v19: Vector[Vector[Double]] = v18.p1
    val v42: s0 = f103(v4, v14)
    val v28: Vector[s0] = Vector(v2, v22, v25, v9)
    v17 = v17.copy(p1 = v19)
    val v58: Vector[Vector[Double]] = v42.p1
    val v60: Vector[Vector[Double]] = v18.p0
    val v64: s0 = v4(0)
    val v35: Vector[Vector[Double]] = v21.p0
    var v38: Vector[s0] = v28
    v2 = v64
    v2 = v22
    v13 = v13.updated(1, v20)
    v17 = v17.copy(p0 = v60)
    v17 = v17.copy(p0 = v35)
    val v161: s0 = v38(0)
    v17 = v17.copy(p1 = v58)
    v2 = v2.copy(p1 = v30)
    v161
  }
  def f10(v0: s0, v1: Vector[s0]): s0 = {
    val v4: s0 = v1(0)
    val v3: Vector[Vector[Double]] = v4.p1
    val v10: Vector[Vector[Double]] = v0.p0
    var v2: Vector[Vector[Double]] = v10
    var v11: s0 = v4
    val v9: Vector[Vector[Double]] = v11.p1
    val v19: Vector[Double] = v3(1)
    var v20: Vector[Vector[Double]] = v10
    val v17: Vector[Vector[Double]] = v0.p0
    v2 = v2.updated(0, v19)
    val v23: Vector[Double] = v17(2)
    val v37: s0 = s0(v10, v9)
    v11 = v11.copy(p0 = v2)
    v11 = v11.copy(p0 = v20)
    v11 = v11.copy(p0 = v10)
    v20 = v20.updated(1, v23)
    v37
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v5: Vector[s0] = v0.p1
    var v8: Vector[s0] = v5
    val v2: s0 = v5(0)
    v8 = v8.updated(1, v2)
    val v3: Vector[Vector[Double]] = v2.p1
    val v13: Vector[Vector[Double]] = v2.p0
    var v4: Vector[Vector[Double]] = v13
    val v7: Vector[Double] = v3(1)
    val v12: s0 = s0(v4, v3)
    v4 = v4.updated(1, v7)
    v8 = v8.updated(0, v12)
    val v22: s0 = f96(v2)
    val v18: s0 = f10(v12, v5)
    val v42: s0 = v8(1)
    v8 = v8.updated(0, v18)
    val v41: s0 = f78(v22)
    val v32: Vector[Vector[Double]] = v42.p0
    val v34: Vector[Vector[Double]] = v41.p1
    val v64: Vector[Double] = v32(2)
    val v47: Vector[Vector[Double]] = Vector(v7, v7, v7, v64, v64)
    val v73: Vector[Double] = v47(1)
    var v54: Vector[Vector[Double]] = v47
    val v130: Vector[Double] = v54(2)
    v4 = v4.updated(0, v73)
    var v161: Vector[Double] = v130
    val v78: Vector[Double] = v34(1)
    val v144: Double = v161(0)
    v54 = v54.updated(0, v78)
    v144
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))
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