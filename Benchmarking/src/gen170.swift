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
    var p0: [[s0]]
    var p1: [[s1]]
    var p2: [s1]
    var p3: [[s1]]
  }
  func f62(_ v0: Double) -> Double {
    var v6: Double = v0
    let v2: Double = v0 * v6
    let v7: [Double] = [v2]
    let v5: Double = v7[0]
    var v1: [Double] = v7
    var v3: [Double] = v1
    let v8: Double = v1[0]
    let v20: Double = v7[0]
    var v11: [Double] = v7
    var v10: [Double] = v3
    var v14: [Double] = v10
    var v13: Double = v2
    let v25: Double = v11[0]
    var v16: Double = v5
    var v15: Double = v8
    let v22: Double = v3[0]
    v14[0] = v15
    let v30: Double = v7[0]
    v14[0] = v30
    v11[0] = v20
    let v18: Double = v14[0]
    var v17: [Double] = v14
    v17[0] = v13
    var v35: [Double] = v17
    v35[0] = v25
    v11[0] = v22
    let v23: Double = v14[0]
    let v46: Double = v10[0]
    let v21: Double = v35[0]
    let v29: Double = v1[0]
    v3[0] = v46
    v3 = v1
    v1[0] = v0
    var v24: [Double] = v35
    v17[0] = v6
    var v71: Double = v18
    v24[0] = v23
    let v54: Double = v1[0]
    let v43: Double = v35[0]
    let v58: Double = v7[0]
    v3[0] = v0
    var v68: [Double] = v14
    v11[0] = v23
    let v38: Double = v68[0]
    v24[0] = v29
    let v75: [Double] = [v15, v54, v16, v21, v16, v58]
    var v77: Double = v13
    v3[0] = v71
    var v59: [Double] = v75
    v3[0] = v58
    let v89: Double = v59[0]
    v3[0] = v77
    v17[0] = v38
    v17 = v24
    let v53: Double = v89 / v21
    v11[0] = v43
    return v53
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v31: Double = v1 * v1
    let v72: Double = f62(v1)
    let v103: Double = v1 / v72
    var v213: Double = v103
    let v109: Double = v213 - v31
    return v109
  }
  func benchmark() {
    let v0: s2 = s2(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])], [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]], p1: [[s1(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]), p1: [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])])], [s1(p0: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]), p1: [s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]), s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]])])]], p2: [s1(p0: s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]]), p1: [s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]]), s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]]), s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])]), s1(p0: s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]]), p1: [s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]]), s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]]), s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]])])], p3: [[s1(p0: s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]]), p1: [s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]]), s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]]), s0(p0: [[88.0]], p1: [[89.0], [90.0], [91.0]])])], [s1(p0: s0(p0: [[92.0]], p1: [[93.0], [94.0], [95.0]]), p1: [s0(p0: [[96.0]], p1: [[97.0], [98.0], [99.0]]), s0(p0: [[100.0]], p1: [[101.0], [102.0], [103.0]]), s0(p0: [[104.0]], p1: [[105.0], [106.0], [107.0]])])], [s1(p0: s0(p0: [[108.0]], p1: [[109.0], [110.0], [111.0]]), p1: [s0(p0: [[112.0]], p1: [[113.0], [114.0], [115.0]]), s0(p0: [[116.0]], p1: [[117.0], [118.0], [119.0]]), s0(p0: [[120.0]], p1: [[121.0], [122.0], [123.0]])])]])
    let v1: Double = 124.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 124.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
