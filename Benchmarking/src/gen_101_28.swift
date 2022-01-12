  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f85(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p1
    let v12: [[Double]] = v0.p0
    let v8: s0 = s0(p0: v12, p1: v3)
    return v8
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v7: s0 = f85(v0)
    let v8: [[Double]] = v7.p1
    let v6: [Double] = v8[1]
    let v4: [[Double]] = v0.p0
    var v11: [[Double]] = v4
    v11[0] = v6
    let v20: [Double] = v11[0]
    let v47: Double = v20[0]
    var v34: Double = v47
    return v34
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])
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
