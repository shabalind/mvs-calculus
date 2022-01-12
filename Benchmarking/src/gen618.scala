import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s1,
    p2: s0
  )
  def f78(v0: s2): s2 = {
    var v7: s2 = v0
    var v2: s2 = v0
    var v8: s2 = v2
    var v1: s2 = v8
    val v6: s1 = v7.p1
    val v9: s0 = v6.p1
    var v3: s1 = v6
    v3 = v3.copy(p0 = v9)
    var v5: s0 = v9
    var v4: s0 = v9
    var v11: s0 = v4
    var v25: s1 = v3
    val v14: s0 = v8.p2
    v7 = v7.copy(p2 = v14)
    val v10: Vector[Double] = v4.p0
    val v20: Double = v10(0)
    val v12: Double = v10(1)
    val v21: Double = v20 / v20
    v7 = v7.copy(p2 = v11)
    val v34: Vector[Vector[Double]] = v5.p1
    var v31: Vector[Double] = v10
    var v15: s1 = v3
    val v26: Vector[Double] = v9.p0
    val v19: Vector[Double] = v34(0)
    v1 = v1.copy(p2 = v5)
    var v27: Double = v21
    v5 = v5.copy(p0 = v26)
    v31 = v31.updated(1, v21)
    val v56: Double = v19(0)
    val v22: Vector[Vector[Double]] = v9.p1
    v31 = v31.updated(1, v20)
    v31 = v31.updated(1, v12)
    val v16: Double = v19(0)
    v7 = v7.copy(p1 = v15)
    val v36: Vector[Double] = v9.p0
    v27 = v56
    v31 = v31.updated(0, v12)
    v31 = v31.updated(1, v16)
    var v84: s1 = v3
    val v29: s0 = v25.p0
    var v30: Vector[Double] = v31
    val v73: s0 = v15.p0
    v5 = v5.copy(p1 = v34)
    val v50: s0 = s0(v36, v34)
    v25 = v25.copy(p1 = v73)
    val v94: s0 = v15.p1
    val v74: s0 = s0(v30, v22)
    val v63: s0 = v1.p2
    v5 = v5.copy(p1 = v34)
    var v127: s0 = v4
    v4 = v50
    v8 = v8.copy(p2 = v29)
    v3 = v3.copy(p0 = v11)
    v3 = v3.copy(p0 = v63)
    v15 = v15.copy(p0 = v73)
    val v117: Vector[s1] = v0.p0
    val v109: s1 = v117(1)
    val v124: s2 = s2(v117, v84, v127)
    v15 = v15.copy(p0 = v94)
    val v122: s0 = v109.p0
    val v79: Vector[Vector[Double]] = v29.p1
    v84 = v84.copy(p0 = v74)
    v11 = v11.copy(p1 = v79)
    v31 = v31.updated(0, v27)
    v11 = v122
    v124
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v2: s2 = v0
    val v6: s2 = f78(v2)
    val v12: s1 = v6.p1
    var v8: s1 = v12
    val v10: s0 = v8.p1
    val v18: Vector[Double] = v10.p0
    v8 = v8.copy(p1 = v10)
    v8 = v8.copy(p1 = v10)
    val v66: Double = v18(0)
    v66
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s1(s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0))), s0(Vector(4.0, 5.0), Vector(Vector(6.0), Vector(7.0)))), s1(s0(Vector(8.0, 9.0), Vector(Vector(10.0), Vector(11.0))), s0(Vector(12.0, 13.0), Vector(Vector(14.0), Vector(15.0))))), s1(s0(Vector(16.0, 17.0), Vector(Vector(18.0), Vector(19.0))), s0(Vector(20.0, 21.0), Vector(Vector(22.0), Vector(23.0)))), s0(Vector(24.0, 25.0), Vector(Vector(26.0), Vector(27.0))))
    val v1: Double = 28.0
    val start = nanoTime()
    var result: Double = 28.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}