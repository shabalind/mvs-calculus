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
    p1: Vector[s1]
  )
  case class s8 (
    p0: s2,
    p1: Vector[s2]
  )
  case class s9 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s9, v1: s8, v2: Double): Double = {
    val v5: s2 = v1.p0
    val v4: Vector[s0] = v0.p1
    val v7: s0 = v4(0)
    var v3: s0 = v7
    val v10: Vector[s0] = v0.p1
    val v8: Vector[Vector[Double]] = v3.p0
    val v23: s0 = v10(0)
    v3 = v3.copy(p0 = v8)
    val v12: Vector[Double] = v8(1)
    val v14: Vector[s0] = v5.p0
    val v15: Vector[s0] = v0.p1
    var v21: Vector[s0] = v14
    v3 = v3.copy(p0 = v8)
    v21 = v21.updated(0, v7)
    v21 = v21.updated(0, v3)
    v21 = v21.updated(0, v23)
    v21 = v21.updated(0, v3)
    val v29: Vector[Vector[Double]] = v7.p0
    val v68: s0 = v15(0)
    val v44: s0 = v21(0)
    v21 = v21.updated(0, v7)
    val v57: Vector[Vector[Double]] = v7.p0
    val v37: Vector[s0] = Vector(v23, v23)
    v3 = v3.copy(p1 = v29)
    val v116: Vector[Vector[Double]] = v44.p0
    v21 = v21.updated(0, v68)
    val v154: Double = v12(0)
    v3 = v3.copy(p1 = v8)
    var v89: Vector[s0] = v37
    v3 = v3.copy(p0 = v116)
    val v135: s0 = v89(0)
    val v218: Vector[Vector[Double]] = v135.p0
    v3 = v3.copy(p1 = v57)
    v3 = v3.copy(p1 = v218)
    v154
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))))
    val v1: s8 = s8(s2(Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))), s1(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))))), Vector(s2(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), Vector(s1(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), s1(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))))), s2(Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), Vector(s1(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0)))), s1(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))))))))
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