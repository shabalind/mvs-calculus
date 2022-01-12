import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  def f38(v0: Vector[Double]): Vector[Double] = {
    val v3: Double = v0(0)
    val v7: Double = v0(0)
    val v2: Double = v0(0)
    val v6: Double = v0(0)
    var v1: Vector[Double] = v0
    var v4: Vector[Double] = v1
    var v11: Vector[Double] = v1
    var v14: Double = v7
    val v16: Double = v1(0)
    v4 = v4.updated(0, v6)
    val v12: Double = v11(0)
    var v23: Vector[Double] = v1
    var v13: Vector[Double] = v11
    val v21: Double = v11(0)
    v23 = v23.updated(0, v3)
    v4 = v4.updated(0, v12)
    val v19: Double = v1(0)
    var v22: Vector[Double] = v1
    var v49: Vector[Double] = v1
    v22 = v22.updated(0, v3)
    val v18: Double = v13(0)
    val v32: Double = v23(0)
    var v27: Vector[Double] = v4
    v23 = v23.updated(0, v19)
    var v47: Double = v16
    var v79: Double = v2
    val v51: Double = v1(0)
    var v30: Double = v18
    v22 = v22.updated(0, v32)
    var v61: Vector[Double] = v13
    val v52: Vector[Vector[Double]] = Vector(v27)
    var v123: Vector[Vector[Double]] = v52
    v49 = v49.updated(0, v30)
    var v40: Double = v51
    var v72: Vector[Vector[Double]] = v123
    v123 = v123.updated(0, v23)
    val v77: Vector[Double] = v72(0)
    val v121: Vector[Double] = v123(0)
    v49 = v49.updated(0, v30)
    val v156: Vector[Vector[Double]] = Vector(v77, v22, v49, v4, v121, v61)
    v27 = v27.updated(0, v47)
    v61 = v61.updated(0, v14)
    var v229: Vector[Vector[Double]] = v156
    v61 = v61.updated(0, v21)
    val v111: Vector[Double] = v229(0)
    v49 = v49.updated(0, v79)
    v229 = v229.updated(1, v111)
    v13 = v13.updated(0, v40)
    v111
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v3: Vector[Vector[s0]] = Vector(v0, v0, v0)
    val v7: Vector[s0] = v3(0)
    val v8: s0 = v7(1)
    val v5: Vector[Vector[Double]] = v8.p1
    val v17: Vector[Double] = v5(0)
    var v13: Vector[Double] = v17
    val v20: Vector[Double] = v5(0)
    val v18: Vector[Double] = f38(v13)
    val v41: Vector[Double] = f38(v20)
    val v30: Vector[Double] = f38(v41)
    val v56: Vector[Double] = f38(v30)
    v13 = v56
    val v59: Vector[Double] = f38(v18)
    val v43: Vector[Double] = f38(v13)
    val v89: Vector[Double] = f38(v43)
    val v132: Double = v59(0)
    val v104: Double = v132 - v1
    var v103: Double = v104
    v13 = v89
    v103
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))
    val v1: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}