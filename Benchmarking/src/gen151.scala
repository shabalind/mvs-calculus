import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  def f17(v0: s0): s0 = {
    var v6: s0 = v0
    v6 = v0
    val v7: Vector[s0] = Vector(v0, v6, v6, v6, v0, v6, v0)
    var v9: Vector[s0] = v7
    val v4: s0 = v7(4)
    val v8: Vector[Vector[Double]] = v4.p0
    var v2: s0 = v0
    v9 = v9.updated(2, v2)
    val v1: Vector[Vector[Double]] = v0.p1
    var v11: s0 = v4
    v11 = v4
    var v13: s0 = v4
    v6 = v13
    val v21: s0 = s0(v1, v1)
    var v14: s0 = v11
    val v25: Vector[Vector[s0]] = Vector(v7, v9, v7, v7)
    v9 = v9.updated(5, v11)
    var v17: Vector[Vector[s0]] = v25
    v9 = v9.updated(1, v21)
    val v18: Vector[s0] = v17(3)
    var v30: Vector[Vector[Double]] = v8
    val v22: Vector[Double] = v1(0)
    val v36: Vector[Vector[Double]] = v6.p1
    v2 = v2.copy(p1 = v30)
    val v67: Vector[Vector[Double]] = v2.p0
    v6 = v6.copy(p0 = v1)
    v13 = v13.copy(p0 = v67)
    v9 = v7
    val v20: Vector[Vector[Double]] = v21.p1
    val v43: Vector[Vector[Double]] = v14.p0
    v9 = v9.updated(0, v13)
    var v51: Vector[s0] = v18
    val v23: s0 = v51(3)
    var v35: Vector[Vector[Double]] = v8
    val v74: Vector[Vector[Double]] = v4.p1
    v2 = v2.copy(p0 = v43)
    v35 = v35.updated(1, v22)
    val v54: Vector[Vector[Double]] = v4.p1
    v11 = v11.copy(p1 = v35)
    var v86: s0 = v23
    val v77: s0 = s0(v74, v54)
    v86 = v86.copy(p1 = v36)
    var v94: Vector[s0] = v51
    v6 = v6.copy(p0 = v20)
    v86 = v86.copy(p1 = v35)
    v17 = v17.updated(2, v94)
    v6 = v77
    v86
  }
  def f12(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Double] = v3(2)
    val v8: s0 = f17(v0)
    val v4: Vector[Vector[Double]] = v8.p0
    var v6: s0 = v0
    v6 = v6.copy(p1 = v4)
    val v12: Vector[Double] = v3(1)
    val v1: s0 = f17(v0)
    val v7: s0 = f17(v1)
    val v13: s0 = f17(v6)
    val v27: Vector[Double] = v4(2)
    v6 = v6.copy(p1 = v4)
    val v11: Double = v5(0)
    val v24: Vector[Vector[Double]] = v1.p1
    var v18: Vector[Double] = v12
    val v30: Vector[Vector[Double]] = v8.p0
    val v21: Vector[Double] = v30(0)
    val v29: s0 = f17(v7)
    var v50: s0 = v1
    val v15: Vector[Vector[Double]] = v8.p1
    val v34: Vector[Vector[Double]] = v29.p1
    val v37: Vector[Double] = v4(1)
    v6 = v6.copy(p1 = v24)
    var v47: Vector[Vector[Double]] = v34
    v6 = v6.copy(p1 = v24)
    v50 = v50.copy(p1 = v47)
    v47 = v47.updated(2, v5)
    v50 = v50.copy(p0 = v47)
    v6 = v6.copy(p0 = v15)
    var v53: s0 = v13
    val v41: Vector[Vector[Double]] = v53.p0
    v18 = v18.updated(0, v11)
    var v70: Vector[Vector[Double]] = v30
    val v36: Vector[Double] = v70(2)
    val v49: Vector[Double] = v4(0)
    v50 = v50.copy(p0 = v30)
    val v63: Vector[Vector[Double]] = Vector(v21, v37, v5, v18, v21, v12, v36)
    val v197: Vector[Double] = v63(4)
    val v124: s0 = f17(v50)
    v47 = v47.updated(1, v197)
    val v69: Vector[Vector[Double]] = v1.p1
    val v77: s0 = f17(v6)
    v47 = v47.updated(1, v5)
    v47 = v47.updated(1, v27)
    v53 = v53.copy(p0 = v34)
    val v148: Vector[Vector[Double]] = v77.p1
    val v156: s0 = f17(v124)
    val v242: Vector[Vector[Double]] = v156.p0
    val v108: s0 = s0(v242, v41)
    v53 = v53.copy(p0 = v148)
    v6 = v6.copy(p1 = v69)
    v70 = v70.updated(2, v49)
    v108
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v6: s2 = v0(1)
    val v4: s2 = v0(1)
    val v5: s0 = v4.p1
    val v14: Double = v1 / v1
    val v7: s0 = v6.p1
    var v19: s0 = v5
    val v29: Vector[Vector[Double]] = v7.p0
    val v12: s0 = f17(v19)
    val v70: s0 = f12(v19)
    val v33: Vector[Vector[Double]] = v70.p0
    val v39: s2 = v0(0)
    var v45: Vector[Vector[Double]] = v29
    val v52: Vector[Double] = v33(0)
    var v41: Vector[Double] = v52
    v19 = v19.copy(p1 = v45)
    val v74: s0 = v39.p1
    val v47: Vector[Vector[Double]] = v74.p0
    var v99: Vector[Double] = v41
    v41 = v41.updated(0, v14)
    var v62: s0 = v19
    v19 = v19.copy(p0 = v45)
    val v122: Vector[Vector[Double]] = v12.p0
    v62 = v62.copy(p0 = v122)
    val v87: Double = v41(0)
    v62 = v62.copy(p1 = v47)
    val v148: Vector[Double] = Vector(v87, v14)
    v45 = v45.updated(2, v99)
    val v108: Double = v148(1)
    v19 = v62
    v108
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), s2(Vector(Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))
    val v1: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}