import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: Vector[s1],
    p1: Vector[s1]
  )
  case class s9 (
    p0: s4,
    p1: Vector[s0]
  )
  def f75(v0: Double): Double = {
    var v3: Double = v0
    var v4: Double = v3
    var v2: Double = v4
    var v7: Double = v3
    var v5: Double = v4
    var v9: Double = v4
    var v1: Double = v0
    var v8: Double = v9
    val v12: Double = v5 + v5
    val v13: Vector[Double] = Vector(v7, v5, v9, v8)
    var v21: Vector[Double] = v13
    v21 = v21.updated(1, v2)
    v3 = v1
    v21 = v21.updated(2, v7)
    v21 = v21.updated(3, v12)
    var v15: Double = v5
    val v17: Double = v13(1)
    var v23: Vector[Double] = v13
    var v42: Vector[Double] = v21
    v23 = v23.updated(0, v17)
    val v32: Double = v13(0)
    v23 = v23.updated(3, v15)
    var v29: Double = v15
    val v50: Double = v13(0)
    var v51: Vector[Double] = v42
    val v35: Vector[Double] = Vector(v32, v50, v1, v5, v4, v1)
    var v48: Vector[Double] = v51
    var v56: Vector[Double] = v35
    v42 = v42.updated(3, v1)
    val v86: Double = v56(1)
    v51 = v51.updated(2, v86)
    v51 = v23
    val v59: Double = v48(0)
    v42 = v42.updated(3, v29)
    v59
  }
  def f26(v0: Double): Double = {
    var v6: Double = v0
    var v3: Double = v0
    val v5: Double = f75(v6)
    val v8: Double = f75(v0)
    val v1: Double = f75(v3)
    val v4: Double = f75(v1)
    var v7: Double = v6
    var v2: Double = v8
    var v9: Double = v2
    val v25: Double = f75(v5)
    var v14: Double = v8
    val v15: Double = f75(v5)
    val v11: Double = f75(v3)
    val v21: Double = f75(v5)
    var v13: Double = v21
    val v10: Double = f75(v8)
    val v19: Double = f75(v9)
    val v23: Double = f75(v0)
    val v26: Double = f75(v11)
    val v31: Double = f75(v26)
    var v27: Double = v25
    val v33: Vector[Double] = Vector(v10, v19, v14, v31, v6, v5, v26)
    var v40: Vector[Double] = v33
    val v55: Double = v27 - v4
    val v38: Double = v33(6)
    var v22: Vector[Double] = v40
    v22 = v22.updated(4, v55)
    var v56: Vector[Double] = v22
    val v103: Double = v56(2)
    v40 = v40.updated(1, v15)
    val v91: Double = v22(4)
    var v36: Vector[Double] = v40
    var v57: Double = v23
    v22 = v22.updated(2, v55)
    val v69: Double = f75(v11)
    var v35: Vector[Double] = v56
    val v45: Double = v36(5)
    var v34: Double = v91
    v56 = v56.updated(0, v3)
    val v47: Vector[Double] = Vector(v0, v57, v25)
    v40 = v40.updated(1, v7)
    var v68: Vector[Double] = v47
    val v42: Double = f75(v69)
    v68 = v68.updated(2, v31)
    v68 = v68.updated(0, v13)
    val v54: Double = v68(0)
    v40 = v40.updated(0, v54)
    v36 = v36.updated(1, v34)
    val v134: Double = v45 / v103
    val v141: Double = f75(v15)
    v36 = v36.updated(1, v141)
    v40 = v35
    val v79: Double = f75(v42)
    val v210: Double = f75(v134)
    v68 = v68.updated(0, v23)
    v68 = v68.updated(2, v79)
    v36 = v35
    v36 = v36.updated(6, v38)
    v210
  }
  @noinline
  def f0(v0: s9, v1: Double): Double = {
    val v6: Double = f26(v1)
    val v113: Double = f75(v6)
    v113
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(s4(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))))), s1(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), Vector(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))))), Vector(s1(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))), Vector(Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))), s1(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)))), Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))))))), Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)))))
    val v1: Double = 88.0
    val start = nanoTime()
    var result: Double = 88.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}