import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  def f8(v0: Double): Double = {
    var v6: Double = v0
    v6 = v0
    v6 = v0
    var v9: Double = v0
    var v2: Double = v9
    var v7: Double = v6
    var v5: Double = v7
    val v3: Vector[Double] = Vector(v6, v5, v5, v5, v0, v5, v6)
    var v21: Vector[Double] = v3
    v21 = v21.updated(5, v0)
    val v12: Double = v21(4)
    v21 = v21.updated(1, v0)
    v21 = v21.updated(2, v6)
    var v14: Vector[Double] = v21
    var v13: Double = v2
    var v20: Vector[Double] = v21
    v20 = v20.updated(0, v6)
    var v35: Double = v0
    val v18: Double = v14(2)
    var v22: Vector[Double] = v3
    var v19: Double = v13
    v14 = v3
    var v36: Double = v35
    v20 = v20.updated(1, v9)
    val v25: Double = v20(4)
    v14 = v14.updated(4, v12)
    var v76: Vector[Double] = v21
    v22 = v22.updated(4, v25)
    var v43: Double = v18
    v22 = v22.updated(6, v7)
    var v15: Double = v13
    val v26: Double = v76(5)
    var v23: Double = v12
    val v27: Double = v22(5)
    v22 = v22.updated(2, v15)
    val v40: Vector[Double] = Vector(v5, v25, v27, v26)
    v76 = v22
    var v31: Double = v35
    var v38: Vector[Double] = v40
    val v29: Double = v21(2)
    val v48: Vector[Double] = Vector(v43, v36, v36, v25, v29)
    v22 = v22.updated(6, v27)
    val v55: Double = v48(2)
    val v32: Double = v3(3)
    val v39: Double = v3(0)
    val v171: Double = v21(4)
    var v69: Double = v55
    var v56: Vector[Double] = v48
    v38 = v38.updated(3, v15)
    v14 = v14.updated(0, v23)
    val v79: Double = v56(4)
    v76 = v76.updated(3, v19)
    val v58: Double = v48(2)
    v19 = v32
    v69 = v171
    val v118: Double = v38(3)
    v38 = v38.updated(3, v0)
    v38 = v38.updated(2, v31)
    val v143: Double = v38(2)
    v20 = v20.updated(6, v58)
    v69 = v143
    v38 = v38.updated(2, v39)
    v22 = v22.updated(1, v79)
    v20 = v20.updated(2, v118)
    v69
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v8: Double = f8(v1)
    var v19: Double = v8
    v19
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(0.0, Vector(Vector(1.0), Vector(2.0))), Vector(Vector(s0(3.0, Vector(Vector(4.0), Vector(5.0)))), Vector(s0(6.0, Vector(Vector(7.0), Vector(8.0)))), Vector(s0(9.0, Vector(Vector(10.0), Vector(11.0))))))))
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