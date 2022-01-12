import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f13(v0: s0, v1: s0, v2: s0): s0 = {
    val v7: Vector[s0] = Vector(v0, v1)
    var v4: Vector[s0] = v7
    var v8: Vector[s0] = v4
    v8 = v7
    v8 = v8.updated(1, v1)
    val v74: s0 = v8(0)
    v74
  }
  def f7(v0: s0, v1: s0): s0 = {
    var v7: s0 = v0
    val v6: s0 = f13(v0, v7, v7)
    val v4: Vector[Vector[Double]] = v6.p1
    v7 = v1
    var v2: s0 = v7
    var v5: Vector[Vector[Double]] = v4
    v7 = v7.copy(p1 = v5)
    val v10: Vector[Double] = v4(0)
    var v9: s0 = v7
    val v12: s0 = f13(v2, v6, v9)
    val v30: Vector[Vector[Double]] = Vector(v10)
    v2 = v2.copy(p1 = v30)
    v5 = v5.updated(0, v10)
    val v15: Vector[Double] = v4(0)
    v5 = v5.updated(0, v10)
    v5 = v5.updated(0, v10)
    v5 = v5.updated(0, v15)
    v2 = v0
    v7 = v7.copy(p1 = v30)
    v5 = v5.updated(0, v10)
    v5 = v5.updated(0, v10)
    v12
  }
  @noinline
  def f0(v0: s0, v1: Vector[Vector[s1]], v2: Double): Double = {
    val v6: s0 = f13(v0, v0, v0)
    var v4: s0 = v6
    val v7: Vector[Vector[Double]] = v4.p1
    var v3: Double = v2
    var v10: Vector[Vector[Double]] = v7
    var v11: s0 = v0
    val v8: Vector[Vector[Double]] = v11.p0
    val v9: Vector[Double] = v10(0)
    val v16: Double = v9(0)
    val v15: s0 = f13(v11, v0, v4)
    val v12: Vector[Vector[Double]] = v4.p1
    v10 = v10.updated(0, v9)
    val v43: Vector[Vector[Double]] = v15.p1
    val v14: s0 = s0(v8, v43)
    v4 = v4.copy(p0 = v8)
    val v24: s0 = f7(v0, v4)
    val v40: Vector[Vector[Double]] = v14.p0
    val v51: Vector[Double] = Vector(v3)
    var v29: Double = v16
    val v23: Vector[Double] = v10(0)
    v4 = v4.copy(p0 = v8)
    val v18: Vector[Vector[Double]] = v14.p0
    v10 = v10.updated(0, v23)
    v4 = v4.copy(p0 = v40)
    v10 = v10.updated(0, v51)
    var v56: Vector[Vector[Double]] = v8
    val v31: Vector[Vector[Double]] = v24.p1
    val v36: Double = v16 + v16
    val v48: Vector[Double] = v18(1)
    v4 = v4.copy(p0 = v56)
    v11 = v11.copy(p1 = v12)
    val v117: Vector[Double] = v31(0)
    v56 = v56.updated(0, v23)
    v56 = v56.updated(2, v117)
    v56 = v56.updated(1, v48)
    v10 = v10.updated(0, v48)
    val v318: Double = v29 / v36
    v318
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))))), Vector(s1(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))))), Vector(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), Vector(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))))))
    val v2: Double = 52.0
    val start = nanoTime()
    var result: Double = 52.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}