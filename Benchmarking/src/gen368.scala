import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: Vector[s2],
    p1: Vector[Vector[s0]]
  )
  case class s5 (
    p0: s4,
    p1: s3,
    p2: Vector[s0]
  )
  case class s6 (
    p0: s0
  )
  def f16(v0: s6): s6 = {
    val v2: Vector[s6] = Vector(v0, v0, v0, v0, v0, v0, v0)
    val v11: s0 = v0.p0
    var v26: Vector[s6] = v2
    val v23: s6 = v26(3)
    val v31: s6 = v2(6)
    var v43: Vector[s6] = v2
    var v57: Vector[s6] = v43
    v57 = v57.updated(3, v23)
    val v74: s6 = v43(0)
    val v69: s6 = v26(0)
    v26 = v26.updated(3, v31)
    val v58: s6 = v2(1)
    val v53: s6 = s6(v11)
    val v101: s6 = v57(1)
    v26 = v26.updated(4, v69)
    v43 = v43.updated(2, v53)
    v26 = v26.updated(3, v74)
    v43 = v43.updated(1, v58)
    v101
  }
  def f5(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    var v5: s0 = v0
    val v2: Vector[Vector[Double]] = v0.p0
    var v3: Vector[Vector[Double]] = v2
    var v1: s0 = v5
    val v7: Vector[Vector[Double]] = v5.p1
    v1 = v1.copy(p1 = v7)
    var v9: Vector[Vector[Double]] = v6
    val v18: s6 = s6(v0)
    val v30: Vector[Double] = v7(0)
    val v10: s6 = f16(v18)
    val v11: Vector[s6] = Vector(v18, v10, v18, v10, v18, v18)
    val v41: s0 = v10.p0
    val v47: s6 = v11(4)
    val v25: s6 = v11(4)
    var v17: s0 = v0
    v5 = v5.copy(p0 = v2)
    val v36: Vector[Vector[Vector[Double]]] = Vector(v3, v2, v2, v6, v6, v9)
    val v29: Vector[Double] = v6(0)
    v3 = v3.updated(1, v29)
    v3 = v3.updated(2, v30)
    v9 = v9.updated(2, v29)
    val v22: s0 = v25.p0
    val v67: s0 = v47.p0
    val v37: Vector[Double] = v7(0)
    v17 = v17.copy(p0 = v9)
    val v59: Vector[Vector[Double]] = v17.p1
    v9 = v9.updated(0, v29)
    var v52: s0 = v67
    v3 = v3.updated(2, v37)
    val v124: Vector[Vector[Double]] = v36(3)
    val v87: Vector[Double] = v59(0)
    v52 = v52.copy(p0 = v124)
    val v106: Vector[s0] = Vector(v0, v1, v22, v41, v17, v52, v22)
    v3 = v3.updated(2, v30)
    val v79: s0 = v106(4)
    v52 = v52.copy(p0 = v9)
    var v120: s0 = v79
    v3 = v3.updated(1, v87)
    v120
  }
  @noinline
  def f0(v0: s5, v1: Vector[s3], v2: s1, v3: Double): Double = {
    val v9: Vector[s0] = v2.p0
    var v11: Vector[s0] = v9
    val v20: s0 = v11(0)
    val v16: s0 = f5(v20)
    val v15: Vector[Vector[Double]] = v16.p1
    val v23: Vector[Double] = v15(0)
    v11 = v11.updated(0, v16)
    val v47: Double = v23(0)
    var v51: Vector[Double] = v23
    val v77: Double = v51(0)
    v51 = v51.updated(0, v47)
    v77
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s4(Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))), Vector(Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))), Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))))), s3(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))))), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))))
    val v1: Vector[s3] = Vector(s3(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))), Vector(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))))), s3(Vector(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))), Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))))), s3(Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))), Vector(Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))))))
    val v2: s1 = s1(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0)))), s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), Vector(Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))))))
    val v3: Double = 72.0
    val start = nanoTime()
    var result: Double = 72.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}