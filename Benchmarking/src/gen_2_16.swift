  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s4 {
    var p0: s0
    var p1: s2
    var p2: s0
  }
  func f86(_ v0: s0, _ v1: s0) -> s0 {
    var v5: s0 = v0
    let v3: [[Double]] = v0.p1
    let v4: [Double] = v3[0]
    let v7: [[Double]] = v5.p0
    let v2: [[Double]] = v5.p1
    v5.p1 = v7
    let v13: [[Double]] = v1.p1
    let v10: [Double] = v3[0]
    let v19: [Double] = v3[0]
    let v12: [Double] = v2[0]
    v5.p0 = v3
    var v18: [[Double]] = v13
    let v11: [[Double]] = v0.p0
    var v30: s0 = v5
    v18[0] = v19
    let v21: [Double] = v11[0]
    v18[0] = v19
    let v23: [Double] = v3[0]
    v18[0] = v21
    let v24: [[Double]] = [v10, v21, v4, v23, v12, v23, v4]
    var v35: s0 = v30
    v30.p0 = v18
    let v71: [Double] = v24[1]
    v18[0] = v71
    v35.p1 = v2
    return v35
  }
  func f62(_ v0: s0) -> s0 {
    let v5: s0 = f86(v0, v0)
    let v10: s0 = f86(v5, v5)
    return v10
  }
  func f17(_ v0: s2, _ v1: Double) -> Double {
    var v2: Double = v1
    let v5: s0 = v0.p0
    let v7: s0 = f62(v5)
    let v9: s0 = f86(v5, v7)
    let v6: [[Double]] = v9.p0
    let v12: [Double] = v6[0]
    var v24: [Double] = v12
    v24[0] = v2
    let v25: Double = v24[0]
    v24[0] = v25
    var v55: Double = v25
    let v49: Double = v12[0]
    v24[0] = v49
    return v55
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: [s4], _ v2: Double) -> Double {
    var v55: Double = v2
    let v15: s2 = v0[0]
    let v23: Double = v55 + v2
    let v14: [Double] = [v23, v23, v23]
    var v47: [Double] = v14
    let v16: Double = f17(v15, v23)
    let v42: Double = v47[0]
    v47[2] = v42
    v55 = v23
    v47[2] = v16
    v55 = v42
    let v121: Double = v23 / v42
    v47[2] = v23
    return v121
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: [s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0]])]), s2(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: [s0(p0: [[10.0]], p1: [[11.0]]), s0(p0: [[12.0]], p1: [[13.0]]), s0(p0: [[14.0]], p1: [[15.0]])]), s2(p0: s0(p0: [[16.0]], p1: [[17.0]]), p1: [s0(p0: [[18.0]], p1: [[19.0]]), s0(p0: [[20.0]], p1: [[21.0]]), s0(p0: [[22.0]], p1: [[23.0]])])]
    let v1: [s4] = [s4(p0: s0(p0: [[24.0]], p1: [[25.0]]), p1: s2(p0: s0(p0: [[26.0]], p1: [[27.0]]), p1: [s0(p0: [[28.0]], p1: [[29.0]]), s0(p0: [[30.0]], p1: [[31.0]]), s0(p0: [[32.0]], p1: [[33.0]])]), p2: s0(p0: [[34.0]], p1: [[35.0]]))]
    let v2: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
