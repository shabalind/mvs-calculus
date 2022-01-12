  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  func f92(_ v0: s0) -> s0 {
    let v3: s2 = s2(p0: v0, p1: v0)
    let v4: s2 = s2(p0: v0, p1: v0)
    let v1: [s2] = [v4, v3, v4]
    var v5: [s2] = v1
    v5[0] = v4
    v5[1] = v3
    let v11: s2 = v5[2]
    let v24: s0 = v11.p0
    v5[0] = v11
    return v24
  }
  func f78(_ v0: s0) -> s0 {
    var v1: s0 = v0
    var v4: s0 = v0
    let v8: s0 = f92(v0)
    let v17: [[Double]] = v4.p1
    v1.p0 = v17
    let v22: s2 = s2(p0: v8, p1: v1)
    let v26: s0 = v22.p1
    let v36: [[Double]] = v26.p0
    let v86: s0 = s0(p0: v36, p1: v17)
    return v86
  }
  func f41(_ v0: Double) -> Double {
    var v3: Double = v0
    var v7: Double = v3
    var v2: Double = v0
    var v1: Double = v3
    var v4: Double = v2
    var v8: Double = v4
    var v9: Double = v4
    let v14: [Double] = [v1, v7]
    var v15: [Double] = v14
    let v21: Double = v14[1]
    let v13: Double = v14[0]
    let v12: Double = v14[0]
    v15[1] = v8
    v15[1] = v3
    var v24: [Double] = v14
    let v17: Double = v9 / v21
    let v37: Double = v15[0]
    v15[0] = v37
    let v43: Double = v24[1]
    var v22: [Double] = v15
    let v29: Double = v22[0]
    let v27: Double = v14[1]
    let v20: Double = v24[0]
    v24[0] = v43
    v8 = v13
    var v42: Double = v12
    let v55: [Double] = [v43, v27, v29, v20, v17, v21, v42]
    var v56: [Double] = v55
    var v49: Double = v7
    var v80: Double = v13
    var v116: [Double] = v56
    v8 = v49
    var v83: [Double] = v116
    let v113: Double = v83[1]
    v56[0] = v80
    return v113
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s0, _ v2: [s1], _ v3: s1, _ v4: Double) -> Double {
    let v6: [s0] = v0.p0
    let v10: s0 = v6[1]
    let v11: s0 = f78(v10)
    let v12: [[Double]] = v10.p0
    let v17: [[Double]] = v11.p0
    let v22: [Double] = v17[0]
    let v29: s0 = v6[1]
    let v35: Double = v22[0]
    let v25: [Double] = v12[1]
    let v46: [[Double]] = v29.p0
    let v20: Double = v22[0]
    let v52: Double = f41(v20)
    let v68: [Double] = v46[1]
    var v30: [Double] = v68
    v30[0] = v35
    let v66: [[Double]] = [v22, v25, v22, v25, v30, v22]
    v30[0] = v20
    let v79: [Double] = v66[2]
    v30[0] = v52
    let v135: Double = v79[0]
    return v135
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], p1: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]))
    let v1: s0 = s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])
    let v2: [s1] = [s1(p0: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])], p1: s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])), s1(p0: [s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]), s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]), s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]])], p1: s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]])), s1(p0: [s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]]), s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]]), s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]])], p1: s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]]))]
    let v3: s1 = s1(p0: [s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]]), s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0]]), s0(p0: [[76.0], [77.0]], p1: [[78.0], [79.0]])], p1: s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0]]))
    let v4: Double = 84.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 84.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
