import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s4 (
    p0: s1,
    p1: s0
  )
  def f43(v0: Double): Double = {
    var v3: Double = v0
    var v8: Double = v0
    var v2: Double = v8
    var v14: Double = v0
    var v6: Double = v3
    var v17: Double = v3
    var v1: Double = v17
    var v15: Double = v1
    var v12: Double = v17
    val v25: Vector[Double] = Vector(v2, v8)
    v3 = v15
    var v20: Double = v12
    var v24: Double = v14
    var v23: Vector[Double] = v25
    var v18: Vector[Double] = v23
    var v22: Vector[Double] = v18
    var v27: Double = v6
    var v37: Vector[Double] = v22
    v23 = v23.updated(0, v20)
    var v33: Vector[Double] = v37
    v33 = v33.updated(0, v24)
    v37 = v37.updated(1, v27)
    val v49: Double = v33(1)
    var v39: Double = v49
    v39
  }
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    var v7: Double = v1
    v7 = v1
    val v36: Double = f43(v7)
    v36
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0)))), Vector(s0(Vector(Vector(7.0)), Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0)), Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)), Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)), Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))))
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