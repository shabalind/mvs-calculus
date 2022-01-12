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
  @noinline
  def f0(v0: s1, v1: Double, v2: s1, v3: s1): Double = {
    val v4: Vector[s0] = v3.p0
    val v8: s0 = v4(2)
    val v17: Vector[Vector[Double]] = v8.p1
    val v15: Vector[Vector[Double]] = v8.p0
    var v29: Vector[Vector[Double]] = v15
    val v16: Vector[Double] = v17(0)
    val v33: Vector[Double] = v29(0)
    val v81: Double = v33(0)
    val v110: Double = v16(0)
    val v98: Double = v81 / v110
    var v107: Double = v98
    v107
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), Vector(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))))))
    val v1: Double = 10.0
    val v2: s1 = s1(Vector(s0(Vector(Vector(11.0)), Vector(Vector(12.0))), s0(Vector(Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0)))), Vector(Vector(s0(Vector(Vector(17.0)), Vector(Vector(18.0)))), Vector(s0(Vector(Vector(19.0)), Vector(Vector(20.0))))))
    val v3: s1 = s1(Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0))), s0(Vector(Vector(23.0)), Vector(Vector(24.0))), s0(Vector(Vector(25.0)), Vector(Vector(26.0)))), Vector(Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0)))), Vector(s0(Vector(Vector(29.0)), Vector(Vector(30.0))))))
    val start = nanoTime()
    var result: Double = StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[21.0]], [[22.0]]]), StructValue(Name(str='s0', ty=None), [[[23.0]], [[24.0]]]), StructValue(Name(str='s0', ty=None), [[[25.0]], [[26.0]]])], [[StructValue(Name(str='s0', ty=None), [[[27.0]], [[28.0]]])], [StructValue(Name(str='s0', ty=None), [[[29.0]], [[30.0]]])]]])
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}