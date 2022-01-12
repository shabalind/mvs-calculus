import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  case class s4 (
    p0: Vector[s1],
    p1: Vector[s0],
    p2: s3,
    p3: Vector[s3]
  )
  case class s7 (
    p0: Vector[s1],
    p1: s4
  )
  def f32(v0: Double): Double = {
    var v2: Double = v0
    val v7: Double = v2 + v2
    var v5: Double = v0
    var v4: Double = v7
    var v1: Double = v0
    v1 = v5
    var v3: Double = v4
    var v6: Double = v7
    var v15: Double = v5
    val v16: Double = v2 + v2
    val v12: Double = v1 / v16
    var v8: Double = v16
    var v10: Double = v7
    v5 = v6
    var v17: Double = v12
    var v35: Double = v17
    val v18: Vector[Double] = Vector(v2, v15, v3, v10, v8, v35, v4)
    var v40: Vector[Double] = v18
    val v27: Double = v40(0)
    v27
  }
  @noinline
  def f0(v0: Vector[Vector[s7]], v1: Double): Double = {
    val v2: Double = f32(v1)
    val v10: Double = f32(v2)
    val v7: Double = f32(v1)
    var v13: Double = v10
    val v24: Double = f32(v7)
    val v22: Double = v1 * v13
    val v39: Double = f32(v24)
    val v48: Double = v39 + v22
    v48
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s7]] = Vector(Vector(s7(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), 2.0)), Vector(Vector(s0(Vector(Vector(3.0), Vector(4.0)), 5.0)), Vector(s0(Vector(Vector(6.0), Vector(7.0)), 8.0))))), s4(Vector(s1(Vector(s0(Vector(Vector(9.0), Vector(10.0)), 11.0)), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), 14.0)), Vector(s0(Vector(Vector(15.0), Vector(16.0)), 17.0))))), Vector(s0(Vector(Vector(18.0), Vector(19.0)), 20.0), s0(Vector(Vector(21.0), Vector(22.0)), 23.0)), s3(s0(Vector(Vector(24.0), Vector(25.0)), 26.0), s1(Vector(s0(Vector(Vector(27.0), Vector(28.0)), 29.0)), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), 32.0)), Vector(s0(Vector(Vector(33.0), Vector(34.0)), 35.0))))), Vector(s3(s0(Vector(Vector(36.0), Vector(37.0)), 38.0), s1(Vector(s0(Vector(Vector(39.0), Vector(40.0)), 41.0)), Vector(Vector(s0(Vector(Vector(42.0), Vector(43.0)), 44.0)), Vector(s0(Vector(Vector(45.0), Vector(46.0)), 47.0))))), s3(s0(Vector(Vector(48.0), Vector(49.0)), 50.0), s1(Vector(s0(Vector(Vector(51.0), Vector(52.0)), 53.0)), Vector(Vector(s0(Vector(Vector(54.0), Vector(55.0)), 56.0)), Vector(s0(Vector(Vector(57.0), Vector(58.0)), 59.0))))))))), Vector(s7(Vector(s1(Vector(s0(Vector(Vector(60.0), Vector(61.0)), 62.0)), Vector(Vector(s0(Vector(Vector(63.0), Vector(64.0)), 65.0)), Vector(s0(Vector(Vector(66.0), Vector(67.0)), 68.0))))), s4(Vector(s1(Vector(s0(Vector(Vector(69.0), Vector(70.0)), 71.0)), Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0)), 74.0)), Vector(s0(Vector(Vector(75.0), Vector(76.0)), 77.0))))), Vector(s0(Vector(Vector(78.0), Vector(79.0)), 80.0), s0(Vector(Vector(81.0), Vector(82.0)), 83.0)), s3(s0(Vector(Vector(84.0), Vector(85.0)), 86.0), s1(Vector(s0(Vector(Vector(87.0), Vector(88.0)), 89.0)), Vector(Vector(s0(Vector(Vector(90.0), Vector(91.0)), 92.0)), Vector(s0(Vector(Vector(93.0), Vector(94.0)), 95.0))))), Vector(s3(s0(Vector(Vector(96.0), Vector(97.0)), 98.0), s1(Vector(s0(Vector(Vector(99.0), Vector(100.0)), 101.0)), Vector(Vector(s0(Vector(Vector(102.0), Vector(103.0)), 104.0)), Vector(s0(Vector(Vector(105.0), Vector(106.0)), 107.0))))), s3(s0(Vector(Vector(108.0), Vector(109.0)), 110.0), s1(Vector(s0(Vector(Vector(111.0), Vector(112.0)), 113.0)), Vector(Vector(s0(Vector(Vector(114.0), Vector(115.0)), 116.0)), Vector(s0(Vector(Vector(117.0), Vector(118.0)), 119.0))))))))))
    val v1: Double = 120.0
    val start = nanoTime()
    var result: Double = 120.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}