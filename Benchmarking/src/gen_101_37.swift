  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: [[s1]]
    var p1: [s0]
  }
  struct s4 {
    var p0: [[s0]]
    var p1: [[s0]]
  }
  struct s7 {
    var p0: [[s4]]
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: s7, _ v2: Double) -> Double {
    let v4: s2 = v0[0]
    let v13: [s0] = v4.p1
    let v5: s0 = v13[0]
    let v11: [Double] = v5.p0
    let v24: Double = v11[0]
    let v23: [Double] = v5.p0
    let v36: Double = v24 - v2
    let v71: Double = v36 / v24
    let v35: Double = v23[0]
    let v45: Double = v35 - v71
    let v380: Double = v45 + v71
    return v380
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [[s1(p0: [s0(p0: [0.0], p1: [[1.0]]), s0(p0: [2.0], p1: [[3.0]])], p1: [s0(p0: [4.0], p1: [[5.0]]), s0(p0: [6.0], p1: [[7.0]])])]], p1: [s0(p0: [8.0], p1: [[9.0]]), s0(p0: [10.0], p1: [[11.0]]), s0(p0: [12.0], p1: [[13.0]])])]
    let v1: s7 = s7(p0: [[s4(p0: [[s0(p0: [14.0], p1: [[15.0]])]], p1: [[s0(p0: [16.0], p1: [[17.0]])]])], [s4(p0: [[s0(p0: [18.0], p1: [[19.0]])]], p1: [[s0(p0: [20.0], p1: [[21.0]])]])], [s4(p0: [[s0(p0: [22.0], p1: [[23.0]])]], p1: [[s0(p0: [24.0], p1: [[25.0]])]])]], p1: s1(p0: [s0(p0: [26.0], p1: [[27.0]]), s0(p0: [28.0], p1: [[29.0]])], p1: [s0(p0: [30.0], p1: [[31.0]]), s0(p0: [32.0], p1: [[33.0]])]))
    let v2: Double = 34.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 34.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
