import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: s1
  )
  @noinline
  def f0(v0: Double, v1: s3): Double = {
    val v7: Vector[Double] = Vector(v0, v0)
    val v2: Double = v7(1)
    var v3: Vector[Double] = v7
    val v5: Double = v3(1)
    val v11: Double = v3(1)
    v3 = v3.updated(1, v11)
    v3 = v3.updated(0, v5)
    v3 = v3.updated(1, v11)
    v3 = v3.updated(0, v11)
    var v47: Vector[Double] = v3
    v3 = v47
    v3 = v3.updated(0, v11)
    v47 = v47.updated(1, v2)
    val v137: Double = v47(1)
    v137
  }
  def benchmark(): Unit = {
    val v0: Double = 0.0
    val v1: s3 = s3(s1(Vector(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)))), s0(Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0)))), s1(Vector(s0(Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0)))), s0(Vector(Vector(19.0), Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))))
    val start = nanoTime()
    var result: Double = StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[1.0], [2.0], [3.0]], [[4.0], [5.0], [6.0]]])], StructValue(Name(str='s0', ty=None), [[[7.0], [8.0], [9.0]], [[10.0], [11.0], [12.0]]])]), StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[13.0], [14.0], [15.0]], [[16.0], [17.0], [18.0]]])], StructValue(Name(str='s0', ty=None), [[[19.0], [20.0], [21.0]], [[22.0], [23.0], [24.0]]])])])
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}