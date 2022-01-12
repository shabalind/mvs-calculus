import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s3 (
    p0: s2,
    p1: s1
  )
  def f1(v0: s1, v1: s3, v2: s1): s1 = {
    var v6: s3 = v1
    val v7: Vector[s3] = Vector(v6, v1, v6)
    v6 = v6.copy(p1 = v2)
    val v8: s3 = v7(1)
    val v4: Vector[s3] = Vector(v1)
    val v3: s1 = v8.p1
    val v13: s3 = v4(0)
    val v17: s2 = v13.p0
    val v19: Vector[s1] = v17.p1
    var v100: Vector[s1] = v19
    v100 = v100.updated(0, v3)
    val v138: s1 = v100(0)
    v138
  }
  @noinline
  def f0(v0: Vector[s1], v1: Vector[s2], v2: Double): Double = {
    val v6: s2 = v1(1)
    var v10: Vector[s1] = v0
    val v7: s2 = v1(1)
    var v4: s2 = v6
    val v13: Vector[s1] = v4.p1
    val v12: s1 = v13(1)
    val v8: s1 = v0(0)
    v4 = v4.copy(p1 = v13)
    val v9: Vector[Vector[s0]] = v8.p1
    val v17: Vector[s1] = v7.p1
    val v3: s0 = v8.p0
    v10 = v10.updated(1, v12)
    val v15: s1 = v10(1)
    var v19: s1 = v12
    val v22: Vector[s1] = Vector(v19, v15, v12)
    v4 = v4.copy(p1 = v17)
    v10 = v10.updated(0, v15)
    val v11: s3 = s3(v4, v15)
    v4 = v4.copy(p1 = v17)
    v10 = v10.updated(0, v12)
    v4 = v4.copy(p1 = v22)
    val v24: s1 = v17(2)
    val v14: s1 = v11.p1
    val v16: s1 = f1(v24, v11, v19)
    val v34: s1 = f1(v15, v11, v14)
    v19 = v19.copy(p1 = v9)
    v19 = v19.copy(p2 = v3)
    v10 = v10.updated(1, v34)
    v10 = v10.updated(1, v16)
    val v39: Vector[s0] = v4.p0
    val v73: s1 = f1(v19, v11, v19)
    val v63: s0 = v39(1)
    v10 = v10.updated(1, v73)
    val v98: Vector[Vector[Double]] = v63.p1
    val v101: Vector[Double] = v98(1)
    v19 = v19.copy(p2 = v3)
    val v108: Double = v101(0)
    v108
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), s1(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))))
    val v1: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), Vector(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), Vector(Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0)))), s1(s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), Vector(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))), s1(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), Vector(Vector(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0)))))), s2(Vector(s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0)))), Vector(s1(s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), Vector(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))))), s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0)))), s1(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))), Vector(Vector(s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))), s1(s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0))), Vector(Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))))), s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0)))))))
    val v2: Double = 84.0
    val start = nanoTime()
    var result: Double = 84.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}