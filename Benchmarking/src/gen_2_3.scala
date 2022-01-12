import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[s1]
  )
  def f35(v0: Vector[s1], v1: s2): Vector[s1] = {
    var v8: s2 = v1
    val v13: Vector[Vector[s0]] = v8.p0
    v8 = v8.copy(p0 = v13)
    v8 = v8.copy(p0 = v13)
    v8 = v8.copy(p0 = v13)
    val v18: Vector[Vector[s0]] = v1.p0
    val v42: Vector[Vector[s0]] = v8.p0
    v8 = v8.copy(p0 = v18)
    var v26: s2 = v1
    var v69: s2 = v1
    v26 = v26.copy(p0 = v42)
    val v67: Vector[s1] = v26.p1
    v69 = v69.copy(p0 = v18)
    v69 = v69.copy(p1 = v0)
    v26 = v26.copy(p1 = v0)
    v69 = v69.copy(p1 = v67)
    val v152: s1 = v67(0)
    val v114: Vector[Vector[s0]] = v8.p0
    val v59: Vector[Vector[s0]] = v26.p0
    val v68: Vector[Vector[s0]] = v69.p0
    var v53: Vector[s1] = v0
    v8 = v8.copy(p0 = v18)
    var v70: s2 = v8
    v69 = v69.copy(p1 = v67)
    var v104: s2 = v70
    v69 = v69.copy(p0 = v18)
    v104 = v104.copy(p0 = v68)
    var v164: Vector[s1] = v0
    v69 = v69.copy(p0 = v13)
    v69 = v69.copy(p1 = v164)
    val v151: Vector[s1] = v104.p1
    v8 = v8.copy(p0 = v18)
    v8 = v8.copy(p0 = v59)
    v164 = v164.updated(1, v152)
    v70 = v70.copy(p0 = v42)
    v69 = v69.copy(p0 = v114)
    v26 = v26.copy(p1 = v53)
    v151
  }
  def f28(v0: s2): s2 = {
    val v7: Vector[Vector[s0]] = v0.p0
    var v6: s2 = v0
    val v1: Vector[Vector[s0]] = v6.p0
    var v2: s2 = v0
    var v21: Vector[Vector[s0]] = v7
    v2 = v2.copy(p0 = v21)
    val v22: Vector[s1] = v6.p1
    v6 = v6.copy(p0 = v1)
    val v27: Vector[Vector[s0]] = v0.p0
    var v43: s2 = v6
    v2 = v2.copy(p1 = v22)
    val v35: Vector[s1] = f35(v22, v0)
    val v73: Vector[s1] = v43.p1
    v6 = v6.copy(p0 = v1)
    val v81: Vector[Vector[s0]] = v2.p0
    v43 = v43.copy(p1 = v35)
    v6 = v6.copy(p0 = v81)
    val v125: s2 = s2(v7, v73)
    v43 = v43.copy(p1 = v73)
    v2 = v2.copy(p0 = v27)
    v125
  }
  def f19(v0: s2): s2 = {
    val v8: s2 = f28(v0)
    val v3: Vector[Vector[s0]] = v8.p0
    var v6: Vector[Vector[s0]] = v3
    val v14: Vector[s1] = v0.p1
    val v22: s2 = s2(v6, v14)
    v22
  }
  def f15(v0: s1): s1 = {
    var v8: s1 = v0
    v8
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v2: s2 = v0(0)
    val v3: s2 = f19(v2)
    val v4: s2 = f19(v3)
    val v19: Vector[s1] = v4.p1
    val v42: s1 = v19(2)
    val v29: s1 = f15(v42)
    val v39: s0 = v29.p1
    val v91: Vector[Vector[Double]] = v39.p0
    val v46: Vector[Double] = v91(0)
    var v45: Double = v1
    val v219: Double = v46(0)
    val v200: Double = v219 - v45
    v200
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), s1(Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), s1(Vector(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))))))
    val v1: Double = 40.0
    val start = nanoTime()
    var result: Double = 40.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}