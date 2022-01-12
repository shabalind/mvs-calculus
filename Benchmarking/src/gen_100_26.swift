  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s5 {
    var p0: s0
    var p1: s1
  }
  func f62(_ v0: Double) -> Double {
    var v1: Double = v0
    var v4: Double = v1
    var v10: Double = v1
    var v15: Double = v4
    var v20: Double = v10
    var v11: Double = v0
    var v12: Double = v11
    let v30: [Double] = [v20, v12, v15]
    v4 = v0
    let v21: Double = v30[1]
    return v21
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s5, _ v2: Double) -> Double {
    var v5: Double = v2
    let v13: Double = v5 - v2
    var v8: Double = v5
    v5 = v8
    let v41: Double = v13 * v8
    let v81: Double = v41 + v8
    let v143: Double = f62(v81)
    v5 = v81
    return v143
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])]
    let v1: s5 = s5(p0: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), p1: s1(p0: [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])], p1: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])))
    let v2: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
