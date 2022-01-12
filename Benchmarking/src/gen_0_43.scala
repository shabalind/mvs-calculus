import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f49(v0: Double): Double = {
    var v4: Double = v0
    val v8: Double = v0 / v0
    val v3: Double = v8 + v0
    v4 = v8
    var v5: Double = v3
    var v7: Double = v8
    var v6: Double = v8
    var v1: Double = v6
    var v16: Double = v4
    var v15: Double = v8
    var v10: Double = v3
    var v13: Double = v7
    var v17: Double = v4
    v5 = v0
    var v18: Double = v0
    var v28: Double = v4
    var v11: Double = v1
    val v14: Vector[Double] = Vector(v15, v10, v7, v7, v8, v15, v11)
    var v24: Double = v18
    var v21: Vector[Double] = v14
    v21 = v21.updated(1, v5)
    v21 = v21.updated(2, v10)
    var v20: Vector[Double] = v14
    var v12: Vector[Double] = v20
    v12 = v12.updated(0, v16)
    var v22: Vector[Double] = v21
    v21 = v21.updated(1, v1)
    var v29: Vector[Double] = v14
    val v35: Double = v12(0)
    var v53: Double = v3
    v20 = v20.updated(3, v17)
    var v44: Vector[Double] = v22
    val v50: Vector[Vector[Double]] = Vector(v44, v14, v44)
    var v48: Vector[Vector[Double]] = v50
    v22 = v22.updated(5, v10)
    val v30: Vector[Double] = v50(0)
    val v70: Double = v20(5)
    var v81: Vector[Vector[Double]] = v48
    val v46: Vector[Double] = v81(0)
    v20 = v20.updated(1, v35)
    var v49: Double = v3
    v81 = v81.updated(1, v46)
    v21 = v29
    v29 = v29.updated(3, v53)
    v21 = v21.updated(3, v28)
    v44 = v44.updated(2, v49)
    var v72: Double = v24
    val v93: Vector[Double] = v81(2)
    v13 = v72
    v22 = v22.updated(2, v7)
    v44 = v44.updated(2, v13)
    val v130: Double = v93(1)
    v21 = v21.updated(1, v70)
    v48 = v48.updated(1, v20)
    v44 = v44.updated(5, v6)
    v6 = v8
    v12 = v30
    v130
  }
  def f23(v0: Double): Double = {
    var v5: Double = v0
    val v1: Double = f49(v5)
    var v10: Double = v1
    val v8: Vector[Double] = Vector(v10)
    val v11: Double = f49(v0)
    val v24: Vector[Vector[Double]] = Vector(v8, v8, v8, v8, v8, v8)
    var v16: Vector[Vector[Double]] = v24
    v16 = v16.updated(3, v8)
    v16 = v16.updated(4, v8)
    val v28: Vector[Double] = v24(1)
    val v42: Vector[Double] = v16(5)
    val v180: Double = v42(0)
    v5 = v11
    v16 = v16.updated(1, v28)
    v180
  }
  @noinline
  def f0(v0: s0, v1: Vector[s0], v2: Double): Double = {
    val v5: Double = f23(v2)
    val v18: Double = f23(v2)
    val v14: Double = f49(v2)
    val v17: Double = f49(v5)
    val v67: Double = v17 * v17
    val v24: Double = v2 + v2
    val v25: Double = f23(v18)
    val v57: Vector[Double] = Vector(v5, v67, v14, v2, v25, v14)
    val v61: Double = v57(3)
    val v38: Double = v24 * v61
    v38
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))
    val v2: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}