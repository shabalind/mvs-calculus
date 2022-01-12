import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double,
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: s0
  )
  case class s4 (
    p0: Vector[s1],
    p1: Vector[s0],
    p2: Vector[Vector[s0]]
  )
  case class s11 (
    p0: Vector[s0],
    p1: s3
  )
  def f5(v0: s4): s4 = {
    var v3: s4 = v0
    val v7: Vector[s1] = v0.p0
    var v5: s4 = v3
    var v2: Vector[s1] = v7
    v3 = v3.copy(p0 = v2)
    val v8: Vector[Vector[s0]] = v0.p2
    var v4: Vector[s1] = v7
    var v9: Vector[Vector[s0]] = v8
    val v6: Vector[s1] = v3.p0
    val v11: Vector[s1] = v5.p0
    val v13: Vector[Vector[s0]] = v5.p2
    val v18: s1 = v6(0)
    val v15: Vector[s0] = v13(1)
    v9 = v9.updated(1, v15)
    v2 = v2.updated(0, v18)
    val v28: s1 = v11(0)
    v2 = v2.updated(0, v28)
    v3 = v3.copy(p2 = v8)
    v5 = v5.copy(p0 = v7)
    v3 = v3.copy(p2 = v9)
    var v50: s4 = v5
    v50 = v50.copy(p0 = v4)
    v50
  }
  @noinline
  def f0(v0: Vector[s4], v1: Vector[Vector[s11]], v2: Double): Double = {
    val v5: s4 = v0(0)
    val v3: Vector[s1] = v5.p0
    var v10: Vector[s4] = v0
    var v4: Vector[s4] = v10
    val v7: s4 = f5(v5)
    val v8: s4 = f5(v7)
    var v12: Vector[s1] = v3
    v4 = v4.updated(2, v5)
    val v30: s4 = f5(v8)
    v4 = v4.updated(1, v30)
    var v17: Vector[s4] = v4
    val v21: s4 = v17(2)
    v17 = v17.updated(1, v30)
    val v18: s4 = f5(v7)
    val v24: s4 = f5(v18)
    val v36: Vector[s1] = v21.p0
    v17 = v0
    v10 = v10.updated(2, v30)
    val v44: s4 = f5(v24)
    val v26: s1 = v36(0)
    val v38: Vector[Vector[s1]] = Vector(v12, v36, v12, v36, v12, v36)
    val v79: Vector[s1] = v38(4)
    v4 = v4.updated(2, v44)
    v4 = v4.updated(1, v21)
    v10 = v10.updated(2, v8)
    val v101: s1 = v79(0)
    val v244: Double = v26.p0
    val v198: Double = v101.p0
    var v155: s1 = v26
    val v127: Double = v198 - v244
    v12 = v12.updated(0, v155)
    v127
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(s1(0.0, s0(Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0))))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0)))), Vector(Vector(s0(Vector(Vector(7.0), Vector(8.0)), Vector(Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0)))))), s4(Vector(s1(13.0, s0(Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0))))), Vector(s0(Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0)))), Vector(s0(Vector(Vector(23.0), Vector(24.0)), Vector(Vector(25.0)))))), s4(Vector(s1(26.0, s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), Vector(Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)))))))
    val v1: Vector[Vector[s11]] = Vector(Vector(s11(Vector(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))), s3(Vector(s1(45.0, s0(Vector(Vector(46.0), Vector(47.0)), Vector(Vector(48.0))))), s0(Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))))), Vector(s11(Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0)))), s3(Vector(s1(58.0, s0(Vector(Vector(59.0), Vector(60.0)), Vector(Vector(61.0))))), s0(Vector(Vector(62.0), Vector(63.0)), Vector(Vector(64.0)))))), Vector(s11(Vector(s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0)))), s3(Vector(s1(71.0, s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0))))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0)))))))
    val v2: Double = 78.0
    val start = nanoTime()
    var result: Double = 78.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}