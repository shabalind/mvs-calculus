import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s7 (
    p0: s1,
    p1: Vector[s0]
  )
  def f28(v0: Double): Double = {
    val v2: Double = v0 / v0
    var v3: Double = v0
    var v7: Double = v0
    var v8: Double = v3
    var v6: Double = v0
    var v13: Double = v2
    var v5: Double = v8
    var v1: Double = v13
    val v11: Double = v6 - v7
    var v19: Double = v1
    var v10: Double = v5
    var v4: Double = v3
    var v9: Double = v4
    var v17: Double = v19
    var v21: Double = v9
    var v14: Double = v4
    var v29: Double = v0
    var v18: Double = v10
    var v30: Double = v13
    v14 = v10
    var v41: Double = v29
    val v23: Double = v1 - v21
    var v27: Double = v14
    val v48: Vector[Double] = Vector(v14, v18, v30, v10, v6, v11)
    var v56: Double = v23
    val v46: Vector[Double] = Vector(v41, v3)
    val v40: Double = v48(2)
    var v57: Vector[Double] = v48
    v57 = v57.updated(2, v17)
    var v55: Vector[Double] = v57
    v55 = v55.updated(3, v19)
    val v72: Double = v40 - v7
    v55 = v48
    val v32: Double = v46(0)
    val v26: Double = v55(3)
    v55 = v55.updated(2, v27)
    val v122: Double = v56 + v6
    v57 = v57.updated(5, v32)
    val v141: Double = v72 / v26
    v14 = v122
    v8 = v3
    v141
  }
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    val v4: Double = f28(v1)
    val v3: Double = f28(v1)
    val v11: Double = v4 + v3
    val v30: Double = v11 + v4
    v30
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))))
    val v1: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}