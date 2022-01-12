  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
    var p2: s0
  }
  struct s2 {
    var p0: s1
    var p1: [[s0]]
  }
  func f4(_ v0: [s0]) -> [s0] {
    let v2: s0 = v0[0]
    let v7: s0 = v0[0]
    let v6: s0 = v0[0]
    let v3: [[Double]] = v7.p1
    var v9: s0 = v2
    var v14: [s0] = v0
    v14 = v0
    let v15: [[Double]] = v2.p0
    v9.p1 = v3
    let v27: [[Double]] = v6.p0
    let v16: [[Double]] = v9.p1
    v9.p1 = v16
    v14[0] = v9
    v9.p0 = v27
    v9.p0 = v15
    v14[0] = v7
    var v53: [s0] = v14
    v53 = v14
    v9.p0 = v15
    return v53
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: [[s0]], _ v2: Double) -> Double {
    var v8: [[s0]] = v1
    let v4: [s0] = v8[0]
    let v12: [s0] = f4(v4)
    let v11: [Double] = [v2]
    var v3: [Double] = v11
    let v13: Double = v3[0]
    let v20: [s0] = f4(v4)
    var v29: [Double] = v11
    let v26: [s0] = f4(v20)
    let v24: Double = v2 / v2
    v29[0] = v13
    var v27: Double = v2
    let v16: [s0] = f4(v12)
    v8[0] = v16
    let v40: [Double] = [v24]
    v3[0] = v2
    v3[0] = v27
    let v83: s0 = v26[0]
    let v46: [s0] = f4(v4)
    let v53: Double = v29[0]
    var v87: Double = v53
    let v90: [[Double]] = v83.p0
    v8[1] = v46
    let v81: [Double] = v90[0]
    v8[0] = v46
    v29 = v40
    v29 = v81
    v29[0] = v53
    return v87
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], p2: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])), p1: [[s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])], [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])]]), s2(p0: s1(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), p1: [s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])], p2: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])), p1: [[s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])], [s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]])], [s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])]]), s2(p0: s1(p0: s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]]), p1: [s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])], p2: s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])), p1: [[s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]])], [s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]])], [s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]])]])]
    let v1: [[s0]] = [[s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]])], [s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]])]]
    let v2: Double = 80.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 80.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
