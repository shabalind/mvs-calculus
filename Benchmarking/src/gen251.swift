  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f19(_ v0: s0) -> s0 {
    var v4: s0 = v0
    var v1: s0 = v4
    let v3: [[Double]] = v1.p1
    let v11: [[[Double]]] = [v3, v3, v3, v3, v3, v3, v3]
    var v8: s0 = v1
    v8.p1 = v3
    let v16: [[Double]] = v0.p0
    let v5: [[Double]] = v11[5]
    var v2: [[Double]] = v5
    var v12: [[[Double]]] = v11
    let v19: [[Double]] = v1.p0
    var v14: [[[Double]]] = v11
    let v15: [[Double]] = v4.p1
    v14[5] = v3
    let v13: [[Double]] = v0.p0
    let v28: [Double] = v16[0]
    let v17: [[Double]] = v14[2]
    v12[3] = v2
    let v39: s0 = s0(p0: v19, p1: v3)
    v14[1] = v2
    v2 = v15
    var v18: [Double] = v28
    let v30: [[Double]] = v1.p0
    v1.p0 = v30
    let v23: [[Double]] = v12[2]
    v2[0] = v18
    let v21: [[Double]] = v0.p0
    v1.p0 = v13
    v14[2] = v3
    let v43: [[Double]] = v1.p1
    let v40: s0 = s0(p0: v13, p1: v43)
    var v34: s0 = v8
    v14[3] = v43
    v1.p0 = v13
    let v55: [[Double]] = v40.p1
    v1.p1 = v17
    var v141: s0 = v39
    v8.p1 = v55
    v4.p1 = v23
    v1 = v34
    v1.p1 = v2
    v12[4] = v55
    v141.p1 = v17
    v1.p0 = v16
    v34.p0 = v21
    v8.p0 = v19
    v12[1] = v2
    v8.p1 = v55
    v14[4] = v23
    v34.p0 = v19
    return v141
  }
  func f16(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v3: s0 = f19(v7)
    let v2: [[Double]] = v3.p0
    let v9: s0 = f19(v0)
    let v4: s0 = f19(v7)
    let v13: s0 = f19(v7)
    var v6: [[Double]] = v2
    var v15: s0 = v9
    var v11: s0 = v15
    var v10: s0 = v13
    let v17: s0 = f19(v10)
    let v29: s0 = f19(v15)
    let v1: [[Double]] = v29.p1
    v15.p0 = v2
    let v18: [Double] = v1[0]
    let v30: [[Double]] = v17.p1
    let v16: [[Double]] = v4.p0
    v6[0] = v18
    v11.p1 = v30
    var v19: s0 = v10
    let v35: [[Double]] = v7.p0
    let v22: s0 = f19(v0)
    let v34: [[Double]] = v0.p1
    v11.p1 = v30
    v19.p1 = v1
    let v57: [Double] = v6[1]
    v6[1] = v57
    let v27: [[Double]] = v10.p0
    var v41: [[Double]] = v1
    v10.p0 = v16
    let v31: s0 = f19(v0)
    let v61: [[Double]] = v9.p1
    let v42: s0 = f19(v4)
    let v39: s0 = f19(v13)
    let v32: s0 = f19(v31)
    v19.p1 = v41
    let v66: [Double] = v35[1]
    v15 = v39
    let v56: s0 = f19(v42)
    let v36: [[Double]] = v32.p0
    var v45: [[Double]] = v27
    v19 = v42
    v11.p1 = v41
    v11.p0 = v2
    var v86: [[Double]] = v6
    v6[1] = v66
    v7.p0 = v6
    let v117: s0 = f19(v22)
    let v93: s0 = f19(v19)
    v7.p0 = v36
    let v94: [[Double]] = v93.p1
    let v96: s0 = f19(v117)
    var v82: [[Double]] = v1
    v19.p1 = v30
    let v71: [[Double]] = v11.p0
    v15.p1 = v82
    v15.p0 = v71
    let v135: [[Double]] = v96.p1
    v10.p0 = v45
    v7.p1 = v82
    v15.p0 = v2
    v7.p1 = v94
    v11.p0 = v2
    let v223: s0 = f19(v56)
    v10 = v223
    v7.p1 = v34
    v15.p1 = v135
    v10.p1 = v61
    v19.p0 = v86
    return v19
  }
  func f14(_ v0: s0, _ v1: s0) -> s0 {
    let v18: [[Double]] = v0.p0
    let v14: [[[Double]]] = [v18, v18]
    let v34: s0 = f16(v1)
    let v45: [[Double]] = v14[1]
    let v40: [[Double]] = v34.p1
    let v47: s0 = s0(p0: v45, p1: v40)
    let v49: s0 = f19(v47)
    let v136: s0 = f16(v49)
    return v136
  }
  func f10(_ v0: s0) -> s0 {
    var v2: s0 = v0
    var v7: s0 = v2
    let v4: s0 = f14(v0, v7)
    let v5: [[Double]] = v0.p0
    let v11: [[Double]] = v4.p1
    let v15: s0 = s0(p0: v5, p1: v11)
    let v12: s0 = f14(v15, v4)
    let v50: s0 = f16(v4)
    let v60: [[Double]] = v50.p1
    let v91: s0 = f19(v12)
    v2.p1 = v60
    return v91
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s0, _ v2: s0, _ v3: Double) -> Double {
    let v11: s0 = v0[0]
    let v20: s0 = f10(v11)
    let v14: Double = v3 + v3
    let v19: [[Double]] = v20.p1
    let v39: [Double] = v19[0]
    let v128: Double = v39[0]
    let v116: Double = v128 - v14
    return v116
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0]])]
    let v1: s0 = s0(p0: [[3.0], [4.0]], p1: [[5.0]])
    let v2: s0 = s0(p0: [[6.0], [7.0]], p1: [[8.0]])
    let v3: Double = 9.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 9.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
