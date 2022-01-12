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
    p0: Vector[s0],
    p1: s1
  )
  case class s6 (
    p0: s0,
    p1: s2
  )
  def f70(v0: Double): Double = {
    var v2: Double = v0
    var v5: Double = v2
    var v8: Double = v2
    var v1: Double = v5
    val v4: Vector[Double] = Vector(v1)
    var v11: Vector[Double] = v4
    v11 = v11.updated(0, v8)
    var v7: Double = v1
    v11 = v11.updated(0, v8)
    val v14: Double = v4(0)
    val v29: Double = v11(0)
    v11 = v11.updated(0, v7)
    var v40: Double = v29
    v11 = v11.updated(0, v14)
    v40
  }
  @noinline
  def f0(v0: Vector[Vector[s6]], v1: Double): Double = {
    var v3: Double = v1
    var v81: Double = v3
    var v82: Double = v81
    var v48: Double = v82
    v81 = v48
    val v141: Double = f70(v81)
    v141
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s6]] = Vector(Vector(s6(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s2(Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), s1(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))))), Vector(s6(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s2(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))))))
    val v1: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}