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
  case class s2 (
    p0: s0,
    p1: s0,
    p2: Vector[s0]
  )
  case class s3 (
    p0: s2,
    p1: s1
  )
  case class s5 (
    p0: Vector[s3],
    p1: s1
  )
  case class s8 (
    p0: s2,
    p1: Vector[s5]
  )
  @noinline
  def f0(v0: s0, v1: s3, v2: s0, v3: s8, v4: Double): Double = {
    val v6: Vector[Vector[Double]] = v0.p1
    var v9: Vector[Vector[Double]] = v6
    val v15: Vector[Double] = v9(0)
    val v18: Vector[Double] = v9(0)
    val v14: Vector[Vector[Double]] = v0.p0
    v9 = v9.updated(0, v18)
    v9 = v9.updated(0, v18)
    val v32: Vector[Vector[Double]] = v2.p1
    val v37: Vector[Double] = v32(0)
    v9 = v9.updated(0, v15)
    val v46: Vector[Vector[Double]] = Vector(v15, v37, v15)
    val v55: Vector[Double] = v46(2)
    v9 = v9.updated(0, v37)
    val v134: Vector[Double] = v46(0)
    var v65: Vector[Vector[Double]] = v46
    val v87: Vector[Double] = v65(0)
    v65 = v65.updated(1, v15)
    v65 = v65.updated(2, v134)
    v9 = v9.updated(0, v55)
    v65 = v65.updated(2, v18)
    v65 = v65.updated(2, v87)
    val v88: Double = v18(0)
    v65 = v65.updated(2, v87)
    var v97: Double = v88
    val v180: Vector[Double] = v14(0)
    val v234: Vector[Double] = v65(2)
    v9 = v9.updated(0, v234)
    v65 = v65.updated(2, v180)
    v97
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0)))
    val v1: s3 = s3(s2(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), Vector(Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0)))))))
    val v2: s0 = s0(Vector(Vector(12.0)), Vector(Vector(13.0)))
    val v3: s8 = s8(s2(s0(Vector(Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))))), Vector(s5(Vector(s3(s2(s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0))))), s1(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), Vector(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0))))))), s3(s2(s0(Vector(Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0))), Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0))))), s1(s0(Vector(Vector(36.0)), Vector(Vector(37.0))), Vector(Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0)))))))), s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0))), Vector(Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0)))))))))
    val v4: Double = 44.0
    val start = nanoTime()
    var result: Double = 44.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}