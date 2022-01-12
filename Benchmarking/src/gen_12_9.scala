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
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: s0,
    p1: Vector[s2]
  )
  def f94(v0: Double): Double = {
    val v7: Vector[Double] = Vector(v0, v0, v0, v0)
    val v2: Double = v7(2)
    var v6: Double = v2
    v6 = v2
    val v5: Double = v7(2)
    var v4: Double = v5
    var v8: Double = v6
    var v11: Double = v8
    var v15: Double = v8
    val v20: Double = v7(2)
    val v23: Double = v7(1)
    var v25: Vector[Double] = v7
    v6 = v15
    v25 = v25.updated(3, v11)
    v25 = v25.updated(2, v11)
    v25 = v25.updated(1, v15)
    val v24: Double = v25(1)
    var v32: Vector[Double] = v7
    v25 = v25.updated(0, v24)
    v25 = v25.updated(1, v23)
    var v31: Vector[Double] = v7
    var v43: Double = v23
    v31 = v31.updated(3, v43)
    var v22: Vector[Double] = v25
    var v38: Vector[Double] = v25
    val v54: Vector[Vector[Double]] = Vector(v22, v25, v31, v31, v25, v32)
    v32 = v32.updated(0, v15)
    var v40: Vector[Vector[Double]] = v54
    val v41: Double = v38(1)
    v38 = v38.updated(2, v6)
    v40 = v40.updated(1, v31)
    val v55: Double = v20 / v41
    val v145: Vector[Double] = v54(1)
    v38 = v38.updated(0, v15)
    v38 = v38.updated(2, v4)
    v31 = v31.updated(1, v55)
    val v139: Double = v145(0)
    v38 = v38.updated(1, v139)
    val v99: Vector[Double] = v40(1)
    val v152: Double = v99(3)
    v31 = v31.updated(0, v5)
    v152
  }
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    var v3: Double = v1
    val v5: Double = v3 / v3
    val v2: Double = f94(v5)
    var v4: Double = v2
    val v13: Double = f94(v1)
    val v20: Double = v1 * v2
    var v170: Double = v4
    var v101: Double = v1
    val v65: Vector[Double] = Vector(v13, v5, v170, v20, v101, v4, v4)
    val v157: Double = v65(1)
    v157
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), Vector(s2(s1(Vector(Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))))))
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