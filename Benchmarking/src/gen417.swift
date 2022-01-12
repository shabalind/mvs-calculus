  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f29(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p0
    var v9: s0 = v0
    let v7: [[Double]] = v0.p1
    v9.p1 = v7
    let v3: [[Double]] = v9.p0
    var v4: [[Double]] = v2
    let v5: [[Double]] = v0.p1
    var v6: [[Double]] = v3
    let v8: s0 = s0(p0: v2, p1: v5)
    v9.p0 = v3
    let v12: [Double] = v2[0]
    let v11: [[Double]] = v0.p0
    let v22: [[Double]] = v8.p0
    let v13: [Double] = v11[0]
    var v15: [Double] = v13
    let v41: s0 = s0(p0: v2, p1: v7)
    let v30: [Double] = v5[0]
    v9.p0 = v4
    v4[0] = v12
    var v23: [[Double]] = v7
    v6[1] = v15
    var v32: [[Double]] = v7
    let v33: [[Double]] = v41.p0
    let v36: s0 = s0(p0: v2, p1: v7)
    let v42: [[Double]] = v0.p1
    let v51: [[Double]] = v41.p1
    let v58: [Double] = v32[1]
    var v50: s0 = v9
    v9.p1 = v5
    v6[0] = v30
    v9.p0 = v11
    v23[1] = v12
    let v59: [[Double]] = v36.p1
    v9.p0 = v6
    v50.p0 = v6
    let v107: [Double] = v22[1]
    let v70: s0 = s0(p0: v22, p1: v32)
    v50.p0 = v3
    v9.p1 = v59
    v9.p1 = v42
    let v119: [[Double]] = v70.p1
    v23[1] = v107
    v9.p0 = v33
    v50.p1 = v23
    let v71: [Double] = v119[0]
    v9.p0 = v33
    v9.p1 = v7
    v9.p1 = v51
    v9.p0 = v33
    v4[1] = v58
    v23[2] = v71
    v9.p1 = v59
    return v50
  }
  func f16(_ v0: Double) -> Double {
    var v3: Double = v0
    var v1: Double = v0
    var v4: Double = v1
    var v2: Double = v3
    let v7: [Double] = [v2, v0, v1, v3, v3]
    let v9: Double = v7[3]
    var v6: [Double] = v7
    var v8: Double = v2
    var v5: [Double] = v7
    let v15: Double = v5[4]
    let v11: Double = v6[4]
    var v18: [Double] = v5
    v6[1] = v9
    var v16: [Double] = v18
    let v14: Double = v16[3]
    var v13: [Double] = v6
    let v20: Double = v7[1]
    let v48: Double = v6[1]
    v6[4] = v20
    let v19: Double = v18[4]
    let v28: Double = v18[0]
    let v33: Double = v13[2]
    var v34: [Double] = v13
    var v29: Double = v15
    var v55: [Double] = v34
    let v38: [Double] = [v0, v14, v11, v33, v4, v19, v14]
    var v43: [Double] = v38
    v6[1] = v8
    let v56: Double = v55[4]
    v34[4] = v48
    v55[4] = v29
    var v47: [Double] = v43
    v47[2] = v56
    v34[2] = v28
    let v91: Double = v47[6]
    v5[1] = v28
    return v91
  }
  func f6(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p1
    let v4: s0 = f29(v0)
    let v2: s0 = f29(v4)
    let v3: [[Double]] = v2.p1
    let v24: [[Double]] = v4.p1
    var v21: s0 = v4
    let v34: [[Double]] = v21.p0
    let v19: [[Double]] = v2.p0
    let v47: s0 = s0(p0: v19, p1: v24)
    v21.p1 = v3
    let v46: [[Double]] = v47.p0
    let v26: s0 = f29(v47)
    v21.p0 = v46
    v21.p1 = v5
    v21 = v26
    var v40: s0 = v0
    let v32: [[Double]] = v26.p1
    v40.p1 = v5
    var v61: s0 = v40
    v61.p1 = v32
    v40.p0 = v34
    return v61
  }
  func f5(_ v0: Double) -> Double {
    let v4: Double = f16(v0)
    let v1: Double = f16(v0)
    let v7: Double = f16(v1)
    let v2: Double = f16(v0)
    let v5: Double = f16(v0)
    var v9: Double = v1
    let v6: Double = f16(v9)
    let v11: Double = v4 - v4
    var v10: Double = v7
    let v8: Double = v1 + v0
    let v14: Double = v9 - v7
    var v16: Double = v5
    var v12: Double = v9
    var v18: Double = v8
    var v21: Double = v5
    let v23: Double = f16(v6)
    let v24: Double = f16(v12)
    let v40: Double = v10 * v21
    let v17: [Double] = [v14, v9, v0]
    v16 = v11
    v18 = v2
    let v63: Double = f16(v18)
    let v47: [Double] = [v1, v63, v16, v40, v23]
    var v46: [Double] = v47
    let v66: Double = v46[1]
    var v39: [Double] = v17
    let v80: Double = v39[2]
    v18 = v24
    var v78: Double = v66
    v16 = v80
    return v78
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v3: [s0] = v0[1]
    let v7: s0 = v3[0]
    let v17: s0 = f6(v7)
    let v61: [[Double]] = v17.p1
    let v36: [Double] = v61[2]
    let v43: Double = v36[0]
    let v139: Double = f5(v43)
    return v139
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])], [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]]
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
