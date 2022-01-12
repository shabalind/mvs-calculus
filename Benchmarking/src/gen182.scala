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
    p0: s0,
    p1: Vector[s1]
  )
  case class s8 (
    p0: s2,
    p1: Vector[Vector[s1]]
  )
  case class s9 (
    p0: Vector[s0],
    p1: s8
  )
  def f11(v0: Double): Double = {
    var v6: Double = v0
    var v1: Double = v6
    var v7: Double = v1
    var v9: Double = v0
    var v5: Double = v6
    var v10: Double = v6
    var v12: Double = v5
    var v8: Double = v10
    var v14: Double = v9
    var v17: Double = v7
    var v13: Double = v8
    val v25: Vector[Double] = Vector(v14, v17, v0, v12, v13, v17)
    var v33: Vector[Double] = v25
    val v22: Vector[Vector[Double]] = Vector(v25, v33, v33)
    val v52: Vector[Double] = v22(0)
    val v70: Double = v52(0)
    v70
  }
  @noinline
  def f0(v0: Vector[s9], v1: Double): Double = {
    var v5: Double = v1
    val v15: Double = f11(v5)
    val v20: Double = f11(v1)
    var v22: Double = v5
    val v54: Double = f11(v22)
    val v29: Double = v1 + v20
    v22 = v15
    val v42: Double = f11(v54)
    val v78: Double = f11(v42)
    v22 = v29
    val v198: Double = f11(v78)
    v198
  }
  def benchmark(): Unit = {
    val v0: Vector[s9] = Vector(s9(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), s8(s2(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))), s1(Vector(Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))), Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0)))), s1(Vector(Vector(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))), Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))))), s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)))), Vector(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0)))), Vector(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0)))), Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0)))), Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0))))), s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0)))))))))
    val v1: Double = 92.0
    val start = nanoTime()
    var result: Double = 92.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}