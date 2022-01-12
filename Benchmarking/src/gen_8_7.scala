import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1
  )
  case class s3 (
    p0: Vector[s2],
    p1: s0
  )
  case class s4 (
    p0: Vector[s3],
    p1: s1
  )
  case class s6 (
    p0: Vector[s1],
    p1: s4
  )
  def f50(v0: Double): Double = {
    var v4: Double = v0
    var v1: Double = v4
    var v5: Double = v1
    var v3: Double = v0
    var v2: Double = v4
    var v6: Double = v1
    v2 = v0
    var v7: Double = v0
    var v8: Double = v7
    var v11: Double = v5
    var v9: Double = v2
    var v15: Double = v6
    var v27: Double = v9
    var v24: Double = v8
    var v21: Double = v24
    var v23: Double = v21
    var v28: Double = v11
    val v22: Vector[Double] = Vector(v11, v5, v7)
    val v36: Double = v22(2)
    var v57: Vector[Double] = v22
    var v40: Vector[Double] = v57
    v40 = v40.updated(1, v0)
    var v71: Vector[Double] = v22
    v11 = v28
    var v47: Vector[Double] = v71
    val v37: Double = v57(2)
    val v44: Double = v40(0)
    val v39: Double = v22(2)
    v47 = v47.updated(2, v23)
    v40 = v40.updated(2, v39)
    v47 = v47.updated(1, v4)
    v40 = v40.updated(2, v6)
    v47 = v47.updated(1, v28)
    v40 = v40.updated(2, v11)
    v9 = v15
    v40 = v40.updated(1, v37)
    v47 = v47.updated(0, v36)
    var v50: Vector[Double] = v47
    var v76: Vector[Double] = v40
    v50 = v50.updated(2, v24)
    v47 = v47.updated(0, v5)
    var v35: Double = v5
    val v46: Double = v40(0)
    val v110: Double = v47(2)
    var v42: Double = v1
    v50 = v50.updated(2, v44)
    var v156: Vector[Double] = v76
    v71 = v71.updated(1, v3)
    v47 = v47.updated(2, v46)
    val v81: Double = v50(1)
    v57 = v57.updated(1, v27)
    val v88: Double = v156(1)
    var v102: Vector[Double] = v156
    v28 = v88
    v76 = v76.updated(2, v35)
    v40 = v40.updated(0, v110)
    val v106: Double = v102(1)
    var v176: Double = v81
    v1 = v42
    v24 = v106
    v176
  }
  def f28(v0: Double): Double = {
    val v1: Double = f50(v0)
    val v5: Vector[Double] = Vector(v1, v1, v1, v0, v1)
    var v6: Double = v0
    val v4: Double = v5(3)
    val v2: Vector[Double] = Vector(v0, v4, v6, v4, v4, v4, v4)
    var v7: Double = v6
    v6 = v7
    val v10: Double = v2(4)
    var v23: Vector[Double] = v2
    val v28: Double = v23(4)
    var v44: Vector[Double] = v2
    val v42: Double = f50(v28)
    val v27: Double = f50(v42)
    v23 = v23.updated(5, v4)
    var v38: Vector[Double] = v44
    v38 = v38.updated(0, v27)
    v23 = v23.updated(0, v10)
    val v91: Double = v38(2)
    v91
  }
  @noinline
  def f0(v0: s6, v1: Double): Double = {
    val v5: Double = f50(v1)
    val v3: Double = f28(v5)
    var v9: Double = v3
    val v53: Double = f50(v9)
    v53
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))))))), s4(Vector(s3(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))))))), s2(s1(Vector(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0)))))))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), s3(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))))))), s2(s1(Vector(Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0)))))))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), s3(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0))))))), s2(s1(Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0)))))))), s0(Vector(Vector(18.0)), Vector(Vector(19.0))))), s1(Vector(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0))))))))
    val v1: Double = 22.0
    val start = nanoTime()
    var result: Double = 22.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}