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
  struct s4 {
    var p0: s0
    var p1: s0
    var p2: [s1]
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s2, _ v2: s4, _ v3: Double) -> Double {
    let v6: Double = v3 - v3
    let v5: s0 = v2.p1
    let v10: [[Double]] = v5.p0
    let v19: [Double] = v10[2]
    let v12: Double = v19[0]
    var v17: Double = v12
    let v98: Double = v17 * v6
    let v56: [Double] = v10[1]
    let v62: Double = v56[0]
    let v81: Double = v62 - v98
    return v81
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])])
    let v1: s2 = s2(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), p1: [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])])
    let v2: s4 = s4(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), p1: s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]), p2: [s1(p0: [s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]])], p1: [[s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])]]), s1(p0: [s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]]), s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]])], p1: [[s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])]]), s1(p0: [s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]]), s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]])], p1: [[s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]])]])])
    let v3: Double = 68.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 68.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
