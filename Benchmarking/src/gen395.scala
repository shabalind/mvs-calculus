import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s6 (
    p0: Vector[Vector[s1]],
    p1: Vector[s2]
  )
  def f25(v0: Double): Double = {
    var v5: Double = v0
    val v7: Double = v0 * v5
    val v6: Double = v7 + v7
    var v1: Double = v5
    var v2: Double = v7
    var v10: Double = v5
    var v8: Double = v10
    var v4: Double = v2
    var v13: Double = v0
    var v9: Double = v2
    val v12: Double = v6 - v7
    var v25: Double = v12
    var v14: Double = v1
    var v16: Double = v8
    var v19: Double = v13
    val v43: Double = v25 / v9
    var v21: Double = v13
    var v22: Double = v16
    var v34: Double = v5
    var v20: Double = v6
    var v24: Double = v34
    var v11: Double = v14
    var v28: Double = v2
    var v17: Double = v28
    var v47: Double = v4
    var v27: Double = v7
    v10 = v2
    var v39: Double = v47
    v14 = v24
    var v57: Double = v27
    var v52: Double = v6
    var v90: Double = v21
    val v66: Double = v20 + v19
    val v101: Vector[Double] = Vector(v52, v25, v13, v57)
    var v73: Vector[Double] = v101
    val v78: Double = v101(0)
    val v68: Double = v73(0)
    v73 = v73.updated(2, v66)
    v73 = v73.updated(2, v68)
    v73 = v73.updated(3, v43)
    val v245: Vector[Double] = Vector(v78, v90, v21, v17, v14, v22, v11)
    var v111: Vector[Double] = v245
    v27 = v39
    val v71: Double = v73(0)
    v1 = v71
    var v160: Vector[Double] = v111
    val v122: Vector[Vector[Double]] = Vector(v245, v160, v160, v111, v111, v111, v111)
    val v115: Vector[Double] = v122(4)
    v160 = v160.updated(6, v6)
    v25 = v27
    val v150: Double = v115(2)
    v111 = v111.updated(4, v6)
    v150
  }
  @noinline
  def f0(v0: s6, v1: Double): Double = {
    var v6: Double = v1
    val v13: Double = f25(v6)
    v13
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(Vector(Vector(s1(s0(0.0, Vector(Vector(1.0))), s0(2.0, Vector(Vector(3.0))))), Vector(s1(s0(4.0, Vector(Vector(5.0))), s0(6.0, Vector(Vector(7.0)))))), Vector(s2(Vector(s0(8.0, Vector(Vector(9.0))), s0(10.0, Vector(Vector(11.0)))), Vector(s1(s0(12.0, Vector(Vector(13.0))), s0(14.0, Vector(Vector(15.0)))))), s2(Vector(s0(16.0, Vector(Vector(17.0))), s0(18.0, Vector(Vector(19.0)))), Vector(s1(s0(20.0, Vector(Vector(21.0))), s0(22.0, Vector(Vector(23.0)))))), s2(Vector(s0(24.0, Vector(Vector(25.0))), s0(26.0, Vector(Vector(27.0)))), Vector(s1(s0(28.0, Vector(Vector(29.0))), s0(30.0, Vector(Vector(31.0))))))))
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