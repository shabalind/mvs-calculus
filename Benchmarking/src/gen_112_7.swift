  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
    var p2: s0
  }
  struct s2 {
    var p0: [[s1]]
    var p1: [s0]
  }
  struct s4 {
    var p0: s2
    var p1: s2
  }
  func f45(_ v0: s2) -> s2 {
    let v5: [s0] = v0.p1
    let v7: [[s1]] = v0.p0
    let v6: [s0] = v0.p1
    let v2: s0 = v6[0]
    let v8: [s1] = v7[0]
    var v11: s2 = v0
    var v13: [s0] = v5
    var v10: s2 = v11
    let v17: [[Double]] = v2.p1
    v10 = v0
    var v15: [s0] = v13
    v10.p1 = v6
    v10.p1 = v15
    var v19: s0 = v2
    let v27: s0 = v13[0]
    var v32: s0 = v27
    let v20: s1 = v8[0]
    let v26: [[Double]] = v27.p0
    let v21: [[s1]] = v0.p0
    v19.p0 = v26
    let v47: [[Double]] = v19.p0
    let v60: [[Double]] = v19.p1
    var v44: [[Double]] = v60
    v19.p1 = v44
    v13 = v15
    v32.p0 = v47
    let v56: s0 = v20.p1
    let v63: [[Double]] = v56.p1
    let v35: [Double] = v17[2]
    v44[1] = v35
    var v78: s2 = v10
    v10.p0 = v21
    v19.p0 = v47
    v19.p1 = v63
    v11.p0 = v7
    v15[0] = v32
    v32 = v27
    return v78
  }
  func f44(_ v0: Double, _ v1: s2) -> Double {
    let v2: s2 = f45(v1)
    let v3: [[s1]] = v2.p0
    let v14: [s1] = v3[2]
    let v40: s1 = v14[0]
    let v30: s0 = v40.p2
    let v56: [[Double]] = v30.p1
    let v60: [Double] = v56[0]
    var v38: [Double] = v60
    let v46: Double = v38[0]
    return v46
  }
  func f41(_ v0: s2, _ v1: s1, _ v2: s0, _ v3: s1) -> s2 {
    let v7: s2 = f45(v0)
    let v4: s2 = f45(v7)
    let v15: s2 = f45(v4)
    var v14: s2 = v15
    var v13: s0 = v2
    let v24: [[s1]] = v7.p0
    let v40: [s0] = v14.p1
    var v37: [s0] = v40
    var v49: [s0] = v37
    v37[0] = v2
    let v44: s2 = f45(v7)
    var v75: [[s1]] = v24
    v14.p0 = v75
    let v73: [[s1]] = v44.p0
    v49[0] = v13
    var v64: [[s1]] = v73
    let v94: s2 = s2(p0: v75, p1: v49)
    let v116: [s1] = v75[2]
    v64[2] = v116
    v14 = v7
    v14.p0 = v64
    return v94
  }
  func f27(_ v0: s2) -> s2 {
    let v7: s2 = f45(v0)
    let v1: [s0] = v0.p1
    let v6: [[s1]] = v7.p0
    let v4: s2 = f45(v7)
    let v11: s2 = f45(v0)
    let v14: [[s1]] = v4.p0
    let v13: s0 = v1[0]
    let v15: [s1] = v6[1]
    let v18: s1 = v15[0]
    let v20: [[s1]] = v11.p0
    let v19: [s1] = v20[0]
    var v40: s2 = v11
    v40.p0 = v6
    v40.p0 = v14
    let v62: s0 = v1[0]
    var v71: s1 = v18
    let v46: s1 = v19[0]
    v71.p1 = v62
    let v48: s2 = f41(v40, v71, v13, v46)
    return v48
  }
  func f4(_ v0: s4) -> s4 {
    var v5: s4 = v0
    let v1: s2 = v5.p1
    v5.p1 = v1
    v5.p1 = v1
    v5.p1 = v1
    let v2: s4 = s4(p0: v1, p1: v1)
    v5 = v2
    var v13: s4 = v0
    let v9: s2 = f27(v1)
    v5.p0 = v1
    var v11: s2 = v9
    let v19: [s0] = v9.p1
    var v16: s2 = v11
    let v14: s2 = f27(v16)
    v5.p0 = v14
    let v47: s2 = f27(v16)
    var v51: s2 = v16
    let v28: s2 = f45(v51)
    let v72: s2 = v13.p1
    v13 = v2
    let v42: s4 = s4(p0: v51, p1: v47)
    v16.p1 = v19
    v5.p0 = v28
    v5.p0 = v72
    v5.p1 = v72
    return v42
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    let v2: s2 = v0.p0
    var v5: s4 = v0
    let v11: s2 = f45(v2)
    var v9: s2 = v2
    let v10: [[s1]] = v2.p0
    let v17: [s1] = v10[1]
    let v4: [s0] = v11.p1
    v9.p0 = v10
    let v12: [s0] = v11.p1
    let v21: s2 = f45(v9)
    let v15: s1 = v17[0]
    v9.p0 = v10
    v9.p1 = v12
    let v16: s2 = v5.p1
    let v36: s4 = s4(p0: v16, p1: v11)
    let v31: s2 = s2(p0: v10, p1: v4)
    let v49: s4 = f4(v36)
    v9 = v31
    let v32: s0 = v15.p1
    let v35: s2 = v49.p0
    let v52: [[Double]] = v32.p0
    v5.p1 = v31
    v9.p0 = v10
    let v93: [Double] = v52[0]
    v5.p1 = v2
    let v81: Double = v93[0]
    let v102: Double = f44(v81, v35)
    v5.p0 = v21
    v9 = v31
    return v102
  }
  func benchmark() {
    let v0: s4 = s4(p0: s2(p0: [[s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])], p1: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]), p2: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]))], [s1(p0: [s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]), s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])], p1: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]]), p2: s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]]))], [s1(p0: [s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]]), s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]]), s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0], [64.0]])], p1: s0(p0: [[65.0], [66.0]], p1: [[67.0], [68.0], [69.0]]), p2: s0(p0: [[70.0], [71.0]], p1: [[72.0], [73.0], [74.0]]))]], p1: [s0(p0: [[75.0], [76.0]], p1: [[77.0], [78.0], [79.0]])]), p1: s2(p0: [[s1(p0: [s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0], [84.0]]), s0(p0: [[85.0], [86.0]], p1: [[87.0], [88.0], [89.0]]), s0(p0: [[90.0], [91.0]], p1: [[92.0], [93.0], [94.0]])], p1: s0(p0: [[95.0], [96.0]], p1: [[97.0], [98.0], [99.0]]), p2: s0(p0: [[100.0], [101.0]], p1: [[102.0], [103.0], [104.0]]))], [s1(p0: [s0(p0: [[105.0], [106.0]], p1: [[107.0], [108.0], [109.0]]), s0(p0: [[110.0], [111.0]], p1: [[112.0], [113.0], [114.0]]), s0(p0: [[115.0], [116.0]], p1: [[117.0], [118.0], [119.0]])], p1: s0(p0: [[120.0], [121.0]], p1: [[122.0], [123.0], [124.0]]), p2: s0(p0: [[125.0], [126.0]], p1: [[127.0], [128.0], [129.0]]))], [s1(p0: [s0(p0: [[130.0], [131.0]], p1: [[132.0], [133.0], [134.0]]), s0(p0: [[135.0], [136.0]], p1: [[137.0], [138.0], [139.0]]), s0(p0: [[140.0], [141.0]], p1: [[142.0], [143.0], [144.0]])], p1: s0(p0: [[145.0], [146.0]], p1: [[147.0], [148.0], [149.0]]), p2: s0(p0: [[150.0], [151.0]], p1: [[152.0], [153.0], [154.0]]))]], p1: [s0(p0: [[155.0], [156.0]], p1: [[157.0], [158.0], [159.0]])]))
    let v1: Double = 160.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 160.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
