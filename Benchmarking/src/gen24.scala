import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: Double,
    p2: Vector[s0]
  )
  case class s8 (
    p0: Vector[s1],
    p1: Vector[s3]
  )
  def f37(v0: s3): s3 = {
    val v6: Vector[s0] = v0.p2
    val v2: Vector[s0] = v0.p2
    var v16: s3 = v0
    v16 = v16.copy(p2 = v6)
    v16 = v16.copy(p2 = v2)
    v16 = v16.copy(p2 = v2)
    var v49: s3 = v0
    v16 = v49
    var v45: s3 = v16
    v45
  }
  def f36(v0: s3): s3 = {
    val v3: Double = v0.p1
    var v5: s3 = v0
    val v2: s3 = f37(v5)
    val v4: Vector[Vector[s2]] = v5.p0
    v5 = v0
    v5 = v5.copy(p1 = v3)
    var v7: Double = v3
    val v6: Vector[s2] = v4(0)
    var v12: Vector[s2] = v6
    val v9: Vector[Vector[s2]] = v5.p0
    val v17: Vector[s2] = v4(0)
    var v13: Vector[Vector[s2]] = v9
    v13 = v13.updated(0, v12)
    val v15: Vector[s0] = v5.p2
    v13 = v13.updated(0, v12)
    val v22: Vector[s2] = v9(0)
    val v18: Double = v2.p1
    v5 = v5.copy(p1 = v18)
    v13 = v13.updated(0, v22)
    val v55: s3 = s3(v4, v7, v15)
    var v37: Vector[s2] = v12
    v13 = v13.updated(0, v12)
    val v100: s3 = f37(v55)
    v13 = v13.updated(0, v37)
    val v50: s2 = v17(0)
    v12 = v12.updated(0, v50)
    v5 = v5.copy(p0 = v13)
    v13 = v13.updated(0, v6)
    v100
  }
  def f34(v0: s3): s3 = {
    val v7: s3 = f37(v0)
    var v1: s3 = v7
    val v6: Double = v1.p1
    var v4: s3 = v1
    val v5: Double = v1.p1
    var v11: Double = v6
    val v15: Vector[s0] = v0.p2
    v4 = v4.copy(p2 = v15)
    v1 = v1.copy(p1 = v11)
    v1 = v1.copy(p2 = v15)
    val v13: s3 = f37(v0)
    v4 = v4.copy(p1 = v5)
    val v47: Double = v7.p1
    val v18: s3 = f36(v1)
    val v30: s3 = f36(v4)
    val v25: Vector[s0] = v18.p2
    v1 = v13
    v4 = v4.copy(p2 = v25)
    val v20: Vector[s0] = v4.p2
    v1 = v1.copy(p1 = v47)
    val v35: Double = v6 + v47
    v1 = v1.copy(p1 = v35)
    v1 = v1.copy(p2 = v20)
    v1 = v1.copy(p2 = v15)
    val v163: s3 = f37(v30)
    val v170: s3 = f37(v163)
    v170
  }
  def f25(v0: s3): s3 = {
    var v1: s3 = v0
    val v5: s3 = f36(v0)
    val v8: Vector[Vector[s2]] = v1.p0
    val v2: Vector[s2] = v8(0)
    val v13: Double = v5.p1
    var v6: Double = v13
    var v10: Double = v6
    val v11: s3 = f37(v1)
    var v14: Vector[s2] = v2
    v1 = v1.copy(p1 = v10)
    var v21: Vector[Vector[s2]] = v8
    v21 = v21.updated(0, v14)
    v1 = v1.copy(p0 = v21)
    v1 = v1.copy(p1 = v6)
    v11
  }
  @noinline
  def f0(v0: Vector[s8], v1: s1, v2: Double): Double = {
    val v3: s8 = v0(0)
    val v39: Vector[s3] = v3.p1
    val v50: s3 = v39(0)
    val v69: s3 = f25(v50)
    val v72: s3 = f34(v69)
    val v149: s3 = f36(v72)
    val v136: s3 = f34(v149)
    val v93: s3 = f34(v136)
    val v83: Double = v93.p1
    v83
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0))), s0(Vector(Vector(5.0)), Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0)))), s1(s0(Vector(Vector(10.0)), Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0)), Vector(Vector(19.0)))), s1(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)), Vector(Vector(24.0))), s0(Vector(Vector(25.0)), Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0)), Vector(Vector(29.0))))), Vector(s3(Vector(Vector(s2(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0)), Vector(Vector(33.0)), Vector(Vector(34.0))), s1(s0(Vector(Vector(35.0)), Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0)), Vector(Vector(43.0)), Vector(Vector(44.0))))))), 45.0, Vector(s0(Vector(Vector(46.0)), Vector(Vector(47.0), Vector(48.0)), Vector(Vector(49.0)), Vector(Vector(50.0))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)), Vector(Vector(60.0))))))))
    val v1: s1 = s1(s0(Vector(Vector(61.0)), Vector(Vector(62.0), Vector(63.0)), Vector(Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0)), Vector(Vector(69.0)), Vector(Vector(70.0))))
    val v2: Double = 71.0
    val start = nanoTime()
    var result: Double = 71.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}