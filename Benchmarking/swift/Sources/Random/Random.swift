public struct Random {
  var seed: Int

  public init() {
    seed = 74755
  }

  public mutating func next() -> Int {
    seed = ((seed * 1309) + 13849) & 65535
    return seed
  }
}
