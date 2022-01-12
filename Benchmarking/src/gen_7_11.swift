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
    var p0: [s1]
    var p1: s0
  }
  func f34(_ v0: s0) -> s0 {
    var v1: s0 = v0
    var v7: s0 = v1
    let v8: [[Double]] = v0.p0
    v1 = v7
    v1.p0 = v8
    let v6: [[Double]] = v1.p1
    v1.p1 = v6
    v7.p1 = v6
    let v12: [[Double]] = v1.p0
    let v18: [[Double]] = v0.p1
    let v15: [[Double]] = v0.p0
    let v21: [[Double]] = v1.p0
    let v33: [[Double]] = v1.p1
    v7.p1 = v6
    let v26: [[Double]] = v7.p1
    let v17: [[Double]] = v7.p0
    let v24: [[Double]] = v0.p1
    v7.p0 = v12
    let v54: [[[Double]]] = [v24, v26, v26, v6, v24, v18, v26]
    var v36: s0 = v1
    let v61: [[Double]] = v0.p1
    v36.p0 = v12
    var v29: [[[Double]]] = v54
    v1.p1 = v33
    v7.p0 = v17
    var v43: [[[Double]]] = v54
    v36.p0 = v21
    let v63: [[Double]] = v7.p1
    v1.p1 = v61
    let v37: [[Double]] = v0.p0
    v43[3] = v61
    let v42: [[Double]] = v1.p1
    let v56: [[Double]] = v36.p1
    let v101: [[Double]] = v0.p1
    v1 = v7
    v1.p0 = v15
    let v59: [[Double]] = v36.p0
    v1.p1 = v63
    let v80: [[Double]] = v43[1]
    let v57: [[Double]] = v7.p0
    let v152: [[Double]] = v29[0]
    v36.p0 = v59
    v36.p1 = v6
    let v118: [[[Double]]] = [v101]
    v7.p1 = v80
    var v138: [[[Double]]] = v118
    let v65: s0 = s0(p0: v37, p1: v24)
    v1.p1 = v56
    let v73: [[Double]] = v138[0]
    let v145: [[Double]] = v65.p1
    let v131: [[Double]] = v65.p0
    var v82: [[[Double]]] = v43
    let v151: [[Double]] = v0.p0
    let v213: [[Double]] = v82[4]
    v7.p0 = v21
    v36.p0 = v57
    v7.p1 = v213
    let v132: [[Double]] = v36.p1
    v1.p1 = v145
    let v196: [[Double]] = v36.p1
    v36.p1 = v132
    v36.p0 = v151
    v36.p1 = v42
    v7.p1 = v196
    let v221: s0 = s0(p0: v131, p1: v152)
    v1.p1 = v6
    v36.p1 = v73
    return v221
  }
  func f33(_ v0: s2) -> s2 {
    var v6: s2 = v0
    let v4: [s1] = v6.p0
    var v2: [s1] = v4
    let v8: s1 = v2[0]
    let v11: s1 = v4[0]
    let v7: [s0] = v8.p0
    v2[0] = v8
    var v3: [s1] = v2
    var v15: [s0] = v7
    v6.p0 = v4
    var v13: [s1] = v2
    var v12: [s0] = v15
    let v10: s1 = v13[0]
    let v20: s0 = v12[0]
    let v24: s0 = f34(v20)
    let v18: s0 = f34(v24)
    var v25: s0 = v18
    let v21: [s1] = v0.p0
    v13[0] = v11
    v13[0] = v10
    v12[1] = v18
    var v14: s1 = v8
    let v46: s0 = v14.p1
    v14 = v10
    v13[0] = v8
    v2[0] = v11
    let v22: s1 = v21[0]
    let v28: s2 = s2(p0: v3, p1: v25)
    v6.p1 = v46
    v13[0] = v22
    return v28
  }
  func f28(_ v0: s0) -> s0 {
    let v1: [[Double]] = v0.p1
    let v9: [Double] = v1[1]
    var v4: [[Double]] = v1
    let v11: s0 = f34(v0)
    let v2: s0 = f34(v0)
    let v12: s0 = f34(v2)
    let v21: [[Double]] = v11.p0
    let v19: s0 = f34(v0)
    let v28: [Double] = v4[0]
    let v16: s0 = f34(v19)
    let v27: [Double] = v21[1]
    let v26: s0 = f34(v12)
    let v66: [[Double]] = v16.p0
    var v57: [[Double]] = v4
    v57[1] = v28
    var v103: s0 = v26
    v103.p0 = v66
    v103.p1 = v57
    let v86: [[Double]] = v2.p1
    v57 = v86
    let v46: s0 = f34(v103)
    v57[0] = v27
    v4[0] = v9
    return v46
  }
  func f20(_ v0: s2, _ v1: s2) -> s2 {
    let v3: s0 = v0.p1
    var v7: s0 = v3
    let v4: [[Double]] = v3.p1
    v7.p1 = v4
    var v6: s0 = v7
    let v2: [[Double]] = v3.p0
    var v8: [[Double]] = v2
    let v9: [Double] = v8[0]
    let v5: s0 = s0(p0: v2, p1: v4)
    var v12: [[Double]] = v8
    let v13: s2 = f33(v0)
    let v14: [[Double]] = v5.p1
    v12[1] = v9
    let v18: [Double] = v8[0]
    v6.p0 = v12
    v8[1] = v9
    let v25: [Double] = v2[1]
    v8[0] = v25
    let v26: s2 = f33(v0)
    v7.p1 = v4
    var v19: [[Double]] = v4
    let v15: [[Double]] = v5.p0
    let v34: [[Double]] = v5.p1
    v7.p0 = v15
    let v17: s0 = f28(v6)
    v8[0] = v9
    v12[0] = v25
    v7.p0 = v15
    let v29: s2 = f33(v26)
    var v30: s0 = v6
    let v38: [[Double]] = v3.p0
    v19[1] = v18
    let v40: s0 = f34(v5)
    let v28: [[Double]] = v40.p0
    let v35: [[Double]] = v17.p0
    v12 = v35
    var v41: s0 = v3
    let v96: s0 = f34(v30)
    v30.p1 = v19
    var v69: [[Double]] = v38
    let v119: [[Double]] = v17.p1
    let v56: [[Double]] = v96.p1
    v41.p1 = v56
    v41.p1 = v119
    let v113: s0 = v1.p1
    var v82: [[Double]] = v4
    v82[2] = v18
    var v100: [[Double]] = v28
    var v98: s0 = v5
    var v44: [[Double]] = v14
    let v78: [Double] = v38[1]
    var v108: s2 = v29
    let v109: [[Double]] = v41.p1
    v98.p1 = v34
    v30.p0 = v35
    v108.p1 = v96
    v12[1] = v78
    v98 = v113
    var v66: [[Double]] = v69
    v30.p1 = v82
    v6 = v98
    v7.p0 = v100
    v69[1] = v9
    v6.p1 = v44
    v108.p1 = v98
    v41.p0 = v66
    let v202: [s1] = v13.p0
    v6.p1 = v109
    var v107: s2 = v108
    v6.p1 = v119
    v107.p0 = v202
    return v107
  }
  func f14(_ v0: s0) -> s0 {
    let v3: s0 = f28(v0)
    let v43: s0 = f28(v3)
    let v46: s0 = f28(v43)
    let v48: s0 = f34(v46)
    return v48
  }
  func f5(_ v0: s2, _ v1: s0) -> s0 {
    let v6: s0 = v0.p1
    let v5: s0 = f14(v6)
    var v10: s0 = v6
    v10 = v5
    return v10
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s2, _ v2: Double) -> Double {
    var v7: s2 = v1
    let v3: [s1] = v7.p0
    let v5: [s2] = [v1, v1, v1, v1, v1, v7]
    let v4: s1 = v3[0]
    let v8: s2 = v5[4]
    let v18: [s1] = v8.p0
    var v13: [s1] = v3
    let v6: s2 = f20(v1, v7)
    let v22: s1 = v0[0]
    v7.p0 = v18
    v7.p0 = v18
    v13 = v3
    v7.p0 = v13
    v7.p0 = v18
    let v19: s0 = v6.p1
    let v51: s0 = f28(v19)
    var v30: s1 = v4
    let v16: s0 = f5(v1, v19)
    v13[0] = v22
    let v37: [[Double]] = v16.p1
    v30.p1 = v51
    let v42: [Double] = v37[0]
    let v63: Double = v42[0]
    let v83: s0 = v6.p1
    v13[0] = v22
    var v122: s0 = v83
    var v65: Double = v63
    v122.p1 = v37
    var v72: Double = v65
    v13[0] = v30
    v7.p1 = v122
    return v72
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], p1: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])), s1(p0: [s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]), s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])], p1: s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]))]
    let v1: s2 = s2(p0: [s1(p0: [s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]), s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])], p1: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]]))], p1: s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]]))
    let v2: Double = 50.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 50.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
