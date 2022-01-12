import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s5 (
    p0: s1,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s5, v1: Double): Double = {
    val v6: s1 = v0.p0
    val v13: Vector[Vector[s0]] = v6.p1
    var v11: Vector[Vector[s0]] = v13
    var v21: Vector[Vector[s0]] = v13
    val v23: Vector[s0] = v11(1)
    val v18: Vector[s0] = v21(2)
    val v22: s0 = v23(0)
    val v24: Vector[Vector[Double]] = v22.p0
    val v56: Vector[Double] = v24(0)
    val v44: Vector[Vector[Double]] = Vector(v56, v56, v56)
    var v42: Vector[Vector[Double]] = v44
    val v79: Vector[Double] = v42(1)
    v42 = v44
    val v125: Double = v79(0)
    var v285: Vector[Vector[Double]] = v44
    val v167: Vector[Double] = v285(2)
    v11 = v11.updated(2, v18)
    v42 = v285
    v285 = v285.updated(2, v167)
    v125
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)))))
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