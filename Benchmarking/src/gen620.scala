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
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s1],
    p1: s2
  )
  def f22(v0: Double): Double = {
    val v6: Double = v0 + v0
    var v5: Double = v6
    var v1: Double = v0
    v1 = v5
    var v3: Double = v1
    var v8: Double = v6
    var v11: Double = v8
    var v12: Double = v5
    var v4: Double = v8
    v3 = v4
    var v17: Double = v12
    var v14: Double = v3
    var v2: Double = v11
    var v15: Double = v14
    var v10: Double = v14
    val v27: Vector[Double] = Vector(v15, v10, v17)
    val v30: Vector[Vector[Double]] = Vector(v27, v27, v27, v27, v27, v27)
    val v20: Double = v11 + v17
    v14 = v2
    val v46: Vector[Double] = v30(0)
    val v23: Vector[Double] = v30(0)
    val v16: Double = v5 + v4
    var v24: Vector[Double] = v46
    var v13: Vector[Double] = v46
    v13 = v13.updated(1, v20)
    v24 = v24.updated(1, v20)
    var v34: Vector[Vector[Double]] = v30
    v13 = v13.updated(2, v14)
    v13 = v13.updated(0, v8)
    v13 = v13.updated(1, v1)
    var v41: Vector[Double] = v27
    val v60: Vector[Double] = v34(1)
    val v32: Vector[Double] = v30(4)
    v15 = v3
    var v53: Vector[Double] = v13
    v13 = v13.updated(2, v3)
    var v56: Vector[Double] = v32
    var v35: Vector[Double] = v60
    v24 = v24.updated(2, v3)
    v35 = v35.updated(2, v16)
    v24 = v24.updated(1, v1)
    v34 = v34.updated(4, v56)
    val v96: Double = v35(0)
    var v52: Vector[Double] = v53
    val v65: Double = v52(1)
    val v117: Double = v41(1)
    v41 = v41.updated(0, v20)
    v52 = v52.updated(1, v117)
    val v105: Vector[Double] = Vector(v8, v96, v1, v20, v96, v65)
    var v115: Vector[Double] = v105
    v41 = v41.updated(1, v96)
    val v148: Double = v115(5)
    v52 = v52.updated(1, v4)
    val v79: Double = v24(0)
    v34 = v34.updated(0, v23)
    v35 = v35.updated(2, v79)
    var v94: Double = v148
    v94
  }
  @noinline
  def f0(v0: s3, v1: Vector[Vector[s2]], v2: Double): Double = {
    val v16: Double = v2 / v2
    val v19: Vector[Double] = Vector(v16, v16, v16, v16, v16, v2, v2)
    val v36: Double = f22(v2)
    val v77: Double = v19(2)
    val v60: Double = f22(v77)
    val v123: Double = f22(v60)
    val v232: Double = v123 * v36
    v232
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))))), s2(Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))))
    val v1: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))))), Vector(s2(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))))))
    val v2: Double = 56.0
    val start = nanoTime()
    var result: Double = 56.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}