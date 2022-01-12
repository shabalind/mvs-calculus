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
  def f33(v0: Double): Double = {
    val v1: Double = v0 / v0
    var v5: Double = v1
    var v4: Double = v1
    var v3: Double = v0
    v3 = v4
    var v10: Double = v1
    var v6: Double = v10
    v6 = v0
    var v8: Double = v5
    var v2: Double = v10
    var v7: Double = v2
    var v9: Double = v5
    var v11: Double = v0
    var v13: Double = v3
    var v18: Double = v13
    var v15: Double = v6
    var v25: Double = v18
    v3 = v9
    val v12: Vector[Double] = Vector(v3, v15, v3, v0, v9, v0, v10)
    val v31: Vector[Double] = Vector(v15, v11, v10)
    var v24: Double = v25
    var v30: Vector[Double] = v31
    var v34: Vector[Double] = v30
    var v41: Vector[Double] = v12
    val v40: Double = v34(2)
    val v16: Vector[Vector[Double]] = Vector(v12, v41, v41, v12)
    v41 = v41.updated(2, v40)
    v34 = v34.updated(2, v18)
    v10 = v7
    v30 = v30.updated(1, v10)
    v7 = v9
    var v26: Double = v2
    v34 = v34.updated(0, v6)
    v30 = v30.updated(2, v6)
    val v48: Double = v34(1)
    v34 = v34.updated(2, v0)
    val v33: Double = v31(1)
    v30 = v30.updated(2, v33)
    var v67: Vector[Vector[Double]] = v16
    v41 = v41.updated(0, v8)
    var v49: Vector[Vector[Double]] = v67
    var v57: Vector[Vector[Double]] = v49
    val v75: Vector[Double] = v57(3)
    val v32: Double = v75(0)
    v34 = v34.updated(1, v24)
    v15 = v26
    var v52: Double = v11
    v30 = v30.updated(1, v48)
    v34 = v34.updated(2, v52)
    var v62: Double = v32
    v62
  }
  @noinline
  def f0(v0: s1, v1: s1, v2: Double): Double = {
    val v7: Double = f33(v2)
    val v8: Vector[s0] = v1.p0
    val v16: Double = v7 / v7
    val v18: s0 = v8(0)
    val v21: Vector[Vector[Double]] = v18.p0
    val v38: Double = f33(v2)
    var v35: Double = v38
    v35 = v16
    val v96: Double = f33(v7)
    var v50: Double = v16
    val v40: Vector[Double] = v21(1)
    var v73: Vector[Double] = v40
    v73 = v73.updated(0, v35)
    v73 = v73.updated(0, v50)
    v73 = v73.updated(0, v96)
    val v161: Double = v73(0)
    v161
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
    val v1: s1 = s1(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))
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