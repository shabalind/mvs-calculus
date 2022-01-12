  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v5: [[Double]] = v0.p1
    let v6: [[Double]] = v0.p1
    let v4: s0 = s0(p0: v6, p1: v5)
    var v3: s0 = v4
    v3.p1 = v5
    v3.p1 = v5
    let v11: [[Double]] = v4.p0
    v3.p1 = v11
    let v21: [[Double]] = v0.p0
    v3.p1 = v21
    v3.p0 = v11
    let v30: [[Double]] = v3.p0
    let v22: [Double] = v30[0]
    let v17: Double = v22[0]
    return v17
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0]])
    let v1: Double = 2.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 2.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
