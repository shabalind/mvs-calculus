import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s4 (
    p0: Double,
    p1: s1
  )
  def f55(v0: s0): s0 = {
    var v4: s0 = v0
    val v6: Vector[Vector[Double]] = v4.p0
    var v1: s0 = v4
    v1 = v1.copy(p0 = v6)
    val v10: Vector[Vector[Double]] = v1.p0
    v1 = v4
    val v5: Vector[Vector[Double]] = v4.p1
    val v15: Vector[Vector[Double]] = v1.p0
    v1 = v1.copy(p1 = v5)
    val v24: Vector[s0] = Vector(v0, v0, v1, v1, v1, v1, v1)
    val v23: s0 = v24(6)
    val v25: Vector[Vector[s0]] = Vector(v24)
    val v22: Vector[Vector[Double]] = v0.p0
    v1 = v1.copy(p0 = v22)
    v4 = v4.copy(p1 = v6)
    val v47: Vector[s0] = v25(0)
    v4 = v4.copy(p0 = v6)
    val v34: Vector[Vector[Double]] = v1.p1
    val v68: Vector[Vector[Vector[s0]]] = Vector(v25, v25, v25)
    var v45: Vector[s0] = v47
    var v48: Vector[s0] = v45
    val v33: Vector[Vector[s0]] = v68(0)
    var v43: Vector[Vector[s0]] = v33
    v4 = v4.copy(p1 = v10)
    v1 = v1.copy(p0 = v15)
    var v82: s0 = v23
    v45 = v45.updated(4, v82)
    val v60: Vector[Vector[Double]] = v82.p0
    v43 = v43.updated(0, v48)
    var v93: Vector[Vector[s0]] = v43
    v82 = v82.copy(p0 = v60)
    val v66: Vector[s0] = v93(0)
    v1 = v1.copy(p0 = v34)
    val v89: s0 = v66(1)
    v4 = v4.copy(p0 = v34)
    v89
  }
  def f17(v0: s0): s0 = {
    val v8: s0 = f55(v0)
    val v12: s0 = f55(v8)
    val v13: Vector[s0] = Vector(v12, v12, v0, v0, v12, v8, v12)
    val v22: s0 = v13(1)
    val v18: s0 = v13(1)
    val v50: s0 = v13(4)
    val v21: Vector[s0] = Vector(v12, v0, v50, v22, v18)
    val v83: s0 = v21(1)
    v83
  }
  @noinline
  def f0(v0: s0, v1: s0, v2: s4, v3: s4, v4: Double): Double = {
    val v5: s0 = f17(v0)
    val v8: Double = v2.p0
    val v9: Double = v4 - v8
    val v16: Vector[Vector[Double]] = v5.p1
    val v14: Vector[Double] = v16(2)
    var v69: Vector[Double] = v14
    val v52: Double = v69(0)
    val v137: Double = v52 + v9
    v137
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))
    val v1: s0 = s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))
    val v2: s4 = s4(12.0, s1(Vector(s0(Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0))), s0(Vector(Vector(19.0), Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0), Vector(30.0)))), s0(Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0), Vector(36.0)))))
    val v3: s4 = s4(37.0, s1(Vector(s0(Vector(Vector(38.0), Vector(39.0), Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0), Vector(61.0)))))
    val v4: Double = 62.0
    val start = nanoTime()
    var result: Double = 62.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}