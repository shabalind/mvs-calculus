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
  case class s3 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s4 (
    p0: s0,
    p1: Vector[s0]
  )
  def f20(v0: s4): s4 = {
    val v7: Vector[s0] = v0.p1
    var v3: Vector[s0] = v7
    var v4: Vector[s0] = v7
    val v5: Vector[s4] = Vector(v0, v0, v0, v0, v0, v0, v0)
    val v6: s0 = v0.p0
    val v8: s0 = v3(1)
    val v14: Vector[s0] = v0.p1
    val v1: s0 = v4(0)
    val v2: Vector[s0] = v0.p1
    var v9: Vector[s0] = v14
    var v12: s0 = v1
    var v17: s0 = v6
    var v13: s0 = v1
    val v19: s4 = v5(3)
    var v23: s0 = v6
    v9 = v9.updated(0, v12)
    val v24: Vector[Vector[Double]] = v17.p1
    var v18: s0 = v8
    v17 = v17.copy(p1 = v24)
    v4 = v4.updated(0, v6)
    val v27: s0 = v0.p0
    v3 = v3.updated(0, v13)
    v18 = v18.copy(p1 = v24)
    val v37: s0 = v14(2)
    v18 = v18.copy(p1 = v24)
    val v28: s0 = v9(0)
    var v20: Vector[s4] = v5
    val v16: Vector[Vector[Double]] = v28.p1
    val v38: Vector[Vector[Vector[Double]]] = Vector(v24, v24, v24, v24, v16, v16, v24)
    v18 = v28
    var v33: Vector[s0] = v2
    v17 = v17.copy(p1 = v16)
    v12 = v12.copy(p1 = v16)
    v20 = v20.updated(6, v0)
    var v22: s4 = v0
    val v50: Vector[Vector[Double]] = v27.p1
    val v25: Vector[Vector[Vector[Double]]] = Vector(v24, v16, v16, v16, v50, v24, v50)
    val v42: Vector[Vector[Double]] = v37.p0
    val v57: Vector[s0] = v19.p1
    val v43: s4 = v20(2)
    val v72: Vector[Vector[Double]] = v8.p0
    val v108: s0 = v57(2)
    v33 = v33.updated(1, v1)
    val v68: Vector[Vector[Double]] = v38(6)
    val v36: Vector[Vector[Double]] = v108.p1
    val v29: s4 = v20(6)
    var v40: Vector[s4] = v20
    v40 = v40.updated(5, v22)
    v40 = v40.updated(2, v43)
    var v70: Vector[s0] = v33
    v12 = v12.copy(p1 = v36)
    var v75: Vector[Vector[Double]] = v72
    v13 = v13.copy(p1 = v24)
    v18 = v18.copy(p1 = v68)
    v12 = v12.copy(p0 = v75)
    v22 = v22.copy(p0 = v1)
    v20 = v40
    val v65: Vector[Vector[Double]] = v25(1)
    v3 = v3.updated(0, v18)
    v12 = v12.copy(p0 = v42)
    v17 = v17.copy(p1 = v65)
    var v140: Vector[s4] = v5
    var v60: s4 = v43
    v20 = v20.updated(1, v29)
    v22 = v22.copy(p0 = v28)
    v60 = v60.copy(p1 = v7)
    v40 = v140
    v18 = v18.copy(p0 = v75)
    v12 = v12.copy(p0 = v42)
    v60 = v60.copy(p0 = v18)
    v18 = v18.copy(p0 = v42)
    v60 = v60.copy(p1 = v9)
    v3 = v3.updated(2, v23)
    v60 = v0
    v23 = v23.copy(p0 = v42)
    v13 = v13.copy(p1 = v68)
    v22 = v22.copy(p0 = v1)
    v18 = v18.copy(p0 = v42)
    v33 = v33.updated(0, v28)
    v22 = v22.copy(p1 = v70)
    v60
  }
  def f18(v0: s0): s0 = {
    val v2: Vector[s0] = Vector(v0, v0, v0)
    val v4: s0 = v2(0)
    var v14: Vector[s0] = v2
    val v3: s0 = v2(2)
    val v12: s1 = s1(v4, v3)
    var v6: s1 = v12
    val v13: s0 = v2(0)
    var v9: Vector[s0] = v2
    v14 = v14.updated(2, v3)
    v6 = v6.copy(p0 = v3)
    var v42: s1 = v6
    val v50: s0 = v42.p1
    val v31: Vector[Vector[s0]] = Vector(v2, v2, v9, v14)
    v14 = v14.updated(1, v0)
    var v64: Vector[Vector[s0]] = v31
    val v169: Vector[s0] = v64(2)
    v6 = v6.copy(p0 = v13)
    v9 = v9.updated(0, v50)
    val v112: s4 = s4(v3, v169)
    val v157: s4 = f20(v112)
    val v128: s4 = f20(v157)
    val v105: s0 = v128.p0
    v105
  }
  @noinline
  def f0(v0: Vector[s1], v1: Vector[Vector[s3]], v2: Double): Double = {
    val v4: Vector[s3] = v1(0)
    var v6: Double = v2
    val v12: s3 = v4(0)
    val v18: Vector[s0] = v12.p1
    val v19: s0 = v18(2)
    val v21: s0 = f18(v19)
    val v10: Vector[Vector[Double]] = v21.p0
    var v44: Double = v6
    val v38: Vector[Double] = v10(0)
    val v69: Double = v38(0)
    var v85: Double = v69
    v85 = v69
    v85 = v44
    v85
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))))
    val v1: Vector[Vector[s3]] = Vector(Vector(s3(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))))), Vector(s3(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))))), Vector(s3(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))), Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))))))
    val v2: Double = 64.0
    val start = nanoTime()
    var result: Double = 64.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}