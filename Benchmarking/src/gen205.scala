import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: Vector[Vector[s1]]
  )
  case class s4 (
    p0: s2,
    p1: s2
  )
  case class s5 (
    p0: s3,
    p1: s2
  )
  def f30(v0: s1): s1 = {
    var v3: s1 = v0
    val v4: Vector[s1] = Vector(v0, v3, v3)
    val v6: s1 = v4(1)
    v6
  }
  def f27(v0: s2): s2 = {
    val v4: s1 = v0.p0
    var v5: s1 = v4
    val v8: s1 = v0.p0
    val v2: Vector[Vector[s0]] = v4.p1
    var v1: Vector[Vector[s0]] = v2
    val v6: Vector[Vector[Vector[s0]]] = Vector(v2, v1, v2, v1, v2, v1)
    val v10: s0 = v8.p0
    val v7: Vector[s0] = v1(1)
    var v17: s2 = v0
    var v13: Vector[s0] = v7
    var v21: s0 = v10
    var v12: s2 = v17
    var v18: Vector[Vector[s0]] = v2
    v12 = v12.copy(p0 = v5)
    val v15: Vector[Vector[s0]] = v6(4)
    var v27: Vector[Vector[s0]] = v18
    v18 = v18.updated(0, v13)
    val v16: Vector[s0] = v2(0)
    val v43: s1 = v0.p0
    v5 = v5.copy(p1 = v27)
    val v25: Double = v10.p1
    val v26: s1 = f30(v5)
    val v34: s1 = f30(v26)
    v21 = v21.copy(p1 = v25)
    val v22: s1 = f30(v34)
    v5 = v43
    val v38: s1 = f30(v22)
    var v24: Double = v25
    var v32: s2 = v12
    v18 = v15
    v17 = v17.copy(p0 = v38)
    val v23: s1 = v12.p0
    v18 = v18.updated(0, v16)
    val v28: s1 = f30(v23)
    val v60: s0 = v16(0)
    v5 = v5.copy(p1 = v2)
    val v63: s1 = f30(v8)
    v13 = v13.updated(0, v60)
    v21 = v21.copy(p1 = v24)
    v32 = v32.copy(p0 = v63)
    var v86: s2 = v32
    var v160: s2 = v86
    v5 = v5.copy(p0 = v21)
    v17 = v17.copy(p0 = v28)
    v160
  }
  @noinline
  def f0(v0: Vector[Vector[s4]], v1: Vector[s5], v2: Double): Double = {
    val v7: s5 = v1(0)
    val v3: s2 = v7.p1
    val v18: s2 = f27(v3)
    val v11: s1 = v18.p0
    val v21: s0 = v11.p0
    val v38: Double = v21.p1
    v38
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s4]] = Vector(Vector(s4(s2(s1(s0(Vector(Vector(0.0), Vector(1.0)), 2.0), Vector(Vector(s0(Vector(Vector(3.0), Vector(4.0)), 5.0)), Vector(s0(Vector(Vector(6.0), Vector(7.0)), 8.0))))), s2(s1(s0(Vector(Vector(9.0), Vector(10.0)), 11.0), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), 14.0)), Vector(s0(Vector(Vector(15.0), Vector(16.0)), 17.0))))))), Vector(s4(s2(s1(s0(Vector(Vector(18.0), Vector(19.0)), 20.0), Vector(Vector(s0(Vector(Vector(21.0), Vector(22.0)), 23.0)), Vector(s0(Vector(Vector(24.0), Vector(25.0)), 26.0))))), s2(s1(s0(Vector(Vector(27.0), Vector(28.0)), 29.0), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), 32.0)), Vector(s0(Vector(Vector(33.0), Vector(34.0)), 35.0))))))), Vector(s4(s2(s1(s0(Vector(Vector(36.0), Vector(37.0)), 38.0), Vector(Vector(s0(Vector(Vector(39.0), Vector(40.0)), 41.0)), Vector(s0(Vector(Vector(42.0), Vector(43.0)), 44.0))))), s2(s1(s0(Vector(Vector(45.0), Vector(46.0)), 47.0), Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0)), 50.0)), Vector(s0(Vector(Vector(51.0), Vector(52.0)), 53.0))))))))
    val v1: Vector[s5] = Vector(s5(s3(Vector(Vector(s2(s1(s0(Vector(Vector(54.0), Vector(55.0)), 56.0), Vector(Vector(s0(Vector(Vector(57.0), Vector(58.0)), 59.0)), Vector(s0(Vector(Vector(60.0), Vector(61.0)), 62.0))))))), Vector(Vector(s1(s0(Vector(Vector(63.0), Vector(64.0)), 65.0), Vector(Vector(s0(Vector(Vector(66.0), Vector(67.0)), 68.0)), Vector(s0(Vector(Vector(69.0), Vector(70.0)), 71.0))))), Vector(s1(s0(Vector(Vector(72.0), Vector(73.0)), 74.0), Vector(Vector(s0(Vector(Vector(75.0), Vector(76.0)), 77.0)), Vector(s0(Vector(Vector(78.0), Vector(79.0)), 80.0))))))), s2(s1(s0(Vector(Vector(81.0), Vector(82.0)), 83.0), Vector(Vector(s0(Vector(Vector(84.0), Vector(85.0)), 86.0)), Vector(s0(Vector(Vector(87.0), Vector(88.0)), 89.0)))))))
    val v2: Double = 90.0
    val start = nanoTime()
    var result: Double = 90.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}