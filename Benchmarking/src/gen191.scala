import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s1]
  )
  def f85(v0: Vector[s0]): Vector[s0] = {
    var v5: Vector[s0] = v0
    var v4: Vector[s0] = v5
    val v1: s0 = v4(0)
    v4 = v4.updated(0, v1)
    var v3: s0 = v1
    val v9: Vector[Vector[Double]] = v3.p1
    var v17: Vector[s0] = v4
    val v15: Vector[Vector[Double]] = v3.p0
    v17 = v17.updated(0, v1)
    var v23: Vector[Vector[Double]] = v9
    v5 = v17
    v3 = v3.copy(p1 = v15)
    v3 = v3.copy(p0 = v23)
    v4 = v4.updated(0, v3)
    v17
  }
  def f77(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    var v7: Vector[Vector[Double]] = v5
    var v1: s0 = v0
    v1 = v1.copy(p0 = v5)
    var v3: Vector[Vector[Double]] = v5
    val v4: s0 = s0(v5, v3)
    v1 = v1.copy(p1 = v3)
    val v6: Vector[Vector[Double]] = v1.p0
    val v12: Vector[Vector[Double]] = v0.p0
    v7 = v6
    v1 = v1.copy(p0 = v7)
    v1 = v1.copy(p0 = v12)
    val v33: Vector[Vector[Double]] = v4.p0
    v1 = v1.copy(p0 = v3)
    var v29: Vector[Vector[Double]] = v12
    v1 = v1.copy(p1 = v33)
    val v41: Vector[Vector[Double]] = v0.p1
    val v70: Vector[Vector[Double]] = v1.p0
    v1 = v1.copy(p0 = v29)
    v1 = v1.copy(p1 = v41)
    val v58: s0 = s0(v70, v33)
    v1 = v1.copy(p0 = v70)
    v1 = v1.copy(p0 = v41)
    v58
  }
  def f40(v0: Vector[s0]): Vector[s0] = {
    var v3: Vector[s0] = v0
    val v2: Vector[s0] = f85(v0)
    val v5: s0 = v3(0)
    val v1: Vector[Vector[Double]] = v5.p1
    var v6: Vector[Vector[Double]] = v1
    val v4: Vector[Double] = v6(1)
    val v13: Vector[Vector[Double]] = v5.p0
    val v8: s0 = f77(v5)
    val v10: s0 = v3(0)
    val v11: Vector[Vector[Double]] = v8.p1
    var v12: s0 = v8
    val v14: Vector[Vector[Double]] = v10.p1
    v12 = v12.copy(p0 = v14)
    val v22: Vector[Vector[Double]] = v8.p1
    val v19: Vector[s0] = f85(v2)
    v12 = v12.copy(p0 = v11)
    v12 = v12.copy(p1 = v13)
    v6 = v6.updated(0, v4)
    v12 = v12.copy(p1 = v22)
    val v30: Vector[Vector[Double]] = v10.p0
    v12 = v12.copy(p1 = v1)
    v3 = v3.updated(0, v10)
    v12 = v12.copy(p0 = v6)
    var v29: s0 = v8
    v6 = v6.updated(1, v4)
    val v39: s0 = s0(v6, v30)
    val v38: s0 = f77(v29)
    val v51: Vector[Vector[Double]] = v12.p1
    val v34: Vector[s0] = f85(v19)
    val v59: Vector[Double] = v51(1)
    v3 = v3.updated(0, v5)
    v6 = v6.updated(2, v59)
    v29 = v29.copy(p0 = v14)
    v29 = v29.copy(p1 = v1)
    v29 = v29.copy(p1 = v30)
    val v109: Vector[Vector[Double]] = v38.p0
    val v105: s0 = s0(v6, v6)
    val v150: Vector[s0] = f85(v34)
    v12 = v12.copy(p1 = v11)
    v12 = v12.copy(p1 = v14)
    v12 = v39
    var v89: Vector[s0] = v150
    v29 = v29.copy(p1 = v109)
    v89 = v89.updated(0, v105)
    v3 = v3.updated(0, v29)
    v12 = v12.copy(p1 = v1)
    v29 = v29.copy(p0 = v13)
    v89
  }
  @noinline
  def f0(v0: s3, v1: Vector[s0], v2: Double): Double = {
    val v3: Vector[s0] = f40(v1)
    val v4: s0 = v3(0)
    val v10: Vector[Vector[Double]] = v4.p0
    val v23: Vector[Double] = v10(0)
    val v105: Double = v23(0)
    v105
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))
    val v2: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}