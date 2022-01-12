  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  func f32(_ v0: s2) -> s2 {
    let v4: [s0] = v0.p1
    var v2: s2 = v0
    let v6: s0 = v2.p0
    let v1: s2 = s2(p0: v6, p1: v4)
    v2.p0 = v6
    v2.p1 = v4
    v2 = v0
    var v55: s2 = v1
    return v55
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v3: s2 = f32(v0)
    let v5: s0 = v3.p0
    let v6: [[Double]] = v5.p0
    let v13: [Double] = v6[1]
    var v12: [[Double]] = v6
    v12[0] = v13
    let v22: [Double] = v12[0]
    let v29: Double = v22[0]
    let v47: Double = v29 * v1
    return v47
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: [s0(p0: [[3.0], [4.0]], p1: [[5.0]])])
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
