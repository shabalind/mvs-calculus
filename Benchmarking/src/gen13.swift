  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s4 {
    var p0: [Double]
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: s4, _ v2: Double) -> Double {
    var v5: Double = v2
    var v7: Double = v5
    v5 = v2
    let v18: [Double] = v1.p0
    var v13: [Double] = v18
    v13[0] = v5
    let v15: Double = v13[1]
    v13[1] = v5
    v13[0] = v7
    v13 = v18
    return v15
  }
  func benchmark() {
    let v0: s4 = s4(p0: [0.0, 1.0], p1: [s1(p0: s0(p0: [[2.0], [3.0], [4.0]], p1: [[5.0], [6.0], [7.0]], p2: [[8.0], [9.0]]), p1: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0], [15.0]], p2: [[16.0], [17.0]])), s1(p0: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]], p2: [[24.0], [25.0]]), p1: s0(p0: [[26.0], [27.0], [28.0]], p1: [[29.0], [30.0], [31.0]], p2: [[32.0], [33.0]]))])
    let v1: s4 = s4(p0: [34.0, 35.0], p1: [s1(p0: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]], p2: [[42.0], [43.0]]), p1: s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0], [48.0], [49.0]], p2: [[50.0], [51.0]])), s1(p0: s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0], [56.0], [57.0]], p2: [[58.0], [59.0]]), p1: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]], p2: [[66.0], [67.0]]))])
    let v2: Double = 68.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 68.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
