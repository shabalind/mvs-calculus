import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: s0
  )
  case class s7 (
    p0: s3,
    p1: s2
  )
  case class s8 (
    p0: s0,
    p1: Vector[s7]
  )
  def f86(v0: Double): Double = {
    var v1: Double = v0
    var v8: Double = v0
    var v2: Double = v1
    var v5: Double = v0
    var v7: Double = v2
    var v4: Double = v2
    var v6: Double = v0
    val v3: Double = v8 / v8
    v2 = v4
    var v9: Double = v7
    var v11: Double = v9
    var v33: Double = v5
    var v13: Double = v3
    var v12: Double = v8
    var v16: Double = v33
    var v39: Double = v12
    val v29: Vector[Double] = Vector(v7)
    val v10: Double = v29(0)
    val v18: Double = v29(0)
    var v15: Vector[Double] = v29
    val v21: Double = v15(0)
    val v17: Double = v15(0)
    var v32: Double = v21
    var v61: Vector[Double] = v29
    var v26: Vector[Double] = v61
    v15 = v15.updated(0, v2)
    v15 = v15.updated(0, v9)
    val v28: Double = v29(0)
    var v27: Double = v17
    v26 = v26.updated(0, v2)
    v15 = v15.updated(0, v13)
    val v84: Double = v26(0)
    var v69: Vector[Double] = v15
    var v31: Vector[Double] = v69
    var v46: Double = v39
    v31 = v31.updated(0, v4)
    val v54: Double = v15(0)
    val v35: Double = v31(0)
    v26 = v26.updated(0, v32)
    v26 = v26.updated(0, v13)
    val v90: Double = v61(0)
    v69 = v69.updated(0, v18)
    val v119: Double = v84 / v54
    val v42: Double = v10 - v54
    val v44: Double = v61(0)
    v61 = v61.updated(0, v28)
    var v50: Vector[Double] = v69
    v26 = v26.updated(0, v16)
    val v71: Double = v26(0)
    v15 = v15.updated(0, v6)
    var v66: Vector[Double] = v50
    var v68: Vector[Double] = v61
    v39 = v27
    v66 = v66.updated(0, v11)
    val v128: Double = v50(0)
    v15 = v15.updated(0, v21)
    val v41: Vector[Double] = Vector(v46, v90, v119, v42, v44, v6)
    v15 = v15.updated(0, v35)
    v15 = v15.updated(0, v128)
    val v108: Vector[Vector[Double]] = Vector(v41, v41)
    v66 = v66.updated(0, v128)
    var v96: Vector[Vector[Double]] = v108
    var v278: Vector[Vector[Double]] = v96
    v61 = v68
    var v109: Vector[Double] = v41
    var v63: Vector[Double] = v109
    v69 = v69.updated(0, v21)
    val v122: Double = v109(1)
    v26 = v66
    val v215: Vector[Double] = v278(1)
    val v91: Vector[Double] = v96(0)
    val v100: Vector[Double] = v108(1)
    v109 = v91
    val v228: Double = v100(5)
    val v116: Double = v66(0)
    v63 = v215
    v31 = v31.updated(0, v122)
    val v176: Double = v63(3)
    v31 = v31.updated(0, v32)
    v66 = v66.updated(0, v116)
    var v173: Double = v228
    v109 = v109.updated(2, v71)
    v69 = v69.updated(0, v176)
    v173
  }
  @noinline
  def f0(v0: s8, v1: Double): Double = {
    val v2: Double = f86(v1)
    val v6: s0 = v0.p0
    val v11: Vector[Vector[Double]] = v6.p0
    val v12: Double = v1 * v2
    val v4: Double = v1 / v12
    var v15: Double = v4
    v15 = v12
    val v23: Vector[Double] = v11(0)
    var v44: Vector[Vector[Double]] = v11
    val v61: Vector[Double] = v44(0)
    v44 = v44.updated(1, v61)
    val v50: Double = v61(0)
    val v31: Vector[Vector[Double]] = v6.p0
    val v30: Vector[Double] = v31(1)
    v44 = v44.updated(1, v23)
    var v42: Double = v15
    val v89: Double = v1 / v42
    v44 = v44.updated(0, v30)
    v42 = v50
    v89
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(s7(s3(s1(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), s2(Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))))))
    val v1: Double = 40.0
    val start = nanoTime()
    var result: Double = 40.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}