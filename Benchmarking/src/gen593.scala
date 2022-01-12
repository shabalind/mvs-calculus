import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Double,
    p4: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  def f49(v0: Vector[s2], v1: s2): s2 = {
    var v4: Vector[s2] = v0
    var v2: Vector[s2] = v0
    val v11: s2 = v2(0)
    val v3: Vector[s0] = v1.p1
    var v5: s2 = v1
    val v7: Vector[s0] = v1.p1
    val v6: s0 = v7(0)
    val v24: s0 = v7(0)
    val v13: Vector[s0] = v5.p1
    v5 = v5.copy(p1 = v13)
    val v10: Vector[s0] = v1.p1
    var v18: s0 = v6
    val v12: s0 = v7(0)
    val v33: s0 = v5.p0
    val v14: Double = v6.p3
    v18 = v18.copy(p3 = v14)
    var v29: Double = v14
    v5 = v5.copy(p1 = v10)
    var v15: Vector[s0] = v13
    var v49: s2 = v11
    var v21: Double = v14
    val v30: Vector[Double] = Vector(v21, v21, v14, v14, v29, v29, v14)
    var v71: s0 = v18
    val v39: Vector[Vector[Double]] = v12.p4
    val v35: s0 = v49.p0
    v4 = v4.updated(1, v5)
    var v41: Vector[s0] = v3
    var v52: Vector[s0] = v41
    val v86: Double = v30(0)
    v49 = v49.copy(p1 = v41)
    val v19: s0 = v52(1)
    val v31: Double = v21 * v21
    v2 = v2.updated(0, v1)
    v15 = v15.updated(1, v71)
    val v28: s2 = v4(0)
    v5 = v5.copy(p0 = v6)
    var v20: Vector[s0] = v3
    v21 = v31
    v71 = v71.copy(p0 = v39)
    v2 = v2.updated(1, v49)
    v15 = v20
    var v40: Double = v86
    var v53: Vector[Double] = v30
    v71 = v71.copy(p3 = v86)
    var v102: s2 = v5
    val v89: s0 = v13(0)
    var v51: Vector[Double] = v53
    v102 = v102.copy(p0 = v24)
    val v109: Double = v40 / v31
    v5 = v5.copy(p0 = v6)
    val v116: s0 = v10(0)
    val v47: Vector[s2] = Vector(v49, v5, v11, v49, v102, v28, v1)
    v18 = v18.copy(p4 = v39)
    v49 = v49.copy(p0 = v89)
    var v42: Vector[s2] = v47
    v102 = v102.copy(p0 = v33)
    v53 = v53.updated(1, v40)
    v102 = v102.copy(p1 = v41)
    v102 = v102.copy(p0 = v19)
    v49 = v49.copy(p1 = v15)
    val v103: Double = v51(5)
    v71 = v71.copy(p3 = v103)
    v5 = v5.copy(p0 = v116)
    v102 = v102.copy(p1 = v52)
    v5 = v5.copy(p0 = v12)
    v52 = v52.updated(0, v89)
    val v88: Vector[Vector[Double]] = v35.p0
    v18 = v18.copy(p0 = v88)
    v5 = v5.copy(p0 = v89)
    val v97: s2 = v42(5)
    v4 = v4.updated(1, v49)
    v18 = v18.copy(p3 = v109)
    v5 = v5.copy(p1 = v10)
    v53 = v53.updated(6, v103)
    v97
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v6: s2 = v0(0)
    val v3: s2 = f49(v0, v6)
    val v9: s0 = v3.p0
    val v11: Vector[Vector[Double]] = v9.p2
    val v61: Vector[Double] = v11(1)
    val v66: Double = v61(0)
    v66
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)), 7.0, Vector(Vector(8.0))), Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)), 16.0, Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)), 25.0, Vector(Vector(26.0))))), s2(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0), Vector(33.0)), 34.0, Vector(Vector(35.0))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0), Vector(42.0)), 43.0, Vector(Vector(44.0))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)), 52.0, Vector(Vector(53.0))))))
    val v1: Double = 54.0
    val start = nanoTime()
    var result: Double = 54.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}