  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f27(_ v0: s0) -> s0 {
    var v2: s0 = v0
    v2 = v0
    let v4: [[Double]] = v2.p0
    let v1: [[Double]] = v2.p1
    v2 = v0
    let v15: [[Double]] = v0.p0
    v2.p0 = v4
    v2.p1 = v1
    let v13: [[Double]] = v2.p0
    v2.p1 = v1
    let v24: [[Double]] = v2.p1
    let v12: [[Double]] = v2.p0
    v2.p1 = v15
    let v34: [[[Double]]] = [v15, v24, v13, v24]
    var v21: s0 = v2
    let v20: [[Double]] = v34[0]
    let v19: [[Double]] = v34[3]
    v21.p0 = v12
    v2.p0 = v20
    let v47: [[Double]] = v21.p1
    var v36: s0 = v21
    v21.p0 = v13
    var v61: [[Double]] = v13
    v21.p1 = v19
    let v57: [[Double]] = v21.p0
    v2.p1 = v1
    let v60: [[Double]] = v36.p1
    let v89: [[Double]] = v21.p0
    var v84: s0 = v36
    v2.p1 = v24
    v84.p0 = v47
    v2.p0 = v57
    v2.p1 = v24
    v21.p0 = v60
    v84.p0 = v61
    v36.p0 = v89
    v21.p1 = v4
    return v84
  }
  func f26(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v7: [[Double]] = v6.p0
    let v13: [[Double]] = v0.p0
    let v12: [[Double]] = v6.p1
    let v21: s0 = f27(v6)
    let v29: s0 = f27(v21)
    let v35: [[Double]] = v29.p1
    let v19: s0 = f27(v6)
    v6.p1 = v35
    var v32: s0 = v19
    v6.p0 = v7
    v32.p1 = v12
    v32.p1 = v13
    return v32
  }
  func f23(_ v0: s0) -> s0 {
    let v17: s0 = f27(v0)
    let v16: s0 = f27(v17)
    let v29: s0 = f26(v16)
    let v31: s0 = f27(v29)
    return v31
  }
  func f19(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p1
    var v3: s0 = v0
    var v1: [[Double]] = v2
    let v7: s0 = f23(v3)
    let v4: [[Double]] = v0.p1
    let v5: [Double] = v1[1]
    v3.p1 = v2
    let v8: [[Double]] = v0.p1
    let v6: s0 = f23(v3)
    let v9: s0 = f26(v6)
    v1[1] = v5
    v1[1] = v5
    let v10: [Double] = v1[1]
    var v13: [Double] = v5
    v3.p0 = v4
    v1[2] = v10
    var v14: [[Double]] = v4
    let v18: s0 = f23(v3)
    let v11: Double = v13[0]
    v14[1] = v13
    var v12: [[Double]] = v14
    let v16: s0 = f23(v9)
    v3.p0 = v12
    let v17: s0 = f27(v18)
    let v25: [[Double]] = v6.p1
    v12[1] = v13
    let v20: [[Double]] = v16.p0
    let v46: [[Double]] = v7.p1
    let v49: s0 = f23(v3)
    let v42: [Double] = v20[1]
    let v35: s0 = f23(v49)
    v12 = v20
    v13[0] = v11
    let v51: [[Double]] = v16.p0
    let v72: s0 = f27(v49)
    let v82: [[Double]] = v6.p1
    v3.p1 = v8
    v14[2] = v5
    let v44: [[Double]] = v17.p1
    v3.p0 = v2
    let v63: [[Double]] = v35.p1
    v3.p0 = v82
    var v95: s0 = v72
    let v66: s0 = f23(v95)
    v95.p0 = v44
    v3.p0 = v25
    v95.p0 = v63
    v12[2] = v42
    let v76: s0 = f27(v66)
    let v321: [[Double]] = v3.p0
    let v137: [[Double]] = v76.p1
    let v112: [Double] = v1[0]
    v12[0] = v112
    v3.p0 = v46
    let v205: s0 = s0(p0: v137, p1: v51)
    v3.p0 = v321
    return v205
  }
  func f15(_ v0: s0) -> s0 {
    let v3: s0 = f27(v0)
    let v4: s0 = f23(v0)
    let v8: s0 = f23(v3)
    let v11: s0 = f23(v8)
    var v15: s0 = v11
    let v22: [[Double]] = v4.p0
    v15.p0 = v22
    return v15
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    var v3: s0 = v0
    let v5: s0 = f15(v0)
    let v4: s0 = f19(v5)
    let v14: [[Double]] = v3.p1
    let v9: [s0] = [v4, v4, v4, v4, v0, v3]
    let v8: [Double] = v14[0]
    var v15: [[Double]] = v14
    let v20: s0 = f19(v3)
    var v30: [[Double]] = v15
    v3.p0 = v15
    var v28: [s0] = v9
    let v38: [Double] = v30[2]
    var v33: [Double] = v38
    let v19: s0 = v28[5]
    let v51: [[Double]] = v19.p1
    v3.p0 = v51
    v30[0] = v8
    let v81: Double = v33[0]
    v28[5] = v20
    v3.p1 = v15
    v3.p0 = v30
    return v81
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])
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
