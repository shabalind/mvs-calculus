  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  func f33(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p1
    var v5: s0 = v0
    let v3: [Double] = v4[0]
    let v8: [[Double]] = v5.p1
    v5.p1 = v4
    let v1: [Double] = v5.p0
    let v9: [Double] = v5.p0
    v5.p0 = v1
    let v11: [Double] = v0.p0
    let v12: [Double] = v5.p0
    let v20: [[Double]] = v0.p1
    let v30: [[Double]] = v0.p1
    v5.p1 = v30
    let v21: Double = v12[1]
    v5 = v0
    let v48: Double = v3[0]
    v5.p0 = v9
    let v23: [[Double]] = v0.p1
    v5.p0 = v11
    v5.p1 = v23
    let v22: s0 = s0(p0: v12, p1: v8)
    let v25: [[Double]] = v0.p1
    var v26: [[Double]] = v8
    let v34: [Double] = v22.p0
    v26 = v8
    v26[1] = v3
    v5.p0 = v9
    let v27: [[[Double]]] = [v23, v8, v25, v8, v25, v26, v23]
    var v32: [Double] = v1
    let v24: [Double] = v0.p0
    v5.p1 = v8
    let v15: [Double] = v5.p0
    v5.p0 = v32
    v32[0] = v21
    let v49: [Double] = v5.p0
    v5.p0 = v15
    let v56: [[Double]] = v0.p1
    v32[1] = v48
    let v35: s0 = s0(p0: v49, p1: v8)
    var v71: [[Double]] = v4
    let v28: s0 = s0(p0: v12, p1: v20)
    let v42: [Double] = v5.p0
    v5.p1 = v56
    v5.p1 = v23
    let v33: [[Double]] = v28.p1
    let v47: Double = v24[1]
    v32 = v1
    v5.p0 = v1
    let v94: [Double] = v28.p0
    let v37: [Double] = v5.p0
    var v64: s0 = v22
    v64.p1 = v20
    v5.p0 = v24
    v5.p0 = v11
    let v110: [Double] = v35.p0
    let v96: [[Double]] = v0.p1
    v32[0] = v47
    v64.p0 = v15
    v64.p0 = v34
    let v92: [[Double]] = v64.p1
    let v79: s0 = s0(p0: v110, p1: v96)
    let v52: [[Double]] = v27[5]
    v5.p1 = v92
    let v66: [[Double]] = v79.p1
    v5.p1 = v26
    v5.p1 = v8
    v5.p1 = v33
    v5.p1 = v52
    v5.p0 = v42
    v64.p1 = v71
    v5.p0 = v94
    let v89: s0 = s0(p0: v24, p1: v66)
    v64.p0 = v37
    v5.p0 = v1
    return v89
  }
  func f8(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v5: [s0] = [v0, v0, v6, v6, v6, v0]
    var v4: [s0] = v5
    let v7: s0 = v4[5]
    let v1: [[Double]] = v7.p1
    let v2: [Double] = v0.p0
    let v13: s0 = v5[5]
    let v12: s0 = f33(v13)
    var v23: [s0] = v4
    v23[3] = v6
    let v17: Double = v2[0]
    let v21: s0 = f33(v7)
    v4[0] = v21
    let v14: [Double] = v7.p0
    v6.p1 = v1
    var v41: [Double] = v2
    let v20: s0 = f33(v0)
    v6.p0 = v41
    v41[1] = v17
    let v37: s0 = f33(v13)
    v6.p0 = v41
    let v87: s0 = v23[3]
    v23[3] = v20
    let v78: [[Double]] = v87.p1
    var v93: s0 = v37
    let v197: [[Double]] = v12.p1
    v93.p1 = v78
    v6.p0 = v14
    v6.p1 = v197
    return v93
  }
  func f4(_ v0: s0, _ v1: Double) -> Double {
    let v6: s0 = f8(v0)
    let v9: [s0] = [v6, v6, v0]
    let v11: s0 = v9[1]
    let v25: s0 = f33(v11)
    let v14: [Double] = v25.p0
    var v30: [Double] = v14
    var v56: Double = v1
    v30[0] = v56
    let v80: Double = v30[1]
    return v80
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v2: s0 = f33(v0)
    var v8: s0 = v2
    let v3: [Double] = v2.p0
    let v6: [Double] = v2.p0
    let v10: [Double] = v2.p0
    let v11: s0 = f8(v8)
    let v12: Double = v10[1]
    let v29: [[Double]] = v11.p1
    let v15: [Double] = v29[1]
    let v25: [Double] = v2.p0
    var v27: [Double] = v3
    let v18: s0 = f33(v8)
    let v17: Double = v15[0]
    v8.p0 = v10
    let v79: [Double] = v0.p0
    let v34: s0 = f33(v18)
    let v16: s0 = f33(v34)
    let v61: s0 = f8(v18)
    v27[1] = v17
    let v51: Double = v25[1]
    var v35: [Double] = v10
    v8.p0 = v3
    v8.p0 = v35
    let v31: [s0] = [v8, v16, v16, v8, v61, v2]
    let v73: s0 = v31[5]
    v27[0] = v12
    v8.p0 = v27
    v8.p0 = v6
    v8.p0 = v79
    let v59: s0 = f8(v73)
    let v93: Double = f4(v59, v1)
    v35[1] = v51
    v27[1] = v93
    v8.p0 = v25
    v8.p0 = v3
    return v93
  }
  func benchmark() {
    let v0: s0 = s0(p0: [0.0, 1.0], p1: [[2.0], [3.0]])
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
