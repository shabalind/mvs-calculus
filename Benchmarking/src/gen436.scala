import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[Double]
  )
  case class s3 (
    p0: s1,
    p1: Vector[s2]
  )
  def f1(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    val v6: s0 = s0(v5, v5)
    var v3: s0 = v0
    val v2: Vector[Vector[Double]] = v0.p0
    val v1: Vector[Vector[Double]] = v0.p1
    val v9: Vector[Vector[Double]] = v0.p0
    val v14: Vector[Vector[Double]] = v3.p1
    val v30: s0 = s0(v9, v5)
    v3 = v3.copy(p1 = v1)
    v3 = v3.copy(p1 = v1)
    var v29: s0 = v3
    val v21: Vector[Vector[Double]] = v30.p0
    val v26: Vector[Vector[Double]] = v29.p0
    v3 = v3.copy(p0 = v2)
    val v24: Vector[Vector[Double]] = v0.p0
    val v39: s0 = s0(v24, v26)
    val v18: Vector[Vector[Double]] = v0.p1
    v3 = v0
    val v42: Vector[Vector[Double]] = v0.p1
    var v38: s0 = v39
    val v70: Vector[Vector[Double]] = v39.p0
    v38 = v38.copy(p1 = v14)
    var v46: s0 = v30
    v46 = v46.copy(p1 = v5)
    val v31: Vector[Vector[Double]] = v29.p1
    v3 = v3.copy(p1 = v26)
    v38 = v38.copy(p1 = v18)
    v3 = v3.copy(p0 = v26)
    v3 = v3.copy(p0 = v2)
    v38 = v38.copy(p0 = v18)
    val v64: s0 = s0(v42, v21)
    v46 = v64
    v46 = v46.copy(p1 = v2)
    val v119: Vector[Vector[Double]] = v46.p0
    var v173: s0 = v64
    val v91: Vector[Vector[Double]] = v46.p1
    val v114: Vector[Vector[Double]] = v6.p1
    v173 = v38
    v38 = v38.copy(p1 = v119)
    v38 = v38.copy(p0 = v91)
    v173 = v0
    v29 = v29.copy(p1 = v70)
    v38 = v38.copy(p0 = v31)
    v46 = v46.copy(p1 = v119)
    v173 = v173.copy(p0 = v114)
    val v177: Vector[Vector[Double]] = v173.p0
    v3 = v3.copy(p1 = v177)
    v173
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v5: s1 = v0.p0
    val v3: s0 = v5.p1
    val v6: s0 = f1(v3)
    var v2: Double = v1
    val v4: Vector[Vector[Double]] = v6.p1
    val v9: Vector[Double] = v4(0)
    var v11: Vector[Double] = v9
    v11 = v11.updated(0, v1)
    val v17: Double = v11(0)
    v11 = v11.updated(0, v17)
    v11 = v11.updated(0, v1)
    val v33: Vector[Double] = Vector(v2, v2, v2, v2, v17)
    v11 = v11.updated(0, v1)
    val v20: Double = v33(4)
    v11 = v11.updated(0, v20)
    v11 = v11.updated(0, v17)
    v20
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), Vector(s2(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), Vector(10.0, 11.0)), s2(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), Vector(14.0, 15.0))))
    val v1: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}