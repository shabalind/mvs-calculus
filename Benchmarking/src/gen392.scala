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
    p1: s1
  )
  def f110(v0: s1, v1: s1): s1 = {
    var v6: s1 = v0
    var v3: s1 = v6
    var v7: s1 = v1
    val v8: s0 = v3.p1
    val v11: s0 = v7.p1
    val v4: Vector[s1] = Vector(v6, v6, v7, v3, v0)
    var v10: s0 = v8
    v6 = v6.copy(p1 = v11)
    var v18: Vector[s1] = v4
    val v13: s1 = v18(2)
    val v20: Vector[Vector[Double]] = v8.p1
    v6 = v6.copy(p1 = v8)
    v10 = v10.copy(p1 = v20)
    v3 = v3.copy(p1 = v11)
    v6 = v6.copy(p1 = v10)
    v10 = v10.copy(p0 = v20)
    v18 = v18.updated(1, v6)
    v13
  }
  def f104(v0: s1): s1 = {
    val v7: s0 = v0.p1
    var v1: s1 = v0
    val v6: s1 = f110(v1, v0)
    v1 = v1.copy(p1 = v7)
    var v3: s1 = v6
    val v11: s1 = f110(v3, v0)
    val v9: s1 = f110(v6, v0)
    val v22: s1 = f110(v1, v9)
    val v20: s1 = f110(v22, v9)
    val v38: s1 = f110(v20, v9)
    var v23: s1 = v11
    val v61: s1 = f110(v23, v38)
    v61
  }
  @noinline
  def f0(v0: s2, v1: Vector[s2], v2: Double): Double = {
    val v7: s1 = v0.p1
    val v6: s1 = f104(v7)
    val v9: s0 = v6.p0
    val v10: Vector[Vector[Double]] = v9.p0
    var v17: Vector[Vector[Double]] = v10
    val v22: Vector[Double] = v10(0)
    val v20: Vector[Double] = v17(1)
    v17 = v17.updated(0, v20)
    var v56: Vector[Vector[Double]] = v17
    v17 = v17.updated(1, v22)
    val v37: Double = v20(0)
    var v67: Vector[Double] = v22
    v56 = v56.updated(0, v20)
    v17 = v56
    v56 = v56.updated(0, v67)
    val v104: Double = v37 / v37
    v104
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))))
    val v1: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))), s1(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))), s2(Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))), s1(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))), s2(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0)))), s1(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))))))
    val v2: Double = 80.0
    val start = nanoTime()
    var result: Double = 80.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}