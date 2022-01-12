import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  def f71(v0: s0): s0 = {
    val v1: Vector[s0] = Vector(v0, v0, v0, v0, v0, v0)
    val v19: s0 = v1(0)
    var v43: Vector[s0] = v1
    val v65: s0 = v43(5)
    v43 = v43.updated(0, v19)
    v43 = v43.updated(0, v0)
    v65
  }
  def f68(v0: s0): s0 = {
    val v2: s0 = f71(v0)
    var v4: s0 = v0
    val v6: s0 = f71(v4)
    val v7: Vector[Vector[Double]] = v6.p0
    var v3: Vector[Vector[Double]] = v7
    val v12: Vector[Double] = v3(1)
    v3 = v3.updated(1, v12)
    v3 = v3.updated(0, v12)
    val v9: s0 = f71(v0)
    var v5: s0 = v9
    val v13: Vector[Vector[Double]] = v9.p1
    val v8: Double = v12(0)
    v3 = v3.updated(1, v12)
    val v21: Vector[Vector[Double]] = v9.p1
    val v16: Vector[Double] = v21(0)
    var v27: Vector[Double] = v12
    val v15: Vector[Vector[Double]] = v2.p0
    var v17: Vector[Vector[Double]] = v15
    val v24: Vector[Double] = v17(2)
    val v14: s0 = f71(v5)
    v4 = v4.copy(p1 = v21)
    v3 = v3.updated(0, v12)
    v27 = v27.updated(0, v8)
    v17 = v17.updated(2, v16)
    val v28: Double = v12(0)
    v4 = v4.copy(p1 = v13)
    val v19: Double = v24(0)
    v5 = v5.copy(p0 = v17)
    val v32: Vector[Double] = v17(1)
    v3 = v3.updated(1, v32)
    val v18: s0 = s0(v7, v21, v21)
    val v41: s0 = f71(v14)
    val v42: Vector[Vector[Double]] = v41.p2
    val v65: Vector[Double] = v3(1)
    v3 = v3.updated(2, v65)
    val v40: Vector[Vector[Double]] = v18.p0
    v4 = v4.copy(p0 = v3)
    var v46: Vector[Double] = v65
    var v44: Vector[Vector[Double]] = v40
    var v58: Vector[Vector[Double]] = v42
    v27 = v27.updated(0, v28)
    v17 = v17.updated(0, v27)
    v3 = v3.updated(0, v27)
    val v93: Vector[Vector[Double]] = v14.p2
    val v34: Vector[Vector[Double]] = v9.p1
    val v180: Vector[Double] = v93(0)
    val v84: Vector[Vector[Double]] = v5.p1
    val v116: s0 = s0(v44, v84, v34)
    val v96: s0 = f71(v116)
    v46 = v46.updated(0, v19)
    v58 = v58.updated(0, v46)
    v5 = v5.copy(p2 = v58)
    val v183: s0 = f71(v96)
    v3 = v3.updated(0, v180)
    v183
  }
  def f66(v0: s0): s0 = {
    val v3: s0 = f71(v0)
    val v2: s0 = f71(v3)
    val v4: s0 = f71(v2)
    val v8: Vector[Vector[Double]] = v0.p2
    var v16: s0 = v3
    v16 = v16.copy(p1 = v8)
    val v6: Vector[Vector[Double]] = v16.p2
    val v12: Vector[Vector[Double]] = v16.p0
    v16 = v3
    v16 = v4
    val v35: Vector[Vector[Double]] = v0.p2
    val v18: s0 = s0(v12, v35, v6)
    val v42: Vector[Vector[Double]] = v4.p1
    val v31: Vector[Vector[Double]] = v18.p1
    val v60: s0 = s0(v12, v31, v8)
    var v69: Vector[Vector[Double]] = v8
    v16 = v16.copy(p2 = v69)
    v16 = v16.copy(p2 = v42)
    val v41: s0 = f68(v60)
    v16 = v16.copy(p2 = v69)
    val v37: Vector[Vector[Double]] = v41.p2
    v16 = v16.copy(p1 = v6)
    v16 = v16.copy(p1 = v37)
    v41
  }
  def f35(v0: s2): s2 = {
    val v2: Vector[s2] = Vector(v0)
    val v17: s2 = v2(0)
    v17
  }
  @noinline
  def f0(v0: s2, v1: s0, v2: Vector[s0], v3: Double): Double = {
    val v5: s2 = f35(v0)
    val v8: Vector[Double] = Vector(v3, v3, v3, v3, v3)
    val v4: Vector[Vector[Double]] = v1.p1
    var v18: Vector[Vector[Double]] = v4
    val v7: Vector[s0] = v5.p1
    var v11: Vector[Vector[Double]] = v4
    val v12: s0 = v7(0)
    var v22: Vector[Vector[Double]] = v18
    val v14: Vector[Double] = v22(0)
    val v24: s0 = f66(v12)
    v11 = v11.updated(0, v14)
    val v20: Double = v14(0)
    val v39: Double = v14(0)
    var v30: Vector[Double] = v8
    val v31: Double = v8(4)
    var v35: Double = v39
    val v47: Double = v35 * v20
    v22 = v22.updated(0, v14)
    v30 = v30.updated(4, v39)
    v30 = v30.updated(1, v47)
    v18 = v18.updated(0, v14)
    val v55: Vector[Vector[Double]] = v24.p1
    v30 = v30.updated(3, v20)
    val v120: Vector[Double] = v55(0)
    var v84: Vector[Double] = v120
    val v44: Double = v84(0)
    val v102: Double = v30(2)
    v30 = v30.updated(0, v31)
    v30 = v30.updated(4, v44)
    v30 = v30.updated(0, v3)
    val v81: Vector[Vector[Double]] = v1.p1
    val v174: Vector[Double] = v81(0)
    val v145: Vector[Double] = v11(0)
    v22 = v22.updated(0, v145)
    v18 = v18.updated(0, v174)
    v30 = v30.updated(2, v31)
    v102
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0)), Vector(Vector(14.0))))), Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0)), Vector(Vector(19.0)))))
    val v1: s0 = s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)), Vector(Vector(24.0)))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0)), Vector(Vector(29.0))))
    val v3: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}