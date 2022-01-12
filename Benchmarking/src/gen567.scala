import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  def f109(v0: s1): s1 = {
    var v2: s1 = v0
    val v3: Vector[s1] = Vector(v0, v0, v0, v2, v0, v0, v0)
    var v5: s1 = v2
    val v4: s1 = v3(6)
    var v8: Vector[s1] = v3
    v8 = v8.updated(6, v5)
    val v12: s1 = v8(6)
    val v20: s1 = v8(2)
    v8 = v8.updated(1, v0)
    val v14: s1 = v8(5)
    v2 = v20
    v8 = v8.updated(4, v4)
    v8 = v8.updated(3, v12)
    v8 = v8.updated(2, v14)
    val v52: s1 = v8(3)
    var v31: s1 = v52
    v31
  }
  def f102(v0: s1): s1 = {
    val v1: s0 = v0.p0
    var v4: s0 = v1
    val v9: Vector[Vector[Double]] = v4.p0
    val v13: s1 = f109(v0)
    var v18: s1 = v13
    v18 = v18.copy(p0 = v1)
    v4 = v4.copy(p0 = v9)
    val v49: s1 = f109(v18)
    var v28: s0 = v4
    val v76: s1 = f109(v49)
    val v87: s1 = f109(v76)
    val v93: s1 = f109(v76)
    v18 = v87
    v18 = v18.copy(p1 = v28)
    val v128: s1 = f109(v93)
    v128
  }
  def f100(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p0
    var v1: Vector[Vector[Double]] = v7
    val v5: Vector[Double] = v1(1)
    v1 = v1.updated(0, v5)
    val v4: Vector[Vector[Double]] = v0.p0
    var v13: Vector[Vector[Double]] = v1
    val v3: Vector[Vector[Double]] = v0.p0
    var v25: Vector[Vector[Double]] = v4
    val v10: Vector[Double] = v25(0)
    v25 = v25.updated(0, v10)
    val v14: Vector[Double] = v1(0)
    var v11: s0 = v0
    val v29: s1 = s1(v11, v11)
    val v21: Double = v5(0)
    var v9: s1 = v29
    var v26: s0 = v11
    val v15: Vector[Vector[Double]] = v26.p0
    val v17: s1 = f109(v9)
    v26 = v26.copy(p0 = v3)
    val v24: Vector[Vector[Double]] = v0.p0
    v25 = v25.updated(1, v5)
    v9 = v9.copy(p1 = v26)
    v25 = v25.updated(1, v10)
    var v35: s0 = v26
    val v34: Vector[Double] = v15(1)
    v35 = v35.copy(p0 = v3)
    v26 = v26.copy(p0 = v13)
    val v51: s1 = f109(v17)
    val v76: s1 = f102(v51)
    var v37: Vector[Double] = v34
    val v50: s0 = v76.p1
    v13 = v13.updated(0, v34)
    val v70: Vector[Double] = v4(1)
    v13 = v13.updated(1, v10)
    v13 = v13.updated(1, v14)
    v11 = v11.copy(p0 = v13)
    v13 = v13.updated(0, v37)
    v11 = v11.copy(p0 = v24)
    val v203: s1 = f102(v51)
    v9 = v9.copy(p0 = v50)
    var v188: Double = v21
    v37 = v37.updated(0, v188)
    var v145: s0 = v35
    v9 = v9.copy(p0 = v26)
    v25 = v25.updated(0, v70)
    val v177: Vector[Vector[Double]] = v145.p0
    val v190: s0 = v203.p0
    v9 = v9.copy(p1 = v26)
    v13 = v177
    v190
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v7: s0 = f100(v0)
    val v11: Vector[Vector[Double]] = v7.p0
    val v10: Vector[Double] = v11(0)
    val v23: Vector[Double] = v11(1)
    val v33: Double = v10(0)
    val v48: Double = v23(0)
    val v44: Double = v33 / v48
    v44
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)))
    val v1: Double = 2.0
    val start = nanoTime()
    var result: Double = 2.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}