import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: Vector[Double]
  )
  case class s3 (
    p0: s2,
    p1: s0
  )
  case class s4 (
    p0: s2,
    p1: Vector[s2]
  )
  case class s5 (
    p0: s0,
    p1: s0,
    p2: Vector[s2],
    p3: s1,
    p4: Vector[s2]
  )
  def f31(v0: Vector[s3]): Vector[s3] = {
    var v2: Vector[s3] = v0
    val v7: Vector[Vector[s3]] = Vector(v2, v2)
    val v5: Vector[s3] = v7(1)
    var v21: Vector[s3] = v5
    v21 = v0
    v21 = v2
    v2 = v0
    val v81: s3 = v2(2)
    v21 = v21.updated(1, v81)
    v21
  }
  def f29(v0: Vector[s1]): Vector[s1] = {
    var v7: Vector[s1] = v0
    val v10: Vector[Vector[s1]] = Vector(v7, v7, v0)
    v7 = v0
    val v44: Vector[s1] = v10(2)
    v44
  }
  def f25(v0: s3): s3 = {
    val v6: Vector[s3] = Vector(v0, v0, v0, v0, v0, v0, v0)
    var v2: s3 = v0
    val v5: s2 = v2.p0
    val v9: Vector[Double] = v5.p0
    val v7: s3 = v6(1)
    val v13: Double = v9(1)
    val v14: s0 = v2.p1
    v2 = v2.copy(p1 = v14)
    val v4: Double = v9(1)
    var v25: Vector[Double] = v9
    var v17: Double = v4
    val v35: Double = v9(1)
    val v15: Double = v9(0)
    var v18: s2 = v5
    var v36: Double = v35
    v25 = v25.updated(0, v36)
    var v41: Vector[Double] = v25
    var v12: s3 = v7
    val v16: s3 = v6(2)
    v18 = v18.copy(p0 = v25)
    v25 = v25.updated(1, v13)
    val v21: Double = v41(0)
    v41 = v41.updated(1, v17)
    v2 = v16
    v12 = v12.copy(p0 = v18)
    v2 = v2.copy(p1 = v14)
    v25 = v25.updated(1, v21)
    v41 = v41.updated(1, v15)
    v18 = v18.copy(p0 = v9)
    v12
  }
  def f16(v0: s1): s1 = {
    var v1: s1 = v0
    var v5: s1 = v1
    v5 = v1
    val v3: s0 = v0.p1
    v5 = v5.copy(p1 = v3)
    var v2: s1 = v5
    v2
  }
  def f5(v0: Double, v1: s3): Double = {
    val v2: s2 = v1.p0
    val v3: Vector[Double] = v2.p0
    val v11: Vector[Vector[Double]] = Vector(v3, v3, v3, v3, v3, v3)
    val v16: Vector[Double] = v11(4)
    var v14: Vector[Vector[Double]] = v11
    v14 = v14.updated(4, v16)
    val v22: Vector[Double] = v14(5)
    val v15: Vector[Double] = v14(1)
    val v44: Double = v22(1)
    val v119: Vector[Double] = v14(0)
    v14 = v14.updated(0, v15)
    v14 = v14.updated(3, v16)
    var v184: Vector[Double] = v119
    v14 = v14.updated(5, v184)
    v14 = v14.updated(0, v3)
    v44
  }
  @noinline
  def f0(v0: Vector[s3], v1: Vector[Vector[s4]], v2: Vector[s5], v3: Double): Double = {
    val v6: s5 = v2(0)
    val v4: s3 = v0(1)
    val v5: s1 = v6.p3
    var v11: s3 = v4
    val v18: Vector[s1] = Vector(v5, v5)
    val v14: Vector[s1] = f29(v18)
    val v32: Vector[s3] = f31(v0)
    val v29: s3 = f25(v11)
    val v59: s5 = v2(0)
    val v47: s1 = v14(0)
    val v33: Double = f5(v3, v29)
    val v60: s3 = v32(1)
    val v85: s0 = v59.p1
    val v70: s1 = f16(v47)
    v11 = v11.copy(p1 = v85)
    val v74: s3 = f25(v60)
    val v174: Double = f5(v33, v74)
    val v165: s0 = v70.p1
    v11 = v11.copy(p1 = v165)
    v174
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s2(Vector(0.0, 1.0)), s0(Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s3(s2(Vector(6.0, 7.0)), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s3(s2(Vector(12.0, 13.0)), s0(Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))))
    val v1: Vector[Vector[s4]] = Vector(Vector(s4(s2(Vector(18.0, 19.0)), Vector(s2(Vector(20.0, 21.0)), s2(Vector(22.0, 23.0)), s2(Vector(24.0, 25.0))))), Vector(s4(s2(Vector(26.0, 27.0)), Vector(s2(Vector(28.0, 29.0)), s2(Vector(30.0, 31.0)), s2(Vector(32.0, 33.0))))))
    val v2: Vector[s5] = Vector(s5(s0(Vector(Vector(34.0), Vector(35.0), Vector(36.0)), Vector(Vector(37.0))), s0(Vector(Vector(38.0), Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), Vector(s2(Vector(42.0, 43.0)), s2(Vector(44.0, 45.0))), s1(Vector(s0(Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0)))), s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0)))), Vector(s2(Vector(58.0, 59.0)), s2(Vector(60.0, 61.0)), s2(Vector(62.0, 63.0)))))
    val v3: Double = 64.0
    val start = nanoTime()
    var result: Double = 64.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}