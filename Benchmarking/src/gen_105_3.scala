import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  def f14(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    var v1: Vector[Vector[Double]] = v6
    var v3: s0 = v0
    v3 = v3.copy(p0 = v6)
    val v4: Vector[Vector[Double]] = v0.p1
    v3 = v3.copy(p0 = v6)
    var v17: s0 = v3
    val v8: Vector[Vector[Double]] = v17.p1
    val v11: Vector[Vector[Double]] = v0.p0
    val v5: Vector[Double] = v11(0)
    var v18: s0 = v3
    v18 = v18.copy(p1 = v8)
    val v10: Vector[Double] = v8(1)
    val v22: s0 = s0(v6, v8)
    v18 = v18.copy(p0 = v11)
    var v15: s0 = v0
    val v12: Vector[Vector[Double]] = v18.p0
    var v20: Vector[Vector[Double]] = v8
    val v19: Vector[Double] = v8(0)
    v17 = v17.copy(p0 = v1)
    val v25: Vector[Vector[Vector[Double]]] = Vector(v4, v20, v20, v8)
    v1 = v1.updated(0, v10)
    var v16: Vector[Double] = v10
    val v21: Vector[Vector[Double]] = v22.p0
    var v52: Vector[Double] = v5
    var v40: Vector[Vector[Double]] = v4
    val v26: Vector[Double] = v12(0)
    val v38: Vector[Vector[Double]] = Vector(v16, v52, v16, v26, v26, v5)
    var v29: s0 = v22
    val v27: Vector[Vector[Double]] = v17.p0
    var v36: s0 = v0
    var v81: Vector[Vector[Vector[Double]]] = v25
    val v39: Vector[Double] = v38(3)
    var v46: s0 = v0
    v15 = v15.copy(p0 = v1)
    v36 = v36.copy(p1 = v40)
    v40 = v40.updated(1, v39)
    val v37: Vector[Double] = v40(1)
    v81 = v81.updated(0, v20)
    val v90: Vector[Vector[Double]] = v46.p1
    val v102: Vector[Vector[Double]] = v36.p1
    val v60: Vector[Vector[Double]] = v29.p0
    val v69: Vector[Vector[Double]] = v25(3)
    val v47: Vector[Vector[Double]] = v0.p1
    v52 = v39
    v18 = v18.copy(p0 = v27)
    val v63: Vector[Vector[Double]] = v15.p1
    var v105: Vector[Vector[Vector[Double]]] = v81
    val v76: Double = v37(0)
    var v54: Double = v76
    v15 = v15.copy(p0 = v27)
    v29 = v29.copy(p0 = v60)
    val v89: Vector[Double] = v47(1)
    var v172: Double = v76
    val v122: Vector[Double] = v69(1)
    val v119: Vector[Vector[Double]] = v105(2)
    v20 = v20.updated(1, v89)
    val v80: Double = v19(0)
    v105 = v105.updated(3, v90)
    v17 = v17.copy(p1 = v102)
    v20 = v20.updated(0, v89)
    v81 = v81.updated(1, v63)
    v52 = v52.updated(0, v80)
    var v104: Double = v172
    v52 = v52.updated(0, v54)
    var v127: s0 = v29
    val v124: Vector[Double] = v119(0)
    v17 = v17.copy(p1 = v47)
    val v107: Double = v122(0)
    v127 = v127.copy(p1 = v119)
    v16 = v16.updated(0, v104)
    var v430: Vector[Double] = v124
    v20 = v20.updated(0, v430)
    v16 = v16.updated(0, v107)
    v29 = v29.copy(p0 = v21)
    v36 = v36.copy(p1 = v63)
    v127
  }
  @noinline
  def f0(v0: s1, v1: s0, v2: Double): Double = {
    val v11: s0 = f14(v1)
    var v5: s0 = v11
    val v8: Vector[Vector[Double]] = v5.p1
    val v16: Vector[Double] = v8(0)
    val v14: Vector[Vector[Double]] = v5.p0
    var v22: Vector[Double] = v16
    var v63: Vector[Vector[Double]] = v14
    v5 = v5.copy(p0 = v63)
    v63 = v63.updated(0, v16)
    v22 = v22.updated(0, v2)
    val v55: Double = v22(0)
    v55
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))))
    val v1: s0 = s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))
    val v2: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}