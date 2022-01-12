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
  case class s6 (
    p0: Vector[Vector[s1]],
    p1: s0
  )
  def f60(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    var v4: s0 = v0
    val v5: Vector[Vector[Double]] = v4.p1
    v4 = v4.copy(p1 = v5)
    v4 = v4.copy(p1 = v5)
    v4 = v4.copy(p0 = v6)
    v4 = v4.copy(p1 = v5)
    v4 = v4.copy(p0 = v6)
    v4 = v4.copy(p0 = v6)
    val v8: Vector[Double] = v5(1)
    val v3: Vector[Double] = v5(1)
    v4 = v4.copy(p1 = v5)
    v4 = v4.copy(p0 = v6)
    var v1: Vector[Vector[Double]] = v5
    v1 = v1.updated(0, v8)
    v1 = v1.updated(1, v3)
    v4 = v4.copy(p0 = v6)
    var v12: s0 = v4
    val v41: Vector[Vector[Double]] = v12.p1
    v4 = v4.copy(p1 = v1)
    val v29: Vector[Double] = v1(0)
    v1 = v1.updated(1, v29)
    var v39: s0 = v12
    val v32: Vector[Vector[Double]] = v0.p0
    v12 = v4
    v4 = v12
    v39 = v39.copy(p0 = v32)
    v12 = v12.copy(p1 = v41)
    v39
  }
  def f38(v0: Vector[Vector[s6]]): Vector[Vector[s6]] = {
    var v2: Vector[Vector[s6]] = v0
    var v4: Vector[Vector[s6]] = v2
    val v3: Vector[Vector[Vector[s6]]] = Vector(v2, v4, v2, v0, v4, v0, v4)
    var v7: Vector[Vector[Vector[s6]]] = v3
    val v55: Vector[Vector[s6]] = v7(3)
    v7 = v7.updated(6, v2)
    v55
  }
  def f18(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Vector[Double]] = v0.p1
    val v3: Vector[Double] = v4(1)
    val v7: Vector[Double] = v4(1)
    val v8: s0 = f60(v0)
    val v13: Vector[Vector[Double]] = v0.p0
    val v9: Vector[Double] = v5(0)
    var v14: Vector[Vector[Double]] = v13
    v14 = v14.updated(0, v7)
    v14 = v5
    v14 = v14.updated(1, v3)
    v14 = v14.updated(0, v3)
    v14 = v14.updated(0, v9)
    val v55: s0 = f60(v0)
    val v27: Vector[Vector[Double]] = v55.p0
    val v50: s0 = f60(v8)
    v14 = v14.updated(2, v3)
    var v179: s0 = v50
    v179 = v179.copy(p0 = v27)
    v179 = v179.copy(p0 = v14)
    v179 = v179.copy(p1 = v4)
    v179
  }
  def f11(v0: s6): s6 = {
    val v8: Vector[s6] = Vector(v0, v0, v0, v0, v0, v0)
    val v10: Vector[Vector[s6]] = Vector(v8, v8, v8, v8, v8, v8, v8)
    val v18: Vector[Vector[Vector[s6]]] = Vector(v10, v10)
    val v12: Vector[Vector[s6]] = v18(0)
    val v16: Vector[Vector[s6]] = v18(1)
    var v72: Vector[Vector[s6]] = v16
    v72 = v72.updated(6, v8)
    val v37: Vector[s6] = v72(6)
    v72 = v16
    var v100: Vector[s6] = v37
    val v133: Vector[s6] = v12(4)
    val v146: s6 = v133(5)
    var v139: Vector[s6] = v100
    v139 = v139.updated(0, v146)
    val v212: s6 = v139(1)
    v212
  }
  @noinline
  def f0(v0: Double, v1: Vector[Vector[s6]]): Double = {
    var v2: Vector[Vector[s6]] = v1
    val v7: Vector[s6] = v2(0)
    val v8: Vector[Vector[s6]] = f38(v2)
    v2 = v2.updated(2, v7)
    val v5: Vector[Vector[s6]] = f38(v8)
    var v10: Vector[Vector[s6]] = v5
    v10 = v10.updated(2, v7)
    val v11: Vector[s6] = v5(2)
    var v16: Vector[s6] = v11
    val v17: Vector[s6] = v8(2)
    val v18: Vector[Vector[s6]] = f38(v10)
    var v26: Vector[s6] = v7
    v2 = v2.updated(2, v11)
    v10 = v2
    val v24: s6 = v7(0)
    v10 = v10.updated(0, v17)
    val v25: Vector[Vector[s1]] = v24.p0
    var v59: s6 = v24
    v59 = v59.copy(p0 = v25)
    val v21: Vector[s6] = v18(0)
    val v35: s6 = f11(v59)
    val v30: Vector[Vector[s1]] = v59.p0
    v59 = v59.copy(p0 = v30)
    val v19: Vector[s1] = v25(0)
    val v20: s0 = v35.p1
    v59 = v59.copy(p1 = v20)
    var v32: s6 = v59
    val v54: Vector[s1] = v30(0)
    v59 = v59.copy(p0 = v25)
    val v58: s1 = v54(0)
    val v50: Vector[s6] = Vector(v59, v35, v32)
    val v49: s6 = v50(2)
    v59 = v59.copy(p0 = v25)
    v10 = v10.updated(1, v21)
    v2 = v2.updated(1, v16)
    v2 = v2.updated(1, v21)
    val v61: s0 = v58.p1
    v26 = v26.updated(0, v49)
    v2 = v2.updated(2, v21)
    val v62: Vector[Vector[Double]] = v20.p1
    val v64: s6 = v50(1)
    val v180: Vector[Double] = v62(1)
    v59 = v59.copy(p0 = v30)
    val v43: s0 = v58.p0
    var v72: Vector[s6] = v21
    val v81: s0 = v35.p1
    v59 = v59.copy(p1 = v20)
    v10 = v10.updated(0, v26)
    v59 = v59.copy(p0 = v30)
    val v38: s0 = f18(v61)
    val v84: s0 = f60(v43)
    val v69: Vector[Vector[s1]] = v64.p0
    val v126: s0 = f60(v84)
    v59 = v59.copy(p1 = v81)
    v32 = v32.copy(p1 = v20)
    v10 = v10.updated(2, v26)
    v10 = v10.updated(0, v21)
    val v82: Double = v180(0)
    val v113: s6 = v72(0)
    v59 = v59.copy(p1 = v38)
    v59 = v59.copy(p0 = v69)
    var v108: Vector[Vector[s1]] = v69
    v108 = v108.updated(0, v19)
    val v75: Vector[s1] = v30(0)
    val v121: Double = v82 / v82
    v10 = v10.updated(1, v11)
    v26 = v26.updated(0, v32)
    var v131: s6 = v113
    v72 = v72.updated(0, v24)
    v59 = v59.copy(p0 = v108)
    val v192: Vector[Vector[s1]] = v131.p0
    v108 = v108.updated(0, v75)
    v131 = v131.copy(p1 = v126)
    v26 = v26.updated(0, v24)
    v59 = v59.copy(p0 = v192)
    v16 = v16.updated(0, v35)
    v26 = v26.updated(0, v32)
    v131 = v131.copy(p0 = v192)
    v121
  }
  def benchmark(): Unit = {
    val v0: Double = 0.0
    val v1: Vector[Vector[s6]] = Vector(Vector(s6(Vector(Vector(s1(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0)))))), s0(Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))))), Vector(s6(Vector(Vector(s1(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0)))))), s0(Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0))))), Vector(s6(Vector(Vector(s1(s0(Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0)))))), s0(Vector(Vector(41.0), Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0))))))
    val start = nanoTime()
    var result: Double = [[StructValue(Name(str='s6', ty=None), [[[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[1.0], [2.0], [3.0]], [[4.0], [5.0]]]), StructValue(Name(str='s0', ty=None), [[[6.0], [7.0], [8.0]], [[9.0], [10.0]]])])]], StructValue(Name(str='s0', ty=None), [[[11.0], [12.0], [13.0]], [[14.0], [15.0]]])])], [StructValue(Name(str='s6', ty=None), [[[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[16.0], [17.0], [18.0]], [[19.0], [20.0]]]), StructValue(Name(str='s0', ty=None), [[[21.0], [22.0], [23.0]], [[24.0], [25.0]]])])]], StructValue(Name(str='s0', ty=None), [[[26.0], [27.0], [28.0]], [[29.0], [30.0]]])])], [StructValue(Name(str='s6', ty=None), [[[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[31.0], [32.0], [33.0]], [[34.0], [35.0]]]), StructValue(Name(str='s0', ty=None), [[[36.0], [37.0], [38.0]], [[39.0], [40.0]]])])]], StructValue(Name(str='s0', ty=None), [[[41.0], [42.0], [43.0]], [[44.0], [45.0]]])])]]
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}