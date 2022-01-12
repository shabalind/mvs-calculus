  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f29(_ v0: s0) -> s0 {
    let v1: [[Double]] = v0.p0
    let v3: [[Double]] = v0.p0
    let v7: s0 = s0(p0: v1)
    var v6: s0 = v0
    let v2: [[Double]] = v6.p0
    var v4: [[Double]] = v1
    let v9: [[Double]] = v6.p0
    var v8: [[Double]] = v1
    v6.p0 = v8
    let v12: [Double] = v4[0]
    v4[0] = v12
    let v5: [Double] = v9[0]
    let v13: Double = v5[0]
    let v30: [Double] = v1[0]
    var v11: s0 = v0
    let v10: [Double] = v8[0]
    let v23: [[Double]] = v6.p0
    v11.p0 = v4
    let v18: Double = v5[0]
    let v16: [[Double]] = v6.p0
    v4[0] = v5
    let v17: [[Double]] = v0.p0
    v6.p0 = v2
    v11.p0 = v1
    v6.p0 = v16
    let v15: [[Double]] = v7.p0
    let v25: Double = v18 / v18
    var v21: [[Double]] = v15
    var v29: [Double] = v30
    let v34: [Double] = v23[0]
    let v20: [Double] = v16[0]
    var v24: s0 = v0
    var v28: [Double] = v10
    v11.p0 = v8
    v24.p0 = v17
    let v22: [[Double]] = v24.p0
    v4 = v9
    v4 = v21
    var v27: [Double] = v29
    var v85: [[Double]] = v17
    let v73: Double = v29[0]
    let v36: [[Double]] = v7.p0
    v28[0] = v25
    let v42: [Double] = v4[0]
    let v53: [[Double]] = v6.p0
    v24.p0 = v22
    let v19: [Double] = v2[0]
    var v52: [[Double]] = v1
    var v64: [[Double]] = v52
    v4[0] = v19
    let v32: [[Double]] = v24.p0
    let v35: Double = v34[0]
    v11.p0 = v21
    v27[0] = v18
    let v49: [[Double]] = v7.p0
    let v122: Double = v28[0]
    v11.p0 = v32
    v28[0] = v122
    let v60: [Double] = v3[0]
    v64[0] = v34
    let v97: Double = v73 - v13
    v11.p0 = v21
    let v55: [[Double]] = [v60]
    v6.p0 = v2
    v6.p0 = v36
    v11.p0 = v49
    let v74: [[Double]] = v6.p0
    let v71: s1 = s1(p0: v24, p1: v11)
    var v125: [[Double]] = v2
    v6.p0 = v125
    let v90: Double = v10[0]
    let v67: s0 = v71.p0
    v125[0] = v42
    let v39: s1 = s1(p0: v24, p1: v7)
    let v46: [[Double]] = v6.p0
    v4[0] = v20
    v24.p0 = v125
    v8[0] = v28
    v6.p0 = v85
    v29[0] = v18
    v85 = v46
    v6.p0 = v55
    v24.p0 = v4
    var v57: s1 = v39
    let v66: [[[Double]]] = [v64, v53, v74, v53, v125, v36, v46]
    v57.p1 = v67
    v57.p1 = v11
    v24.p0 = v4
    let v69: [[Double]] = v66[4]
    v85[0] = v27
    let v151: [Double] = v22[0]
    v29 = v30
    let v96: Double = v90 + v97
    v64[0] = v19
    let v144: s0 = v57.p0
    v52[0] = v151
    v28[0] = v18
    v6.p0 = v69
    v29[0] = v35
    v24.p0 = v36
    v125[0] = v34
    v28[0] = v96
    v57.p0 = v67
    v29[0] = v13
    return v144
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v9: [Double] = [v1, v1]
    var v4: [Double] = v9
    var v7: [Double] = v4
    let v6: s0 = v0[2]
    v4[1] = v1
    let v11: s0 = f29(v6)
    let v5: Double = v7[0]
    v4 = v7
    let v2: [[Double]] = v11.p0
    let v39: [Double] = v2[0]
    v7[1] = v5
    var v18: [Double] = v39
    let v57: Double = v18[0]
    v7[0] = v57
    return v5
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]]), s0(p0: [[1.0]]), s0(p0: [[2.0]])]
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
