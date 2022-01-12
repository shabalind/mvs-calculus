import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s3 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s4 (
    p0: s3
  )
  case class s5 (
    p0: Vector[Double],
    p1: s4
  )
  @noinline
  def f0(v0: Vector[s5], v1: Vector[Vector[s0]], v2: Vector[Vector[s3]], v3: Double): Double = {
    var v5: Vector[s5] = v0
    v5 = v0
    val v22: s5 = v5(0)
    val v13: Vector[Double] = v22.p0
    var v18: s5 = v22
    var v19: Vector[Double] = v13
    val v41: Double = v13(1)
    v18 = v18.copy(p0 = v13)
    v18 = v18.copy(p0 = v13)
    v19 = v19.updated(1, v41)
    var v43: s5 = v18
    v5 = v5.updated(0, v43)
    var v96: Vector[Double] = v19
    v18 = v18.copy(p0 = v96)
    v5 = v0
    val v145: s4 = v18.p1
    v43 = v43.copy(p1 = v145)
    v43 = v43.copy(p1 = v145)
    val v48: Vector[Double] = v43.p0
    v5 = v5.updated(0, v43)
    v18 = v18.copy(p1 = v145)
    val v71: Double = v48(0)
    v19 = v19.updated(2, v41)
    v71
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(Vector(0.0, 1.0, 2.0), s4(s3(Vector(Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0))))), Vector(s0(Vector(Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))))))), s5(Vector(18.0, 19.0, 20.0), s4(s3(Vector(Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0), Vector(25.0)))), Vector(s0(Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0), Vector(30.0))))), Vector(s0(Vector(Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0), Vector(40.0)))), Vector(s0(Vector(Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0), Vector(45.0)))), Vector(s0(Vector(Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0), Vector(50.0)))))
    val v2: Vector[Vector[s3]] = Vector(Vector(s3(Vector(Vector(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0), Vector(60.0))))), Vector(s0(Vector(Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))))), Vector(s3(Vector(Vector(s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0), Vector(70.0)))), Vector(s0(Vector(Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))))), Vector(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0), Vector(80.0)))))), Vector(s3(Vector(Vector(s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0), Vector(85.0)))), Vector(s0(Vector(Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0), Vector(90.0))))), Vector(s0(Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))))))
    val v3: Double = 96.0
    val start = nanoTime()
    var result: Double = 96.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}