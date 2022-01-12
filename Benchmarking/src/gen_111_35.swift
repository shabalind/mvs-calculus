  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v3: [s0] = v0[0]
    let v2: s0 = v3[0]
    let v5: [[Double]] = v2.p0
    let v18: [[Double]] = v2.p0
    let v17: s0 = v3[0]
    let v38: [Double] = v18[0]
    let v21: [Double] = v5[1]
    let v20: [[Double]] = v17.p1
    var v39: [[Double]] = v20
    v39[0] = v21
    let v29: [Double] = v39[0]
    v39[0] = v38
    let v111: Double = v29[0]
    let v323: Double = v111 + v1
    return v323
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])]]
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
