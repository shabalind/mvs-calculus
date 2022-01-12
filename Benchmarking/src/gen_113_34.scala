import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  def f21(v0: Double): Double = {
    var v1: Double = v0
    v1 = v0
    var v2: Double = v1
    var v5: Double = v0
    var v3: Double = v1
    var v6: Double = v0
    var v7: Double = v3
    var v11: Double = v5
    var v9: Double = v3
    var v15: Double = v7
    var v14: Double = v11
    v7 = v5
    v6 = v11
    var v23: Double = v15
    v5 = v1
    var v18: Double = v6
    var v25: Double = v15
    var v17: Double = v2
    val v16: Vector[Double] = Vector(v3)
    var v34: Double = v17
    var v35: Vector[Double] = v16
    var v55: Double = v23
    val v32: Double = v16(0)
    val v59: Double = v35(0)
    v35 = v35.updated(0, v59)
    var v26: Double = v9
    var v27: Vector[Double] = v35
    v27 = v27.updated(0, v3)
    val v69: Double = v16(0)
    var v31: Vector[Double] = v27
    var v38: Double = v26
    v35 = v35.updated(0, v38)
    var v29: Double = v0
    v27 = v27.updated(0, v34)
    v27 = v27.updated(0, v0)
    v35 = v31
    var v70: Vector[Double] = v35
    var v42: Vector[Double] = v31
    val v76: Double = v35(0)
    v42 = v42.updated(0, v3)
    v34 = v76
    var v43: Vector[Double] = v70
    val v78: Double = v42(0)
    var v92: Double = v6
    v3 = v9
    v43 = v43.updated(0, v29)
    v31 = v31.updated(0, v69)
    val v50: Double = v43(0)
    val v37: Vector[Double] = Vector(v14, v92, v17, v32, v25, v55)
    v25 = v78
    v70 = v70.updated(0, v50)
    v3 = v7
    var v108: Vector[Double] = v37
    var v106: Double = v50
    v108 = v108.updated(2, v18)
    v35 = v35.updated(0, v106)
    var v117: Vector[Double] = v108
    val v77: Double = v117(5)
    v43 = v43.updated(0, v38)
    v77
  }
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Double): Double = {
    var v20: Double = v1
    val v17: Double = f21(v20)
    var v49: Double = v17
    v49
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0)))))))
    val v1: Double = 10.0
    val start = nanoTime()
    var result: Double = 10.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}