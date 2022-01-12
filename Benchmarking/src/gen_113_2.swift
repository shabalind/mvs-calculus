  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: [s0]
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
  }
  func f37(_ v0: s0, _ v1: s0) -> s0 {
    let v3: [[Double]] = v1.p1
    let v4: [[Double]] = v0.p1
    let v7: [[Double]] = v1.p0
    var v6: [[Double]] = v7
    let v8: [Double] = v6[0]
    let v2: [[Double]] = v0.p1
    let v13: s0 = s0(p0: v7, p1: v2)
    var v5: [Double] = v8
    let v9: Double = v8[0]
    let v15: [Double] = v7[0]
    v6[0] = v5
    let v16: [[Double]] = v0.p0
    v6[0] = v15
    let v20: Double = v8[0]
    let v12: [Double] = v7[0]
    var v23: [[Double]] = v2
    var v10: [[Double]] = v3
    let v21: s0 = s0(p0: v16, p1: v2)
    v23 = v2
    var v25: [[Double]] = v10
    var v18: Double = v9
    let v14: [[Double]] = v13.p0
    let v42: Double = v15[0]
    v6[0] = v12
    var v19: [[Double]] = v7
    let v17: [Double] = v10[2]
    let v50: [Double] = v16[0]
    let v27: Double = v20 + v18
    v10 = v23
    var v35: [[Double]] = v14
    let v31: [[Double]] = v0.p1
    let v39: [[Double]] = v21.p1
    let v30: s0 = s0(p0: v19, p1: v4)
    var v72: Double = v18
    var v49: [[Double]] = v35
    let v38: [[[Double]]] = [v23, v23, v25, v10, v39, v31, v2]
    var v56: Double = v27
    let v54: [Double] = [v56, v72, v27, v56, v9]
    let v32: [[Double]] = v38[6]
    var v46: Double = v42
    let v115: [[[Double]]] = [v49, v6]
    var v37: s0 = v21
    v37.p1 = v23
    let v41: s0 = s0(p0: v16, p1: v32)
    var v128: s0 = v30
    v37.p1 = v4
    let v67: s0 = s0(p0: v14, p1: v32)
    var v95: Double = v46
    v37.p1 = v3
    let v152: [[Double]] = v13.p0
    let v71: [[Double]] = v115[1]
    v128.p1 = v3
    v128.p0 = v71
    let v80: [s0] = [v30, v21, v128, v1, v21]
    v128.p1 = v3
    v128.p0 = v152
    let v92: [[Double]] = v37.p1
    let v184: [Double] = v92[1]
    v35[0] = v17
    let v83: [[Double]] = v115[1]
    v19[0] = v5
    let v113: [[Double]] = v37.p0
    let v63: s0 = s0(p0: v83, p1: v2)
    v128 = v67
    v37.p0 = v14
    v128.p0 = v19
    let v82: s0 = v80[4]
    v128.p0 = v152
    let v77: [s0] = [v0, v63, v1, v30, v67, v41, v67]
    var v94: [Double] = v54
    v49[0] = v184
    var v121: [s0] = v77
    v37.p1 = v2
    let v86: [Double] = v14[0]
    v128.p0 = v113
    var v166: [s0] = v121
    v25[0] = v50
    v166[3] = v13
    var v244: [[Double]] = v4
    v128.p1 = v92
    let v230: Double = v94[4]
    v5[0] = v230
    let v191: s0 = v166[3]
    v5[0] = v95
    v19 = v113
    v128.p1 = v244
    v23[1] = v8
    let v132: [[Double]] = v82.p0
    v37.p0 = v132
    v5 = v86
    return v191
  }
  func f2(_ v0: s0, _ v1: Double) -> Double {
    var v7: s0 = v0
    let v3: s0 = f37(v7, v7)
    var v5: Double = v1
    var v6: Double = v1
    var v9: s0 = v7
    let v2: s0 = f37(v9, v7)
    var v17: s0 = v3
    let v10: [[Double]] = v17.p1
    let v14: [Double] = v10[0]
    let v34: [[Double]] = v2.p0
    let v16: Double = v14[0]
    let v20: Double = v14[0]
    let v21: Double = v14[0]
    var v69: [[Double]] = v10
    v7 = v9
    let v46: [Double] = [v16, v20, v6, v1, v5, v6, v21]
    var v24: [Double] = v46
    v17.p1 = v69
    v17.p0 = v34
    v17.p1 = v69
    v24[0] = v1
    let v26: Double = v24[3]
    return v26
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [s1], _ v2: s0, _ v3: [s2], _ v4: Double) -> Double {
    let v16: s1 = v0.p1
    let v20: s0 = v16.p1
    let v29: [[Double]] = v20.p1
    let v43: [Double] = v29[2]
    let v58: Double = v43[0]
    let v84: Double = f2(v2, v58)
    return v84
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])], p1: s1(p0: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), p1: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p2: [s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]), s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])]))
    let v1: [s1] = [s1(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), p1: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]), p2: [s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]), s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]])]), s1(p0: s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]]), p1: s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]]), p2: [s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]]), s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]]), s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]])]), s1(p0: s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]]), p1: s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]]), p2: [s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]]), s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]]), s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]])])]
    let v2: s0 = s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]])
    let v3: [s2] = [s2(p0: [s0(p0: [[88.0]], p1: [[89.0], [90.0], [91.0]])], p1: s1(p0: s0(p0: [[92.0]], p1: [[93.0], [94.0], [95.0]]), p1: s0(p0: [[96.0]], p1: [[97.0], [98.0], [99.0]]), p2: [s0(p0: [[100.0]], p1: [[101.0], [102.0], [103.0]]), s0(p0: [[104.0]], p1: [[105.0], [106.0], [107.0]]), s0(p0: [[108.0]], p1: [[109.0], [110.0], [111.0]])])), s2(p0: [s0(p0: [[112.0]], p1: [[113.0], [114.0], [115.0]])], p1: s1(p0: s0(p0: [[116.0]], p1: [[117.0], [118.0], [119.0]]), p1: s0(p0: [[120.0]], p1: [[121.0], [122.0], [123.0]]), p2: [s0(p0: [[124.0]], p1: [[125.0], [126.0], [127.0]]), s0(p0: [[128.0]], p1: [[129.0], [130.0], [131.0]]), s0(p0: [[132.0]], p1: [[133.0], [134.0], [135.0]])]))]
    let v4: Double = 136.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 136.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
