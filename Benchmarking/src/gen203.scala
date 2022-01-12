import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  def f83(v0: Vector[Double]): Vector[Double] = {
    var v2: Vector[Double] = v0
    var v6: Vector[Double] = v2
    v2 = v0
    var v1: Vector[Double] = v0
    var v4: Vector[Double] = v0
    var v7: Vector[Double] = v2
    var v3: Vector[Double] = v4
    var v8: Vector[Double] = v3
    v8 = v1
    var v10: Vector[Double] = v4
    val v14: Double = v4(0)
    var v5: Double = v14
    val v11: Double = v6(0)
    v8 = v8.updated(0, v5)
    var v12: Vector[Double] = v4
    val v13: Vector[Vector[Double]] = Vector(v10, v7, v1, v6, v12, v1, v10)
    v6 = v6.updated(0, v11)
    val v17: Double = v11 * v14
    v3 = v3.updated(0, v11)
    val v16: Vector[Double] = v13(0)
    var v18: Double = v5
    v8 = v7
    var v31: Vector[Vector[Double]] = v13
    var v19: Double = v17
    val v23: Double = v6(0)
    val v49: Double = v2(0)
    val v39: Vector[Vector[Double]] = Vector(v2, v8)
    var v27: Vector[Vector[Double]] = v31
    val v32: Vector[Double] = v39(1)
    var v69: Double = v23
    val v25: Vector[Double] = v39(0)
    var v30: Vector[Vector[Double]] = v27
    val v55: Vector[Double] = v39(1)
    v12 = v12.updated(0, v18)
    var v48: Vector[Vector[Double]] = v30
    val v75: Double = v7(0)
    val v41: Vector[Double] = v30(4)
    val v47: Vector[Double] = v27(5)
    val v157: Double = v25(0)
    val v117: Vector[Vector[Double]] = Vector(v16, v32, v2)
    var v43: Vector[Vector[Double]] = v117
    v8 = v8.updated(0, v69)
    val v93: Double = v75 + v19
    var v62: Double = v11
    var v94: Vector[Vector[Double]] = v43
    v94 = v94.updated(1, v8)
    v2 = v2.updated(0, v49)
    v31 = v31.updated(2, v55)
    val v72: Vector[Double] = v94(0)
    var v81: Double = v62
    var v73: Vector[Vector[Double]] = v94
    v94 = v94.updated(1, v47)
    v3 = v3.updated(0, v157)
    val v135: Double = v41(0)
    var v108: Vector[Vector[Double]] = v73
    v31 = v48
    var v109: Double = v93
    v7 = v7.updated(0, v135)
    var v123: Vector[Vector[Double]] = v108
    v1 = v1.updated(0, v109)
    val v95: Vector[Double] = v123(1)
    var v144: Double = v81
    v12 = v12.updated(0, v144)
    v48 = v48.updated(2, v72)
    v1 = v1.updated(0, v5)
    v10 = v10.updated(0, v135)
    v95
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v2: Vector[Double] = Vector(v1)
    var v5: Vector[Double] = v2
    val v15: Double = v5(0)
    v5 = v5.updated(0, v1)
    v5 = v5.updated(0, v1)
    val v16: Vector[Double] = f83(v5)
    val v27: Double = v16(0)
    val v21: Double = v5(0)
    v5 = v5.updated(0, v27)
    v5 = v5.updated(0, v1)
    v5 = v5.updated(0, v15)
    var v34: Double = v15
    v5 = v5.updated(0, v34)
    var v45: Double = v15
    var v92: Double = v27
    v5 = v5.updated(0, v45)
    val v188: Vector[Double] = Vector(v45, v21, v92, v34)
    var v109: Vector[Double] = v188
    val v95: Double = v109(1)
    v95
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s1(s0(Vector(Vector(0.0))), s0(Vector(Vector(1.0)))), Vector(s0(Vector(Vector(2.0))), s0(Vector(Vector(3.0))))), s2(s1(s0(Vector(Vector(4.0))), s0(Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0))), s0(Vector(Vector(7.0))))), s2(s1(s0(Vector(Vector(8.0))), s0(Vector(Vector(9.0)))), Vector(s0(Vector(Vector(10.0))), s0(Vector(Vector(11.0))))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}