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
  def f110(v0: s0): s0 = {
    var v7: s0 = v0
    var v3: s0 = v7
    var v4: s0 = v0
    var v1: s0 = v3
    var v6: s0 = v0
    val v2: Vector[Vector[Double]] = v0.p1
    val v16: Vector[Vector[Double]] = v0.p1
    val v10: Vector[Vector[Double]] = v6.p0
    var v14: s0 = v1
    val v12: s1 = s1(v1, v4)
    val v21: Vector[Vector[Vector[Double]]] = Vector(v10, v10, v10, v10, v10)
    val v43: Vector[Vector[Double]] = v21(4)
    val v18: Vector[Vector[Vector[Double]]] = Vector(v2, v2, v2, v2, v16, v16, v16)
    val v26: Vector[Vector[Double]] = v18(3)
    val v52: Vector[Vector[Double]] = v21(2)
    v1 = v1.copy(p0 = v10)
    var v51: s1 = v12
    var v29: s1 = v51
    v6 = v6.copy(p0 = v43)
    v1 = v1.copy(p0 = v52)
    v51 = v51.copy(p1 = v14)
    v29 = v29.copy(p0 = v0)
    val v85: s0 = v29.p1
    v4 = v4.copy(p1 = v26)
    v85
  }
  def f87(v0: s1): s1 = {
    var v5: s1 = v0
    var v7: s1 = v5
    val v4: s0 = v7.p1
    val v1: Vector[s1] = Vector(v5, v5)
    val v9: s1 = v1(0)
    v5 = v5.copy(p0 = v4)
    v9
  }
  def f60(v0: s0): s0 = {
    var v7: s0 = v0
    val v6: s0 = f110(v0)
    val v3: Vector[Vector[Double]] = v7.p0
    val v4: Vector[Vector[Double]] = v6.p1
    val v1: s0 = f110(v7)
    val v5: s0 = f110(v1)
    v7 = v6
    val v10: s0 = f110(v7)
    val v13: Vector[Vector[Double]] = v5.p0
    var v9: Vector[Vector[Double]] = v4
    val v12: s0 = f110(v10)
    val v11: s0 = f110(v1)
    var v18: Vector[Vector[Double]] = v4
    val v22: Vector[Double] = v18(0)
    v7 = v7.copy(p1 = v18)
    val v14: s0 = f110(v7)
    v7 = v7.copy(p0 = v3)
    var v16: Vector[Double] = v22
    v9 = v4
    v9 = v9.updated(0, v16)
    val v20: Vector[Vector[Double]] = v10.p1
    val v21: s0 = f110(v0)
    val v30: Vector[Double] = v9(0)
    val v23: Vector[Vector[Double]] = v14.p1
    val v71: s0 = f110(v21)
    var v54: Vector[Vector[Double]] = v13
    val v63: Vector[Double] = v23(0)
    v7 = v10
    v7 = v7.copy(p1 = v18)
    v18 = v18.updated(0, v22)
    v18 = v18.updated(0, v30)
    val v33: s0 = f110(v10)
    v18 = v18.updated(0, v63)
    val v50: s1 = s1(v12, v71)
    v7 = v7.copy(p0 = v54)
    var v94: s1 = v50
    val v78: s0 = v94.p0
    val v74: s1 = f87(v94)
    v94 = v94.copy(p0 = v1)
    val v103: s0 = v50.p1
    val v81: s0 = v74.p1
    val v56: Vector[Vector[Double]] = v78.p0
    v94 = v94.copy(p0 = v33)
    v94 = v94.copy(p1 = v103)
    v94 = v94.copy(p0 = v11)
    v7 = v7.copy(p0 = v56)
    var v180: s0 = v81
    v180 = v180.copy(p1 = v20)
    v180
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v7: Vector[s0] = v0(1)
    val v5: s0 = v7(0)
    val v4: s0 = v7(0)
    val v11: s0 = v7(0)
    val v10: s0 = f110(v5)
    val v15: Vector[Vector[Double]] = v11.p0
    var v30: Vector[Vector[Double]] = v15
    val v51: Vector[Vector[Double]] = v11.p1
    val v31: s0 = f60(v4)
    val v32: Vector[Vector[Double]] = v10.p0
    val v60: Vector[Double] = v32(1)
    v30 = v30.updated(0, v60)
    val v36: Vector[Double] = v51(0)
    var v63: Vector[Double] = v36
    val v62: Double = v60(0)
    val v87: Double = v63(0)
    val v252: Vector[Double] = v30(0)
    val v75: Vector[Vector[Double]] = v31.p1
    var v72: Vector[Double] = v252
    val v228: Double = v87 + v62
    val v145: Vector[Double] = v75(0)
    val v83: Double = v72(0)
    v63 = v63.updated(0, v83)
    v30 = v30.updated(0, v145)
    v228
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}