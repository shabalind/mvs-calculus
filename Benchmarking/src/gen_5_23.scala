import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[Double]]
  )
  case class s3 (
    p0: s1,
    p1: s0,
    p2: s1,
    p3: Vector[Vector[s0]]
  )
  case class s5 (
    p0: Vector[s3],
    p1: s3
  )
  def f11(v0: Double): Double = {
    var v7: Double = v0
    var v5: Double = v7
    var v2: Double = v7
    var v8: Double = v0
    var v13: Double = v5
    var v12: Double = v7
    var v15: Double = v2
    var v16: Double = v2
    val v10: Double = v15 - v8
    var v26: Double = v5
    var v25: Double = v7
    val v19: Vector[Double] = Vector(v15, v2, v26, v2, v8, v13)
    val v40: Double = v19(5)
    var v30: Vector[Double] = v19
    var v28: Double = v7
    v30 = v30.updated(4, v12)
    v30 = v30.updated(4, v40)
    var v99: Double = v10
    val v36: Double = v30(4)
    var v42: Vector[Double] = v19
    v42 = v42.updated(4, v28)
    val v31: Double = v42(2)
    v30 = v30.updated(4, v25)
    v30 = v30.updated(4, v16)
    v42 = v42.updated(3, v36)
    val v119: Vector[Vector[Double]] = Vector(v42, v30, v42, v30)
    val v39: Vector[Double] = v119(1)
    v42 = v42.updated(5, v2)
    val v86: Double = v39(2)
    v30 = v30.updated(3, v31)
    v30 = v30.updated(2, v2)
    v30 = v30.updated(1, v99)
    v86
  }
  @noinline
  def f0(v0: s5, v1: Vector[Vector[s0]], v2: Double): Double = {
    val v8: Double = f11(v2)
    val v9: Vector[s0] = v1(1)
    val v4: s0 = v9(0)
    val v7: Double = v2 / v2
    val v30: Double = v4.p0
    val v29: Double = f11(v30)
    val v60: Double = v8 + v29
    val v92: Double = v7 + v60
    v92
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(Vector(s3(s1(s0(0.0, Vector(Vector(1.0), Vector(2.0))), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(6.0, Vector(Vector(7.0), Vector(8.0))), s1(s0(9.0, Vector(Vector(10.0), Vector(11.0))), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), Vector(Vector(s0(15.0, Vector(Vector(16.0), Vector(17.0)))), Vector(s0(18.0, Vector(Vector(19.0), Vector(20.0)))), Vector(s0(21.0, Vector(Vector(22.0), Vector(23.0)))))), s3(s1(s0(24.0, Vector(Vector(25.0), Vector(26.0))), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(30.0, Vector(Vector(31.0), Vector(32.0))), s1(s0(33.0, Vector(Vector(34.0), Vector(35.0))), Vector(Vector(36.0), Vector(37.0), Vector(38.0))), Vector(Vector(s0(39.0, Vector(Vector(40.0), Vector(41.0)))), Vector(s0(42.0, Vector(Vector(43.0), Vector(44.0)))), Vector(s0(45.0, Vector(Vector(46.0), Vector(47.0))))))), s3(s1(s0(48.0, Vector(Vector(49.0), Vector(50.0))), Vector(Vector(51.0), Vector(52.0), Vector(53.0))), s0(54.0, Vector(Vector(55.0), Vector(56.0))), s1(s0(57.0, Vector(Vector(58.0), Vector(59.0))), Vector(Vector(60.0), Vector(61.0), Vector(62.0))), Vector(Vector(s0(63.0, Vector(Vector(64.0), Vector(65.0)))), Vector(s0(66.0, Vector(Vector(67.0), Vector(68.0)))), Vector(s0(69.0, Vector(Vector(70.0), Vector(71.0)))))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(72.0, Vector(Vector(73.0), Vector(74.0)))), Vector(s0(75.0, Vector(Vector(76.0), Vector(77.0)))))
    val v2: Double = 78.0
    val start = nanoTime()
    var result: Double = 78.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}