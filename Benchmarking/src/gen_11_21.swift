  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: Double) -> Double {
    let v4: [[Double]] = v0.p1
    let v14: [Double] = v4[0]
    var v6: [Double] = v14
    var v20: [Double] = v6
    let v23: Double = v6[0]
    let v18: [Double] = v4[0]
    v20[0] = v23
    var v29: [Double] = v18
    let v22: Double = v20[0]
    let v30: Double = v29[0]
    v20[0] = v30
    return v22
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0]])
    let v1: s0 = s0(p0: [[2.0]], p1: [[3.0]])
    let v2: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
