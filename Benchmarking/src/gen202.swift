  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [s0]
    var p1: [[s1]]
  }
  struct s4 {
    var p0: [s0]
    var p1: s1
  }
  struct s5 {
    var p0: s2
    var p1: [s1]
  }
  struct s7 {
    var p0: [s4]
    var p1: [s0]
    var p2: s0
    var p3: s5
    var p4: [s1]
  }
  func f82(_ v0: [[Double]], _ v1: s0) -> s0 {
    let v4: [[Double]] = v1.p1
    var v11: s0 = v1
    v11.p0 = v0
    var v14: s0 = v1
    v14.p1 = v4
    let v27: [[Double]] = v1.p1
    let v26: [[Double]] = v11.p1
    v14.p1 = v27
    let v31: [[Double]] = v14.p1
    v14.p1 = v26
    var v35: s0 = v1
    var v71: [[Double]] = v26
    v11.p0 = v0
    var v43: s0 = v35
    v14.p1 = v71
    let v68: [[Double]] = v14.p0
    var v54: [[Double]] = v26
    let v56: [s0] = [v14, v11, v35, v35, v35, v43, v35]
    v43.p1 = v31
    var v50: [[Double]] = v68
    v43.p1 = v71
    var v57: [[Double]] = v54
    v14.p0 = v50
    v11.p1 = v26
    let v133: s0 = v56[0]
    v14.p1 = v57
    v11.p1 = v4
    return v133
  }
  func f76(_ v0: s0, _ v1: s7) -> s0 {
    var v8: s7 = v1
    let v24: s0 = v8.p2
    let v10: [[Double]] = v0.p0
    let v18: s0 = f82(v10, v0)
    let v40: s0 = f82(v10, v0)
    let v21: [[Double]] = v18.p0
    v8.p2 = v24
    let v36: s5 = v8.p3
    v8 = v1
    v8.p3 = v36
    v8.p2 = v40
    let v48: [[Double]] = v18.p0
    v8.p3 = v36
    let v124: [[[Double]]] = [v21, v10, v48, v21, v21, v21]
    let v91: [[Double]] = v124[0]
    let v88: s0 = f82(v91, v24)
    return v88
  }
  func f59(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p0
    let v1: [[Double]] = v0.p1
    let v3: [Double] = v4[0]
    let v2: s0 = f82(v4, v0)
    var v7: [[Double]] = v1
    let v6: s0 = f82(v4, v2)
    let v15: [[Double]] = v6.p0
    let v11: [Double] = v1[0]
    v7[0] = v3
    var v16: [[Double]] = v15
    let v14: s0 = s0(p0: v16, p1: v7)
    v16[0] = v3
    v7[1] = v11
    return v14
  }
  func f48(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v6: s0 = f59(v5)
    let v4: [[Double]] = v5.p0
    let v7: s0 = f59(v6)
    var v9: s0 = v6
    v5.p0 = v4
    v9 = v7
    var v2: s0 = v7
    let v8: [Double] = v4[0]
    var v10: s0 = v5
    let v1: s0 = f82(v4, v5)
    let v14: [[Double]] = v1.p0
    let v11: s0 = f82(v4, v1)
    let v17: s0 = f59(v5)
    let v12: [[Double]] = v2.p1
    let v21: [Double] = v12[2]
    let v15: [[Double]] = v11.p1
    var v24: s0 = v11
    var v30: [[Double]] = v14
    let v26: [[Double]] = v9.p0
    let v20: s0 = f82(v4, v17)
    let v25: [[Double]] = v24.p1
    let v38: [Double] = v30[0]
    let v28: s0 = s0(p0: v26, p1: v25)
    var v33: [[Double]] = v12
    v2 = v11
    v30[0] = v21
    let v49: s0 = f82(v30, v28)
    v9.p0 = v26
    v33[1] = v8
    var v48: [[Double]] = v33
    v48 = v12
    v33[1] = v38
    v2.p0 = v14
    let v139: [[Double]] = v10.p1
    let v56: [[Double]] = v20.p0
    let v95: [[[Double]]] = [v30, v4, v56, v26]
    let v178: [[Double]] = v95[3]
    v5.p0 = v178
    v5.p1 = v48
    v5.p1 = v15
    v24.p1 = v139
    let v98: [[Double]] = v49.p0
    var v71: s0 = v24
    v71.p0 = v98
    return v71
  }
  func f31(_ v0: s7) -> s7 {
    var v2: s7 = v0
    v2 = v0
    var v7: s7 = v2
    let v8: s0 = v7.p2
    v2.p2 = v8
    v7.p2 = v8
    let v3: s0 = f76(v8, v0)
    v2 = v7
    let v9: [[Double]] = v3.p1
    v7.p2 = v3
    let v13: s0 = v7.p2
    v7.p2 = v13
    v7.p2 = v8
    let v6: s0 = f59(v8)
    let v11: s0 = f48(v8)
    var v15: s0 = v3
    v7.p2 = v15
    let v32: [[Double]] = v6.p0
    let v17: s0 = f82(v32, v11)
    v7.p2 = v17
    v15.p1 = v9
    return v7
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: Double) -> Double {
    let v2: s7 = f31(v0)
    var v7: Double = v1
    let v6: s0 = v2.p2
    let v11: [[Double]] = v6.p1
    let v3: [Double] = v11[0]
    var v16: [Double] = v3
    v16[0] = v7
    let v5: Double = v3[0]
    v16[0] = v1
    v16[0] = v5
    var v13: [Double] = v16
    v7 = v5
    var v50: [Double] = v13
    let v23: Double = v50[0]
    v13[0] = v23
    var v53: Double = v7
    v13[0] = v23
    v50[0] = v5
    v13[0] = v5
    let v68: Double = v5 * v23
    v16[0] = v53
    var v95: Double = v68
    v13[0] = v95
    return v95
  }
  func benchmark() {
    let v0: s7 = s7(p0: [s4(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])], p1: s1(p0: [[s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], [s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])]], p1: [[s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])], [s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])]])), s4(p0: [s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])], p1: s1(p0: [[s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])], [s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])], [s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]])]], p1: [[s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])], [s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])], [s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])]]))], p1: [s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])], p2: s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]]), p3: s5(p0: s2(p0: [s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]])], p1: [[s1(p0: [[s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]])], [s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]])], [s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]])]], p1: [[s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]])], [s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]])], [s0(p0: [[88.0]], p1: [[89.0], [90.0], [91.0]])]])]]), p1: [s1(p0: [[s0(p0: [[92.0]], p1: [[93.0], [94.0], [95.0]])], [s0(p0: [[96.0]], p1: [[97.0], [98.0], [99.0]])], [s0(p0: [[100.0]], p1: [[101.0], [102.0], [103.0]])]], p1: [[s0(p0: [[104.0]], p1: [[105.0], [106.0], [107.0]])], [s0(p0: [[108.0]], p1: [[109.0], [110.0], [111.0]])], [s0(p0: [[112.0]], p1: [[113.0], [114.0], [115.0]])]])]), p4: [s1(p0: [[s0(p0: [[116.0]], p1: [[117.0], [118.0], [119.0]])], [s0(p0: [[120.0]], p1: [[121.0], [122.0], [123.0]])], [s0(p0: [[124.0]], p1: [[125.0], [126.0], [127.0]])]], p1: [[s0(p0: [[128.0]], p1: [[129.0], [130.0], [131.0]])], [s0(p0: [[132.0]], p1: [[133.0], [134.0], [135.0]])], [s0(p0: [[136.0]], p1: [[137.0], [138.0], [139.0]])]])])
    let v1: Double = 140.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 140.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
