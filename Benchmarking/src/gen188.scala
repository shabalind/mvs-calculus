import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s4 (
    p0: Vector[s0],
    p1: s2
  )
  case class s7 (
    p0: Vector[s2],
    p1: s0
  )
  case class s8 (
    p0: s1,
    p1: s7
  )
  def f83(v0: Double): Double = {
    var v4: Double = v0
    var v6: Double = v4
    v6 = v4
    var v7: Double = v6
    val v1: Vector[Double] = Vector(v4, v7, v4)
    var v11: Vector[Double] = v1
    v11 = v11.updated(2, v6)
    v11 = v11.updated(1, v7)
    val v5: Double = v11(0)
    val v10: Double = v1(2)
    val v17: Double = v1(1)
    val v12: Double = v11(0)
    v11 = v11.updated(1, v5)
    val v9: Double = v1(0)
    val v21: Vector[Vector[Double]] = Vector(v1, v1, v1, v1, v11)
    v11 = v11.updated(2, v12)
    var v35: Vector[Vector[Double]] = v21
    v11 = v11.updated(2, v17)
    val v31: Vector[Double] = v35(3)
    var v18: Vector[Double] = v31
    var v14: Vector[Double] = v18
    v18 = v18.updated(0, v9)
    v35 = v35.updated(3, v31)
    var v37: Vector[Double] = v14
    v37 = v37.updated(1, v10)
    val v34: Double = v37(2)
    v34
  }
  @noinline
  def f0(v0: Vector[s8], v1: Vector[Vector[s4]], v2: Double): Double = {
    val v12: Double = f83(v2)
    var v33: Double = v12
    v33
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s7(Vector(s2(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), s2(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s2(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))))))
    val v1: Vector[Vector[s4]] = Vector(Vector(s4(Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), s2(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))))), Vector(s4(Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0))), s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)))), s2(s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0)))))), Vector(s4(Vector(s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0))), s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), s2(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0)))))))
    val v2: Double = 78.0
    val start = nanoTime()
    var result: Double = 78.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}