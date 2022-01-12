import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  def f78(v0: s0): s0 = {
    val v16: s1 = s1(v0, v0)
    val v59: Vector[s1] = Vector(v16, v16, v16, v16, v16, v16)
    val v19: s1 = v59(4)
    val v45: s0 = v16.p1
    val v30: s0 = v16.p1
    var v33: Vector[s1] = v59
    v33 = v33.updated(0, v19)
    val v73: s1 = v33(2)
    var v38: Vector[s1] = v59
    val v70: s0 = v73.p1
    var v119: Vector[s1] = v38
    val v86: s1 = v119(4)
    val v103: s1 = s1(v30, v45)
    v119 = v119.updated(2, v103)
    v33 = v33.updated(2, v86)
    v70
  }
  def f66(v0: s1): s1 = {
    var v5: s1 = v0
    val v2: s0 = v0.p1
    val v4: s0 = f78(v2)
    val v3: s0 = f78(v4)
    v5 = v5.copy(p1 = v3)
    v5 = v5.copy(p1 = v2)
    v5
  }
  def f19(v0: s0): s0 = {
    val v7: s0 = f78(v0)
    val v8: Vector[Double] = v0.p1
    val v4: Vector[Vector[Double]] = v0.p0
    var v14: s0 = v7
    var v20: s0 = v14
    val v13: s0 = f78(v7)
    val v25: s0 = f78(v13)
    val v19: s1 = s1(v13, v25)
    v14 = v14.copy(p0 = v4)
    val v36: s1 = f66(v19)
    val v34: s0 = v36.p1
    v14 = v14.copy(p1 = v8)
    v14 = v14.copy(p1 = v8)
    val v55: Vector[Vector[Double]] = v34.p0
    v14 = v14.copy(p0 = v55)
    val v40: s0 = f78(v20)
    v20 = v40
    val v107: s0 = f78(v40)
    v107
  }
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Double): Double = {
    val v7: Vector[s2] = v0(2)
    val v4: s2 = v7(0)
    val v5: s1 = v4.p0
    val v10: s1 = f66(v5)
    var v17: s1 = v10
    var v18: s1 = v10
    val v21: s0 = v17.p0
    v18 = v18.copy(p1 = v21)
    val v25: s0 = v4.p1
    val v12: s1 = f66(v18)
    v17 = v17.copy(p0 = v25)
    val v20: s0 = v18.p0
    v17 = v17.copy(p1 = v20)
    var v33: s1 = v12
    val v23: s0 = f19(v20)
    val v83: s0 = v12.p1
    val v41: s0 = v5.p0
    v18 = v33
    v33 = v33.copy(p0 = v25)
    val v31: s0 = f78(v41)
    v18 = v18.copy(p1 = v31)
    v18 = v18.copy(p0 = v23)
    val v82: Vector[Vector[Double]] = v83.p0
    var v69: s0 = v41
    v33 = v33.copy(p1 = v23)
    v18 = v18.copy(p0 = v41)
    var v51: s0 = v25
    v17 = v17.copy(p0 = v51)
    val v63: Vector[Double] = v82(0)
    v18 = v18.copy(p1 = v69)
    val v132: Double = v63(0)
    v18 = v18.copy(p0 = v25)
    v132
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(s1(s0(Vector(Vector(0.0)), Vector(1.0, 2.0)), s0(Vector(Vector(3.0)), Vector(4.0, 5.0))), s0(Vector(Vector(6.0)), Vector(7.0, 8.0)))), Vector(s2(s1(s0(Vector(Vector(9.0)), Vector(10.0, 11.0)), s0(Vector(Vector(12.0)), Vector(13.0, 14.0))), s0(Vector(Vector(15.0)), Vector(16.0, 17.0)))), Vector(s2(s1(s0(Vector(Vector(18.0)), Vector(19.0, 20.0)), s0(Vector(Vector(21.0)), Vector(22.0, 23.0))), s0(Vector(Vector(24.0)), Vector(25.0, 26.0)))))
    val v1: Double = 27.0
    val start = nanoTime()
    var result: Double = 27.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}