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
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v8: Double = v1
    var v5: Double = v8
    val v17: Double = v8 * v8
    v8 = v17
    val v40: Double = v8 * v17
    val v41: Vector[Double] = Vector(v1, v40, v1, v1)
    val v18: Double = v8 - v5
    var v16: Vector[Double] = v41
    v16 = v16.updated(3, v18)
    v16 = v16.updated(1, v18)
    val v42: Double = v18 - v8
    v16 = v16.updated(2, v42)
    v16 = v16.updated(0, v5)
    v16 = v16.updated(0, v42)
    v16 = v16.updated(1, v8)
    v16 = v41
    v16 = v16.updated(3, v1)
    v16 = v16.updated(3, v1)
    var v65: Double = v18
    var v37: Vector[Double] = v41
    v37 = v37.updated(2, v42)
    v37 = v16
    v16 = v16.updated(1, v17)
    v37 = v37.updated(2, v40)
    v37 = v37.updated(0, v65)
    v37 = v37.updated(1, v8)
    val v82: Double = v37(1)
    v82
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s1(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), s1(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s1(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))))))
    val v1: Double = 21.0
    val start = nanoTime()
    var result: Double = 21.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}