import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  def f36(v0: s2): s2 = {
    v0
  }
  def f31(v0: s2): s2 = {
    val v1: s2 = f36(v0)
    val v2: s2 = f36(v0)
    val v12: s2 = f36(v0)
    val v23: s2 = f36(v12)
    val v15: s2 = f36(v2)
    val v18: s2 = f36(v1)
    val v55: s2 = f36(v18)
    val v110: Vector[s2] = Vector(v55, v15, v23)
    val v69: s2 = v110(0)
    val v203: s2 = f36(v69)
    v203
  }
  def f24(v0: Vector[s2], v1: s2): Vector[s2] = {
    val v5: s2 = v0(0)
    var v7: Vector[s2] = v0
    val v9: s2 = f31(v5)
    v7 = v7.updated(0, v9)
    v7 = v7.updated(0, v1)
    v7 = v7.updated(0, v5)
    val v11: s2 = f36(v1)
    val v33: s2 = f36(v11)
    v7 = v7.updated(0, v1)
    val v14: s2 = f31(v33)
    val v18: s2 = f31(v33)
    v7 = v0
    val v39: s2 = f36(v14)
    val v34: s2 = f36(v18)
    v7 = v7.updated(0, v14)
    val v158: s2 = f31(v39)
    val v118: s2 = f36(v158)
    v7 = v7.updated(0, v118)
    v7 = v7.updated(0, v34)
    v7
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Vector[s2], v2: Double): Double = {
    val v5: s2 = v1(1)
    val v7: Vector[s2] = f24(v1, v5)
    val v4: s2 = v7(1)
    val v10: Vector[s0] = v4.p1
    val v26: s0 = v10(0)
    val v15: Vector[Vector[Double]] = v26.p1
    val v36: Vector[Double] = v15(2)
    val v46: Double = v36(0)
    v46
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))))), Vector(s1(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), Vector(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))))), Vector(s1(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))), Vector(Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))))
    val v1: Vector[s2] = Vector(s2(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))))), s2(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))))))
    val v2: Double = 76.0
    val start = nanoTime()
    var result: Double = 76.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}