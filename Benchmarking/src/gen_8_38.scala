import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Double,
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[s0],
    p1: s2
  )
  case class s9 (
    p0: Double,
    p1: Vector[s4]
  )
  case class s12 (
    p0: s0,
    p1: s4
  )
  def f119(v0: s4): s4 = {
    var v1: s4 = v0
    var v6: s4 = v0
    val v7: s2 = v6.p1
    var v2: s2 = v7
    var v4: s2 = v7
    var v8: s4 = v1
    val v3: Vector[s0] = v4.p1
    var v10: Vector[s0] = v3
    val v11: Vector[s0] = v4.p1
    val v5: Double = v4.p0
    val v12: s0 = v3(1)
    v6 = v6.copy(p1 = v2)
    val v16: s2 = v8.p1
    v4 = v2
    v4 = v7
    v2 = v2.copy(p0 = v5)
    v6 = v6.copy(p1 = v4)
    val v43: Vector[s0] = v16.p1
    v8 = v8.copy(p1 = v2)
    v8 = v8.copy(p1 = v4)
    val v34: Double = v4.p0
    v10 = v11
    val v24: s0 = v43(0)
    v1 = v1.copy(p1 = v16)
    v10 = v10.updated(0, v12)
    v4 = v4.copy(p1 = v3)
    v2 = v2.copy(p1 = v3)
    v4 = v4.copy(p1 = v10)
    v4 = v4.copy(p1 = v10)
    var v37: s4 = v0
    v4 = v4.copy(p0 = v34)
    v37 = v37.copy(p1 = v7)
    v10 = v10.updated(1, v24)
    val v203: s12 = s12(v24, v37)
    val v129: s4 = v203.p1
    v10 = v10.updated(1, v24)
    v2 = v2.copy(p0 = v34)
    v1 = v1.copy(p1 = v7)
    v129
  }
  def f109(v0: Vector[s4]): Vector[s4] = {
    val v2: s4 = v0(0)
    val v6: s4 = f119(v2)
    val v8: s4 = f119(v6)
    val v1: s4 = v0(0)
    val v10: s4 = f119(v1)
    var v9: Vector[s4] = v0
    v9 = v9.updated(0, v2)
    val v26: s4 = f119(v1)
    var v23: Vector[s4] = v0
    v9 = v9.updated(0, v8)
    v9 = v9.updated(0, v26)
    val v87: s4 = f119(v10)
    var v121: Vector[s4] = v9
    v23 = v23.updated(0, v87)
    var v78: Vector[s4] = v23
    v23 = v121
    v23 = v23.updated(0, v1)
    v78
  }
  def f75(v0: s9): s9 = {
    var v4: s9 = v0
    var v2: s9 = v4
    val v5: Vector[s4] = v4.p1
    v4 = v2
    val v1: Vector[s4] = f109(v5)
    val v8: Vector[s4] = f109(v5)
    val v6: Double = v2.p0
    val v9: s9 = s9(v6, v8)
    var v11: Vector[s4] = v1
    val v3: Vector[s4] = v4.p1
    val v7: Vector[s4] = f109(v3)
    v4 = v4.copy(p0 = v6)
    val v17: s4 = v11(0)
    val v21: s4 = v5(0)
    v11 = v11.updated(0, v21)
    v11 = v11.updated(0, v17)
    v11 = v11.updated(0, v17)
    v11 = v11.updated(0, v17)
    val v26: s4 = f119(v17)
    var v12: Vector[s4] = v7
    v11 = v11.updated(0, v17)
    val v37: Double = v4.p0
    v12 = v12.updated(0, v26)
    v11 = v11.updated(0, v21)
    v12 = v12.updated(0, v26)
    val v59: s9 = s9(v6, v8)
    var v20: s4 = v17
    val v42: Vector[s4] = f109(v12)
    val v19: s9 = s9(v37, v1)
    var v34: s9 = v9
    val v24: s4 = f119(v20)
    val v46: Vector[s4] = v34.p1
    v4 = v19
    v34 = v34.copy(p1 = v42)
    v4 = v59
    val v54: Vector[s0] = v21.p0
    v2 = v2.copy(p1 = v46)
    val v58: s4 = f119(v24)
    v12 = v12.updated(0, v58)
    v34 = v34.copy(p0 = v37)
    v11 = v11.updated(0, v26)
    val v48: Double = v0.p0
    v4 = v4.copy(p0 = v6)
    v4 = v4.copy(p0 = v48)
    v2 = v2.copy(p1 = v5)
    v20 = v20.copy(p0 = v54)
    v20 = v20.copy(p0 = v54)
    v34
  }
  @noinline
  def f0(v0: s9, v1: Double): Double = {
    val v5: s9 = f75(v0)
    val v11: Vector[s4] = v5.p1
    val v13: Vector[s4] = f109(v11)
    val v18: s4 = v13(0)
    val v20: s2 = v18.p1
    val v44: Double = v20.p0
    var v53: Double = v44
    var v179: Double = v53
    v179
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(0.0, Vector(s4(Vector(s0(Vector(Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), s2(5.0, Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0))))))))
    val v1: Double = 14.0
    val start = nanoTime()
    var result: Double = 14.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}