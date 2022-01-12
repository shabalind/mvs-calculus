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
    p0: Vector[s0],
    p1: s0
  )
  def f4(v0: Vector[Double]): Vector[Double] = {
    val v6: Double = v0(0)
    val v5: Double = v0(0)
    val v2: Double = v0(0)
    val v1: Double = v0(0)
    var v9: Vector[Double] = v0
    v9 = v0
    v9 = v9.updated(0, v5)
    v9 = v9.updated(0, v6)
    var v8: Double = v6
    v9 = v9.updated(0, v6)
    var v14: Double = v2
    v9 = v0
    val v16: Double = v0(0)
    val v10: Double = v9(0)
    v8 = v14
    var v19: Vector[Double] = v0
    v9 = v9.updated(0, v1)
    var v50: Vector[Double] = v9
    var v29: Vector[Double] = v19
    val v15: Double = v29(0)
    var v20: Vector[Double] = v0
    v9 = v9.updated(0, v16)
    val v26: Vector[Vector[Double]] = Vector(v0)
    var v24: Vector[Double] = v20
    v9 = v9.updated(0, v15)
    val v38: Double = v9(0)
    val v17: Vector[Double] = v26(0)
    var v33: Vector[Vector[Double]] = v26
    var v39: Vector[Double] = v17
    var v58: Vector[Vector[Double]] = v26
    v33 = v26
    v39 = v39.updated(0, v15)
    val v44: Double = v19(0)
    var v27: Vector[Double] = v50
    val v23: Vector[Double] = v58(0)
    var v47: Vector[Double] = v50
    val v40: Vector[Double] = v58(0)
    val v22: Vector[Double] = v33(0)
    val v31: Vector[Double] = v33(0)
    var v45: Double = v8
    v27 = v27.updated(0, v45)
    val v46: Vector[Double] = v58(0)
    v50 = v50.updated(0, v38)
    val v59: Vector[Vector[Double]] = Vector(v0, v24, v27, v29, v46)
    val v70: Vector[Vector[Double]] = Vector(v47, v22, v39, v24, v31, v23)
    val v62: Vector[Double] = v70(1)
    val v112: Double = v29(0)
    v39 = v39.updated(0, v14)
    v27 = v27.updated(0, v112)
    val v91: Vector[Double] = v59(3)
    v39 = v39.updated(0, v44)
    val v28: Vector[Vector[Double]] = Vector(v62, v40, v24, v0, v91, v50, v31)
    val v109: Double = v46(0)
    var v88: Vector[Vector[Double]] = v28
    val v87: Vector[Double] = v88(4)
    v19 = v19.updated(0, v10)
    v47 = v47.updated(0, v109)
    v87
  }
  @noinline
  def f0(v0: Vector[s2], v1: s0, v2: Vector[s1], v3: Double): Double = {
    var v5: Double = v3
    val v6: Vector[Vector[Double]] = v1.p1
    val v13: Vector[Double] = v6(0)
    val v8: Vector[Double] = f4(v13)
    val v45: Vector[Double] = f4(v8)
    var v31: Double = v5
    val v46: Double = v45(0)
    val v47: Double = v31 - v46
    v47
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))))
    val v1: s0 = s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))
    val v2: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), Vector(Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))))))
    val v3: Double = 35.0
    val start = nanoTime()
    var result: Double = 35.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}