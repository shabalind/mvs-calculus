  import Dispatch
  struct s0 {
    var p0: [Double]
  }
  struct s2 {
    var p0: s0
    var p1: [[s0]]
  }
  func f84(_ v0: s2) -> s2 {
    let v1: [[s0]] = v0.p1
    var v3: [[s0]] = v1
    let v4: s0 = v0.p0
    let v6: [s0] = v3[0]
    var v2: s2 = v0
    v3[1] = v6
    var v5: [s0] = v6
    let v9: s0 = v0.p0
    v2.p0 = v4
    let v16: [[s0]] = v2.p1
    v2.p0 = v4
    v3[1] = v5
    v2.p1 = v3
    v3[0] = v6
    v5[0] = v9
    v5[0] = v4
    let v13: s2 = s2(p0: v4, p1: v16)
    v5[0] = v9
    return v13
  }
  func f75(_ v0: s0, _ v1: s0) -> s0 {
    var v6: s0 = v0
    var v3: s0 = v6
    v3 = v1
    let v4: [Double] = v0.p0
    let v9: [Double] = v6.p0
    var v13: s0 = v3
    let v11: [Double] = v1.p0
    let v19: s0 = s0(p0: v4)
    v13.p0 = v11
    var v24: [Double] = v4
    v13 = v1
    v6 = v3
    let v18: [Double] = v13.p0
    var v12: [Double] = v24
    var v26: [Double] = v9
    var v31: [Double] = v12
    v3.p0 = v24
    let v34: [Double] = v19.p0
    let v22: [[Double]] = [v26, v4, v31, v34, v18, v11]
    let v29: [Double] = v22[4]
    v24 = v29
    return v13
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v7: s2 = v0[0]
    let v2: s2 = f84(v7)
    let v8: s2 = f84(v2)
    let v18: s0 = v8.p0
    let v19: s0 = f75(v18, v18)
    let v23: s0 = f75(v19, v19)
    let v69: [Double] = v23.p0
    let v100: Double = v69[1]
    return v100
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s0(p0: [0.0, 1.0]), p1: [[s0(p0: [2.0, 3.0])], [s0(p0: [4.0, 5.0])]]), s2(p0: s0(p0: [6.0, 7.0]), p1: [[s0(p0: [8.0, 9.0])], [s0(p0: [10.0, 11.0])]])]
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
