  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f12(_ v0: s0, _ v1: s0) -> s0 {
    let v6: [[Double]] = v0.p1
    var v9: s0 = v0
    var v3: [[Double]] = v6
    var v8: s0 = v0
    let v4: [Double] = v3[0]
    let v12: [Double] = v6[0]
    var v11: [[Double]] = v3
    let v13: [[Double]] = v0.p1
    let v19: [[Double]] = v0.p0
    let v29: Double = v4[0]
    var v18: s0 = v8
    var v23: [Double] = v12
    let v35: [[Double]] = v9.p1
    v23[0] = v29
    v18.p1 = v11
    v18.p1 = v13
    v18.p1 = v35
    let v26: [[Double]] = v1.p0
    let v20: [[Double]] = v0.p1
    v18.p0 = v26
    v8.p1 = v20
    v8.p1 = v6
    v8.p1 = v13
    v11[0] = v23
    v23[0] = v29
    let v71: [[Double]] = v18.p1
    var v78: [[Double]] = v20
    v9.p1 = v78
    v8.p1 = v71
    v9.p0 = v19
    return v18
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    var v3: Double = v1
    let v8: s0 = f12(v0, v0)
    let v6: [[Double]] = v8.p0
    let v20: [Double] = [v3, v3, v1, v1]
    let v29: Double = v20[0]
    var v18: [Double] = v20
    var v21: [Double] = v18
    v18 = v21
    let v26: [Double] = v6[1]
    let v52: Double = v26[0]
    v18 = v21
    v18[3] = v29
    let v27: Double = v18[0]
    v18[2] = v52
    var v90: Double = v1
    var v66: [Double] = v21
    let v88: Double = v18[1]
    let v59: Double = v90 / v1
    v3 = v88
    v66[1] = v27
    v66[1] = v59
    v21[2] = v3
    v21[0] = v52
    v66 = v21
    let v332: Double = v66[2]
    return v332
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])
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
