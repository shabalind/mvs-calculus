  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    var v4: Double = v1
    var v15: Double = v4
    let v5: [s0] = v0[1]
    let v9: s0 = v5[0]
    let v24: Double = v15 * v4
    let v17: [[Double]] = v9.p0
    let v21: [Double] = v17[0]
    var v25: [Double] = v21
    v25[0] = v24
    let v87: Double = v25[0]
    return v87
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])], [s0(p0: [[3.0], [4.0]], p1: [[5.0]])]]
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
