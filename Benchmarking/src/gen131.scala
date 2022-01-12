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
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v7: s1 = v0(0)
    val v2: s1 = v0(0)
    val v5: s1 = v0(0)
    val v4: Vector[s0] = v2.p1
    var v6: s1 = v7
    val v10: Vector[s0] = v7.p0
    val v9: Vector[s0] = v7.p0
    var v8: s1 = v6
    v6 = v6.copy(p0 = v9)
    v8 = v8.copy(p1 = v4)
    val v18: Vector[s0] = v8.p1
    v6 = v6.copy(p0 = v9)
    v8 = v5
    var v17: Vector[s0] = v18
    val v14: s0 = v18(0)
    v17 = v17.updated(0, v14)
    val v11: Vector[s0] = v7.p0
    val v24: s1 = v0(0)
    val v28: s0 = v9(2)
    v8 = v8.copy(p0 = v10)
    val v16: Vector[s0] = v24.p0
    v6 = v6.copy(p1 = v4)
    val v22: s1 = s1(v11, v18)
    v6 = v6.copy(p0 = v16)
    val v42: Vector[Vector[Double]] = v14.p1
    val v38: Vector[Double] = v42(0)
    val v48: Vector[s0] = v22.p0
    val v47: s0 = v16(0)
    v6 = v6.copy(p1 = v17)
    v8 = v8.copy(p0 = v48)
    var v37: Vector[s0] = v18
    v8 = v8.copy(p1 = v37)
    v17 = v17.updated(0, v28)
    val v27: Double = v38(0)
    v6 = v6.copy(p0 = v48)
    v6 = v6.copy(p0 = v48)
    v37 = v37.updated(0, v47)
    v27
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))))), s1(Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))), Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))))))
    val v1: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}