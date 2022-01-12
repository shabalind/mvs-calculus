import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: s2
  )
  case class s4 (
    p0: Vector[Vector[Double]],
    p1: s1
  )
  case class s9 (
    p0: s4,
    p1: Vector[Vector[Double]]
  )
  def f82(v0: Double): Double = {
    var v5: Double = v0
    v5 = v0
    var v2: Double = v0
    var v7: Double = v5
    var v3: Double = v0
    var v10: Double = v2
    var v4: Double = v7
    v4 = v3
    var v14: Double = v2
    val v1: Double = v14 + v10
    var v12: Double = v3
    val v8: Vector[Double] = Vector(v10, v12)
    val v11: Double = v14 - v4
    var v9: Vector[Double] = v8
    var v21: Vector[Double] = v8
    var v20: Double = v0
    v21 = v21.updated(1, v5)
    v21 = v21.updated(0, v2)
    val v35: Double = v9(0)
    v21 = v21.updated(1, v4)
    v21 = v21.updated(0, v20)
    val v18: Double = v9(0)
    v9 = v9.updated(1, v1)
    v9 = v9.updated(1, v1)
    v9 = v9.updated(0, v14)
    v9 = v9.updated(0, v11)
    v2 = v18
    v21 = v21.updated(0, v35)
    var v40: Vector[Double] = v21
    v21 = v21.updated(1, v7)
    var v24: Vector[Double] = v8
    val v48: Double = v8(1)
    val v19: Double = v9(0)
    var v25: Vector[Double] = v8
    v24 = v24.updated(1, v19)
    var v56: Vector[Double] = v25
    var v34: Double = v0
    var v36: Vector[Double] = v40
    v21 = v21.updated(1, v48)
    var v39: Vector[Double] = v25
    var v64: Double = v34
    val v45: Vector[Vector[Double]] = Vector(v39, v56, v36, v21, v24, v21, v24)
    var v70: Vector[Vector[Double]] = v45
    v36 = v36.updated(0, v64)
    var v71: Vector[Vector[Double]] = v70
    val v132: Double = v5 - v19
    val v124: Double = v56(0)
    v12 = v14
    v39 = v39.updated(0, v124)
    v71 = v71.updated(3, v56)
    var v163: Vector[Vector[Double]] = v71
    val v75: Vector[Double] = v163(6)
    val v102: Double = v75(1)
    v3 = v132
    v102
  }
  @noinline
  def f0(v0: s4, v1: s9, v2: Vector[Vector[s3]], v3: Double): Double = {
    val v5: Double = f82(v3)
    val v6: Double = f82(v3)
    val v48: Double = f82(v5)
    val v30: Double = v6 + v6
    val v22: Double = v48 * v30
    v22
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(Vector(0.0)), s1(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)), Vector(Vector(12.0))), s0(Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0))))))
    val v1: s9 = s9(s4(Vector(Vector(17.0)), s1(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0))), Vector(s0(Vector(Vector(22.0), Vector(23.0), Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0)))))), Vector(Vector(34.0), Vector(35.0)))
    val v2: Vector[Vector[s3]] = Vector(Vector(s3(s2(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))))), Vector(s3(s2(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))))))
    val v3: Double = 52.0
    val start = nanoTime()
    var result: Double = 52.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}