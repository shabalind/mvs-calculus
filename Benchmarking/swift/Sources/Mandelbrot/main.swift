
func run(size: Int) -> Int {
  var sum: Int     = 0
  var byteAcc: Int = 0
  var bitNum: Int  = 0
  var y: Int       = 0

  while (y < size) {
    let ci: Double = (Double(2 * y) / Double(size)) - 1
    var x: Int     = 0

    while (x < size) {
      var zr: Double   = 0
      var zrzr: Double = 0
      var zi: Double   = 0
      var zizi: Double = 0
      let cr: Double   = (Double(2 * x) / Double(size)) - 1.5

      var z: Int        = 0
      var notDone: Bool = true
      var escape: Int   = 0
      while (notDone && z < 50) {
        zr = zrzr - zizi + cr
        zi = 2.0 * zr * zi + ci

        // preserve recalculation
        zrzr = zr * zr
        zizi = zi * zi

        if (zrzr + zizi > 4.0) {
          notDone = false
          escape = 1
        }
        z += 1
      }

      byteAcc = (byteAcc << 1) + escape
      bitNum += 1

      // Code is very similar for these cases, but using separate blocks
      // ensures we skip the shifting when it's unnecessary, which is most cases.
      if (bitNum == 8) {
        sum ^= byteAcc
        byteAcc = 0
        bitNum = 0
      } else if (x == size - 1) {
        byteAcc <<= (8 - bitNum)
        sum ^= byteAcc
        byteAcc = 0
        bitNum = 0
      }
      x += 1
    }
    y += 1
  }

  return sum
}

// 191
print(500)
