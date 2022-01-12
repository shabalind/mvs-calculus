  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
    var p2: [s0]
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: s2, _ v2: Double) -> Double {
    let v5: [s0] = v1.p0
    let v7: s0 = v5[0]
    let v11: [[Double]] = v7.p0
    let v26: [Double] = [v2, v2, v2]
    let v23: [Double] = v11[1]
    var v25: [Double] = v26
    v25[2] = v2
    v25[0] = v2
    let v20: [s1] = v0[0]
    let v53: Double = v23[0]
    let v37: Double = v53 / v53
    let v36: s1 = v20[0]
    let v46: s0 = v36.p0
    v25 = v26
    v25[2] = v37
    let v100: [[Double]] = v46.p1
    let v114: Double = v25[0]
    let v119: [Double] = v100[0]
    let v64: Double = v119[0]
    let v158: Double = v114 / v64
    return v158
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]))], [s1(p0: s0(p0: [[3.0], [4.0]], p1: [[5.0]]))]]
    let v1: s2 = s2(p0: [s0(p0: [[6.0], [7.0]], p1: [[8.0]])], p1: s1(p0: s0(p0: [[9.0], [10.0]], p1: [[11.0]])), p2: [s0(p0: [[12.0], [13.0]], p1: [[14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0]])])
    let v2: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
