  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: s2
    var p1: s0
  }
  struct s4 {
    var p0: s3
    var p1: s0
    var p2: s3
    var p3: [s2]
  }
  struct s5 {
    var p0: s4
    var p1: [s0]
  }
  struct s7 {
    var p0: s1
    var p1: s5
  }
  struct s8 {
    var p0: s7
    var p1: [s0]
  }
  func f22(_ v0: Double) -> Double {
    var v2: Double = v0
    var v5: Double = v2
    v5 = v0
    var v3: Double = v5
    var v8: Double = v0
    var v7: Double = v2
    var v1: Double = v8
    let v11: Double = v2 / v1
    var v6: Double = v3
    var v12: Double = v0
    var v10: Double = v11
    let v4: [Double] = [v8, v2, v8, v2, v6, v10]
    let v22: Double = v4[5]
    var v9: [Double] = v4
    var v16: Double = v3
    let v21: Double = v4[1]
    v9[0] = v12
    var v13: Double = v21
    var v20: Double = v6
    v9[5] = v7
    v9 = v4
    let v18: Double = v4[5]
    var v29: [Double] = v4
    v9[3] = v13
    v29[4] = v7
    let v38: Double = v4[0]
    v29[4] = v18
    v29[1] = v38
    let v37: Double = v29[2]
    var v19: Double = v21
    var v14: [Double] = v9
    var v24: Double = v2
    v14[4] = v22
    v20 = v19
    var v51: Double = v1
    let v58: Double = v9[3]
    let v47: Double = v14[0]
    v9[4] = v20
    v14[3] = v0
    var v73: Double = v11
    var v40: [Double] = v4
    var v85: [Double] = v14
    v29[2] = v1
    var v39: [Double] = v4
    v9[5] = v37
    var v48: Double = v24
    let v137: Double = v4[3]
    let v59: Double = v40[3]
    let v72: Double = v14[2]
    let v114: Double = v29[4]
    let v143: Double = v39[3]
    v85[0] = v51
    v85[0] = v73
    v9[1] = v114
    v40[3] = v47
    let v95: Double = v59 + v137
    v9[4] = v72
    v14[3] = v12
    v85[0] = v21
    var v88: [Double] = v85
    v39[0] = v48
    v40 = v88
    v40[5] = v58
    var v68: Double = v143
    v29[5] = v16
    v29[2] = v68
    return v95
  }
  @inline(never)
  func f0(_ v0: [[s8]], _ v1: Double) -> Double {
    let v6: Double = v1 / v1
    let v15: Double = f22(v1)
    let v28: Double = f22(v15)
    let v39: Double = v15 + v28
    let v110: Double = v39 / v6
    return v110
  }
  func benchmark() {
    let v0: [[s8]] = [[s8(p0: s7(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])), p1: s5(p0: s4(p0: s3(p0: s2(p0: s1(p0: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])), p1: s1(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]))), p1: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])), p1: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]), p2: s3(p0: s2(p0: s1(p0: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), p1: s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])), p1: s1(p0: s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), p1: s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]]))), p1: s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])), p3: [s2(p0: s1(p0: s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]]), p1: s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])), p1: s1(p0: s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]]), p1: s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]]))), s2(p0: s1(p0: s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]]), p1: s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]])), p1: s1(p0: s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]]), p1: s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]]))), s2(p0: s1(p0: s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]]), p1: s0(p0: [[88.0]], p1: [[89.0], [90.0], [91.0]])), p1: s1(p0: s0(p0: [[92.0]], p1: [[93.0], [94.0], [95.0]]), p1: s0(p0: [[96.0]], p1: [[97.0], [98.0], [99.0]])))]), p1: [s0(p0: [[100.0]], p1: [[101.0], [102.0], [103.0]]), s0(p0: [[104.0]], p1: [[105.0], [106.0], [107.0]])])), p1: [s0(p0: [[108.0]], p1: [[109.0], [110.0], [111.0]]), s0(p0: [[112.0]], p1: [[113.0], [114.0], [115.0]]), s0(p0: [[116.0]], p1: [[117.0], [118.0], [119.0]])])]]
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
