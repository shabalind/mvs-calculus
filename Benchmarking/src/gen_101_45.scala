import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s1]
  )
  def f51(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    var v2: s0 = v0
    val v4: Vector[Vector[Double]] = v0.p0
    val v3: s0 = s0(v5, v4)
    v2 = v2.copy(p1 = v4)
    val v9: Vector[s0] = Vector(v3, v2)
    val v1: Vector[Vector[Double]] = v3.p0
    val v15: Vector[Vector[Double]] = v0.p1
    val v17: s0 = v9(1)
    v2 = v2.copy(p1 = v4)
    v2 = v2.copy(p0 = v15)
    val v12: Vector[Vector[Double]] = v2.p0
    val v10: s0 = s0(v12, v1)
    var v34: s0 = v0
    v2 = v2.copy(p1 = v4)
    var v28: Vector[s0] = v9
    val v25: Vector[Vector[Double]] = v3.p1
    v28 = v28.updated(1, v2)
    val v18: Vector[Vector[Double]] = v34.p0
    v2 = v2.copy(p1 = v18)
    v28 = v28.updated(0, v3)
    val v23: Vector[Vector[Double]] = v2.p1
    v28 = v28.updated(1, v10)
    val v47: Vector[Vector[Double]] = v34.p1
    v28 = v28.updated(1, v17)
    var v19: s0 = v0
    val v26: s0 = v9(0)
    val v43: Vector[Vector[Double]] = v3.p1
    v2 = v2.copy(p1 = v25)
    var v56: Vector[s0] = v9
    v19 = v19.copy(p1 = v25)
    v56 = v56.updated(0, v26)
    v2 = v2.copy(p0 = v43)
    val v76: Vector[Vector[s0]] = Vector(v28, v56)
    v19 = v19.copy(p1 = v23)
    val v107: Vector[s0] = v76(0)
    v19 = v19.copy(p0 = v47)
    val v100: Vector[Vector[Double]] = v19.p1
    val v110: Vector[Vector[Double]] = v19.p0
    v34 = v34.copy(p0 = v100)
    v56 = v56.updated(1, v26)
    v2 = v2.copy(p1 = v110)
    val v152: s0 = v107(1)
    v152
  }
  def f46(v0: s0): s0 = {
    var v1: s0 = v0
    val v5: s0 = f51(v1)
    val v7: s0 = f51(v1)
    val v3: s0 = f51(v5)
    val v8: Vector[Vector[Double]] = v1.p1
    val v4: Vector[Vector[Double]] = v3.p1
    val v14: Vector[Vector[Double]] = v7.p0
    val v6: Vector[Double] = v14(0)
    var v13: s0 = v0
    val v11: Vector[Double] = v8(0)
    val v15: s0 = f51(v0)
    val v23: Vector[Vector[Double]] = v15.p0
    val v12: Vector[Double] = v8(1)
    v1 = v1.copy(p0 = v14)
    val v10: s0 = f51(v13)
    val v21: s0 = f51(v10)
    var v32: Vector[Vector[Double]] = v23
    val v22: Vector[Vector[Double]] = v10.p1
    v32 = v32.updated(0, v12)
    var v20: Vector[Vector[Double]] = v14
    val v26: Vector[Vector[Vector[Double]]] = Vector(v4, v4, v20)
    val v59: s0 = f51(v3)
    var v30: s0 = v15
    var v46: Vector[Vector[Vector[Double]]] = v26
    var v34: Vector[Vector[Vector[Double]]] = v46
    var v33: Vector[Vector[Vector[Double]]] = v26
    val v63: s0 = f51(v0)
    val v58: s0 = f51(v59)
    val v73: Vector[Vector[Double]] = v34(1)
    var v70: Vector[Vector[Vector[Double]]] = v46
    v34 = v70
    v32 = v32.updated(1, v11)
    v13 = v13.copy(p0 = v73)
    val v66: Vector[Vector[Double]] = v58.p0
    v34 = v34.updated(0, v22)
    val v39: Vector[Vector[Double]] = v33(1)
    val v112: Vector[Vector[Double]] = v33(0)
    val v81: s0 = f51(v21)
    v1 = v1.copy(p0 = v112)
    val v124: Vector[Vector[Double]] = v7.p0
    val v128: s0 = f51(v10)
    val v110: Vector[Vector[Double]] = v63.p1
    v1 = v1.copy(p0 = v20)
    v1 = v1.copy(p0 = v124)
    val v163: Vector[Vector[Double]] = v81.p0
    v30 = v30.copy(p1 = v32)
    v13 = v13.copy(p1 = v163)
    v32 = v32.updated(1, v6)
    val v174: s0 = f51(v128)
    v30 = v30.copy(p1 = v4)
    val v88: Vector[Vector[Double]] = v174.p1
    v20 = v39
    v30 = v30.copy(p1 = v66)
    v1 = v1.copy(p0 = v110)
    v30 = v30.copy(p0 = v88)
    v1 = v1.copy(p0 = v112)
    v30
  }
  def f44(v0: s0): s0 = {
    var v4: s0 = v0
    val v6: Vector[Vector[Double]] = v0.p1
    var v10: Vector[Vector[Double]] = v6
    val v5: Vector[Vector[Double]] = v4.p0
    val v13: s0 = s0(v5, v10)
    v13
  }
  def f21(v0: s0): s0 = {
    val v3: s0 = f44(v0)
    val v1: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Double] = v1(1)
    var v8: Vector[Vector[Double]] = v1
    val v2: Vector[Double] = v1(0)
    var v6: s0 = v3
    val v5: Vector[Vector[Double]] = v0.p0
    val v36: Vector[Vector[Double]] = v0.p0
    var v15: s0 = v3
    val v13: s0 = f44(v15)
    v8 = v8.updated(1, v4)
    v8 = v8.updated(1, v2)
    val v25: Vector[Vector[Double]] = v6.p0
    v6 = v6.copy(p0 = v5)
    v6 = v6.copy(p0 = v5)
    var v27: s0 = v3
    val v30: Vector[Vector[Double]] = v27.p0
    val v40: Vector[Vector[Double]] = v13.p0
    val v66: Vector[Vector[Double]] = v27.p0
    val v60: s0 = f46(v6)
    v27 = v27.copy(p0 = v36)
    v6 = v6.copy(p1 = v66)
    v15 = v15.copy(p0 = v1)
    val v70: Vector[Vector[Double]] = v60.p0
    v6 = v6.copy(p0 = v36)
    v6 = v6.copy(p0 = v8)
    v27 = v27.copy(p1 = v1)
    v15 = v15.copy(p0 = v5)
    v27 = v27.copy(p1 = v25)
    var v191: s0 = v15
    v27 = v27.copy(p0 = v1)
    v27 = v27.copy(p0 = v40)
    v191 = v191.copy(p0 = v30)
    val v394: Vector[Vector[Double]] = v191.p0
    v15 = v15.copy(p0 = v70)
    v15 = v15.copy(p0 = v394)
    v191
  }
  @noinline
  def f0(v0: s0, v1: Vector[Vector[s2]], v2: Double): Double = {
    val v3: Vector[s2] = v1(1)
    val v5: s2 = v3(0)
    val v10: Vector[Vector[Double]] = v0.p1
    var v4: Vector[Vector[Double]] = v10
    val v25: s0 = v5.p0
    val v16: s0 = f51(v25)
    var v12: Vector[Vector[Double]] = v10
    val v9: Vector[Vector[Double]] = v16.p1
    val v17: s0 = f21(v0)
    val v29: Vector[Vector[Double]] = v17.p1
    val v24: Vector[Double] = v12(1)
    var v37: Vector[Vector[Double]] = v4
    val v39: Vector[Double] = v29(0)
    val v55: Vector[Double] = v9(0)
    v37 = v37.updated(1, v39)
    v37 = v37.updated(0, v24)
    v37 = v37.updated(1, v39)
    v12 = v12.updated(0, v55)
    v12 = v12.updated(0, v24)
    val v91: Vector[Double] = v37(1)
    var v152: Vector[Double] = v91
    val v229: Double = v152(0)
    v229
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))
    val v1: Vector[Vector[s2]] = Vector(Vector(s2(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), Vector(s1(Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), s1(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))))))), Vector(s2(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), Vector(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))), s1(Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))), Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))))), Vector(s2(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0))), Vector(s1(Vector(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0)))), Vector(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))))), s1(Vector(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0)))), Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0)))))))))
    val v2: Double = 88.0
    val start = nanoTime()
    var result: Double = 88.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}