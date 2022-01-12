  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s5 {
    var p0: s0
    var p1: s1
  }
  func f67(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v3: [[Double]] = v7.p1
    var v5: s0 = v7
    var v8: s0 = v5
    v7.p1 = v3
    let v4: [[Double]] = v8.p1
    let v2: [[Double]] = v7.p1
    v5.p1 = v2
    let v10: [[Double]] = v8.p1
    v8.p1 = v3
    let v15: [[Double]] = v0.p1
    let v23: [[Double]] = v7.p1
    v7.p1 = v23
    v5.p1 = v2
    let v29: [s0] = [v8, v7]
    v7.p1 = v15
    let v37: [[Double]] = v5.p1
    let v59: [[Double]] = v5.p0
    var v80: [[Double]] = v59
    let v49: s0 = s0(p0: v59, p1: v4)
    v8.p1 = v37
    var v42: [s0] = v29
    let v38: [[Double]] = v49.p0
    let v124: [[Double]] = v8.p1
    v5.p0 = v80
    v5.p0 = v80
    let v119: s0 = v42[1]
    v7.p1 = v10
    var v101: s0 = v119
    v101.p1 = v2
    v5.p1 = v124
    v101.p0 = v38
    return v101
  }
  func f60(_ v0: s1) -> s1 {
    var v2: s1 = v0
    let v4: [s1] = [v0]
    let v6: s1 = v4[0]
    var v5: s1 = v2
    v5 = v6
    let v15: s1 = v4[0]
    var v1: s1 = v5
    let v8: [s0] = v1.p0
    let v13: [s0] = v5.p0
    var v9: [s0] = v13
    let v10: s0 = v2.p1
    v2.p0 = v9
    let v19: s0 = v9[0]
    var v12: [s0] = v13
    v9[0] = v10
    let v17: s5 = s5(p0: v19, p1: v15)
    let v21: s0 = v8[0]
    let v25: s0 = v12[0]
    v5.p0 = v8
    v2.p0 = v12
    let v16: [[s0]] = [v12, v12, v8]
    v9[0] = v21
    v5.p1 = v21
    var v23: [[s0]] = v16
    let v56: [s0] = v23[2]
    v12[0] = v25
    v5.p0 = v56
    let v104: s1 = v17.p1
    v23[2] = v56
    return v104
  }
  func f31(_ v0: s1) -> s1 {
    var v7: s1 = v0
    let v1: [s0] = v0.p0
    let v2: s0 = v1[0]
    v7.p1 = v2
    let v6: s1 = f60(v7)
    var v5: s1 = v6
    let v9: s1 = f60(v0)
    let v38: s0 = v1[0]
    let v15: s0 = v0.p1
    v7.p0 = v1
    let v18: [s0] = v0.p0
    let v29: s5 = s5(p0: v15, p1: v9)
    let v24: s0 = v29.p0
    let v22: s0 = f67(v24)
    v7.p1 = v22
    v7.p1 = v38
    let v32: s0 = v6.p1
    v7.p0 = v18
    let v58: [s0] = v9.p0
    v5.p0 = v58
    v5.p1 = v32
    v7.p0 = v58
    return v5
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v4: s1 = v0[1]
    let v9: s1 = f31(v4)
    let v8: [s0] = v9.p0
    let v11: s0 = v8[0]
    let v5: s0 = v8[0]
    var v10: s0 = v5
    let v29: [[Double]] = v10.p1
    let v12: [Double] = v29[1]
    let v24: s0 = f67(v11)
    let v21: [[Double]] = v11.p0
    v10.p1 = v29
    v10.p0 = v21
    let v62: Double = v12[0]
    let v32: Double = v1 / v62
    let v90: [[Double]] = v24.p0
    let v125: Double = v32 + v1
    v10.p0 = v90
    let v101: [[Double]] = v11.p1
    v10.p1 = v101
    var v184: Double = v125
    return v184
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])], p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])), s1(p0: [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])), s1(p0: [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]))]
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
