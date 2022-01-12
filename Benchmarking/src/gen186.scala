import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: Vector[s0]
  )
  def f17(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p0
    val v6: Vector[s0] = Vector(v0, v0, v0, v0, v0)
    val v5: Vector[Double] = v4(1)
    val v7: Vector[Vector[Double]] = v0.p1
    var v2: Vector[s0] = v6
    val v8: s0 = s0(v4, v7)
    val v1: Double = v5(0)
    v2 = v2.updated(1, v8)
    var v3: Vector[Vector[Double]] = v7
    val v16: s0 = v2(2)
    val v12: Vector[Vector[Double]] = v0.p1
    var v10: Vector[Vector[Double]] = v3
    val v33: Vector[Vector[Double]] = v0.p0
    val v13: Vector[Double] = v10(0)
    val v21: Vector[Vector[Double]] = v8.p0
    var v19: Vector[Double] = v13
    var v15: Double = v1
    val v24: Double = v1 - v15
    val v27: Vector[Vector[Vector[Double]]] = Vector(v3, v3, v7, v7)
    val v39: Vector[Vector[Double]] = v8.p1
    val v25: Vector[Vector[Double]] = v0.p1
    val v50: s0 = s0(v33, v25)
    val v23: Vector[Vector[Double]] = v50.p1
    val v34: Vector[Vector[Double]] = v27(1)
    var v26: Vector[Double] = v5
    v19 = v19.updated(0, v24)
    v10 = v12
    val v44: Vector[Vector[Double]] = v0.p0
    v19 = v19.updated(0, v1)
    val v35: Vector[Vector[Double]] = v8.p1
    var v41: Vector[Vector[Vector[Double]]] = v27
    var v36: s0 = v16
    v36 = v36.copy(p1 = v23)
    v36 = v36.copy(p1 = v35)
    v3 = v3.updated(0, v5)
    v36 = v36.copy(p0 = v44)
    val v52: Vector[Vector[Double]] = v36.p0
    v3 = v3.updated(0, v19)
    v2 = v2.updated(0, v0)
    val v57: s0 = s0(v52, v23)
    v3 = v3.updated(0, v26)
    v26 = v26.updated(0, v15)
    val v108: Vector[Vector[Double]] = v41(1)
    v41 = v41.updated(1, v108)
    val v69: Double = v19(0)
    v26 = v26.updated(0, v69)
    v36 = v36.copy(p1 = v34)
    val v111: Vector[Vector[Double]] = v27(3)
    val v112: s0 = s0(v21, v39)
    val v89: Vector[Vector[Double]] = v112.p1
    v36 = v36.copy(p1 = v108)
    v36 = v36.copy(p1 = v7)
    v36 = v36.copy(p1 = v89)
    v36 = v36.copy(p0 = v52)
    v36 = v36.copy(p1 = v10)
    v36 = v36.copy(p1 = v111)
    v57
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v2: s1 = v0(1)
    var v6: s1 = v2
    val v3: s0 = v6.p0
    v6 = v6.copy(p0 = v3)
    val v5: Vector[Vector[Double]] = v3.p1
    val v7: s0 = v2.p0
    v6 = v6.copy(p0 = v7)
    val v13: Vector[Double] = v5(0)
    v6 = v6.copy(p1 = v3)
    val v9: Vector[s0] = v6.p2
    var v19: Vector[s0] = v9
    var v10: s0 = v3
    v6 = v6.copy(p0 = v7)
    val v12: s0 = v9(0)
    val v15: s0 = v19(1)
    v6 = v6.copy(p2 = v19)
    val v23: s1 = v0(0)
    var v29: s1 = v2
    var v21: Vector[Vector[Double]] = v5
    var v24: s1 = v23
    var v40: Vector[s0] = v19
    var v34: s1 = v29
    v34 = v34.copy(p1 = v12)
    v34 = v34.copy(p1 = v7)
    v10 = v10.copy(p1 = v21)
    v34 = v34.copy(p2 = v9)
    val v26: s0 = v34.p0
    val v35: s0 = v24.p1
    val v83: s0 = v23.p1
    v6 = v6.copy(p2 = v40)
    v40 = v19
    v6 = v6.copy(p2 = v9)
    val v73: s0 = f17(v26)
    val v17: s0 = f17(v83)
    val v51: Double = v13(0)
    val v66: s0 = f17(v83)
    v29 = v29.copy(p0 = v17)
    val v63: Vector[Vector[Double]] = v66.p1
    v6 = v6.copy(p1 = v10)
    v34 = v34.copy(p0 = v12)
    v34 = v34.copy(p2 = v40)
    v34 = v34.copy(p2 = v9)
    v24 = v24.copy(p2 = v19)
    v10 = v10.copy(p1 = v63)
    val v107: Vector[Vector[Double]] = v73.p0
    v10 = v10.copy(p0 = v107)
    v40 = v40.updated(1, v15)
    v29 = v29.copy(p1 = v35)
    v51
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))), s1(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))))))
    val v1: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}