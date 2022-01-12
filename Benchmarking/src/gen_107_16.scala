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
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s5 (
    p0: s2,
    p1: s2
  )
  def f63(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p1
    val v1: Vector[Double] = v3(0)
    val v5: Vector[Vector[Double]] = v0.p0
    var v7: s0 = v0
    val v9: Vector[Vector[Double]] = v7.p1
    var v4: Vector[Vector[Double]] = v5
    val v11: Vector[Double] = v3(1)
    v4 = v4.updated(0, v11)
    v4 = v4.updated(0, v1)
    var v18: Vector[Vector[Double]] = v9
    val v38: Vector[Double] = v18(0)
    val v14: Vector[Double] = v9(1)
    val v31: Vector[Double] = v18(1)
    val v20: Vector[Vector[Double]] = v0.p1
    var v42: Vector[Vector[Double]] = v4
    val v60: s0 = s0(v42, v20)
    v4 = v4.updated(2, v1)
    v18 = v18.updated(1, v14)
    v4 = v4.updated(0, v38)
    v42 = v42.updated(0, v31)
    v60
  }
  def f61(v0: s2): s2 = {
    val v30: s5 = s5(v0, v0)
    var v69: s5 = v30
    var v76: s5 = v69
    v69 = v69.copy(p1 = v0)
    val v214: s2 = v76.p0
    v214
  }
  def f46(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v3: Vector[Vector[Double]] = v0
    var v6: Vector[Vector[Double]] = v3
    val v7: Vector[Vector[Vector[Double]]] = Vector(v6, v6, v6, v0)
    val v8: Vector[Vector[Double]] = v7(0)
    var v2: Vector[Vector[Vector[Double]]] = v7
    val v5: Vector[Double] = v6(0)
    val v4: Vector[Double] = v6(0)
    var v11: Vector[Double] = v5
    val v14: Vector[Vector[Vector[Vector[Double]]]] = Vector(v7, v7, v7, v2)
    val v10: Vector[Vector[Vector[Double]]] = v14(1)
    v3 = v3.updated(1, v11)
    v6 = v6.updated(1, v4)
    val v21: Vector[Vector[Double]] = v10(0)
    v3 = v3.updated(1, v4)
    v2 = v2.updated(1, v8)
    v6 = v6.updated(1, v5)
    v21
  }
  def f45(v0: s2): s2 = {
    var v6: s2 = v0
    val v5: s0 = v0.p1
    var v3: s2 = v0
    var v4: s0 = v5
    var v1: s2 = v6
    val v10: s2 = f61(v3)
    v1 = v1.copy(p1 = v4)
    v3 = v3.copy(p1 = v5)
    val v11: s0 = f63(v5)
    v1 = v1.copy(p1 = v11)
    val v9: s1 = v10.p0
    val v14: Vector[Vector[Double]] = v5.p1
    var v20: s0 = v4
    val v18: Vector[Vector[Double]] = f46(v14)
    val v23: Vector[s0] = v9.p0
    val v21: Vector[Vector[Double]] = f46(v18)
    v3 = v3.copy(p0 = v9)
    val v22: s0 = v23(0)
    v1 = v1.copy(p0 = v9)
    val v67: Vector[Vector[Double]] = v22.p0
    v6 = v6.copy(p1 = v20)
    v4 = v4.copy(p0 = v67)
    val v69: s2 = f61(v1)
    v1 = v1.copy(p1 = v20)
    v1 = v1.copy(p0 = v9)
    v4 = v4.copy(p1 = v21)
    v69
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v4: s2 = v0
    val v5: s2 = f45(v4)
    val v7: s0 = v4.p1
    var v10: s0 = v7
    v4 = v4.copy(p1 = v10)
    val v11: s2 = f61(v5)
    val v21: s0 = f63(v10)
    var v30: Double = v1
    val v56: Vector[Vector[Double]] = v21.p1
    val v46: Vector[Double] = v56(0)
    val v31: Double = v46(0)
    val v34: Double = v46(0)
    val v53: Double = v34 + v30
    val v60: Double = v31 + v53
    val v99: s1 = v11.p0
    var v55: Double = v60
    v4 = v4.copy(p0 = v99)
    v55
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}