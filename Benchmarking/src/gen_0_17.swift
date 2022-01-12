  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    var v4: Double = v1
    let v12: s0 = v0[0]
    let v8: [[Double]] = v12.p0
    let v18: Double = v1 + v4
    let v17: [Double] = v8[1]
    var v44: Double = v4
    v44 = v18
    let v88: Double = v17[0]
    let v58: Double = v4 - v44
    let v109: Double = v88 + v58
    return v109
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0]])]
    let v1: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
