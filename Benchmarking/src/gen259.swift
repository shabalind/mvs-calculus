  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  func f12(_ v0: Double, _ v1: s1) -> s1 {
    let v7: s0 = v1.p1
    var v3: s0 = v7
    let v2: s0 = v1.p1
    var v5: s0 = v7
    let v9: s0 = v1.p1
    let v4: [[Double]] = v3.p0
    var v10: s0 = v5
    let v11: [[Double]] = v2.p1
    let v23: [s0] = v1.p0
    let v46: [[Double]] = v5.p1
    let v16: s0 = s0(p0: v4, p1: v11)
    let v13: [s0] = [v7, v10, v10]
    v5.p0 = v46
    var v12: [s0] = v13
    let v19: [[Double]] = v5.p0
    v12 = v13
    v3.p0 = v4
    v5.p1 = v46
    var v36: s1 = v1
    let v17: [[Double]] = v9.p0
    let v18: s0 = v36.p1
    let v26: s0 = v36.p1
    let v42: s0 = v23[0]
    let v52: s0 = v23[0]
    v5.p1 = v46
    let v59: s0 = v23[0]
    let v48: [s0] = v36.p0
    var v43: [s0] = v12
    let v27: s0 = v12[1]
    var v22: [s0] = v43
    let v57: [s0] = [v2, v9]
    v36.p1 = v9
    v12[1] = v27
    var v56: [s0] = v43
    v56[2] = v7
    v56[1] = v42
    v22[1] = v16
    var v69: s1 = v36
    let v30: s0 = v23[0]
    let v29: [s0] = v69.p0
    let v39: [s0] = v1.p0
    v22[2] = v42
    var v38: [s0] = v57
    let v98: s0 = v56[2]
    v43 = v22
    var v77: s1 = v36
    let v49: s0 = v39[0]
    let v47: [s0] = v77.p0
    v69.p0 = v39
    v22[0] = v18
    let v64: s0 = v38[0]
    let v85: [[Double]] = v49.p1
    v5.p0 = v17
    let v113: [[Double]] = v64.p1
    var v72: s0 = v9
    let v60: [[Double]] = v3.p0
    let v53: s2 = s2(p0: v2, p1: v18)
    v77.p0 = v47
    v22[1] = v18
    let v99: s0 = v53.p1
    v5.p1 = v60
    v12[0] = v52
    v36.p1 = v49
    let v76: [[s0]] = [v47, v48, v39, v29]
    v12[0] = v59
    v3.p0 = v19
    let v123: [[Double]] = v30.p0
    v77.p1 = v72
    v12[2] = v26
    let v295: s0 = v23[0]
    v72.p0 = v113
    let v182: [s0] = v76[2]
    v69.p1 = v98
    v22 = v13
    v10.p0 = v123
    let v283: s1 = s1(p0: v182, p1: v98)
    var v148: [s0] = v29
    v3.p0 = v85
    v36.p1 = v99
    v38[0] = v295
    v36.p0 = v148
    return v283
  }
  func f7(_ v0: s1, _ v1: s0, _ v2: s1) -> s0 {
    let v8: [[Double]] = v1.p1
    let v4: [Double] = v8[1]
    let v7: Double = v4[0]
    let v9: [[Double]] = v1.p0
    var v14: s1 = v2
    let v23: [Double] = v9[1]
    let v18: [s0] = v14.p0
    v14.p1 = v1
    v14.p1 = v1
    let v20: Double = v7 - v7
    v14.p0 = v18
    let v33: Double = v4[0]
    let v17: Double = v23[0]
    let v22: s1 = f12(v20, v14)
    v14.p1 = v1
    let v30: s1 = f12(v17, v0)
    let v25: s1 = f12(v33, v30)
    let v26: s1 = f12(v33, v25)
    let v34: [s0] = v26.p0
    let v104: [s0] = v26.p0
    var v59: s1 = v22
    let v35: [s0] = v59.p0
    let v84: s0 = v18[0]
    var v129: s0 = v84
    let v79: s0 = v35[0]
    var v95: [s0] = v34
    v59.p0 = v104
    v14.p0 = v35
    v14.p1 = v84
    v14.p0 = v95
    v95[0] = v129
    return v79
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s2, _ v2: s0, _ v3: [s1], _ v4: Double) -> Double {
    let v10: s1 = s1(p0: v0, p1: v2)
    var v9: [s0] = v0
    let v5: [s0] = v10.p0
    let v7: s0 = v1.p0
    var v6: Double = v4
    var v8: s0 = v2
    var v13: s1 = v10
    let v11: [s0] = v10.p0
    let v15: s0 = v10.p1
    v13.p0 = v11
    var v12: s1 = v10
    v13.p1 = v2
    let v14: s1 = s1(p0: v9, p1: v2)
    let v17: s0 = v9[0]
    let v35: s1 = f12(v4, v12)
    v9[0] = v15
    let v19: [[Double]] = v8.p1
    let v28: [s0] = v13.p0
    let v46: s0 = f7(v12, v17, v14)
    let v23: [Double] = v19[1]
    let v30: s0 = f7(v35, v7, v13)
    v8.p1 = v19
    v12.p0 = v5
    v8.p1 = v19
    let v44: Double = v23[0]
    let v54: [[Double]] = v46.p1
    v13.p0 = v28
    var v109: [Double] = v23
    let v110: [Double] = v54[0]
    var v97: [Double] = v109
    v13 = v12
    v109[0] = v44
    let v127: Double = v97[0]
    let v120: Double = v44 - v6
    v9[0] = v30
    v109 = v110
    v97[0] = v6
    let v294: Double = v127 * v120
    return v294
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])]
    let v1: s2 = s2(p0: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), p1: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]))
    let v2: s0 = s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])
    let v3: [s1] = [s1(p0: [s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])], p1: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])), s1(p0: [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])], p1: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])), s1(p0: [s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])], p1: s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]))]
    let v4: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
