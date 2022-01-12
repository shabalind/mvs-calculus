  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: [[s0]]
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v3: [s1] = v0[0]
    var v5: Double = v1
    var v11: Double = v5
    let v7: s1 = v3[0]
    let v13: Double = v5 - v11
    let v14: s0 = v7.p1
    let v26: [[Double]] = v14.p1
    var v15: s0 = v14
    let v23: [Double] = v15.p0
    let v19: [[Double]] = [v23, v23, v23, v23]
    var v24: [[Double]] = v19
    v15.p0 = v23
    let v58: [Double] = v26[0]
    v24[1] = v23
    v15.p0 = v23
    var v46: [[Double]] = v24
    let v44: Double = v58[0]
    let v36: [Double] = v46[0]
    let v83: Double = v5 * v1
    v5 = v44
    v15.p1 = v26
    let v53: Double = v36[0]
    v46 = v24
    let v197: [Double] = [v5, v13, v13, v83, v5, v44, v13]
    v15.p0 = v36
    let v55: Double = v197[0]
    v15.p0 = v23
    let v74: Double = v53 / v55
    return v74
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [0.0, 1.0, 2.0], p1: [[3.0]]), p1: s0(p0: [4.0, 5.0, 6.0], p1: [[7.0]]), p2: [[s0(p0: [8.0, 9.0, 10.0], p1: [[11.0]])], [s0(p0: [12.0, 13.0, 14.0], p1: [[15.0]])]])]]
    let v1: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
