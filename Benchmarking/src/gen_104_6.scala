import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  def f16(v0: Double): Double = {
    var v7: Double = v0
    var v4: Double = v0
    val v5: Double = v0 / v4
    var v6: Double = v5
    var v11: Double = v0
    var v8: Double = v0
    var v1: Double = v11
    var v9: Double = v4
    var v29: Double = v8
    var v17: Double = v9
    var v20: Double = v8
    var v43: Double = v5
    var v18: Double = v6
    val v34: Vector[Double] = Vector(v20, v29, v17, v18)
    var v24: Double = v18
    var v37: Vector[Double] = v34
    v37 = v37.updated(3, v1)
    val v32: Double = v37(2)
    v37 = v37.updated(1, v1)
    var v27: Vector[Double] = v34
    v37 = v37.updated(2, v32)
    val v19: Double = v37(3)
    var v31: Double = v19
    var v58: Vector[Double] = v27
    v37 = v37.updated(2, v5)
    val v59: Double = v58(2)
    var v60: Vector[Double] = v27
    v37 = v37.updated(2, v7)
    var v82: Vector[Double] = v60
    v82 = v82.updated(1, v24)
    v60 = v60.updated(3, v59)
    var v63: Vector[Double] = v37
    val v40: Double = v63(1)
    v63 = v63.updated(1, v40)
    v27 = v27.updated(1, v40)
    val v50: Double = v37(1)
    var v140: Double = v50
    v27 = v27.updated(1, v31)
    v27 = v27.updated(1, v5)
    v27 = v27.updated(0, v4)
    v82 = v82.updated(1, v43)
    v27 = v27.updated(1, v140)
    val v78: Double = v82(1)
    v78
  }
  def f1(v0: Vector[Double]): Vector[Double] = {
    var v1: Vector[Double] = v0
    val v3: Double = v1(0)
    val v4: Double = v0(0)
    val v6: Double = v0(0)
    val v5: Vector[Vector[Double]] = Vector(v1, v1)
    val v2: Vector[Double] = v5(1)
    val v9: Double = v3 * v4
    v1 = v1.updated(0, v3)
    var v10: Vector[Vector[Double]] = v5
    v10 = v10.updated(0, v2)
    var v21: Vector[Double] = v2
    val v14: Double = v6 * v9
    val v50: Double = f16(v9)
    val v23: Double = f16(v14)
    val v33: Vector[Vector[Vector[Double]]] = Vector(v5, v10)
    var v24: Vector[Vector[Vector[Double]]] = v33
    v21 = v21.updated(0, v50)
    v10 = v10.updated(1, v0)
    val v72: Double = f16(v23)
    v10 = v10.updated(1, v21)
    v24 = v24.updated(1, v10)
    val v95: Double = f16(v72)
    val v83: Vector[Vector[Double]] = v24(0)
    v21 = v21.updated(0, v95)
    v24 = v24.updated(1, v10)
    val v125: Vector[Double] = v83(1)
    v125
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v9: s1 = v0(2)
    val v7: Vector[Vector[s0]] = v9.p1
    var v15: Vector[Vector[s0]] = v7
    val v13: Vector[s0] = v15(0)
    val v20: Double = f16(v1)
    val v33: Vector[s0] = v15(0)
    val v25: Double = f16(v20)
    val v30: Vector[Vector[s0]] = Vector(v13, v13, v33, v33, v13)
    var v40: Vector[Vector[s0]] = v30
    var v39: Vector[s0] = v13
    val v72: Vector[s0] = v40(1)
    v15 = v15.updated(1, v13)
    v15 = v15.updated(0, v33)
    val v87: s0 = v39(0)
    var v85: s0 = v87
    val v76: Vector[Double] = v85.p1
    val v83: Vector[Double] = f1(v76)
    v85 = v85.copy(p1 = v76)
    val v104: Double = v83(0)
    val v380: s0 = v72(0)
    v39 = v39.updated(0, v380)
    val v211: Double = v25 + v104
    v211
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(7.0))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(11.0)))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(15.0))), Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(19.0))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(23.0))))), s1(Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(27.0))), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(31.0))), Vector(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(35.0)))), Vector(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(39.0))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(43.0))), Vector(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(47.0))))), s1(Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(51.0))), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(55.0))), Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(59.0)))), Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(63.0))), Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(67.0))), Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(71.0))))))
    val v1: Double = 72.0
    val start = nanoTime()
    var result: Double = 72.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}