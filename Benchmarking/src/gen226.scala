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
  def f12(v0: s0): s0 = {
    var v6: s0 = v0
    val v8: Vector[Vector[Double]] = v6.p1
    val v2: Vector[Vector[Double]] = v0.p0
    val v3: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Vector[Double]] = v6.p0
    val v7: Vector[Double] = v2(1)
    val v1: Vector[Vector[Double]] = v0.p1
    var v12: Vector[Vector[Double]] = v5
    val v16: Vector[Vector[Double]] = v6.p0
    val v11: Vector[Vector[Double]] = v6.p1
    val v13: Vector[Double] = v1(0)
    var v14: Vector[Double] = v7
    val v9: Vector[Vector[Double]] = v6.p0
    v12 = v12.updated(1, v13)
    var v10: s0 = v0
    v10 = v10.copy(p1 = v8)
    var v15: Vector[Vector[Double]] = v3
    val v28: Vector[Double] = v5(0)
    v12 = v16
    v12 = v12.updated(1, v14)
    var v21: Vector[Vector[Double]] = v2
    v10 = v10.copy(p1 = v15)
    v10 = v10.copy(p0 = v9)
    v6 = v6.copy(p1 = v1)
    v12 = v12.updated(1, v28)
    var v35: s0 = v10
    v10 = v10.copy(p0 = v12)
    v35 = v35.copy(p1 = v3)
    v10 = v10.copy(p0 = v21)
    v21 = v21.updated(1, v7)
    val v37: Vector[Vector[Double]] = v35.p0
    v35 = v35.copy(p1 = v11)
    val v54: Vector[Vector[Double]] = v0.p1
    val v36: Vector[Vector[Double]] = v10.p1
    val v109: s0 = s0(v37, v54)
    v35 = v35.copy(p1 = v11)
    v10 = v10.copy(p1 = v36)
    v109
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: s1, v2: Vector[Vector[s1]], v3: s0, v4: Double): Double = {
    val v9: Vector[Vector[Double]] = v3.p0
    val v10: s0 = v1.p0
    var v5: s0 = v3
    val v7: s0 = f12(v5)
    v5 = v5.copy(p0 = v9)
    val v23: Vector[Vector[Double]] = v10.p1
    val v14: s0 = v1.p0
    var v30: s0 = v5
    val v25: Vector[Vector[Double]] = v30.p1
    val v37: Vector[Vector[Double]] = v14.p1
    v5 = v5.copy(p0 = v9)
    val v59: s0 = v1.p0
    v5 = v5.copy(p1 = v37)
    val v41: s0 = s0(v9, v37)
    val v64: Vector[Vector[Double]] = v10.p1
    val v73: Vector[Vector[Double]] = v59.p1
    v5 = v5.copy(p0 = v9)
    val v49: Vector[Vector[Vector[Double]]] = Vector(v73, v23, v37, v23, v23, v64, v73)
    val v67: Vector[Vector[Double]] = v49(2)
    v5 = v7
    var v110: Vector[Vector[Double]] = v37
    v30 = v30.copy(p1 = v67)
    val v173: Vector[Vector[Double]] = v41.p0
    val v235: Vector[Double] = v25(2)
    v110 = v110.updated(0, v235)
    val v231: Double = v235(0)
    v5 = v5.copy(p0 = v173)
    v30 = v30.copy(p0 = v9)
    v5 = v5.copy(p1 = v110)
    v231
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))))
    val v1: s1 = s1(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))))
    val v2: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))))), Vector(s1(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))), Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))))), Vector(s1(s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))), Vector(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0)))))))
    val v3: s0 = s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))
    val v4: Double = 90.0
    val start = nanoTime()
    var result: Double = 90.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}