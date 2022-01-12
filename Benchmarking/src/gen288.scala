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
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: s0
  )
  case class s8 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s3]]
  )
  def f45(v0: s2): s2 = {
    val v7: s0 = v0.p1
    val v13: Vector[Vector[Double]] = v7.p1
    val v16: Vector[Vector[Double]] = v7.p0
    val v24: s0 = s0(v16, v13)
    val v27: Vector[s0] = Vector(v24, v24)
    var v80: Vector[s0] = v27
    val v124: s0 = v80(1)
    var v180: s2 = v0
    v180 = v180.copy(p1 = v124)
    v180
  }
  def f43(v0: s0): s0 = {
    var v5: s0 = v0
    val v2: Vector[s0] = Vector(v0, v0, v0, v0)
    var v7: s0 = v0
    val v3: Vector[Vector[Double]] = v5.p1
    var v4: Vector[s0] = v2
    v5 = v5.copy(p1 = v3)
    val v8: s0 = v4(3)
    var v10: Vector[s0] = v4
    var v11: Vector[s0] = v2
    var v6: Vector[Vector[Double]] = v3
    var v12: Vector[Vector[Double]] = v6
    val v18: s0 = v11(3)
    v11 = v11.updated(2, v8)
    val v14: Vector[Vector[Double]] = v18.p0
    val v25: s0 = v10(0)
    v4 = v4.updated(2, v25)
    v7 = v7.copy(p0 = v14)
    var v22: Vector[Vector[Double]] = v3
    var v23: Vector[Vector[Double]] = v14
    var v21: Vector[Vector[Double]] = v23
    val v36: s0 = v11(2)
    v7 = v7.copy(p1 = v12)
    val v20: Vector[Vector[Double]] = v36.p0
    val v40: Vector[Vector[Double]] = v25.p1
    val v51: Vector[Double] = v21(0)
    v7 = v7.copy(p0 = v20)
    var v38: Vector[Vector[Double]] = v20
    v7 = v7.copy(p1 = v12)
    var v31: Vector[Vector[Double]] = v6
    val v39: s2 = s2(v18, v5)
    v4 = v4.updated(3, v5)
    var v71: s2 = v39
    val v77: s2 = f45(v39)
    v5 = v5.copy(p0 = v38)
    v7 = v7.copy(p1 = v31)
    val v100: s0 = v10(2)
    val v29: s0 = v77.p1
    var v46: s2 = v71
    val v64: s2 = f45(v46)
    v71 = v71.copy(p0 = v36)
    val v70: s2 = f45(v64)
    v5 = v5.copy(p1 = v40)
    v71 = v71.copy(p0 = v29)
    v71 = v71.copy(p1 = v100)
    v12 = v12.updated(0, v51)
    val v52: s0 = v39.p1
    v46 = v46.copy(p0 = v100)
    v71 = v71.copy(p1 = v52)
    val v126: Vector[Vector[Double]] = v7.p0
    v71 = v71.copy(p1 = v5)
    v4 = v4.updated(0, v18)
    val v239: s0 = v70.p1
    val v170: Vector[Vector[Double]] = v239.p1
    v6 = v170
    v5 = v5.copy(p1 = v22)
    v5 = v5.copy(p0 = v126)
    v239
  }
  @noinline
  def f0(v0: Vector[s1], v1: s8, v2: Double): Double = {
    val v4: s1 = v0(0)
    val v7: s0 = v4.p0
    var v9: Double = v2
    val v18: Double = v9 * v9
    val v19: Vector[Vector[Double]] = v7.p0
    val v59: s0 = f43(v7)
    val v20: Vector[Vector[Double]] = v59.p0
    var v45: Double = v18
    val v28: Vector[Double] = v19(0)
    val v42: Vector[Double] = v20(0)
    val v26: Double = v28(0)
    var v48: Vector[Double] = v28
    v48 = v48.updated(0, v45)
    val v39: Double = v26 + v9
    val v84: Double = v42(0)
    var v94: Vector[Double] = v48
    v48 = v48.updated(0, v84)
    v48 = v48.updated(0, v26)
    v48 = v48.updated(0, v84)
    v48 = v48.updated(0, v18)
    v94 = v94.updated(0, v39)
    val v53: Double = v94(0)
    v48 = v48.updated(0, v2)
    v53
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))
    val v1: s8 = s8(Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), Vector(Vector(s3(Vector(Vector(s2(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)))))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), Vector(s3(Vector(Vector(s2(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0)))))))
    val v2: Double = 33.0
    val start = nanoTime()
    var result: Double = 33.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}