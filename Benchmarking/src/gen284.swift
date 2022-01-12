  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
    var p2: [[s0]]
  }
  struct s2 {
    var p0: s1
    var p1: [s1]
  }
  func f79(_ v0: s1) -> s1 {
    let v3: [s1] = [v0, v0, v0, v0, v0, v0, v0]
    let v9: s1 = v3[3]
    return v9
  }
  func f77(_ v0: [s2]) -> [s2] {
    var v3: [s2] = v0
    var v4: [s2] = v3
    let v6: s2 = v3[0]
    let v2: s1 = v6.p0
    var v7: [s2] = v3
    var v5: s2 = v6
    let v13: s1 = f79(v2)
    v5.p0 = v2
    let v10: [[s0]] = v2.p2
    let v1: s1 = f79(v13)
    v5.p0 = v1
    v4[0] = v6
    let v14: s1 = f79(v1)
    let v11: s1 = v6.p0
    let v9: s2 = v4[0]
    let v12: [s0] = v10[0]
    v5.p0 = v13
    v3[0] = v9
    let v8: [[s0]] = v2.p1
    let v25: s1 = f79(v13)
    v3[0] = v5
    let v16: s1 = f79(v14)
    v3[0] = v5
    v7[0] = v5
    var v19: s1 = v11
    let v36: s2 = v0[0]
    v5.p0 = v13
    let v27: [[s2]] = [v7, v3, v7]
    let v24: [s0] = v8[0]
    let v30: s1 = f79(v19)
    v7[0] = v36
    var v26: [s2] = v4
    let v23: s1 = v36.p0
    let v42: s2 = v26[0]
    let v38: s1 = f79(v30)
    let v20: [[s0]] = v23.p2
    v3[0] = v5
    var v50: s2 = v9
    let v54: [s1] = v50.p1
    let v58: s1 = f79(v38)
    var v90: s2 = v42
    var v79: [s2] = v4
    var v46: [[s0]] = v20
    v46[0] = v12
    v3 = v0
    v46[0] = v24
    v19.p1 = v8
    v7[0] = v5
    let v48: s1 = f79(v30)
    v5.p1 = v54
    let v83: [s1] = v6.p1
    v19 = v13
    let v67: s1 = f79(v48)
    v3[0] = v42
    let v57: s1 = f79(v58)
    let v55: s1 = f79(v67)
    v4[0] = v6
    var v65: [s1] = v54
    let v72: [s2] = v27[2]
    v90.p0 = v48
    v90.p0 = v23
    let v100: s0 = v24[0]
    let v133: s1 = f79(v1)
    let v98: [[s0]] = v57.p2
    let v70: s2 = s2(p0: v16, p1: v65)
    v46 = v98
    v65[0] = v133
    v90.p0 = v55
    v3 = v79
    v19.p1 = v98
    let v137: s1 = f79(v25)
    v50.p0 = v137
    v79[0] = v90
    v79[0] = v70
    v19.p0 = v100
    v19.p1 = v46
    v5.p1 = v83
    return v72
  }
  func f53(_ v0: [[Double]], _ v1: s0) -> s0 {
    var v2: s0 = v1
    v2.p1 = v0
    let v5: [Double] = v0[0]
    v2.p1 = v0
    var v10: [[Double]] = v0
    let v8: [[Double]] = v1.p1
    var v9: [[Double]] = v8
    let v6: [[Double]] = v2.p1
    let v7: Double = v5[0]
    let v4: Double = v5[0]
    v2.p1 = v8
    let v13: Double = v5[0]
    v2.p1 = v9
    let v12: Double = v5[0]
    let v17: [[Double]] = v1.p0
    var v16: [[Double]] = v9
    var v15: Double = v12
    v16[1] = v5
    var v11: [[Double]] = v6
    var v26: [Double] = v5
    let v25: [[Double]] = v2.p1
    var v21: [Double] = v26
    let v37: [Double] = v0[0]
    v2.p1 = v11
    var v22: [[Double]] = v17
    let v20: [[Double]] = v2.p0
    var v23: [Double] = v37
    v2.p0 = v22
    v2.p1 = v10
    let v18: Double = v21[0]
    let v31: [[Double]] = v1.p1
    v2.p0 = v22
    v2.p0 = v17
    var v24: Double = v7
    v10[0] = v37
    let v27: [Double] = v25[1]
    let v36: [[Double]] = v2.p1
    let v48: Double = v23[0]
    let v62: [[Double]] = v2.p0
    let v33: Double = v5[0]
    let v38: [[[Double]]] = [v17, v20, v17]
    let v50: [[Double]] = v1.p0
    v2.p0 = v62
    var v32: [Double] = v37
    let v19: Double = v32[0]
    var v42: [[[Double]]] = v38
    v2.p0 = v62
    v26[0] = v24
    var v41: [[Double]] = v17
    let v29: [[Double]] = v1.p0
    var v56: Double = v48
    let v64: [[Double]] = v2.p0
    v2.p1 = v16
    v32 = v23
    v23[0] = v18
    var v30: [[[Double]]] = v38
    let v67: [Double] = v41[0]
    v30 = v38
    let v91: [[Double]] = v1.p1
    v11[0] = v5
    v2.p0 = v29
    var v51: s0 = v2
    let v72: [Double] = v50[0]
    let v85: [[Double]] = v1.p0
    var v35: [Double] = v67
    v41[0] = v23
    let v39: [Double] = [v12, v48, v4]
    let v66: [[Double]] = v30[0]
    var v53: s0 = v51
    var v43: [[[Double]]] = v42
    let v49: s0 = s0(p0: v64, p1: v8)
    let v44: [[Double]] = v51.p1
    let v79: [[Double]] = v49.p1
    v42[1] = v20
    v51.p0 = v66
    v16[0] = v23
    v9[0] = v32
    v21[0] = v33
    let v80: Double = v27[0]
    var v57: [Double] = v39
    let v81: [[Double]] = v43[0]
    v51.p0 = v29
    v32[0] = v7
    v11[0] = v67
    var v99: [Double] = v57
    var v94: [[Double]] = v16
    v51.p0 = v20
    v51.p1 = v79
    v2.p1 = v44
    var v70: Double = v15
    v57[0] = v13
    let v71: s0 = s0(p0: v85, p1: v91)
    v53.p0 = v64
    v51 = v1
    let v115: Double = v13 * v80
    v2.p0 = v17
    v11[0] = v72
    v23 = v32
    v57[2] = v115
    let v119: [[Double]] = v71.p0
    v53.p0 = v81
    v53.p1 = v94
    let v141: Double = v99[0]
    v32[0] = v4
    v51.p0 = v119
    v9[1] = v35
    let v293: Double = v141 * v12
    var v210: s0 = v53
    v32[0] = v70
    v26[0] = v141
    v2.p0 = v85
    v70 = v293
    let v165: [Double] = v36[1]
    v51.p1 = v16
    v51.p1 = v91
    v99[2] = v56
    v2.p1 = v31
    var v194: s0 = v210
    v99[1] = v19
    v53.p1 = v79
    v41[0] = v165
    return v194
  }
  func f48(_ v0: [s1], _ v1: s2) -> s2 {
    return v1
  }
  func f36(_ v0: [[s2]]) -> [[s2]] {
    var v6: [[s2]] = v0
    var v3: [[s2]] = v0
    var v2: [[s2]] = v6
    let v8: [s2] = v6[0]
    let v5: s2 = v8[0]
    let v19: [s2] = f77(v8)
    var v31: [s2] = v19
    let v15: s2 = v31[0]
    v3[0] = v19
    var v24: [s2] = v31
    v6[0] = v24
    let v30: s2 = v19[0]
    let v36: [s1] = v15.p1
    var v46: [[s2]] = v2
    let v60: s2 = f48(v36, v30)
    let v48: s2 = f48(v36, v60)
    v2 = v3
    v24[0] = v48
    v31[0] = v5
    return v46
  }
  func f17(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v4: [[Double]] = v0.p1
    v5.p1 = v4
    let v2: s0 = f53(v4, v0)
    let v9: [Double] = v4[1]
    var v13: s0 = v2
    let v6: [Double] = v4[0]
    let v11: s0 = f53(v4, v13)
    let v21: [[Double]] = v2.p1
    let v14: [Double] = v21[0]
    var v17: [[Double]] = v21
    let v23: s0 = f53(v4, v2)
    v17[1] = v9
    let v15: [[Double]] = v23.p0
    v17 = v4
    let v30: s0 = f53(v21, v13)
    let v16: [[Double]] = v30.p1
    v13.p0 = v15
    let v18: [Double] = v21[0]
    let v19: [[Double]] = v11.p0
    let v20: s0 = f53(v21, v13)
    v13.p1 = v17
    let v27: [[Double]] = v20.p1
    let v41: [[Double]] = v20.p1
    v17[0] = v14
    let v26: [Double] = v19[0]
    let v22: s0 = f53(v16, v2)
    var v32: [[Double]] = v41
    let v91: [[Double]] = v22.p0
    var v35: [[Double]] = v21
    let v101: s0 = f53(v32, v11)
    let v56: [[Double]] = v5.p0
    v5.p0 = v15
    v32 = v41
    let v146: s0 = f53(v35, v101)
    var v79: [[Double]] = v41
    v5.p1 = v79
    v5.p0 = v91
    v35[1] = v6
    v32[1] = v26
    v13.p0 = v56
    v35[1] = v18
    v5.p0 = v15
    v5.p1 = v27
    v5.p0 = v56
    return v146
  }
  func f13(_ v0: [[s2]]) -> [[s2]] {
    let v6: [s2] = v0[0]
    let v7: [s2] = f77(v6)
    var v15: [s2] = v7
    let v13: [[s2]] = f36(v0)
    var v14: [[s2]] = v13
    var v17: [[s2]] = v14
    v17[0] = v15
    return v17
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: [[s2]], _ v2: Double) -> Double {
    let v5: [s2] = v1[0]
    var v7: [s2] = v5
    let v11: [[s2]] = f13(v1)
    let v8: [s2] = v11[0]
    let v29: s2 = v7[0]
    let v25: [s1] = v29.p1
    let v52: s1 = v29.p0
    let v58: s2 = s2(p0: v52, p1: v25)
    let v78: [s1] = v58.p1
    var v27: s1 = v52
    let v54: s0 = v27.p0
    let v39: s0 = f17(v54)
    let v47: s2 = v8[0]
    let v24: s1 = v78[1]
    let v92: [[s0]] = v24.p2
    v27.p1 = v92
    v27.p2 = v92
    v7[0] = v47
    v27.p2 = v92
    let v96: [[Double]] = v39.p1
    let v144: [Double] = v96[0]
    var v93: [Double] = v144
    let v99: Double = v93[0]
    return v99
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: [[s0(p0: [[3.0]], p1: [[4.0], [5.0]])]], p2: [[s0(p0: [[6.0]], p1: [[7.0], [8.0]])]]), p1: [s1(p0: s0(p0: [[9.0]], p1: [[10.0], [11.0]]), p1: [[s0(p0: [[12.0]], p1: [[13.0], [14.0]])]], p2: [[s0(p0: [[15.0]], p1: [[16.0], [17.0]])]]), s1(p0: s0(p0: [[18.0]], p1: [[19.0], [20.0]]), p1: [[s0(p0: [[21.0]], p1: [[22.0], [23.0]])]], p2: [[s0(p0: [[24.0]], p1: [[25.0], [26.0]])]])]), s2(p0: s1(p0: s0(p0: [[27.0]], p1: [[28.0], [29.0]]), p1: [[s0(p0: [[30.0]], p1: [[31.0], [32.0]])]], p2: [[s0(p0: [[33.0]], p1: [[34.0], [35.0]])]]), p1: [s1(p0: s0(p0: [[36.0]], p1: [[37.0], [38.0]]), p1: [[s0(p0: [[39.0]], p1: [[40.0], [41.0]])]], p2: [[s0(p0: [[42.0]], p1: [[43.0], [44.0]])]]), s1(p0: s0(p0: [[45.0]], p1: [[46.0], [47.0]]), p1: [[s0(p0: [[48.0]], p1: [[49.0], [50.0]])]], p2: [[s0(p0: [[51.0]], p1: [[52.0], [53.0]])]])])]
    let v1: [[s2]] = [[s2(p0: s1(p0: s0(p0: [[54.0]], p1: [[55.0], [56.0]]), p1: [[s0(p0: [[57.0]], p1: [[58.0], [59.0]])]], p2: [[s0(p0: [[60.0]], p1: [[61.0], [62.0]])]]), p1: [s1(p0: s0(p0: [[63.0]], p1: [[64.0], [65.0]]), p1: [[s0(p0: [[66.0]], p1: [[67.0], [68.0]])]], p2: [[s0(p0: [[69.0]], p1: [[70.0], [71.0]])]]), s1(p0: s0(p0: [[72.0]], p1: [[73.0], [74.0]]), p1: [[s0(p0: [[75.0]], p1: [[76.0], [77.0]])]], p2: [[s0(p0: [[78.0]], p1: [[79.0], [80.0]])]])])]]
    let v2: Double = 81.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 81.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
