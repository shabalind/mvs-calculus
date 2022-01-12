import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  def f98(v0: Double): Double = {
    var v2: Double = v0
    var v1: Double = v2
    var v10: Double = v1
    var v5: Double = v1
    v5 = v10
    v5
  }
  def f40(v0: Double): Double = {
    val v6: Double = f98(v0)
    var v3: Double = v0
    val v1: Double = f98(v3)
    v3 = v6
    var v4: Double = v0
    v3 = v1
    val v26: Double = f98(v1)
    val v28: Double = f98(v4)
    val v23: Double = f98(v28)
    val v71: Double = v23 * v26
    v71
  }
  def f30(v0: Double): Double = {
    var v2: Double = v0
    val v9: Double = f40(v2)
    var v4: Double = v0
    var v3: Double = v4
    var v18: Double = v4
    val v7: Vector[Double] = Vector(v9)
    val v10: Double = f98(v3)
    var v19: Vector[Double] = v7
    var v30: Vector[Double] = v7
    var v29: Vector[Double] = v30
    v30 = v30.updated(0, v3)
    val v21: Double = f98(v2)
    val v24: Double = f98(v3)
    var v16: Vector[Double] = v19
    val v12: Double = v16(0)
    v30 = v30.updated(0, v21)
    val v34: Double = f40(v10)
    v16 = v16.updated(0, v24)
    var v31: Double = v18
    var v51: Vector[Double] = v16
    val v58: Vector[Vector[Double]] = Vector(v7, v16, v29)
    val v65: Vector[Double] = v58(0)
    v30 = v30.updated(0, v24)
    val v25: Double = v65(0)
    v51 = v51.updated(0, v34)
    var v47: Vector[Double] = v29
    val v40: Double = f40(v31)
    val v38: Double = v51(0)
    v30 = v47
    v47 = v47.updated(0, v38)
    val v48: Double = v51(0)
    val v73: Double = f40(v9)
    v47 = v47.updated(0, v73)
    v30 = v30.updated(0, v40)
    v51 = v51.updated(0, v48)
    v19 = v19.updated(0, v12)
    v25
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v5: Double = v1 - v1
    val v11: Double = f30(v5)
    val v34: Double = v5 + v11
    v34
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))))))
    val v1: Double = 10.0
    val start = nanoTime()
    var result: Double = 10.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}