  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f57(_ v0: s0, _ v1: s0, _ v2: Double) -> s0 {
    let v4: [[Double]] = v1.p1
    var v5: s0 = v0
    var v13: [[Double]] = v4
    let v30: [[Double]] = v1.p1
    let v19: [[Double]] = v0.p0
    var v33: [[Double]] = v30
    let v21: [Double] = v13[0]
    v5.p0 = v19
    v5.p1 = v33
    let v50: [[Double]] = v1.p1
    var v53: s0 = v5
    v33[0] = v21
    v5.p1 = v50
    return v53
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v13: [s0] = v0[1]
    let v21: s0 = v13[0]
    let v19: s0 = v13[0]
    let v16: s0 = f57(v19, v21, v1)
    let v26: [[Double]] = v16.p0
    var v57: [[Double]] = v26
    let v40: [Double] = v57[1]
    let v108: Double = v40[0]
    return v108
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])], [s0(p0: [[3.0], [4.0]], p1: [[5.0]])], [s0(p0: [[6.0], [7.0]], p1: [[8.0]])]]
    let v1: Double = 9.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 9.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
