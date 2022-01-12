import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Double],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  def f75(v0: Double): Double = {
    var v5: Double = v0
    var v1: Double = v5
    var v7: Double = v1
    var v2: Double = v7
    var v8: Double = v1
    var v4: Double = v5
    var v10: Double = v1
    var v6: Double = v1
    var v13: Double = v2
    var v9: Double = v0
    var v21: Double = v5
    var v39: Double = v13
    var v36: Double = v9
    val v37: Vector[Double] = Vector(v8, v39, v36, v4)
    var v66: Vector[Double] = v37
    var v49: Vector[Double] = v66
    v66 = v66.updated(3, v10)
    var v44: Vector[Double] = v49
    v7 = v6
    v2 = v21
    v66 = v66.updated(1, v10)
    v66 = v66.updated(2, v2)
    var v91: Vector[Double] = v44
    var v58: Vector[Double] = v91
    val v83: Double = v58(1)
    v83
  }
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Double): Double = {
    val v7: Double = f75(v1)
    v7
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(s0(0.0, Vector(1.0, 2.0, 3.0), Vector(Vector(4.0))), s1(Vector(s0(5.0, Vector(6.0, 7.0, 8.0), Vector(Vector(9.0)))), s0(10.0, Vector(11.0, 12.0, 13.0), Vector(Vector(14.0)))))))
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