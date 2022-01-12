  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s0, _ v2: Double) -> Double {
    let v8: s0 = v0[0]
    let v21: Double = v2 * v2
    let v10: [[Double]] = v8.p1
    let v14: Double = v21 / v21
    let v15: [Double] = v10[0]
    let v18: Double = v15[0]
    var v54: [Double] = v15
    let v30: Double = v54[0]
    var v40: Double = v30
    let v66: Double = v30 / v2
    v54[0] = v40
    let v32: Double = v66 + v14
    v54[0] = v18
    return v32
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0]])]
    let v1: s0 = s0(p0: [[2.0]], p1: [[3.0]])
    let v2: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
