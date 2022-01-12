import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: s0,
    p2: s1
  )
  def f22(v0: Vector[Double]): Vector[Double] = {
    var v4: Vector[Double] = v0
    var v2: Vector[Double] = v4
    val v6: Double = v2(0)
    val v5: Double = v2(0)
    val v3: Double = v2(0)
    val v10: Double = v2(0)
    var v12: Double = v10
    var v16: Double = v12
    val v15: Double = v4(0)
    var v1: Vector[Double] = v2
    var v9: Vector[Double] = v4
    var v42: Vector[Double] = v1
    v1 = v1.updated(0, v3)
    val v23: Vector[Double] = Vector(v5, v16, v3, v3, v12)
    var v36: Vector[Double] = v42
    val v17: Double = v6 / v15
    val v39: Double = v36(0)
    v1 = v9
    var v37: Vector[Double] = v23
    var v56: Vector[Double] = v37
    val v54: Double = v23(4)
    val v45: Double = v37(2)
    val v28: Double = v56(3)
    var v67: Vector[Double] = v56
    v1 = v1.updated(0, v54)
    val v60: Double = v37(0)
    val v68: Double = v56(0)
    v37 = v37.updated(3, v39)
    val v102: Double = v37(2)
    val v74: Vector[Double] = Vector(v68, v60, v54, v102, v28, v17)
    val v71: Vector[Vector[Double]] = Vector(v74, v74, v74, v74, v74, v74)
    val v84: Vector[Double] = v71(5)
    v9 = v9.updated(0, v12)
    val v92: Double = v84(3)
    v16 = v45
    val v157: Double = v67(1)
    var v129: Vector[Double] = v2
    v4 = v4.updated(0, v92)
    v129 = v129.updated(0, v157)
    v129
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v7: s2 = v0(0)
    val v4: s0 = v7.p1
    val v5: Vector[Vector[Double]] = v4.p1
    val v11: Vector[Double] = v5(0)
    var v23: Vector[Double] = v11
    val v16: Vector[Double] = f22(v23)
    val v15: Vector[Double] = f22(v16)
    val v67: Double = v23(0)
    val v43: Double = v15(0)
    val v37: Double = v43 - v67
    val v97: Double = v16(0)
    var v79: Double = v37
    v23 = v23.updated(0, v97)
    v79
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s1(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), Vector(Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))))))))
    val v1: Double = 54.0
    val start = nanoTime()
    var result: Double = 54.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}