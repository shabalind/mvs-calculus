import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]],
    p5: Vector[Vector[Double]],
    p6: Vector[Double]
  )
  case class s3 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  def f23(v0: Double): Double = {
    var v7: Double = v0
    var v6: Double = v0
    var v3: Double = v7
    var v4: Double = v3
    val v2: Double = v3 - v4
    val v5: Vector[Double] = Vector(v6)
    var v10: Double = v6
    val v17: Double = v5(0)
    var v12: Vector[Double] = v5
    val v32: Double = v12(0)
    var v14: Vector[Double] = v5
    val v19: Double = v5(0)
    var v22: Vector[Double] = v14
    val v18: Double = v0 * v17
    v22 = v12
    var v71: Vector[Double] = v12
    var v21: Vector[Double] = v5
    v21 = v5
    v71 = v71.updated(0, v0)
    val v41: Double = v71(0)
    val v16: Double = v14(0)
    val v24: Double = v14(0)
    val v23: Double = v71(0)
    var v35: Double = v23
    v12 = v12.updated(0, v17)
    v12 = v12.updated(0, v16)
    v22 = v22.updated(0, v35)
    var v28: Vector[Double] = v14
    var v53: Vector[Double] = v21
    var v47: Vector[Double] = v12
    var v30: Vector[Double] = v28
    var v50: Vector[Double] = v12
    v14 = v14.updated(0, v19)
    v14 = v14.updated(0, v10)
    val v51: Double = v30(0)
    v22 = v22.updated(0, v41)
    val v59: Double = v71(0)
    val v78: Double = v71(0)
    v14 = v50
    var v31: Vector[Double] = v47
    val v95: Double = v28(0)
    v22 = v22.updated(0, v24)
    var v205: Vector[Double] = v28
    var v46: Vector[Double] = v50
    v50 = v50.updated(0, v59)
    v14 = v14.updated(0, v32)
    v14 = v14.updated(0, v51)
    var v55: Double = v78
    val v103: Double = v31(0)
    v47 = v47.updated(0, v95)
    val v44: Vector[Vector[Double]] = Vector(v50, v205, v53, v28)
    val v52: Vector[Double] = v44(0)
    v46 = v46.updated(0, v18)
    v30 = v30.updated(0, v103)
    val v104: Double = v31(0)
    v22 = v22.updated(0, v4)
    v28 = v28.updated(0, v24)
    var v176: Vector[Double] = v52
    v50 = v50.updated(0, v2)
    v21 = v21.updated(0, v104)
    val v278: Double = v46(0)
    v46 = v46.updated(0, v41)
    val v144: Double = v22(0)
    val v141: Double = v176(0)
    var v54: Double = v55
    v53 = v53.updated(0, v278)
    val v215: Double = v22(0)
    v28 = v28.updated(0, v54)
    v47 = v47.updated(0, v144)
    v71 = v71.updated(0, v215)
    v141
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v8: Double = f23(v1)
    val v7: Double = f23(v8)
    var v11: Double = v8
    val v9: Vector[Double] = Vector(v7, v11)
    val v20: Double = v9(1)
    val v38: Double = v7 - v20
    v38
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0)), Vector(15.0, 16.0))), Vector(s0(Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)), Vector(32.0, 33.0))), Vector(s0(Vector(Vector(34.0), Vector(35.0)), Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0)), Vector(49.0, 50.0)))), Vector(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)), Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)), Vector(Vector(65.0)), Vector(66.0, 67.0)), s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)), Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0), Vector(81.0)), Vector(Vector(82.0)), Vector(83.0, 84.0)), s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)), Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0)), Vector(100.0, 101.0))))
    val v1: Double = 102.0
    val start = nanoTime()
    var result: Double = 102.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}