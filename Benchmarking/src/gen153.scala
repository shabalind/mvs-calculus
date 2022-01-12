import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: s1
  )
  case class s4 (
    p0: Vector[s2],
    p1: s2
  )
  def f28(v0: Double): Double = {
    var v1: Double = v0
    var v2: Double = v1
    v2 = v0
    var v5: Double = v1
    var v7: Double = v1
    var v6: Double = v7
    v6 = v0
    var v4: Double = v2
    var v10: Double = v5
    var v14: Double = v4
    var v3: Double = v14
    var v8: Double = v6
    val v11: Double = v5 / v6
    var v15: Double = v4
    var v24: Double = v11
    var v13: Double = v0
    var v21: Double = v5
    var v31: Double = v0
    val v35: Vector[Double] = Vector(v3, v21, v8, v15)
    val v27: Double = v35(0)
    var v62: Double = v3
    v24 = v13
    val v29: Double = v35(3)
    val v46: Double = v35(1)
    val v30: Double = v31 + v62
    var v52: Vector[Double] = v35
    var v33: Vector[Double] = v52
    v52 = v52.updated(2, v21)
    var v75: Vector[Double] = v33
    v33 = v33.updated(2, v15)
    v33 = v33.updated(1, v29)
    v75 = v75.updated(2, v31)
    val v42: Double = v30 / v27
    var v47: Vector[Double] = v35
    v52 = v52.updated(1, v29)
    var v28: Vector[Double] = v33
    val v71: Vector[Vector[Double]] = Vector(v28, v35, v33, v75, v47, v52, v75)
    v47 = v52
    val v109: Vector[Double] = v71(1)
    val v32: Double = v109(0)
    v33 = v33.updated(3, v10)
    v52 = v52.updated(3, v24)
    v33 = v33.updated(0, v46)
    v24 = v42
    v32
  }
  @noinline
  def f0(v0: s4, v1: s3, v2: s3, v3: Double): Double = {
    val v5: Double = f28(v3)
    val v7: Double = f28(v5)
    val v28: Double = v7 - v7
    v28
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(s2(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), s2(s1(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))
    val v1: s3 = s3(s1(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))))
    val v2: s3 = s3(s1(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)))))
    val v3: Double = 50.0
    val start = nanoTime()
    var result: Double = 50.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}