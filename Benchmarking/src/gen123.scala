import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: Double,
    p1: s1
  )
  def f26(v0: s0): s0 = {
    val v3: Vector[s0] = Vector(v0, v0, v0, v0)
    var v7: s0 = v0
    var v4: Vector[s0] = v3
    v4 = v4.updated(2, v0)
    val v6: Vector[Vector[s0]] = Vector(v3, v3, v4, v3, v3, v4, v4)
    val v8: Vector[Vector[Double]] = v0.p0
    v7 = v7.copy(p0 = v8)
    v4 = v4.updated(2, v7)
    val v21: Vector[Double] = v0.p1
    v7 = v7.copy(p0 = v8)
    v7 = v7.copy(p0 = v8)
    v7 = v7.copy(p1 = v21)
    val v10: Vector[Double] = v7.p1
    v7 = v7.copy(p0 = v8)
    v4 = v4.updated(0, v7)
    v7 = v7.copy(p1 = v21)
    val v23: Vector[Vector[Double]] = v7.p0
    v4 = v4.updated(2, v0)
    v7 = v7.copy(p0 = v23)
    var v32: s0 = v7
    v7 = v7.copy(p1 = v10)
    v7 = v7.copy(p0 = v8)
    v4 = v4.updated(2, v32)
    val v48: Vector[s0] = v6(2)
    val v79: s0 = v48(2)
    v7 = v7.copy(p1 = v10)
    v79
  }
  def f25(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v6: Vector[Double] = v0(1)
    var v7: Vector[Vector[Double]] = v0
    val v19: Vector[Vector[Vector[Double]]] = Vector(v7, v0, v0)
    var v11: Vector[Vector[Vector[Double]]] = v19
    val v26: Vector[Vector[Double]] = v11(0)
    var v12: Vector[Vector[Double]] = v26
    v12 = v12.updated(2, v6)
    v12
  }
  def f15(v0: s0): s0 = {
    val v6: s0 = f26(v0)
    val v4: Vector[Double] = v0.p1
    val v3: Vector[Vector[Double]] = Vector(v4, v4, v4, v4, v4, v4, v4)
    val v1: Vector[Double] = v3(0)
    val v2: s0 = f26(v0)
    var v10: Vector[Vector[Double]] = v3
    val v14: s0 = f26(v6)
    val v15: Vector[Vector[Double]] = v14.p0
    val v20: Vector[Double] = v6.p1
    v10 = v10.updated(5, v20)
    val v18: Vector[Vector[Double]] = v2.p0
    val v27: s0 = f26(v2)
    var v29: Vector[Vector[Double]] = v3
    val v21: Vector[Double] = v27.p1
    v29 = v29.updated(3, v1)
    val v25: Vector[Double] = v27.p1
    val v35: Vector[Double] = v14.p1
    val v55: Vector[Vector[Double]] = f25(v18)
    v29 = v29.updated(5, v4)
    v10 = v10.updated(5, v21)
    val v60: Vector[Double] = v3(3)
    val v81: Vector[Double] = v10(3)
    v10 = v10.updated(2, v60)
    val v40: s0 = f26(v14)
    val v94: s0 = f26(v40)
    val v51: Vector[Double] = v29(5)
    v29 = v29.updated(3, v81)
    v10 = v10.updated(1, v25)
    var v66: s0 = v94
    v66 = v66.copy(p0 = v15)
    v66 = v66.copy(p1 = v51)
    v66 = v66.copy(p1 = v21)
    v66 = v66.copy(p0 = v55)
    v66 = v66.copy(p1 = v35)
    v66
  }
  @noinline
  def f0(v0: Vector[s1], v1: s0, v2: Vector[Vector[s1]], v3: Double): Double = {
    var v7: s0 = v1
    val v4: s0 = f15(v7)
    val v8: Vector[Double] = v4.p1
    var v5: s0 = v4
    val v15: Double = v8(1)
    val v17: s1 = v0(0)
    val v20: Vector[Vector[Double]] = v4.p0
    val v23: Vector[Double] = v20(0)
    val v24: s0 = f26(v5)
    var v27: Vector[Vector[Double]] = v20
    val v47: s0 = v17.p0
    v27 = v27.updated(2, v23)
    v27 = v27.updated(0, v23)
    val v13: s1 = v0(0)
    v27 = v27.updated(1, v23)
    v5 = v47
    v7 = v7.copy(p0 = v27)
    val v26: s2 = s2(v15, v13)
    val v28: Vector[Vector[Double]] = f25(v20)
    v5 = v4
    val v37: Vector[Double] = v28(1)
    val v63: Vector[Double] = v24.p1
    val v58: Double = v26.p0
    v27 = v27.updated(2, v37)
    v7 = v7.copy(p1 = v63)
    v58
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0, 4.0, 5.0)), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(9.0, 10.0, 11.0)))))
    val v1: s0 = s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(15.0, 16.0, 17.0))
    val v2: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(21.0, 22.0, 23.0)), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(27.0, 28.0, 29.0))))))
    val v3: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}