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
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  def f5(v0: s0, v1: s2, v2: s0): s0 = {
    val v5: s0 = v1.p1
    val v4: s1 = s1(v2, v0)
    val v3: Vector[s1] = v1.p0
    val v15: s1 = v3(0)
    var v8: s1 = v4
    val v10: s0 = v15.p1
    val v24: s0 = v4.p1
    var v21: s0 = v2
    v8 = v8.copy(p0 = v0)
    var v23: s2 = v1
    var v39: s2 = v23
    var v40: s1 = v8
    val v73: s0 = v40.p0
    val v54: s0 = v39.p1
    val v66: Vector[Vector[Double]] = v0.p0
    v21 = v21.copy(p0 = v66)
    v8 = v8.copy(p0 = v54)
    val v65: Vector[s0] = Vector(v73, v54, v54, v5, v10)
    v39 = v39.copy(p1 = v5)
    val v145: s0 = v65(2)
    v39 = v39.copy(p1 = v21)
    v39 = v39.copy(p1 = v24)
    v23 = v23.copy(p1 = v10)
    v145
  }
  @noinline
  def f0(v0: s1, v1: s2, v2: Double): Double = {
    var v5: s1 = v0
    val v11: s0 = v5.p1
    val v12: s0 = v0.p0
    var v4: s0 = v12
    v5 = v5.copy(p0 = v4)
    v5 = v5.copy(p1 = v4)
    val v20: s0 = f5(v11, v1, v4)
    val v17: Vector[Vector[Double]] = v4.p1
    val v24: Vector[Vector[Double]] = v11.p1
    v4 = v4.copy(p1 = v17)
    val v34: Vector[Double] = v24(1)
    val v123: Double = v34(0)
    var v216: s0 = v20
    v4 = v216
    v123
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))
    val v1: s2 = s2(Vector(s1(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))))
    val v2: Double = 25.0
    val start = nanoTime()
    var result: Double = 25.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}