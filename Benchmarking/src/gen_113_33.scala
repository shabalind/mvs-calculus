import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s3 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[s0]],
    p2: Vector[Vector[s0]],
    p3: Vector[s1],
    p4: Vector[Vector[s0]]
  )
  def f117(v0: Double): Double = {
    var v4: Double = v0
    var v6: Double = v0
    var v5: Double = v4
    val v8: Double = v4 * v5
    val v2: Double = v0 / v8
    var v1: Double = v4
    v6 = v1
    var v23: Double = v4
    val v14: Vector[Double] = Vector(v6, v4, v1, v4, v6)
    var v18: Double = v23
    var v25: Vector[Double] = v14
    val v21: Double = v14(4)
    var v13: Vector[Double] = v14
    var v20: Double = v18
    v13 = v13.updated(4, v1)
    v25 = v25.updated(4, v8)
    v13 = v13.updated(1, v21)
    v13 = v13.updated(4, v2)
    v13 = v13.updated(2, v2)
    var v32: Vector[Double] = v13
    var v35: Double = v0
    v5 = v1
    val v90: Double = v14(3)
    var v39: Double = v20
    v32 = v32.updated(3, v18)
    var v57: Double = v2
    v32 = v32.updated(1, v8)
    v25 = v25.updated(0, v1)
    v1 = v39
    var v45: Double = v90
    val v49: Double = v32(0)
    v13 = v13.updated(1, v57)
    var v44: Vector[Double] = v25
    var v75: Vector[Double] = v44
    v45 = v1
    v5 = v23
    v13 = v13.updated(4, v45)
    v75 = v75.updated(3, v23)
    val v109: Vector[Vector[Double]] = Vector(v25)
    val v97: Double = v75(3)
    val v79: Double = v14(3)
    var v58: Vector[Vector[Double]] = v109
    val v148: Vector[Double] = v58(0)
    v13 = v13.updated(3, v49)
    v58 = v58.updated(0, v14)
    v44 = v44.updated(2, v79)
    v13 = v148
    v75 = v75.updated(3, v35)
    v75 = v75.updated(3, v20)
    v57 = v21
    v44 = v44.updated(0, v49)
    v97
  }
  def f104(v0: Double): Double = {
    val v1: Double = f117(v0)
    var v6: Double = v0
    val v5: Double = f117(v6)
    val v3: Double = f117(v1)
    val v8: Double = f117(v5)
    var v2: Double = v8
    val v4: Double = f117(v2)
    val v10: Double = f117(v0)
    val v20: Double = f117(v10)
    var v7: Double = v3
    val v13: Vector[Double] = Vector(v8, v7, v1, v3)
    val v9: Double = f117(v20)
    var v24: Vector[Double] = v13
    val v45: Double = v24(1)
    var v28: Vector[Double] = v24
    v28 = v28.updated(2, v9)
    v24 = v24.updated(2, v45)
    val v12: Double = f117(v10)
    var v22: Double = v3
    var v62: Vector[Double] = v13
    v24 = v24.updated(2, v22)
    val v27: Double = f117(v4)
    v62 = v28
    v28 = v28.updated(2, v8)
    v62 = v62.updated(1, v45)
    val v56: Double = v62(2)
    var v30: Double = v56
    v30 = v12
    v62 = v62.updated(1, v22)
    v24 = v24.updated(2, v27)
    v30
  }
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: Double): Double = {
    var v4: Double = v1
    val v32: Double = f104(v4)
    val v31: Double = f117(v32)
    v31
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(s0(Vector(2.0), Vector(Vector(3.0)))), Vector(s0(Vector(4.0), Vector(Vector(5.0)))), Vector(s0(Vector(6.0), Vector(Vector(7.0))))), Vector(Vector(s0(Vector(8.0), Vector(Vector(9.0))))), Vector(s1(Vector(Vector(s0(Vector(10.0), Vector(Vector(11.0)))), Vector(s0(Vector(12.0), Vector(Vector(13.0)))), Vector(s0(Vector(14.0), Vector(Vector(15.0))))), s0(Vector(16.0), Vector(Vector(17.0))))), Vector(Vector(s0(Vector(18.0), Vector(Vector(19.0)))), Vector(s0(Vector(20.0), Vector(Vector(21.0))))))), Vector(s3(Vector(Vector(22.0), Vector(23.0)), Vector(Vector(s0(Vector(24.0), Vector(Vector(25.0)))), Vector(s0(Vector(26.0), Vector(Vector(27.0)))), Vector(s0(Vector(28.0), Vector(Vector(29.0))))), Vector(Vector(s0(Vector(30.0), Vector(Vector(31.0))))), Vector(s1(Vector(Vector(s0(Vector(32.0), Vector(Vector(33.0)))), Vector(s0(Vector(34.0), Vector(Vector(35.0)))), Vector(s0(Vector(36.0), Vector(Vector(37.0))))), s0(Vector(38.0), Vector(Vector(39.0))))), Vector(Vector(s0(Vector(40.0), Vector(Vector(41.0)))), Vector(s0(Vector(42.0), Vector(Vector(43.0))))))), Vector(s3(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(s0(Vector(46.0), Vector(Vector(47.0)))), Vector(s0(Vector(48.0), Vector(Vector(49.0)))), Vector(s0(Vector(50.0), Vector(Vector(51.0))))), Vector(Vector(s0(Vector(52.0), Vector(Vector(53.0))))), Vector(s1(Vector(Vector(s0(Vector(54.0), Vector(Vector(55.0)))), Vector(s0(Vector(56.0), Vector(Vector(57.0)))), Vector(s0(Vector(58.0), Vector(Vector(59.0))))), s0(Vector(60.0), Vector(Vector(61.0))))), Vector(Vector(s0(Vector(62.0), Vector(Vector(63.0)))), Vector(s0(Vector(64.0), Vector(Vector(65.0))))))))
    val v1: Double = 66.0
    val start = nanoTime()
    var result: Double = 66.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}