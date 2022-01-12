  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [Double]
    var p4: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  func f79(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v3: [[Double]] = v0.p4
    let v8: [[Double]] = v5.p1
    let v4: s1 = s1(p0: v0, p1: v5)
    let v6: s1 = s1(p0: v5, p1: v5)
    v5.p1 = v8
    let v11: [[Double]] = v0.p2
    let v1: [Double] = v11[0]
    let v7: [[Double]] = [v1, v1, v1, v1]
    let v9: [[Double]] = v0.p1
    var v15: [Double] = v1
    let v10: [[Double]] = v0.p4
    v5.p4 = v10
    v15 = v1
    let v17: [[Double]] = v5.p1
    let v2: s0 = v4.p1
    var v14: [[Double]] = v3
    v5.p4 = v17
    v14[0] = v1
    let v20: [[Double]] = v5.p4
    let v25: s0 = v4.p0
    let v23: [Double] = v9[0]
    var v12: [Double] = v1
    let v24: s1 = s1(p0: v5, p1: v2)
    var v18: s1 = v24
    v14[0] = v12
    let v16: [Double] = v17[0]
    let v13: Double = v16[0]
    let v30: [Double] = v7[3]
    v15[0] = v13
    v14 = v10
    v14[0] = v12
    let v26: Double = v30[0]
    var v60: [[Double]] = v20
    let v35: s0 = v18.p1
    let v27: s0 = v24.p0
    let v32: [[Double]] = v35.p4
    v60[0] = v23
    v18.p0 = v27
    let v56: Double = v15[0]
    var v28: [[Double]] = v3
    let v48: [Double] = v11[0]
    v60[0] = v12
    v5.p1 = v60
    let v72: [[Double]] = v25.p0
    var v79: Double = v26
    v79 = v26
    let v74: [Double] = v25.p3
    v5.p3 = v74
    let v84: Double = v15[0]
    var v54: Double = v13
    var v57: [Double] = v23
    v5.p1 = v28
    var v73: Double = v84
    v14[0] = v57
    var v98: [Double] = v74
    let v85: Double = v74[0]
    v12[0] = v79
    v14[0] = v23
    let v43: s0 = s0(p0: v11, p1: v32, p2: v72, p3: v98, p4: v20)
    var v137: [Double] = v74
    let v40: [[Double]] = v43.p2
    v28[0] = v57
    v57[0] = v56
    v137[0] = v85
    let v81: s0 = v6.p1
    v137[0] = v73
    v98[1] = v54
    v18.p0 = v81
    let v179: s0 = s0(p0: v40, p1: v14, p2: v40, p3: v137, p4: v9)
    v28[0] = v48
    v137[0] = v56
    v5.p0 = v11
    v98[0] = v73
    v15[0] = v56
    v57[0] = v54
    return v179
  }
  func f73(_ v0: [s0]) -> [s0] {
    var v3: [s0] = v0
    var v1: [s0] = v3
    let v6: s0 = v1[1]
    var v8: s0 = v6
    let v4: s0 = f79(v6)
    let v2: [[Double]] = v8.p0
    let v10: s0 = f79(v4)
    let v18: s0 = f79(v4)
    var v9: [[Double]] = v2
    var v13: [s0] = v0
    let v12: [[Double]] = v10.p1
    let v20: [[Double]] = v6.p0
    let v35: s0 = f79(v10)
    v8.p2 = v20
    v1[2] = v35
    v13[2] = v18
    let v44: s0 = f79(v6)
    v8.p1 = v12
    v8.p1 = v12
    let v16: [Double] = v12[0]
    v8 = v6
    var v29: [[Double]] = v2
    var v39: s0 = v8
    let v31: [[Double]] = v10.p2
    v29[0] = v16
    v3 = v13
    let v51: s0 = f79(v44)
    v39.p0 = v20
    var v24: s0 = v39
    let v37: s0 = f79(v24)
    let v47: [[Double]] = v51.p1
    v24.p4 = v47
    v39.p2 = v9
    v39.p1 = v47
    v24.p1 = v12
    let v59: s0 = f79(v37)
    v39.p0 = v29
    v3[1] = v59
    v39.p0 = v31
    return v13
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v7: s2 = v0[1]
    let v2: [s0] = v7.p0
    let v4: [s0] = f73(v2)
    let v6: s0 = v4[1]
    let v3: s1 = s1(p0: v6, p1: v6)
    let v14: s0 = v3.p0
    let v33: [[Double]] = v14.p0
    let v9: [Double] = v33[1]
    var v23: [Double] = v9
    let v12: Double = v23[0]
    return v12
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]], p2: [[4.0], [5.0], [6.0]], p3: [7.0, 8.0], p4: [[9.0]]), s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0]], p2: [[14.0], [15.0], [16.0]], p3: [17.0, 18.0], p4: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]], p2: [[24.0], [25.0], [26.0]], p3: [27.0, 28.0], p4: [[29.0]])], p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0]], p2: [[34.0], [35.0], [36.0]], p3: [37.0, 38.0], p4: [[39.0]])), s2(p0: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]], p2: [[44.0], [45.0], [46.0]], p3: [47.0, 48.0], p4: [[49.0]]), s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0]], p2: [[54.0], [55.0], [56.0]], p3: [57.0, 58.0], p4: [[59.0]]), s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]], p2: [[64.0], [65.0], [66.0]], p3: [67.0, 68.0], p4: [[69.0]])], p1: s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0]], p2: [[74.0], [75.0], [76.0]], p3: [77.0, 78.0], p4: [[79.0]])), s2(p0: [s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]], p2: [[84.0], [85.0], [86.0]], p3: [87.0, 88.0], p4: [[89.0]]), s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0]], p2: [[94.0], [95.0], [96.0]], p3: [97.0, 98.0], p4: [[99.0]]), s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0]], p2: [[104.0], [105.0], [106.0]], p3: [107.0, 108.0], p4: [[109.0]])], p1: s0(p0: [[110.0], [111.0], [112.0]], p1: [[113.0]], p2: [[114.0], [115.0], [116.0]], p3: [117.0, 118.0], p4: [[119.0]]))]
    let v1: Double = 120.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 120.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
