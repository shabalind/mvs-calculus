import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[Double]
  )
  def f68(v0: s2): s2 = {
    val v2: Vector[s1] = v0.p0
    val v4: Vector[Double] = v0.p1
    val v8: Vector[Double] = v0.p1
    val v5: Vector[Vector[Double]] = Vector(v8, v8, v8, v8, v8, v8)
    var v6: Vector[s1] = v2
    val v18: Vector[s1] = v0.p0
    val v1: Vector[Double] = v5(2)
    var v17: s2 = v0
    v17 = v17.copy(p1 = v8)
    v17 = v17.copy(p1 = v1)
    var v20: s2 = v17
    val v24: Vector[Double] = v20.p1
    val v48: Vector[Double] = v17.p1
    val v15: Vector[Double] = v20.p1
    v20 = v20.copy(p1 = v4)
    val v40: Vector[Double] = v17.p1
    v17 = v17.copy(p1 = v40)
    v17 = v17.copy(p1 = v24)
    v20 = v20.copy(p0 = v18)
    val v46: s2 = s2(v6, v15)
    v17 = v17.copy(p1 = v48)
    val v88: Vector[s1] = v17.p0
    val v89: Vector[s1] = v46.p0
    v17 = v17.copy(p0 = v89)
    v17 = v17.copy(p0 = v88)
    v20
  }
  def f62(v0: s2): s2 = {
    val v3: s2 = f68(v0)
    var v1: s2 = v3
    var v4: s2 = v0
    val v7: s2 = f68(v1)
    v4 = v7
    val v8: Vector[Double] = v4.p1
    var v12: Vector[Double] = v8
    v1 = v1.copy(p1 = v12)
    var v19: Vector[Double] = v12
    v12 = v8
    val v29: Double = v19(0)
    v4 = v4.copy(p1 = v19)
    val v37: Vector[s1] = v1.p0
    val v56: s2 = s2(v37, v8)
    v12 = v12.updated(1, v29)
    val v39: s2 = f68(v56)
    v39
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v4: s2 = f62(v0)
    val v2: Vector[Double] = v4.p1
    var v16: Vector[Double] = v2
    val v30: Double = v2(1)
    v16 = v16.updated(0, v1)
    v16 = v16.updated(0, v30)
    v16 = v16.updated(1, v30)
    val v139: Double = v16(0)
    v16 = v2
    v139
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), Vector(Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))))))), Vector(25.0, 26.0))
    val v1: Double = 27.0
    val start = nanoTime()
    var result: Double = 27.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}