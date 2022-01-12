import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  def f31(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Double] = v7(1)
    var v8: s0 = v0
    v8 = v0
    var v15: Vector[Vector[Double]] = v7
    v15 = v15.updated(1, v4)
    v8 = v8.copy(p0 = v7)
    v8 = v8.copy(p0 = v15)
    val v24: Vector[Vector[Double]] = v0.p1
    v8 = v8.copy(p0 = v15)
    val v29: Vector[Vector[Double]] = v0.p0
    val v31: Vector[Vector[Double]] = v0.p1
    val v65: Vector[Vector[Double]] = v0.p1
    var v46: Vector[Vector[Double]] = v7
    v8 = v8.copy(p1 = v24)
    v8 = v8.copy(p0 = v7)
    v8 = v8.copy(p0 = v46)
    v8 = v8.copy(p0 = v29)
    v8 = v8.copy(p0 = v15)
    val v56: Vector[Double] = v31(0)
    v15 = v15.updated(1, v56)
    v8 = v8.copy(p1 = v65)
    var v36: s0 = v8
    v36
  }
  def f23(v0: s1): s1 = {
    val v5: Vector[s1] = Vector(v0, v0)
    val v32: s1 = v5(0)
    v32
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    var v6: Vector[Vector[s1]] = v0
    var v4: Vector[Vector[s1]] = v0
    var v9: Double = v1
    var v7: Double = v9
    val v3: Vector[s1] = v6(2)
    val v8: s1 = v3(0)
    v4 = v4.updated(0, v3)
    val v2: s1 = f23(v8)
    val v5: s0 = v2.p0
    v7 = v1
    val v14: s1 = f23(v2)
    val v18: Vector[s1] = v0(1)
    var v16: Vector[Vector[s1]] = v0
    val v10: s0 = v14.p0
    val v12: Vector[s1] = v0(2)
    v16 = v16.updated(0, v18)
    v4 = v4.updated(0, v12)
    val v13: Double = v1 * v7
    val v26: Vector[Vector[Double]] = v5.p0
    val v21: s0 = f31(v5)
    val v17: Vector[s1] = v0(0)
    val v55: Vector[Vector[Double]] = v21.p1
    var v25: Vector[Vector[s1]] = v16
    v16 = v25
    val v31: Vector[Double] = v55(0)
    val v27: s1 = f23(v2)
    var v41: Vector[Double] = v31
    v25 = v25.updated(1, v17)
    val v32: Vector[Double] = v26(1)
    v6 = v6.updated(1, v3)
    var v38: Vector[Vector[Double]] = v55
    var v28: Vector[Vector[Double]] = v55
    val v61: Vector[Double] = v26(0)
    v41 = v32
    val v40: Vector[s1] = v4(1)
    v4 = v4.updated(2, v18)
    var v86: s1 = v2
    v28 = v28.updated(0, v32)
    val v52: s1 = v12(0)
    val v36: s0 = f31(v10)
    var v59: Vector[Vector[s1]] = v25
    v86 = v86.copy(p0 = v36)
    v86 = v27
    val v54: s0 = s0(v26, v38)
    v16 = v16.updated(1, v40)
    val v76: Vector[Double] = v28(0)
    val v158: Double = v76(0)
    v86 = v86.copy(p0 = v54)
    var v124: Vector[s1] = v12
    val v53: Double = v158 * v13
    val v133: Double = v61(0)
    v41 = v41.updated(0, v13)
    val v119: s0 = v52.p0
    v4 = v4.updated(0, v124)
    var v134: Vector[s1] = v18
    v59 = v59.updated(0, v17)
    v41 = v41.updated(0, v53)
    v6 = v6.updated(1, v17)
    val v189: Double = v41(0)
    val v194: s1 = f23(v86)
    v86 = v86.copy(p0 = v119)
    v41 = v41.updated(0, v133)
    val v163: Vector[s1] = v59(0)
    val v82: Vector[s1] = v25(2)
    v124 = v124.updated(0, v14)
    v41 = v41.updated(0, v9)
    v16 = v16.updated(2, v82)
    v6 = v6.updated(0, v163)
    v25 = v25.updated(1, v134)
    val v465: s1 = f23(v194)
    v134 = v134.updated(0, v465)
    v189
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))), Vector(s1(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), Vector(s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))))
    val v1: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}