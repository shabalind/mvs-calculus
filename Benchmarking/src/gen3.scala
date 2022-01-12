import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: s1
  )
  def f16(v0: Vector[Double]): Vector[Double] = {
    val v5: Double = v0(0)
    val v4: Double = v0(0)
    var v6: Double = v5
    val v11: Double = v0(0)
    v6 = v11
    var v9: Vector[Double] = v0
    val v2: Double = v9(0)
    val v10: Double = v0(0)
    v9 = v9.updated(0, v6)
    var v18: Vector[Double] = v0
    val v12: Double = v9(0)
    var v13: Vector[Double] = v18
    var v17: Vector[Double] = v18
    val v16: Double = v17(0)
    val v23: Double = v18(0)
    var v43: Double = v12
    var v28: Vector[Double] = v13
    val v38: Double = v17(0)
    val v26: Double = v2 - v6
    v18 = v18.updated(0, v4)
    v9 = v9.updated(0, v26)
    val v37: Double = v17(0)
    var v34: Vector[Double] = v17
    val v30: Double = v28(0)
    v17 = v17.updated(0, v6)
    v13 = v13.updated(0, v38)
    v9 = v9.updated(0, v30)
    v17 = v17.updated(0, v43)
    var v82: Vector[Double] = v9
    var v31: Double = v10
    v28 = v28.updated(0, v37)
    v18 = v18.updated(0, v23)
    v82 = v82.updated(0, v16)
    v9 = v9.updated(0, v23)
    val v68: Double = v82(0)
    var v77: Vector[Double] = v34
    v13 = v13.updated(0, v31)
    var v84: Double = v6
    var v69: Vector[Double] = v77
    v34 = v34.updated(0, v26)
    v18 = v18.updated(0, v6)
    v9 = v9.updated(0, v68)
    v18 = v18.updated(0, v68)
    v34 = v34.updated(0, v84)
    v69
  }
  @noinline
  def f0(v0: s1, v1: Vector[Vector[s3]], v2: Double): Double = {
    var v5: s1 = v0
    val v10: Vector[s0] = v5.p0
    val v7: s0 = v10(0)
    v5 = v5.copy(p1 = v7)
    v5 = v5.copy(p0 = v10)
    val v28: Vector[Vector[Double]] = v7.p0
    var v26: Vector[Vector[Double]] = v28
    val v38: Vector[Double] = v26(0)
    var v46: Vector[Double] = v38
    val v32: Vector[Double] = f16(v46)
    var v77: Double = v2
    v26 = v26.updated(0, v32)
    val v138: Double = v38(0)
    v46 = v38
    val v63: Double = v138 + v138
    v26 = v26.updated(0, v38)
    val v136: Double = v77 * v63
    v136
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))
    val v1: Vector[Vector[s3]] = Vector(Vector(s3(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), s1(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))))
    val v2: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}