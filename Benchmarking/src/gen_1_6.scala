import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0],
    p2: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  def f4(v0: Vector[s0]): Vector[s0] = {
    val v2: s0 = v0(0)
    val v7: s0 = v0(0)
    val v6: s0 = v0(0)
    val v3: Vector[Vector[Double]] = v7.p1
    var v9: s0 = v2
    var v14: Vector[s0] = v0
    v14 = v0
    val v15: Vector[Vector[Double]] = v2.p0
    v9 = v9.copy(p1 = v3)
    val v27: Vector[Vector[Double]] = v6.p0
    val v16: Vector[Vector[Double]] = v9.p1
    v9 = v9.copy(p1 = v16)
    v14 = v14.updated(0, v9)
    v9 = v9.copy(p0 = v27)
    v9 = v9.copy(p0 = v15)
    v14 = v14.updated(0, v7)
    var v53: Vector[s0] = v14
    v53 = v14
    v9 = v9.copy(p0 = v15)
    v53
  }
  @noinline
  def f0(v0: Vector[s2], v1: Vector[Vector[s0]], v2: Double): Double = {
    var v8: Vector[Vector[s0]] = v1
    val v4: Vector[s0] = v8(0)
    val v12: Vector[s0] = f4(v4)
    val v11: Vector[Double] = Vector(v2)
    var v3: Vector[Double] = v11
    val v13: Double = v3(0)
    val v20: Vector[s0] = f4(v4)
    var v29: Vector[Double] = v11
    val v26: Vector[s0] = f4(v20)
    val v24: Double = v2 / v2
    v29 = v29.updated(0, v13)
    var v27: Double = v2
    val v16: Vector[s0] = f4(v12)
    v8 = v8.updated(0, v16)
    val v40: Vector[Double] = Vector(v24)
    v3 = v3.updated(0, v2)
    v3 = v3.updated(0, v27)
    val v83: s0 = v26(0)
    val v46: Vector[s0] = f4(v4)
    val v53: Double = v29(0)
    var v87: Double = v53
    val v90: Vector[Vector[Double]] = v83.p0
    v8 = v8.updated(1, v46)
    val v81: Vector[Double] = v90(0)
    v8 = v8.updated(0, v46)
    v29 = v40
    v29 = v81
    v29 = v29.updated(0, v53)
    v87
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))), s2(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0)))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))))), s2(s1(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))), Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0)))), Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)))), Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))))
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