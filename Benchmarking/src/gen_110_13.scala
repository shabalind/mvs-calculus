import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double,
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s5 (
    p0: s3,
    p1: s0
  )
  def f44(v0: Double): Double = {
    var v3: Double = v0
    var v5: Double = v0
    val v2: Vector[Double] = Vector(v3, v0)
    var v9: Vector[Double] = v2
    val v7: Double = v2(0)
    val v4: Double = v2(0)
    val v1: Double = v9(0)
    var v12: Vector[Double] = v2
    var v13: Vector[Double] = v12
    v9 = v9.updated(0, v3)
    v9 = v9.updated(1, v7)
    var v25: Double = v4
    var v18: Double = v25
    var v19: Double = v1
    val v40: Vector[Double] = Vector(v25, v3, v0)
    var v39: Vector[Double] = v12
    v39 = v39.updated(1, v5)
    val v73: Vector[Vector[Double]] = Vector(v39, v9)
    var v30: Vector[Double] = v40
    val v44: Double = v40(1)
    v12 = v12.updated(0, v18)
    var v51: Vector[Double] = v30
    var v22: Vector[Double] = v12
    v12 = v12.updated(1, v44)
    var v49: Vector[Double] = v51
    val v89: Vector[Double] = v73(1)
    val v98: Vector[Double] = v73(1)
    var v69: Vector[Double] = v13
    v51 = v51.updated(1, v0)
    val v82: Double = v69(0)
    val v60: Vector[Double] = v73(1)
    var v121: Vector[Double] = v22
    var v63: Vector[Double] = v69
    var v99: Vector[Double] = v63
    v121 = v39
    var v132: Vector[Double] = v121
    val v147: Double = v49(1)
    val v117: Double = v51(0)
    v132 = v132.updated(0, v82)
    v30 = v30.updated(2, v147)
    v13 = v13.updated(0, v19)
    val v92: Vector[Vector[Double]] = Vector(v132, v89, v60, v99, v98, v89, v99)
    val v138: Vector[Double] = v92(6)
    v9 = v9.updated(0, v18)
    v132 = v132.updated(0, v117)
    val v273: Double = v138(1)
    v273
  }
  def f18(v0: Double): Double = {
    val v2: Double = f44(v0)
    val v10: Double = f44(v2)
    val v12: Double = f44(v2)
    val v30: Vector[Double] = Vector(v0, v2, v10, v12, v0)
    var v27: Vector[Double] = v30
    var v46: Vector[Double] = v27
    val v86: Double = v46(0)
    v86
  }
  @noinline
  def f0(v0: s1, v1: s5, v2: s0, v3: s0, v4: Double): Double = {
    val v14: Double = v0.p0
    val v23: Double = v14 * v14
    var v18: Double = v23
    val v35: Double = f18(v23)
    val v16: Vector[Vector[Double]] = v3.p1
    val v34: Vector[Double] = v16(0)
    var v28: Vector[Double] = v34
    val v39: Double = f18(v18)
    v28 = v28.updated(0, v35)
    val v33: Double = v28(0)
    v28 = v34
    v28 = v28.updated(0, v39)
    v33
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(0.0, Vector(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))))
    val v1: s5 = s5(s3(Vector(Vector(s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)), Vector(Vector(12.0)))), Vector(s0(Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0))))), Vector(s0(Vector(Vector(17.0), Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0))))
    val v2: s0 = s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0)))
    val v3: s0 = s0(Vector(Vector(29.0), Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))
    val v4: Double = 33.0
    val start = nanoTime()
    var result: Double = 33.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}