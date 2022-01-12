import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: Vector[s2],
    p1: s1
  )
  def f45(v0: s3): s3 = {
    val v1: s1 = v0.p1
    val v10: Vector[Vector[s0]] = v1.p0
    val v12: Vector[Vector[s0]] = v1.p0
    val v7: Vector[s0] = v10(0)
    var v14: Vector[Vector[s0]] = v12
    val v8: Vector[s0] = v10(0)
    val v6: Vector[s0] = v1.p1
    var v16: Vector[s0] = v6
    v14 = v14.updated(0, v8)
    var v22: s1 = v1
    val v26: Vector[s0] = v1.p1
    val v21: Vector[s0] = v22.p1
    v22 = v22.copy(p1 = v26)
    v22 = v22.copy(p0 = v14)
    v22 = v22.copy(p0 = v14)
    v14 = v14.updated(0, v7)
    v22 = v22.copy(p1 = v16)
    var v123: s3 = v0
    val v38: Vector[s0] = v14(0)
    v22 = v22.copy(p0 = v12)
    v14 = v14.updated(0, v38)
    v22 = v22.copy(p1 = v21)
    v123 = v123.copy(p1 = v22)
    var v263: s3 = v123
    v263
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v4: s3 = f45(v0)
    var v6: Double = v1
    val v7: s1 = v4.p1
    val v26: Vector[Vector[s0]] = v7.p0
    val v21: Vector[s0] = v26(0)
    val v29: s0 = v21(0)
    val v31: Vector[Vector[Double]] = v29.p2
    val v62: Vector[Double] = v31(0)
    var v51: Vector[Double] = v62
    val v68: Double = v51(0)
    val v41: Double = v6 * v68
    v51 = v51.updated(0, v1)
    v41
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0)), Vector(Vector(11.0))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)), Vector(Vector(15.0))))), Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0)), Vector(Vector(23.0)))))))), s2(Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)), Vector(Vector(27.0)))), Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0)), Vector(Vector(31.0)))), Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0)), Vector(Vector(35.0))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)), Vector(Vector(39.0))))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0)), Vector(Vector(47.0)))))))), s2(Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)), Vector(Vector(51.0)))), Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0)), Vector(Vector(55.0)))), Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0)), Vector(Vector(59.0))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0)), Vector(Vector(63.0))))), Vector(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0)), Vector(Vector(71.0))))))))), s1(Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0)), Vector(Vector(75.0))))), Vector(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0)), Vector(Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0)), Vector(Vector(83.0))))))
    val v1: Double = 84.0
    val start = nanoTime()
    var result: Double = 84.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}