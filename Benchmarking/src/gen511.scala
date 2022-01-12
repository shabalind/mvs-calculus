import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  def f24(v0: Double): Double = {
    val v7: Vector[Double] = Vector(v0, v0)
    val v2: Double = v7(1)
    var v6: Double = v2
    val v11: Double = v6 / v0
    val v3: Double = v7(1)
    val v8: Double = v7(1)
    val v12: Double = v7(1)
    var v15: Vector[Double] = v7
    var v10: Vector[Double] = v15
    v15 = v15.updated(0, v8)
    val v9: Double = v7(1)
    v10 = v10.updated(1, v11)
    var v16: Vector[Double] = v10
    var v43: Vector[Double] = v16
    v15 = v15.updated(0, v3)
    v43 = v43.updated(0, v12)
    val v46: Double = v43(0)
    val v27: Double = v16(0)
    var v71: Vector[Double] = v43
    var v34: Vector[Double] = v7
    v71 = v71.updated(1, v9)
    var v41: Vector[Double] = v43
    var v39: Vector[Double] = v16
    val v47: Double = v41(0)
    v39 = v39.updated(0, v27)
    v16 = v16.updated(1, v12)
    v15 = v15.updated(0, v0)
    var v38: Vector[Double] = v43
    v39 = v16
    var v26: Vector[Double] = v34
    val v79: Vector[Vector[Double]] = Vector(v39, v38, v16)
    v38 = v38.updated(0, v46)
    v43 = v16
    v43 = v10
    val v50: Vector[Vector[Vector[Double]]] = Vector(v79, v79, v79, v79, v79, v79)
    var v83: Vector[Vector[Vector[Double]]] = v50
    v34 = v71
    var v101: Vector[Double] = v39
    v16 = v26
    var v62: Vector[Vector[Vector[Double]]] = v83
    var v45: Vector[Vector[Double]] = v79
    var v74: Vector[Vector[Vector[Double]]] = v62
    val v40: Vector[Double] = v45(1)
    v71 = v71.updated(0, v47)
    val v61: Double = v101(1)
    val v82: Double = v40(0)
    v10 = v10.updated(0, v3)
    v41 = v41.updated(0, v0)
    v34 = v34.updated(1, v61)
    val v109: Vector[Vector[Double]] = v74(1)
    v45 = v109
    v82
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    var v2: Double = v1
    val v14: Double = f24(v2)
    var v11: Double = v1
    val v160: Double = v14 / v11
    v160
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))), Vector(Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}