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
    var p0: [[s1]]
    var p1: s1
  }
  func f19(_ v0: s1) -> s1 {
    let v4: s0 = v0.p1
    let v5: s0 = v0.p1
    let v2: s1 = s1(p0: v4, p1: v4)
    var v3: s0 = v5
    var v6: s0 = v3
    var v7: s0 = v5
    let v8: [[Double]] = v4.p0
    let v9: [Double] = v8[1]
    var v1: [[Double]] = v8
    v3.p1 = v1
    v1[2] = v9
    var v10: [[Double]] = v8
    let v12: Double = v9[0]
    v1[1] = v9
    v6.p1 = v1
    v7.p1 = v8
    v6.p0 = v8
    v7.p1 = v10
    v3 = v7
    let v14: [[Double]] = v6.p0
    let v17: Double = v9[0]
    let v18: [[Double]] = v3.p1
    let v25: [Double] = v1[2]
    let v19: Double = v17 * v12
    let v16: Double = v25[0]
    var v33: s0 = v5
    let v21: Double = v19 * v19
    v33.p1 = v18
    v1[1] = v25
    v3.p0 = v18
    let v43: s0 = v2.p0
    v6.p1 = v1
    v10[1] = v25
    let v20: [Double] = v18[1]
    let v34: [[Double]] = v6.p1
    let v35: [Double] = v34[1]
    v1[1] = v20
    v10[2] = v25
    var v40: s0 = v33
    let v31: s0 = v2.p0
    let v44: [[Double]] = v31.p1
    let v36: [[Double]] = v4.p0
    v7.p1 = v14
    v1[1] = v25
    v6.p1 = v34
    var v49: s0 = v43
    var v53: [Double] = v35
    v10[2] = v53
    let v46: [[Double]] = v43.p0
    v53[0] = v16
    let v48: [[Double]] = v4.p0
    v6.p1 = v8
    v1 = v10
    let v60: [[Double]] = v6.p0
    let v61: s1 = s1(p0: v49, p1: v40)
    let v39: [Double] = v60[1]
    v1[2] = v35
    let v57: [Double] = v1[2]
    v1[1] = v57
    v7.p1 = v44
    v10 = v60
    v3.p0 = v48
    v33.p0 = v36
    v33.p0 = v46
    let v65: [Double] = v46[2]
    v53[0] = v21
    var v72: s1 = v61
    v10[2] = v39
    v10[1] = v65
    v33.p1 = v48
    return v72
  }
  func f14(_ v0: s0) -> s0 {
    var v1: s0 = v0
    let v3: [[Double]] = v0.p1
    let v8: [[Double]] = v0.p0
    v1.p1 = v8
    let v64: s1 = s1(p0: v1, p1: v1)
    let v49: s1 = f19(v64)
    let v66: [s1] = [v64, v64, v64, v49, v49]
    v1.p1 = v3
    let v62: s1 = v66[4]
    let v75: s0 = v62.p0
    return v75
  }
  func f9(_ v0: s0, _ v1: s0) -> s0 {
    var v6: s0 = v0
    var v3: s0 = v1
    v3 = v6
    let v13: [s0] = [v0]
    v3 = v0
    let v21: s0 = f14(v0)
    let v18: s0 = v13[0]
    var v10: s0 = v0
    let v9: [[Double]] = v21.p0
    let v14: [[Double]] = v10.p1
    var v17: [[Double]] = v14
    var v28: s0 = v18
    v6.p1 = v14
    let v24: s0 = v13[0]
    var v19: [s0] = v13
    v19[0] = v0
    v19[0] = v28
    v28.p1 = v9
    let v29: s0 = f14(v24)
    let v30: [[Double]] = v0.p1
    v19[0] = v29
    let v81: s0 = v13[0]
    let v43: s0 = v13[0]
    let v22: s0 = f14(v29)
    let v36: s0 = f14(v10)
    let v48: [[Double]] = v10.p1
    let v39: s0 = f14(v18)
    let v44: [Double] = v30[0]
    let v31: [[Double]] = v3.p0
    v28.p1 = v48
    var v40: [s0] = v19
    v40 = v19
    v10.p0 = v31
    v28 = v24
    v10.p1 = v17
    let v34: s0 = f14(v36)
    let v59: [[Double]] = v43.p0
    v17[0] = v44
    let v73: s0 = v40[0]
    v40[0] = v34
    v3.p0 = v31
    v40[0] = v39
    v40[0] = v22
    v28.p1 = v59
    v19[0] = v81
    let v160: s0 = f14(v73)
    return v160
  }
  func f5(_ v0: s1) -> s1 {
    var v6: s1 = v0
    let v3: s0 = v6.p1
    v6.p0 = v3
    let v4: [[Double]] = v3.p0
    var v13: s0 = v3
    let v11: s1 = f19(v0)
    v13.p0 = v4
    let v18: s0 = f14(v13)
    var v21: s1 = v0
    let v17: s0 = v11.p1
    let v14: s0 = v0.p0
    let v27: s0 = v21.p0
    let v29: s1 = f19(v6)
    let v24: s0 = f14(v27)
    let v37: s0 = v0.p1
    let v30: s0 = v6.p0
    v6.p0 = v37
    v21.p1 = v14
    let v32: s0 = f14(v30)
    let v42: s1 = f19(v29)
    let v43: [[Double]] = v17.p1
    let v26: [[Double]] = v14.p0
    let v36: [[Double]] = v37.p0
    let v39: s1 = f19(v42)
    v13.p0 = v26
    var v66: [[Double]] = v36
    var v101: s1 = v21
    v101.p0 = v32
    let v89: s0 = v42.p0
    let v109: s0 = v39.p1
    v21.p1 = v27
    let v54: [[Double]] = v89.p0
    v101.p1 = v18
    let v73: s0 = v11.p1
    v101.p1 = v27
    v13.p1 = v66
    let v93: s0 = s0(p0: v54, p1: v43)
    v6.p0 = v73
    v101.p1 = v93
    v6.p0 = v24
    v21.p0 = v109
    return v101
  }
  func f1(_ v0: [s2]) -> [s2] {
    let v3: [[s2]] = [v0, v0]
    var v8: [[s2]] = v3
    var v15: [[s2]] = v3
    v15 = v8
    let v37: [s2] = v3[0]
    v8[1] = v37
    let v81: [s2] = v15[0]
    var v118: [[s2]] = v8
    v8 = v118
    return v81
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    var v2: Double = v1
    let v4: [s2] = f1(v0)
    var v5: Double = v2
    var v3: [s2] = v4
    v3 = v4
    var v7: [s2] = v4
    var v8: [s2] = v3
    let v13: s2 = v3[1]
    var v11: s2 = v13
    let v15: [s2] = f1(v4)
    let v10: s2 = v15[1]
    let v22: s2 = v8[0]
    v7[0] = v13
    let v18: [s2] = f1(v15)
    var v16: s2 = v22
    let v21: s1 = v22.p1
    let v12: s1 = f5(v21)
    let v19: [s2] = f1(v0)
    var v33: s2 = v10
    let v35: s2 = v7[1]
    let v49: s1 = v11.p1
    v7 = v19
    let v36: s2 = v4[0]
    var v30: s2 = v35
    var v42: Double = v5
    let v25: [[s1]] = v36.p0
    var v32: [[s1]] = v25
    v3[1] = v33
    let v99: s1 = f5(v12)
    let v26: [[s1]] = v16.p0
    var v27: [[s1]] = v26
    let v67: s0 = v99.p0
    var v64: [[s1]] = v25
    let v84: [s1] = v26[0]
    let v40: s1 = v84[0]
    var v41: [[s1]] = v32
    v64[0] = v84
    let v47: [s2] = f1(v18)
    let v74: s0 = v40.p1
    v32[0] = v84
    let v90: s1 = f5(v40)
    v30.p1 = v40
    v30.p1 = v49
    let v130: s1 = f5(v12)
    let v144: s0 = f9(v74, v67)
    let v106: [s1] = v41[0]
    let v120: s0 = f14(v144)
    v30.p0 = v25
    v33.p0 = v27
    let v57: [[Double]] = v120.p1
    var v102: [s1] = v106
    v11.p1 = v99
    var v94: [[s1]] = v25
    v27[0] = v106
    var v50: [s1] = v84
    v16.p1 = v130
    let v95: [s1] = v27[0]
    v8[1] = v35
    v30.p0 = v94
    let v118: [Double] = v57[1]
    v8[1] = v30
    v41[0] = v95
    v3[0] = v10
    var v109: [s1] = v102
    v11.p1 = v90
    let v133: s1 = v109[0]
    v33.p1 = v133
    let v177: s2 = v47[0]
    v11.p0 = v27
    v64[0] = v50
    let v81: Double = v118[0]
    v16.p0 = v41
    v30.p0 = v64
    var v160: Double = v81
    v7[0] = v177
    let v105: Double = v160 / v42
    return v105
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [[s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]))]], p1: s1(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), p1: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]))), s2(p0: [[s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]))]], p1: s1(p0: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]]), p1: s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]])))]
    let v1: Double = 48.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 48.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
