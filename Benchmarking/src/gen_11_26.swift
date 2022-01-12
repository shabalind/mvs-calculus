  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v3: s0 = v0[2]
    let v14: s0 = v0[0]
    let v8: [[Double]] = v3.p0
    let v29: [Double] = v8[0]
    let v34: [[Double]] = v14.p1
    let v38: Double = v29[0]
    let v28: [Double] = v34[0]
    var v69: [Double] = v28
    v69[0] = v1
    v69[0] = v1
    let v64: [Double] = [v38, v1]
    var v106: [Double] = v69
    let v146: Double = v64[0]
    let v238: Double = v106[0]
    let v196: Double = v238 - v146
    return v196
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]])]
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
