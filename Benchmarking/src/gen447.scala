import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double],
    p2: Double,
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]],
    p5: Vector[Vector[Double]]
  )
  def f87(v0: Vector[Double]): Vector[Double] = {
    var v4: Vector[Double] = v0
    var v6: Vector[Double] = v0
    val v2: Double = v4(0)
    var v3: Vector[Double] = v4
    val v1: Vector[Vector[Double]] = Vector(v3, v3, v6, v6)
    v3 = v3.updated(1, v2)
    val v9: Double = v3(1)
    v4 = v4.updated(1, v9)
    v4 = v4.updated(1, v2)
    v4 = v0
    val v13: Vector[Double] = v1(1)
    val v14: Double = v4(0)
    val v26: Double = v13(0)
    val v15: Double = v3(1)
    var v29: Vector[Vector[Double]] = v1
    v29 = v29.updated(3, v0)
    var v18: Vector[Vector[Double]] = v29
    var v25: Double = v26
    var v23: Vector[Vector[Double]] = v1
    val v27: Double = v4(1)
    var v59: Double = v15
    var v22: Double = v25
    v4 = v4.updated(0, v22)
    val v42: Vector[Double] = v23(2)
    val v54: Double = v42(1)
    val v56: Vector[Double] = v18(0)
    val v45: Double = v14 / v26
    v6 = v6.updated(0, v59)
    var v50: Vector[Double] = v56
    var v177: Vector[Double] = v4
    var v53: Vector[Double] = v177
    val v88: Double = v14 * v27
    v177 = v177.updated(0, v88)
    v50 = v50.updated(1, v54)
    v53 = v53.updated(1, v45)
    v18 = v18.updated(2, v53)
    v50
  }
  def f24(v0: s0): s0 = {
    var v1: s0 = v0
    var v7: s0 = v1
    var v4: s0 = v1
    var v6: s0 = v0
    var v2: s0 = v7
    var v3: s0 = v0
    val v9: Double = v3.p2
    var v10: Double = v9
    val v18: Vector[Vector[Double]] = v2.p5
    val v14: Vector[Vector[Double]] = v4.p3
    v4 = v4.copy(p3 = v14)
    val v21: Vector[Double] = v6.p1
    val v15: Double = v21(1)
    var v24: Vector[Vector[Double]] = v14
    v6 = v6.copy(p4 = v18)
    val v17: Vector[Vector[Double]] = v6.p0
    val v16: Vector[Vector[Double]] = v7.p5
    var v13: Vector[Double] = v21
    var v33: Vector[Vector[Double]] = v17
    val v27: Vector[Double] = v17(0)
    v7 = v7.copy(p3 = v24)
    val v25: Vector[Vector[Double]] = v6.p4
    val v19: Vector[Vector[Double]] = v1.p0
    var v26: Vector[Vector[Double]] = v24
    v24 = v24.updated(0, v27)
    v3 = v3.copy(p0 = v19)
    var v30: s0 = v6
    v7 = v7.copy(p4 = v16)
    v13 = v21
    val v35: Vector[Double] = f87(v13)
    var v34: Vector[Vector[Double]] = v18
    v4 = v4.copy(p2 = v10)
    val v23: Vector[Double] = v25(2)
    val v39: Double = v7.p2
    val v116: Vector[Double] = f87(v35)
    v13 = v13.updated(1, v10)
    val v32: Double = v23(0)
    var v22: Vector[Double] = v21
    v34 = v18
    var v55: Vector[Vector[Double]] = v25
    val v72: s0 = s0(v26, v116, v15, v26, v34, v18)
    val v51: Double = v30.p2
    v3 = v3.copy(p3 = v19)
    val v50: Vector[Double] = v24(0)
    val v20: Vector[Double] = f87(v116)
    v30 = v30.copy(p0 = v33)
    v55 = v55.updated(1, v50)
    val v36: Double = v39 + v32
    val v37: Vector[Double] = v55(0)
    v7 = v7.copy(p4 = v25)
    val v79: Vector[Vector[Double]] = v1.p0
    v4 = v4.copy(p3 = v33)
    v1 = v1.copy(p5 = v55)
    v2 = v2.copy(p0 = v24)
    v1 = v1.copy(p0 = v17)
    val v137: Vector[Double] = f87(v20)
    v30 = v30.copy(p4 = v16)
    v22 = v22.updated(0, v36)
    var v78: Double = v51
    v6 = v6.copy(p5 = v16)
    var v102: s0 = v72
    val v198: Double = v20(1)
    v4 = v4.copy(p1 = v22)
    v1 = v1.copy(p3 = v79)
    v3 = v3.copy(p2 = v198)
    v33 = v33.updated(0, v37)
    var v66: Vector[Double] = v137
    v102 = v102.copy(p1 = v66)
    var v234: s0 = v102
    v13 = v13.updated(0, v78)
    v234
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v3: s0 = v0(2)
    val v4: s0 = f24(v3)
    val v9: Vector[Double] = v3.p1
    var v7: s0 = v4
    v7 = v7.copy(p2 = v1)
    val v23: Double = v7.p2
    var v12: Vector[Double] = v9
    val v14: Vector[Vector[Double]] = v4.p5
    val v13: Vector[Double] = f87(v12)
    v12 = v12.updated(0, v23)
    val v16: Double = v13(1)
    v7 = v7.copy(p4 = v14)
    v7 = v7.copy(p2 = v16)
    v16
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(1.0, 2.0), 3.0, Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0))), s0(Vector(Vector(11.0)), Vector(12.0, 13.0), 14.0, Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0), Vector(21.0))), s0(Vector(Vector(22.0)), Vector(23.0, 24.0), 25.0, Vector(Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0))))
    val v1: Double = 33.0
    val start = nanoTime()
    var result: Double = 33.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}