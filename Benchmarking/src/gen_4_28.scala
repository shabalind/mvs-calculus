import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0],
    p2: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  def f46(v0: Double): Double = {
    var v7: Double = v0
    v7 = v0
    var v1: Double = v0
    val v6: Double = v1 * v1
    val v3: Double = v1 + v7
    var v4: Double = v3
    var v10: Double = v1
    var v13: Double = v10
    var v9: Double = v6
    v13 = v1
    var v11: Double = v4
    val v24: Double = v0 + v13
    val v15: Vector[Double] = Vector(v9)
    val v16: Double = v15(0)
    val v29: Double = v15(0)
    var v39: Vector[Double] = v15
    v39 = v39.updated(0, v4)
    var v48: Vector[Double] = v39
    var v37: Double = v24
    val v38: Double = v48(0)
    v48 = v48.updated(0, v3)
    v4 = v37
    v48 = v48.updated(0, v10)
    v48 = v48.updated(0, v29)
    val v23: Vector[Double] = Vector(v11, v16, v38)
    val v58: Double = v23(2)
    v58
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    var v6: Double = v1
    var v9: Double = v6
    val v8: Double = f46(v1)
    v6 = v8
    var v50: Double = v9
    val v59: Double = v9 * v50
    v59
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), Vector(Vector(s1(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))), Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))))))), s2(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), Vector(Vector(s1(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)))), Vector(Vector(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), Vector(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))))))))
    val v1: Double = 48.0
    val start = nanoTime()
    var result: Double = 48.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}