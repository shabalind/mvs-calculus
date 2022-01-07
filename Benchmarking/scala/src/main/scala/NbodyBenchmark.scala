/* The Computer Language Benchmarks Game
 * http://shootout.alioth.debian.org/
 *
 * Based on nbody.java and adapted basde on the SOM version.
 */
package nbody

import scala.{Double, Boolean}
import java.lang.String
import scala.Predef.augmentString

object NbodyBenchmark { 
  def run(n: Int): Int = {
    val system = new NBodySystem()

    var i = 0
    while (i < n) {
      system.advance(0.01)
      i += 1
    }

    (system.energy() * 100000).toInt
  }

  def main(args: Array[String]): Unit =
    benchmark.Benchmark(args)(run) 
}
