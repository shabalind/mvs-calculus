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
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  case class s4 (
    p0: s2,
    p1: s0
  )
  def f74(v0: Vector[s0]): Vector[s0] = {
    val v7: s0 = v0(1)
    val v5: Vector[Vector[Double]] = v7.p1
    val v4: Vector[Vector[Double]] = v7.p0
    val v2: s0 = v0(1)
    var v10: s0 = v7
    val v17: s0 = v0(0)
    val v12: Vector[Vector[Double]] = v10.p0
    var v8: s0 = v10
    var v11: Vector[s0] = v0
    v8 = v8.copy(p0 = v4)
    val v21: Vector[Vector[Double]] = v17.p0
    val v27: s0 = v11(1)
    val v32: Vector[Vector[Double]] = v8.p0
    val v19: Vector[Vector[Double]] = v7.p1
    v10 = v10.copy(p1 = v5)
    v8 = v8.copy(p1 = v19)
    val v18: s0 = v11(1)
    val v36: Vector[Vector[Double]] = v2.p1
    v10 = v10.copy(p0 = v32)
    v10 = v10.copy(p0 = v21)
    val v24: s1 = s1(v0, v11)
    val v56: Vector[Vector[Double]] = v10.p0
    val v51: Vector[Vector[s0]] = Vector(v0, v0, v11, v11)
    v11 = v11.updated(0, v10)
    val v40: Vector[s0] = v24.p1
    v10 = v10.copy(p0 = v4)
    v8 = v8.copy(p0 = v12)
    val v35: s1 = s1(v11, v40)
    val v43: Vector[Vector[Double]] = v18.p1
    v8 = v8.copy(p1 = v36)
    var v77: Vector[Vector[s0]] = v51
    var v50: s1 = v24
    v50 = v35
    v8 = v8.copy(p1 = v36)
    val v92: Vector[Vector[Vector[s0]]] = Vector(v51, v77)
    var v54: Vector[Vector[Vector[s0]]] = v92
    val v82: Vector[Vector[Double]] = v27.p1
    v8 = v8.copy(p0 = v56)
    v50 = v50.copy(p1 = v40)
    val v87: Vector[Vector[s0]] = v54(0)
    v10 = v10.copy(p1 = v82)
    val v155: Vector[s0] = v87(3)
    val v125: Vector[s0] = v24.p0
    val v118: Vector[Vector[s0]] = v92(1)
    v50 = v50.copy(p1 = v0)
    v8 = v8.copy(p0 = v12)
    v77 = v77.updated(2, v155)
    v8 = v8.copy(p0 = v4)
    v10 = v10.copy(p0 = v4)
    v54 = v54.updated(0, v87)
    v8 = v8.copy(p1 = v43)
    val v136: Vector[s0] = v50.p0
    v54 = v54.updated(1, v118)
    v50 = v50.copy(p0 = v125)
    v50 = v50.copy(p0 = v155)
    v8 = v8.copy(p0 = v4)
    v136
  }
  def f70(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p1
    var v2: Vector[Vector[Double]] = v7
    val v6: Vector[Vector[Double]] = v0.p0
    val v10: Vector[Double] = v7(1)
    v2 = v2.updated(2, v10)
    var v9: Vector[Double] = v10
    val v4: Double = v9(0)
    val v1: Vector[Double] = v2(0)
    v2 = v2.updated(1, v9)
    v2 = v2.updated(2, v10)
    v9 = v9.updated(0, v4)
    val v8: Vector[Double] = v6(0)
    v2 = v2.updated(1, v1)
    val v28: Vector[Vector[Double]] = v0.p0
    val v35: Vector[Double] = v7(1)
    v2 = v7
    val v31: Vector[Vector[Double]] = v0.p0
    var v19: Vector[Vector[Double]] = v31
    val v29: Vector[Vector[Double]] = v0.p1
    v19 = v19.updated(1, v1)
    val v21: Vector[Double] = v28(0)
    var v25: Vector[Vector[Double]] = v31
    var v46: s0 = v0
    var v45: Vector[Double] = v8
    var v43: Vector[Vector[Double]] = v25
    var v53: Vector[Vector[Double]] = v43
    val v58: Vector[Double] = v28(0)
    val v67: Vector[Vector[Vector[Double]]] = Vector(v29)
    v46 = v46.copy(p1 = v29)
    var v40: Vector[Vector[Vector[Double]]] = v67
    v43 = v43.updated(0, v21)
    v46 = v46.copy(p0 = v28)
    v46 = v46.copy(p0 = v19)
    var v206: Vector[Vector[Vector[Double]]] = v40
    v40 = v67
    v2 = v2.updated(2, v58)
    var v77: Vector[Vector[Double]] = v2
    val v55: Double = v35(0)
    v45 = v45.updated(0, v55)
    v46 = v46.copy(p1 = v77)
    v46 = v46.copy(p1 = v29)
    v25 = v25.updated(1, v45)
    val v100: Vector[Vector[Double]] = v206(0)
    v46 = v46.copy(p0 = v53)
    v46 = v46.copy(p1 = v100)
    v46
  }
  def f61(v0: Vector[s2]): Vector[s2] = {
    var v1: Vector[s2] = v0
    var v5: Vector[s2] = v0
    var v7: Vector[s2] = v1
    v7 = v5
    v7
  }
  def f44(v0: s1): s1 = {
    var v7: s1 = v0
    val v2: Vector[s1] = Vector(v7, v7, v7, v7, v0)
    v7 = v0
    val v6: Vector[s0] = v0.p0
    var v8: Vector[s1] = v2
    v7 = v0
    v8 = v8.updated(3, v7)
    v8 = v8.updated(1, v7)
    val v4: Vector[s0] = v0.p1
    v8 = v8.updated(0, v7)
    var v10: Vector[s1] = v2
    val v14: Vector[s0] = v0.p1
    var v3: Vector[s1] = v10
    val v12: s1 = v8(2)
    val v25: Vector[s0] = f74(v6)
    v7 = v7.copy(p1 = v4)
    var v17: Vector[s0] = v14
    v3 = v3.updated(0, v12)
    v10 = v10.updated(3, v12)
    v10 = v2
    v3 = v3.updated(1, v7)
    v17 = v6
    var v35: Vector[s1] = v3
    val v36: s1 = v35(2)
    var v40: Vector[s1] = v2
    var v82: s1 = v36
    v82 = v82.copy(p1 = v17)
    val v46: s1 = v40(3)
    v3 = v8
    v3 = v3.updated(2, v46)
    v7 = v7.copy(p1 = v25)
    v82
  }
  def f1(v0: s2): s2 = {
    val v6: s1 = v0.p1
    val v5: s1 = f44(v6)
    val v4: s1 = f44(v5)
    val v9: Vector[s0] = v4.p0
    var v2: Vector[s0] = v9
    val v3: s0 = v9(1)
    var v8: s1 = v5
    val v11: Vector[s0] = v8.p1
    val v15: s0 = v11(0)
    val v10: s2 = s2(v11, v8)
    val v13: Vector[s0] = f74(v2)
    var v24: s2 = v10
    v8 = v8.copy(p0 = v11)
    v8 = v8.copy(p0 = v11)
    v8 = v8.copy(p1 = v11)
    v2 = v2.updated(1, v15)
    val v20: s0 = v9(0)
    v2 = v2.updated(0, v20)
    v2 = v2.updated(1, v3)
    v24 = v24.copy(p0 = v9)
    v24 = v24.copy(p0 = v13)
    v24
  }
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Double): Double = {
    var v6: Vector[Vector[s2]] = v0
    var v4: Vector[Vector[s2]] = v6
    val v3: Vector[s2] = v4(0)
    val v2: Vector[s2] = f61(v3)
    val v10: Vector[s2] = f61(v2)
    val v5: s2 = v2(0)
    val v13: s2 = f1(v5)
    val v15: s2 = f1(v13)
    v6 = v6.updated(0, v3)
    val v11: Vector[s2] = v4(1)
    val v30: Vector[s0] = v5.p0
    v6 = v6.updated(1, v10)
    v6 = v6.updated(1, v11)
    val v21: Vector[s0] = v5.p0
    val v14: s1 = s1(v21, v21)
    var v17: Vector[s0] = v30
    val v16: s0 = v17(0)
    val v18: s4 = s4(v15, v16)
    val v20: s0 = f70(v16)
    val v22: Vector[Vector[Double]] = v20.p1
    val v34: s2 = v18.p0
    val v19: Vector[s0] = v14.p0
    val v23: Vector[s2] = v4(0)
    var v35: Vector[s2] = v23
    v17 = v17.updated(1, v20)
    v4 = v4.updated(0, v35)
    v35 = v3
    val v44: Vector[Vector[Double]] = v16.p0
    val v67: Vector[Double] = v22(1)
    var v93: Vector[s0] = v19
    val v62: Vector[Double] = v44(0)
    val v82: Double = v67(0)
    v93 = v93.updated(1, v16)
    val v73: s0 = v93(0)
    v6 = v4
    v4 = v4.updated(1, v11)
    val v149: Double = v62(0)
    val v101: Double = v149 * v82
    v35 = v35.updated(0, v5)
    v35 = v35.updated(0, v34)
    v17 = v17.updated(1, v73)
    v101
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), s1(Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))))), Vector(s2(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), s1(Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))), Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))))
    val v1: Double = 60.0
    val start = nanoTime()
    var result: Double = 60.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}