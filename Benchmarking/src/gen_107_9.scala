import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  def f17(v0: Double): Double = {
    var v5: Double = v0
    var v6: Double = v0
    v5 = v6
    var v3: Double = v5
    var v1: Double = v3
    val v2: Vector[Double] = Vector(v1)
    v5 = v3
    val v4: Double = v2(0)
    val v10: Vector[Double] = Vector(v3, v4, v3, v4, v4, v3)
    val v9: Double = v2(0)
    val v17: Double = v2(0)
    val v16: Double = v10(4)
    val v28: Double = v10(5)
    val v41: Vector[Double] = Vector(v16, v4)
    var v26: Vector[Double] = v41
    val v48: Double = v26(0)
    v26 = v26.updated(1, v17)
    val v22: Vector[Double] = Vector(v48, v9, v5, v16, v1, v1, v4)
    var v29: Vector[Double] = v22
    val v33: Double = v29(2)
    var v53: Vector[Double] = v10
    v53 = v53.updated(3, v33)
    val v124: Vector[Vector[Double]] = Vector(v10)
    var v63: Vector[Vector[Double]] = v124
    v26 = v26.updated(1, v28)
    v53 = v53.updated(4, v28)
    var v88: Vector[Vector[Double]] = v63
    var v45: Vector[Vector[Double]] = v88
    val v80: Vector[Double] = v45(0)
    var v169: Vector[Double] = v80
    val v123: Vector[Double] = v88(0)
    v63 = v63.updated(0, v123)
    v88 = v88.updated(0, v53)
    val v203: Double = v169(0)
    v203
  }
  @noinline
  def f0(v0: Vector[s1], v1: s1, v2: s0, v3: Double): Double = {
    var v6: Double = v3
    val v11: Vector[Vector[Double]] = v2.p0
    val v13: Vector[Double] = v11(0)
    val v10: Double = f17(v6)
    val v41: Double = v13(0)
    var v34: Double = v10
    val v81: Vector[Double] = v11(2)
    val v51: Double = v81(0)
    val v107: Double = v13(0)
    val v114: Double = v41 + v34
    val v164: Vector[Double] = Vector(v107, v3, v114, v10, v51, v107)
    val v104: Double = v164(1)
    v104
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))))), s1(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))))
    val v1: s1 = s1(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), Vector(Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))))
    val v2: s0 = s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)))
    val v3: Double = 50.0
    val start = nanoTime()
    var result: Double = 50.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}