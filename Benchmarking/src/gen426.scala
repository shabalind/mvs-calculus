import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1
  )
  case class s3 (
    p0: s1,
    p1: s0
  )
  def f90(v0: s0): s0 = {
    var v6: s0 = v0
    var v1: s0 = v0
    val v4: Vector[Vector[Double]] = v6.p0
    val v2: Vector[Vector[Double]] = v1.p0
    var v3: Vector[Vector[Double]] = v2
    v1 = v1.copy(p0 = v3)
    v6 = v6.copy(p0 = v4)
    val v11: Vector[Vector[Double]] = v0.p0
    v1 = v1.copy(p0 = v2)
    v6 = v6.copy(p0 = v2)
    val v39: Vector[Vector[Double]] = v6.p0
    v1 = v6
    val v29: Vector[Vector[Double]] = v1.p0
    v1 = v1.copy(p0 = v11)
    val v35: Vector[Vector[Double]] = v6.p0
    var v43: s0 = v1
    var v30: s0 = v43
    val v47: Vector[s0] = Vector(v30, v30, v43, v6, v0, v43, v43)
    val v66: s0 = v47(2)
    val v61: s0 = v47(0)
    v6 = v6.copy(p0 = v4)
    var v46: Vector[s0] = v47
    var v70: Vector[s0] = v46
    val v60: Vector[Vector[Double]] = v66.p0
    v6 = v6.copy(p0 = v29)
    val v63: s0 = v70(4)
    v6 = v30
    var v52: s0 = v43
    val v62: Vector[Vector[Double]] = v52.p0
    v30 = v30.copy(p0 = v4)
    val v201: Vector[Vector[Double]] = v1.p0
    v30 = v30.copy(p0 = v62)
    val v128: Vector[Vector[Double]] = v63.p0
    v52 = v52.copy(p0 = v39)
    var v99: s0 = v61
    v99 = v99.copy(p0 = v60)
    v6 = v6.copy(p0 = v201)
    v43 = v43.copy(p0 = v35)
    v1 = v1.copy(p0 = v128)
    v99
  }
  def f53(v0: Vector[s0]): Vector[s0] = {
    val v5: Vector[Vector[s0]] = Vector(v0, v0, v0, v0, v0, v0)
    val v3: Vector[Vector[Vector[s0]]] = Vector(v5)
    val v7: s0 = v0(0)
    val v2: s0 = v0(1)
    val v9: s0 = f90(v7)
    val v8: s0 = v0(1)
    var v6: Vector[s0] = v0
    v6 = v6.updated(1, v9)
    var v17: Vector[s0] = v0
    val v10: Vector[Vector[s0]] = v3(0)
    val v20: Vector[s0] = v10(2)
    v6 = v6.updated(0, v8)
    var v24: Vector[s0] = v20
    v24 = v24.updated(1, v2)
    var v32: Vector[s0] = v20
    val v33: s0 = v6(1)
    val v40: Vector[Vector[s0]] = Vector(v24, v0, v32, v20)
    val v79: s0 = v17(1)
    var v51: Vector[Vector[s0]] = v40
    val v41: Vector[s0] = v51(3)
    v32 = v32.updated(0, v33)
    v24 = v24.updated(1, v79)
    v41
  }
  def f49(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    val v8: s0 = f90(v0)
    val v18: s0 = f90(v0)
    val v12: s0 = f90(v8)
    val v67: s0 = f90(v18)
    var v45: s0 = v12
    val v81: s0 = f90(v45)
    v45 = v45.copy(p0 = v6)
    val v87: Vector[Vector[Double]] = v81.p0
    v45 = v45.copy(p0 = v87)
    v45 = v67
    v45
  }
  def f18(v0: s0): s0 = {
    var v5: s0 = v0
    val v1: Vector[Vector[Double]] = v5.p0
    val v4: Vector[Vector[Double]] = v0.p0
    val v6: Vector[Vector[Double]] = v0.p0
    v5 = v5.copy(p0 = v1)
    val v12: s0 = f49(v0)
    val v7: Vector[Double] = v6(0)
    val v9: Vector[Double] = v1(0)
    val v13: s0 = f90(v0)
    var v11: Vector[Vector[Double]] = v6
    val v8: Vector[Vector[Double]] = v13.p0
    v5 = v12
    val v15: Vector[Vector[Double]] = v13.p0
    val v10: Vector[Vector[Double]] = v13.p0
    v5 = v5.copy(p0 = v4)
    v5 = v5.copy(p0 = v11)
    val v23: Vector[Vector[Double]] = v13.p0
    val v30: s0 = s0(v15)
    v11 = v11.updated(0, v9)
    val v29: Vector[Double] = v6(0)
    var v24: Vector[Vector[Double]] = v8
    var v39: Vector[Vector[Double]] = v8
    val v16: Vector[Double] = v1(0)
    val v38: Vector[Vector[Vector[Double]]] = Vector(v24, v8, v11, v4, v11, v10)
    v24 = v24.updated(0, v9)
    val v48: Vector[Vector[Double]] = v30.p0
    val v27: Vector[Vector[Double]] = v5.p0
    val v73: Vector[Double] = v11(0)
    v24 = v24.updated(0, v29)
    v11 = v11.updated(0, v73)
    v5 = v5.copy(p0 = v39)
    var v41: Vector[Vector[Vector[Double]]] = v38
    var v43: Vector[Vector[Double]] = v23
    var v63: Vector[Vector[Double]] = v43
    val v53: Vector[Vector[Double]] = Vector(v16, v29, v9, v73, v73, v7)
    v41 = v38
    var v67: Vector[Vector[Double]] = v53
    val v70: Vector[Double] = v67(5)
    var v113: Vector[Vector[Double]] = v27
    val v110: Vector[Double] = v63(0)
    v113 = v113.updated(0, v29)
    val v85: s0 = f90(v0)
    v24 = v24.updated(0, v110)
    var v111: Vector[Vector[Double]] = v67
    v43 = v43.updated(0, v73)
    v43 = v43.updated(0, v7)
    v41 = v41.updated(5, v113)
    val v211: Vector[Vector[Double]] = v41(4)
    var v112: Vector[Double] = v16
    val v248: Vector[Vector[Double]] = v85.p0
    v111 = v111.updated(3, v70)
    v41 = v41.updated(3, v48)
    v43 = v43.updated(0, v7)
    val v88: s0 = s0(v211)
    v111 = v53
    val v170: Vector[Double] = v111(2)
    v111 = v111.updated(2, v112)
    v24 = v248
    v11 = v11.updated(0, v170)
    v88
  }
  def f5(v0: Vector[s0]): Vector[s0] = {
    val v3: Vector[s0] = f53(v0)
    val v4: Vector[s0] = f53(v0)
    val v5: s0 = v3(0)
    var v15: Vector[s0] = v0
    var v20: Vector[s0] = v15
    val v18: s0 = f18(v5)
    var v13: Vector[s0] = v20
    val v42: s0 = f18(v18)
    val v35: Vector[Vector[s0]] = Vector(v0, v3, v20, v13, v0)
    val v29: Vector[s0] = v35(3)
    val v51: s0 = f49(v18)
    val v44: s0 = v4(1)
    v20 = v20.updated(0, v44)
    v13 = v13.updated(1, v42)
    v15 = v15.updated(0, v51)
    v29
  }
  @noinline
  def f0(v0: Vector[s0], v1: s2, v2: Double): Double = {
    var v3: Double = v2
    val v6: Double = v3 / v3
    var v5: Vector[s0] = v0
    var v4: Double = v6
    val v9: s0 = v5(1)
    val v10: Vector[s0] = f5(v0)
    val v7: s1 = v1.p0
    v5 = v5.updated(0, v9)
    val v12: s3 = s3(v7, v9)
    val v18: s0 = v12.p1
    v5 = v5.updated(1, v9)
    val v16: Vector[Vector[Double]] = v18.p0
    v3 = v4
    val v69: s0 = v10(0)
    val v61: s0 = f90(v69)
    val v46: Vector[Double] = v16(0)
    v5 = v5.updated(1, v18)
    val v43: Vector[Double] = v16(0)
    val v45: Double = v46(0)
    var v59: Vector[Double] = v43
    val v37: Double = v59(0)
    v5 = v5.updated(1, v61)
    var v109: Double = v3
    v109 = v37
    v3 = v4
    val v152: Double = v3 + v45
    val v179: Double = v109 + v152
    v179
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0))), s0(Vector(Vector(1.0))))
    val v1: s2 = s2(s1(Vector(s0(Vector(Vector(2.0))), s0(Vector(Vector(3.0))), s0(Vector(Vector(4.0)))), Vector(Vector(s0(Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0)))), Vector(s0(Vector(Vector(7.0)))))))
    val v2: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}