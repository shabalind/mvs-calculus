  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f31(_ v0: [s0]) -> [s0] {
    let v2: s0 = v0[2]
    var v1: [s0] = v0
    v1[2] = v2
    let v28: s0 = v1[1]
    v1[0] = v28
    let v7: [[s0]] = [v1, v0, v0]
    let v30: [s0] = v7[2]
    return v30
  }
  func f20(_ v0: s0) -> s0 {
    var v7: s0 = v0
    var v3: s0 = v7
    var v4: s0 = v7
    let v8: [s0] = [v3]
    let v2: s0 = v8[0]
    let v5: s0 = v8[0]
    let v6: s0 = v8[0]
    v7 = v5
    let v1: [[Double]] = v4.p1
    var v17: [[Double]] = v1
    v3.p1 = v17
    var v9: [[Double]] = v17
    let v13: s0 = v8[0]
    let v15: [Double] = v1[0]
    v17[2] = v15
    var v10: [Double] = v15
    let v24: [[Double]] = v3.p0
    v9[0] = v10
    v4 = v13
    let v29: [s0] = [v5, v4, v13, v2, v4, v0, v3]
    let v28: [Double] = v24[0]
    let v41: [[Double]] = v6.p1
    v4.p1 = v41
    var v20: s0 = v3
    v20.p1 = v9
    let v42: [[Double]] = v20.p0
    v7.p0 = v42
    let v70: s0 = v29[1]
    v3.p1 = v1
    v3.p0 = v24
    v9[2] = v28
    v4.p0 = v42
    v20.p1 = v9
    let v53: [[Double]] = v70.p1
    let v55: s0 = s0(p0: v24, p1: v53)
    return v55
  }
  func f18(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p0
    let v7: s0 = f20(v0)
    var v2: [[Double]] = v3
    var v5: [[Double]] = v2
    var v1: s0 = v7
    let v6: s0 = f20(v1)
    v1.p0 = v3
    var v10: s0 = v6
    let v8: [[Double]] = v1.p1
    v10.p1 = v8
    let v11: s0 = f20(v0)
    var v18: [[Double]] = v8
    let v40: s0 = f20(v11)
    var v22: [[Double]] = v5
    v10 = v1
    v10.p0 = v22
    v1.p0 = v2
    let v20: [[Double]] = v7.p1
    v1.p1 = v20
    var v34: [[Double]] = v20
    let v21: [[Double]] = v10.p0
    let v45: s0 = f20(v1)
    let v50: [[Double]] = v45.p1
    let v36: s0 = s0(p0: v22, p1: v18)
    var v53: [[Double]] = v22
    let v48: s0 = f20(v40)
    var v31: s0 = v1
    var v49: [[Double]] = v34
    let v58: [s0] = [v40, v7, v31, v48, v36]
    let v57: s0 = v58[0]
    let v64: [Double] = v5[0]
    v18[1] = v64
    let v47: [Double] = v21[0]
    v10.p1 = v34
    let v26: [[Double]] = v31.p0
    let v59: [Double] = v21[0]
    let v70: s0 = v58[1]
    let v83: [Double] = v34[1]
    let v62: [[Double]] = v57.p0
    let v87: [Double] = v53[0]
    v31.p1 = v49
    let v86: [[Double]] = v11.p1
    var v120: [[Double]] = v21
    v31.p1 = v86
    v18[0] = v87
    let v78: s0 = s0(p0: v26, p1: v50)
    v2[0] = v64
    v31.p1 = v34
    var v255: s0 = v78
    v31.p0 = v120
    v18[0] = v47
    let v149: [[Double]] = v70.p1
    v49 = v149
    v255.p1 = v50
    v5 = v53
    v255.p0 = v62
    v22[0] = v59
    v5 = v62
    v53[0] = v83
    let v214: s0 = f20(v255)
    return v214
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    var v7: [s0] = v0
    let v5: s0 = v0[0]
    let v4: s0 = v7[2]
    let v9: [s0] = f31(v7)
    let v2: s0 = v7[2]
    let v13: [[Double]] = v4.p0
    let v3: s0 = f18(v2)
    let v11: s0 = v9[1]
    let v12: s0 = v0[0]
    let v10: [[Double]] = v4.p1
    let v23: s0 = f18(v3)
    v7[2] = v5
    let v17: [Double] = v10[2]
    let v29: [Double] = v13[0]
    var v33: [Double] = v17
    let v14: [[Double]] = v12.p0
    v7[2] = v23
    var v21: [[Double]] = v10
    let v34: [Double] = v13[0]
    let v42: s0 = s0(p0: v14, p1: v21)
    let v52: s0 = f18(v42)
    let v57: Double = v34[0]
    v21[1] = v17
    let v127: s0 = f20(v52)
    let v111: Double = v29[0]
    let v61: Double = v111 * v57
    v7[0] = v127
    v7[0] = v11
    v21[2] = v33
    return v61
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
