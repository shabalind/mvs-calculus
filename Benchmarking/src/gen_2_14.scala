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
    p0: s1,
    p1: s0
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v5: s2 = v0
    val v3: s0 = v5.p1
    v5 = v5.copy(p1 = v3)
    var v6: Double = v1
    var v8: s2 = v5
    var v2: s2 = v0
    var v13: s0 = v3
    v8 = v8.copy(p1 = v3)
    var v10: s0 = v3
    var v9: s2 = v5
    var v18: s2 = v9
    var v12: s0 = v10
    val v11: s1 = v8.p0
    val v16: Vector[Vector[Double]] = v10.p1
    v18 = v18.copy(p1 = v10)
    val v15: Vector[Double] = v16(1)
    val v25: Double = v15(0)
    v8 = v8.copy(p1 = v13)
    val v24: Vector[Double] = v16(1)
    v8 = v8.copy(p1 = v13)
    val v22: Double = v25 / v1
    var v19: Double = v22
    v5 = v5.copy(p1 = v10)
    val v29: Double = v1 / v19
    v8 = v8.copy(p0 = v11)
    val v23: Vector[s1] = Vector(v11, v11, v11, v11)
    val v17: s0 = v11.p1
    v5 = v5.copy(p1 = v13)
    v10 = v17
    val v48: Vector[Vector[Double]] = v17.p0
    val v59: s1 = s1(v10, v12)
    v18 = v18.copy(p0 = v59)
    v2 = v2.copy(p0 = v11)
    val v33: Double = v19 / v6
    var v43: Double = v29
    val v51: s1 = v2.p0
    var v38: Vector[Vector[Double]] = v48
    val v30: Vector[Double] = v48(2)
    v38 = v38.updated(0, v30)
    v38 = v38.updated(1, v15)
    v38 = v38.updated(0, v24)
    v38 = v38.updated(0, v24)
    var v50: Vector[Vector[Double]] = v48
    val v67: s1 = v8.p0
    val v35: Vector[Vector[Vector[Double]]] = Vector(v38, v50, v48, v48, v48, v50, v50)
    var v54: Vector[s1] = v23
    val v95: s1 = v54(2)
    val v98: Vector[Vector[Double]] = v35(0)
    v43 = v33
    v8 = v18
    v5 = v5.copy(p0 = v95)
    v8 = v8.copy(p1 = v10)
    v12 = v12.copy(p0 = v98)
    v54 = v54.updated(2, v67)
    v54 = v54.updated(1, v51)
    v43
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))
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