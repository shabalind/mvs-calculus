import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f4(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p0
    val v7: Vector[Vector[Double]] = v0.p1
    val v3: Vector[Vector[Double]] = v0.p0
    var v4: s0 = v0
    v4 = v0
    var v12: s0 = v4
    val v1: Vector[Vector[Double]] = v4.p1
    v4 = v4.copy(p0 = v3)
    v12 = v12.copy(p0 = v3)
    val v10: s0 = s0(v1, v7)
    val v13: Vector[Vector[Double]] = v4.p1
    v12 = v12.copy(p0 = v13)
    val v8: Vector[Vector[Double]] = v4.p1
    v4 = v4.copy(p1 = v3)
    val v16: Vector[Vector[Double]] = v4.p1
    v12 = v10
    v12 = v12.copy(p0 = v1)
    val v45: Vector[Vector[Double]] = v10.p1
    val v49: Vector[Vector[Double]] = v4.p1
    var v59: Vector[Vector[Double]] = v45
    var v44: s0 = v0
    val v40: Vector[Vector[Double]] = v44.p1
    v12 = v12.copy(p0 = v2)
    v44 = v44.copy(p1 = v45)
    v4 = v4.copy(p1 = v59)
    v44 = v44.copy(p0 = v16)
    var v72: s0 = v12
    v44 = v44.copy(p0 = v40)
    val v79: Vector[Vector[Double]] = v72.p0
    val v127: s0 = s0(v3, v49)
    var v66: s0 = v12
    v72 = v72.copy(p0 = v8)
    v66 = v66.copy(p1 = v40)
    v12 = v127
    v12 = v12.copy(p1 = v2)
    v66 = v66.copy(p0 = v79)
    v66
  }
  @noinline
  def f0(v0: s0, v1: Vector[s0], v2: Vector[s0], v3: s0, v4: Double): Double = {
    val v6: s0 = v2(0)
    var v8: Double = v4
    val v15: s0 = f4(v3)
    var v12: Double = v8
    var v32: s0 = v15
    val v11: s0 = v1(0)
    val v21: Vector[Vector[Double]] = v6.p0
    val v16: s0 = v2(2)
    val v17: Vector[Vector[Double]] = v16.p1
    val v48: s0 = f4(v3)
    v32 = v32.copy(p1 = v17)
    v32 = v32.copy(p0 = v21)
    val v29: Vector[Vector[Double]] = v48.p1
    val v33: Vector[Vector[Double]] = v11.p0
    v32 = v32.copy(p0 = v33)
    val v44: Vector[Vector[Double]] = v32.p1
    val v27: Vector[Double] = v44(2)
    v32 = v32.copy(p1 = v21)
    val v76: Double = v12 - v12
    v32 = v32.copy(p1 = v29)
    var v96: Vector[Double] = v27
    val v114: Double = v96(0)
    val v108: Vector[Double] = Vector(v12, v76, v76, v114)
    v96 = v96.updated(0, v114)
    val v85: Double = v108(3)
    v85
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))
    val v3: s0 = s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))
    val v4: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}