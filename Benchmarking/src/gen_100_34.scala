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
    p1: Vector[s0]
  )
  case class s3 (
    p0: s0,
    p1: s2
  )
  case class s11 (
    p0: Vector[Vector[s3]],
    p1: Vector[Vector[s1]]
  )
  def f7(v0: Vector[Vector[s11]], v1: Double): Double = {
    var v26: Double = v1
    var v57: Double = v26
    var v32: Double = v57
    v32
  }
  @noinline
  def f0(v0: Vector[Vector[s11]], v1: s1, v2: Double): Double = {
    val v7: Double = f7(v0, v2)
    val v6: Double = f7(v0, v7)
    val v9: Vector[s11] = v0(0)
    val v18: Double = f7(v0, v7)
    val v15: Double = f7(v0, v6)
    var v17: Vector[Vector[s11]] = v0
    val v37: Double = f7(v0, v2)
    val v39: Double = f7(v17, v37)
    val v67: Double = f7(v0, v39)
    val v74: Double = f7(v0, v67)
    v17 = v17.updated(0, v9)
    val v44: Double = f7(v17, v67)
    val v73: Double = f7(v0, v74)
    val v46: Double = f7(v0, v73)
    val v70: Double = f7(v0, v44)
    val v156: Double = f7(v0, v15)
    val v77: Double = v156 + v37
    val v55: Double = f7(v17, v70)
    val v60: Vector[Double] = Vector(v55, v18, v77, v74, v46)
    val v112: Double = v60(4)
    v112
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s11]] = Vector(Vector(s11(Vector(Vector(s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s2(Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0)))))))), Vector(Vector(s1(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0))))), Vector(s1(s0(Vector(Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0)))))))))
    val v1: s1 = s1(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0))))
    val v2: Double = 22.0
    val start = nanoTime()
    var result: Double = 22.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}