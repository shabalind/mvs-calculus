  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: [s0]
    var p3: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: s1
    var p2: s1
    var p3: s0
    var p4: s0
    var p5: s1
    var p6: [s0]
    var p7: s0
  }
  struct s4 {
    var p0: s1
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v2: s1 = v0.p1
    let v5: s1 = v0.p1
    var v8: s1 = v5
    let v10: [s1] = [v2]
    let v3: [s1] = [v2, v2, v5, v2, v8]
    let v4: s1 = v3[1]
    var v9: s2 = v0
    var v13: [s1] = v3
    let v14: s1 = v10[0]
    var v17: [s1] = v13
    let v12: [s0] = v4.p3
    let v15: s0 = v9.p7
    v8.p0 = v15
    var v11: s1 = v2
    let v16: s0 = v5.p0
    v13[3] = v4
    v11.p0 = v16
    v17[0] = v8
    let v23: s0 = v12[0]
    v13[2] = v8
    let v22: s0 = v0.p0
    let v26: s1 = v10[0]
    v13[0] = v11
    let v50: s0 = v8.p0
    let v28: s1 = v0.p5
    v9.p1 = v4
    let v55: s4 = s4(p0: v5, p1: v8)
    let v21: s1 = v55.p1
    v8.p1 = v50
    v9.p2 = v14
    var v43: s2 = v0
    v11.p3 = v12
    v9 = v43
    var v32: s4 = v55
    v8 = v14
    v43.p1 = v21
    var v52: s1 = v8
    v52.p1 = v22
    v8.p0 = v23
    v32.p1 = v11
    v52.p1 = v15
    let v61: s1 = v32.p1
    v43.p1 = v52
    let v86: [s0] = v28.p2
    v8 = v5
    v52.p2 = v86
    let v44: s0 = v9.p3
    v32.p1 = v2
    v9.p1 = v61
    var v80: s0 = v44
    let v137: [Double] = v80.p0
    v32.p1 = v26
    v32.p0 = v52
    let v119: s1 = v17[3]
    var v97: s1 = v119
    let v114: Double = v137[0]
    v32.p0 = v97
    v17 = v13
    return v114
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [0.0], p1: [[1.0], [2.0]]), p1: s1(p0: s0(p0: [3.0], p1: [[4.0], [5.0]]), p1: s0(p0: [6.0], p1: [[7.0], [8.0]]), p2: [s0(p0: [9.0], p1: [[10.0], [11.0]]), s0(p0: [12.0], p1: [[13.0], [14.0]])], p3: [s0(p0: [15.0], p1: [[16.0], [17.0]])]), p2: s1(p0: s0(p0: [18.0], p1: [[19.0], [20.0]]), p1: s0(p0: [21.0], p1: [[22.0], [23.0]]), p2: [s0(p0: [24.0], p1: [[25.0], [26.0]]), s0(p0: [27.0], p1: [[28.0], [29.0]])], p3: [s0(p0: [30.0], p1: [[31.0], [32.0]])]), p3: s0(p0: [33.0], p1: [[34.0], [35.0]]), p4: s0(p0: [36.0], p1: [[37.0], [38.0]]), p5: s1(p0: s0(p0: [39.0], p1: [[40.0], [41.0]]), p1: s0(p0: [42.0], p1: [[43.0], [44.0]]), p2: [s0(p0: [45.0], p1: [[46.0], [47.0]]), s0(p0: [48.0], p1: [[49.0], [50.0]])], p3: [s0(p0: [51.0], p1: [[52.0], [53.0]])]), p6: [s0(p0: [54.0], p1: [[55.0], [56.0]]), s0(p0: [57.0], p1: [[58.0], [59.0]])], p7: s0(p0: [60.0], p1: [[61.0], [62.0]]))
    let v1: Double = 63.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 63.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
