import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s3 (
    p0: Vector[Vector[s2]]
  )
  case class s4 (
    p0: s0
  )
  case class s5 (
    p0: s0,
    p1: s4
  )
  case class s7 (
    p0: Double,
    p1: s1
  )
  case class s8 (
    p0: Vector[Vector[s4]],
    p1: s3
  )
  def f95(v0: s0): s0 = {
    v0
  }
  def f60(v0: s1, v1: s1): s1 = {
    val v7: s0 = v1.p0
    var v6: s1 = v1
    var v4: s1 = v6
    v6 = v6.copy(p0 = v7)
    var v2: s1 = v6
    val v8: s0 = f95(v7)
    v4 = v4.copy(p0 = v8)
    v6 = v6.copy(p1 = v7)
    val v14: s0 = v2.p0
    v4 = v4.copy(p1 = v14)
    v2 = v2.copy(p1 = v8)
    val v21: s0 = f95(v7)
    val v25: s0 = f95(v21)
    val v48: s0 = v2.p1
    var v29: s1 = v4
    val v65: Vector[s1] = Vector(v6, v1, v29, v29, v2)
    val v94: s1 = v65(4)
    var v40: Vector[s1] = v65
    val v56: s1 = v40(3)
    val v68: s0 = v94.p1
    var v79: s1 = v0
    v79 = v56
    v6 = v6.copy(p1 = v68)
    v2 = v2.copy(p0 = v48)
    v29 = v29.copy(p0 = v25)
    v79
  }
  def f54(v0: s1): s1 = {
    val v7: s1 = f60(v0, v0)
    val v6: s1 = f60(v0, v0)
    val v10: s1 = f60(v0, v7)
    val v41: s1 = f60(v6, v10)
    val v35: s1 = f60(v41, v6)
    var v34: s1 = v35
    v34
  }
  def f36(v0: s0): s0 = {
    val v4: s0 = f95(v0)
    val v61: s0 = f95(v4)
    val v77: s1 = s1(v4, v61)
    val v35: s1 = f54(v77)
    val v50: s1 = f60(v35, v77)
    val v66: s1 = f60(v50, v50)
    val v93: s0 = v66.p1
    v93
  }
  def f18(v0: s1): s1 = {
    val v4: s1 = f54(v0)
    val v7: s0 = v4.p1
    val v3: Vector[Vector[Double]] = v7.p1
    var v1: s1 = v0
    val v6: s0 = f36(v7)
    val v9: s0 = v1.p1
    v1 = v1.copy(p1 = v9)
    var v8: s0 = v6
    val v17: Vector[Double] = v3(0)
    var v13: Vector[Vector[Double]] = v3
    var v12: s0 = v8
    var v33: s1 = v1
    val v16: s0 = f95(v9)
    v12 = v12.copy(p0 = v13)
    v13 = v13.updated(0, v17)
    val v26: s0 = f36(v16)
    v33 = v33.copy(p0 = v12)
    v33 = v33.copy(p1 = v26)
    v33
  }
  @noinline
  def f0(v0: Double, v1: Vector[s5], v2: s2, v3: Vector[Vector[s7]], v4: s7, v5: Vector[s8]): Double = {
    val v8: s0 = v2.p0
    val v9: s0 = f36(v8)
    val v23: s1 = s1(v9, v8)
    val v31: s1 = f18(v23)
    val v43: s0 = v31.p0
    val v66: Vector[Vector[Double]] = v43.p0
    val v89: Vector[Double] = v66(0)
    val v115: Double = v89(0)
    v115
  }
  def benchmark(): Unit = {
    val v0: Double = 0.0
    val v1: Vector[s5] = Vector(s5(s0(Vector(Vector(1.0)), Vector(Vector(2.0))), s4(s0(Vector(Vector(3.0)), Vector(Vector(4.0))))), s5(s0(Vector(Vector(5.0)), Vector(Vector(6.0))), s4(s0(Vector(Vector(7.0)), Vector(Vector(8.0))))), s5(s0(Vector(Vector(9.0)), Vector(Vector(10.0))), s4(s0(Vector(Vector(11.0)), Vector(Vector(12.0))))))
    val v2: s2 = s2(s0(Vector(Vector(13.0)), Vector(Vector(14.0))), Vector(s1(s0(Vector(Vector(15.0)), Vector(Vector(16.0))), s0(Vector(Vector(17.0)), Vector(Vector(18.0)))), s1(s0(Vector(Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0)))), s1(s0(Vector(Vector(23.0)), Vector(Vector(24.0))), s0(Vector(Vector(25.0)), Vector(Vector(26.0))))))
    val v3: Vector[Vector[s7]] = Vector(Vector(s7(27.0, s1(s0(Vector(Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0)))))), Vector(s7(32.0, s1(s0(Vector(Vector(33.0)), Vector(Vector(34.0))), s0(Vector(Vector(35.0)), Vector(Vector(36.0)))))))
    val v4: s7 = s7(37.0, s1(s0(Vector(Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0)))))
    val v5: Vector[s8] = Vector(s8(Vector(Vector(s4(s0(Vector(Vector(42.0)), Vector(Vector(43.0)))))), s3(Vector(Vector(s2(s0(Vector(Vector(44.0)), Vector(Vector(45.0))), Vector(s1(s0(Vector(Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0)))), s1(s0(Vector(Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0)))), s1(s0(Vector(Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0)))))))))))
    val start = nanoTime()
    var result: Double = [StructValue(Name(str='s8', ty=None), [[[StructValue(Name(str='s4', ty=None), [StructValue(Name(str='s0', ty=None), [[[42.0]], [[43.0]]])])]], StructValue(Name(str='s3', ty=None), [[[StructValue(Name(str='s2', ty=None), [StructValue(Name(str='s0', ty=None), [[[44.0]], [[45.0]]]), [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[46.0]], [[47.0]]]), StructValue(Name(str='s0', ty=None), [[[48.0]], [[49.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[50.0]], [[51.0]]]), StructValue(Name(str='s0', ty=None), [[[52.0]], [[53.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[54.0]], [[55.0]]]), StructValue(Name(str='s0', ty=None), [[[56.0]], [[57.0]]])])]])]]])])]
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}