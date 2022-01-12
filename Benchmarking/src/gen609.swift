  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f17(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v2: [[Double]] = v0.p1
    let v10: [[Double]] = v0.p1
    let v9: [s0] = [v5, v0]
    v5.p1 = v10
    let v8: Double = v5.p0
    let v13: s0 = v9[1]
    v5 = v13
    v5.p1 = v10
    v5 = v13
    v5.p0 = v8
    v5.p1 = v2
    return v5
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v5: s0 = v0.p1
    var v7: s0 = v5
    let v9: s0 = f17(v5)
    let v12: Double = v9.p0
    let v18: [[Double]] = v7.p1
    let v16: [Double] = v18[0]
    let v13: Double = v16[0]
    var v48: Double = v12
    var v34: Double = v13
    let v84: [[Double]] = v9.p1
    v7.p1 = v84
    v7.p0 = v48
    return v34
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: 0.0, p1: [[1.0]])], p1: s0(p0: 2.0, p1: [[3.0]]))
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
