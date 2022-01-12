  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f103(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v3: [[Double]] = v7.p1
    let v4: [[Double]] = v0.p0
    v7.p0 = v4
    let v11: [[Double]] = v0.p0
    let v1: [[Double]] = v7.p1
    v7.p1 = v3
    v7.p0 = v11
    let v6: s0 = s0(p0: v4, p1: v1)
    v7 = v6
    return v6
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v3: s0 = f103(v0)
    let v6: [[Double]] = v3.p0
    let v11: [[Double]] = v0.p1
    let v31: s0 = s0(p0: v6, p1: v11)
    let v13: [[Double]] = v31.p1
    let v12: [Double] = v13[0]
    let v40: Double = v12[0]
    return v40
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0]])
    let v1: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
