import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0],
    p2: Vector[Vector[s0]],
    p3: Vector[s0]
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: Double
  )
  def f69(v0: s2, v1: s2): s2 = {
    var v33: s2 = v0
    v33
  }
  def f63(v0: s2, v1: s2): s2 = {
    val v4: s2 = f69(v0, v0)
    val v5: Double = v0.p1
    val v8: Vector[Vector[s1]] = v4.p0
    val v6: s2 = f69(v1, v1)
    val v9: Vector[Vector[s1]] = v1.p0
    val v12: s2 = f69(v4, v0)
    val v18: Double = v5 - v5
    val v22: s2 = f69(v0, v6)
    val v28: Vector[Vector[s1]] = v22.p0
    var v21: s2 = v6
    val v27: s2 = f69(v1, v1)
    v21 = v21.copy(p0 = v8)
    val v81: s2 = f69(v12, v27)
    v21 = v21.copy(p0 = v28)
    v21 = v21.copy(p1 = v18)
    val v62: Vector[Vector[s1]] = v4.p0
    v21 = v21.copy(p0 = v28)
    v21 = v21.copy(p1 = v5)
    val v74: s2 = f69(v81, v27)
    v21 = v21.copy(p0 = v62)
    val v67: s2 = f69(v74, v27)
    val v99: s2 = f69(v81, v21)
    v21 = v21.copy(p0 = v9)
    val v130: s2 = f69(v67, v99)
    v130
  }
  def f53(v0: s2): s2 = {
    val v3: Vector[s2] = Vector(v0, v0)
    val v10: s2 = v3(0)
    v10
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v6: s2 = v0
    val v9: s2 = f53(v6)
    val v8: Vector[Vector[s1]] = v9.p0
    val v2: s2 = s2(v8, v1)
    v6 = v6.copy(p1 = v1)
    val v4: s2 = f63(v2, v0)
    val v13: s2 = f53(v4)
    var v42: s2 = v4
    var v22: s2 = v4
    val v38: s2 = f69(v0, v22)
    val v34: Double = v42.p1
    val v32: Double = v38.p1
    v6 = v6.copy(p1 = v1)
    v42 = v42.copy(p1 = v34)
    val v36: Double = v13.p1
    val v48: Vector[Double] = Vector(v1, v34, v36, v32, v32, v36)
    val v35: Double = v48(0)
    v35
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))))), Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))), Vector(s1(Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)))), Vector(Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))))), Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))))), 60.0)
    val v1: Double = 61.0
    val start = nanoTime()
    var result: Double = 61.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}