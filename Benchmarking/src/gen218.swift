  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f27(_ v0: s0) -> s0 {
    let v5: [s0] = [v0, v0, v0, v0, v0]
    let v3: s0 = v5[4]
    var v2: s0 = v3
    let v1: s0 = v5[0]
    let v10: [[Double]] = v1.p1
    v2.p1 = v10
    var v9: [[Double]] = v10
    v2.p1 = v9
    return v2
  }
  func f26(_ v0: s0, _ v1: s0) -> s0 {
    let v3: s0 = f27(v1)
    let v4: [[Double]] = v1.p1
    let v7: [Double] = v4[1]
    var v6: [[Double]] = v4
    let v5: s0 = f27(v3)
    v6[1] = v7
    var v17: s0 = v5
    v17.p1 = v4
    let v25: [[Double]] = v5.p1
    var v16: [[Double]] = v6
    v17.p1 = v16
    let v73: s0 = f27(v17)
    v17.p1 = v25
    return v73
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v4: s0 = v0[0]
    let v3: s0 = v0[0]
    let v6: [[Double]] = v4.p1
    let v9: [[Double]] = v3.p1
    let v13: s0 = v0[0]
    let v11: s0 = f26(v13, v4)
    let v23: [[Double]] = v11.p1
    var v19: [[Double]] = v23
    let v30: [[Double]] = v3.p0
    var v35: [[Double]] = v23
    v35 = v6
    v19 = v35
    let v21: [Double] = v30[0]
    v19[0] = v21
    v19[0] = v21
    v19[0] = v21
    let v86: [Double] = v19[1]
    v35 = v9
    let v54: [Double] = v6[1]
    let v53: Double = v21[0]
    let v66: Double = v86[0]
    let v87: Double = v53 * v66
    var v62: [Double] = v54
    v19[1] = v62
    return v87
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0]])]
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
