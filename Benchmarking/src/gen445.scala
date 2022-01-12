import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[s0],
    p1: s1
  )
  case class s4 (
    p0: Vector[s1],
    p1: s0
  )
  case class s13 (
    p0: Vector[Vector[s1]],
    p1: Vector[Vector[s1]]
  )
  def f32(v0: s1): s1 = {
    var v3: s1 = v0
    var v1: s1 = v3
    val v7: Vector[Vector[s0]] = v3.p1
    val v5: Vector[Vector[s0]] = v3.p1
    val v9: Vector[s0] = v7(0)
    val v2: s0 = v9(0)
    v1 = v1.copy(p0 = v2)
    var v6: s1 = v0
    var v16: s0 = v2
    v1 = v1.copy(p1 = v5)
    var v15: Vector[s0] = v9
    var v11: s0 = v2
    v3 = v3.copy(p0 = v16)
    v15 = v15.updated(0, v11)
    val v12: s3 = s3(v15, v6)
    v15 = v15.updated(0, v11)
    v15 = v15.updated(0, v11)
    v15 = v15.updated(0, v2)
    v6 = v6.copy(p0 = v2)
    var v40: Vector[Vector[s0]] = v7
    var v54: s3 = v12
    v40 = v40.updated(0, v9)
    v1 = v1.copy(p1 = v5)
    val v58: s1 = v54.p1
    var v48: s3 = v12
    v3 = v3.copy(p1 = v5)
    v6 = v6.copy(p1 = v40)
    v40 = v40.updated(2, v9)
    v15 = v15.updated(0, v11)
    v1 = v58
    var v77: s1 = v1
    v48 = v48.copy(p1 = v77)
    v77 = v77.copy(p1 = v5)
    val v87: Vector[Vector[Double]] = v16.p1
    v3 = v58
    v16 = v16.copy(p1 = v87)
    val v166: s1 = v48.p1
    v166
  }
  def f30(v0: s1): s1 = {
    val v2: s1 = f32(v0)
    val v8: s1 = f32(v2)
    val v17: s1 = f32(v8)
    v17
  }
  @noinline
  def f0(v0: s3, v1: s4, v2: Vector[s13], v3: Double): Double = {
    val v6: s1 = v0.p1
    val v5: s1 = f30(v6)
    val v10: s1 = f30(v5)
    val v11: s0 = v10.p0
    val v35: Vector[Vector[Double]] = v11.p1
    val v19: Vector[Double] = v35(0)
    val v43: Vector[Double] = v35(1)
    val v179: Vector[Vector[Double]] = Vector(v19, v19, v43, v19)
    val v180: Vector[Double] = v179(0)
    val v150: Double = v180(0)
    v150
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), s1(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), Vector(Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))))))
    val v1: s4 = s4(Vector(s1(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))), Vector(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))))), s1(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))), Vector(Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0)))), Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))))), s1(s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))), Vector(Vector(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0)))), Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))))))), s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))))
    val v2: Vector[s13] = Vector(s13(Vector(Vector(s1(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0))), Vector(Vector(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0)))), Vector(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0)))), Vector(s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0)))))))), Vector(Vector(s1(s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0))), Vector(Vector(s0(Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), Vector(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0)))), Vector(s0(Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0), Vector(129.0))))))))))
    val v3: Double = 130.0
    val start = nanoTime()
    var result: Double = 130.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}