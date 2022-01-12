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
    var p0: s1
    var p1: s0
  }
  struct s7 {
    var p0: s0
    var p1: [s2]
  }
  func f11(_ v0: Double) -> Double {
    var v5: Double = v0
    var v1: Double = v5
    var v6: Double = v5
    var v2: Double = v1
    var v3: Double = v6
    var v7: Double = v3
    var v4: Double = v1
    var v8: Double = v0
    var v12: Double = v1
    let v14: Double = v2 / v8
    v12 = v0
    v8 = v4
    var v26: Double = v7
    var v39: Double = v12
    let v37: Double = v14 * v26
    v5 = v39
    return v37
  }
  @inline(never)
  func f0(_ v0: [s7], _ v1: Double) -> Double {
    let v6: Double = f11(v1)
    let v7: Double = f11(v6)
    let v4: Double = f11(v1)
    let v15: Double = v1 + v4
    let v17: Double = f11(v4)
    let v34: [Double] = [v15, v17, v6, v7, v6, v6, v1]
    let v80: Double = v34[0]
    return v80
  }
  func benchmark() {
    let v0: [s7] = [s7(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: [s2(p0: s1(p0: [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])], p1: [[s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])]]), p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])), s2(p0: s1(p0: [s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]), s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])], p1: [[s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])]]), p1: s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]))]), s7(p0: s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]]), p1: [s2(p0: s1(p0: [s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]]), s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]]), s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])], p1: [[s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]])]]), p1: s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]])), s2(p0: s1(p0: [s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]]), s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]]), s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]])], p1: [[s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]])]]), p1: s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]]))])]
    let v1: Double = 88.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 88.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
