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
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s4 (
    p0: s2,
    p1: s1
  )
  def f101(v0: s2): s2 = {
    var v1: s2 = v0
    val v5: Vector[Vector[s0]] = v0.p0
    val v6: Vector[s0] = v5(0)
    var v4: s2 = v0
    var v7: s2 = v1
    val v10: Vector[s0] = v4.p1
    val v2: Vector[s0] = v1.p1
    var v8: Vector[s0] = v2
    val v14: s0 = v2(1)
    val v12: Vector[s0] = v7.p1
    v8 = v8.updated(1, v14)
    val v9: Vector[s0] = v4.p1
    val v16: s2 = s2(v5, v8)
    v8 = v8.updated(1, v14)
    val v21: s0 = v6(0)
    v8 = v8.updated(1, v14)
    v8 = v8.updated(1, v21)
    v7 = v7.copy(p0 = v5)
    v7 = v7.copy(p0 = v5)
    v1 = v1.copy(p1 = v12)
    val v22: Vector[Vector[s0]] = v7.p0
    v4 = v4.copy(p0 = v22)
    v7 = v7.copy(p1 = v10)
    val v36: Vector[s0] = v16.p1
    val v26: Vector[Vector[s0]] = v0.p0
    v4 = v4.copy(p0 = v26)
    v1 = v1.copy(p1 = v36)
    v4 = v4.copy(p0 = v5)
    v4 = v4.copy(p0 = v26)
    v1 = v1.copy(p1 = v10)
    val v77: Vector[Vector[s0]] = v16.p0
    var v47: Vector[s0] = v9
    val v81: Vector[s0] = v7.p1
    val v97: s2 = s2(v22, v81)
    v4 = v4.copy(p1 = v12)
    v7 = v7.copy(p0 = v77)
    var v98: s2 = v97
    var v88: Vector[s0] = v47
    val v135: Vector[Vector[s0]] = v1.p0
    v98 = v98.copy(p0 = v135)
    v1 = v1.copy(p1 = v88)
    v98
  }
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    var v3: s4 = v0
    val v7: s1 = v3.p1
    val v8: s2 = v3.p0
    v3 = v3.copy(p1 = v7)
    val v20: s2 = f101(v8)
    v3 = v3.copy(p0 = v20)
    val v28: Vector[s0] = v20.p1
    val v162: s0 = v28(1)
    val v67: Vector[Vector[Double]] = v162.p1
    val v175: Vector[Double] = v67(0)
    val v177: Double = v175(0)
    v177
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s1(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))))
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