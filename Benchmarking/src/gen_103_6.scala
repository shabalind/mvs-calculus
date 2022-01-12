import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Double
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: Vector[s2],
    p2: Vector[Vector[s0]]
  )
  case class s10 (
    p0: Vector[s0],
    p1: s3
  )
  def f50(v0: Double): Double = {
    var v1: Double = v0
    val v7: Double = v1 - v0
    val v13: Double = v0 * v1
    var v4: Double = v13
    var v8: Double = v1
    var v6: Double = v1
    var v5: Double = v6
    var v10: Double = v8
    var v17: Double = v0
    var v3: Double = v7
    v8 = v1
    val v11: Double = v13 + v5
    var v16: Double = v17
    var v12: Double = v1
    var v15: Double = v1
    var v19: Double = v15
    var v14: Double = v12
    val v34: Vector[Double] = Vector(v12, v5, v12, v15, v15, v16)
    var v35: Vector[Double] = v34
    val v24: Double = v15 * v1
    val v51: Double = v35(1)
    val v25: Double = v15 * v11
    val v32: Double = v14 - v10
    v35 = v35.updated(0, v25)
    val v23: Vector[Double] = Vector(v51, v16, v24, v19, v17, v32, v24)
    var v53: Vector[Double] = v23
    val v28: Double = v53(4)
    val v33: Double = v35(0)
    v35 = v35.updated(5, v33)
    var v29: Vector[Double] = v35
    v53 = v53.updated(2, v4)
    val v46: Double = v34(1)
    val v60: Double = v34(1)
    v29 = v29.updated(5, v3)
    v53 = v53.updated(1, v8)
    v17 = v46
    var v58: Vector[Double] = v29
    v29 = v29.updated(3, v28)
    var v37: Vector[Double] = v58
    v37 = v37.updated(5, v60)
    val v49: Double = v37(5)
    v37 = v37.updated(4, v11)
    v49
  }
  @noinline
  def f0(v0: Vector[s1], v1: s10, v2: Double): Double = {
    val v6: Double = f50(v2)
    val v11: Double = f50(v2)
    val v9: Double = v11 + v11
    val v78: Double = v9 + v6
    v78
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), 4.0), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0)), 9.0)), s1(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0)), 14.0), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0)), 19.0)), s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)), 24.0), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0)), 29.0)))
    val v1: s10 = s10(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0)), 34.0)), s3(Vector(s1(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0)), 39.0), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0)), 44.0))), Vector(s2(Vector(s1(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0)), 49.0), s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0)), 54.0)), s1(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0)), 59.0), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)), 64.0))), s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0)), 69.0))), Vector(Vector(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0)), 74.0)))))
    val v2: Double = 75.0
    val start = nanoTime()
    var result: Double = 75.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}