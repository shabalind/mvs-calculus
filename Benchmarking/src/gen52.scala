import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  def f13(v0: s1): s1 = {
    val v2: s0 = v0.p1
    var v4: s1 = v0
    var v3: s1 = v0
    v3 = v3.copy(p1 = v2)
    var v5: s1 = v4
    var v9: s1 = v5
    val v14: s0 = v0.p1
    val v17: s0 = v9.p1
    v3 = v3.copy(p1 = v2)
    v4 = v4.copy(p1 = v17)
    var v31: s1 = v4
    val v33: Vector[Vector[s0]] = v3.p0
    val v46: Vector[Vector[s0]] = v31.p0
    val v58: s1 = s1(v46, v14)
    val v65: Vector[Vector[s0]] = v4.p0
    val v63: Vector[s0] = v33(0)
    var v50: s1 = v58
    v4 = v4.copy(p0 = v65)
    v50 = v50.copy(p0 = v33)
    val v115: s0 = v63(0)
    v3 = v3.copy(p1 = v115)
    v50
  }
  def f2(v0: s2, v1: s0, v2: s0): s0 = {
    val v6: Vector[Double] = v1.p0
    val v10: Vector[Vector[Double]] = v1.p1
    var v7: s0 = v2
    v7 = v7.copy(p1 = v10)
    v7 = v7.copy(p0 = v6)
    val v15: s1 = v0.p0
    val v16: s1 = f13(v15)
    v7 = v7.copy(p1 = v10)
    val v25: Vector[Vector[Double]] = v7.p1
    val v30: s0 = v16.p1
    v7 = v30
    v7 = v7.copy(p1 = v10)
    v7 = v7.copy(p1 = v25)
    v7 = v7.copy(p1 = v10)
    v7
  }
  @noinline
  def f0(v0: s1, v1: Vector[Vector[s1]], v2: Double): Double = {
    val v4: Vector[Vector[s0]] = v0.p0
    var v9: s1 = v0
    val v5: Vector[Vector[s0]] = v0.p0
    v9 = v9.copy(p0 = v4)
    val v8: Vector[s0] = v4(0)
    v9 = v9.copy(p0 = v5)
    val v7: s0 = v0.p1
    val v11: s2 = s2(v9, v8)
    val v3: s0 = f2(v11, v7, v7)
    val v18: s0 = f2(v11, v3, v3)
    v9 = v9.copy(p0 = v5)
    var v14: s2 = v11
    val v17: s0 = v9.p1
    var v36: s0 = v17
    val v31: s0 = f2(v14, v18, v36)
    val v39: Vector[Double] = v31.p0
    val v29: Double = v39(0)
    v9 = v9.copy(p1 = v18)
    v29
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(s0(Vector(0.0), Vector(Vector(1.0), Vector(2.0), Vector(3.0))))), s0(Vector(4.0), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(Vector(Vector(s0(Vector(8.0), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s0(Vector(12.0), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), Vector(s1(Vector(Vector(s0(Vector(16.0), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), s0(Vector(20.0), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), Vector(s1(Vector(Vector(s0(Vector(24.0), Vector(Vector(25.0), Vector(26.0), Vector(27.0))))), s0(Vector(28.0), Vector(Vector(29.0), Vector(30.0), Vector(31.0))))))
    val v2: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}