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
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  case class s5 (
    p0: s1,
    p1: s1
  )
  def f52(v0: s5): s5 = {
    val v7: s1 = v0.p1
    var v9: s1 = v7
    var v14: s1 = v9
    val v47: s1 = v0.p1
    val v159: s5 = s5(v14, v47)
    v159
  }
  def f49(v0: s2): s2 = {
    var v6: s2 = v0
    val v3: Vector[s0] = v0.p0
    val v27: Vector[s1] = v6.p1
    v6 = v6.copy(p1 = v27)
    v6 = v6.copy(p0 = v3)
    v6
  }
  def f46(v0: Vector[s1]): Vector[s1] = {
    v0
  }
  def f43(v0: s3): s3 = {
    val v5: s2 = v0.p1
    var v4: s2 = v5
    val v3: s3 = s3(v4, v5)
    var v68: s3 = v3
    v68
  }
  def f35(v0: s3): s3 = {
    val v1: s3 = f43(v0)
    var v35: s3 = v1
    v35
  }
  def f29(v0: s3): s3 = {
    var v6: s3 = v0
    var v5: s3 = v0
    val v7: s3 = f35(v6)
    var v1: s3 = v7
    val v4: s3 = f43(v1)
    val v2: s2 = v0.p1
    v1 = v1.copy(p1 = v2)
    val v8: s3 = f43(v7)
    val v10: s2 = f49(v2)
    v6 = v6.copy(p0 = v2)
    val v11: Vector[s0] = v2.p0
    val v12: s3 = f43(v5)
    var v9: s2 = v10
    var v14: s2 = v9
    val v25: s2 = v1.p0
    val v16: s2 = f49(v10)
    val v21: Vector[s2] = Vector(v14, v16, v9, v25, v2)
    val v30: s2 = v4.p1
    val v36: s2 = f49(v9)
    v5 = v8
    val v31: s3 = f43(v12)
    v6 = v6.copy(p0 = v36)
    val v33: Vector[s1] = v14.p1
    val v19: s2 = v21(0)
    val v26: s2 = v21(3)
    val v43: s2 = v7.p1
    v14 = v14.copy(p1 = v33)
    val v27: Vector[s1] = f46(v33)
    val v35: Vector[s1] = f46(v27)
    v9 = v9.copy(p0 = v11)
    val v39: s2 = v31.p0
    v6 = v6.copy(p1 = v39)
    val v54: s2 = v21(3)
    val v40: Vector[s0] = v30.p0
    v6 = v6.copy(p1 = v26)
    val v87: s2 = v31.p1
    val v47: Vector[s0] = v87.p0
    val v58: s2 = v31.p0
    v14 = v14.copy(p0 = v47)
    val v62: s2 = f49(v2)
    v1 = v1.copy(p0 = v62)
    v5 = v5.copy(p1 = v30)
    v9 = v9.copy(p1 = v35)
    v5 = v5.copy(p1 = v54)
    val v98: s2 = f49(v87)
    v1 = v1.copy(p0 = v58)
    v1 = v1.copy(p1 = v62)
    v5 = v5.copy(p0 = v98)
    val v66: s3 = s3(v43, v19)
    v9 = v9.copy(p0 = v40)
    val v182: s3 = f43(v66)
    v1 = v1.copy(p0 = v2)
    v182
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    var v3: Double = v1
    val v5: s3 = f29(v0)
    var v9: s3 = v5
    val v2: s2 = v9.p1
    val v13: Vector[s1] = v2.p1
    v9 = v9.copy(p0 = v2)
    var v28: Vector[s1] = v13
    val v20: s1 = v28(2)
    val v34: s1 = v28(0)
    var v26: s1 = v34
    val v33: s0 = v20.p0
    var v23: s1 = v34
    val v47: Vector[Double] = v33.p1
    val v60: Double = v47(1)
    v28 = v28.updated(0, v34)
    v23 = v20
    val v44: s5 = s5(v26, v20)
    val v30: Double = v60 + v3
    val v86: s5 = f52(v44)
    val v70: Double = v30 - v60
    val v61: s1 = v86.p0
    v28 = v28.updated(1, v23)
    v28 = v28.updated(0, v61)
    v70
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(2.0, 3.0, 4.0), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(10.0, 11.0, 12.0), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), Vector(s1(s0(Vector(Vector(16.0), Vector(17.0)), Vector(18.0, 19.0, 20.0), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(26.0, 27.0, 28.0), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), s1(s0(Vector(Vector(32.0), Vector(33.0)), Vector(34.0, 35.0, 36.0), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(42.0, 43.0, 44.0), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), s1(s0(Vector(Vector(48.0), Vector(49.0)), Vector(50.0, 51.0, 52.0), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0)), Vector(58.0, 59.0, 60.0), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))))), s2(Vector(s0(Vector(Vector(64.0), Vector(65.0)), Vector(66.0, 67.0, 68.0), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(74.0, 75.0, 76.0), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), Vector(s1(s0(Vector(Vector(80.0), Vector(81.0)), Vector(82.0, 83.0, 84.0), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0), Vector(89.0)), Vector(90.0, 91.0, 92.0), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))), s1(s0(Vector(Vector(96.0), Vector(97.0)), Vector(98.0, 99.0, 100.0), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s0(Vector(Vector(104.0), Vector(105.0)), Vector(106.0, 107.0, 108.0), Vector(Vector(109.0), Vector(110.0), Vector(111.0)))), s1(s0(Vector(Vector(112.0), Vector(113.0)), Vector(114.0, 115.0, 116.0), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0)), Vector(122.0, 123.0, 124.0), Vector(Vector(125.0), Vector(126.0), Vector(127.0)))))))
    val v1: Double = 128.0
    val start = nanoTime()
    var result: Double = 128.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}