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
    var p1: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: [s2]
  }
  func f70(_ v0: s0, _ v1: s0) -> s0 {
    let v5: [[Double]] = v1.p1
    let v7: [[Double]] = v0.p0
    let v2: [Double] = v7[0]
    var v6: s0 = v0
    let v13: [[Double]] = v1.p0
    v6.p0 = v13
    let v8: [Double] = v5[1]
    var v19: [[Double]] = v13
    let v15: [[Double]] = v6.p1
    var v47: s0 = v0
    let v22: [[Double]] = v1.p1
    v47.p0 = v19
    var v18: s0 = v47
    v19[0] = v8
    v47.p1 = v15
    v19[0] = v2
    var v24: s0 = v18
    v47.p1 = v15
    v18.p1 = v22
    return v24
  }
  func f36(_ v0: Double) -> Double {
    var v1: Double = v0
    var v5: Double = v0
    let v3: [Double] = [v5, v0, v0, v5, v1]
    let v8: Double = v3[2]
    var v7: [Double] = v3
    let v6: [Double] = [v1, v5, v0, v8, v5]
    v7[1] = v8
    let v4: Double = v7[4]
    let v2: Double = v3[0]
    v5 = v8
    let v15: Double = v3[4]
    let v11: [[Double]] = [v6, v7, v6, v6, v6, v3, v7]
    let v13: [Double] = [v15, v2, v4, v2, v2, v1]
    var v23: [[Double]] = v11
    let v16: Double = v13[3]
    v7[4] = v8
    v23[0] = v3
    v5 = v0
    let v33: [Double] = v23[6]
    let v14: Double = v13[1]
    v1 = v2
    v23[5] = v33
    let v24: Double = v33[4]
    let v31: [Double] = v23[4]
    let v45: Double = v7[0]
    var v35: Double = v5
    var v48: [Double] = v13
    v48[5] = v24
    var v71: [Double] = v48
    let v72: Double = v71[5]
    v7[2] = v35
    var v41: Double = v4
    let v62: Double = v71[2]
    v7[2] = v14
    v7[1] = v24
    let v108: [Double] = [v41, v24, v45, v72]
    var v74: [Double] = v108
    v23[1] = v31
    v74[1] = v16
    var v192: [Double] = v74
    let v181: Double = v192[1]
    v35 = v62
    return v181
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [s1], _ v2: s3, _ v3: Double) -> Double {
    let v6: s1 = v1[2]
    var v10: Double = v3
    let v15: s0 = v6.p0
    let v13: s0 = f70(v15, v15)
    let v39: [[Double]] = v13.p1
    let v16: Double = f36(v10)
    let v58: [Double] = v39[0]
    let v45: Double = v58[0]
    v10 = v3
    let v109: Double = v10 + v16
    let v44: Double = v109 - v45
    return v44
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])]
    let v1: [s1] = [s1(p0: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p1: [s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]), s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])]), s1(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), p1: [s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]), s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])]), s1(p0: s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), p1: [s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]]), s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]]), s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])])]
    let v2: s3 = s3(p0: s1(p0: s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]]), p1: [s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]]), s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]]), s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]])]), p1: [s2(p0: s1(p0: s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]]), p1: [s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]]), s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]]), s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]])]), p1: [s0(p0: [[88.0]], p1: [[89.0], [90.0], [91.0]]), s0(p0: [[92.0]], p1: [[93.0], [94.0], [95.0]])]), s2(p0: s1(p0: s0(p0: [[96.0]], p1: [[97.0], [98.0], [99.0]]), p1: [s0(p0: [[100.0]], p1: [[101.0], [102.0], [103.0]]), s0(p0: [[104.0]], p1: [[105.0], [106.0], [107.0]]), s0(p0: [[108.0]], p1: [[109.0], [110.0], [111.0]])]), p1: [s0(p0: [[112.0]], p1: [[113.0], [114.0], [115.0]]), s0(p0: [[116.0]], p1: [[117.0], [118.0], [119.0]])]), s2(p0: s1(p0: s0(p0: [[120.0]], p1: [[121.0], [122.0], [123.0]]), p1: [s0(p0: [[124.0]], p1: [[125.0], [126.0], [127.0]]), s0(p0: [[128.0]], p1: [[129.0], [130.0], [131.0]]), s0(p0: [[132.0]], p1: [[133.0], [134.0], [135.0]])]), p1: [s0(p0: [[136.0]], p1: [[137.0], [138.0], [139.0]]), s0(p0: [[140.0]], p1: [[141.0], [142.0], [143.0]])])])
    let v3: Double = 144.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 144.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
