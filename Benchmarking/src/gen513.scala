import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s0,
    p1: s0
  )
  case class s4 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s5 (
    p0: s2,
    p1: s0
  )
  case class s9 (
    p0: Vector[s5],
    p1: s0
  )
  case class s11 (
    p0: s9,
    p1: Vector[s3]
  )
  case class s14 (
    p0: s11,
    p1: s5
  )
  def f30(v0: s0): s0 = {
    var v7: s0 = v0
    val v8: Vector[Vector[Double]] = v7.p1
    var v1: s0 = v7
    v1 = v1.copy(p0 = v8)
    var v4: s0 = v1
    v1 = v1.copy(p0 = v8)
    v4 = v4.copy(p0 = v8)
    var v16: s0 = v4
    v16
  }
  def f25(v0: s4, v1: Double): Double = {
    val v6: s0 = v0.p0
    val v14: s0 = f30(v6)
    var v9: s0 = v14
    val v18: Vector[Vector[Double]] = v14.p0
    val v7: Vector[Vector[Double]] = v9.p1
    val v27: Vector[Vector[Double]] = v6.p1
    var v17: Vector[Vector[Double]] = v7
    val v16: Vector[Double] = v18(0)
    var v15: Vector[Vector[Double]] = v17
    v17 = v17.updated(0, v16)
    v9 = v9.copy(p1 = v17)
    v9 = v9.copy(p0 = v27)
    v17 = v17.updated(0, v16)
    v17 = v17.updated(0, v16)
    val v24: Vector[Double] = v7(0)
    v15 = v15.updated(0, v24)
    val v46: Vector[Double] = v15(0)
    val v31: Vector[Double] = v17(0)
    v17 = v17.updated(0, v24)
    v15 = v15.updated(0, v31)
    val v89: Double = v46(0)
    v89
  }
  @noinline
  def f0(v0: Vector[s4], v1: Vector[Vector[s14]], v2: Vector[s3], v3: Double): Double = {
    var v5: Double = v3
    val v6: s4 = v0(0)
    val v7: s4 = v0(0)
    val v4: Vector[Double] = Vector(v3, v3, v5, v3, v3, v3)
    var v10: Vector[Double] = v4
    v10 = v10.updated(2, v5)
    val v11: Double = f25(v6, v5)
    val v15: Double = f25(v6, v5)
    val v18: Double = v4(4)
    var v35: Double = v5
    val v25: Double = f25(v6, v18)
    val v42: Double = f25(v6, v35)
    val v57: s4 = v0(0)
    var v103: Vector[Double] = v10
    var v102: Vector[Double] = v10
    var v96: Double = v11
    v10 = v10.updated(1, v25)
    val v98: Double = v42 - v96
    v103 = v103.updated(3, v11)
    val v152: Double = v102(5)
    v103 = v102
    val v97: Double = f25(v7, v152)
    v10 = v10.updated(1, v98)
    v103 = v103.updated(2, v3)
    val v58: Double = v103(0)
    val v190: Double = f25(v57, v96)
    v103 = v103.updated(0, v25)
    v10 = v10.updated(5, v190)
    v103 = v103.updated(1, v15)
    val v166: Double = v58 / v97
    v166
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))))
    val v1: Vector[Vector[s14]] = Vector(Vector(s14(s11(s9(Vector(s5(s2(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0))))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), s0(Vector(Vector(16.0)), Vector(Vector(17.0)))), Vector(s3(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0)))))), s5(s2(s0(Vector(Vector(22.0)), Vector(Vector(23.0))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0))))), s0(Vector(Vector(28.0)), Vector(Vector(29.0)))))))
    val v2: Vector[s3] = Vector(s3(s0(Vector(Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0)))))
    val v3: Double = 34.0
    val start = nanoTime()
    var result: Double = 34.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}