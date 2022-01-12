import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[s2]
  )
  case class s5 (
    p0: Vector[s2],
    p1: s2,
    p2: Vector[s3],
    p3: s2
  )
  case class s6 (
    p0: Vector[Vector[s5]],
    p1: s1
  )
  case class s7 (
    p0: s6,
    p1: s2
  )
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    val v6: s6 = v0.p0
    var v7: s6 = v6
    val v5: s1 = v7.p1
    val v8: s6 = v0.p0
    var v10: s1 = v5
    val v13: Vector[Vector[s5]] = v6.p0
    val v9: Vector[s5] = v13(0)
    val v18: Vector[s5] = v13(0)
    val v16: s5 = v18(0)
    val v23: s5 = v9(0)
    val v14: Vector[Vector[s5]] = v8.p0
    var v41: s5 = v16
    val v29: s2 = v41.p1
    val v40: Vector[s3] = v16.p2
    val v22: s2 = v23.p3
    val v21: Vector[s3] = v23.p2
    val v26: s0 = v10.p1
    val v48: Vector[Vector[Double]] = v26.p1
    v7 = v7.copy(p1 = v5)
    v7 = v7.copy(p0 = v13)
    v7 = v7.copy(p1 = v10)
    var v67: Vector[s3] = v21
    val v44: s5 = v9(0)
    val v49: Vector[Double] = v48(0)
    v41 = v16
    val v25: s3 = v21(0)
    v67 = v67.updated(0, v25)
    val v80: s3 = v40(0)
    val v32: Vector[Vector[Double]] = Vector(v49, v49, v49, v49, v49, v49)
    v7 = v7.copy(p0 = v13)
    val v37: Vector[Double] = v32(2)
    v67 = v67.updated(0, v80)
    val v34: Vector[s0] = v29.p0
    val v94: s0 = v34(0)
    val v66: s0 = v34(0)
    v41 = v44
    val v39: Vector[s2] = v80.p1
    v67 = v67.updated(0, v80)
    v10 = v10.copy(p0 = v94)
    val v72: s0 = v34(0)
    v41 = v41.copy(p1 = v22)
    v41 = v41.copy(p2 = v67)
    v7 = v7.copy(p0 = v14)
    val v62: s2 = v39(0)
    var v165: Vector[Vector[s5]] = v14
    v41 = v41.copy(p3 = v62)
    v10 = v10.copy(p1 = v72)
    val v91: Double = v37(0)
    v10 = v10.copy(p0 = v66)
    v7 = v7.copy(p1 = v5)
    v7 = v7.copy(p0 = v165)
    v91
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(s6(Vector(Vector(s5(Vector(s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))), s2(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), Vector(s3(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0)))), Vector(s2(Vector(s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))))))), s2(Vector(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0)))))))), s1(s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))))), s2(Vector(s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0)))), Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))), s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))))))
    val v1: Double = 75.0
    val start = nanoTime()
    var result: Double = 75.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}