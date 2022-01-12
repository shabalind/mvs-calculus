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
    p0: Vector[s1],
    p1: Vector[s0]
  )
  def f11(v0: Double): Double = {
    var v1: Double = v0
    var v7: Double = v1
    var v6: Double = v0
    v1 = v7
    var v2: Double = v6
    var v4: Double = v0
    val v3: Vector[Double] = Vector(v0, v4)
    var v10: Double = v7
    var v5: Double = v6
    var v13: Double = v2
    var v17: Vector[Double] = v3
    var v11: Vector[Double] = v3
    val v21: Double = v3(0)
    val v14: Double = v17(0)
    var v16: Vector[Double] = v17
    var v46: Vector[Double] = v3
    v2 = v13
    v16 = v16.updated(0, v1)
    val v12: Double = v11(0)
    var v27: Double = v7
    v11 = v11.updated(1, v27)
    v17 = v17.updated(1, v14)
    var v38: Vector[Double] = v3
    val v28: Vector[Vector[Double]] = Vector(v17, v3, v46, v38, v17, v16)
    v46 = v46.updated(1, v21)
    v46 = v16
    v6 = v10
    val v69: Vector[Double] = v28(3)
    val v75: Double = v5 * v2
    v7 = v75
    v46 = v46.updated(1, v12)
    val v37: Double = v69(1)
    v37
  }
  @noinline
  def f0(v0: Vector[s1], v1: s2, v2: Double): Double = {
    val v8: Double = f11(v2)
    val v17: Double = v8 * v8
    v17
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), s1(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), s1(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))
    val v1: s2 = s2(Vector(s1(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), s1(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)))), s1(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0)))))
    val v2: Double = 65.0
    val start = nanoTime()
    var result: Double = 65.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}