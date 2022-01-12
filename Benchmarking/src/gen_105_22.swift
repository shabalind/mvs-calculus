  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: [s0]
  }
  func f38(_ v0: s1) -> s1 {
    let v4: s0 = v0.p1
    let v1: s0 = v0.p0
    let v11: s0 = v0.p1
    let v6: s0 = v0.p0
    let v7: [[Double]] = v1.p0
    var v12: [[Double]] = v7
    let v15: [Double] = v7[0]
    let v10: [[Double]] = v4.p0
    let v3: s0 = v0.p0
    let v8: [[Double]] = v6.p1
    let v17: [[Double]] = v11.p1
    v12[0] = v15
    v12[0] = v15
    var v9: [[Double]] = v7
    let v19: [Double] = v8[0]
    let v18: [Double] = v8[1]
    let v26: [Double] = v17[2]
    let v16: s0 = v0.p1
    let v21: [[Double]] = v3.p1
    v12[0] = v19
    var v40: [[Double]] = v10
    v40 = v9
    v40[0] = v26
    let v24: [Double] = v7[0]
    v40 = v12
    let v20: [Double] = v21[0]
    v12[0] = v24
    v40[0] = v15
    let v38: [Double] = v17[1]
    v9[0] = v18
    let v33: [Double] = v9[0]
    v9[0] = v20
    var v34: s0 = v16
    v40[0] = v38
    let v59: s1 = s1(p0: v4, p1: v34)
    v34.p1 = v8
    v9[0] = v33
    v34.p0 = v40
    return v59
  }
  func f16(_ v0: s2) -> s2 {
    var v13: s2 = v0
    return v13
  }
  func f6(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v1: s1 = s1(p0: v0, p1: v0)
    let v4: [[Double]] = v5.p0
    var v7: [[Double]] = v4
    let v3: [Double] = v4[0]
    let v12: [Double] = v7[0]
    let v17: s0 = v1.p1
    v7[0] = v3
    let v6: s1 = f38(v1)
    let v13: s1 = f38(v1)
    let v11: s1 = f38(v13)
    let v19: [[Double]] = v0.p1
    v7[0] = v3
    let v25: s1 = f38(v11)
    v5.p0 = v4
    v5.p0 = v4
    let v34: [Double] = v19[2]
    var v27: [[Double]] = v4
    var v33: [[Double]] = v19
    v5.p0 = v27
    var v40: [[Double]] = v33
    v33 = v40
    let v44: s0 = v25.p1
    let v22: s0 = s0(p0: v7, p1: v40)
    let v35: [[Double]] = v44.p0
    let v26: [Double] = v7[0]
    v27[0] = v34
    let v15: [Double] = v40[0]
    v40[0] = v12
    let v51: [[Double]] = v17.p0
    let v70: [Double] = v40[2]
    v5.p0 = v51
    v7[0] = v15
    v7[0] = v70
    v5.p1 = v19
    let v112: s0 = v6.p1
    var v121: s0 = v22
    v5.p0 = v35
    let v83: [[Double]] = v112.p0
    v7[0] = v26
    v5.p0 = v83
    v27 = v83
    return v121
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v3: s2 = v0[1]
    let v6: s2 = f16(v3)
    let v19: [s0] = v6.p0
    let v23: s0 = v19[0]
    let v24: s0 = f6(v23)
    let v52: [[Double]] = v24.p0
    var v56: [[Double]] = v52
    let v86: [Double] = v56[0]
    var v96: [Double] = v86
    let v113: Double = v86[0]
    var v210: Double = v113
    v56[0] = v96
    return v210
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])], p1: [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])]), s2(p0: [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], p1: [s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])]), s2(p0: [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], p1: [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])])]
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
