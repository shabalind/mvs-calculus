import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: Vector[Double]
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: Vector[s2]
  )
  def f28(v0: Double): Double = {
    var v7: Double = v0
    var v1: Double = v7
    var v4: Double = v7
    var v6: Double = v4
    var v8: Double = v0
    var v5: Double = v1
    v7 = v1
    var v20: Double = v5
    var v12: Double = v6
    var v9: Double = v20
    var v11: Double = v20
    var v21: Double = v0
    v6 = v21
    v21 = v11
    val v29: Vector[Double] = Vector(v8)
    val v18: Vector[Double] = Vector(v4, v1)
    val v26: Double = v29(0)
    var v19: Vector[Double] = v18
    val v28: Double = v19(0)
    var v24: Vector[Double] = v29
    val v25: Double = v24(0)
    var v27: Double = v5
    val v34: Double = v29(0)
    v19 = v19.updated(1, v26)
    val v44: Vector[Double] = Vector(v27, v11, v25, v9, v26, v0)
    var v46: Vector[Double] = v44
    v21 = v28
    val v30: Double = v46(0)
    val v77: Double = v18(0)
    val v59: Double = v44(4)
    v46 = v46.updated(4, v27)
    var v150: Vector[Double] = v44
    val v32: Double = v19(1)
    v19 = v19.updated(1, v77)
    v19 = v19.updated(1, v12)
    v150 = v150.updated(2, v34)
    v150 = v150.updated(4, v32)
    val v57: Double = v150(1)
    v46 = v46.updated(2, v8)
    v9 = v59
    v6 = v30
    v150 = v46
    v57
  }
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    val v2: Double = f28(v1)
    val v8: Double = f28(v1)
    val v16: Double = f28(v1)
    val v19: Double = f28(v2)
    val v28: Double = f28(v16)
    val v27: Vector[Double] = Vector(v19, v2, v8, v19, v28)
    val v26: Double = v27(4)
    val v72: Double = f28(v26)
    v72
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), Vector(8.0, 9.0, 10.0))), Vector(s1(s0(Vector(Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0))), Vector(19.0, 20.0, 21.0)))), Vector(s2(s1(s0(Vector(Vector(22.0)), Vector(Vector(23.0), Vector(24.0), Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), Vector(30.0, 31.0, 32.0)), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0), Vector(36.0)))), s2(s1(s0(Vector(Vector(37.0)), Vector(Vector(38.0), Vector(39.0), Vector(40.0))), s0(Vector(Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), Vector(45.0, 46.0, 47.0)), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))), s2(s1(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), Vector(60.0, 61.0, 62.0)), s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0), Vector(66.0)))))))
    val v1: Double = 67.0
    val start = nanoTime()
    var result: Double = 67.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}