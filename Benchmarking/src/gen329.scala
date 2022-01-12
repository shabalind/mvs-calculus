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
  def f50(v0: s1): s1 = {
    var v37: s1 = v0
    v37
  }
  def f41(v0: s0): s0 = {
    var v7: s0 = v0
    var v8: s0 = v0
    var v2: s0 = v7
    var v3: s0 = v8
    val v10: Vector[Vector[Double]] = v3.p1
    val v4: Vector[Vector[Double]] = v2.p1
    v7 = v7.copy(p1 = v4)
    var v1: Vector[Vector[Double]] = v10
    var v12: Vector[Vector[Double]] = v4
    var v6: Vector[Vector[Double]] = v12
    val v22: Vector[s0] = Vector(v8, v0, v0, v7, v2, v2)
    val v31: Vector[Vector[Double]] = v2.p0
    val v19: Vector[Double] = v1(0)
    val v28: Vector[Vector[Double]] = v0.p0
    v2 = v7
    v1 = v1.updated(0, v19)
    var v18: Vector[s0] = v22
    val v16: Vector[Double] = v4(0)
    v7 = v7.copy(p0 = v31)
    v18 = v18.updated(2, v0)
    val v24: Vector[Vector[Double]] = v3.p0
    var v21: Vector[Double] = v16
    v18 = v18.updated(0, v3)
    val v37: Vector[Vector[Double]] = v8.p1
    val v29: s0 = v22(4)
    v7 = v7.copy(p1 = v6)
    val v60: Vector[Double] = v4(0)
    val v62: Vector[Vector[Double]] = v2.p0
    val v35: Vector[Vector[Double]] = v7.p1
    v6 = v6.updated(0, v19)
    val v39: Double = v19(0)
    v1 = v1.updated(0, v21)
    v7 = v7.copy(p1 = v35)
    v3 = v3.copy(p0 = v24)
    var v32: Vector[Vector[Double]] = v62
    v3 = v3.copy(p0 = v62)
    v2 = v2.copy(p0 = v28)
    v3 = v3.copy(p0 = v32)
    val v57: Vector[Vector[Double]] = v0.p1
    v6 = v6.updated(0, v60)
    var v40: Double = v39
    val v61: Vector[Vector[Double]] = v29.p1
    v2 = v2.copy(p1 = v37)
    v7 = v7.copy(p0 = v32)
    v7 = v7.copy(p1 = v35)
    v7 = v7.copy(p1 = v57)
    v2 = v2.copy(p1 = v61)
    v21 = v21.updated(0, v40)
    val v74: s0 = v18(5)
    v2 = v2.copy(p0 = v31)
    v74
  }
  def f21(v0: s1, v1: s1): s1 = {
    var v3: s1 = v1
    var v7: s1 = v3
    val v5: Vector[s0] = v7.p0
    val v9: s1 = f50(v7)
    var v10: Vector[s0] = v5
    v3 = v3.copy(p0 = v10)
    v9
  }
  def f13(v0: s0): s0 = {
    var v6: s0 = v0
    val v3: Vector[Vector[Double]] = v0.p0
    v6 = v6.copy(p0 = v3)
    var v12: s0 = v0
    val v20: s0 = f41(v6)
    v6 = v12
    val v25: s0 = f41(v20)
    v25
  }
  @noinline
  def f0(v0: Vector[s0], v1: Vector[s0], v2: Double): Double = {
    var v8: Vector[s0] = v0
    v8 = v0
    val v12: s0 = v8(0)
    v8 = v8.updated(0, v12)
    v8 = v0
    val v11: s0 = f13(v12)
    val v17: Vector[Vector[Double]] = v11.p1
    v8 = v8.updated(0, v11)
    val v24: s0 = v8(0)
    val v68: Vector[Double] = v17(0)
    val v19: s0 = v8(0)
    v8 = v8.updated(0, v19)
    val v23: s1 = s1(v0, v11)
    val v50: s0 = f13(v24)
    v8 = v8.updated(0, v50)
    var v73: Vector[Double] = v68
    val v30: s1 = f21(v23, v23)
    var v32: Double = v2
    val v47: Double = v68(0)
    v73 = v73.updated(0, v47)
    v8 = v8.updated(0, v12)
    val v84: Double = v73(0)
    val v80: s0 = v30.p1
    v8 = v8.updated(0, v80)
    val v98: Double = v84 + v32
    v98
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))
    val v2: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}