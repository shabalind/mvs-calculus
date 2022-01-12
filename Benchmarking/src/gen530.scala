import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s2,
    p1: Vector[s0]
  )
  def f71(v0: Vector[Double]): Vector[Double] = {
    val v6: Double = v0(0)
    var v7: Double = v6
    var v4: Vector[Double] = v0
    v4 = v4.updated(0, v6)
    val v1: Double = v4(0)
    val v10: Double = v4(0)
    v4 = v4.updated(0, v10)
    var v8: Vector[Double] = v4
    var v5: Vector[Double] = v8
    val v2: Vector[Double] = Vector(v10, v10, v1, v1)
    val v9: Double = v7 * v1
    val v12: Double = v8(0)
    var v15: Vector[Double] = v4
    val v16: Double = v5(0)
    val v24: Double = v2(0)
    val v22: Double = v2(2)
    val v36: Double = v2(1)
    var v21: Vector[Double] = v0
    var v29: Vector[Double] = v4
    v8 = v8.updated(0, v24)
    v4 = v4.updated(0, v7)
    val v46: Double = v21(0)
    val v26: Vector[Double] = Vector(v16, v36, v7, v46)
    val v54: Double = v26(3)
    v5 = v5.updated(0, v24)
    v29 = v29.updated(0, v36)
    v4 = v4.updated(0, v54)
    v21 = v21.updated(0, v22)
    var v53: Double = v54
    val v30: Double = v2(1)
    var v34: Vector[Double] = v26
    var v55: Vector[Double] = v26
    var v39: Vector[Double] = v55
    val v49: Double = v4(0)
    v55 = v55.updated(0, v49)
    val v76: Double = v15(0)
    val v40: Double = v30 * v22
    val v47: Vector[Vector[Double]] = Vector(v2, v2, v34, v39, v55, v39)
    v8 = v8.updated(0, v40)
    var v35: Vector[Double] = v21
    v34 = v34.updated(2, v12)
    val v59: Vector[Double] = v47(5)
    var v92: Vector[Double] = v29
    v8 = v8.updated(0, v53)
    v35 = v35.updated(0, v53)
    val v72: Double = v59(3)
    v92 = v92.updated(0, v72)
    v4 = v4.updated(0, v9)
    v92 = v92.updated(0, v76)
    var v135: Vector[Double] = v92
    v35 = v135
    v15 = v15.updated(0, v46)
    v35
  }
  def f49(v0: Vector[Double]): Vector[Double] = {
    var v8: Vector[Double] = v0
    var v2: Vector[Double] = v0
    val v6: Double = v2(2)
    val v1: Double = v2(0)
    v2 = v2.updated(1, v6)
    var v18: Vector[Double] = v8
    var v15: Double = v1
    val v14: Double = v8(1)
    v8 = v8.updated(0, v14)
    v8 = v8.updated(2, v15)
    var v22: Vector[Double] = v18
    var v17: Vector[Double] = v22
    v17 = v17.updated(2, v1)
    v17
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    var v2: Double = v1
    val v4: Vector[s0] = v0.p1
    val v7: Double = v1 * v1
    val v9: Vector[Double] = Vector(v2, v1, v7)
    val v6: Vector[Double] = f49(v9)
    var v3: Vector[Double] = v9
    val v14: s0 = v4(0)
    val v10: Vector[Vector[Double]] = v14.p0
    v3 = v3.updated(0, v2)
    val v19: Vector[Double] = v10(0)
    v3 = v6
    val v24: Double = v19(0)
    val v33: Double = v3(2)
    val v54: Vector[Double] = f49(v3)
    var v57: Vector[Double] = v19
    val v25: Vector[Double] = f71(v57)
    v3 = v3.updated(2, v7)
    val v175: Vector[Double] = f71(v25)
    v57 = v57.updated(0, v33)
    var v63: Double = v7
    val v60: Double = v54(2)
    val v120: Double = v24 / v60
    v57 = v57.updated(0, v63)
    val v52: Double = v175(0)
    v3 = v3.updated(2, v7)
    val v133: Double = v120 / v52
    v133
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0)))))), Vector(s1(Vector(s0(Vector(Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0)))))), Vector(s1(Vector(s0(Vector(Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)))))))), Vector(s0(Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)))))
    val v1: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}