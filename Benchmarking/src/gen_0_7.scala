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
  @noinline
  def f0(v0: s1, v1: s1, v2: Double): Double = {
    var v4: Double = v2
    var v3: Double = v4
    var v15: Double = v3
    val v7: Double = v3 + v15
    val v14: Vector[Double] = Vector(v15, v3)
    val v29: Double = v14(1)
    var v33: Vector[Double] = v14
    val v20: Vector[Vector[Double]] = Vector(v33, v14, v14)
    v33 = v33.updated(0, v7)
    v33 = v33.updated(1, v29)
    var v48: Vector[Vector[Double]] = v20
    val v42: Vector[Double] = v20(1)
    v33 = v42
    val v56: Vector[Double] = v48(2)
    v48 = v48.updated(2, v42)
    var v144: Vector[Double] = v56
    v48 = v48.updated(1, v144)
    val v81: Double = v56(0)
    v48 = v48.updated(0, v33)
    v144 = v144.updated(0, v7)
    v81
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))))
    val v1: s1 = s1(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))))
    val v2: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}