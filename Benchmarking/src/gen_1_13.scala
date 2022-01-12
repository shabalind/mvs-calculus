import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0,
    p2: Vector[Vector[s0]]
  )
  def f74(v0: s0, v1: s0): s0 = {
    val v7: Vector[Vector[Double]] = v1.p1
    val v2: Double = v0.p0
    var v4: s0 = v1
    var v3: Double = v2
    val v8: s0 = s0(v3, v7)
    val v14: Double = v8.p0
    var v11: s0 = v1
    v11 = v11.copy(p1 = v7)
    v11 = v11.copy(p1 = v7)
    v4 = v11
    var v13: Double = v14
    v4 = v4.copy(p0 = v13)
    v4 = v4.copy(p1 = v7)
    v4
  }
  def f70(v0: s0, v1: s0): s0 = {
    val v7: s0 = f74(v0, v1)
    val v5: s0 = f74(v0, v0)
    val v4: s0 = f74(v0, v7)
    val v2: s0 = f74(v1, v5)
    val v9: s0 = f74(v7, v1)
    val v13: s0 = f74(v9, v2)
    val v18: s0 = f74(v13, v4)
    v18
  }
  def f67(v0: s0): s0 = {
    val v1: s0 = f70(v0, v0)
    val v6: s0 = f70(v0, v1)
    val v18: s0 = f74(v6, v6)
    val v10: s0 = f70(v18, v6)
    v10
  }
  def f50(v0: s0, v1: s0): s0 = {
    val v2: s0 = f70(v0, v1)
    v2
  }
  @noinline
  def f0(v0: Vector[s0], v1: s1, v2: Vector[s1], v3: Double): Double = {
    val v8: Vector[Vector[s0]] = v1.p0
    val v9: Vector[s0] = v8(1)
    val v48: s0 = v9(0)
    val v57: s0 = f50(v48, v48)
    val v76: s0 = f67(v57)
    val v118: Double = v76.p0
    v118
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(0.0, Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(4.0, Vector(Vector(5.0), Vector(6.0), Vector(7.0))))
    val v1: s1 = s1(Vector(Vector(s0(8.0, Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(12.0, Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), s0(16.0, Vector(Vector(17.0), Vector(18.0), Vector(19.0))), Vector(Vector(s0(20.0, Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))
    val v2: Vector[s1] = Vector(s1(Vector(Vector(s0(24.0, Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), Vector(s0(28.0, Vector(Vector(29.0), Vector(30.0), Vector(31.0))))), s0(32.0, Vector(Vector(33.0), Vector(34.0), Vector(35.0))), Vector(Vector(s0(36.0, Vector(Vector(37.0), Vector(38.0), Vector(39.0)))))), s1(Vector(Vector(s0(40.0, Vector(Vector(41.0), Vector(42.0), Vector(43.0)))), Vector(s0(44.0, Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), s0(48.0, Vector(Vector(49.0), Vector(50.0), Vector(51.0))), Vector(Vector(s0(52.0, Vector(Vector(53.0), Vector(54.0), Vector(55.0)))))), s1(Vector(Vector(s0(56.0, Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(60.0, Vector(Vector(61.0), Vector(62.0), Vector(63.0))))), s0(64.0, Vector(Vector(65.0), Vector(66.0), Vector(67.0))), Vector(Vector(s0(68.0, Vector(Vector(69.0), Vector(70.0), Vector(71.0)))))))
    val v3: Double = 72.0
    val start = nanoTime()
    var result: Double = 72.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}