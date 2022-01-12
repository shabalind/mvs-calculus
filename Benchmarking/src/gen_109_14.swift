  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f3(_ v0: [s0]) -> [s0] {
    let v4: [[s0]] = [v0, v0, v0, v0, v0, v0]
    var v18: [[s0]] = v4
    let v40: [s0] = v18[2]
    let v43: [s0] = v18[1]
    v18[4] = v43
    v18[3] = v0
    v18[2] = v40
    var v48: [s0] = v43
    return v48
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v2: [s0] = f3(v0)
    let v4: s0 = v2[0]
    let v6: s0 = v0[0]
    let v13: [[Double]] = v4.p1
    let v33: [Double] = v13[0]
    let v14: Double = v33[0]
    let v43: [[Double]] = v6.p1
    let v26: [Double] = v43[1]
    let v23: Double = v26[0]
    var v73: Double = v14
    v73 = v23
    return v73
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0]])]
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
