  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    var v3: s0 = v0
    v3.p0 = v1
    var v10: Double = v1
    v3.p0 = v10
    var v6: s0 = v3
    let v13: Double = v3.p0
    v6.p0 = v13
    var v11: Double = v10
    var v27: s0 = v6
    v3.p0 = v11
    let v33: Double = v6.p0
    var v16: s0 = v27
    v16.p0 = v11
    var v66: s0 = v16
    v66.p0 = v33
    let v89: Double = v66.p0
    v27.p0 = v33
    return v89
  }
  func benchmark() {
    let v0: s0 = s0(p0: 0.0, p1: [[1.0], [2.0]])
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
