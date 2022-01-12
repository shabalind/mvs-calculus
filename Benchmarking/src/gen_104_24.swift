  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: Double) -> Double {
    let v6: [[Double]] = v0.p1
    let v3: [Double] = v6[0]
    let v7: Double = v3[0]
    var v9: [Double] = v3
    v9[0] = v7
    let v12: [Double] = v6[0]
    let v23: Double = v3[0]
    let v28: Double = v12[0]
    v9[0] = v23
    v9[0] = v28
    let v65: Double = v9[0]
    return v65
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0]])
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
