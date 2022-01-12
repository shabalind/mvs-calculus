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
    var p0: [s0]
    var p1: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: s2
    var p2: [s0]
  }
  struct s4 {
    var p0: [s3]
    var p1: s1
  }
  struct s7 {
    var p0: [Double]
    var p1: s2
  }
  func f110(_ v0: Double) -> Double {
    let v6: Double = v0 - v0
    var v2: Double = v0
    var v8: Double = v2
    var v7: Double = v6
    v7 = v8
    let v14: [Double] = [v7]
    let v32: [[Double]] = [v14, v14, v14, v14, v14, v14, v14]
    let v43: [Double] = v32[4]
    var v36: [Double] = v43
    let v35: Double = v36[0]
    return v35
  }
  func f83(_ v0: s7) -> s7 {
    let v3: s2 = v0.p1
    let v1: [s0] = v3.p0
    let v4: s0 = v1[1]
    let v10: [[Double]] = v4.p0
    let v36: [Double] = v0.p0
    let v35: [Double] = v10[1]
    let v32: Double = v35[0]
    var v48: [Double] = v36
    v48[1] = v32
    let v130: s7 = s7(p0: v48, p1: v3)
    return v130
  }
  func f80(_ v0: s7) -> s7 {
    let v2: s2 = v0.p1
    var v3: s7 = v0
    let v5: s7 = f83(v3)
    let v19: s7 = f83(v3)
    let v30: [Double] = v5.p0
    let v41: s7 = f83(v19)
    var v57: [Double] = v30
    let v25: Double = v57[0]
    v3.p0 = v57
    v57[0] = v25
    var v46: [Double] = v30
    let v31: [Double] = v41.p0
    let v158: [[Double]] = [v30, v31, v46, v31, v57, v31, v30]
    let v54: [Double] = v158[1]
    let v173: s7 = s7(p0: v54, p1: v2)
    var v143: s7 = v173
    return v143
  }
  func f70(_ v0: s7) -> s7 {
    let v4: s2 = v0.p1
    let v3: s7 = f80(v0)
    let v5: s7 = f83(v0)
    let v29: s2 = v5.p1
    let v23: s2 = v5.p1
    let v16: [s0] = v23.p0
    var v25: s7 = v3
    let v21: [s0] = v23.p1
    let v13: s2 = v0.p1
    let v17: s0 = v16[0]
    v25.p1 = v4
    let v26: s2 = s2(p0: v21, p1: v21)
    var v27: [s0] = v16
    let v34: [s0] = v26.p1
    v25.p1 = v29
    let v61: s2 = v25.p1
    let v78: [s0] = v61.p0
    let v74: s0 = v34[0]
    let v43: s2 = s2(p0: v27, p1: v78)
    v27[0] = v17
    v27[1] = v74
    var v98: s7 = v3
    v25.p1 = v29
    let v118: s0 = v34[1]
    var v82: s0 = v118
    v25 = v98
    var v107: s7 = v5
    v107.p1 = v43
    v25.p1 = v13
    v27[0] = v82
    v25.p1 = v23
    let v187: [[Double]] = v17.p0
    v82.p0 = v187
    return v107
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: s7, _ v2: Double) -> Double {
    let v3: s7 = f70(v1)
    let v8: [Double] = v3.p0
    let v4: Double = v8[0]
    let v12: Double = v4 / v2
    let v18: s2 = v1.p1
    var v61: s2 = v18
    let v24: [s0] = v61.p0
    let v17: s0 = v24[0]
    var v50: Double = v4
    let v73: [[Double]] = v17.p0
    let v78: [Double] = v73[2]
    let v62: Double = v78[0]
    let v74: Double = v12 - v50
    v50 = v62
    let v96: Double = v2 - v74
    let v271: Double = f110(v96)
    return v271
  }
  func benchmark() {
    let v0: s4 = s4(p0: [s3(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])]), p1: s2(p0: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])], p1: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]]), s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]])]), p2: [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]])]), s3(p0: s1(p0: s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]]), p1: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]]), s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0], [71.0]]), s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]])]), p1: s2(p0: [s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0], [82.0], [83.0]]), s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0], [88.0], [89.0]])], p1: [s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0], [95.0]]), s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0], [100.0], [101.0]])]), p2: [s0(p0: [[102.0], [103.0], [104.0]], p1: [[105.0], [106.0], [107.0]])])], p1: s1(p0: s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0], [112.0], [113.0]]), p1: [s0(p0: [[114.0], [115.0], [116.0]], p1: [[117.0], [118.0], [119.0]]), s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0], [124.0], [125.0]]), s0(p0: [[126.0], [127.0], [128.0]], p1: [[129.0], [130.0], [131.0]])]))
    let v1: s7 = s7(p0: [132.0, 133.0], p1: s2(p0: [s0(p0: [[134.0], [135.0], [136.0]], p1: [[137.0], [138.0], [139.0]]), s0(p0: [[140.0], [141.0], [142.0]], p1: [[143.0], [144.0], [145.0]])], p1: [s0(p0: [[146.0], [147.0], [148.0]], p1: [[149.0], [150.0], [151.0]]), s0(p0: [[152.0], [153.0], [154.0]], p1: [[155.0], [156.0], [157.0]])]))
    let v2: Double = 158.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 158.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
