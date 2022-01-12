import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0
  )
  case class s2 (
    p0: Double
  )
  case class s9 (
    p0: s1
  )
  def f98(v0: Double): Double = {
    var v6: Double = v0
    val v4: s2 = s2(v6)
    val v19: Double = v4.p0
    v19
  }
  def f95(v0: s2): s2 = {
    val v7: Double = v0.p0
    val v8: Double = v0.p0
    val v6: Vector[s2] = Vector(v0, v0)
    val v1: Double = f98(v8)
    val v12: s2 = v6(0)
    var v16: s2 = v12
    val v11: Double = f98(v7)
    val v20: Double = f98(v11)
    val v22: Double = v0.p0
    val v24: Double = v22 - v20
    v16 = v16.copy(p0 = v1)
    v16 = v16.copy(p0 = v24)
    v16
  }
  def f52(v0: Double): Double = {
    var v7: Double = v0
    var v2: Double = v0
    val v1: Vector[Double] = Vector(v2, v0, v0, v7, v7)
    val v3: Double = f98(v2)
    var v8: Vector[Double] = v1
    var v6: Double = v3
    var v9: Vector[Double] = v8
    val v11: Double = f98(v6)
    v9 = v9.updated(0, v3)
    val v17: Double = f98(v0)
    val v14: Double = v1(2)
    val v16: Double = v8(0)
    var v25: Vector[Double] = v8
    val v19: Double = v9(2)
    val v27: Vector[Vector[Double]] = Vector(v25, v1, v8, v25, v1)
    val v13: s2 = s2(v7)
    val v30: Double = v9(4)
    v7 = v11
    v8 = v8.updated(2, v19)
    val v26: Vector[Double] = v27(4)
    var v43: Vector[Vector[Double]] = v27
    val v38: Vector[Double] = v43(2)
    v8 = v8.updated(4, v7)
    val v53: Double = v13.p0
    var v36: s2 = v13
    val v42: Double = v36.p0
    var v22: Vector[Double] = v26
    val v51: Double = f98(v0)
    val v125: Double = v38(1)
    val v81: s2 = f95(v13)
    val v90: s2 = f95(v36)
    v36 = v36.copy(p0 = v125)
    var v77: s2 = v36
    val v32: Double = v77.p0
    v8 = v22
    val v68: s2 = f95(v36)
    val v57: Double = v13.p0
    v77 = v77.copy(p0 = v125)
    v43 = v43.updated(4, v38)
    var v55: s2 = v68
    v22 = v22.updated(0, v42)
    val v91: Double = v90.p0
    val v54: Vector[s2] = Vector(v81, v77, v90, v77)
    val v69: s2 = f95(v68)
    v55 = v55.copy(p0 = v14)
    val v78: s2 = f95(v69)
    v22 = v22.updated(4, v53)
    v25 = v25.updated(0, v17)
    val v84: Double = v36.p0
    v55 = v55.copy(p0 = v16)
    v22 = v22.updated(2, v84)
    val v179: s2 = f95(v13)
    v55 = v55.copy(p0 = v6)
    v77 = v77.copy(p0 = v91)
    val v97: Double = v11 - v57
    val v99: s2 = v54(0)
    v36 = v36.copy(p0 = v32)
    val v214: s2 = v54(3)
    val v160: Double = v55.p0
    val v203: Double = f98(v19)
    v7 = v19
    v9 = v9.updated(2, v160)
    v55 = v55.copy(p0 = v203)
    v77 = v78
    v36 = v36.copy(p0 = v0)
    val v279: Double = v214.p0
    v36 = v36.copy(p0 = v53)
    v8 = v8.updated(2, v51)
    v25 = v25.updated(4, v97)
    v55 = v55.copy(p0 = v279)
    val v204: Double = v179.p0
    val v183: s2 = f95(v99)
    v36 = v36.copy(p0 = v204)
    v36 = v36.copy(p0 = v30)
    val v266: Double = v183.p0
    v266
  }
  @noinline
  def f0(v0: Vector[Vector[s9]], v1: Double): Double = {
    var v8: Double = v1
    val v6: Double = f52(v8)
    val v22: Double = f98(v6)
    val v47: Double = f98(v8)
    v8 = v47
    val v91: Double = v47 - v22
    v91
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s9]] = Vector(Vector(s9(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))))), Vector(s9(s1(s0(Vector(Vector(2.0)), Vector(Vector(3.0)))))))
    val v1: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}