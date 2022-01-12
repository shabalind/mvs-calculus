import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  def f30(v0: Double): Double = {
    var v7: Double = v0
    var v5: Double = v7
    var v9: Double = v0
    var v2: Double = v5
    var v11: Double = v7
    val v15: Vector[Double] = Vector(v5, v7, v2, v2, v5)
    val v21: Double = v15(3)
    var v18: Vector[Double] = v15
    val v8: Double = v18(2)
    v7 = v11
    v18 = v18.updated(0, v2)
    v18 = v18.updated(4, v21)
    v18 = v18.updated(4, v9)
    v18 = v18.updated(3, v9)
    v8
  }
  @noinline
  def f0(v0: s1, v1: s0, v2: s2, v3: Double): Double = {
    val v18: Double = v3 + v3
    var v17: Double = v18
    var v14: Double = v17
    val v19: Double = v3 / v17
    v14 = v19
    val v47: Double = f30(v14)
    v17 = v3
    v47
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))))), Vector(Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))))
    val v1: s0 = s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))
    val v2: s2 = s2(Vector(s1(Vector(Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))))), s1(Vector(Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))))), Vector(Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))))
    val v3: Double = 44.0
    val start = nanoTime()
    var result: Double = 44.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}