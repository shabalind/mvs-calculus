  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: [s1]
  }
  func f51(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p0
    var v2: s0 = v0
    let v4: [[Double]] = v0.p0
    let v3: s0 = s0(p0: v5, p1: v4)
    v2.p1 = v4
    let v9: [s0] = [v3, v2]
    let v1: [[Double]] = v3.p0
    let v15: [[Double]] = v0.p1
    let v17: s0 = v9[1]
    v2.p1 = v4
    v2.p0 = v15
    let v12: [[Double]] = v2.p0
    let v10: s0 = s0(p0: v12, p1: v1)
    var v34: s0 = v0
    v2.p1 = v4
    var v28: [s0] = v9
    let v25: [[Double]] = v3.p1
    v28[1] = v2
    let v18: [[Double]] = v34.p0
    v2.p1 = v18
    v28[0] = v3
    let v23: [[Double]] = v2.p1
    v28[1] = v10
    let v47: [[Double]] = v34.p1
    v28[1] = v17
    var v19: s0 = v0
    let v26: s0 = v9[0]
    let v43: [[Double]] = v3.p1
    v2.p1 = v25
    var v56: [s0] = v9
    v19.p1 = v25
    v56[0] = v26
    v2.p0 = v43
    let v76: [[s0]] = [v28, v56]
    v19.p1 = v23
    let v107: [s0] = v76[0]
    v19.p0 = v47
    let v100: [[Double]] = v19.p1
    let v110: [[Double]] = v19.p0
    v34.p0 = v100
    v56[1] = v26
    v2.p1 = v110
    let v152: s0 = v107[1]
    return v152
  }
  func f46(_ v0: s0) -> s0 {
    var v1: s0 = v0
    let v5: s0 = f51(v1)
    let v7: s0 = f51(v1)
    let v3: s0 = f51(v5)
    let v8: [[Double]] = v1.p1
    let v4: [[Double]] = v3.p1
    let v14: [[Double]] = v7.p0
    let v6: [Double] = v14[0]
    var v13: s0 = v0
    let v11: [Double] = v8[0]
    let v15: s0 = f51(v0)
    let v23: [[Double]] = v15.p0
    let v12: [Double] = v8[1]
    v1.p0 = v14
    let v10: s0 = f51(v13)
    let v21: s0 = f51(v10)
    var v32: [[Double]] = v23
    let v22: [[Double]] = v10.p1
    v32[0] = v12
    var v20: [[Double]] = v14
    let v26: [[[Double]]] = [v4, v4, v20]
    let v59: s0 = f51(v3)
    var v30: s0 = v15
    var v46: [[[Double]]] = v26
    var v34: [[[Double]]] = v46
    var v33: [[[Double]]] = v26
    let v63: s0 = f51(v0)
    let v58: s0 = f51(v59)
    let v73: [[Double]] = v34[1]
    var v70: [[[Double]]] = v46
    v34 = v70
    v32[1] = v11
    v13.p0 = v73
    let v66: [[Double]] = v58.p0
    v34[0] = v22
    let v39: [[Double]] = v33[1]
    let v112: [[Double]] = v33[0]
    let v81: s0 = f51(v21)
    v1.p0 = v112
    let v124: [[Double]] = v7.p0
    let v128: s0 = f51(v10)
    let v110: [[Double]] = v63.p1
    v1.p0 = v20
    v1.p0 = v124
    let v163: [[Double]] = v81.p0
    v30.p1 = v32
    v13.p1 = v163
    v32[1] = v6
    let v174: s0 = f51(v128)
    v30.p1 = v4
    let v88: [[Double]] = v174.p1
    v20 = v39
    v30.p1 = v66
    v1.p0 = v110
    v30.p0 = v88
    v1.p0 = v112
    return v30
  }
  func f44(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v6: [[Double]] = v0.p1
    var v10: [[Double]] = v6
    let v5: [[Double]] = v4.p0
    let v13: s0 = s0(p0: v5, p1: v10)
    return v13
  }
  func f21(_ v0: s0) -> s0 {
    let v3: s0 = f44(v0)
    let v1: [[Double]] = v0.p0
    let v4: [Double] = v1[1]
    var v8: [[Double]] = v1
    let v2: [Double] = v1[0]
    var v6: s0 = v3
    let v5: [[Double]] = v0.p0
    let v36: [[Double]] = v0.p0
    var v15: s0 = v3
    let v13: s0 = f44(v15)
    v8[1] = v4
    v8[1] = v2
    let v25: [[Double]] = v6.p0
    v6.p0 = v5
    v6.p0 = v5
    var v27: s0 = v3
    let v30: [[Double]] = v27.p0
    let v40: [[Double]] = v13.p0
    let v66: [[Double]] = v27.p0
    let v60: s0 = f46(v6)
    v27.p0 = v36
    v6.p1 = v66
    v15.p0 = v1
    let v70: [[Double]] = v60.p0
    v6.p0 = v36
    v6.p0 = v8
    v27.p1 = v1
    v15.p0 = v5
    v27.p1 = v25
    var v191: s0 = v15
    v27.p0 = v1
    v27.p0 = v40
    v191.p0 = v30
    let v394: [[Double]] = v191.p0
    v15.p0 = v70
    v15.p0 = v394
    return v191
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [[s2]], _ v2: Double) -> Double {
    let v3: [s2] = v1[1]
    let v5: s2 = v3[0]
    let v10: [[Double]] = v0.p1
    var v4: [[Double]] = v10
    let v25: s0 = v5.p0
    let v16: s0 = f51(v25)
    var v12: [[Double]] = v10
    let v9: [[Double]] = v16.p1
    let v17: s0 = f21(v0)
    let v29: [[Double]] = v17.p1
    let v24: [Double] = v12[1]
    var v37: [[Double]] = v4
    let v39: [Double] = v29[0]
    let v55: [Double] = v9[0]
    v37[1] = v39
    v37[0] = v24
    v37[1] = v39
    v12[0] = v55
    v12[0] = v24
    let v91: [Double] = v37[1]
    var v152: [Double] = v91
    let v229: Double = v152[0]
    return v229
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])
    let v1: [[s2]] = [[s2(p0: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), p1: [s1(p0: [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], p1: [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])]), s1(p0: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])], p1: [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])])])], [s2(p0: s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]]), p1: [s1(p0: [s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]])], p1: [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]), s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]])]), s1(p0: [s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]])], p1: [s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]]), s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]])])])], [s2(p0: s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]]), p1: [s1(p0: [s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]])], p1: [s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]]), s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0]])]), s1(p0: [s0(p0: [[76.0], [77.0]], p1: [[78.0], [79.0]])], p1: [s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0]]), s0(p0: [[84.0], [85.0]], p1: [[86.0], [87.0]])])])]]
    let v2: Double = 88.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 88.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
