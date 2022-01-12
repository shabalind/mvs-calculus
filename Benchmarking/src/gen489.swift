  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: Double
  }
  struct s2 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s4 {
    var p0: s0
    var p1: [s1]
  }
  struct s5 {
    var p0: [s2]
    var p1: s4
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: s5, _ v2: Double) -> Double {
    let v5: [s1] = v0.p1
    let v6: s0 = v0.p0
    let v10: s1 = v5[1]
    var v16: s1 = v10
    let v9: [[Double]] = v6.p0
    let v28: Double = v16.p1
    var v31: Double = v28
    let v41: [Double] = v9[0]
    let v80: [Double] = v9[0]
    v16.p1 = v31
    let v69: Double = v80[0]
    let v214: Double = v41[0]
    let v91: Double = v28 - v69
    let v94: Double = v214 / v91
    return v94
  }
  func benchmark() {
    let v0: s4 = s4(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: [s1(p0: [[s0(p0: [[2.0]], p1: [[3.0]])]], p1: 4.0), s1(p0: [[s0(p0: [[5.0]], p1: [[6.0]])]], p1: 7.0)])
    let v1: s5 = s5(p0: [s2(p0: [s0(p0: [[8.0]], p1: [[9.0]]), s0(p0: [[10.0]], p1: [[11.0]])], p1: [[s0(p0: [[12.0]], p1: [[13.0]])]])], p1: s4(p0: s0(p0: [[14.0]], p1: [[15.0]]), p1: [s1(p0: [[s0(p0: [[16.0]], p1: [[17.0]])]], p1: 18.0), s1(p0: [[s0(p0: [[19.0]], p1: [[20.0]])]], p1: 21.0)]))
    let v2: Double = 22.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 22.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
