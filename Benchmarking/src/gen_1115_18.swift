  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  func f43(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p0
    let v9: [[Double]] = v0.p1
    var v16: s0 = v0
    let v35: [[Double]] = v16.p1
    v16.p0 = v4
    let v14: [[Double]] = v0.p0
    var v24: s0 = v0
    v16.p1 = v9
    let v33: [[Double]] = v24.p0
    v24.p1 = v35
    v24.p1 = v9
    let v54: [[Double]] = v24.p0
    v24.p0 = v14
    v24.p0 = v54
    v24.p0 = v33
    let v95: [[Double]] = v24.p0
    v16.p0 = v95
    return v24
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v7: s1 = v0[0]
    let v5: s0 = v7.p1
    let v2: s0 = f43(v5)
    let v10: [[Double]] = v2.p1
    var v13: Double = v1
    var v12: Double = v13
    let v31: [Double] = v10[0]
    let v27: Double = v31[0]
    let v32: [Double] = v10[0]
    var v16: Double = v13
    let v59: Double = v32[0]
    let v61: [Double] = [v59, v16, v1, v12, v27, v59]
    let v94: Double = v61[4]
    return v94
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])]], p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]]))]
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
