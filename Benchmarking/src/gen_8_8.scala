import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[Double]],
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s1],
    p1: s2
  )
  def f88(v0: s2): s2 = {
    val v2: Vector[Vector[s0]] = v0.p0
    var v12: s2 = v0
    v12 = v12.copy(p0 = v2)
    var v72: s2 = v12
    v72
  }
  def f86(v0: Vector[Vector[s0]]): Vector[Vector[s0]] = {
    val v5: Vector[s0] = v0(1)
    var v7: Vector[Vector[s0]] = v0
    v7 = v0
    v7 = v7.updated(2, v5)
    var v3: Vector[s0] = v5
    v7 = v7.updated(1, v5)
    v7 = v7.updated(1, v5)
    v7 = v7.updated(0, v5)
    v7 = v7.updated(0, v3)
    v7 = v7.updated(1, v3)
    var v109: Vector[Vector[s0]] = v7
    var v116: Vector[Vector[s0]] = v109
    v116
  }
  def f77(v0: s2): s2 = {
    var v7: s2 = v0
    var v6: s2 = v0
    val v4: Vector[Vector[s0]] = v6.p0
    val v8: Vector[Vector[s0]] = v7.p0
    val v3: Vector[s0] = v4(0)
    v6 = v6.copy(p0 = v8)
    v7 = v7.copy(p0 = v8)
    v7 = v7.copy(p0 = v8)
    val v1: Vector[Vector[s0]] = v6.p0
    val v10: s2 = f88(v6)
    var v9: Vector[s0] = v3
    var v18: s2 = v6
    val v16: Vector[s0] = v18.p1
    v6 = v6.copy(p0 = v1)
    var v22: s2 = v6
    v6 = v10
    var v25: Vector[s0] = v16
    v6 = v6.copy(p1 = v25)
    val v21: s0 = v9(0)
    val v23: Vector[s0] = v18.p1
    v25 = v25.updated(0, v21)
    var v17: Vector[s0] = v16
    v22 = v22.copy(p1 = v23)
    v22 = v22.copy(p1 = v17)
    v22 = v22.copy(p1 = v17)
    v22
  }
  def f63(v0: Vector[Vector[s0]]): Vector[Vector[s0]] = {
    val v6: Vector[Vector[s0]] = f86(v0)
    val v1: Vector[Vector[s0]] = f86(v0)
    val v3: Vector[s0] = v0(2)
    var v11: Vector[Vector[s0]] = v1
    var v12: Vector[s0] = v3
    v11 = v11.updated(2, v12)
    val v17: Vector[Vector[s0]] = f86(v11)
    val v15: Vector[s0] = v6(2)
    v11 = v11.updated(2, v12)
    val v48: Vector[Vector[s0]] = f86(v17)
    val v155: Vector[Vector[s0]] = f86(v48)
    v11 = v11.updated(2, v15)
    v155
  }
  def f52(v0: s2): s2 = {
    var v5: s2 = v0
    val v1: Vector[Vector[s0]] = v0.p0
    var v3: Vector[Vector[s0]] = v1
    val v9: s2 = f77(v5)
    val v6: Vector[s0] = v9.p1
    val v7: s2 = s2(v3, v6)
    var v14: Vector[Vector[s0]] = v1
    val v11: s2 = f77(v7)
    val v16: Vector[Vector[s0]] = f63(v14)
    v5 = v5.copy(p0 = v14)
    v5 = v5.copy(p0 = v16)
    v11
  }
  @noinline
  def f0(v0: s3, v1: Vector[s3], v2: s3, v3: Double): Double = {
    val v5: s2 = v0.p1
    val v4: s2 = f88(v5)
    val v16: s2 = f52(v4)
    val v58: Vector[s0] = v16.p1
    val v46: s0 = v58(1)
    var v40: s0 = v46
    val v18: Vector[Vector[Double]] = v40.p1
    val v31: Vector[Double] = v18(0)
    val v50: Double = v31(0)
    v40 = v46
    v50
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s1(Vector(Vector(0.0), Vector(1.0)), s0(Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s1(Vector(Vector(6.0), Vector(7.0)), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s2(Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))), Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))))))
    val v1: Vector[s3] = Vector(s3(Vector(s1(Vector(Vector(32.0), Vector(33.0)), s0(Vector(Vector(34.0), Vector(35.0), Vector(36.0)), Vector(Vector(37.0)))), s1(Vector(Vector(38.0), Vector(39.0)), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))))), s2(Vector(Vector(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))))), Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0)))))))
    val v2: s3 = s3(Vector(s1(Vector(Vector(64.0), Vector(65.0)), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0)))), s1(Vector(Vector(70.0), Vector(71.0)), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))))), s2(Vector(Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0)))), Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))))), Vector(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))))))
    val v3: Double = 96.0
    val start = nanoTime()
    var result: Double = 96.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}