  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
  }
  func f55(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p2
    let v6: [[Double]] = v0.p0
    let v15: [[Double]] = v0.p4
    var v8: s0 = v0
    v8.p2 = v15
    let v5: [[Double]] = v8.p0
    v8.p2 = v5
    v8.p4 = v4
    let v12: [[Double]] = v8.p3
    let v21: [[Double]] = v0.p3
    v8.p1 = v12
    v8.p2 = v6
    v8.p2 = v15
    let v24: [[Double]] = v8.p3
    var v25: [[Double]] = v21
    let v29: [[Double]] = v8.p4
    v8.p1 = v25
    let v23: [[Double]] = v8.p2
    let v38: [[Double]] = v0.p4
    let v56: s0 = s0(p0: v4, p1: v12, p2: v23, p3: v24, p4: v29)
    v8.p2 = v38
    let v73: [Double] = v5[2]
    v25[0] = v73
    return v56
  }
  func f52(_ v0: s0, _ v1: [[s0]]) -> s0 {
    let v2: [[Double]] = v0.p2
    let v3: s0 = f55(v0)
    let v7: s0 = f55(v3)
    var v8: s0 = v3
    let v16: [[Double]] = v7.p2
    let v9: s0 = f55(v7)
    v8.p0 = v2
    var v11: [[Double]] = v2
    v8.p0 = v16
    let v30: s0 = f55(v8)
    let v15: [[Double]] = v30.p3
    let v18: s0 = f55(v9)
    var v12: [[Double]] = v15
    let v17: [[Double]] = v9.p2
    v8.p4 = v16
    let v29: [Double] = v16[1]
    let v19: [[Double]] = v3.p0
    v8.p1 = v15
    var v20: [[Double]] = v16
    let v36: s0 = f55(v18)
    let v22: [[Double]] = v36.p1
    let v67: s0 = f55(v18)
    let v35: [[Double]] = v30.p2
    v8.p2 = v20
    var v26: [[Double]] = v12
    var v40: [[Double]] = v35
    let v38: s0 = f55(v67)
    v40[1] = v29
    v40[1] = v29
    let v41: s0 = s0(p0: v19, p1: v22, p2: v40, p3: v26, p4: v17)
    v8.p0 = v20
    var v34: s0 = v41
    v8 = v38
    v34.p0 = v2
    var v91: s0 = v34
    let v96: [Double] = v40[0]
    v11[2] = v96
    v91.p0 = v11
    return v91
  }
  func f40(_ v0: s0, _ v1: s0) -> s0 {
    let v3: [[Double]] = v0.p3
    var v5: s0 = v1
    let v2: s0 = f55(v5)
    v5.p3 = v3
    let v7: [[Double]] = v1.p3
    let v21: [[[Double]]] = [v3, v7, v3, v7, v3, v7]
    let v12: [[Double]] = v5.p1
    let v10: [[Double]] = v5.p4
    let v14: [[Double]] = v5.p4
    v5.p3 = v12
    let v16: s0 = f55(v2)
    let v24: [[Double]] = v21[2]
    v5.p0 = v14
    v5.p2 = v10
    v5 = v16
    v5.p1 = v24
    v5.p1 = v7
    var v139: s0 = v16
    return v139
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v2: [s0] = v0[0]
    let v7: s0 = v2[0]
    let v6: s0 = f52(v7, v0)
    let v13: s0 = f40(v7, v6)
    let v14: [[Double]] = v13.p2
    let v19: [Double] = v14[0]
    var v23: [Double] = v19
    let v54: Double = v23[0]
    return v54
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]], p2: [[4.0], [5.0], [6.0]], p3: [[7.0]], p4: [[8.0], [9.0], [10.0]])]]
    let v1: Double = 11.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 11.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
