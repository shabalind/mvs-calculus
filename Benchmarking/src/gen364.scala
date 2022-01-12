import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: s2,
    p1: Vector[s2]
  )
  case class s5 (
    p0: Vector[Vector[s2]],
    p1: s2,
    p2: s0
  )
  case class s6 (
    p0: s5,
    p1: Double
  )
  case class s9 (
    p0: s3,
    p1: s6
  )
  def f5(v0: s6): s6 = {
    var v1: s6 = v0
    val v6: Vector[s6] = Vector(v0, v0)
    val v4: s6 = v6(0)
    val v2: Double = v0.p1
    val v8: s6 = v6(0)
    v1 = v1.copy(p1 = v2)
    val v7: Double = v8.p1
    val v3: Double = v1.p1
    v1 = v1.copy(p1 = v3)
    val v12: s6 = v6(0)
    v1 = v1.copy(p1 = v7)
    val v5: s6 = v6(0)
    val v11: s5 = v5.p0
    v1 = v1.copy(p0 = v11)
    v1 = v1.copy(p1 = v2)
    val v15: s5 = v12.p0
    val v17: Double = v4.p1
    val v35: s6 = v6(0)
    var v18: s6 = v0
    val v34: Double = v18.p1
    val v64: Double = v35.p1
    v1 = v1.copy(p1 = v64)
    val v32: Vector[s5] = Vector(v11, v11, v11, v15)
    val v53: Double = v17 + v3
    var v29: Double = v53
    v18 = v18.copy(p1 = v34)
    var v56: Double = v34
    v18 = v18.copy(p1 = v56)
    v18 = v18.copy(p1 = v64)
    v18 = v18.copy(p1 = v3)
    v18 = v18.copy(p1 = v29)
    val v84: s5 = v32(0)
    val v184: s6 = s6(v84, v56)
    v184
  }
  @noinline
  def f0(v0: Vector[Vector[s9]], v1: Double): Double = {
    val v4: Vector[s9] = v0(0)
    var v5: Vector[s9] = v4
    val v3: Vector[s9] = v0(0)
    val v11: s9 = v5(0)
    val v7: s3 = v11.p0
    val v6: s2 = v7.p0
    val v10: s0 = v6.p0
    v5 = v5.updated(0, v11)
    val v2: Double = v1 * v1
    val v22: s9 = v4(0)
    val v8: Double = v1 / v1
    var v15: Double = v2
    var v18: Double = v1
    val v14: s9 = v3(0)
    var v43: s9 = v22
    v5 = v5.updated(0, v43)
    v43 = v43.copy(p0 = v7)
    var v17: Double = v15
    val v29: s6 = v14.p1
    val v39: Vector[s6] = Vector(v29, v29)
    v43 = v43.copy(p0 = v7)
    val v37: Vector[Vector[Double]] = v10.p1
    val v135: s6 = v39(0)
    val v55: s6 = f5(v135)
    val v75: Double = v55.p1
    val v46: Vector[Double] = v37(1)
    v17 = v8
    val v82: Double = v46(0)
    val v116: Vector[Double] = Vector(v8, v17, v75, v18, v75, v82, v2)
    val v96: Double = v116(4)
    v96
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s9]] = Vector(Vector(s9(s3(s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s2(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), s2(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), s2(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))))), s6(s5(Vector(Vector(s2(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))), s2(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0)))), 39.0))))
    val v1: Double = 40.0
    val start = nanoTime()
    var result: Double = 40.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}