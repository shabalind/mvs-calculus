import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s5 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[Vector[s5]], v1: Vector[s1], v2: s0, v3: Double): Double = {
    val v8: s1 = v1(0)
    val v6: s0 = v8.p0
    val v10: Vector[Vector[Double]] = v2.p3
    val v9: s1 = v1(0)
    val v13: s0 = v9.p1
    val v15: Vector[Double] = v10(0)
    val v52: Vector[Double] = v10(0)
    val v49: Vector[Vector[Double]] = v13.p2
    val v33: s5 = s5(v6, v13)
    val v38: s0 = v33.p0
    val v40: Vector[Vector[Double]] = v6.p1
    val v28: Vector[Vector[Double]] = v2.p4
    val v56: Vector[Vector[Double]] = v38.p3
    var v81: Vector[Vector[Double]] = v49
    val v108: Double = v15(0)
    val v111: s0 = s0(v108, v28, v81, v56, v40)
    val v123: Vector[Vector[Double]] = v111.p1
    var v160: s0 = v111
    v81 = v81.updated(1, v52)
    val v248: Double = v160.p0
    v160 = v160.copy(p1 = v123)
    v248
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s5]] = Vector(Vector(s5(s0(0.0, Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), s0(10.0, Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), Vector(s5(s0(20.0, Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(30.0, Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)), Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))))
    val v1: Vector[s1] = Vector(s1(s0(40.0, Vector(Vector(41.0), Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))), s0(50.0, Vector(Vector(51.0), Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))
    val v2: s0 = s0(60.0, Vector(Vector(61.0), Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)))
    val v3: Double = 70.0
    val start = nanoTime()
    var result: Double = 70.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}