  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  struct s3 {
    var p0: [s1]
    var p1: s1
  }
  struct s4 {
    var p0: [s1]
    var p1: [s2]
  }
  struct s5 {
    var p0: s4
    var p1: [[s3]]
  }
  struct s8 {
    var p0: s0
    var p1: s5
  }
  struct s10 {
    var p0: s8
  }
  func f56(_ v0: Double) -> Double {
    var v3: Double = v0
    var v5: Double = v0
    var v15: Double = v0
    var v4: Double = v0
    var v1: Double = v0
    var v7: Double = v4
    var v9: Double = v15
    v4 = v5
    var v8: Double = v7
    var v11: Double = v8
    var v10: Double = v1
    var v21: Double = v15
    var v30: Double = v3
    v21 = v4
    let v25: [Double] = [v11, v11, v9, v30, v10]
    let v27: Double = v25[0]
    var v57: [Double] = v25
    var v36: [Double] = v57
    v36[3] = v7
    v57[2] = v27
    var v72: [Double] = v36
    v72[4] = v21
    var v32: [Double] = v72
    var v38: [Double] = v32
    var v60: [Double] = v38
    let v42: Double = v60[0]
    return v42
  }
  @inline(never)
  func f0(_ v0: s10, _ v1: Double) -> Double {
    var v8: Double = v1
    let v5: Double = v1 + v8
    let v7: Double = f56(v8)
    var v37: Double = v1
    let v54: Double = v37 + v7
    let v120: Double = v5 * v54
    v37 = v8
    return v120
  }
  func benchmark() {
    let v0: s10 = s10(p0: s8(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s5(p0: s4(p0: [s1(p0: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), p1: [[s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], [s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])]])], p1: [s2(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: s1(p0: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]), p1: [[s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])], [s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])]])), s2(p0: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), p1: s1(p0: s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]), p1: [[s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]])], [s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])]]))]), p1: [[s3(p0: [s1(p0: s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]]), p1: [[s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])], [s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])]]), s1(p0: s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]]), p1: [[s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]])], [s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]])]]), s1(p0: s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]]), p1: [[s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]])], [s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]])]])], p1: s1(p0: s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]]), p1: [[s0(p0: [[88.0]], p1: [[89.0], [90.0], [91.0]])], [s0(p0: [[92.0]], p1: [[93.0], [94.0], [95.0]])]]))]])))
    let v1: Double = 96.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 96.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
