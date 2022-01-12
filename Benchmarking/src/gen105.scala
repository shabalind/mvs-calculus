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
  case class s3 (
    p0: s0,
    p1: s0
  )
  def f11(v0: Double): Double = {
    var v4: Double = v0
    var v6: Double = v4
    v6 = v0
    v6 = v4
    var v3: Double = v6
    var v10: Double = v3
    var v1: Double = v4
    var v5: Double = v6
    val v7: Double = v1 - v0
    v6 = v4
    var v15: Double = v7
    var v12: Double = v5
    val v9: Vector[Double] = Vector(v15, v6, v12, v4)
    val v17: Double = v9(0)
    var v25: Vector[Double] = v9
    v25 = v25.updated(3, v17)
    v25 = v25.updated(2, v10)
    var v31: Vector[Double] = v25
    v25 = v25.updated(0, v15)
    val v40: Double = v31(2)
    v40
  }
  @noinline
  def f0(v0: s2, v1: Vector[Vector[s3]], v2: Vector[Vector[s1]], v3: Double): Double = {
    val v8: Double = f11(v3)
    var v9: Double = v8
    val v18: Double = f11(v9)
    val v26: Double = f11(v18)
    v26
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), s1(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), s1(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))))
    val v1: Vector[Vector[s3]] = Vector(Vector(s3(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))))), Vector(s3(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))))), Vector(s3(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))
    val v2: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))))))
    val v3: Double = 68.0
    val start = nanoTime()
    var result: Double = 68.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}