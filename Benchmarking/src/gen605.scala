import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  case class s7 (
    p0: s1,
    p1: Vector[s3]
  )
  def f70(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p0
    var v2: Vector[Vector[Double]] = v1
    val v4: Vector[Double] = v1(0)
    val v5: Double = v4(0)
    val v6: Vector[Double] = v2(1)
    val v7: Vector[Double] = v1(0)
    v2 = v2.updated(1, v7)
    var v15: Double = v5
    var v27: Double = v5
    var v17: Vector[Double] = v6
    val v9: Double = v27 + v27
    val v10: Double = v9 / v15
    v2 = v2.updated(0, v7)
    val v14: Vector[Double] = v0.p1
    v2 = v2.updated(1, v14)
    val v40: Vector[Vector[Double]] = v0.p0
    val v24: s0 = s0(v40, v17)
    val v26: Double = v15 + v27
    var v23: Double = v26
    val v66: Double = v4(0)
    v17 = v17.updated(0, v26)
    val v32: s0 = s0(v2, v4)
    v17 = v17.updated(0, v66)
    val v57: Vector[Vector[Double]] = v32.p0
    var v63: s0 = v24
    v63 = v63.copy(p0 = v2)
    v17 = v17.updated(0, v23)
    v15 = v10
    v63 = v63.copy(p0 = v57)
    v63
  }
  def f68(v0: s0): s0 = {
    var v2: s0 = v0
    val v3: Vector[Vector[Double]] = v2.p0
    val v4: Vector[Double] = v3(1)
    val v5: s0 = f70(v0)
    val v7: Vector[Double] = v3(0)
    val v1: Vector[Double] = v5.p1
    val v9: Vector[Vector[Double]] = v5.p0
    var v8: Vector[Vector[Double]] = v3
    v2 = v2.copy(p0 = v9)
    val v6: Vector[Double] = v3(1)
    val v10: s0 = f70(v0)
    val v17: Vector[Double] = v10.p1
    v2 = v2.copy(p1 = v1)
    val v11: Double = v1(0)
    val v15: Vector[Vector[Double]] = v0.p0
    var v13: Vector[Vector[Double]] = v3
    val v18: Vector[Double] = v5.p1
    v2 = v2.copy(p0 = v3)
    val v14: s0 = f70(v0)
    v2 = v2.copy(p1 = v17)
    v13 = v13.updated(1, v6)
    val v22: s0 = s0(v8, v4)
    v2 = v2.copy(p1 = v17)
    val v31: s0 = f70(v2)
    val v23: s0 = f70(v0)
    val v43: s0 = f70(v31)
    var v24: Vector[Double] = v1
    val v21: Double = v18(0)
    v8 = v8.updated(1, v7)
    val v25: Vector[Vector[Double]] = v22.p0
    var v27: s0 = v23
    val v39: s0 = f70(v2)
    val v28: Vector[Double] = v0.p1
    val v29: Double = v24(0)
    val v35: Vector[Vector[Double]] = v39.p0
    v2 = v2.copy(p1 = v4)
    v27 = v27.copy(p0 = v8)
    val v46: s0 = f70(v43)
    v13 = v13.updated(0, v28)
    val v59: Vector[Double] = v35(0)
    v2 = v2.copy(p0 = v13)
    var v48: Vector[Vector[Double]] = v13
    val v52: Vector[Double] = v48(0)
    val v51: Vector[Vector[Double]] = v2.p0
    val v122: s0 = f70(v23)
    v27 = v27.copy(p1 = v28)
    var v33: Vector[Vector[Double]] = v9
    v27 = v27.copy(p0 = v25)
    val v60: Vector[Double] = v122.p1
    val v65: Vector[Vector[Double]] = v10.p0
    val v92: Vector[Double] = v2.p1
    var v40: Vector[Double] = v7
    val v133: Vector[Double] = v46.p1
    val v78: s0 = f70(v27)
    v13 = v13.updated(0, v133)
    v33 = v33.updated(0, v40)
    val v93: s0 = f70(v2)
    var v90: Vector[Vector[Double]] = v8
    val v66: s0 = f70(v0)
    v27 = v27.copy(p1 = v28)
    val v49: Vector[Double] = v51(1)
    var v71: Vector[Double] = v18
    val v44: Vector[Vector[Double]] = Vector(v52, v59, v71, v24)
    val v72: Vector[Double] = v93.p1
    val v85: Vector[Double] = v44(0)
    v90 = v90.updated(1, v85)
    v2 = v2.copy(p1 = v40)
    v27 = v27.copy(p0 = v15)
    v48 = v48.updated(0, v40)
    var v57: Vector[Double] = v72
    val v83: Vector[Double] = v65(1)
    v48 = v48.updated(0, v57)
    val v150: Double = v92(0)
    val v63: s0 = f70(v14)
    v2 = v2.copy(p0 = v3)
    v71 = v71.updated(0, v150)
    var v117: Double = v11
    val v107: Double = v83(0)
    v24 = v24.updated(0, v29)
    v27 = v27.copy(p1 = v7)
    v27 = v27.copy(p0 = v90)
    v90 = v8
    v27 = v27.copy(p1 = v60)
    v27 = v27.copy(p0 = v15)
    var v219: Vector[Vector[Double]] = v35
    v27 = v27.copy(p0 = v8)
    var v165: Vector[Vector[Double]] = v33
    val v469: Vector[Vector[Double]] = v66.p0
    val v115: Vector[Double] = v63.p1
    v57 = v49
    v27 = v27.copy(p1 = v17)
    v40 = v40.updated(0, v21)
    v71 = v71.updated(0, v117)
    v27 = v27.copy(p0 = v219)
    val v211: s0 = f70(v78)
    v40 = v40.updated(0, v107)
    v27 = v27.copy(p0 = v469)
    v27 = v27.copy(p1 = v115)
    v2 = v2.copy(p0 = v165)
    v2 = v2.copy(p0 = v33)
    v211
  }
  @noinline
  def f0(v0: s3, v1: s7, v2: Double): Double = {
    val v9: s1 = v1.p0
    val v5: Vector[s1] = Vector(v9)
    val v12: s1 = v5(0)
    val v14: Vector[s0] = v12.p0
    val v35: s0 = v14(0)
    val v52: s0 = f68(v35)
    val v38: Vector[Vector[Double]] = v52.p0
    val v97: Vector[Double] = v38(1)
    var v155: Vector[Vector[Double]] = v38
    val v27: Vector[Double] = v155(0)
    v155 = v155.updated(1, v97)
    val v71: Double = v27(0)
    v71
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(2.0)), Vector(Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(5.0))))), s2(s0(Vector(Vector(6.0), Vector(7.0)), Vector(8.0)), Vector(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(11.0))))))
    val v1: s7 = s7(s1(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(17.0))), Vector(s3(s2(s0(Vector(Vector(18.0), Vector(19.0)), Vector(20.0)), Vector(Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(23.0))))), s2(s0(Vector(Vector(24.0), Vector(25.0)), Vector(26.0)), Vector(Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(29.0)))))), s3(s2(s0(Vector(Vector(30.0), Vector(31.0)), Vector(32.0)), Vector(Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(35.0))))), s2(s0(Vector(Vector(36.0), Vector(37.0)), Vector(38.0)), Vector(Vector(s0(Vector(Vector(39.0), Vector(40.0)), Vector(41.0))))))))
    val v2: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}