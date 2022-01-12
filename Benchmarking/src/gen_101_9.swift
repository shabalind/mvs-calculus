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
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s0, _ v2: [[s0]], _ v3: Double) -> Double {
    let v7: [[Double]] = v1.p1
    let v10: [[Double]] = v1.p0
    let v20: Double = v3 / v3
    let v11: [Double] = v10[0]
    let v18: [Double] = v7[0]
    let v37: Double = v18[0]
    var v55: [Double] = v11
    var v40: [Double] = v55
    v55[0] = v3
    let v81: Double = v40[0]
    let v56: Double = v81 * v37
    v55[0] = v81
    v40[0] = v20
    v55 = v40
    return v56
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])))
    let v1: s0 = s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])
    let v2: [[s0]] = [[s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])], [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])]]
    let v3: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
