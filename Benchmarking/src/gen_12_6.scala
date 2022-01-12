import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  def f120(v0: s0): s0 = {
    var v4: s0 = v0
    val v5: Vector[Vector[Double]] = v0.p0
    var v1: Vector[Vector[Double]] = v5
    val v6: Vector[Double] = v1(1)
    val v2: Vector[Vector[Double]] = v0.p2
    v4 = v4.copy(p0 = v5)
    val v3: Vector[Vector[Double]] = v4.p2
    var v7: Vector[Vector[Double]] = v3
    var v11: Vector[Double] = v6
    v4 = v4.copy(p0 = v1)
    val v18: Vector[Double] = v1(1)
    val v12: Vector[Vector[Double]] = v0.p1
    v7 = v7.updated(2, v11)
    v4 = v4.copy(p1 = v12)
    v4 = v4.copy(p1 = v12)
    val v45: Vector[Vector[Double]] = v0.p0
    var v16: s0 = v4
    v16 = v16.copy(p0 = v1)
    var v24: Vector[Vector[Double]] = v3
    val v13: Vector[Vector[Double]] = v16.p0
    v1 = v1.updated(1, v18)
    v16 = v16.copy(p2 = v3)
    v16 = v16.copy(p0 = v45)
    val v29: Vector[Vector[Vector[Double]]] = Vector(v12, v12)
    var v34: s0 = v0
    v24 = v24.updated(2, v11)
    val v23: Vector[Vector[Double]] = v29(1)
    val v22: Vector[Double] = v7(1)
    val v41: s0 = s0(v5, v12, v24)
    var v44: Vector[Vector[Vector[Double]]] = v29
    v16 = v16.copy(p2 = v24)
    val v40: s0 = s0(v13, v23, v7)
    val v35: Vector[Vector[Double]] = v34.p1
    var v28: Vector[Vector[Double]] = v23
    v4 = v4.copy(p1 = v12)
    val v30: Vector[Vector[Double]] = v40.p1
    v4 = v4.copy(p0 = v1)
    val v69: s0 = s0(v5, v28, v24)
    val v27: Vector[Vector[Double]] = v40.p1
    var v36: s0 = v41
    v28 = v27
    val v58: Vector[Vector[Double]] = v40.p1
    v36 = v36.copy(p2 = v2)
    var v64: s0 = v41
    v4 = v4.copy(p1 = v35)
    val v80: Vector[Vector[Double]] = v69.p0
    val v56: Vector[Vector[Double]] = v0.p1
    val v98: Vector[Vector[Double]] = v64.p0
    val v63: Vector[Vector[Double]] = v36.p1
    v64 = v64.copy(p1 = v58)
    v16 = v41
    v64 = v64.copy(p1 = v35)
    v36 = v36.copy(p0 = v45)
    v16 = v16.copy(p0 = v98)
    var v81: Vector[Vector[Double]] = v63
    val v173: Vector[Vector[Double]] = v44(0)
    v34 = v34.copy(p0 = v80)
    v4 = v4.copy(p1 = v173)
    v36 = v36.copy(p2 = v7)
    v4 = v4.copy(p1 = v56)
    v44 = v44.updated(1, v30)
    v28 = v28.updated(0, v22)
    v34 = v34.copy(p1 = v81)
    v64
  }
  def f71(v0: Vector[s2]): Vector[s2] = {
    v0
  }
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Double): Double = {
    val v4: Vector[s2] = v0(2)
    val v3: Vector[s2] = f71(v4)
    var v5: Vector[Vector[s2]] = v0
    var v12: Vector[s2] = v3
    var v13: Vector[Vector[s2]] = v5
    v13 = v13.updated(2, v4)
    val v10: Vector[s2] = v13(0)
    val v9: s2 = v10(0)
    val v28: s0 = v9.p1
    val v18: s0 = f120(v28)
    val v24: Vector[Vector[Double]] = v18.p1
    v5 = v5.updated(0, v10)
    v13 = v13.updated(2, v10)
    val v29: Vector[Double] = v24(0)
    var v33: Vector[s2] = v12
    v13 = v13.updated(1, v33)
    val v72: Double = v29(0)
    v72
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))))))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))))))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))), Vector(Vector(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))))))), s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))))))
    val v1: Double = 72.0
    val start = nanoTime()
    var result: Double = 72.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}