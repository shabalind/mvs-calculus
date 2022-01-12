import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0],
    p2: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: s1
  )
  def f10(v0: Double): Double = {
    var v2: Double = v0
    var v4: Double = v2
    var v1: Double = v4
    var v3: Double = v0
    val v6: Double = v4 / v2
    v1 = v2
    var v7: Double = v2
    var v5: Double = v3
    var v9: Double = v6
    val v17: Double = v9 / v7
    var v11: Double = v2
    var v10: Double = v5
    var v14: Double = v7
    val v15: Double = v14 * v17
    val v24: Vector[Double] = Vector(v10)
    v10 = v15
    val v26: Double = v24(0)
    var v62: Double = v7
    var v25: Vector[Double] = v24
    v25 = v25.updated(0, v3)
    val v32: Double = v24(0)
    var v28: Vector[Double] = v25
    v25 = v25.updated(0, v32)
    v25 = v25.updated(0, v1)
    v25 = v25.updated(0, v11)
    v25 = v25.updated(0, v26)
    v25 = v25.updated(0, v1)
    v28 = v28.updated(0, v62)
    v25 = v25.updated(0, v11)
    val v54: Double = v28(0)
    v54
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v5: Double = f10(v1)
    val v8: Double = f10(v5)
    val v4: s1 = v0.p0
    val v7: Vector[Vector[s0]] = v4.p0
    val v11: Vector[s0] = v7(1)
    val v23: Vector[s0] = v4.p1
    var v16: Vector[Vector[s0]] = v7
    val v22: Vector[s0] = v16(2)
    val v27: Double = f10(v8)
    var v28: Vector[Vector[s0]] = v7
    val v61: s0 = v22(0)
    val v37: Vector[Vector[Double]] = v61.p0
    val v72: Vector[Double] = v37(0)
    v16 = v16.updated(1, v23)
    var v35: Vector[Double] = v72
    val v42: Double = v35(0)
    v35 = v35.updated(0, v27)
    val v68: Vector[s0] = v28(0)
    v16 = v16.updated(0, v68)
    v16 = v16.updated(2, v11)
    v42
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))), Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))))), s1(Vector(Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))), Vector(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), Vector(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))))))
    val v1: Double = 56.0
    val start = nanoTime()
    var result: Double = 56.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}