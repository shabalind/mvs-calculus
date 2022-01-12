import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s3 (
    p0: s0
  )
  case class s4 (
    p0: Vector[s3],
    p1: Double
  )
  case class s5 (
    p0: Vector[s4],
    p1: Vector[Vector[s3]]
  )
  def f111(v0: s4): s4 = {
    var v4: s4 = v0
    var v3: s4 = v4
    var v6: s4 = v0
    val v8: Double = v3.p1
    var v12: s4 = v3
    val v7: Double = v3.p1
    var v1: s4 = v4
    val v9: Vector[s3] = v3.p0
    v6 = v6.copy(p1 = v8)
    val v13: Vector[s3] = v6.p0
    val v11: s4 = s4(v13, v8)
    v3 = v3.copy(p1 = v7)
    val v2: s3 = v9(2)
    var v10: Double = v7
    var v25: Vector[s3] = v13
    var v15: s4 = v11
    var v16: Double = v7
    v4 = v4.copy(p1 = v10)
    val v20: Vector[s3] = v12.p0
    v4 = v4.copy(p0 = v20)
    var v17: s3 = v2
    v15 = v15.copy(p0 = v25)
    v25 = v25.updated(2, v2)
    v12 = v12.copy(p1 = v16)
    v3 = v3.copy(p0 = v13)
    v25 = v25.updated(2, v17)
    val v50: s0 = v17.p0
    v1 = v1.copy(p0 = v9)
    val v56: Double = v4.p1
    v17 = v17.copy(p0 = v50)
    v4 = v4.copy(p1 = v56)
    val v55: Vector[s3] = v1.p0
    v15 = v15.copy(p1 = v56)
    val v116: Double = v11.p1
    v3 = v3.copy(p1 = v116)
    v15 = v15.copy(p0 = v55)
    v3 = v6
    val v97: Double = v15.p1
    v3 = v3.copy(p1 = v97)
    v15
  }
  def f83(v0: s4): s4 = {
    var v5: s4 = v0
    val v2: s4 = f111(v5)
    val v7: Vector[s4] = Vector(v0, v0, v0, v0, v0, v0, v5)
    val v6: Vector[Vector[s4]] = Vector(v7, v7, v7, v7, v7)
    val v3: Vector[s3] = v2.p0
    val v4: Vector[s4] = v6(2)
    v5 = v5.copy(p0 = v3)
    val v15: s4 = v4(3)
    v5 = v5.copy(p0 = v3)
    val v75: s4 = f111(v2)
    val v34: s4 = f111(v75)
    var v39: s4 = v34
    v5 = v39
    var v74: s4 = v15
    v74
  }
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    val v4: s5 = v0(0)
    val v3: Vector[s4] = v4.p0
    val v12: s4 = v3(2)
    val v5: Double = v12.p1
    val v14: s4 = f83(v12)
    val v13: s4 = v3(2)
    val v16: Vector[Double] = Vector(v5)
    var v19: s4 = v14
    val v10: Double = v16(0)
    v19 = v13
    val v44: Double = v19.p1
    var v62: Double = v44
    var v73: Double = v10
    v19 = v19.copy(p1 = v73)
    v62
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(Vector(s4(Vector(s3(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), s3(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), s3(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), 15.0), s4(Vector(s3(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0)))), s3(s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0)))), s3(s0(Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0))))), 31.0), s4(Vector(s3(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0)))), s3(s0(Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))), s3(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0))))), 47.0)), Vector(Vector(s3(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0))))), Vector(s3(s0(Vector(Vector(53.0), Vector(54.0), Vector(55.0)), Vector(Vector(56.0), Vector(57.0))))))), s5(Vector(s4(Vector(s3(s0(Vector(Vector(58.0), Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0)))), s3(s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0)))), s3(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0), Vector(72.0))))), 73.0), s4(Vector(s3(s0(Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0)))), s3(s0(Vector(Vector(79.0), Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0)))), s3(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0))))), 89.0), s4(Vector(s3(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)))), s3(s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)))), s3(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))))), 105.0)), Vector(Vector(s3(s0(Vector(Vector(106.0), Vector(107.0), Vector(108.0)), Vector(Vector(109.0), Vector(110.0))))), Vector(s3(s0(Vector(Vector(111.0), Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0))))))))
    val v1: Double = 116.0
    val start = nanoTime()
    var result: Double = 116.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}