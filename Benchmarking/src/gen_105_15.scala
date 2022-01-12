import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s7 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s8 (
    p0: s7,
    p1: s7,
    p2: s1,
    p3: Vector[Vector[s2]]
  )
  case class s9 (
    p0: Vector[s0],
    p1: Vector[s8]
  )
  def f8(v0: Double): Double = {
    var v3: Double = v0
    var v4: Double = v0
    var v5: Double = v0
    var v1: Double = v3
    var v7: Double = v4
    v3 = v5
    var v6: Double = v7
    val v2: s0 = s0(v5)
    var v9: Double = v0
    var v14: Double = v7
    var v10: s0 = v2
    var v18: Double = v14
    val v28: Double = v10.p0
    val v11: Double = v2.p0
    v10 = v10.copy(p0 = v1)
    v10 = v10.copy(p0 = v11)
    v6 = v14
    v10 = v10.copy(p0 = v0)
    val v30: s0 = s0(v5)
    var v21: Double = v1
    val v40: Double = v30.p0
    v10 = v10.copy(p0 = v18)
    v10 = v10.copy(p0 = v18)
    val v25: Double = v2.p0
    val v42: Vector[Double] = Vector(v6, v28, v21, v9, v40, v14)
    var v66: Vector[Double] = v42
    val v55: Double = v66(3)
    val v64: Double = v66(3)
    v14 = v55
    v4 = v25
    v64
  }
  @noinline
  def f0(v0: s9, v1: Double): Double = {
    var v5: Double = v1
    v5 = v1
    val v9: Double = f8(v5)
    var v14: Double = v5
    var v20: Double = v14
    val v54: Double = f8(v20)
    val v37: Double = f8(v54)
    val v45: Double = v37 + v9
    val v46: Double = f8(v45)
    v46
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(Vector(s0(0.0), s0(1.0), s0(2.0)), Vector(s8(s7(Vector(s0(3.0), s0(4.0)), Vector(s0(5.0))), s7(Vector(s0(6.0), s0(7.0)), Vector(s0(8.0))), s1(Vector(Vector(s0(9.0))), Vector(s0(10.0), s0(11.0), s0(12.0))), Vector(Vector(s2(s0(13.0), Vector(s0(14.0), s0(15.0), s0(16.0)))))), s8(s7(Vector(s0(17.0), s0(18.0)), Vector(s0(19.0))), s7(Vector(s0(20.0), s0(21.0)), Vector(s0(22.0))), s1(Vector(Vector(s0(23.0))), Vector(s0(24.0), s0(25.0), s0(26.0))), Vector(Vector(s2(s0(27.0), Vector(s0(28.0), s0(29.0), s0(30.0))))))))
    val v1: Double = 31.0
    val start = nanoTime()
    var result: Double = 31.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}