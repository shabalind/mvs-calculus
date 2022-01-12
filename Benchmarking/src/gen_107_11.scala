import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[s1],
    p1: s1
  )
  def f46(v0: s1): s1 = {
    val v7: Vector[Vector[s0]] = v0.p0
    val v1: Vector[Vector[Vector[s0]]] = Vector(v7, v7, v7, v7)
    val v2: Vector[Vector[Vector[Vector[s0]]]] = Vector(v1, v1, v1, v1, v1, v1)
    val v5: Vector[Vector[s0]] = v0.p0
    var v6: s1 = v0
    var v8: s1 = v6
    val v4: Vector[Vector[s0]] = v6.p1
    var v10: Vector[Vector[s0]] = v4
    var v14: Vector[Vector[Vector[s0]]] = v1
    val v3: Vector[Vector[Vector[s0]]] = v2(4)
    val v9: Vector[Vector[s0]] = v8.p1
    var v20: Vector[Vector[Vector[Vector[s0]]]] = v2
    v20 = v20.updated(3, v3)
    var v12: Vector[Vector[s0]] = v5
    val v11: Vector[Vector[Vector[s0]]] = v20(1)
    v20 = v20.updated(5, v14)
    v20 = v20.updated(0, v14)
    v6 = v6.copy(p0 = v5)
    val v18: Vector[Vector[s0]] = v8.p0
    val v16: Vector[Vector[s0]] = v6.p0
    val v13: Vector[s0] = v10(2)
    val v23: s0 = v13(0)
    v14 = v14.updated(1, v9)
    v10 = v10.updated(0, v13)
    val v30: s0 = v13(0)
    v8 = v8.copy(p0 = v10)
    v8 = v8.copy(p1 = v7)
    val v46: Vector[Vector[s0]] = v11(3)
    val v15: Vector[Vector[s0]] = v0.p0
    val v26: Vector[Vector[s0]] = v6.p1
    v14 = v14.updated(0, v18)
    v6 = v6.copy(p0 = v15)
    val v21: Vector[s0] = v10(2)
    val v25: Vector[Vector[s0]] = v8.p0
    v6 = v6.copy(p1 = v16)
    var v29: Vector[Vector[Vector[s0]]] = v11
    v8 = v8.copy(p1 = v26)
    var v57: s1 = v0
    var v48: Vector[s0] = v13
    v10 = v10.updated(2, v13)
    val v68: Vector[Vector[s0]] = v8.p0
    var v51: s1 = v6
    v20 = v20.updated(2, v29)
    val v37: Vector[Vector[s0]] = v8.p1
    v29 = v29.updated(2, v18)
    val v45: Vector[Vector[s0]] = v51.p0
    v57 = v57.copy(p1 = v46)
    val v53: Vector[Vector[s0]] = v51.p0
    val v36: Vector[Vector[s0]] = v0.p1
    v29 = v29.updated(2, v12)
    var v84: Vector[s0] = v21
    v8 = v8.copy(p0 = v37)
    v12 = v12.updated(1, v48)
    v57 = v57.copy(p0 = v45)
    val v61: Vector[Vector[s0]] = v51.p1
    v6 = v6.copy(p0 = v53)
    v6 = v6.copy(p1 = v10)
    v8 = v8.copy(p1 = v4)
    v20 = v20.updated(4, v3)
    v84 = v48
    v84 = v84.updated(0, v30)
    val v54: Vector[Vector[s0]] = v51.p0
    v8 = v8.copy(p0 = v9)
    v8 = v8.copy(p0 = v18)
    v20 = v2
    v51 = v51.copy(p0 = v15)
    v29 = v29.updated(0, v36)
    val v157: Vector[s0] = v53(0)
    v6 = v6.copy(p1 = v15)
    var v113: s1 = v6
    v12 = v54
    v10 = v10.updated(0, v157)
    v113 = v113.copy(p0 = v25)
    v57 = v57.copy(p0 = v7)
    v12 = v12.updated(1, v84)
    v57 = v57.copy(p0 = v61)
    v84 = v84.updated(0, v23)
    val v102: Vector[Vector[s0]] = v113.p1
    v6 = v6.copy(p1 = v9)
    v51 = v113
    v51 = v51.copy(p1 = v54)
    v113 = v113.copy(p0 = v102)
    v57 = v57.copy(p1 = v68)
    v57
  }
  def f29(v0: s3): s3 = {
    var v1: s3 = v0
    val v6: s1 = v1.p1
    val v5: s1 = f46(v6)
    val v7: Vector[s1] = v0.p0
    v1 = v1.copy(p0 = v7)
    var v2: s3 = v0
    val v10: Vector[s1] = v2.p0
    var v16: Vector[s1] = v10
    val v9: Vector[Vector[s1]] = Vector(v16)
    v16 = v16.updated(0, v6)
    var v4: s1 = v5
    v16 = v16.updated(0, v4)
    val v17: Vector[s1] = v9(0)
    val v21: s1 = f46(v5)
    v16 = v16.updated(0, v6)
    val v15: Vector[s1] = v1.p0
    val v26: Vector[Vector[s0]] = v21.p1
    v4 = v4.copy(p1 = v26)
    val v41: Vector[Vector[s0]] = v4.p1
    val v22: s1 = f46(v6)
    v1 = v1.copy(p0 = v10)
    val v25: s1 = f46(v6)
    val v40: Vector[Vector[s0]] = v25.p0
    var v62: Vector[Vector[s0]] = v40
    v2 = v2.copy(p1 = v4)
    val v109: Vector[s1] = v9(0)
    v4 = v4.copy(p1 = v26)
    v4 = v4.copy(p0 = v41)
    val v66: s1 = v109(1)
    v16 = v16.updated(1, v22)
    var v68: s3 = v2
    v4 = v4.copy(p1 = v62)
    v1 = v1.copy(p1 = v4)
    val v84: Vector[Vector[s0]] = v25.p0
    v68 = v68.copy(p0 = v17)
    v4 = v4.copy(p1 = v84)
    v1 = v1.copy(p0 = v15)
    var v123: s3 = v68
    v68 = v68.copy(p1 = v66)
    v123
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v6: s3 = f29(v0)
    val v7: s1 = v6.p1
    val v22: Vector[Vector[s0]] = v7.p0
    var v20: Double = v1
    val v38: Vector[s0] = v22(1)
    val v82: s0 = v38(0)
    val v101: Vector[Vector[Double]] = v82.p1
    val v91: Vector[Double] = v101(2)
    val v85: Double = v91(0)
    val v132: Double = v85 + v20
    v132
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))), Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))), s1(Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))), Vector(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))))), Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))), Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0)))), Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))), s1(Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))), Vector(s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)))), Vector(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))))), Vector(Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0)))), Vector(s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))))))
    val v1: Double = 90.0
    val start = nanoTime()
    var result: Double = 90.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}