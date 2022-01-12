  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [s0]
    var p1: [s1]
  }
  struct s3 {
    var p0: [s2]
    var p1: [s0]
  }
  func f91(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v4: [[Double]] = v0.p2
    var v5: [[Double]] = v4
    v3.p2 = v5
    var v2: [[Double]] = v4
    let v6: [Double] = v3.p1
    let v7: [Double] = v5[1]
    v3.p2 = v5
    var v9: [Double] = v6
    v5[0] = v7
    v3.p1 = v9
    let v1: [Double] = v2[0]
    v3.p2 = v2
    var v16: [Double] = v7
    let v10: [Double] = v3.p1
    let v15: [Double] = v0.p1
    let v11: [[Double]] = v3.p0
    let v8: [Double] = v11[0]
    var v12: [[Double]] = v11
    v12[0] = v16
    let v14: s0 = s0(p0: v11, p1: v15, p2: v2)
    var v19: [[Double]] = v12
    v3.p0 = v12
    let v18: [Double] = v3.p1
    v3.p1 = v10
    v3.p1 = v10
    v19[0] = v8
    v3.p1 = v15
    let v36: [[Double]] = v3.p0
    let v25: [Double] = v0.p1
    v3.p0 = v36
    v3.p2 = v2
    var v40: [[Double]] = v36
    v3.p0 = v19
    v3.p1 = v10
    v19[0] = v1
    v19[0] = v8
    v3.p1 = v18
    v2 = v4
    let v44: [[Double]] = v14.p2
    var v48: [[Double]] = v40
    let v120: [[Double]] = v3.p0
    let v42: [[Double]] = v0.p0
    let v76: [Double] = v2[1]
    v3.p0 = v120
    v3.p2 = v2
    v3.p0 = v120
    let v52: [[Double]] = v0.p2
    let v47: s0 = s0(p0: v12, p1: v18, p2: v44)
    v12 = v42
    v3.p0 = v48
    v19[0] = v76
    v3.p1 = v18
    v3.p0 = v42
    v3.p2 = v52
    var v64: [[Double]] = v5
    v3.p0 = v19
    v3.p0 = v12
    v3.p1 = v25
    v3.p2 = v64
    return v47
  }
  func f70(_ v0: s1) -> s1 {
    let v2: s0 = v0.p0
    let v6: s0 = f91(v2)
    let v4: s0 = f91(v6)
    let v11: [[s0]] = v0.p1
    let v36: [s1] = [v0, v0, v0, v0, v0, v0, v0]
    let v52: s1 = v36[6]
    var v29: s1 = v52
    v29.p1 = v11
    let v37: [[s0]] = v0.p1
    v29.p1 = v37
    v29.p0 = v2
    v29.p0 = v4
    return v29
  }
  func f36(_ v0: s0) -> s0 {
    let v7: [Double] = v0.p1
    var v4: s0 = v0
    v4.p1 = v7
    v4.p1 = v7
    let v22: s0 = f91(v4)
    var v40: s0 = v22
    return v40
  }
  func f7(_ v0: s1, _ v1: s0) -> s0 {
    let v7: [Double] = v1.p1
    var v8: s0 = v1
    let v12: s0 = f36(v8)
    let v21: s0 = f36(v12)
    v8.p1 = v7
    return v21
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: s1, _ v2: Double) -> Double {
    let v9: s1 = f70(v1)
    let v10: s0 = v9.p0
    let v17: [[Double]] = v10.p0
    var v11: [[Double]] = v17
    let v21: [Double] = v11[0]
    let v12: [Double] = v11[0]
    let v24: s0 = f7(v9, v10)
    v11 = v17
    let v18: [Double] = v17[0]
    let v36: [[Double]] = v24.p2
    var v31: [[Double]] = v36
    let v41: [Double] = v31[1]
    let v104: [Double] = v17[0]
    v11[0] = v41
    v11[0] = v104
    var v74: [Double] = v21
    v11 = v17
    var v125: [Double] = v18
    let v195: Double = v41[0]
    v11[0] = v12
    v11[0] = v125
    v31[1] = v12
    v31[0] = v74
    return v195
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s2(p0: [s0(p0: [[0.0]], p1: [1.0, 2.0], p2: [[3.0], [4.0]]), s0(p0: [[5.0]], p1: [6.0, 7.0], p2: [[8.0], [9.0]]), s0(p0: [[10.0]], p1: [11.0, 12.0], p2: [[13.0], [14.0]])], p1: [s1(p0: s0(p0: [[15.0]], p1: [16.0, 17.0], p2: [[18.0], [19.0]]), p1: [[s0(p0: [[20.0]], p1: [21.0, 22.0], p2: [[23.0], [24.0]])], [s0(p0: [[25.0]], p1: [26.0, 27.0], p2: [[28.0], [29.0]])], [s0(p0: [[30.0]], p1: [31.0, 32.0], p2: [[33.0], [34.0]])]])]), s2(p0: [s0(p0: [[35.0]], p1: [36.0, 37.0], p2: [[38.0], [39.0]]), s0(p0: [[40.0]], p1: [41.0, 42.0], p2: [[43.0], [44.0]]), s0(p0: [[45.0]], p1: [46.0, 47.0], p2: [[48.0], [49.0]])], p1: [s1(p0: s0(p0: [[50.0]], p1: [51.0, 52.0], p2: [[53.0], [54.0]]), p1: [[s0(p0: [[55.0]], p1: [56.0, 57.0], p2: [[58.0], [59.0]])], [s0(p0: [[60.0]], p1: [61.0, 62.0], p2: [[63.0], [64.0]])], [s0(p0: [[65.0]], p1: [66.0, 67.0], p2: [[68.0], [69.0]])]])])], p1: [s0(p0: [[70.0]], p1: [71.0, 72.0], p2: [[73.0], [74.0]])])
    let v1: s1 = s1(p0: s0(p0: [[75.0]], p1: [76.0, 77.0], p2: [[78.0], [79.0]]), p1: [[s0(p0: [[80.0]], p1: [81.0, 82.0], p2: [[83.0], [84.0]])], [s0(p0: [[85.0]], p1: [86.0, 87.0], p2: [[88.0], [89.0]])], [s0(p0: [[90.0]], p1: [91.0, 92.0], p2: [[93.0], [94.0]])]])
    let v2: Double = 95.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 95.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
