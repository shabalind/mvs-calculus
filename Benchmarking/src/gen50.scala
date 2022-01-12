import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s1
  )
  def f49(v0: Double, v1: s0, v2: Double): Double = {
    val v8: Vector[Vector[Double]] = v1.p3
    var v4: Vector[Vector[Double]] = v8
    val v3: Vector[Vector[Double]] = v1.p2
    val v13: Vector[Double] = v4(0)
    val v5: Vector[Double] = v3(1)
    val v7: Double = v13(0)
    v4 = v4.updated(0, v13)
    val v6: Vector[Vector[Double]] = v1.p3
    v4 = v4.updated(0, v5)
    val v21: Vector[Double] = v3(1)
    val v20: Vector[Double] = v3(0)
    v4 = v4.updated(0, v21)
    val v18: Vector[Double] = v6(1)
    v4 = v4.updated(1, v21)
    v4 = v4.updated(1, v20)
    var v48: Double = v7
    v4 = v4.updated(0, v18)
    v4 = v4.updated(1, v20)
    v48
  }
  def f37(v0: s2): s2 = {
    var v2: s2 = v0
    var v6: s2 = v2
    var v3: s2 = v6
    val v4: Vector[s1] = v0.p0
    val v1: s1 = v4(0)
    v6 = v6.copy(p0 = v4)
    v6 = v6.copy(p0 = v4)
    v3 = v3.copy(p0 = v4)
    v3 = v3.copy(p1 = v1)
    v3
  }
  @noinline
  def f0(v0: s0, v1: Vector[s2], v2: Double): Double = {
    val v4: Vector[Vector[Double]] = v0.p2
    val v3: Vector[Vector[Double]] = v0.p0
    var v6: Vector[Vector[Double]] = v4
    val v11: Double = f49(v2, v0, v2)
    val v8: Vector[Double] = v6(1)
    v6 = v4
    val v7: Double = f49(v11, v0, v11)
    var v12: s0 = v0
    v12 = v0
    v12 = v12.copy(p1 = v6)
    val v14: Vector[Vector[Double]] = v12.p1
    val v13: Vector[Vector[Double]] = v0.p3
    val v17: Double = v8(0)
    val v16: s2 = v1(0)
    val v15: Double = f49(v7, v12, v17)
    var v19: Vector[Double] = v8
    val v21: s2 = f37(v16)
    val v24: s1 = v21.p1
    var v30: Vector[Vector[Double]] = v13
    var v25: Vector[Double] = v8
    var v26: Vector[Vector[Double]] = v30
    val v22: s0 = v24.p1
    v6 = v6.updated(1, v19)
    val v29: Double = v19(0)
    val v20: Vector[Double] = v3(0)
    v12 = v12.copy(p3 = v26)
    v25 = v25.updated(0, v15)
    val v61: Double = v8(0)
    v30 = v30.updated(0, v8)
    var v47: Vector[Vector[Double]] = v3
    val v117: Vector[Vector[Double]] = v22.p0
    val v66: s0 = v24.p1
    val v65: Double = f49(v17, v66, v29)
    v25 = v25.updated(0, v11)
    val v50: Vector[Double] = v47(0)
    var v40: Vector[Double] = v20
    val v35: Vector[Double] = v14(1)
    v40 = v40.updated(0, v61)
    v30 = v30.updated(1, v40)
    v26 = v26.updated(1, v19)
    val v44: Double = v2 - v29
    var v81: Double = v65
    val v63: Double = f49(v2, v22, v7)
    v40 = v40.updated(0, v81)
    v25 = v50
    v19 = v19.updated(0, v44)
    v25 = v25.updated(0, v2)
    v47 = v117
    v12 = v12.copy(p0 = v47)
    v25 = v25.updated(0, v63)
    v6 = v6.updated(1, v35)
    val v274: Double = v25(0)
    v274
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0)))
    val v1: Vector[s2] = Vector(s2(Vector(s1(s0(Vector(Vector(7.0)), Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0))))), s1(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))))), s2(Vector(s1(s0(Vector(Vector(35.0)), Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0))))), s1(s0(Vector(Vector(49.0)), Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0))))))
    val v2: Double = 63.0
    val start = nanoTime()
    var result: Double = 63.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}