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
  case class s3 (
    p0: Vector[s0],
    p1: s1
  )
  case class s7 (
    p0: Vector[s3],
    p1: Vector[Vector[s1]]
  )
  def f39(v0: s0, v1: Double): Double = {
    var v3: Double = v1
    val v8: Vector[Vector[Double]] = v0.p1
    val v2: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Double] = v8(1)
    var v10: s0 = v0
    v10 = v10.copy(p0 = v2)
    var v7: s0 = v10
    var v6: s0 = v7
    var v4: s0 = v10
    val v9: s0 = s0(v2, v8)
    val v13: Double = v1 + v1
    val v11: Vector[Vector[Double]] = v0.p0
    v10 = v10.copy(p0 = v11)
    val v22: Vector[Double] = v2(0)
    val v21: Double = v5(0)
    var v18: Vector[Double] = v22
    var v55: Double = v21
    var v23: s0 = v6
    val v14: s0 = s0(v8, v11)
    val v24: Vector[Vector[Double]] = v14.p1
    val v35: Double = v13 + v13
    val v44: Vector[Vector[Double]] = v23.p0
    var v26: Double = v1
    v18 = v18.updated(0, v3)
    val v17: Double = v18(0)
    val v27: Vector[Vector[Double]] = v9.p1
    val v33: Vector[Vector[Double]] = v4.p1
    val v34: Double = v26 + v35
    v18 = v18.updated(0, v26)
    val v32: Vector[Vector[Double]] = v10.p0
    v18 = v18.updated(0, v26)
    val v31: Vector[Double] = v32(1)
    val v25: Vector[Vector[Double]] = v23.p0
    v18 = v18.updated(0, v55)
    var v80: Vector[Double] = v5
    v23 = v23.copy(p1 = v27)
    v18 = v18.updated(0, v55)
    val v50: Vector[Double] = v24(1)
    v18 = v18.updated(0, v34)
    v26 = v55
    var v100: Double = v17
    var v49: Vector[Vector[Double]] = v33
    v7 = v7.copy(p1 = v25)
    var v58: Vector[Vector[Double]] = v2
    val v61: Vector[Vector[Double]] = v7.p0
    val v56: Vector[Double] = v61(1)
    v58 = v58.updated(1, v18)
    val v29: Vector[Vector[Double]] = v4.p1
    v58 = v58.updated(0, v31)
    v18 = v18.updated(0, v3)
    val v121: Double = v18(0)
    var v107: Double = v121
    v49 = v49.updated(1, v80)
    val v81: Double = v13 / v100
    v23 = v23.copy(p1 = v44)
    v10 = v10.copy(p1 = v29)
    val v75: Vector[Vector[Double]] = v7.p0
    v26 = v107
    val v148: Vector[Vector[Double]] = v9.p0
    val v86: Double = v56(0)
    var v130: Double = v86
    v7 = v7.copy(p1 = v58)
    val v122: Vector[Vector[Double]] = v7.p1
    v6 = v6.copy(p1 = v75)
    v58 = v58.updated(0, v80)
    v18 = v18.updated(0, v130)
    v49 = v49.updated(1, v31)
    v7 = v7.copy(p0 = v122)
    v58 = v58.updated(1, v50)
    v49 = v49.updated(1, v31)
    v80 = v80.updated(0, v55)
    v49 = v49.updated(0, v18)
    v23 = v23.copy(p1 = v49)
    v7 = v7.copy(p1 = v49)
    v4 = v4.copy(p0 = v148)
    v81
  }
  def f27(v0: Double): Double = {
    var v6: Double = v0
    var v7: Double = v6
    val v2: Vector[Double] = Vector(v7, v6, v7, v7, v6, v0, v7)
    val v4: Double = v2(2)
    val v32: Vector[Vector[Double]] = Vector(v2)
    var v16: Vector[Vector[Double]] = v32
    var v14: Vector[Vector[Double]] = v16
    val v15: Vector[Double] = v14(0)
    var v22: Vector[Double] = v15
    var v21: Vector[Vector[Double]] = v16
    v21 = v21.updated(0, v22)
    var v20: Vector[Double] = v22
    val v26: Double = v20(3)
    val v78: Vector[Double] = v32(0)
    v22 = v22.updated(6, v4)
    val v24: Double = v22(2)
    v6 = v26
    v14 = v14.updated(0, v78)
    v16 = v16.updated(0, v2)
    v20 = v20.updated(5, v24)
    v16 = v16.updated(0, v78)
    val v35: Vector[Double] = v21(0)
    v16 = v16.updated(0, v22)
    v14 = v14.updated(0, v78)
    v14 = v14.updated(0, v2)
    val v220: Double = v35(4)
    v220
  }
  @noinline
  def f0(v0: s7, v1: s0, v2: Double): Double = {
    val v3: Double = f39(v1, v2)
    val v19: Double = f27(v3)
    v19
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(Vector(s3(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), s1(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))))), Vector(Vector(s1(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))), Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))))), Vector(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0)))), Vector(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))))), Vector(s1(Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))))))
    val v1: s0 = s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)))
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