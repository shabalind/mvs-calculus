  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v2: [[Double]] = v0.p1
    let v5: [Double] = v2[0]
    let v8: [[Double]] = v0.p0
    let v4: s0 = s0(p0: v8, p1: v2)
    let v15: Double = v5[0]
    let v16: [[Double]] = v4.p1
    var v38: [[Double]] = v16
    let v88: [Double] = v38[0]
    let v52: Double = v88[0]
    let v163: Double = v52 / v1
    let v105: Double = v15 * v163
    return v105
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])
    let v1: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
