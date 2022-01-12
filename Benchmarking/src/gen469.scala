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
    p0: s0,
    p1: Vector[s0]
  )
  def f80(v0: s0): s0 = {
    val v2: Vector[s0] = Vector(v0, v0, v0, v0)
    var v6: Vector[s0] = v2
    val v9: s0 = v6(0)
    v6 = v6.updated(3, v0)
    v6 = v6.updated(1, v0)
    v6 = v6.updated(3, v0)
    v6 = v6.updated(1, v0)
    v6 = v6.updated(0, v0)
    var v12: Vector[s0] = v6
    val v21: s0 = v12(1)
    v6 = v6.updated(1, v0)
    val v17: s1 = s1(v9, v21)
    val v33: s0 = v2(3)
    v6 = v6.updated(0, v21)
    var v44: s1 = v17
    v44 = v44.copy(p0 = v9)
    v44 = v44.copy(p1 = v0)
    v6 = v6.updated(2, v33)
    v44 = v44.copy(p0 = v0)
    v44 = v44.copy(p1 = v33)
    v44 = v44.copy(p1 = v0)
    val v40: s0 = v44.p1
    v44 = v44.copy(p1 = v9)
    v40
  }
  def f76(v0: s0): s0 = {
    var v4: s0 = v0
    val v6: Vector[Vector[Double]] = v0.p1
    val v3: Vector[Vector[Double]] = v4.p0
    val v5: Vector[Vector[Double]] = v0.p1
    val v8: s0 = f80(v4)
    v4 = v8
    val v11: Vector[Vector[Double]] = v8.p0
    v4 = v8
    val v13: s0 = s0(v11, v6)
    v4 = v4.copy(p0 = v11)
    v4 = v4.copy(p1 = v5)
    val v14: s0 = f80(v0)
    val v49: s0 = f80(v4)
    val v27: s0 = f80(v13)
    v4 = v4.copy(p0 = v3)
    val v38: Vector[Vector[Double]] = v49.p0
    v4 = v4.copy(p0 = v38)
    v4 = v4.copy(p0 = v38)
    val v23: Vector[Vector[Double]] = v0.p1
    var v36: s0 = v27
    v36 = v36.copy(p1 = v23)
    val v39: Vector[Vector[Double]] = v14.p1
    v4 = v4.copy(p1 = v39)
    val v42: s0 = f80(v36)
    v36 = v27
    v36 = v36.copy(p1 = v23)
    v42
  }
  def f54(v0: s0): s0 = {
    val v5: s0 = f80(v0)
    val v3: Vector[s0] = Vector(v5)
    val v4: s0 = f76(v5)
    val v10: s0 = v3(0)
    var v15: s0 = v5
    val v30: s0 = f80(v4)
    var v18: Vector[s0] = v3
    v18 = v3
    v18 = v18.updated(0, v0)
    val v71: s0 = f80(v10)
    v18 = v18.updated(0, v10)
    val v40: s0 = v18(0)
    val v32: Vector[Vector[Double]] = v30.p1
    v15 = v15.copy(p1 = v32)
    val v69: s1 = s1(v40, v71)
    val v76: s0 = v69.p1
    v18 = v18.updated(0, v15)
    v76
  }
  @noinline
  def f0(v0: s2, v1: s0, v2: Double): Double = {
    val v3: s0 = f54(v1)
    val v7: Vector[Vector[Double]] = v3.p1
    val v29: Vector[Double] = v7(1)
    var v22: Double = v2
    val v28: Double = v29(0)
    var v183: Double = v28
    val v151: Double = v183 + v22
    val v189: Double = v151 - v151
    var v133: Double = v189
    v133
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))))
    val v1: s0 = s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))
    val v2: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}