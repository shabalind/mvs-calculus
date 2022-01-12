  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: [[s0]]
  }
  func f86(_ v0: s2) -> s2 {
    var v1: s2 = v0
    var v8: s2 = v0
    let v3: [[s0]] = v8.p1
    v1 = v8
    let v5: [s2] = [v0]
    var v6: [s2] = v5
    let v7: [[s0]] = v8.p1
    let v11: [s1] = v1.p0
    v1.p0 = v11
    v6[0] = v1
    let v4: [s1] = v8.p0
    var v9: [[s0]] = v7
    v8.p1 = v9
    v1.p0 = v4
    let v43: s2 = v6[0]
    v8.p1 = v3
    return v43
  }
  func f85(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p0
    let v2: [[Double]] = v0.p1
    let v1: [Double] = v3[0]
    var v6: s0 = v0
    v6.p1 = v2
    var v5: [[Double]] = v3
    var v4: [Double] = v1
    var v9: [[Double]] = v5
    var v8: s0 = v0
    let v12: [Double] = v2[2]
    let v10: [[Double]] = v0.p0
    let v7: [[Double]] = v6.p1
    v5[0] = v12
    v5[0] = v4
    let v11: [Double] = v10[0]
    let v17: [Double] = v5[0]
    let v14: [[[Double]]] = [v10, v9, v10, v5, v9]
    let v24: [[Double]] = v0.p1
    let v16: [[[Double]]] = [v9, v5, v5, v3, v9, v5]
    var v29: [[[Double]]] = v16
    v6.p1 = v24
    let v23: [[Double]] = v14[1]
    var v22: [[[Double]]] = v16
    v29[0] = v5
    let v19: [[Double]] = v0.p0
    v22[3] = v10
    v6.p0 = v3
    let v31: [[Double]] = v22[0]
    let v21: [[Double]] = v0.p0
    v8.p0 = v23
    v8.p0 = v23
    let v32: [[Double]] = v14[4]
    var v47: [[Double]] = v7
    let v72: [[Double]] = v22[0]
    let v20: [[[[Double]]]] = [v14, v14, v14, v14, v14]
    let v46: [[Double]] = v0.p1
    let v27: s0 = s0(p0: v21, p1: v7)
    v6.p0 = v5
    v6.p1 = v7
    let v33: [[Double]] = v8.p0
    v6.p1 = v47
    let v41: [[Double]] = v8.p0
    var v28: [[[Double]]] = v14
    v8.p0 = v9
    v6.p0 = v9
    v29[3] = v41
    let v40: [[Double]] = v28[2]
    v29[3] = v21
    var v39: [[[Double]]] = v28
    let v36: [[Double]] = v6.p1
    let v42: [[Double]] = v27.p1
    v6.p1 = v2
    let v35: [Double] = v36[2]
    let v53: [[Double]] = v39[4]
    let v38: [[Double]] = v29[1]
    v47[2] = v1
    let v43: [[Double]] = v27.p0
    let v51: [[Double]] = v0.p1
    v9[0] = v11
    v6.p1 = v46
    let v60: [[Double]] = v0.p1
    v8.p1 = v7
    v9 = v38
    v39[1] = v23
    let v104: [[Double]] = v6.p0
    var v94: s0 = v0
    v94.p1 = v2
    v8.p0 = v19
    v47 = v42
    v8.p0 = v104
    var v77: s0 = v6
    var v172: [[Double]] = v53
    let v106: [[Double]] = v6.p1
    v77.p1 = v42
    let v164: [[[Double]]] = v20[3]
    let v129: [[Double]] = v0.p1
    let v134: [[Double]] = v94.p1
    v8.p0 = v5
    v9[0] = v17
    v77.p1 = v134
    v94.p1 = v106
    v39[4] = v43
    v6.p1 = v46
    v6.p0 = v33
    v94.p0 = v32
    v6.p1 = v129
    let v170: [[Double]] = v77.p1
    v94.p1 = v60
    let v109: [[Double]] = v164[1]
    v5[0] = v35
    v77.p0 = v172
    v6.p1 = v51
    let v124: [[Double]] = v6.p0
    let v160: s0 = s0(p0: v72, p1: v42)
    var v143: s0 = v160
    v77.p1 = v36
    v39[2] = v109
    v77.p0 = v31
    v6.p0 = v40
    v143.p1 = v36
    v143.p1 = v129
    v22[0] = v124
    v143.p1 = v170
    v143.p1 = v134
    v22[5] = v109
    return v143
  }
  func f84(_ v0: s2) -> s2 {
    let v2: s2 = f86(v0)
    let v8: s2 = f86(v2)
    let v16: [[s0]] = v8.p1
    let v21: [s1] = v0.p0
    let v54: s2 = s2(p0: v21, p1: v16)
    let v35: s2 = f86(v54)
    let v49: s2 = f86(v2)
    let v85: s2 = f86(v8)
    let v58: s2 = f86(v85)
    let v98: [s2] = [v58, v49, v85, v58, v35]
    let v161: s2 = v98[1]
    let v205: s2 = f86(v161)
    return v205
  }
  func f59(_ v0: s2, _ v1: s0) -> s0 {
    let v2: [[Double]] = v1.p1
    let v4: s0 = f85(v1)
    var v6: s0 = v4
    var v5: [[Double]] = v2
    v6.p1 = v2
    v5 = v2
    v6.p1 = v2
    let v18: [Double] = v5[2]
    v5[0] = v18
    v6.p1 = v2
    let v19: [[Double]] = v6.p0
    v6.p1 = v5
    let v66: s0 = s0(p0: v19, p1: v5)
    return v66
  }
  func f25(_ v0: s2, _ v1: s2) -> s2 {
    let v7: [[s0]] = v0.p1
    var v5: s2 = v1
    let v4: [s0] = v7[0]
    v5.p1 = v7
    let v3: [s0] = v7[0]
    var v2: [[s0]] = v7
    let v8: [[s0]] = v0.p1
    let v12: [s0] = v8[0]
    v2[0] = v4
    v2[0] = v3
    v2[0] = v12
    v5.p1 = v2
    let v30: s2 = f84(v5)
    return v30
  }
  func f22(_ v0: Double, _ v1: [[s0]], _ v2: s2) -> Double {
    let v13: s2 = f25(v2, v2)
    let v9: [s1] = v13.p0
    let v17: s1 = v9[0]
    let v15: [[s0]] = v17.p0
    let v18: [s0] = v15[1]
    let v34: s0 = v18[0]
    let v16: s0 = f85(v34)
    let v36: [[Double]] = v16.p1
    let v58: [Double] = v36[0]
    let v76: Double = v58[0]
    return v76
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s1, _ v2: s2, _ v3: [[s0]], _ v4: Double) -> Double {
    let v6: [[Double]] = v0.p0
    var v9: [[Double]] = v6
    let v7: s0 = v1.p1
    let v20: s0 = f59(v2, v7)
    let v13: s2 = f25(v2, v2)
    let v16: s2 = f84(v13)
    let v19: [Double] = v9[0]
    var v30: Double = v4
    v9[0] = v19
    v30 = v4
    v30 = v4
    var v34: [Double] = v19
    let v32: Double = v34[0]
    let v31: [[Double]] = v20.p1
    let v45: [Double] = v9[0]
    v9[0] = v19
    let v66: [Double] = v31[0]
    let v84: Double = f22(v32, v3, v16)
    let v46: Double = v4 + v84
    v9[0] = v34
    var v72: Double = v46
    v34 = v45
    let v138: Double = v46 / v72
    v34[0] = v30
    v9[0] = v66
    v34[0] = v84
    v34[0] = v72
    return v138
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])
    let v1: s1 = s1(p0: [[s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]], p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))
    let v2: s2 = s2(p0: [s1(p0: [[s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])]], p1: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])), s1(p0: [[s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])], [s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])]], p1: s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]))], p1: [[s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]])]])
    let v3: [[s0]] = [[s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])]]
    let v4: Double = 48.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 48.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
