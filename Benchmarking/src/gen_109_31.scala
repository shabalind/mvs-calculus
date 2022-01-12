import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[Vector[s2]]
  )
  def f60(v0: Double): Double = {
    var v7: Double = v0
    var v6: Double = v0
    var v1: Double = v0
    var v8: Double = v6
    var v5: Double = v0
    var v10: Double = v8
    v7 = v0
    v10 = v7
    v1 = v0
    var v12: Double = v5
    var v18: Double = v8
    var v24: Double = v7
    var v3: Double = v10
    var v11: Double = v0
    v5 = v8
    var v28: Double = v24
    var v21: Double = v28
    v5 = v1
    var v16: Double = v5
    var v25: Double = v6
    var v15: Double = v16
    val v17: Double = v11 - v12
    var v42: Double = v15
    val v31: Vector[Double] = Vector(v42, v3, v25, v21, v5, v18)
    var v33: Vector[Double] = v31
    var v50: Vector[Double] = v33
    v50 = v50.updated(1, v17)
    val v39: Double = v50(2)
    v39
  }
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: s3, v2: Double): Double = {
    val v15: Double = f60(v2)
    v15
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(Vector(s2(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), s2(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), s2(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0)))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0)))))), Vector(Vector(s2(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0)))), Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0))))))))))
    val v1: s3 = s3(Vector(s2(s1(s0(Vector(Vector(32.0)), Vector(Vector(33.0)))), Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0))), s0(Vector(Vector(38.0)), Vector(Vector(39.0))))), s2(s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0)))), Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0))), s0(Vector(Vector(46.0)), Vector(Vector(47.0))))), s2(s1(s0(Vector(Vector(48.0)), Vector(Vector(49.0)))), Vector(s0(Vector(Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0)))))), Vector(Vector(s2(s1(s0(Vector(Vector(56.0)), Vector(Vector(57.0)))), Vector(s0(Vector(Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0))), s0(Vector(Vector(62.0)), Vector(Vector(63.0))))))))
    val v2: Double = 64.0
    val start = nanoTime()
    var result: Double = 64.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}