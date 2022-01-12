import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f37(v0: Double): Double = {
    var v2: Double = v0
    var v7: Double = v0
    var v6: Double = v2
    var v1: Double = v0
    var v3: Double = v2
    v6 = v1
    var v9: Double = v2
    var v20: Double = v3
    val v15: Vector[Double] = Vector(v7, v20, v3, v9, v3)
    var v11: Vector[Double] = v15
    v11 = v11.updated(1, v6)
    val v23: Double = v15(0)
    var v27: Vector[Double] = v11
    val v17: Double = v27(3)
    v11 = v11.updated(1, v17)
    v27 = v27.updated(1, v23)
    var v30: Vector[Double] = v27
    var v37: Vector[Double] = v30
    val v33: Double = v37(2)
    var v34: Double = v33
    v34
  }
  @noinline
  def f0(v0: s1, v1: Vector[Vector[s0]], v2: Double): Double = {
    var v3: Double = v2
    val v8: Double = f37(v2)
    var v5: Double = v8
    val v11: Double = f37(v5)
    val v23: Double = v11 + v3
    val v50: Double = f37(v23)
    v50
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)))))
    val v2: Double = 21.0
    val start = nanoTime()
    var result: Double = 21.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}