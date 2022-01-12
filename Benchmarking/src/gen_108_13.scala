import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s0]
  )
  def f78(v0: Double): Double = {
    var v4: Double = v0
    v4 = v0
    var v6: Double = v0
    var v1: Double = v4
    var v8: Double = v6
    v4 = v0
    val v5: Double = v8 * v6
    v1 = v4
    var v2: Double = v1
    var v3: Double = v4
    var v15: Double = v0
    var v12: Double = v0
    val v32: Vector[Double] = Vector(v6, v12)
    val v14: Double = v32(0)
    var v18: Vector[Double] = v32
    val v11: Double = v18(0)
    val v13: Double = v18(0)
    var v20: Vector[Double] = v18
    val v30: Double = v20(0)
    v20 = v20.updated(1, v13)
    var v16: Double = v5
    v18 = v18.updated(0, v30)
    var v28: Vector[Double] = v32
    v28 = v28.updated(0, v30)
    val v27: Double = v18(0)
    v4 = v27
    val v26: Vector[Double] = Vector(v5, v1, v2, v16, v4, v14, v8)
    v18 = v18.updated(0, v14)
    var v36: Vector[Double] = v18
    v18 = v18.updated(1, v14)
    var v42: Vector[Double] = v26
    v42 = v42.updated(2, v2)
    val v35: Double = v26(2)
    var v51: Vector[Double] = v42
    v42 = v42.updated(3, v1)
    val v65: Double = v42(4)
    val v31: Double = v36(0)
    val v43: Vector[Vector[Double]] = Vector(v28, v20, v32)
    v18 = v18.updated(1, v1)
    var v59: Vector[Double] = v51
    val v50: Vector[Double] = v43(2)
    v42 = v42.updated(2, v31)
    var v33: Vector[Double] = v36
    var v94: Vector[Vector[Double]] = v43
    v15 = v35
    var v99: Vector[Vector[Double]] = v43
    val v45: Vector[Double] = v94(0)
    var v39: Vector[Double] = v18
    v59 = v59.updated(6, v5)
    var v103: Vector[Vector[Double]] = v99
    v99 = v103
    v51 = v51.updated(0, v30)
    v103 = v103.updated(2, v18)
    v59 = v59.updated(1, v3)
    var v130: Vector[Double] = v50
    v130 = v130.updated(1, v1)
    val v56: Double = v45(0)
    val v104: Vector[Double] = v103(2)
    v51 = v51.updated(0, v56)
    v94 = v94.updated(0, v104)
    var v86: Vector[Double] = v59
    v42 = v42.updated(6, v30)
    v103 = v103.updated(0, v45)
    v28 = v28.updated(1, v11)
    var v126: Vector[Double] = v36
    v99 = v99.updated(0, v32)
    v86 = v86.updated(0, v65)
    val v174: Double = v86(0)
    v28 = v126
    v18 = v130
    v103 = v43
    v18 = v18.updated(1, v15)
    v94 = v94.updated(2, v33)
    v103 = v103.updated(1, v39)
    v174
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    var v29: Double = v1
    val v27: Double = f78(v29)
    val v33: Double = f78(v27)
    var v43: Double = v33
    v43
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}