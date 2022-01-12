  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f50(_ v0: s1) -> s1 {
    let v4: s0 = v0.p1
    var v1: s0 = v4
    let v6: [[Double]] = v1.p0
    let v8: [[Double]] = v1.p1
    var v3: [[Double]] = v8
    let v5: s0 = s0(p0: v6, p1: v3)
    let v2: [s0] = v0.p0
    let v11: [[Double]] = v4.p0
    let v7: [Double] = v8[0]
    let v10: [Double] = v8[1]
    let v18: s0 = v2[2]
    let v20: [s0] = v0.p0
    var v16: [[Double]] = v6
    let v12: s0 = v0.p1
    v16 = v11
    let v22: [s0] = v0.p0
    var v24: [Double] = v7
    let v26: s0 = v2[1]
    let v19: Double = v24[0]
    var v50: [s0] = v20
    v50[1] = v4
    v1.p1 = v3
    v1.p1 = v8
    let v21: [Double] = v6[1]
    v1.p0 = v16
    let v72: [[Double]] = v12.p0
    v1.p0 = v6
    v1.p0 = v16
    let v34: [Double] = v72[1]
    v3[1] = v21
    var v28: [s0] = v50
    v50[1] = v1
    let v23: [[Double]] = [v21, v34]
    let v125: [[Double]] = v5.p0
    v16 = v125
    let v38: Double = v10[0]
    let v31: [[Double]] = v18.p1
    let v47: [s0] = v0.p0
    v24[0] = v19
    v1.p1 = v8
    v3[0] = v7
    v3 = v23
    var v91: [[Double]] = v31
    var v55: [[Double]] = v91
    var v56: [Double] = v10
    v1.p0 = v16
    let v114: Double = v38 + v19
    let v70: [[s0]] = [v22, v47, v22, v22, v47, v2, v28]
    let v83: [Double] = v72[2]
    let v69: [s0] = v70[6]
    v91[1] = v56
    var v78: s1 = v0
    v16[2] = v34
    var v61: Double = v114
    let v128: s0 = v0.p1
    v56[0] = v61
    v1.p1 = v91
    v3[1] = v83
    v1.p1 = v55
    v50[2] = v128
    v78.p0 = v69
    v28[2] = v26
    return v78
  }
  func f40(_ v0: s0) -> s0 {
    var v1: s0 = v0
    let v5: [[Double]] = v1.p0
    let v7: [[Double]] = v0.p1
    let v6: [[Double]] = v1.p0
    var v3: [[Double]] = v5
    let v4: [[Double]] = v0.p0
    let v2: [s0] = [v0, v0, v0]
    let v8: [[Double]] = v1.p1
    let v19: [[Double]] = v1.p1
    v1.p1 = v7
    let v25: [[Double]] = v0.p1
    var v17: [[Double]] = v4
    var v15: s0 = v1
    let v14: s0 = v2[0]
    v15.p0 = v17
    let v31: [[[Double]]] = [v5, v4, v6]
    let v21: [[Double]] = v15.p1
    let v26: [Double] = v19[1]
    v1 = v14
    let v35: [[Double]] = v14.p0
    let v38: s0 = v2[0]
    let v41: s0 = s0(p0: v3, p1: v21)
    v3[2] = v26
    let v33: s0 = v2[1]
    let v56: [[Double]] = v38.p1
    v15.p0 = v3
    v17 = v35
    let v20: s1 = s1(p0: v2, p1: v41)
    let v45: s1 = f50(v20)
    let v46: [[Double]] = v31[0]
    v15.p1 = v25
    let v44: [s0] = v45.p0
    let v66: s1 = s1(p0: v44, p1: v33)
    v15.p1 = v8
    v1.p1 = v56
    let v95: [s0] = v66.p0
    v15.p0 = v46
    let v74: s0 = v95[2]
    return v74
  }
  func f24(_ v0: s0) -> s0 {
    var v5: s0 = v0
    var v2: s0 = v5
    let v3: [[Double]] = v0.p0
    let v6: s0 = f40(v2)
    let v8: [[Double]] = v5.p0
    let v11: [[Double]] = v6.p1
    var v12: [[Double]] = v11
    var v1: [[Double]] = v11
    let v20: [[Double]] = v6.p1
    let v4: [[[Double]]] = [v8, v3, v3, v3, v8, v3]
    var v15: [[Double]] = v8
    var v10: [[[Double]]] = v4
    var v9: [[Double]] = v20
    let v13: s0 = s0(p0: v15, p1: v9)
    v10[2] = v15
    v5.p1 = v12
    let v16: [[Double]] = v10[1]
    let v25: [[Double]] = v13.p0
    let v19: [[Double]] = v2.p1
    let v29: [Double] = v19[0]
    v1[0] = v29
    v1[0] = v29
    var v34: [Double] = v29
    let v50: [[Double]] = v0.p0
    let v46: [Double] = v1[0]
    v15[1] = v46
    v1[1] = v34
    v1[1] = v29
    v1[1] = v46
    let v67: [Double] = v16[0]
    v2.p0 = v50
    let v88: [Double] = v25[1]
    v1[1] = v88
    v15[1] = v67
    v10[3] = v25
    return v13
  }
  func f9(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v5: s0 = f40(v0)
    let v8: s0 = f40(v5)
    let v2: [[Double]] = v4.p0
    var v6: s0 = v8
    var v3: [[Double]] = v2
    let v1: [s0] = [v0, v6, v8, v6, v6, v6]
    v4 = v6
    var v9: [[Double]] = v2
    v6.p0 = v3
    v6.p0 = v3
    let v11: s0 = v1[5]
    let v10: s0 = f40(v4)
    let v12: [Double] = v9[1]
    v9[1] = v12
    var v19: [[Double]] = v2
    let v21: [[Double]] = v4.p0
    let v23: s0 = f40(v0)
    var v15: s0 = v4
    v15 = v6
    let v14: [[Double]] = v5.p0
    let v25: [[Double]] = v4.p0
    var v22: [Double] = v12
    let v28: s0 = f40(v10)
    var v34: [Double] = v22
    let v26: [[Double]] = v8.p1
    let v49: s0 = f24(v15)
    v6.p1 = v26
    let v50: [Double] = v19[1]
    v3[2] = v22
    var v35: [[Double]] = v3
    let v20: s0 = f24(v5)
    v19[1] = v34
    v19[2] = v22
    v6.p1 = v26
    let v41: s0 = f40(v28)
    v4 = v49
    var v91: [[Double]] = v26
    let v64: [[Double]] = v20.p0
    var v39: [[Double]] = v91
    v15.p1 = v26
    let v69: [[Double]] = v4.p0
    let v73: [Double] = v14[2]
    let v44: s0 = v1[1]
    let v93: [[[Double]]] = [v64, v19, v21, v25, v69]
    let v30: s0 = f24(v41)
    v6.p0 = v64
    v15.p0 = v64
    var v48: [[Double]] = v91
    var v114: s0 = v11
    let v55: s0 = f24(v44)
    v6 = v55
    let v104: [[Double]] = v93[1]
    var v85: [[Double]] = v48
    v15.p1 = v48
    v91 = v85
    let v112: [[Double]] = v30.p1
    v114.p0 = v35
    let v136: [[Double]] = v6.p1
    let v109: [[Double]] = v23.p1
    v114.p1 = v91
    var v52: [[Double]] = v39
    v6.p0 = v104
    v114.p0 = v3
    v114.p1 = v112
    v52[1] = v73
    v6.p1 = v109
    v6.p1 = v136
    v22 = v50
    v6.p1 = v52
    return v114
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v4: s0 = f9(v0)
    let v6: [[Double]] = v0.p1
    var v9: s0 = v0
    let v8: [[Double]] = v0.p1
    let v12: [[Double]] = v0.p0
    var v13: [[Double]] = v8
    v9.p0 = v12
    let v18: [Double] = v6[0]
    v9.p1 = v8
    let v20: s0 = f40(v0)
    let v21: s0 = f40(v0)
    let v25: s0 = f9(v20)
    v9.p1 = v6
    let v16: s0 = f40(v25)
    let v29: [[Double]] = v21.p0
    v9.p0 = v29
    let v23: [[Double]] = v9.p1
    v9.p0 = v29
    let v36: s0 = f40(v16)
    let v30: [Double] = v23[0]
    v13[0] = v18
    v13[0] = v30
    let v82: [Double] = v23[0]
    var v38: [Double] = v82
    var v43: [Double] = v38
    v9.p1 = v23
    v9.p1 = v13
    var v44: [[Double]] = v8
    v9.p1 = v44
    let v72: [[Double]] = v4.p1
    let v79: Double = v43[0]
    let v53: [[Double]] = v36.p1
    v9.p1 = v53
    v9.p1 = v72
    return v79
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])
    let v1: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
