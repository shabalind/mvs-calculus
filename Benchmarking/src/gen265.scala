import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: s1,
    p2: Vector[s0],
    p3: Vector[s0]
  )
  def f12(v0: Vector[s0]): Vector[s0] = {
    var v1: Vector[s0] = v0
    var v8: Vector[s0] = v0
    val v5: s0 = v8(0)
    val v4: Vector[Vector[Double]] = v5.p0
    val v9: Vector[Vector[Double]] = v5.p0
    val v2: Vector[Double] = v4(1)
    val v6: Vector[Vector[Double]] = v5.p1
    var v11: Vector[Vector[Double]] = v6
    val v13: Vector[Vector[Double]] = v5.p1
    val v17: s0 = s0(v4, v6)
    var v20: s0 = v5
    var v12: Vector[s0] = v1
    v20 = v20.copy(p0 = v9)
    v20 = v20.copy(p1 = v11)
    val v14: Vector[Vector[Double]] = v17.p0
    v12 = v12.updated(0, v20)
    var v22: s0 = v17
    var v15: Vector[Vector[Double]] = v13
    v22 = v22.copy(p0 = v4)
    val v35: s0 = s0(v9, v11)
    val v26: Vector[Vector[s0]] = Vector(v8)
    var v16: Vector[Double] = v2
    var v18: Vector[s0] = v12
    v15 = v15.updated(0, v2)
    v22 = v22.copy(p1 = v13)
    val v34: Vector[Double] = v9(2)
    v20 = v20.copy(p1 = v13)
    val v19: Vector[Vector[Double]] = v17.p0
    val v21: Vector[Vector[Double]] = v22.p0
    var v68: Vector[Vector[Double]] = v11
    v12 = v12.updated(1, v17)
    val v48: Vector[s0] = v26(0)
    v22 = v22.copy(p0 = v9)
    val v45: Vector[Vector[Double]] = v5.p1
    v8 = v8.updated(0, v22)
    val v32: Vector[Double] = v14(0)
    v8 = v18
    v15 = v15.updated(0, v34)
    v8 = v18
    v22 = v22.copy(p1 = v13)
    v22 = v22.copy(p1 = v13)
    v22 = v22.copy(p0 = v21)
    val v50: Vector[Vector[Double]] = v20.p1
    v22 = v22.copy(p1 = v50)
    v8 = v8.updated(0, v5)
    var v78: Vector[Vector[Double]] = v9
    v68 = v68.updated(0, v16)
    v20 = v20.copy(p0 = v19)
    v22 = v22.copy(p0 = v78)
    val v167: Vector[Double] = v4(0)
    v22 = v22.copy(p1 = v45)
    val v65: s0 = v48(0)
    v12 = v12.updated(0, v65)
    v68 = v68.updated(0, v32)
    var v140: s0 = v35
    v78 = v78.updated(1, v167)
    v22 = v22.copy(p1 = v68)
    val v97: Vector[Vector[Double]] = v140.p0
    v140 = v140.copy(p1 = v15)
    v20 = v20.copy(p1 = v13)
    v1 = v1.updated(0, v65)
    v8 = v8.updated(1, v35)
    v12 = v12.updated(1, v35)
    v140 = v140.copy(p1 = v13)
    val v162: Vector[Vector[Double]] = v17.p1
    v140 = v140.copy(p1 = v162)
    v20 = v20.copy(p0 = v97)
    v18
  }
  def f6(v0: s2): s2 = {
    var v5: s2 = v0
    var v2: s2 = v5
    val v4: Vector[s0] = v2.p2
    var v3: s2 = v5
    val v9: s0 = v4(1)
    val v6: Vector[Vector[Double]] = v9.p1
    var v7: s0 = v9
    val v8: s0 = v4(2)
    v5 = v5.copy(p2 = v4)
    var v15: Vector[s0] = v4
    v5 = v5.copy(p0 = v9)
    v2 = v2.copy(p2 = v15)
    var v19: Vector[Vector[Double]] = v6
    v3 = v3.copy(p0 = v9)
    v15 = v15.updated(0, v8)
    v15 = v15.updated(1, v9)
    var v32: Vector[Vector[Double]] = v19
    val v36: Vector[Vector[Double]] = v7.p1
    v7 = v7.copy(p1 = v36)
    v3 = v3.copy(p0 = v7)
    v7 = v7.copy(p1 = v32)
    v3
  }
  def f3(v0: s1): s1 = {
    val v4: Vector[s0] = v0.p0
    var v3: s1 = v0
    val v6: Vector[Vector[s0]] = v3.p1
    val v7: Vector[s0] = v6(0)
    v3 = v3.copy(p1 = v6)
    v3 = v3.copy(p1 = v6)
    var v19: s1 = v3
    val v13: Vector[Vector[s0]] = v0.p1
    v19 = v19.copy(p1 = v6)
    v3 = v3.copy(p1 = v6)
    v3 = v3.copy(p1 = v13)
    var v24: Vector[s0] = v4
    val v28: Vector[s0] = v19.p0
    val v30: Vector[Vector[s0]] = v0.p1
    val v40: Vector[s0] = v3.p0
    val v44: s0 = v4(0)
    v3 = v3.copy(p0 = v40)
    val v60: Vector[s0] = v30(1)
    var v74: Vector[s0] = v7
    v19 = v19.copy(p0 = v60)
    val v48: Vector[Vector[s0]] = v0.p1
    v19 = v19.copy(p0 = v28)
    v19 = v19.copy(p0 = v60)
    v24 = v24.updated(0, v44)
    v24 = v24.updated(0, v44)
    v3 = v3.copy(p1 = v48)
    v3 = v3.copy(p0 = v28)
    v3 = v3.copy(p1 = v13)
    v19 = v19.copy(p0 = v24)
    var v121: s1 = v19
    v3 = v3.copy(p0 = v24)
    v121 = v121.copy(p0 = v74)
    v121
  }
  @noinline
  def f0(v0: s1, v1: s2, v2: Double): Double = {
    val v6: s1 = f3(v0)
    var v4: s1 = v6
    var v8: s2 = v1
    val v3: Vector[s0] = v6.p0
    v8 = v8.copy(p1 = v4)
    val v11: s2 = f6(v8)
    val v17: s2 = f6(v11)
    val v15: s0 = v8.p0
    val v5: s0 = v3(0)
    val v34: Vector[Vector[Double]] = v15.p0
    val v39: s2 = f6(v17)
    val v14: Vector[Double] = v34(2)
    var v24: Vector[s0] = v3
    val v19: s1 = f3(v4)
    v4 = v4.copy(p0 = v24)
    v24 = v24.updated(0, v5)
    val v23: Double = v14(0)
    var v25: Double = v23
    v8 = v8.copy(p1 = v19)
    val v22: Vector[s0] = v8.p3
    val v30: Vector[s0] = f12(v22)
    val v64: Vector[s0] = f12(v22)
    val v28: Vector[s0] = v0.p0
    v8 = v8.copy(p3 = v30)
    v24 = v24.updated(0, v5)
    val v67: s0 = v64(0)
    v24 = v24.updated(0, v67)
    val v41: s0 = v39.p0
    val v57: s0 = v28(0)
    v8 = v8.copy(p0 = v41)
    v8 = v8.copy(p0 = v57)
    v25
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), Vector(Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))))
    val v1: s2 = s2(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s1(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))), Vector(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))))
    val v2: Double = 56.0
    val start = nanoTime()
    var result: Double = 56.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}