import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: s1, v1: Double, v2: s1): Double = {
    val v6: Vector[Vector[s0]] = v0.p1
    val v4: Vector[s0] = v6(0)
    val v3: s0 = v4(0)
    var v12: Double = v1
    val v17: Vector[Vector[Double]] = v3.p0
    val v52: Vector[Double] = v17(0)
    val v39: Double = v52(0)
    val v81: Double = v52(0)
    val v146: Double = v81 * v39
    var v78: Double = v12
    val v97: Double = v146 - v78
    v97
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))))
    val v1: Double = 15.0
    val v2: s1 = s1(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0))), Vector(Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0), Vector(25.0)))), Vector(s0(Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0), Vector(30.0))))))
    val start = nanoTime()
    var result: Double = StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[16.0], [17.0]], [[18.0], [19.0], [20.0]]]), [[StructValue(Name(str='s0', ty=None), [[[21.0], [22.0]], [[23.0], [24.0], [25.0]]])], [StructValue(Name(str='s0', ty=None), [[[26.0], [27.0]], [[28.0], [29.0], [30.0]]])]]])
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}