  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f88(_ v0: s0) -> s0 {
    var v2: s0 = v0
    v2 = v0
    var v7: s0 = v0
    var v4: s0 = v2
    let v6: [[Double]] = v7.p0
    let v3: [Double] = v6[1]
    v7 = v4
    var v8: [[Double]] = v6
    v8[0] = v3
    let v5: [Double] = v8[0]
    var v16: [Double] = v5
    let v14: [Double] = v8[1]
    let v12: Double = v16[0]
    let v10: [[Double]] = v4.p1
    v16[0] = v12
    v4 = v2
    let v13: Double = v14[0]
    let v49: [[Double]] = v4.p0
    let v20: [Double] = v6[0]
    let v19: [[Double]] = v7.p1
    v4.p1 = v19
    var v21: [[Double]] = v49
    let v36: [s0] = [v0]
    v8[0] = v14
    v21 = v6
    var v59: Double = v13
    var v34: s0 = v4
    v16[0] = v59
    let v105: [[Double]] = v34.p0
    var v61: s0 = v7
    let v64: [[Double]] = v61.p0
    v8[0] = v20
    let v56: s0 = s0(p0: v64, p1: v10)
    v7 = v56
    v21[0] = v5
    v34.p0 = v21
    v8[0] = v16
    v34.p0 = v105
    v2.p0 = v8
    var v77: [s0] = v36
    let v74: s0 = v77[0]
    v61 = v74
    return v34
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v4: s0 = f88(v0)
    let v2: [[Double]] = v4.p0
    var v14: Double = v1
    let v17: [Double] = v2[0]
    let v23: Double = v17[0]
    let v22: Double = v14 - v14
    let v28: Double = v22 * v23
    return v28
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0]])
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
