  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f46(_ v0: Double, _ v1: s0) -> s0 {
    let v4: [[Double]] = v1.p1
    var v13: s0 = v1
    var v7: s0 = v1
    var v5: [[Double]] = v4
    let v9: [[Double]] = v13.p1
    let v2: [Double] = v4[0]
    let v15: [[Double]] = [v2]
    let v16: [[Double]] = v13.p0
    let v23: Double = v2[0]
    var v8: s0 = v13
    v8.p1 = v5
    v5[1] = v2
    let v14: [[Double]] = v1.p1
    v5[2] = v2
    v5[1] = v2
    v8.p0 = v16
    var v20: [Double] = v2
    var v11: [[Double]] = v15
    var v12: [[Double]] = v11
    let v22: [[Double]] = v7.p0
    v7.p1 = v9
    let v28: [[[Double]]] = [v9, v22, v16, v4]
    let v18: [[Double]] = v8.p1
    var v45: [[Double]] = v12
    v12[0] = v20
    v45[0] = v2
    var v30: [[Double]] = v9
    v8.p1 = v30
    v30[0] = v2
    let v33: [[Double]] = v13.p1
    v45[0] = v2
    let v24: [[Double]] = v7.p0
    v11[0] = v20
    let v47: [Double] = v24[2]
    v7.p0 = v33
    let v44: [[Double]] = v8.p0
    v8.p1 = v4
    let v38: [Double] = v16[0]
    v5[0] = v2
    v7.p0 = v4
    var v62: [[Double]] = v9
    v7.p1 = v22
    let v53: [[Double]] = v28[2]
    v62[0] = v47
    v8.p0 = v18
    v12[0] = v2
    var v71: [[Double]] = v44
    let v108: Double = v38[0]
    v13.p1 = v9
    v8.p0 = v62
    v7.p0 = v62
    var v97: [[Double]] = v62
    v13.p1 = v14
    let v41: [Double] = v45[0]
    v8.p0 = v71
    var v146: Double = v23
    v20[0] = v146
    v13.p1 = v4
    var v93: [[Double]] = v53
    v20[0] = v108
    v13.p1 = v97
    v13.p1 = v93
    v97[1] = v41
    return v8
  }
  func f36(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p1
    let v6: [Double] = v7[2]
    let v3: s0 = s0(p0: v7, p1: v7)
    let v4: Double = v6[0]
    let v5: [[Double]] = v0.p0
    let v8: s0 = f46(v4, v3)
    let v2: s0 = f46(v4, v0)
    let v10: s0 = f46(v4, v3)
    let v1: s0 = f46(v4, v10)
    var v9: [[Double]] = v5
    let v11: Double = v6[0]
    let v12: [[Double]] = v10.p0
    let v13: s0 = f46(v11, v8)
    var v15: [[Double]] = v9
    v9[1] = v6
    let v22: Double = v6[0]
    let v18: Double = v6[0]
    let v19: [[Double]] = v1.p1
    v15[2] = v6
    var v24: [Double] = v6
    let v20: s0 = f46(v18, v2)
    let v21: [[Double]] = v1.p0
    v9[2] = v24
    var v41: s0 = v20
    let v29: s0 = f46(v18, v13)
    let v28: [[Double]] = v41.p0
    v41.p1 = v12
    let v16: Double = v6[0]
    var v36: [Double] = v6
    v24[0] = v18
    v15[1] = v6
    let v31: [Double] = v9[1]
    let v47: [Double] = v19[0]
    var v83: [Double] = v47
    let v81: Double = v31[0]
    var v60: [[Double]] = v28
    v36[0] = v81
    let v68: Double = v24[0]
    let v101: [[Double]] = v29.p1
    v36[0] = v11
    var v87: [Double] = v31
    v60[0] = v36
    let v113: Double = v83[0]
    var v59: [Double] = v83
    var v66: [[Double]] = v21
    let v50: Double = v59[0]
    v41.p1 = v101
    v36[0] = v22
    let v71: [[Double]] = v41.p1
    v59[0] = v113
    v66 = v15
    var v99: s0 = v1
    v9[2] = v36
    var v63: [Double] = v31
    var v75: Double = v68
    v83[0] = v18
    let v120: Double = v6[0]
    let v142: s0 = f46(v50, v41)
    var v234: Double = v120
    v99.p0 = v66
    v24 = v87
    v41.p1 = v19
    v66[2] = v63
    v24[0] = v234
    v83[0] = v75
    let v196: [Double] = v5[1]
    v87[0] = v16
    v41.p1 = v71
    let v180: [s0] = [v142, v99]
    v99.p1 = v60
    v63 = v196
    let v425: s0 = v180[1]
    return v425
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v4: [[Double]] = v0.p0
    var v2: Double = v1
    var v7: s0 = v0
    let v5: [Double] = v4[0]
    let v3: s0 = f36(v7)
    let v6: [[Double]] = v0.p0
    let v9: [[Double]] = v3.p1
    var v20: Double = v2
    v7.p0 = v9
    let v17: s0 = f36(v0)
    let v10: [[Double]] = v7.p1
    v7.p1 = v10
    let v23: s0 = f46(v20, v7)
    let v34: s0 = f36(v17)
    let v18: [[Double]] = v7.p1
    let v28: [[Double]] = v34.p1
    let v46: [[Double]] = v23.p0
    v7.p0 = v18
    v7.p1 = v6
    let v32: [[Double]] = v3.p1
    let v61: [Double] = v6[1]
    let v130: Double = v5[0]
    var v71: [[Double]] = v46
    var v131: Double = v130
    v7.p1 = v71
    v71[1] = v61
    var v124: [[Double]] = v28
    let v74: [[[Double]]] = [v124, v46, v18, v32]
    let v96: [[Double]] = v74[1]
    let v99: [Double] = v96[0]
    let v55: s0 = f46(v1, v34)
    let v103: s0 = f36(v55)
    let v48: Double = v99[0]
    let v97: s0 = f46(v131, v103)
    let v72: [[Double]] = v97.p1
    v7.p1 = v72
    return v48
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
