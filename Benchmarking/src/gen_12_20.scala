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
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Vector[s1], v2: s0, v3: Vector[s1], v4: Double, v5: s1): Double = {
    val v11: Vector[Vector[s0]] = v5.p1
    val v18: Vector[s0] = v11(1)
    val v21: Vector[Vector[Double]] = v2.p1
    var v27: Double = v4
    val v25: s0 = v18(0)
    val v29: Vector[Double] = v21(0)
    val v33: Vector[Vector[Double]] = v25.p0
    var v46: Vector[Vector[Double]] = v33
    val v38: Vector[Double] = v46(0)
    v46 = v46.updated(0, v29)
    var v104: Vector[Double] = v38
    val v233: Double = v104(0)
    v104 = v104.updated(0, v27)
    v233
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))))), Vector(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))))))))
    val v1: Vector[s1] = Vector(s1(Vector(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0))))), Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0)))))))
    val v2: s0 = s0(Vector(Vector(16.0)), Vector(Vector(17.0)))
    val v3: Vector[s1] = Vector(s1(Vector(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0))))), Vector(Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0)))))), s1(Vector(Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0)))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0))))), Vector(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0)))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0)))))), s1(Vector(Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0))))), Vector(Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0)))), Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0)))))))
    val v4: Double = 42.0
    val v5: s1 = s1(Vector(Vector(s0(Vector(Vector(43.0)), Vector(Vector(44.0)))), Vector(s0(Vector(Vector(45.0)), Vector(Vector(46.0))))), Vector(Vector(s0(Vector(Vector(47.0)), Vector(Vector(48.0)))), Vector(s0(Vector(Vector(49.0)), Vector(Vector(50.0))))))
    val start = nanoTime()
    var result: Double = StructValue(Name(str='s1', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[43.0]], [[44.0]]])], [StructValue(Name(str='s0', ty=None), [[[45.0]], [[46.0]]])]], [[StructValue(Name(str='s0', ty=None), [[[47.0]], [[48.0]]])], [StructValue(Name(str='s0', ty=None), [[[49.0]], [[50.0]]])]]])
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}