import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f8(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v4: Vector[Double] = v0(0)
    val v2: Double = v4(0)
    var v6: Vector[Vector[Double]] = v0
    var v3: Double = v2
    var v5: Vector[Vector[Double]] = v6
    var v1: Vector[Vector[Double]] = v5
    v1 = v1.updated(0, v4)
    v6 = v6.updated(0, v4)
    var v11: Vector[Vector[Double]] = v1
    v3 = v2
    v6 = v6.updated(0, v4)
    v11 = v11.updated(0, v4)
    val v21: Vector[Double] = Vector(v3, v3, v2)
    v11 = v6
    var v14: Vector[Vector[Double]] = v0
    v6 = v14
    v5 = v11
    val v29: Vector[Double] = v14(0)
    var v34: Vector[Vector[Double]] = v11
    val v51: Double = v21(0)
    val v39: Vector[Vector[Vector[Double]]] = Vector(v11, v6, v0, v1, v11, v0, v34)
    var v48: Vector[Double] = v29
    v5 = v5.updated(0, v48)
    var v73: Vector[Vector[Vector[Double]]] = v39
    val v98: Vector[Vector[Double]] = v73(4)
    v48 = v48.updated(0, v51)
    v98
  }
  def f6(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v4: Vector[Vector[Double]] = f8(v0)
    val v12: Vector[Vector[Double]] = f8(v4)
    v12
  }
  def f3(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v15: Vector[Vector[Double]] = f8(v1)
    val v31: Vector[Vector[Double]] = f8(v15)
    v31
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Double): Double = {
    val v3: Vector[Vector[Double]] = f8(v1)
    val v6: Vector[Vector[Double]] = f3(v3, v3)
    val v11: Vector[Double] = v6(0)
    val v7: Vector[Double] = v6(0)
    var v4: Vector[Vector[Double]] = v1
    v4 = v4.updated(0, v11)
    v4 = v4.updated(0, v7)
    var v30: Vector[Vector[Double]] = v4
    val v23: Vector[Double] = v6(0)
    v30 = v30.updated(0, v7)
    var v17: Vector[Vector[Double]] = v4
    val v18: Vector[Double] = v0(0)
    var v13: Vector[Double] = v18
    val v52: Vector[Vector[Double]] = f3(v3, v17)
    v4 = v4.updated(0, v13)
    v17 = v17.updated(0, v23)
    v30 = v30.updated(0, v13)
    v30 = v30.updated(0, v23)
    val v78: Vector[Vector[Double]] = f6(v52, v30)
    val v66: Vector[Double] = v78(0)
    val v64: Double = v66(0)
    v64
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(2.0))
    val v2: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}