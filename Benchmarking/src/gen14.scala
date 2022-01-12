import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s3 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s4 (
    p0: s3,
    p1: Vector[Vector[Double]]
  )
  def f28(v0: Double): Double = {
    var v4: Double = v0
    var v2: Double = v0
    var v13: Double = v0
    var v7: Double = v4
    var v1: Double = v7
    var v3: Double = v7
    var v5: Double = v3
    val v9: Vector[Double] = Vector(v7, v4, v13, v5, v5, v13, v13)
    v4 = v3
    var v6: Vector[Double] = v9
    var v19: Vector[Double] = v6
    var v26: Double = v0
    var v21: Vector[Double] = v9
    var v14: Vector[Double] = v6
    var v17: Double = v0
    var v22: Vector[Double] = v19
    val v33: Double = v22(6)
    var v25: Vector[Double] = v9
    v19 = v19.updated(4, v26)
    val v16: Double = v9(0)
    var v37: Double = v0
    v21 = v21.updated(4, v37)
    v14 = v14.updated(6, v17)
    v19 = v19.updated(0, v16)
    v14 = v14.updated(1, v1)
    var v36: Vector[Double] = v14
    val v34: Double = v9(1)
    val v24: Double = v36(3)
    val v30: Double = v25(1)
    var v27: Vector[Double] = v19
    var v46: Vector[Double] = v22
    var v47: Vector[Double] = v36
    var v50: Double = v2
    v21 = v21.updated(2, v33)
    var v42: Double = v37
    v22 = v22.updated(6, v0)
    v37 = v30
    var v68: Vector[Double] = v27
    v27 = v21
    val v48: Vector[Vector[Double]] = Vector(v68, v21, v47, v9, v36, v46)
    v27 = v27.updated(0, v50)
    v42 = v24
    val v35: Vector[Double] = v48(3)
    var v69: Vector[Vector[Double]] = v48
    val v73: Vector[Double] = v48(5)
    v5 = v42
    val v91: Double = v73(1)
    v22 = v35
    val v110: Vector[Double] = v69(3)
    val v120: Double = v110(4)
    v27 = v27.updated(6, v34)
    v13 = v91
    v120
  }
  @noinline
  def f0(v0: Vector[Vector[s4]], v1: Double): Double = {
    var v5: Double = v1
    val v4: Double = f28(v1)
    var v2: Double = v4
    val v17: Double = v2 * v5
    val v43: Double = v17 + v17
    val v32: Vector[Double] = Vector(v43)
    val v49: Double = f28(v2)
    val v48: Double = v32(0)
    val v79: Double = v49 / v48
    v79
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s4]] = Vector(Vector(s4(s3(s0(Vector(Vector(0.0)), 1.0), Vector(s1(Vector(Vector(s0(Vector(Vector(2.0)), 3.0)), Vector(s0(Vector(Vector(4.0)), 5.0)), Vector(s0(Vector(Vector(6.0)), 7.0))), Vector(s0(Vector(Vector(8.0)), 9.0))), s1(Vector(Vector(s0(Vector(Vector(10.0)), 11.0)), Vector(s0(Vector(Vector(12.0)), 13.0)), Vector(s0(Vector(Vector(14.0)), 15.0))), Vector(s0(Vector(Vector(16.0)), 17.0))))), Vector(Vector(18.0), Vector(19.0), Vector(20.0)))), Vector(s4(s3(s0(Vector(Vector(21.0)), 22.0), Vector(s1(Vector(Vector(s0(Vector(Vector(23.0)), 24.0)), Vector(s0(Vector(Vector(25.0)), 26.0)), Vector(s0(Vector(Vector(27.0)), 28.0))), Vector(s0(Vector(Vector(29.0)), 30.0))), s1(Vector(Vector(s0(Vector(Vector(31.0)), 32.0)), Vector(s0(Vector(Vector(33.0)), 34.0)), Vector(s0(Vector(Vector(35.0)), 36.0))), Vector(s0(Vector(Vector(37.0)), 38.0))))), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))))
    val v1: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}