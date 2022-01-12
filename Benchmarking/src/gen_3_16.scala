import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: s1
  )
  def f111(v0: Double): Double = {
    var v3: Double = v0
    v3 = v0
    var v1: Double = v0
    var v7: Double = v1
    var v5: Double = v3
    var v4: Double = v5
    var v16: Double = v3
    var v9: Double = v16
    var v10: Double = v9
    var v8: Double = v1
    var v17: Double = v1
    var v41: Double = v5
    val v19: Vector[Double] = Vector(v9)
    val v27: Double = v19(0)
    var v35: Vector[Double] = v19
    val v18: Double = v19(0)
    v35 = v35.updated(0, v18)
    var v37: Vector[Double] = v35
    v37 = v37.updated(0, v27)
    v37 = v37.updated(0, v17)
    var v32: Vector[Double] = v35
    var v38: Vector[Double] = v35
    val v29: Double = v32(0)
    val v66: Vector[Vector[Double]] = Vector(v38, v35, v32, v37, v19, v32, v37)
    var v40: Double = v41
    v35 = v35.updated(0, v4)
    v37 = v37.updated(0, v10)
    v32 = v32.updated(0, v29)
    val v34: Double = v32(0)
    val v54: Vector[Double] = v66(6)
    v38 = v38.updated(0, v29)
    v37 = v37.updated(0, v7)
    v35 = v35.updated(0, v7)
    v17 = v4
    v37 = v37.updated(0, v34)
    v38 = v38.updated(0, v0)
    v32 = v32.updated(0, v40)
    val v52: Double = v54(0)
    v41 = v8
    v52
  }
  @noinline
  def f0(v0: Vector[s2], v1: Vector[s2], v2: s1, v3: Vector[s1], v4: Double): Double = {
    val v7: Double = f111(v4)
    val v9: s0 = v2.p1
    val v19: Vector[Vector[Double]] = v9.p0
    val v32: Vector[Double] = v19(0)
    val v46: Double = v32(0)
    var v26: Vector[Double] = v32
    v26 = v26.updated(0, v46)
    v26 = v26.updated(0, v7)
    val v80: Double = v26(0)
    val v62: Double = f111(v46)
    val v194: Double = v62 + v80
    val v66: Double = v7 * v194
    val v141: Double = v66 / v46
    var v63: Double = v141
    v63
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0)))))), s1(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0))))))
    val v1: Vector[s2] = Vector(s2(Vector(Vector(s1(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)))))), s1(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s2(Vector(Vector(s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))), s1(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), s2(Vector(Vector(s1(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0), Vector(41.0)))))), s1(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0))))))
    val v2: s1 = s1(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0))))
    val v3: Vector[s1] = Vector(s1(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0))), s0(Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0))), s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0)))))
    val v4: Double = 66.0
    val start = nanoTime()
    var result: Double = 66.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}