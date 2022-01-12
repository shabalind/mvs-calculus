  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s4 {
    var p0: [s1]
    var p1: s0
  }
  struct s5 {
    var p0: s2
    var p1: s2
  }
  struct s8 {
    var p0: s4
    var p1: [[s4]]
  }
  @inline(never)
  func f0(_ v0: [s8], _ v1: s5, _ v2: s5, _ v3: Double) -> Double {
    let v11: s8 = v0[0]
    let v14: [[s4]] = v11.p1
    let v13: [s4] = v14[0]
    var v23: Double = v3
    let v26: s4 = v13[0]
    var v19: s4 = v26
    let v36: [s4] = v14[0]
    v19 = v26
    let v37: Double = v3 / v23
    let v52: s0 = v19.p1
    var v41: s0 = v52
    let v111: s4 = v36[0]
    v41.p0 = v37
    v19.p1 = v52
    let v200: [[Double]] = v41.p1
    let v80: s0 = v111.p1
    let v58: [Double] = v200[0]
    v19.p1 = v80
    let v181: Double = v58[0]
    return v181
  }
  func benchmark() {
    let v0: [s8] = [s8(p0: s4(p0: [s1(p0: s0(p0: 0.0, p1: [[1.0], [2.0]])), s1(p0: s0(p0: 3.0, p1: [[4.0], [5.0]]))], p1: s0(p0: 6.0, p1: [[7.0], [8.0]])), p1: [[s4(p0: [s1(p0: s0(p0: 9.0, p1: [[10.0], [11.0]])), s1(p0: s0(p0: 12.0, p1: [[13.0], [14.0]]))], p1: s0(p0: 15.0, p1: [[16.0], [17.0]]))]])]
    let v1: s5 = s5(p0: s2(p0: [s0(p0: 18.0, p1: [[19.0], [20.0]]), s0(p0: 21.0, p1: [[22.0], [23.0]]), s0(p0: 24.0, p1: [[25.0], [26.0]])], p1: [[s0(p0: 27.0, p1: [[28.0], [29.0]])]]), p1: s2(p0: [s0(p0: 30.0, p1: [[31.0], [32.0]]), s0(p0: 33.0, p1: [[34.0], [35.0]]), s0(p0: 36.0, p1: [[37.0], [38.0]])], p1: [[s0(p0: 39.0, p1: [[40.0], [41.0]])]]))
    let v2: s5 = s5(p0: s2(p0: [s0(p0: 42.0, p1: [[43.0], [44.0]]), s0(p0: 45.0, p1: [[46.0], [47.0]]), s0(p0: 48.0, p1: [[49.0], [50.0]])], p1: [[s0(p0: 51.0, p1: [[52.0], [53.0]])]]), p1: s2(p0: [s0(p0: 54.0, p1: [[55.0], [56.0]]), s0(p0: 57.0, p1: [[58.0], [59.0]]), s0(p0: 60.0, p1: [[61.0], [62.0]])], p1: [[s0(p0: 63.0, p1: [[64.0], [65.0]])]]))
    let v3: Double = 66.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 66.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
