import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: Vector[Vector[s0]],
    p3: s0
  )
  case class s3 (
    p0: Vector[Vector[s0]]
  )
  def f84(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Vector[Double]] = v0.p0
    var v3: s0 = v0
    v3 = v0
    val v1: Vector[Double] = v2(1)
    v3 = v3.copy(p0 = v6)
    var v11: Vector[Vector[Double]] = v6
    v3 = v3.copy(p1 = v2)
    val v13: Vector[Double] = v2(0)
    v11 = v11.updated(0, v13)
    v3 = v3.copy(p0 = v5)
    val v25: Vector[Vector[Double]] = v3.p0
    val v14: Vector[Vector[Double]] = v3.p1
    val v16: Vector[Double] = v2(2)
    var v18: s0 = v3
    val v36: Vector[Double] = v6(0)
    v11 = v11.updated(0, v13)
    var v33: Vector[Vector[Double]] = v25
    v3 = v0
    val v32: Vector[Double] = v25(0)
    val v51: Vector[Vector[Double]] = v3.p1
    v3 = v3.copy(p0 = v11)
    v3 = v18
    var v42: Vector[Vector[Double]] = v51
    var v67: s0 = v3
    v11 = v11.updated(0, v16)
    var v35: Vector[Vector[Double]] = v33
    var v94: Vector[Vector[Double]] = v11
    val v44: Vector[Vector[Double]] = v18.p0
    v3 = v3.copy(p1 = v2)
    val v45: Vector[Vector[Double]] = v3.p1
    v3 = v3.copy(p0 = v6)
    v18 = v18.copy(p0 = v25)
    v18 = v18.copy(p1 = v42)
    v67 = v67.copy(p0 = v11)
    val v77: Vector[Vector[Double]] = v0.p1
    v3 = v3.copy(p1 = v77)
    v35 = v35.updated(0, v36)
    v18 = v18.copy(p0 = v6)
    v3 = v3.copy(p1 = v77)
    v67 = v67.copy(p1 = v45)
    v67 = v67.copy(p1 = v14)
    val v92: Vector[Vector[Double]] = v3.p0
    val v52: Vector[Double] = v35(0)
    v3 = v3.copy(p0 = v92)
    var v97: Vector[Vector[Double]] = v14
    v67 = v3
    val v145: Vector[Vector[Double]] = v0.p1
    v94 = v94.updated(0, v32)
    v18 = v18.copy(p1 = v97)
    val v74: Vector[Vector[Double]] = v18.p1
    v67 = v67.copy(p1 = v74)
    v11 = v11.updated(0, v52)
    v42 = v42.updated(0, v1)
    v18 = v18.copy(p0 = v94)
    val v85: Vector[Vector[Double]] = v3.p1
    val v79: Vector[Vector[Double]] = v18.p0
    v18 = v18.copy(p1 = v145)
    val v169: Vector[Vector[Double]] = v3.p0
    var v189: s0 = v67
    v67 = v67.copy(p0 = v5)
    v189 = v189.copy(p1 = v14)
    v3 = v3.copy(p0 = v79)
    val v174: Vector[Double] = v169(0)
    var v228: Vector[Vector[Double]] = v74
    v3 = v3.copy(p1 = v85)
    v11 = v11.updated(0, v174)
    v18 = v18.copy(p1 = v228)
    v3 = v3.copy(p0 = v44)
    v189
  }
  def f65(v0: s0, v1: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Vector[Double]] = v1.p0
    val v6: Vector[Vector[Double]] = v1.p0
    val v3: Vector[Vector[Double]] = v0.p1
    val v10: Vector[Vector[Double]] = v0.p1
    val v7: Vector[Double] = v4(0)
    var v9: Vector[Vector[Double]] = v10
    val v11: s0 = s0(v6, v9)
    val v17: s0 = s0(v4, v10)
    v9 = v9.updated(0, v7)
    val v16: Vector[Vector[Double]] = v1.p0
    v9 = v3
    val v26: Vector[Vector[Double]] = v17.p0
    val v51: Vector[Vector[Double]] = v0.p0
    var v24: s0 = v1
    v24 = v24.copy(p0 = v16)
    val v34: Vector[Double] = v2(0)
    var v36: s0 = v24
    v9 = v9.updated(1, v34)
    v36 = v36.copy(p1 = v10)
    var v45: s0 = v36
    val v39: s0 = s0(v51, v2)
    v24 = v24.copy(p1 = v2)
    val v48: Vector[Vector[Double]] = v39.p1
    val v85: s0 = f84(v11)
    val v137: Vector[Vector[Double]] = v85.p0
    v24 = v24.copy(p0 = v137)
    v45 = v45.copy(p0 = v137)
    v36 = v36.copy(p1 = v2)
    val v59: Vector[Vector[Double]] = v45.p0
    v36 = v36.copy(p1 = v9)
    v45 = v45.copy(p1 = v48)
    var v178: s0 = v1
    v178 = v178.copy(p0 = v59)
    v45 = v45.copy(p1 = v3)
    v24 = v24.copy(p0 = v26)
    v178 = v178.copy(p1 = v9)
    v178 = v178.copy(p1 = v48)
    val v242: s0 = f84(v178)
    v242
  }
  def f45(v0: s0, v1: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p0
    val v3: s0 = f65(v1, v1)
    val v5: Vector[Vector[Double]] = v0.p1
    val v6: s0 = s0(v2, v5)
    var v10: s0 = v0
    val v9: Vector[Vector[Double]] = v3.p0
    v10 = v10.copy(p0 = v9)
    val v13: s0 = f84(v1)
    val v12: Vector[Vector[Double]] = v13.p1
    v10 = v10.copy(p1 = v12)
    v10 = v10.copy(p1 = v5)
    v10 = v10.copy(p0 = v9)
    val v42: Vector[Vector[Double]] = v6.p0
    v10 = v10.copy(p1 = v5)
    v10 = v10.copy(p0 = v2)
    var v29: s0 = v3
    v10 = v10.copy(p0 = v42)
    val v23: s0 = f65(v10, v29)
    v23
  }
  def f40(v0: s0, v1: s3): s0 = {
    var v3: s0 = v0
    val v2: s0 = f45(v3, v0)
    val v11: s0 = f45(v3, v2)
    val v4: s0 = f45(v3, v2)
    val v12: Vector[Vector[Double]] = v3.p0
    val v10: Vector[Double] = v12(0)
    val v16: Vector[Double] = v12(0)
    var v13: s0 = v3
    v3 = v0
    var v14: Vector[Vector[Double]] = v12
    var v33: Vector[Double] = v16
    v14 = v14.updated(0, v16)
    val v17: Vector[Vector[Double]] = v3.p1
    val v25: Vector[Double] = v17(0)
    v3 = v3.copy(p0 = v14)
    v14 = v14.updated(0, v16)
    val v26: Vector[Vector[Double]] = v13.p1
    val v29: Vector[Double] = v12(0)
    val v20: Double = v29(0)
    val v37: Vector[Vector[Double]] = v2.p0
    val v31: Vector[Vector[Double]] = v4.p1
    val v57: s0 = f65(v0, v3)
    v14 = v14.updated(0, v25)
    val v71: s0 = f45(v11, v13)
    v13 = v13.copy(p1 = v31)
    var v123: Vector[Vector[Double]] = v26
    v123 = v123.updated(0, v29)
    var v101: s0 = v71
    v33 = v33.updated(0, v20)
    v14 = v14.updated(0, v10)
    var v139: s0 = v13
    v139 = v13
    v13 = v13.copy(p1 = v123)
    v139 = v139.copy(p0 = v12)
    val v116: s0 = f45(v57, v139)
    v14 = v14.updated(0, v33)
    val v175: Vector[Vector[Double]] = v101.p1
    v101 = v101.copy(p0 = v37)
    v139 = v139.copy(p1 = v175)
    v116
  }
  @noinline
  def f0(v0: s3, v1: s0, v2: s1, v3: Double): Double = {
    var v13: s3 = v0
    var v16: s0 = v1
    val v49: Vector[Vector[s0]] = v13.p0
    val v38: s0 = f40(v16, v13)
    val v47: s0 = f65(v38, v1)
    v13 = v13.copy(p0 = v49)
    val v77: Vector[Vector[Double]] = v47.p1
    val v32: Vector[Double] = v77(0)
    val v63: Double = v32(0)
    v63
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))))
    val v1: s0 = s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))
    val v2: s1 = s1(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))
    val v3: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}