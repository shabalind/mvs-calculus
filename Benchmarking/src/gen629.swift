  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f52(_ v0: s0, _ v1: s0) -> s0 {
    var v3: s0 = v0
    v3 = v0
    let v4: [[Double]] = v3.p0
    v3.p1 = v4
    let v2: s0 = s0(p0: v4, p1: v4)
    let v6: [[Double]] = v1.p1
    v3.p1 = v6
    v3.p1 = v6
    return v2
  }
  func f49(_ v0: s0) -> s0 {
    var v2: s0 = v0
    var v9: s0 = v2
    let v4: [[Double]] = v2.p1
    var v7: [[Double]] = v4
    let v1: [Double] = v7[0]
    let v3: [[Double]] = v2.p1
    let v8: [Double] = v7[1]
    v7[0] = v1
    let v5: [[Double]] = v0.p1
    let v13: [Double] = v7[0]
    var v6: s0 = v0
    let v18: s0 = f52(v0, v9)
    var v14: [[Double]] = v4
    v7[1] = v13
    var v12: [[Double]] = v7
    let v20: [[Double]] = v0.p1
    let v29: s0 = f52(v0, v9)
    v6.p0 = v7
    v12[1] = v1
    let v25: s0 = f52(v18, v29)
    let v15: [Double] = v5[1]
    let v10: s0 = f52(v2, v25)
    v7 = v3
    var v43: s0 = v10
    let v36: [[Double]] = v10.p1
    v14[0] = v13
    let v19: [Double] = v12[0]
    v6.p1 = v36
    let v17: s0 = f52(v2, v6)
    let v27: [[Double]] = [v19, v8, v13]
    let v26: s0 = f52(v43, v6)
    let v30: [[Double]] = v0.p1
    let v34: [[[Double]]] = [v27, v27]
    let v22: [[Double]] = v34[1]
    let v56: [[Double]] = v17.p1
    var v49: s0 = v25
    let v37: s0 = s0(p0: v20, p1: v14)
    v2 = v0
    v9 = v10
    let v80: s0 = f52(v25, v26)
    let v62: [Double] = v22[2]
    v43.p1 = v30
    let v39: s0 = f52(v18, v49)
    v49.p1 = v7
    let v83: [[Double]] = v2.p0
    let v137: s0 = f52(v37, v80)
    v12[1] = v15
    v12[1] = v19
    let v99: [Double] = v27[2]
    let v91: [Double] = v27[0]
    v7[0] = v13
    let v124: [[Double]] = v9.p1
    v7[1] = v62
    v14 = v56
    v12[1] = v99
    v49.p0 = v83
    let v86: s0 = f52(v39, v137)
    v9.p1 = v124
    let v211: [[Double]] = v0.p0
    v12[0] = v91
    v49.p1 = v211
    return v86
  }
  func f48(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v1: [[Double]] = v0.p1
    let v4: s0 = f49(v5)
    let v2: s0 = f49(v4)
    v5.p1 = v1
    let v12: s0 = f52(v0, v0)
    let v11: s0 = f52(v0, v5)
    var v10: [[Double]] = v1
    let v15: [[Double]] = v12.p0
    let v30: [s0] = [v0]
    let v20: s0 = f52(v2, v0)
    let v26: [[Double]] = v12.p1
    let v31: s0 = f49(v12)
    let v38: s0 = f49(v4)
    let v16: s0 = s0(p0: v15, p1: v15)
    let v44: [[Double]] = v5.p1
    v5.p0 = v10
    var v47: [s0] = v30
    var v78: [[Double]] = v1
    let v32: s0 = f49(v20)
    v5 = v4
    let v43: [[Double]] = v31.p1
    let v56: [[[Double]]] = [v78, v10, v26, v26, v10]
    let v41: [[Double]] = v38.p0
    let v45: [[Double]] = v56[1]
    let v51: s0 = f52(v20, v2)
    v5.p0 = v44
    var v98: [[Double]] = v43
    v5.p0 = v98
    v5.p1 = v98
    let v66: s0 = v47[0]
    let v63: s0 = f52(v66, v51)
    let v91: s0 = f52(v32, v16)
    let v112: s0 = f52(v11, v63)
    v47[0] = v2
    let v159: [[Double]] = v2.p1
    let v93: [Double] = v45[0]
    v5.p0 = v159
    v5.p0 = v15
    let v113: [[Double]] = v91.p1
    v10[0] = v93
    var v153: s0 = v112
    let v188: [Double] = v113[0]
    v153.p0 = v41
    v10[0] = v188
    return v153
  }
  func f44(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p1
    let v6: [[Double]] = v0.p0
    var v2: [[Double]] = v6
    let v10: s0 = f52(v0, v0)
    let v8: s0 = f48(v10)
    let v1: [Double] = v3[1]
    var v11: [Double] = v1
    let v19: s0 = s0(p0: v2, p1: v2)
    let v26: [[Double]] = v0.p0
    let v16: s0 = f49(v8)
    v2[1] = v11
    v2 = v26
    let v48: s0 = f52(v19, v16)
    v2[1] = v11
    v2[1] = v1
    let v23: s0 = f49(v48)
    var v53: [Double] = v11
    v2[1] = v53
    return v23
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v3: s0 = v0[0]
    let v2: s0 = f44(v3)
    let v9: [[Double]] = v2.p0
    let v6: [Double] = v9[1]
    let v21: Double = v6[0]
    return v21
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])]
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
