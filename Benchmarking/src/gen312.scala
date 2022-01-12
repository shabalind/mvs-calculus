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
    p0: Vector[Vector[s1]],
    p1: Vector[Vector[s0]]
  )
  def f35(v0: Double): Double = {
    var v6: Double = v0
    var v4: Double = v6
    v6 = v4
    var v2: Double = v6
    var v5: Double = v2
    var v7: Double = v5
    var v1: Double = v2
    v1 = v0
    var v16: Double = v1
    var v10: Double = v7
    var v9: Double = v1
    var v15: Double = v9
    var v30: Double = v6
    var v18: Double = v5
    var v35: Double = v18
    val v14: Vector[Double] = Vector(v10, v2, v30, v16, v35, v0, v5)
    var v25: Vector[Double] = v14
    var v20: Vector[Double] = v25
    var v24: Vector[Double] = v25
    val v39: Double = v14(6)
    v24 = v24.updated(6, v30)
    val v27: Double = v24(0)
    v20 = v20.updated(4, v27)
    var v122: Vector[Double] = v25
    v122 = v122.updated(2, v27)
    var v52: Double = v7
    val v58: Vector[Vector[Double]] = Vector(v25, v14, v20, v122)
    val v118: Vector[Double] = v58(3)
    v122 = v122.updated(4, v39)
    var v85: Double = v2
    val v67: Vector[Vector[Double]] = Vector(v118, v20)
    v20 = v20.updated(0, v15)
    v122 = v122.updated(6, v1)
    v30 = v52
    val v172: Vector[Double] = v67(1)
    v24 = v24.updated(0, v18)
    v1 = v85
    val v114: Double = v172(1)
    v122 = v122.updated(2, v1)
    v122 = v122.updated(1, v1)
    v114
  }
  @noinline
  def f0(v0: Vector[s2], v1: Vector[Vector[s0]], v2: Vector[s0], v3: s2, v4: Double): Double = {
    val v9: Double = f35(v4)
    var v28: Double = v4
    val v27: Double = v28 * v9
    v27
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))))), Vector(s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), Vector(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))))), Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0)))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0)))))), s2(Vector(Vector(s1(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0))))), Vector(s1(s0(Vector(Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0))))), Vector(s1(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0)))))), Vector(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0)))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0)))), Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0)))))), s2(Vector(Vector(s1(s0(Vector(Vector(36.0)), Vector(Vector(37.0))), s0(Vector(Vector(38.0)), Vector(Vector(39.0))))), Vector(s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0))))), Vector(s1(s0(Vector(Vector(44.0)), Vector(Vector(45.0))), s0(Vector(Vector(46.0)), Vector(Vector(47.0)))))), Vector(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0)))), Vector(s0(Vector(Vector(50.0)), Vector(Vector(51.0)))), Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0)))))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0)))))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0))), s0(Vector(Vector(58.0)), Vector(Vector(59.0))))
    val v3: s2 = s2(Vector(Vector(s1(s0(Vector(Vector(60.0)), Vector(Vector(61.0))), s0(Vector(Vector(62.0)), Vector(Vector(63.0))))), Vector(s1(s0(Vector(Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0)), Vector(Vector(67.0))))), Vector(s1(s0(Vector(Vector(68.0)), Vector(Vector(69.0))), s0(Vector(Vector(70.0)), Vector(Vector(71.0)))))), Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0)))), Vector(s0(Vector(Vector(74.0)), Vector(Vector(75.0)))), Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0))))))
    val v4: Double = 78.0
    val start = nanoTime()
    var result: Double = 78.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}