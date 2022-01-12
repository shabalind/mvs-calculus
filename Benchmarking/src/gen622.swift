  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  func f66(_ v0: [s0]) -> [s0] {
    var v36: [s0] = v0
    return v36
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v7: [s0] = v0[1]
    var v4: Double = v1
    var v6: Double = v4
    let v2: [s0] = f66(v7)
    let v9: s0 = v2[0]
    let v10: [[Double]] = v9.p0
    let v22: [Double] = v10[0]
    let v48: Double = v22[0]
    let v34: Double = v48 * v6
    return v34
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]])], [s0(p0: [[2.0], [3.0]])]]
    let v1: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
