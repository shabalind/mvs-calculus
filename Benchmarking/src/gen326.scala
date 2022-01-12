import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0],
    p2: s0,
    p3: s0,
    p4: Vector[s0],
    p5: s0,
    p6: s0,
    p7: s0
  )
  case class s2 (
    p0: s1
  )
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    var v2: Vector[Vector[s1]] = v0
    val v7: Vector[s1] = v2(0)
    v2 = v2.updated(0, v7)
    v2 = v2.updated(0, v7)
    v2 = v2.updated(0, v7)
    val v11: Vector[s1] = v2(1)
    val v6: s1 = v7(0)
    val v4: s2 = s2(v6)
    val v3: s1 = v11(0)
    val v9: Vector[s1] = v0(1)
    val v18: Vector[s1] = v2(0)
    val v21: Vector[s1] = v2(0)
    v2 = v0
    var v14: s2 = v4
    val v20: s1 = v21(0)
    val v30: s0 = v3.p7
    v14 = v14.copy(p0 = v20)
    var v17: Vector[s1] = v9
    v14 = v14.copy(p0 = v3)
    val v22: Vector[Vector[Double]] = v30.p0
    v2 = v2.updated(0, v17)
    v2 = v2.updated(1, v18)
    val v36: s1 = v17(0)
    var v48: s2 = v14
    val v35: s2 = s2(v36)
    val v40: s1 = v4.p0
    val v61: s1 = v48.p0
    val v31: Vector[Double] = v22(1)
    v17 = v17.updated(0, v61)
    v17 = v17.updated(0, v40)
    val v68: s1 = v4.p0
    v48 = v35
    v14 = v14.copy(p0 = v68)
    val v60: Double = v31(0)
    v60
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))), Vector(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))))))
    val v1: Double = 72.0
    val start = nanoTime()
    var result: Double = 72.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}