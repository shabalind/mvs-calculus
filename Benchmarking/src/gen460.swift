  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v3: [s0] = v0.p0
    let v21: s0 = v3[0]
    let v13: [[Double]] = v21.p1
    let v17: [Double] = v13[0]
    var v30: Double = v1
    let v51: Double = v17[0]
    let v96: [Double] = v13[0]
    var v75: [Double] = v96
    v75[0] = v30
    let v116: Double = v75[0]
    v75[0] = v51
    var v162: Double = v116
    return v162
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]])], p1: s1(p0: s0(p0: [[3.0], [4.0]], p1: [[5.0]]), p1: s0(p0: [[6.0], [7.0]], p1: [[8.0]])))
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
