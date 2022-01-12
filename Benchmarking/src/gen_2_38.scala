import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double,
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  case class s4 (
    p0: s0,
    p1: Vector[s1]
  )
  def f9(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p1
    val v7: Vector[Vector[Double]] = v0.p0
    var v1: Vector[Vector[Double]] = v6
    var v2: Vector[Vector[Double]] = v1
    var v5: s0 = v0
    val v4: Vector[Double] = v2(1)
    v2 = v2.updated(0, v4)
    val v12: Vector[Vector[Double]] = v0.p1
    v5 = v5.copy(p1 = v12)
    var v8: s0 = v0
    val v16: Vector[Double] = v12(1)
    var v18: s0 = v5
    val v17: Vector[Vector[Double]] = v18.p0
    v1 = v1.updated(0, v16)
    v18 = v18.copy(p1 = v6)
    val v20: Vector[Vector[Double]] = v8.p1
    v8 = v8.copy(p0 = v17)
    v18 = v18.copy(p1 = v6)
    v18 = v18.copy(p0 = v17)
    v1 = v1.updated(1, v16)
    v8 = v8.copy(p0 = v7)
    v8 = v8.copy(p1 = v20)
    v8 = v8.copy(p1 = v2)
    v8
  }
  def f2(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p1
    val v2: Vector[Double] = v4(0)
    var v7: Vector[Vector[Double]] = v4
    val v5: s0 = f9(v0)
    v7 = v7.updated(1, v2)
    val v32: Vector[Vector[Double]] = v5.p0
    val v37: s0 = s0(v32, v7)
    v37
  }
  @noinline
  def f0(v0: Vector[s4], v1: s0, v2: s4, v3: s2, v4: Vector[Vector[s4]], v5: Double): Double = {
    val v13: s0 = f2(v1)
    val v33: Vector[Vector[Double]] = v13.p1
    var v54: s2 = v3
    val v52: s1 = v54.p1
    val v72: Double = v52.p0
    val v57: Vector[Double] = v33(0)
    val v37: Double = v57(0)
    val v106: Double = v37 * v72
    v106
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(s1(3.0, s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0)))), s1(7.0, s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0)))))), s4(s0(Vector(Vector(11.0)), Vector(Vector(12.0), Vector(13.0))), Vector(s1(14.0, s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), s1(18.0, s0(Vector(Vector(19.0)), Vector(Vector(20.0), Vector(21.0)))))))
    val v1: s0 = s0(Vector(Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))
    val v2: s4 = s4(s0(Vector(Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), Vector(s1(28.0, s0(Vector(Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))), s1(32.0, s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))))
    val v3: s2 = s2(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))), s1(42.0, s0(Vector(Vector(43.0)), Vector(Vector(44.0), Vector(45.0)))))
    val v4: Vector[Vector[s4]] = Vector(Vector(s4(s0(Vector(Vector(46.0)), Vector(Vector(47.0), Vector(48.0))), Vector(s1(49.0, s0(Vector(Vector(50.0)), Vector(Vector(51.0), Vector(52.0)))), s1(53.0, s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))))))))
    val v5: Double = 57.0
    val start = nanoTime()
    var result: Double = 57.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}