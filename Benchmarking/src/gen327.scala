import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: Vector[Vector[s1]],
    p2: Vector[Vector[s0]]
  )
  case class s4 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s9 (
    p0: s4,
    p1: s1
  )
  def f28(v0: Double): Double = {
    val v1: Double = v0 * v0
    var v2: Double = v1
    var v4: Double = v2
    var v19: Double = v4
    var v16: Double = v19
    v16
  }
  @noinline
  def f0(v0: s9, v1: s2, v2: Vector[Double], v3: Double): Double = {
    var v6: Vector[Double] = v2
    val v5: Vector[Vector[Double]] = Vector(v6)
    var v4: Vector[Vector[Double]] = v5
    val v20: Double = v2(0)
    val v15: Vector[Double] = v4(0)
    v6 = v6.updated(0, v20)
    val v14: Double = v6(0)
    var v18: Vector[Double] = v15
    var v48: Double = v3
    v18 = v18.updated(0, v3)
    val v36: Double = f28(v48)
    v6 = v6.updated(0, v36)
    val v45: Vector[Double] = v5(0)
    v4 = v4.updated(0, v45)
    val v52: Double = v36 * v14
    v6 = v6.updated(0, v36)
    val v27: Double = v2(0)
    val v164: Double = v3 / v20
    val v73: Double = f28(v20)
    v6 = v18
    val v99: Double = v27 + v36
    val v68: Vector[Double] = Vector(v73, v52, v14, v164, v14)
    v18 = v18.updated(0, v99)
    val v65: Double = v68(3)
    v65
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(s4(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))))
    val v1: s2 = s2(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), Vector(Vector(s1(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))))), Vector(s1(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))))))), Vector(Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0)))), Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))))
    val v2: Vector[Double] = Vector(84.0)
    val v3: Double = 85.0
    val start = nanoTime()
    var result: Double = 85.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}