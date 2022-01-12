import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Double
  )
  case class s2 (
    p0: Vector[s1]
  )
  case class s4 (
    p0: s1,
    p1: s2
  )
  case class s8 (
    p0: s0,
    p1: s4
  )
  def f24(v0: Double): Double = {
    val v1: Vector[Double] = Vector(v0)
    var v5: Double = v0
    val v3: Double = v1(0)
    var v8: Vector[Double] = v1
    var v7: Vector[Double] = v8
    var v2: Vector[Double] = v8
    v2 = v2.updated(0, v0)
    var v9: Double = v3
    val v6: Double = v1(0)
    v2 = v2.updated(0, v6)
    var v4: Vector[Double] = v7
    val v13: Double = v8(0)
    var v34: Vector[Double] = v4
    var v18: Vector[Double] = v8
    val v12: Double = v4(0)
    var v17: Double = v6
    v8 = v8.updated(0, v12)
    val v23: Double = v34(0)
    var v16: Double = v13
    val v31: Double = v2(0)
    v34 = v34.updated(0, v13)
    v8 = v8.updated(0, v5)
    v18 = v18.updated(0, v31)
    val v27: Double = v18(0)
    v8 = v4
    v18 = v18.updated(0, v27)
    val v14: Vector[Double] = Vector(v17, v27)
    var v28: Vector[Double] = v4
    v4 = v4.updated(0, v16)
    var v40: Vector[Double] = v28
    var v37: Vector[Double] = v2
    v7 = v7.updated(0, v0)
    val v22: Double = v18(0)
    var v59: Vector[Double] = v40
    var v79: Vector[Double] = v14
    var v41: Double = v22
    val v38: Double = v2(0)
    v8 = v8.updated(0, v6)
    val v35: Double = v79(0)
    val v89: Double = v7(0)
    val v119: Vector[Vector[Double]] = Vector(v59, v37, v40, v34, v7)
    v7 = v7.updated(0, v27)
    v7 = v7.updated(0, v35)
    v4 = v4.updated(0, v89)
    v2 = v2.updated(0, v41)
    v37 = v37.updated(0, v38)
    v34 = v34.updated(0, v27)
    v34 = v34.updated(0, v23)
    var v51: Vector[Double] = v14
    val v117: Vector[Double] = v119(2)
    v8 = v8.updated(0, v12)
    val v63: Double = v51(0)
    v37 = v37.updated(0, v63)
    v2 = v2.updated(0, v9)
    v40 = v40.updated(0, v13)
    v40 = v40.updated(0, v35)
    v51 = v51.updated(0, v38)
    val v125: Double = v117(0)
    v125
  }
  @noinline
  def f0(v0: Vector[s8], v1: Double): Double = {
    val v8: s8 = v0(1)
    val v2: s0 = v8.p0
    val v13: Vector[Vector[Double]] = v2.p0
    val v15: Vector[Double] = v13(0)
    val v73: Double = v15(0)
    val v45: Double = f24(v73)
    val v48: Double = f24(v45)
    v48
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s4(s1(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), 10.0), s2(Vector(s1(s0(Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), 16.0))))), s8(s0(Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0), Vector(21.0))), s4(s1(s0(Vector(Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0), Vector(26.0))), 27.0), s2(Vector(s1(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0))), 33.0))))), s8(s0(Vector(Vector(34.0), Vector(35.0)), Vector(Vector(36.0), Vector(37.0), Vector(38.0))), s4(s1(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), 44.0), s2(Vector(s1(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))), 50.0))))))
    val v1: Double = 51.0
    val start = nanoTime()
    var result: Double = 51.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}