import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s2,
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: s1, v1: s3, v2: Double): Double = {
    var v5: s1 = v0
    var v8: s3 = v1
    val v3: Vector[s1] = v1.p1
    val v10: Vector[s1] = v8.p1
    val v11: s0 = v5.p1
    val v17: s1 = v10(1)
    var v33: Vector[s1] = v3
    val v13: s1 = v33(1)
    v5 = v5.copy(p1 = v11)
    val v14: Vector[Vector[Double]] = v11.p0
    v33 = v33.updated(1, v13)
    val v27: Vector[Vector[s0]] = v17.p0
    v5 = v5.copy(p1 = v11)
    val v22: s1 = v10(0)
    var v25: Vector[Vector[s0]] = v27
    v33 = v33.updated(0, v0)
    val v18: Vector[Double] = v14(0)
    val v29: Vector[s1] = v8.p1
    var v21: Vector[s1] = v29
    v33 = v33.updated(0, v17)
    val v60: s1 = v21(1)
    val v26: Double = v18(0)
    v5 = v5.copy(p0 = v25)
    v33 = v33.updated(0, v60)
    v33 = v33.updated(0, v60)
    v8 = v8.copy(p1 = v21)
    v21 = v21.updated(0, v5)
    v8 = v8.copy(p1 = v33)
    v33 = v33.updated(1, v22)
    v26
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))))
    val v1: s3 = s3(s2(s1(Vector(Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))), Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0)))), Vector(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0)))), Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))))), s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))))))), Vector(s1(Vector(Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0)))), Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0)))), Vector(s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0))))), s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0)))), s1(Vector(Vector(s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)))), Vector(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0)))), Vector(s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0))))), s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0))))))
    val v2: Double = 112.0
    val start = nanoTime()
    var result: Double = 112.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}