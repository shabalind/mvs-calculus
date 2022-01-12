  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f63(_ v0: Double, _ v1: s0) -> Double {
    let v6: Double = v0 / v0
    var v16: Double = v6
    return v16
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    var v7: Double = v1
    let v2: Double = v1 * v7
    var v3: Double = v1
    v3 = v7
    let v11: s0 = v0[0]
    let v15: Double = f63(v1, v11)
    let v17: [Double] = [v2, v1, v15, v7, v15, v1]
    v7 = v3
    let v49: Double = v17[4]
    return v49
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])]
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
