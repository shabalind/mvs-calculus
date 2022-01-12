import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: s1
  )
  def f93(v0: Vector[Double]): Vector[Double] = {
    val v6: Double = v0(0)
    val v4: Double = v6 * v6
    var v5: Vector[Double] = v0
    v5 = v5.updated(0, v4)
    v5
  }
  def f89(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    var v6: Vector[Vector[Double]] = v5
    val v2: Vector[Vector[Double]] = v0.p0
    val v7: Vector[Double] = v5(1)
    val v4: Double = v7(0)
    var v10: Vector[Vector[Double]] = v2
    v10 = v10.updated(0, v7)
    v10 = v10.updated(1, v7)
    v10 = v10.updated(0, v7)
    v6 = v6.updated(1, v7)
    var v18: Vector[Double] = v7
    val v3: Vector[Double] = v0.p1
    v10 = v10.updated(0, v18)
    v18 = v18.updated(0, v4)
    val v13: Vector[Double] = f93(v18)
    val v31: Vector[Double] = f93(v13)
    val v26: Vector[Double] = v6(0)
    val v51: Double = v26(0)
    v18 = v18.updated(0, v51)
    val v65: s0 = s0(v10, v3)
    v10 = v10.updated(1, v31)
    v65
  }
  def f6(v0: Double): Double = {
    var v2: Double = v0
    var v5: Double = v0
    var v3: Double = v0
    var v9: Double = v5
    var v1: Double = v3
    var v6: Double = v0
    var v8: Double = v6
    val v18: Double = v8 * v2
    var v14: Double = v1
    val v17: Vector[Double] = Vector(v2, v2, v18, v14, v9)
    var v16: Vector[Double] = v17
    v16 = v16.updated(4, v9)
    var v25: Vector[Double] = v17
    val v40: Double = v17(1)
    val v12: Double = v25(1)
    var v31: Vector[Double] = v17
    val v22: Vector[Vector[Double]] = Vector(v17, v17, v31, v25)
    var v41: Vector[Vector[Double]] = v22
    v16 = v16.updated(4, v6)
    var v27: Double = v5
    v41 = v41.updated(3, v16)
    val v26: Vector[Double] = v41(3)
    val v60: Vector[Double] = v41(2)
    var v38: Vector[Double] = v60
    v38 = v38.updated(1, v0)
    var v28: Vector[Vector[Double]] = v41
    var v47: Vector[Vector[Double]] = v22
    val v65: Vector[Double] = v47(0)
    val v43: Double = v38(3)
    val v52: Vector[Double] = v28(0)
    var v34: Double = v12
    var v51: Vector[Double] = v16
    var v56: Vector[Double] = v60
    val v121: Double = v52(4)
    var v54: Double = v40
    v25 = v25.updated(3, v43)
    v51 = v51.updated(1, v34)
    v25 = v25.updated(3, v27)
    v41 = v41.updated(0, v65)
    v56 = v56.updated(2, v18)
    var v61: Double = v40
    v41 = v41.updated(0, v26)
    val v106: Double = v121 + v27
    v25 = v25.updated(4, v12)
    v16 = v16.updated(0, v54)
    v47 = v47.updated(3, v51)
    v28 = v28.updated(2, v38)
    v41 = v41.updated(3, v56)
    v25 = v25.updated(4, v61)
    v106
  }
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: Vector[Vector[s2]], v2: Vector[Vector[s2]], v3: s0, v4: Double): Double = {
    val v6: Vector[s0] = Vector(v3, v3, v3, v3, v3, v3)
    val v7: Double = f6(v4)
    val v13: s0 = f89(v3)
    val v10: s0 = v6(4)
    val v28: s0 = f89(v13)
    val v37: Vector[Vector[Double]] = v28.p0
    val v31: Vector[Double] = v37(1)
    val v25: Vector[Double] = v10.p1
    var v23: Vector[Double] = v31
    val v59: Double = v7 - v4
    v23 = v23.updated(0, v4)
    val v41: Double = v23(0)
    val v55: Double = v25(1)
    var v108: Double = v55
    val v102: Double = v59 - v108
    v108 = v41
    v23 = v23.updated(0, v102)
    val v467: Double = v55 - v102
    v467
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(2.0, 3.0, 4.0))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(7.0, 8.0, 9.0))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(12.0, 13.0, 14.0)))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(17.0, 18.0, 19.0))), s1(Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(22.0, 23.0, 24.0))), Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(27.0, 28.0, 29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(32.0, 33.0, 34.0)))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(37.0, 38.0, 39.0)))), s1(Vector(Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(42.0, 43.0, 44.0))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(47.0, 48.0, 49.0))), Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(52.0, 53.0, 54.0)))), s0(Vector(Vector(55.0), Vector(56.0)), Vector(57.0, 58.0, 59.0))))))
    val v1: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(62.0, 63.0, 64.0)), s0(Vector(Vector(65.0), Vector(66.0)), Vector(67.0, 68.0, 69.0))), s0(Vector(Vector(70.0), Vector(71.0)), Vector(72.0, 73.0, 74.0)))), Vector(s2(Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(77.0, 78.0, 79.0)), s0(Vector(Vector(80.0), Vector(81.0)), Vector(82.0, 83.0, 84.0))), s0(Vector(Vector(85.0), Vector(86.0)), Vector(87.0, 88.0, 89.0)))))
    val v2: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(92.0, 93.0, 94.0)), s0(Vector(Vector(95.0), Vector(96.0)), Vector(97.0, 98.0, 99.0))), s0(Vector(Vector(100.0), Vector(101.0)), Vector(102.0, 103.0, 104.0)))), Vector(s2(Vector(s0(Vector(Vector(105.0), Vector(106.0)), Vector(107.0, 108.0, 109.0)), s0(Vector(Vector(110.0), Vector(111.0)), Vector(112.0, 113.0, 114.0))), s0(Vector(Vector(115.0), Vector(116.0)), Vector(117.0, 118.0, 119.0)))), Vector(s2(Vector(s0(Vector(Vector(120.0), Vector(121.0)), Vector(122.0, 123.0, 124.0)), s0(Vector(Vector(125.0), Vector(126.0)), Vector(127.0, 128.0, 129.0))), s0(Vector(Vector(130.0), Vector(131.0)), Vector(132.0, 133.0, 134.0)))))
    val v3: s0 = s0(Vector(Vector(135.0), Vector(136.0)), Vector(137.0, 138.0, 139.0))
    val v4: Double = 140.0
    val start = nanoTime()
    var result: Double = 140.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}