  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: [s1]
  }
  struct s4 {
    var p0: [s0]
    var p1: s1
  }
  struct s5 {
    var p0: [s0]
    var p1: [s4]
  }
  func f89(_ v0: s4, _ v1: s5) -> s5 {
    return v1
  }
  func f88(_ v0: s1) -> s1 {
    let v5: [s0] = v0.p1
    let v8: s0 = v5[1]
    var v2: s0 = v8
    let v4: s0 = v0.p0
    var v7: [s0] = v5
    let v3: [[Double]] = v8.p1
    let v9: [Double] = v3[0]
    v7[0] = v2
    v2.p1 = v3
    let v6: [[Double]] = v8.p1
    v2.p1 = v6
    let v10: s0 = v5[2]
    let v17: [s0] = v0.p1
    var v14: [s0] = v7
    let v12: [[Double]] = v10.p1
    let v26: [Double] = v6[0]
    let v30: [[Double]] = v8.p0
    var v37: [Double] = v26
    let v25: [Double] = v3[0]
    var v104: [[Double]] = v30
    let v27: s0 = s0(p0: v104, p1: v12)
    v104[0] = v9
    v104[0] = v37
    let v43: [[Double]] = v27.p0
    let v40: [s0] = v0.p1
    v2.p0 = v43
    v7 = v17
    let v96: Double = v25[0]
    v37[0] = v96
    let v60: s0 = v40[0]
    v14[2] = v4
    let v62: s1 = s1(p0: v60, p1: v14)
    return v62
  }
  func f85(_ v0: s0, _ v1: [s5]) -> s0 {
    var v3: s0 = v0
    let v4: [s0] = [v3]
    let v8: [[Double]] = v0.p1
    let v6: [[Double]] = v0.p0
    let v2: [[Double]] = v3.p1
    v3.p1 = v8
    var v5: [[Double]] = v6
    v3.p1 = v2
    v3.p0 = v6
    let v7: [Double] = v2[0]
    v3.p1 = v2
    let v14: [[Double]] = v3.p1
    v5[0] = v7
    v3.p0 = v5
    v3.p1 = v8
    let v16: [[Double]] = v3.p0
    v5[0] = v7
    let v22: [Double] = v2[0]
    v3.p1 = v8
    let v21: s0 = v4[0]
    v3.p0 = v6
    v5[0] = v22
    v5[0] = v7
    v3.p1 = v14
    v3.p0 = v16
    v3.p0 = v16
    let v25: s0 = v4[0]
    let v45: [[Double]] = v25.p1
    v3.p1 = v45
    return v21
  }
  func f84(_ v0: s1) -> s1 {
    var v2: s1 = v0
    v2 = v0
    var v3: s1 = v0
    let v12: s0 = v0.p0
    let v6: [[Double]] = v12.p0
    var v4: s0 = v12
    let v9: s1 = f88(v3)
    var v8: [[Double]] = v6
    let v11: [s0] = v0.p1
    let v10: [s0] = v2.p1
    v4 = v12
    v4.p0 = v8
    let v14: [s0] = v0.p1
    var v17: [s0] = v10
    let v21: [Double] = v8[0]
    var v26: [[Double]] = v6
    let v19: s0 = v9.p0
    v17[0] = v19
    let v33: s0 = v11[1]
    v4.p0 = v26
    var v23: [s0] = v14
    let v32: [Double] = v6[0]
    v26[0] = v32
    let v28: [s0] = v0.p1
    let v71: s1 = f88(v9)
    v23[0] = v33
    let v62: s1 = f88(v2)
    v23[2] = v4
    v26[0] = v21
    v2.p1 = v17
    v8[0] = v32
    let v141: s0 = v11[1]
    let v109: [[Double]] = v141.p1
    let v70: s0 = v23[0]
    let v116: [s0] = v71.p1
    var v148: [[Double]] = v109
    let v176: s0 = v62.p0
    v23[0] = v176
    var v204: s1 = v3
    let v98: s0 = v116[0]
    let v81: s1 = f88(v204)
    v4.p1 = v148
    let v147: s0 = v17[0]
    v2.p0 = v147
    v204.p0 = v70
    let v150: s1 = f88(v81)
    v204.p1 = v28
    v17[1] = v98
    return v150
  }
  func f70(_ v0: s5) -> s5 {
    let v2: [s0] = v0.p0
    var v5: [s0] = v2
    var v6: s5 = v0
    let v3: s0 = v2[0]
    v5[0] = v3
    v6.p0 = v2
    v6.p0 = v5
    let v9: s0 = v2[0]
    v6.p0 = v5
    let v19: [s4] = v6.p1
    v5[0] = v9
    v5[0] = v3
    v6.p1 = v19
    v6.p1 = v19
    return v6
  }
  func f62(_ v0: s5) -> s5 {
    let v7: s5 = f70(v0)
    let v5: [s4] = v0.p1
    var v8: s5 = v7
    let v20: [s4] = v8.p1
    v8.p1 = v5
    let v9: s5 = f70(v8)
    let v13: s4 = v20[0]
    let v10: s4 = v20[0]
    let v18: s4 = v20[0]
    let v16: [s0] = v10.p0
    let v12: s0 = v16[0]
    var v15: s0 = v12
    let v14: [s4] = v7.p1
    v8 = v0
    let v21: s5 = f89(v18, v9)
    var v31: [s0] = v16
    v31[1] = v12
    let v26: s1 = v13.p1
    v31[0] = v15
    v31[0] = v15
    let v80: s1 = f88(v26)
    let v60: s1 = f84(v80)
    let v47: s1 = f88(v60)
    var v89: [s0] = v31
    v8.p1 = v14
    let v108: s4 = s4(p0: v89, p1: v47)
    let v113: s5 = f89(v108, v21)
    return v113
  }
  func f44(_ v0: s1, _ v1: s0) -> s0 {
    let v2: [s0] = v0.p1
    var v4: s0 = v1
    var v5: [s0] = v2
    let v9: s0 = v5[1]
    v5[0] = v4
    let v26: [[Double]] = v1.p1
    v4.p1 = v26
    return v9
  }
  func f27(_ v0: [s0]) -> [s0] {
    return v0
  }
  func f20(_ v0: s5) -> s5 {
    let v5: s5 = f62(v0)
    let v6: [s0] = v0.p0
    let v1: [s0] = v0.p0
    let v2: [s0] = v0.p0
    let v11: [s0] = f27(v1)
    let v7: s0 = v11[0]
    let v8: [s0] = f27(v6)
    let v16: [[Double]] = v7.p0
    let v10: [[Double]] = v7.p0
    let v13: s5 = f62(v5)
    let v14: [Double] = v10[0]
    var v18: s5 = v5
    let v30: s0 = v6[0]
    let v17: s0 = v2[0]
    let v27: [s0] = v13.p0
    v18.p0 = v2
    var v84: [[Double]] = v16
    v84[0] = v14
    let v29: s5 = f70(v18)
    var v19: [[Double]] = v84
    let v36: [[Double]] = v17.p1
    let v20: [s0] = v5.p0
    var v52: [s0] = v27
    v18.p0 = v52
    let v59: s0 = s0(p0: v19, p1: v36)
    v18.p0 = v52
    var v41: [[Double]] = v36
    let v26: [Double] = v41[0]
    let v31: s5 = f62(v13)
    let v60: [s0] = [v30, v7, v59]
    let v77: [Double] = v36[0]
    let v89: s0 = v60[2]
    v18.p0 = v8
    let v158: s1 = s1(p0: v17, p1: v60)
    var v69: s0 = v17
    v69.p0 = v16
    v18.p0 = v20
    let v79: s5 = f70(v31)
    let v58: [[Double]] = v7.p0
    let v67: s1 = f84(v158)
    let v91: [s0] = v158.p1
    let v86: [s4] = v29.p1
    var v80: [Double] = v26
    var v50: s1 = v67
    var v74: [s4] = v86
    let v178: s0 = f44(v50, v69)
    let v93: s1 = s1(p0: v89, p1: v91)
    v18.p1 = v74
    let v176: [Double] = v58[0]
    v19[0] = v77
    v50.p0 = v7
    let v247: s0 = f44(v93, v178)
    v52[0] = v247
    v18.p1 = v86
    let v126: s4 = v86[0]
    v69.p0 = v84
    var v153: s4 = v126
    v84[0] = v176
    v84[0] = v80
    v69.p0 = v16
    let v144: s5 = f89(v153, v79)
    return v144
  }
  func f2(_ v0: s0) -> s0 {
    return v0
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s1, _ v2: [[s5]], _ v3: s2, _ v4: Double) -> Double {
    let v5: [s5] = v2[1]
    let v9: [s5] = v2[1]
    let v6: s0 = f2(v0)
    var v16: [s5] = v9
    var v13: s0 = v6
    let v26: [[Double]] = v6.p0
    let v14: s0 = f85(v13, v16)
    let v39: s5 = v5[0]
    v16[0] = v39
    let v33: [[Double]] = v14.p0
    let v31: s5 = f20(v39)
    var v66: [[Double]] = v33
    v66 = v26
    let v50: [Double] = v66[0]
    let v89: Double = v50[0]
    v16[0] = v31
    return v89
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0]])
    let v1: s1 = s1(p0: s0(p0: [[3.0]], p1: [[4.0], [5.0]]), p1: [s0(p0: [[6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0]])])
    let v2: [[s5]] = [[s5(p0: [s0(p0: [[15.0]], p1: [[16.0], [17.0]])], p1: [s4(p0: [s0(p0: [[18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0]], p1: [[22.0], [23.0]])], p1: s1(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0]]), p1: [s0(p0: [[27.0]], p1: [[28.0], [29.0]]), s0(p0: [[30.0]], p1: [[31.0], [32.0]]), s0(p0: [[33.0]], p1: [[34.0], [35.0]])]))])], [s5(p0: [s0(p0: [[36.0]], p1: [[37.0], [38.0]])], p1: [s4(p0: [s0(p0: [[39.0]], p1: [[40.0], [41.0]]), s0(p0: [[42.0]], p1: [[43.0], [44.0]])], p1: s1(p0: s0(p0: [[45.0]], p1: [[46.0], [47.0]]), p1: [s0(p0: [[48.0]], p1: [[49.0], [50.0]]), s0(p0: [[51.0]], p1: [[52.0], [53.0]]), s0(p0: [[54.0]], p1: [[55.0], [56.0]])]))])]]
    let v3: s2 = s2(p0: s1(p0: s0(p0: [[57.0]], p1: [[58.0], [59.0]]), p1: [s0(p0: [[60.0]], p1: [[61.0], [62.0]]), s0(p0: [[63.0]], p1: [[64.0], [65.0]]), s0(p0: [[66.0]], p1: [[67.0], [68.0]])]), p1: [s1(p0: s0(p0: [[69.0]], p1: [[70.0], [71.0]]), p1: [s0(p0: [[72.0]], p1: [[73.0], [74.0]]), s0(p0: [[75.0]], p1: [[76.0], [77.0]]), s0(p0: [[78.0]], p1: [[79.0], [80.0]])]), s1(p0: s0(p0: [[81.0]], p1: [[82.0], [83.0]]), p1: [s0(p0: [[84.0]], p1: [[85.0], [86.0]]), s0(p0: [[87.0]], p1: [[88.0], [89.0]]), s0(p0: [[90.0]], p1: [[91.0], [92.0]])])])
    let v4: Double = 93.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 93.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
