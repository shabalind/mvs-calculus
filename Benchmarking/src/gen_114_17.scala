import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f35(v0: Double): Double = {
    var v7: Double = v0
    var v6: Double = v0
    val v1: Double = v7 * v0
    var v8: Double = v1
    var v3: Double = v1
    var v5: Double = v8
    var v12: Double = v8
    v8 = v12
    var v13: Double = v3
    var v9: Double = v5
    var v14: Double = v12
    var v29: Double = v5
    var v21: Double = v12
    var v27: Double = v8
    var v15: Double = v6
    var v45: Double = v13
    var v39: Double = v0
    var v32: Double = v3
    val v43: Vector[Double] = Vector(v32, v8, v14, v45, v9, v14)
    var v42: Double = v21
    var v30: Vector[Double] = v43
    v30 = v30.updated(5, v6)
    val v20: Double = v43(2)
    var v19: Vector[Double] = v30
    var v22: Double = v39
    var v46: Vector[Double] = v19
    var v54: Double = v20
    var v31: Vector[Double] = v46
    var v71: Vector[Double] = v46
    val v66: Double = v31(0)
    v46 = v46.updated(2, v3)
    val v38: Vector[Vector[Double]] = Vector(v30, v31, v71)
    v3 = v27
    val v41: Vector[Double] = v38(2)
    v19 = v19.updated(5, v42)
    var v26: Vector[Vector[Double]] = v38
    v31 = v31.updated(4, v15)
    v46 = v46.updated(0, v14)
    v71 = v71.updated(5, v21)
    var v115: Vector[Vector[Double]] = v26
    v26 = v26.updated(2, v30)
    var v85: Vector[Vector[Double]] = v26
    var v124: Vector[Vector[Double]] = v115
    var v90: Double = v45
    v71 = v71.updated(0, v66)
    val v80: Vector[Double] = v26(0)
    v71 = v43
    v85 = v85.updated(2, v80)
    val v57: Vector[Vector[Vector[Double]]] = Vector(v124, v26, v85, v85, v124, v85, v38)
    var v169: Double = v22
    v46 = v46.updated(4, v29)
    v26 = v26.updated(1, v30)
    v30 = v30.updated(2, v90)
    val v123: Vector[Vector[Double]] = v57(0)
    v71 = v71.updated(2, v169)
    val v107: Vector[Double] = v123(1)
    v46 = v46.updated(0, v54)
    val v93: Double = v41(0)
    v71 = v71.updated(4, v93)
    val v105: Double = v107(5)
    v105
  }
  @noinline
  def f0(v0: Vector[s0], v1: Vector[Vector[s0]], v2: Double): Double = {
    val v9: Vector[Double] = Vector(v2, v2, v2, v2)
    val v50: Double = v9(0)
    var v21: Vector[Double] = v9
    var v16: Vector[Double] = v21
    v21 = v21.updated(3, v50)
    val v104: Double = v16(1)
    val v102: Double = f35(v104)
    v102
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))
    val v2: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}