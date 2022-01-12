  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f88(_ v0: s0) -> s0 {
    let v4: [s0] = [v0, v0, v0]
    let v2: s0 = v4[1]
    let v5: s0 = v4[2]
    let v9: [[Double]] = v5.p0
    let v1: [Double] = v9[1]
    let v3: [[Double]] = v5.p0
    var v6: s0 = v5
    var v7: [s0] = v4
    let v17: [[Double]] = v0.p0
    var v22: [[Double]] = v17
    var v21: s0 = v6
    let v12: s0 = v4[0]
    let v11: [Double] = v9[1]
    let v24: [[Double]] = v2.p1
    let v14: [[Double]] = v5.p0
    let v23: [[Double]] = v21.p0
    v6.p1 = v24
    var v50: [Double] = v1
    v21.p0 = v22
    let v35: [[Double]] = v12.p1
    let v33: [[Double]] = v12.p1
    v6.p1 = v24
    v6.p0 = v14
    v21.p1 = v35
    var v47: [[Double]] = v24
    var v45: [s0] = v7
    var v32: [[Double]] = v33
    v7[0] = v6
    let v72: s0 = v45[0]
    let v48: [Double] = v23[0]
    v32 = v33
    let v42: s1 = s1(p0: v2, p1: v21)
    var v62: s1 = v42
    v21.p0 = v3
    v22[0] = v50
    var v77: [[Double]] = v47
    let v36: Double = v48[0]
    var v70: [Double] = v50
    v32[0] = v11
    let v85: s0 = v62.p0
    v22[0] = v70
    var v73: Double = v36
    var v54: [[Double]] = v77
    v21.p1 = v32
    v70[0] = v73
    v6.p1 = v24
    v32[0] = v11
    v47 = v54
    v62.p1 = v85
    v62.p0 = v6
    let v80: s0 = v62.p1
    v6.p1 = v47
    v62.p0 = v21
    v62.p1 = v0
    v62.p1 = v72
    return v80
  }
  func f74(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v4: s0 = f88(v0)
    var v1: s0 = v6
    var v8: s0 = v6
    let v11: s0 = f88(v8)
    let v3: [[Double]] = v4.p0
    var v12: s0 = v1
    let v5: s0 = f88(v4)
    let v9: s0 = f88(v5)
    v12.p0 = v3
    var v10: s0 = v11
    var v18: [[Double]] = v3
    let v21: [Double] = v3[0]
    let v30: [[Double]] = v10.p0
    let v14: [[Double]] = v1.p0
    v6.p0 = v3
    v18[1] = v21
    let v24: [[Double]] = v9.p1
    let v15: [Double] = v24[1]
    let v13: s0 = f88(v10)
    let v23: s0 = f88(v12)
    v18[1] = v15
    v6 = v13
    let v42: [[Double]] = v6.p1
    let v25: [Double] = v42[1]
    let v16: [Double] = v24[0]
    var v20: [[Double]] = v24
    let v29: [Double] = v30[1]
    var v44: [[Double]] = v18
    v18[0] = v29
    v8.p1 = v20
    v44[1] = v16
    v12.p0 = v14
    var v37: [[Double]] = v24
    var v102: [[Double]] = v44
    v8.p1 = v20
    let v38: [[Double]] = v0.p1
    v18[0] = v15
    v6.p0 = v102
    let v87: s0 = f88(v23)
    v102[1] = v15
    var v45: s0 = v87
    v12.p1 = v38
    v12.p1 = v37
    v8.p0 = v18
    v20[0] = v25
    v45.p0 = v18
    return v45
  }
  func f45(_ v0: Double) -> Double {
    var v5: Double = v0
    var v3: Double = v5
    var v2: Double = v5
    var v1: Double = v2
    var v4: Double = v0
    v5 = v1
    var v7: Double = v5
    var v18: Double = v5
    var v9: Double = v18
    var v8: Double = v7
    var v10: Double = v8
    var v13: Double = v4
    var v19: Double = v10
    var v11: Double = v2
    v9 = v1
    let v23: Double = v9 / v5
    var v15: Double = v18
    var v16: Double = v7
    v3 = v16
    v1 = v3
    var v46: Double = v15
    var v36: Double = v19
    let v21: [Double] = [v1, v36, v0]
    let v35: Double = v21[0]
    var v48: [Double] = v21
    let v30: Double = v48[2]
    v48[1] = v4
    var v51: Double = v3
    let v52: [Double] = [v51, v4, v2, v2, v23, v11]
    let v74: [[Double]] = [v52, v52, v52, v52]
    var v71: [[Double]] = v74
    v48[2] = v8
    let v84: [Double] = v71[0]
    let v79: [Double] = v71[2]
    v36 = v35
    var v83: [Double] = v84
    var v55: Double = v13
    var v64: [Double] = v79
    v71[1] = v64
    v4 = v55
    let v95: Double = v83[3]
    v71[0] = v52
    v64[3] = v46
    v64[4] = v30
    return v95
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v3: s0 = v0[0]
    let v6: [[Double]] = v3.p1
    let v5: Double = f45(v1)
    var v4: s0 = v3
    let v2: s0 = f88(v4)
    var v8: Double = v1
    let v7: s0 = v0[0]
    let v12: [[Double]] = v2.p1
    var v9: Double = v1
    let v14: [[Double]] = v7.p1
    v4.p1 = v6
    v4.p1 = v14
    let v13: s0 = v0[1]
    v4.p1 = v12
    var v22: s0 = v13
    let v45: [Double] = v6[2]
    let v24: [[Double]] = v22.p0
    let v29: [Double] = v24[1]
    let v26: s0 = f74(v3)
    let v33: [[Double]] = v3.p1
    v22.p1 = v12
    let v16: Double = v29[0]
    let v34: Double = v45[0]
    let v49: Double = v34 + v8
    let v56: [[Double]] = v26.p0
    let v38: [[Double]] = v4.p0
    let v37: Double = v34 - v49
    v4.p1 = v12
    v4.p0 = v38
    v22.p0 = v56
    v4.p1 = v33
    v8 = v1
    var v76: Double = v1
    let v52: Double = v37 - v49
    let v114: [Double] = [v52, v76, v5, v16, v9, v76]
    var v110: [Double] = v114
    let v98: Double = v110[2]
    return v98
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])]
    let v1: Double = 10.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 10.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
