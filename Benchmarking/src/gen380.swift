  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: s0
    var p1: s1
  }
  struct s4 {
    var p0: [[s1]]
    var p1: [s3]
  }
  struct s9 {
    var p0: [s1]
    var p1: [[s0]]
  }
  struct s11 {
    var p0: s4
    var p1: [s9]
  }
  func f13(_ v0: s11) -> s11 {
    let v6: s4 = v0.p0
    var v4: s4 = v6
    let v11: [s4] = [v6, v6]
    let v14: s4 = v11[0]
    var v26: s11 = v0
    v26.p0 = v14
    let v41: s4 = v11[0]
    var v29: s11 = v26
    v29.p0 = v4
    let v22: s4 = v11[1]
    let v84: s4 = v11[0]
    v29.p0 = v84
    v26.p0 = v41
    let v66: [s3] = v41.p1
    v29.p0 = v22
    v26.p0 = v6
    v4.p1 = v66
    return v29
  }
  func f3(_ v0: s4) -> s4 {
    let v7: [[s1]] = v0.p0
    var v6: s4 = v0
    let v2: [s3] = v6.p1
    v6.p1 = v2
    var v8: [[s1]] = v7
    let v1: [[s1]] = v0.p0
    let v4: [[s1]] = v6.p0
    v6.p0 = v4
    v6.p0 = v8
    let v10: [s1] = v1[2]
    v6.p0 = v1
    v8[1] = v10
    var v36: s4 = v6
    let v59: [s3] = v0.p1
    let v58: [[s1]] = v36.p0
    v6.p0 = v58
    v6.p1 = v59
    return v36
  }
  @inline(never)
  func f0(_ v0: s11, _ v1: Double) -> Double {
    let v5: s11 = f13(v0)
    var v3: s11 = v5
    v3 = v5
    let v8: s11 = f13(v0)
    var v6: s11 = v3
    let v7: s11 = f13(v6)
    var v2: s11 = v7
    let v9: s11 = f13(v8)
    let v10: s11 = f13(v9)
    let v12: s11 = f13(v10)
    let v16: s4 = v2.p0
    let v11: [s3] = v16.p1
    let v14: s3 = v11[1]
    let v24: [s9] = v3.p1
    let v25: s1 = v14.p1
    v2.p0 = v16
    let v26: s0 = v25.p0
    v2.p1 = v24
    v2.p0 = v16
    var v20: s0 = v26
    let v17: [s9] = v10.p1
    let v59: [s9] = v12.p1
    let v27: s4 = f3(v16)
    let v43: [[Double]] = v20.p0
    let v29: [Double] = v43[0]
    let v35: Double = v29[0]
    v3.p1 = v59
    v6.p1 = v17
    var v42: s4 = v27
    let v57: s4 = f3(v42)
    v3.p1 = v17
    let v82: Double = v1 + v1
    let v52: Double = v35 + v82
    v6.p0 = v57
    return v52
  }
  func benchmark() {
    let v0: s11 = s11(p0: s4(p0: [[s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]))], [s1(p0: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))], [s1(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]))]], p1: [s3(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), p1: s1(p0: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]), p1: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]))), s3(p0: s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]), p1: s1(p0: s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), p1: s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])))]), p1: [s9(p0: [s1(p0: s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]]), p1: s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])), s1(p0: s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]]), p1: s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]]))], p1: [[s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]])], [s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]])]]), s9(p0: [s1(p0: s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]]), p1: s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]])), s1(p0: s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]]), p1: s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]]))], p1: [[s0(p0: [[88.0]], p1: [[89.0], [90.0], [91.0]])], [s0(p0: [[92.0]], p1: [[93.0], [94.0], [95.0]])]]), s9(p0: [s1(p0: s0(p0: [[96.0]], p1: [[97.0], [98.0], [99.0]]), p1: s0(p0: [[100.0]], p1: [[101.0], [102.0], [103.0]])), s1(p0: s0(p0: [[104.0]], p1: [[105.0], [106.0], [107.0]]), p1: s0(p0: [[108.0]], p1: [[109.0], [110.0], [111.0]]))], p1: [[s0(p0: [[112.0]], p1: [[113.0], [114.0], [115.0]])], [s0(p0: [[116.0]], p1: [[117.0], [118.0], [119.0]])]])])
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
