import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s3 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  def f3(v0: Vector[Vector[s0]]): Vector[Vector[s0]] = {
    var v2: Vector[Vector[s0]] = v0
    val v6: Vector[s0] = v0(0)
    val v7: s0 = v6(0)
    v2 = v2.updated(0, v6)
    var v4: Vector[Vector[s0]] = v2
    v2 = v2.updated(0, v6)
    var v1: s0 = v7
    var v9: Vector[Vector[s0]] = v4
    var v15: Vector[s0] = v6
    val v25: Vector[Vector[Double]] = v1.p0
    val v30: Vector[Vector[Double]] = v1.p1
    v15 = v15.updated(0, v1)
    var v13: Vector[Vector[Double]] = v25
    v1 = v1.copy(p3 = v13)
    v2 = v2.updated(0, v15)
    v1 = v1.copy(p1 = v30)
    v2 = v4
    v9
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    var v11: s3 = v0
    var v2: s3 = v11
    val v4: Vector[Vector[s0]] = v0.p1
    val v7: Vector[Vector[s0]] = v11.p0
    val v8: Vector[s0] = v7(2)
    val v9: Vector[Vector[s0]] = f3(v4)
    v11 = v11.copy(p1 = v4)
    val v17: Vector[Vector[s0]] = f3(v4)
    var v23: Vector[Vector[s0]] = v17
    val v18: Vector[s0] = v7(0)
    v23 = v4
    var v14: Vector[Vector[s0]] = v7
    val v29: s0 = v8(0)
    var v35: Vector[Vector[s0]] = v9
    val v43: Vector[Vector[Double]] = v29.p3
    v35 = v35.updated(0, v18)
    val v24: Vector[Double] = v43(1)
    val v21: Vector[Vector[s0]] = f3(v35)
    val v31: Vector[s0] = v14(1)
    val v36: Vector[Vector[s0]] = f3(v23)
    val v49: Vector[s0] = v7(2)
    v35 = v35.updated(0, v31)
    val v39: Vector[Vector[s0]] = f3(v36)
    val v73: Vector[s0] = v23(0)
    var v48: Vector[Double] = v24
    v35 = v35.updated(0, v49)
    val v41: Vector[Vector[s0]] = f3(v39)
    v35 = v35.updated(0, v31)
    v2 = v2.copy(p1 = v21)
    v2 = v2.copy(p1 = v9)
    val v87: Vector[Vector[s0]] = f3(v41)
    val v99: Double = v48(0)
    var v129: s3 = v2
    val v57: Vector[s0] = v87(0)
    val v100: Double = v99 * v99
    v48 = v48.updated(0, v1)
    var v92: Vector[Vector[s0]] = v14
    v92 = v92.updated(2, v57)
    v11 = v129
    v23 = v23.updated(0, v73)
    v2 = v2.copy(p0 = v92)
    v100
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0))))), Vector(Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))))
    val v1: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}