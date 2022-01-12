import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  def f32(v0: s0): s0 = {
    val v1: Vector[s0] = Vector(v0, v0, v0, v0, v0)
    var v7: s0 = v0
    var v5: s0 = v7
    var v6: s0 = v5
    val v2: Vector[Vector[Double]] = v0.p0
    val v4: s0 = v1(2)
    val v13: s0 = v1(3)
    var v19: Vector[s0] = v1
    val v20: Vector[Vector[Double]] = v13.p0
    val v11: Vector[Vector[Double]] = v4.p0
    val v23: Vector[Vector[Double]] = v13.p1
    val v16: s0 = s0(v2, v23)
    val v28: Vector[Vector[Double]] = v5.p0
    val v24: Vector[Vector[Vector[Double]]] = Vector(v28, v11, v20, v2, v28, v28, v11)
    val v30: Vector[Vector[Double]] = v24(5)
    val v41: s0 = s0(v20, v23)
    v6 = v6.copy(p0 = v20)
    val v35: Vector[Vector[Double]] = v6.p1
    val v26: s0 = v19(2)
    val v14: s0 = v19(3)
    val v40: s0 = v19(1)
    v19 = v19.updated(0, v13)
    v19 = v19.updated(1, v4)
    val v73: Vector[Vector[Double]] = v40.p1
    val v47: s0 = v1(0)
    var v44: s0 = v14
    v5 = v5.copy(p1 = v73)
    val v39: Vector[Vector[Double]] = v47.p0
    v19 = v19.updated(3, v41)
    val v54: Vector[Vector[Double]] = v44.p0
    val v64: Vector[Vector[Double]] = v16.p0
    v5 = v5.copy(p0 = v54)
    v44 = v7
    v44 = v44.copy(p1 = v35)
    v5 = v5.copy(p1 = v73)
    val v107: Vector[Vector[Double]] = v26.p1
    var v78: Vector[Vector[Double]] = v30
    v44 = v44.copy(p0 = v39)
    val v97: Vector[Vector[Double]] = v26.p1
    v7 = v7.copy(p1 = v23)
    val v244: s0 = s0(v78, v107)
    v44 = v44.copy(p0 = v64)
    v6 = v6.copy(p1 = v97)
    v244
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v3: Vector[s1] = v0(1)
    val v7: Vector[s1] = v0(1)
    var v2: Vector[s1] = v7
    val v4: s1 = v2(0)
    val v5: s1 = v3(0)
    var v8: Double = v1
    var v11: Vector[s1] = v2
    val v9: s1 = v7(0)
    v11 = v11.updated(0, v9)
    var v18: s1 = v5
    v11 = v11.updated(0, v4)
    val v23: s1 = v11(0)
    v2 = v2.updated(0, v4)
    val v20: s0 = v23.p1
    v2 = v2.updated(0, v18)
    val v42: Vector[Vector[Double]] = v20.p0
    val v15: s0 = f32(v20)
    v11 = v7
    v18 = v18.copy(p1 = v15)
    var v63: s1 = v23
    val v19: Vector[Double] = v42(2)
    v63 = v63.copy(p1 = v20)
    val v55: s0 = f32(v20)
    val v38: s0 = f32(v15)
    v2 = v2.updated(0, v63)
    val v77: Double = v19(0)
    val v33: s0 = v9.p1
    var v49: Double = v8
    v63 = v63.copy(p1 = v33)
    val v32: Vector[Vector[Double]] = v55.p1
    val v36: s0 = f32(v38)
    v18 = v18.copy(p1 = v36)
    var v29: Vector[Vector[Double]] = v32
    var v52: Vector[Vector[Double]] = v32
    val v45: Vector[Vector[Double]] = v20.p0
    val v93: Vector[Vector[Double]] = v38.p1
    var v40: Vector[Vector[Double]] = v45
    val v65: s0 = s0(v40, v52)
    val v46: Vector[Double] = v32(0)
    val v60: s0 = f32(v20)
    v63 = v63.copy(p1 = v65)
    val v37: Vector[Double] = v93(0)
    v52 = v52.updated(0, v37)
    val v112: s0 = f32(v60)
    val v98: Vector[Double] = v29(0)
    val v194: Double = v49 + v77
    v63 = v63.copy(p1 = v112)
    v52 = v52.updated(0, v98)
    v40 = v40.updated(0, v46)
    v194
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))))
    val v1: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}