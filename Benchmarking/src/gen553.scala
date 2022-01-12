import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f33(v0: s1): s1 = {
    var v4: s1 = v0
    val v5: Vector[s0] = v4.p1
    v4 = v4.copy(p1 = v5)
    var v7: Vector[s0] = v5
    val v2: s0 = v7(0)
    var v12: s1 = v4
    val v1: s0 = v7(0)
    val v3: Vector[s0] = v0.p1
    var v11: s1 = v4
    v7 = v7.updated(0, v2)
    var v10: s1 = v4
    var v24: s1 = v0
    val v14: s0 = v5(0)
    val v16: Vector[s1] = Vector(v12, v0, v11, v10, v24, v4)
    v7 = v7.updated(0, v14)
    var v13: Vector[s1] = v16
    v10 = v10.copy(p0 = v7)
    v7 = v7.updated(0, v14)
    v13 = v13.updated(3, v12)
    val v18: Vector[s0] = v4.p1
    val v31: s0 = v3(0)
    var v36: Vector[s0] = v18
    var v33: s0 = v31
    v11 = v11.copy(p0 = v7)
    v11 = v11.copy(p1 = v36)
    v12 = v12.copy(p1 = v7)
    var v46: Vector[s1] = v13
    val v78: s1 = v46(3)
    val v40: Vector[Vector[Double]] = v1.p1
    v13 = v13.updated(3, v0)
    var v60: s1 = v78
    v4 = v4.copy(p0 = v7)
    val v50: Vector[s0] = v4.p1
    v11 = v10
    v33 = v33.copy(p1 = v40)
    v4 = v4.copy(p0 = v50)
    v36 = v36.updated(0, v33)
    v4 = v4.copy(p0 = v7)
    v60
  }
  def f5(v0: Double): Double = {
    var v3: Double = v0
    val v2: Vector[Double] = Vector(v3)
    var v7: Double = v3
    var v6: Double = v0
    var v5: Double = v3
    var v4: Double = v7
    v5 = v3
    val v10: Double = v2(0)
    var v8: Vector[Double] = v2
    var v14: Vector[Double] = v8
    val v16: Double = v4 + v5
    var v9: Vector[Double] = v14
    v5 = v4
    val v13: Double = v9(0)
    v7 = v6
    var v25: Double = v3
    val v32: Double = v14(0)
    val v17: Double = v14(0)
    val v18: Double = v14(0)
    var v27: Double = v25
    val v28: Double = v8(0)
    var v19: Vector[Double] = v8
    v9 = v9.updated(0, v16)
    v27 = v18
    v14 = v14.updated(0, v17)
    val v21: Double = v19(0)
    v19 = v19.updated(0, v18)
    val v20: Double = v8(0)
    var v55: Double = v27
    v14 = v14.updated(0, v6)
    v19 = v19.updated(0, v32)
    val v38: Double = v19(0)
    var v34: Double = v21
    v8 = v8.updated(0, v55)
    v8 = v8.updated(0, v13)
    v8 = v8.updated(0, v10)
    v3 = v38
    val v46: Vector[Double] = Vector(v28, v13, v38, v20, v16, v25)
    v19 = v19.updated(0, v34)
    var v73: Vector[Double] = v46
    v73 = v73.updated(3, v25)
    v9 = v9.updated(0, v25)
    v34 = v13
    val v43: Double = v73(2)
    v43
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v3: s1 = f33(v0)
    val v5: Vector[s0] = v3.p1
    val v4: s0 = v5(0)
    val v14: Vector[Vector[Double]] = v4.p1
    val v36: Vector[Double] = v14(0)
    val v34: Double = v36(0)
    val v35: Double = f5(v34)
    v35
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))))
    val v1: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}