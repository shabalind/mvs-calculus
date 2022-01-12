import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]],
    p5: Vector[Vector[Double]],
    p6: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Double],
    p1: Double
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  def f89(v0: s1): s1 = {
    var v4: s1 = v0
    val v1: Double = v4.p1
    val v6: Double = v4.p1
    val v3: Vector[Double] = v4.p0
    var v2: Double = v1
    val v11: Double = v3(1)
    v4 = v4.copy(p1 = v2)
    var v10: Double = v1
    var v8: Vector[Double] = v3
    v8 = v8.updated(1, v11)
    v8 = v8.updated(1, v10)
    var v24: s1 = v4
    v24 = v24.copy(p0 = v3)
    v8 = v8.updated(1, v11)
    v4 = v4.copy(p0 = v8)
    v4 = v4.copy(p1 = v6)
    v24 = v24.copy(p0 = v8)
    v24
  }
  def f17(v0: s1): s1 = {
    val v3: s1 = f89(v0)
    val v6: s1 = f89(v0)
    val v9: Vector[s1] = Vector(v0, v3, v0, v6, v6, v3)
    val v13: s1 = v9(5)
    v13
  }
  def f9(v0: s1): s1 = {
    var v1: s1 = v0
    val v2: s1 = f17(v1)
    val v3: Vector[s1] = Vector(v0, v0, v0, v2, v1)
    val v7: Vector[Double] = v0.p0
    var v4: Vector[Double] = v7
    val v8: Double = v7(1)
    val v11: s1 = f17(v0)
    var v9: Vector[s1] = v3
    v1 = v1.copy(p1 = v8)
    v1 = v1.copy(p0 = v7)
    val v6: s1 = f17(v1)
    val v14: s1 = f17(v1)
    val v5: s1 = f89(v2)
    v4 = v4.updated(0, v8)
    val v13: s1 = v3(3)
    val v16: Double = v6.p1
    val v10: s1 = f89(v13)
    val v32: s1 = f89(v14)
    val v21: s1 = f89(v10)
    val v26: Double = v10.p1
    val v17: s1 = v9(1)
    val v33: Vector[Double] = v5.p0
    val v19: s1 = f17(v1)
    val v23: Double = v21.p1
    val v36: Double = v33(0)
    v9 = v9.updated(1, v21)
    var v28: s1 = v21
    val v62: Vector[Double] = v13.p0
    val v42: Double = v26 / v26
    v9 = v9.updated(3, v17)
    val v37: s1 = f17(v21)
    val v25: s1 = f89(v11)
    val v24: Double = v14.p1
    val v43: Double = v1.p1
    var v45: Vector[s1] = v3
    v1 = v1.copy(p0 = v33)
    val v51: s1 = f17(v11)
    v45 = v45.updated(3, v51)
    val v38: Vector[Vector[s1]] = Vector(v3, v45, v9)
    val v27: s1 = f17(v11)
    v1 = v1.copy(p0 = v62)
    v45 = v45.updated(1, v19)
    v4 = v4.updated(0, v16)
    v9 = v9.updated(2, v27)
    v9 = v9.updated(0, v25)
    val v59: Double = v4(0)
    v1 = v1.copy(p1 = v36)
    v28 = v28.copy(p0 = v7)
    val v49: s1 = f17(v51)
    val v39: s1 = f89(v14)
    val v40: Double = v62(0)
    v9 = v9.updated(2, v27)
    v4 = v4.updated(1, v43)
    var v99: s1 = v1
    val v53: Vector[Double] = v17.p0
    v4 = v4.updated(0, v24)
    v45 = v45.updated(4, v17)
    val v71: Vector[s1] = v38(2)
    v99 = v99.copy(p1 = v16)
    val v56: Vector[Double] = v28.p0
    val v65: Double = v53(1)
    var v73: Vector[Vector[s1]] = v38
    v4 = v4.updated(0, v23)
    v99 = v99.copy(p1 = v59)
    v1 = v1.copy(p1 = v40)
    val v69: Vector[s1] = Vector(v39, v11, v0, v32)
    var v190: Vector[s1] = v69
    var v57: Vector[s1] = v190
    v4 = v4.updated(0, v65)
    v99 = v99.copy(p0 = v56)
    v190 = v190.updated(2, v99)
    v73 = v73.updated(2, v71)
    val v167: s1 = v57(3)
    val v87: s1 = f17(v167)
    val v116: Vector[s1] = v73(2)
    v9 = v9.updated(1, v5)
    v9 = v116
    v9 = v9.updated(0, v49)
    v28 = v28.copy(p1 = v42)
    v45 = v45.updated(1, v19)
    v190 = v190.updated(2, v37)
    v87
  }
  @noinline
  def f0(v0: s0, v1: Double, v2: s1, v3: s0, v4: s2): Double = {
    val v9: s1 = f9(v2)
    val v13: s1 = f17(v9)
    val v45: Vector[s1] = Vector(v13, v2, v2, v13)
    var v35: Vector[s1] = v45
    v35 = v45
    var v85: Vector[s1] = v35
    val v73: s1 = v85(3)
    var v54: s1 = v73
    v35 = v35.updated(1, v73)
    v35 = v35.updated(3, v9)
    v85 = v85.updated(3, v54)
    val v70: Double = v54.p1
    v70
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0), Vector(16.0)))
    val v1: Double = 17.0
    val v2: s1 = s1(Vector(18.0, 19.0), 20.0)
    val v3: s0 = s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0), Vector(37.0)))
    val v4: s2 = s2(Vector(Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))))), s1(Vector(55.0, 56.0), 57.0))
    val start = nanoTime()
    var result: Double = StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[38.0]], [[39.0], [40.0], [41.0]], [[42.0], [43.0], [44.0]], [[45.0]], [[46.0], [47.0], [48.0]], [[49.0], [50.0], [51.0]], [[52.0], [53.0], [54.0]]])]], StructValue(Name(str='s1', ty=None), [[55.0, 56.0], 57.0])])
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}