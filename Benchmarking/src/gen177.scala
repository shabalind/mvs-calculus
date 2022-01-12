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
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: s2,
    p2: Vector[s2]
  )
  case class s8 (
    p0: s3,
    p1: s1
  )
  def f26(v0: s2): s2 = {
    v0
  }
  def f17(v0: s3): s3 = {
    val v6: s2 = v0.p1
    val v5: s2 = f26(v6)
    val v7: Vector[Vector[s1]] = v0.p0
    val v2: Vector[s2] = Vector(v5, v5, v5)
    val v14: s3 = s3(v7, v5, v2)
    v14
  }
  def f10(v0: s3): s3 = {
    val v1: s3 = f17(v0)
    val v7: s3 = f17(v1)
    val v5: Vector[Vector[s1]] = v7.p0
    val v8: Vector[s1] = v5(0)
    val v10: s3 = f17(v7)
    val v13: s2 = v0.p1
    val v2: Vector[s2] = v0.p2
    val v23: s2 = f26(v13)
    val v21: Vector[s2] = Vector(v23, v13, v13, v23)
    var v14: Vector[s2] = v2
    val v37: s2 = v21(2)
    var v24: Vector[s2] = v2
    var v27: s3 = v10
    val v31: s2 = f26(v37)
    val v40: s2 = f26(v31)
    v27 = v27.copy(p2 = v2)
    v27 = v27.copy(p2 = v14)
    val v25: s2 = f26(v37)
    val v32: Vector[Vector[s1]] = v1.p0
    var v26: s3 = v27
    v14 = v24
    v27 = v27.copy(p1 = v25)
    v27 = v27.copy(p1 = v13)
    val v61: s2 = f26(v40)
    v26 = v26.copy(p1 = v25)
    var v117: Vector[Vector[s1]] = v5
    v26 = v26.copy(p0 = v32)
    v27 = v27.copy(p0 = v117)
    val v112: s2 = v24(0)
    v26 = v26.copy(p1 = v23)
    v26 = v26.copy(p1 = v61)
    v27 = v27.copy(p0 = v32)
    v27 = v27.copy(p1 = v112)
    var v127: Vector[s1] = v8
    v117 = v117.updated(1, v127)
    v127 = v8
    v27 = v27.copy(p1 = v61)
    v26
  }
  @noinline
  def f0(v0: s8, v1: Double): Double = {
    var v4: s8 = v0
    val v3: s3 = v0.p0
    val v8: s1 = v4.p1
    val v6: s3 = f10(v3)
    v4 = v4.copy(p0 = v6)
    var v7: s1 = v8
    val v13: Vector[s0] = v8.p0
    v4 = v4.copy(p1 = v7)
    val v16: s0 = v13(0)
    v7 = v7.copy(p1 = v16)
    var v44: s0 = v16
    var v25: s0 = v44
    val v28: s0 = v13(0)
    val v42: s0 = v13(0)
    val v76: Vector[Vector[Double]] = v42.p1
    v4 = v4.copy(p1 = v7)
    var v43: s0 = v28
    v7 = v7.copy(p0 = v13)
    val v66: Vector[Vector[Double]] = v43.p0
    val v61: Vector[Double] = v66(0)
    val v105: Vector[Vector[Double]] = v25.p1
    v44 = v44.copy(p1 = v105)
    v25 = v25.copy(p1 = v76)
    var v122: Vector[Vector[Double]] = v66
    v25 = v25.copy(p0 = v122)
    v7 = v7.copy(p1 = v44)
    val v203: Double = v61(0)
    v203
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s3(Vector(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))), Vector(s1(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))))), s2(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))))), Vector(s2(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), s2(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))))), s2(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))))))), s1(Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0)))), s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))))
    val v1: Double = 72.0
    val start = nanoTime()
    var result: Double = 72.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}