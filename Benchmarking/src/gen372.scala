import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: s0,
    p1: s0
  )
  case class s5 (
    p0: s2,
    p1: Vector[s2]
  )
  case class s6 (
    p0: Vector[s2]
  )
  def f25(v0: s3): s3 = {
    val v2: s0 = v0.p0
    var v8: s0 = v2
    val v6: Vector[Vector[Double]] = v2.p0
    var v3: s3 = v0
    val v9: s0 = v3.p1
    v3 = v0
    var v7: s0 = v2
    v3 = v3.copy(p1 = v9)
    v3 = v3.copy(p1 = v7)
    val v10: s0 = v3.p0
    val v15: Vector[Vector[Double]] = v10.p0
    val v13: Vector[Vector[Double]] = v8.p0
    var v21: s0 = v8
    v7 = v7.copy(p0 = v6)
    val v20: Vector[Vector[Double]] = v21.p0
    val v33: s0 = v3.p1
    var v24: s0 = v9
    v21 = v21.copy(p0 = v13)
    v21 = v21.copy(p0 = v6)
    v21 = v7
    val v22: Vector[Vector[Double]] = v2.p0
    v21 = v10
    v7 = v7.copy(p0 = v22)
    v7 = v7.copy(p0 = v20)
    v3 = v3.copy(p0 = v24)
    val v18: s0 = v0.p1
    var v48: s3 = v3
    v3 = v3.copy(p1 = v7)
    var v47: s0 = v33
    v24 = v24.copy(p0 = v13)
    val v36: s0 = v48.p0
    val v41: s3 = s3(v36, v47)
    var v125: s0 = v18
    v3 = v3.copy(p0 = v9)
    v7 = v7.copy(p0 = v15)
    val v85: Vector[Vector[Double]] = v125.p0
    v3 = v3.copy(p1 = v2)
    v47 = v21
    v47 = v47.copy(p0 = v6)
    v47 = v47.copy(p0 = v85)
    v41
  }
  def f14(v0: s3): s3 = {
    val v6: s3 = f25(v0)
    val v3: s3 = f25(v6)
    val v13: s3 = f25(v3)
    val v71: s3 = f25(v13)
    val v22: s3 = f25(v71)
    val v54: s3 = f25(v22)
    v54
  }
  @noinline
  def f0(v0: s6, v1: s6, v2: Vector[Vector[s5]], v3: Vector[s2], v4: s0, v5: s5, v6: s5, v7: s0, v8: Double): Double = {
    val v14: s3 = s3(v7, v7)
    val v22: s3 = f14(v14)
    val v33: s0 = v22.p1
    val v35: Vector[Vector[Double]] = v33.p0
    val v38: Vector[Double] = v35(0)
    val v109: Double = v38(0)
    v109
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(Vector(s2(s1(Vector(s0(Vector(Vector(0.0)))), s0(Vector(Vector(1.0)))), s1(Vector(s0(Vector(Vector(2.0)))), s0(Vector(Vector(3.0)))))))
    val v1: s6 = s6(Vector(s2(s1(Vector(s0(Vector(Vector(4.0)))), s0(Vector(Vector(5.0)))), s1(Vector(s0(Vector(Vector(6.0)))), s0(Vector(Vector(7.0)))))))
    val v2: Vector[Vector[s5]] = Vector(Vector(s5(s2(s1(Vector(s0(Vector(Vector(8.0)))), s0(Vector(Vector(9.0)))), s1(Vector(s0(Vector(Vector(10.0)))), s0(Vector(Vector(11.0))))), Vector(s2(s1(Vector(s0(Vector(Vector(12.0)))), s0(Vector(Vector(13.0)))), s1(Vector(s0(Vector(Vector(14.0)))), s0(Vector(Vector(15.0)))))))), Vector(s5(s2(s1(Vector(s0(Vector(Vector(16.0)))), s0(Vector(Vector(17.0)))), s1(Vector(s0(Vector(Vector(18.0)))), s0(Vector(Vector(19.0))))), Vector(s2(s1(Vector(s0(Vector(Vector(20.0)))), s0(Vector(Vector(21.0)))), s1(Vector(s0(Vector(Vector(22.0)))), s0(Vector(Vector(23.0)))))))))
    val v3: Vector[s2] = Vector(s2(s1(Vector(s0(Vector(Vector(24.0)))), s0(Vector(Vector(25.0)))), s1(Vector(s0(Vector(Vector(26.0)))), s0(Vector(Vector(27.0))))), s2(s1(Vector(s0(Vector(Vector(28.0)))), s0(Vector(Vector(29.0)))), s1(Vector(s0(Vector(Vector(30.0)))), s0(Vector(Vector(31.0))))))
    val v4: s0 = s0(Vector(Vector(32.0)))
    val v5: s5 = s5(s2(s1(Vector(s0(Vector(Vector(33.0)))), s0(Vector(Vector(34.0)))), s1(Vector(s0(Vector(Vector(35.0)))), s0(Vector(Vector(36.0))))), Vector(s2(s1(Vector(s0(Vector(Vector(37.0)))), s0(Vector(Vector(38.0)))), s1(Vector(s0(Vector(Vector(39.0)))), s0(Vector(Vector(40.0)))))))
    val v6: s5 = s5(s2(s1(Vector(s0(Vector(Vector(41.0)))), s0(Vector(Vector(42.0)))), s1(Vector(s0(Vector(Vector(43.0)))), s0(Vector(Vector(44.0))))), Vector(s2(s1(Vector(s0(Vector(Vector(45.0)))), s0(Vector(Vector(46.0)))), s1(Vector(s0(Vector(Vector(47.0)))), s0(Vector(Vector(48.0)))))))
    val v7: s0 = s0(Vector(Vector(49.0)))
    val v8: Double = 50.0
    val start = nanoTime()
    var result: Double = 50.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7, v8)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}