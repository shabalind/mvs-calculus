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
  def f24(v0: s0, v1: Double): Double = {
    var v7: s0 = v0
    val v2: Vector[Vector[Double]] = v7.p1
    val v9: Vector[Vector[Double]] = v7.p0
    v7 = v7.copy(p0 = v9)
    val v22: Vector[Double] = v2(0)
    val v12: Double = v22(0)
    val v11: Vector[Vector[Double]] = v0.p1
    val v29: Vector[Double] = v2(0)
    v7 = v7.copy(p0 = v11)
    var v21: Double = v12
    val v41: Double = v29(0)
    v21 = v41
    v7 = v7.copy(p1 = v11)
    v21
  }
  def f22(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p0
    var v5: Vector[Vector[Double]] = v2
    val v6: s0 = s0(v2, v2)
    var v7: s0 = v6
    val v4: Vector[Double] = v2(0)
    val v3: Vector[Vector[Double]] = v6.p1
    val v8: Double = v4(0)
    val v11: Vector[Vector[Double]] = v0.p1
    val v17: Vector[Vector[Vector[Double]]] = Vector(v11, v11, v2, v3)
    val v12: Vector[Vector[Double]] = v0.p1
    val v21: Vector[Double] = v11(0)
    val v15: Double = f24(v6, v8)
    v7 = v7.copy(p1 = v5)
    v7 = v7.copy(p1 = v12)
    var v26: s0 = v6
    var v18: Vector[Double] = v21
    val v10: Double = f24(v6, v15)
    var v20: Vector[Vector[Double]] = v2
    var v14: Vector[Vector[Vector[Double]]] = v17
    var v40: s0 = v7
    v7 = v7.copy(p0 = v11)
    var v27: Vector[Vector[Double]] = v20
    v7 = v7.copy(p1 = v11)
    var v25: Vector[Vector[Double]] = v11
    v40 = v40.copy(p1 = v5)
    val v22: Vector[Vector[Double]] = v17(2)
    val v33: Vector[Vector[Double]] = v26.p0
    val v61: Double = f24(v6, v10)
    v14 = v14.updated(1, v5)
    v27 = v27.updated(0, v4)
    val v28: Double = f24(v40, v61)
    val v32: Vector[Vector[Double]] = v7.p0
    val v42: Vector[Double] = v32(0)
    v14 = v14.updated(0, v32)
    v18 = v18.updated(0, v28)
    val v69: Vector[Vector[Double]] = v17(3)
    v26 = v26.copy(p1 = v20)
    v40 = v40.copy(p0 = v3)
    v27 = v12
    v7 = v7.copy(p1 = v33)
    v27 = v27.updated(0, v21)
    v27 = v27.updated(0, v42)
    val v114: Vector[Vector[Double]] = v26.p0
    val v54: Vector[Vector[Double]] = v14(3)
    v25 = v25.updated(0, v4)
    v20 = v20.updated(0, v4)
    v5 = v5.updated(0, v42)
    val v51: Vector[Double] = v22(0)
    v27 = v27.updated(0, v51)
    val v135: Vector[Double] = v54(0)
    var v132: Vector[Double] = v135
    v5 = v5.updated(0, v18)
    v20 = v20.updated(0, v18)
    val v56: Vector[Vector[Double]] = v6.p0
    val v82: Vector[Vector[Double]] = v26.p1
    v14 = v14.updated(2, v56)
    v40 = v40.copy(p0 = v20)
    v5 = v5.updated(0, v132)
    v14 = v14.updated(2, v11)
    v7 = v7.copy(p1 = v25)
    v7 = v7.copy(p0 = v27)
    val v190: Vector[Double] = v82(0)
    v5 = v5.updated(0, v51)
    v7 = v7.copy(p1 = v5)
    v5 = v5.updated(0, v190)
    v14 = v14.updated(0, v114)
    v5 = v69
    v40
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v4: Vector[s0] = v0.p0
    val v7: s0 = v4(1)
    val v17: s0 = f22(v7)
    val v24: Vector[Vector[Double]] = v7.p0
    val v30: Vector[Double] = v24(0)
    val v81: Double = v30(0)
    val v51: Double = f24(v17, v81)
    v51
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}