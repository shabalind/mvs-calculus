import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: s2
  )
  def f85(v0: Double): Double = {
    val v4: Vector[Double] = Vector(v0, v0)
    val v8: Double = v0 + v0
    val v2: Double = v4(1)
    var v5: Double = v2
    var v3: Double = v0
    var v1: Vector[Double] = v4
    v1 = v1.updated(1, v5)
    val v10: Double = v1(0)
    var v17: Vector[Double] = v4
    val v18: Double = v17(1)
    val v9: Double = v2 - v0
    val v11: Vector[Double] = Vector(v2, v3, v8, v8)
    val v36: Double = v11(1)
    var v40: Vector[Double] = v4
    val v28: Double = v11(1)
    var v15: Vector[Double] = v17
    var v50: Vector[Double] = v40
    val v27: Vector[Vector[Double]] = Vector(v1, v1, v50, v15, v15, v50)
    val v43: Vector[Vector[Vector[Double]]] = Vector(v27, v27, v27)
    v40 = v40.updated(0, v5)
    val v33: Double = v10 + v9
    var v26: Vector[Vector[Vector[Double]]] = v43
    v1 = v1.updated(0, v9)
    val v46: Vector[Vector[Double]] = v26(1)
    val v55: Vector[Vector[Double]] = v26(0)
    var v99: Vector[Vector[Vector[Double]]] = v43
    var v65: Vector[Vector[Double]] = v55
    v50 = v50.updated(0, v9)
    v99 = v99.updated(0, v46)
    v3 = v36
    v26 = v99
    v15 = v15.updated(1, v33)
    v50 = v50.updated(1, v9)
    val v101: Vector[Double] = v65(1)
    v50 = v50.updated(1, v18)
    v40 = v4
    var v141: Double = v28
    v50 = v50.updated(1, v141)
    val v256: Double = v101(1)
    v50 = v50.updated(0, v3)
    v256
  }
  @noinline
  def f0(v0: Vector[s2], v1: s3, v2: Double): Double = {
    val v9: Double = v2 / v2
    val v19: Double = f85(v9)
    val v30: Double = f85(v19)
    v30
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(1.0), Vector(Vector(2.0))), s0(Vector(Vector(3.0)), Vector(4.0), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(7.0), Vector(Vector(8.0)))), s0(Vector(Vector(9.0)), Vector(10.0), Vector(Vector(11.0)))), s1(Vector(s0(Vector(Vector(12.0)), Vector(13.0), Vector(Vector(14.0))), s0(Vector(Vector(15.0)), Vector(16.0), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(19.0), Vector(Vector(20.0)))), s0(Vector(Vector(21.0)), Vector(22.0), Vector(Vector(23.0)))), s1(Vector(s0(Vector(Vector(24.0)), Vector(25.0), Vector(Vector(26.0))), s0(Vector(Vector(27.0)), Vector(28.0), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(31.0), Vector(Vector(32.0)))), s0(Vector(Vector(33.0)), Vector(34.0), Vector(Vector(35.0))))), s0(Vector(Vector(36.0)), Vector(37.0), Vector(Vector(38.0)))))
    val v1: s3 = s3(Vector(s1(Vector(s0(Vector(Vector(39.0)), Vector(40.0), Vector(Vector(41.0))), s0(Vector(Vector(42.0)), Vector(43.0), Vector(Vector(44.0))), s0(Vector(Vector(45.0)), Vector(46.0), Vector(Vector(47.0)))), s0(Vector(Vector(48.0)), Vector(49.0), Vector(Vector(50.0))))), s2(Vector(s1(Vector(s0(Vector(Vector(51.0)), Vector(52.0), Vector(Vector(53.0))), s0(Vector(Vector(54.0)), Vector(55.0), Vector(Vector(56.0))), s0(Vector(Vector(57.0)), Vector(58.0), Vector(Vector(59.0)))), s0(Vector(Vector(60.0)), Vector(61.0), Vector(Vector(62.0)))), s1(Vector(s0(Vector(Vector(63.0)), Vector(64.0), Vector(Vector(65.0))), s0(Vector(Vector(66.0)), Vector(67.0), Vector(Vector(68.0))), s0(Vector(Vector(69.0)), Vector(70.0), Vector(Vector(71.0)))), s0(Vector(Vector(72.0)), Vector(73.0), Vector(Vector(74.0)))), s1(Vector(s0(Vector(Vector(75.0)), Vector(76.0), Vector(Vector(77.0))), s0(Vector(Vector(78.0)), Vector(79.0), Vector(Vector(80.0))), s0(Vector(Vector(81.0)), Vector(82.0), Vector(Vector(83.0)))), s0(Vector(Vector(84.0)), Vector(85.0), Vector(Vector(86.0))))), s0(Vector(Vector(87.0)), Vector(88.0), Vector(Vector(89.0)))))
    val v2: Double = 90.0
    val start = nanoTime()
    var result: Double = 90.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}