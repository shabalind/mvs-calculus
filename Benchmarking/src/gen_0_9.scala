import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[s0]
  )
  def f91(v0: s0): s0 = {
    var v3: s0 = v0
    val v4: Vector[Vector[Double]] = v0.p2
    var v5: Vector[Vector[Double]] = v4
    v3 = v3.copy(p2 = v5)
    var v2: Vector[Vector[Double]] = v4
    val v6: Vector[Double] = v3.p1
    val v7: Vector[Double] = v5(1)
    v3 = v3.copy(p2 = v5)
    var v9: Vector[Double] = v6
    v5 = v5.updated(0, v7)
    v3 = v3.copy(p1 = v9)
    val v1: Vector[Double] = v2(0)
    v3 = v3.copy(p2 = v2)
    var v16: Vector[Double] = v7
    val v10: Vector[Double] = v3.p1
    val v15: Vector[Double] = v0.p1
    val v11: Vector[Vector[Double]] = v3.p0
    val v8: Vector[Double] = v11(0)
    var v12: Vector[Vector[Double]] = v11
    v12 = v12.updated(0, v16)
    val v14: s0 = s0(v11, v15, v2)
    var v19: Vector[Vector[Double]] = v12
    v3 = v3.copy(p0 = v12)
    val v18: Vector[Double] = v3.p1
    v3 = v3.copy(p1 = v10)
    v3 = v3.copy(p1 = v10)
    v19 = v19.updated(0, v8)
    v3 = v3.copy(p1 = v15)
    val v36: Vector[Vector[Double]] = v3.p0
    val v25: Vector[Double] = v0.p1
    v3 = v3.copy(p0 = v36)
    v3 = v3.copy(p2 = v2)
    var v40: Vector[Vector[Double]] = v36
    v3 = v3.copy(p0 = v19)
    v3 = v3.copy(p1 = v10)
    v19 = v19.updated(0, v1)
    v19 = v19.updated(0, v8)
    v3 = v3.copy(p1 = v18)
    v2 = v4
    val v44: Vector[Vector[Double]] = v14.p2
    var v48: Vector[Vector[Double]] = v40
    val v120: Vector[Vector[Double]] = v3.p0
    val v42: Vector[Vector[Double]] = v0.p0
    val v76: Vector[Double] = v2(1)
    v3 = v3.copy(p0 = v120)
    v3 = v3.copy(p2 = v2)
    v3 = v3.copy(p0 = v120)
    val v52: Vector[Vector[Double]] = v0.p2
    val v47: s0 = s0(v12, v18, v44)
    v12 = v42
    v3 = v3.copy(p0 = v48)
    v19 = v19.updated(0, v76)
    v3 = v3.copy(p1 = v18)
    v3 = v3.copy(p0 = v42)
    v3 = v3.copy(p2 = v52)
    var v64: Vector[Vector[Double]] = v5
    v3 = v3.copy(p0 = v19)
    v3 = v3.copy(p0 = v12)
    v3 = v3.copy(p1 = v25)
    v3 = v3.copy(p2 = v64)
    v47
  }
  def f70(v0: s1): s1 = {
    val v2: s0 = v0.p0
    val v6: s0 = f91(v2)
    val v4: s0 = f91(v6)
    val v11: Vector[Vector[s0]] = v0.p1
    val v36: Vector[s1] = Vector(v0, v0, v0, v0, v0, v0, v0)
    val v52: s1 = v36(6)
    var v29: s1 = v52
    v29 = v29.copy(p1 = v11)
    val v37: Vector[Vector[s0]] = v0.p1
    v29 = v29.copy(p1 = v37)
    v29 = v29.copy(p0 = v2)
    v29 = v29.copy(p0 = v4)
    v29
  }
  def f36(v0: s0): s0 = {
    val v7: Vector[Double] = v0.p1
    var v4: s0 = v0
    v4 = v4.copy(p1 = v7)
    v4 = v4.copy(p1 = v7)
    val v22: s0 = f91(v4)
    var v40: s0 = v22
    v40
  }
  def f7(v0: s1, v1: s0): s0 = {
    val v7: Vector[Double] = v1.p1
    var v8: s0 = v1
    val v12: s0 = f36(v8)
    val v21: s0 = f36(v12)
    v8 = v8.copy(p1 = v7)
    v21
  }
  @noinline
  def f0(v0: s3, v1: s1, v2: Double): Double = {
    val v9: s1 = f70(v1)
    val v10: s0 = v9.p0
    val v17: Vector[Vector[Double]] = v10.p0
    var v11: Vector[Vector[Double]] = v17
    val v21: Vector[Double] = v11(0)
    val v12: Vector[Double] = v11(0)
    val v24: s0 = f7(v9, v10)
    v11 = v17
    val v18: Vector[Double] = v17(0)
    val v36: Vector[Vector[Double]] = v24.p2
    var v31: Vector[Vector[Double]] = v36
    val v41: Vector[Double] = v31(1)
    val v104: Vector[Double] = v17(0)
    v11 = v11.updated(0, v41)
    v11 = v11.updated(0, v104)
    var v74: Vector[Double] = v21
    v11 = v17
    var v125: Vector[Double] = v18
    val v195: Double = v41(0)
    v11 = v11.updated(0, v12)
    v11 = v11.updated(0, v125)
    v31 = v31.updated(1, v12)
    v31 = v31.updated(0, v74)
    v195
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s2(Vector(s0(Vector(Vector(0.0)), Vector(1.0, 2.0), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0)), Vector(6.0, 7.0), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0)), Vector(11.0, 12.0), Vector(Vector(13.0), Vector(14.0)))), Vector(s1(s0(Vector(Vector(15.0)), Vector(16.0, 17.0), Vector(Vector(18.0), Vector(19.0))), Vector(Vector(s0(Vector(Vector(20.0)), Vector(21.0, 22.0), Vector(Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0)), Vector(26.0, 27.0), Vector(Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0)), Vector(31.0, 32.0), Vector(Vector(33.0), Vector(34.0)))))))), s2(Vector(s0(Vector(Vector(35.0)), Vector(36.0, 37.0), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(41.0, 42.0), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0)), Vector(46.0, 47.0), Vector(Vector(48.0), Vector(49.0)))), Vector(s1(s0(Vector(Vector(50.0)), Vector(51.0, 52.0), Vector(Vector(53.0), Vector(54.0))), Vector(Vector(s0(Vector(Vector(55.0)), Vector(56.0, 57.0), Vector(Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0)), Vector(61.0, 62.0), Vector(Vector(63.0), Vector(64.0)))), Vector(s0(Vector(Vector(65.0)), Vector(66.0, 67.0), Vector(Vector(68.0), Vector(69.0))))))))), Vector(s0(Vector(Vector(70.0)), Vector(71.0, 72.0), Vector(Vector(73.0), Vector(74.0)))))
    val v1: s1 = s1(s0(Vector(Vector(75.0)), Vector(76.0, 77.0), Vector(Vector(78.0), Vector(79.0))), Vector(Vector(s0(Vector(Vector(80.0)), Vector(81.0, 82.0), Vector(Vector(83.0), Vector(84.0)))), Vector(s0(Vector(Vector(85.0)), Vector(86.0, 87.0), Vector(Vector(88.0), Vector(89.0)))), Vector(s0(Vector(Vector(90.0)), Vector(91.0, 92.0), Vector(Vector(93.0), Vector(94.0))))))
    val v2: Double = 95.0
    val start = nanoTime()
    var result: Double = 95.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}