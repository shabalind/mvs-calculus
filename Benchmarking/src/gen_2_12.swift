  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s4 {
    var p0: s1
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: [[s4]], _ v1: Double) -> Double {
    let v12: [s4] = v0[0]
    let v10: s4 = v12[0]
    let v15: s1 = v10.p0
    let v20: s0 = v15.p1
    let v28: [[Double]] = v20.p1
    let v29: [[Double]] = v20.p1
    var v34: [[Double]] = v28
    let v49: [Double] = v29[0]
    let v55: [Double] = v34[0]
    let v58: Double = v55[0]
    v34 = v28
    v34[0] = v49
    return v58
  }
  func benchmark() {
    let v0: [[s4]] = [[s4(p0: s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])), p1: [s1(p0: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]))])]]
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
