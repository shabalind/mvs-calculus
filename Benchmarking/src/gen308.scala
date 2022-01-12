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
    p0: s1,
    p1: s1
  )
  case class s4 (
    p0: Vector[s2],
    p1: s2
  )
  def f24(v0: s1): s1 = {
    val v6: s0 = v0.p0
    val v7: Vector[Vector[Double]] = v6.p1
    var v5: s1 = v0
    v5 = v0
    val v11: Vector[Vector[Double]] = v6.p0
    v5 = v5.copy(p1 = v6)
    val v42: s0 = s0(v11, v7)
    v5 = v5.copy(p1 = v42)
    v5
  }
  def f17(v0: s2): s2 = {
    var v6: s2 = v0
    var v2: s2 = v6
    v6 = v2
    var v5: s2 = v0
    val v4: s1 = v6.p1
    var v1: s1 = v4
    val v3: s1 = f24(v4)
    val v10: s1 = f24(v4)
    var v7: s1 = v10
    var v18: s2 = v2
    v18 = v18.copy(p1 = v4)
    v6 = v6.copy(p1 = v1)
    val v11: s1 = v18.p1
    val v12: s1 = f24(v7)
    val v15: s1 = f24(v3)
    val v14: s1 = v2.p0
    v2 = v2.copy(p0 = v12)
    var v16: s1 = v1
    v6 = v6.copy(p1 = v14)
    val v20: s0 = v7.p0
    val v24: s0 = v16.p0
    v16 = v16.copy(p0 = v24)
    v7 = v7.copy(p0 = v20)
    v16 = v11
    val v50: s1 = f24(v11)
    v16 = v16.copy(p1 = v24)
    v1 = v1.copy(p0 = v24)
    val v78: s1 = v5.p0
    val v67: s0 = v50.p1
    val v58: s2 = s2(v50, v78)
    v18 = v18.copy(p0 = v4)
    var v91: s2 = v58
    v16 = v16.copy(p0 = v67)
    val v81: s0 = v15.p1
    v16 = v16.copy(p1 = v81)
    v91
  }
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    val v5: s2 = v0.p1
    val v2: s2 = f17(v5)
    var v7: Double = v1
    val v4: s1 = v2.p1
    val v3: s1 = f24(v4)
    val v25: s0 = v3.p0
    var v53: s0 = v25
    val v16: Vector[Vector[Double]] = v53.p1
    val v32: Vector[Double] = v16(0)
    val v35: Vector[Vector[Double]] = v53.p1
    var v68: Vector[Double] = v32
    var v50: Vector[Vector[Double]] = v35
    v53 = v53.copy(p1 = v50)
    v53 = v53.copy(p1 = v16)
    v68 = v68.updated(0, v7)
    val v93: Double = v68(0)
    v93
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(s2(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s1(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s2(s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), s1(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))), s2(s1(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))), s1(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))))), s2(s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), s1(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))))
    val v1: Double = 48.0
    val start = nanoTime()
    var result: Double = 48.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}