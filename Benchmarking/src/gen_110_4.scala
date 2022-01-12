import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[Double],
    p1: Double
  )
  case class s3 (
    p0: s2,
    p1: s0
  )
  case class s6 (
    p0: Vector[s3],
    p1: s2
  )
  def f6(v0: s3): s3 = {
    var v4: s3 = v0
    var v5: s3 = v4
    var v2: s3 = v5
    var v7: s3 = v0
    val v1: s0 = v7.p1
    v4 = v4.copy(p1 = v1)
    var v10: s0 = v1
    val v8: Vector[Vector[Double]] = v10.p0
    v5 = v5.copy(p1 = v1)
    val v12: Vector[Vector[Double]] = v1.p1
    val v11: s2 = v5.p0
    var v6: s0 = v10
    v4 = v4.copy(p1 = v6)
    val v14: Vector[Double] = v12(0)
    val v3: Vector[Vector[Double]] = v1.p1
    var v26: Vector[Vector[Double]] = v12
    v6 = v6.copy(p1 = v12)
    v5 = v5.copy(p0 = v11)
    var v20: Vector[Vector[Double]] = v8
    v6 = v6.copy(p1 = v12)
    val v15: Vector[Double] = v26(0)
    val v24: Vector[Vector[Double]] = v10.p1
    val v28: Vector[Double] = v8(1)
    var v16: s3 = v4
    v6 = v6.copy(p0 = v20)
    v26 = v26.updated(0, v28)
    val v9: Vector[Double] = v8(0)
    val v27: Vector[Vector[Vector[Double]]] = Vector(v12, v3, v26, v26)
    val v21: Vector[Vector[Double]] = v6.p1
    v20 = v20.updated(1, v15)
    val v38: s2 = v5.p0
    val v37: s2 = v0.p0
    val v35: Vector[Double] = v37.p0
    var v36: s3 = v5
    val v39: Vector[Double] = v37.p0
    v5 = v5.copy(p0 = v38)
    v20 = v20.updated(1, v35)
    v4 = v4.copy(p1 = v10)
    val v63: Vector[Vector[Double]] = v27(3)
    v26 = v26.updated(0, v28)
    val v133: Vector[Vector[Double]] = v27(3)
    v7 = v7.copy(p1 = v6)
    v36 = v36.copy(p1 = v1)
    val v75: Vector[Double] = v20(1)
    v20 = v20.updated(1, v9)
    v7 = v2
    val v52: Vector[Vector[Vector[Double]]] = Vector(v8, v20, v8, v20, v20, v20)
    val v49: Vector[Vector[Double]] = v10.p0
    var v124: s0 = v1
    val v76: Vector[Vector[Double]] = v52(1)
    var v60: Vector[Vector[Double]] = v24
    v124 = v124.copy(p0 = v76)
    v20 = v20.updated(1, v35)
    var v176: s0 = v6
    v60 = v60.updated(0, v75)
    v124 = v124.copy(p1 = v133)
    v10 = v10.copy(p1 = v60)
    v4 = v4.copy(p1 = v176)
    v124 = v124.copy(p1 = v63)
    var v122: Vector[Vector[Vector[Double]]] = v52
    v124 = v124.copy(p0 = v49)
    val v123: Vector[Vector[Double]] = v10.p0
    v6 = v6.copy(p1 = v60)
    v26 = v26.updated(0, v39)
    v10 = v10.copy(p1 = v21)
    val v116: s2 = v16.p0
    val v97: Vector[Vector[Double]] = v122(5)
    v122 = v122.updated(3, v123)
    v36 = v36.copy(p1 = v124)
    v20 = v20.updated(1, v14)
    v7 = v7.copy(p0 = v37)
    val v200: s2 = v7.p0
    v2 = v2.copy(p0 = v200)
    v7 = v7.copy(p1 = v176)
    v2 = v2.copy(p0 = v116)
    v6 = v6.copy(p0 = v97)
    v36
  }
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    val v6: s3 = v0(1)
    val v7: s3 = f6(v6)
    var v20: Vector[s3] = v0
    val v30: s2 = v7.p0
    v20 = v20.updated(1, v6)
    v20 = v0
    val v23: s6 = s6(v20, v30)
    val v141: Vector[s6] = Vector(v23, v23, v23, v23, v23, v23, v23)
    val v87: s6 = v141(2)
    val v108: s2 = v87.p1
    val v139: Double = v108.p1
    v139
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s2(Vector(0.0), 1.0), s0(Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0)))), s3(s2(Vector(5.0), 6.0), s0(Vector(Vector(7.0), Vector(8.0)), Vector(Vector(9.0)))), s3(s2(Vector(10.0), 11.0), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}