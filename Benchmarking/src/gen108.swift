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
    var p1: s1
  }
  func f121(_ v0: [Double]) -> [Double] {
    let v1: [[Double]] = [v0]
    var v5: [[Double]] = v1
    let v4: Double = v0[0]
    v5 = v1
    var v7: Double = v4
    v5[0] = v0
    let v14: [Double] = v5[0]
    var v19: [Double] = v14
    var v13: [Double] = v19
    v19[0] = v7
    var v12: [Double] = v13
    v5[0] = v14
    v5[0] = v12
    v12[0] = v7
    var v44: [Double] = v13
    return v44
  }
  func f115(_ v0: s0) -> s0 {
    var v7: s0 = v0
    v7 = v0
    var v1: s0 = v7
    let v2: [[Double]] = v7.p0
    v1 = v7
    v7.p0 = v2
    let v14: [[Double]] = v0.p0
    v1.p0 = v2
    let v9: s1 = s1(p0: v7, p1: v0)
    let v25: [[Double]] = v7.p0
    let v32: [s0] = [v1, v7]
    v1.p0 = v14
    let v42: s1 = s1(p0: v0, p1: v1)
    let v17: [[Double]] = v7.p1
    var v46: s1 = v9
    let v29: s0 = v46.p0
    let v16: s0 = v9.p0
    let v22: [s0] = [v29, v16, v7, v1, v7, v0]
    let v59: s0 = v9.p1
    v7.p1 = v17
    var v49: s1 = v42
    let v47: s0 = v32[0]
    let v65: [[Double]] = v1.p0
    v46.p0 = v7
    var v92: [s0] = v32
    v1.p0 = v25
    v7.p1 = v17
    let v71: s0 = v49.p0
    v7.p1 = v17
    let v67: s0 = v42.p1
    let v80: s0 = s0(p0: v65, p1: v17)
    let v44: s0 = v92[0]
    let v54: s0 = v46.p0
    let v172: s0 = v9.p1
    v49.p0 = v47
    v49.p0 = v67
    v49.p1 = v29
    v49 = v9
    let v58: [[Double]] = v54.p1
    let v123: s0 = v22[5]
    let v197: [[Double]] = v80.p1
    v1.p1 = v197
    var v75: [s0] = v22
    v46.p0 = v44
    v49.p0 = v123
    v92[0] = v16
    let v124: s0 = v75[5]
    var v235: s0 = v59
    v7 = v71
    v49.p0 = v235
    v49.p0 = v59
    v46.p0 = v172
    v235.p1 = v58
    return v124
  }
  func f88(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p0
    var v5: [[Double]] = v7
    let v2: [Double] = v5[1]
    let v1: [Double] = v7[0]
    v5[2] = v2
    let v3: s0 = f115(v0)
    v5[2] = v1
    v5 = v7
    var v13: [[Double]] = v7
    var v15: s0 = v3
    let v12: s0 = f115(v3)
    let v47: s0 = f115(v0)
    var v21: [[Double]] = v5
    v15.p0 = v21
    v15.p0 = v13
    let v17: [[Double]] = v12.p1
    var v20: [[Double]] = v17
    let v48: [[Double]] = v0.p0
    var v22: s0 = v3
    let v74: [Double] = v20[0]
    let v38: [Double] = v48[2]
    v21[0] = v74
    let v35: [Double] = f121(v38)
    v15.p1 = v20
    let v68: [[Double]] = v15.p0
    v22.p0 = v13
    v15.p0 = v68
    let v99: s0 = f115(v22)
    var v59: s0 = v0
    v15.p1 = v17
    let v55: s0 = f115(v59)
    let v95: [[Double]] = v3.p1
    v59.p1 = v95
    let v61: s0 = f115(v3)
    let v49: [[Double]] = v47.p1
    v59.p0 = v21
    let v104: [[Double]] = v61.p1
    let v94: [Double] = f121(v35)
    v59.p1 = v49
    let v66: [[Double]] = v99.p0
    let v129: s1 = s1(p0: v55, p1: v47)
    v15.p0 = v13
    let v93: [[Double]] = v59.p1
    let v96: [[Double]] = v61.p0
    v21[2] = v94
    v15.p1 = v93
    v22.p1 = v104
    v15.p0 = v66
    let v117: [Double] = v104[0]
    v59.p0 = v68
    var v81: s1 = v129
    var v100: s1 = v81
    let v121: s0 = v100.p1
    v5[1] = v117
    v15.p0 = v96
    return v121
  }
  func f69(_ v0: s1) -> s1 {
    let v4: s0 = v0.p0
    let v7: s0 = f88(v4)
    let v3: s0 = f115(v7)
    let v8: [[Double]] = v4.p1
    let v2: s0 = f115(v4)
    let v5: s0 = v0.p1
    let v17: s0 = f115(v2)
    var v12: s1 = v0
    let v16: s0 = f88(v5)
    var v15: s0 = v7
    let v11: s0 = v0.p1
    let v21: s0 = v12.p1
    let v41: s0 = f88(v16)
    let v22: s1 = s1(p0: v17, p1: v41)
    let v32: [[Double]] = v21.p0
    var v29: s1 = v12
    v15.p1 = v8
    let v36: s0 = f88(v3)
    let v31: s0 = f88(v41)
    v12 = v0
    v12 = v29
    let v25: s0 = f115(v41)
    let v24: s0 = s0(p0: v32, p1: v8)
    let v52: s0 = f115(v24)
    v12.p0 = v31
    v12.p0 = v52
    v12.p0 = v36
    v15 = v41
    let v144: s0 = v0.p1
    let v50: s0 = v12.p0
    v29.p1 = v15
    let v71: [[Double]] = v17.p1
    v15.p1 = v71
    v29.p1 = v4
    v12.p0 = v16
    var v179: s1 = v12
    v15.p1 = v8
    v29.p1 = v144
    v15 = v11
    v29.p0 = v17
    v12.p1 = v25
    v29 = v22
    v179.p0 = v50
    let v91: s0 = f115(v24)
    v15 = v91
    return v179
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s2, _ v2: Double) -> Double {
    let v5: s1 = v1.p1
    let v8: s0 = v5.p1
    let v16: [[Double]] = v8.p0
    let v14: s1 = f69(v5)
    let v26: s0 = v14.p0
    let v33: [[Double]] = v26.p1
    var v29: [[Double]] = v33
    let v25: [Double] = v16[0]
    v29[1] = v25
    let v50: [Double] = v29[1]
    v29[0] = v50
    let v98: Double = v50[0]
    return v98
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])]
    let v1: s2 = s2(p0: [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])], p1: s1(p0: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]), p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])))
    let v2: Double = 25.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 25.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
