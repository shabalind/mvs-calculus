import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  def f12(v0: Double): Double = {
    var v4: Double = v0
    var v7: Double = v0
    var v6: Double = v7
    var v2: Double = v4
    var v3: Double = v2
    var v1: Double = v7
    var v18: Double = v3
    val v9: Vector[Double] = Vector(v18, v1, v18, v2, v0)
    var v14: Double = v2
    v2 = v1
    val v12: Double = v9(4)
    v3 = v6
    var v5: Vector[Double] = v9
    var v16: Double = v14
    val v10: Double = v5(1)
    v5 = v5.updated(3, v7)
    v5 = v5.updated(3, v14)
    v5 = v5.updated(4, v14)
    v5 = v5.updated(1, v7)
    var v25: Vector[Double] = v5
    var v23: Double = v10
    var v17: Vector[Double] = v25
    var v19: Vector[Double] = v17
    var v33: Vector[Double] = v19
    var v20: Double = v16
    v33 = v33.updated(4, v12)
    var v27: Double = v20
    var v35: Vector[Double] = v19
    var v45: Vector[Double] = v17
    val v36: Vector[Vector[Double]] = Vector(v33, v33, v19, v45, v45, v17)
    val v108: Vector[Double] = v36(4)
    var v75: Vector[Vector[Double]] = v36
    val v186: Vector[Double] = v75(4)
    v25 = v33
    val v61: Double = v35(4)
    val v34: Vector[Double] = v75(1)
    val v42: Vector[Double] = v36(1)
    val v145: Vector[Double] = v36(0)
    val v135: Vector[Vector[Double]] = Vector(v35, v35, v108, v34, v186, v42, v145)
    val v68: Double = v23 * v0
    var v85: Vector[Double] = v17
    var v78: Vector[Vector[Double]] = v135
    v17 = v17.updated(1, v61)
    v78 = v78.updated(2, v33)
    v75 = v75.updated(5, v5)
    var v121: Vector[Vector[Double]] = v78
    v75 = v75.updated(5, v35)
    val v100: Vector[Double] = v121(1)
    v33 = v33.updated(4, v27)
    v35 = v35.updated(3, v4)
    val v98: Double = v100(0)
    var v116: Vector[Vector[Double]] = v135
    v116 = v116.updated(4, v85)
    v25 = v25.updated(1, v4)
    v45 = v45.updated(4, v2)
    v121 = v116
    v33 = v33.updated(4, v68)
    v98
  }
  @noinline
  def f0(v0: s2, v1: Vector[Vector[s1]], v2: Vector[Vector[s1]], v3: Double): Double = {
    val v8: Double = f12(v3)
    val v11: Double = v3 * v8
    val v44: Double = v3 / v3
    val v61: Double = v11 - v3
    val v150: Double = v44 + v61
    v150
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s1(Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))))))
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0)))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0)))))), Vector(s1(Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0)))), Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0)))))))
    val v2: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0))), s0(Vector(Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0))), s0(Vector(Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0)))))))
    val v3: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}