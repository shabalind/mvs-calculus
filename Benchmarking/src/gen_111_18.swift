  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v2: s0 = v0[0]
    let v5: [[Double]] = v2.p0
    let v4: [[Double]] = v2.p0
    let v3: s0 = s0(p0: v5, p1: v4)
    var v13: Double = v1
    let v14: [[Double]] = v3.p0
    var v10: [[Double]] = v4
    v10 = v14
    let v15: [Double] = v10[0]
    let v26: Double = v15[0]
    v13 = v26
    return v13
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0]])]
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
