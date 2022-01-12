import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  def f108(v0: Vector[Double]): Vector[Double] = {
    val v4: Double = v0(1)
    var v2: Double = v4
    var v7: Double = v2
    var v5: Vector[Double] = v0
    var v11: Vector[Double] = v5
    v5 = v5.updated(0, v4)
    val v18: Double = v0(0)
    v11 = v11.updated(1, v4)
    val v13: Double = v18 - v4
    val v10: Vector[Double] = Vector(v13, v18)
    var v14: Vector[Double] = v5
    var v22: Vector[Double] = v5
    val v12: Vector[Vector[Double]] = Vector(v14, v11, v11, v5, v14, v5)
    val v20: Double = v10(0)
    val v30: Double = v22(0)
    val v32: Vector[Vector[Vector[Double]]] = Vector(v12, v12, v12, v12, v12)
    var v43: Vector[Vector[Vector[Double]]] = v32
    var v57: Double = v30
    var v58: Double = v57
    v5 = v5.updated(0, v7)
    val v40: Vector[Vector[Double]] = v43(0)
    v5 = v5.updated(0, v20)
    val v85: Vector[Double] = v40(2)
    v11 = v11.updated(1, v58)
    v85
  }
  def f106(v0: Double): Double = {
    var v7: Double = v0
    var v3: Double = v7
    var v4: Double = v7
    var v6: Double = v0
    var v8: Double = v0
    var v10: Double = v8
    val v11: Vector[Double] = Vector(v6, v3, v4)
    val v5: Double = v11(2)
    val v1: Vector[Double] = f108(v11)
    var v13: Vector[Double] = v1
    val v22: Vector[Double] = f108(v13)
    v4 = v10
    val v64: Vector[Double] = f108(v1)
    v13 = v13.updated(1, v5)
    val v20: Vector[Double] = f108(v22)
    val v43: Vector[Double] = f108(v22)
    val v48: Vector[Double] = f108(v11)
    val v31: Vector[Double] = f108(v64)
    var v38: Double = v8
    val v51: Double = v20(0)
    v8 = v38
    val v32: Double = v31(2)
    val v19: Double = v43(2)
    val v34: Double = v1(0)
    v13 = v13.updated(1, v0)
    var v97: Double = v10
    val v41: Vector[Double] = f108(v48)
    v8 = v32
    var v140: Double = v10
    val v85: Vector[Double] = Vector(v34, v19, v32, v97, v140, v51, v6)
    var v42: Vector[Double] = v85
    v42 = v85
    val v103: Double = v41(1)
    val v81: Double = v42(4)
    var v87: Vector[Double] = v85
    var v100: Vector[Double] = v87
    v13 = v13.updated(2, v103)
    v100 = v100.updated(2, v81)
    val v105: Double = v100(5)
    v105
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v2: Double = f106(v1)
    val v6: Vector[Double] = Vector(v2)
    val v13: Double = f106(v2)
    var v20: Double = v1
    val v10: Double = f106(v13)
    val v14: Double = v10 * v13
    val v21: Double = f106(v20)
    var v15: Vector[Double] = v6
    val v23: Double = f106(v2)
    v15 = v15.updated(0, v21)
    v15 = v6
    var v30: Double = v14
    var v59: Double = v10
    v15 = v15.updated(0, v13)
    var v40: Vector[Double] = v15
    v20 = v21
    var v192: Double = v10
    var v101: Vector[Double] = v40
    v101 = v101.updated(0, v30)
    v40 = v15
    v40 = v40.updated(0, v59)
    v101 = v101.updated(0, v23)
    v40 = v40.updated(0, v30)
    v15 = v15.updated(0, v14)
    v15 = v15.updated(0, v30)
    v20 = v192
    val v224: Double = v101(0)
    v224
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))))), Vector(Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))))), Vector(s1(Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))))), Vector(s1(Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))), Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))))), Vector(Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))))))
    val v1: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}