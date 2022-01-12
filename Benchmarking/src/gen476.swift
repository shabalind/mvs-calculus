  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [[s0]], _ v2: Double) -> Double {
    var v6: Double = v2
    let v9: Double = v2 + v6
    var v5: Double = v2
    v6 = v5
    v6 = v9
    v5 = v2
    let v7: [Double] = [v6, v2, v2, v5, v5]
    var v16: [Double] = v7
    v16[4] = v9
    v16[4] = v5
    var v44: Double = v5
    v16[2] = v44
    v16[0] = v5
    var v48: [Double] = v16
    v48[3] = v2
    let v72: Double = v48[3]
    return v72
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0]])
    let v1: [[s0]] = [[s0(p0: [[3.0], [4.0]], p1: [[5.0]])]]
    let v2: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
