  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  func f36(_ v0: s2) -> s2 {
    return v0
  }
  func f31(_ v0: s2) -> s2 {
    let v1: s2 = f36(v0)
    let v2: s2 = f36(v0)
    let v12: s2 = f36(v0)
    let v23: s2 = f36(v12)
    let v15: s2 = f36(v2)
    let v18: s2 = f36(v1)
    let v55: s2 = f36(v18)
    let v110: [s2] = [v55, v15, v23]
    let v69: s2 = v110[0]
    let v203: s2 = f36(v69)
    return v203
  }
  func f24(_ v0: [s2], _ v1: s2) -> [s2] {
    let v5: s2 = v0[0]
    var v7: [s2] = v0
    let v9: s2 = f31(v5)
    v7[0] = v9
    v7[0] = v1
    v7[0] = v5
    let v11: s2 = f36(v1)
    let v33: s2 = f36(v11)
    v7[0] = v1
    let v14: s2 = f31(v33)
    let v18: s2 = f31(v33)
    v7 = v0
    let v39: s2 = f36(v14)
    let v34: s2 = f36(v18)
    v7[0] = v14
    let v158: s2 = f31(v39)
    let v118: s2 = f36(v158)
    v7[0] = v118
    v7[0] = v34
    return v7
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: [s2], _ v2: Double) -> Double {
    let v5: s2 = v1[1]
    let v7: [s2] = f24(v1, v5)
    let v4: s2 = v7[1]
    let v10: [s0] = v4.p1
    let v26: s0 = v10[0]
    let v15: [[Double]] = v26.p1
    let v36: [Double] = v15[2]
    let v46: Double = v36[0]
    return v46
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], p1: [[s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])], [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])]])], [s1(p0: [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])], p1: [[s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])], [s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])]])], [s1(p0: [s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]]), s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])], p1: [[s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])], [s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])]])]]
    let v1: [s2] = [s2(p0: s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]]), p1: [s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]])]), s2(p0: s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]]), p1: [s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]])])]
    let v2: Double = 76.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 76.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
