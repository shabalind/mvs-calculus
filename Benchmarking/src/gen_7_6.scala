import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: s0,
    p3: s0,
    p4: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s5 (
    p0: s0,
    p1: s0
  )
  def f61(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v4: Vector[Double] = v0(1)
    val v3: Double = v4(0)
    var v1: Double = v3
    var v11: Vector[Double] = v4
    val v7: Vector[Double] = v0(1)
    v11 = v11.updated(0, v1)
    v11 = v11.updated(0, v3)
    val v12: Double = v7(0)
    val v10: Vector[Double] = v0(1)
    var v9: Vector[Vector[Double]] = v0
    var v14: Vector[Double] = v10
    v14 = v14.updated(0, v3)
    v11 = v11.updated(0, v12)
    val v29: Vector[Vector[Vector[Double]]] = Vector(v9)
    val v35: s0 = s0(v0)
    val v58: Vector[Vector[Double]] = v35.p0
    var v21: Vector[Vector[Vector[Double]]] = v29
    val v51: Vector[Vector[Double]] = v35.p0
    val v34: s0 = s0(v58)
    val v104: Vector[Vector[Double]] = v34.p0
    val v56: Vector[Vector[Double]] = v35.p0
    v9 = v9.updated(1, v14)
    val v71: Vector[Vector[Double]] = v34.p0
    var v82: Vector[Vector[Vector[Double]]] = v21
    v9 = v9.updated(1, v11)
    var v52: s0 = v35
    val v75: Vector[Vector[Double]] = v52.p0
    val v28: Vector[Vector[Double]] = v34.p0
    val v64: Vector[Vector[Double]] = v34.p0
    v52 = v52.copy(p0 = v75)
    val v95: Vector[Vector[Double]] = v34.p0
    val v114: Vector[s0] = Vector(v52, v52, v34, v52, v34, v52)
    val v93: Vector[Vector[Double]] = v52.p0
    val v91: s0 = v114(4)
    val v132: Vector[Vector[Double]] = v34.p0
    val v118: Vector[Vector[Double]] = v91.p0
    var v76: Vector[Vector[Vector[Double]]] = v29
    v52 = v52.copy(p0 = v28)
    v76 = v76.updated(0, v104)
    val v74: s5 = s5(v91, v35)
    v52 = v52.copy(p0 = v118)
    val v205: s0 = v114(5)
    val v133: Vector[Vector[Double]] = v82(0)
    v14 = v14.updated(0, v3)
    val v213: s0 = v74.p1
    v52 = v52.copy(p0 = v56)
    v21 = v21.updated(0, v64)
    val v137: s0 = v74.p0
    val v149: Vector[Vector[Double]] = v76(0)
    v52 = v52.copy(p0 = v95)
    v52 = v52.copy(p0 = v56)
    v21 = v21.updated(0, v149)
    v52 = v52.copy(p0 = v71)
    v52 = v52.copy(p0 = v133)
    v76 = v76.updated(0, v51)
    v52 = v52.copy(p0 = v132)
    val v240: Vector[Vector[Double]] = v213.p0
    val v83: Vector[Vector[Double]] = v205.p0
    v52 = v52.copy(p0 = v83)
    v82 = v82.updated(0, v93)
    v52 = v52.copy(p0 = v240)
    val v174: Vector[Vector[Double]] = v137.p0
    v174
  }
  def f46(v0: s0, v1: s2): s0 = {
    var v6: s0 = v0
    var v4: s0 = v6
    var v7: s0 = v6
    val v8: Vector[Vector[Double]] = v0.p0
    val v34: Vector[Vector[Double]] = v4.p0
    val v25: Vector[Vector[Double]] = f61(v8)
    val v13: Vector[Vector[Double]] = v6.p0
    v6 = v6.copy(p0 = v25)
    val v14: s5 = s5(v7, v6)
    v6 = v6.copy(p0 = v34)
    v4 = v4.copy(p0 = v8)
    var v46: s5 = v14
    val v39: Vector[Vector[Double]] = f61(v13)
    v6 = v6.copy(p0 = v8)
    val v47: Vector[Vector[Double]] = f61(v39)
    v6 = v6.copy(p0 = v47)
    val v58: s0 = v46.p1
    v58
  }
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Double): Double = {
    val v3: Vector[s2] = v0(2)
    val v7: s2 = v3(0)
    val v9: s1 = v7.p1
    val v10: Vector[s2] = v0(2)
    val v13: s2 = v10(0)
    val v21: s0 = v9.p2
    val v26: s0 = f46(v21, v13)
    val v58: Vector[Vector[Double]] = v26.p0
    val v133: Vector[Double] = v58(1)
    val v103: Double = v133(0)
    v103
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0))))), s1(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0))))))), Vector(s2(s1(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0))))), s1(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0))), s0(Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0))), s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0))), Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0))), s0(Vector(Vector(69.0), Vector(70.0), Vector(71.0))))))), Vector(s2(s1(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0))), s0(Vector(Vector(81.0), Vector(82.0), Vector(83.0))), Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0))), s0(Vector(Vector(87.0), Vector(88.0), Vector(89.0))))), s1(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0))), s0(Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0))), s0(Vector(Vector(99.0), Vector(100.0), Vector(101.0))), Vector(s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0))))))))
    val v1: Double = 108.0
    val start = nanoTime()
    var result: Double = 108.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}