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
    var p1: s1
    var p2: s1
  }
  func f46(_ v0: s0) -> s0 {
    var v3: s0 = v0
    var v2: s0 = v3
    let v11: [[Double]] = v0.p1
    var v6: s0 = v2
    let v5: [[Double]] = v3.p1
    let v10: [[Double]] = v3.p1
    v3.p1 = v11
    let v15: [[Double]] = v6.p1
    let v9: [[Double]] = v0.p0
    let v27: [[Double]] = v0.p0
    v3.p0 = v27
    let v28: [Double] = v9[0]
    v2.p0 = v9
    let v12: [[Double]] = v6.p0
    v3.p1 = v15
    v6.p0 = v9
    var v16: [[Double]] = v12
    v6.p1 = v15
    let v20: [Double] = v16[0]
    v16[0] = v28
    let v34: [[Double]] = v2.p1
    v16[0] = v20
    let v19: [[Double]] = v3.p0
    v6.p1 = v5
    let v21: s0 = s0(p0: v19, p1: v10)
    v2.p0 = v16
    v6.p1 = v34
    v6 = v2
    v3.p0 = v16
    return v21
  }
  func f30(_ v0: s0) -> s0 {
    let v1: s1 = s1(p0: v0, p1: v0)
    let v5: s0 = f46(v0)
    var v6: s1 = v1
    let v3: s0 = f46(v0)
    var v7: s1 = v6
    v7.p1 = v5
    var v4: s1 = v6
    var v2: s1 = v6
    let v15: s0 = v7.p1
    v2 = v4
    let v21: s0 = v2.p0
    v6.p1 = v15
    v6 = v2
    v7.p0 = v21
    let v63: s0 = v6.p0
    let v18: s0 = f46(v63)
    let v40: s2 = s2(p0: v2, p1: v4, p2: v1)
    v2.p1 = v18
    let v39: s1 = v40.p0
    let v214: s0 = v6.p1
    v6.p1 = v214
    v6.p0 = v214
    v4.p0 = v3
    let v122: s0 = v39.p1
    return v122
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v6: s0 = v0[1]
    let v4: s0 = f30(v6)
    let v5: [[Double]] = v4.p0
    let v23: [Double] = v5[0]
    let v54: Double = v23[0]
    var v27: Double = v54
    let v55: Double = v54 + v27
    return v55
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0]]), s0(p0: [[3.0]], p1: [[4.0], [5.0]])]
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
