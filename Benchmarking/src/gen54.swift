  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s4 {
    var p0: s1
    var p1: [s1]
  }
  func f33(_ v0: s1) -> s1 {
    var v4: s1 = v0
    var v8: s1 = v0
    let v6: [s0] = v4.p1
    v8.p1 = v6
    var v3: [s0] = v6
    let v5: [s0] = v8.p1
    let v1: s0 = v5[0]
    let v7: [s0] = v0.p1
    v3 = v7
    var v10: s0 = v1
    var v2: s0 = v1
    v3[0] = v10
    v3[0] = v2
    v4.p1 = v3
    v8.p1 = v3
    v8.p1 = v5
    v4.p1 = v5
    return v8
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    var v5: Double = v1
    let v10: s1 = v0.p0
    let v3: s1 = f33(v10)
    let v8: [s0] = v3.p0
    let v9: s0 = v8[0]
    let v20: [[Double]] = v9.p1
    var v16: Double = v1
    let v23: [Double] = v20[0]
    let v25: Double = v5 - v16
    var v53: [Double] = v23
    v53[0] = v25
    var v43: Double = v16
    let v120: Double = v53[0]
    v53[0] = v1
    v53[0] = v43
    return v120
  }
  func benchmark() {
    let v0: s4 = s4(p0: s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: [s0(p0: [[6.0], [7.0]], p1: [[8.0]])]), p1: [s1(p0: [s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]])], p1: [s0(p0: [[15.0], [16.0]], p1: [[17.0]])])])
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
