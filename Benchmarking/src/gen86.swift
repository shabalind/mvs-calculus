  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s4 {
    var p0: s1
    var p1: s1
  }
  func f29(_ v0: s0, _ v1: s0) -> s0 {
    let v2: [[Double]] = v1.p0
    let v3: [s0] = [v0, v1, v0, v1, v1]
    let v4: s0 = v3[3]
    let v8: [Double] = v2[0]
    let v10: s0 = v3[3]
    let v5: [[Double]] = v1.p0
    let v11: s0 = v3[1]
    let v12: [[Double]] = v10.p1
    let v21: [[Double]] = v4.p1
    var v23: s0 = v0
    var v15: [[Double]] = v2
    var v28: s0 = v1
    v23.p0 = v5
    v28.p1 = v12
    let v25: [[Double]] = v11.p1
    v28.p0 = v5
    v15[2] = v8
    v23.p1 = v25
    let v16: [[Double]] = v28.p0
    v28.p0 = v5
    let v38: [Double] = v15[2]
    v23.p1 = v21
    v28.p1 = v21
    v28.p1 = v12
    let v52: [[Double]] = v10.p0
    let v41: s0 = v3[3]
    v28.p1 = v25
    let v78: [[Double]] = v10.p1
    let v32: [[Double]] = v11.p0
    var v70: [[Double]] = v32
    var v85: [[Double]] = v70
    var v51: [s0] = v3
    v23.p1 = v12
    v15 = v16
    let v66: [[Double]] = v28.p0
    var v93: [s0] = v51
    v28.p0 = v15
    v85[2] = v38
    v93[1] = v28
    let v86: [[Double]] = v41.p0
    let v74: [Double] = v78[0]
    v28.p0 = v52
    v23.p0 = v66
    let v176: s0 = v93[1]
    v28.p0 = v2
    v51[4] = v28
    v28.p1 = v21
    v23.p0 = v86
    let v109: [Double] = v85[1]
    v15[1] = v109
    v85[0] = v74
    v93[3] = v23
    v23.p0 = v70
    return v176
  }
  func f28(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v1: [[Double]] = v7.p1
    let v6: s0 = f29(v0, v7)
    let v11: [Double] = v1[0]
    var v9: [[Double]] = v1
    var v8: [Double] = v11
    var v16: [Double] = v8
    v7.p1 = v1
    var v31: [Double] = v16
    let v21: Double = v16[0]
    v8 = v31
    v7.p1 = v9
    let v15: Double = v16[0]
    let v17: [[Double]] = v7.p0
    v9[0] = v31
    v8[0] = v15
    v16[0] = v21
    let v27: s0 = s0(p0: v17, p1: v9)
    let v55: s0 = f29(v6, v27)
    v9[0] = v31
    let v43: s0 = f29(v55, v7)
    return v43
  }
  func f24(_ v0: s1) -> s1 {
    let v7: s0 = v0.p0
    var v2: s1 = v0
    v2 = v0
    v2.p0 = v7
    v2.p0 = v7
    return v2
  }
  func f19(_ v0: s4) -> s4 {
    var v5: s4 = v0
    let v6: s1 = v0.p1
    v5.p1 = v6
    return v5
  }
  func f11(_ v0: s0) -> s0 {
    var v2: s0 = v0
    let v6: [[Double]] = v2.p1
    let v1: [[Double]] = v2.p1
    v2.p1 = v1
    let v4: s0 = f28(v0)
    v2.p1 = v1
    v2.p1 = v1
    var v5: s0 = v0
    let v14: [[Double]] = v0.p0
    let v20: s0 = f29(v4, v5)
    v2.p0 = v14
    let v15: [[Double]] = v20.p0
    v5.p0 = v15
    let v26: s0 = f28(v0)
    v2.p1 = v1
    let v30: [s0] = [v20, v26]
    let v38: s0 = v30[0]
    let v46: [[Double]] = v2.p0
    var v125: s0 = v38
    v125.p1 = v6
    v5.p0 = v46
    return v125
  }
  func f6(_ v0: s1, _ v1: Double, _ v2: s4) -> Double {
    let v5: s0 = v0.p0
    let v8: [[Double]] = v5.p0
    let v12: [Double] = v8[1]
    let v58: Double = v12[0]
    let v45: Double = v1 + v58
    var v63: Double = v45
    return v63
  }
  func f1(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v8: s0 = f11(v6)
    let v4: [s0] = [v8, v0, v6, v8]
    let v1: s0 = v4[0]
    let v7: s0 = v4[3]
    let v5: s0 = v4[3]
    let v2: [[Double]] = v7.p0
    v6.p0 = v2
    let v12: [[Double]] = v5.p1
    var v10: [[Double]] = v2
    var v21: s0 = v7
    let v3: [Double] = v12[0]
    v10[1] = v3
    let v13: [Double] = v2[0]
    v6.p0 = v2
    v10[0] = v3
    v10[1] = v13
    v21.p0 = v10
    v21.p1 = v12
    v21.p1 = v12
    let v25: s0 = f11(v21)
    let v43: s0 = f29(v1, v25)
    return v43
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s1, _ v2: s0, _ v3: Double) -> Double {
    let v5: s0 = f1(v2)
    let v9: s0 = f29(v5, v5)
    let v13: s0 = f28(v9)
    let v8: [[Double]] = v13.p0
    let v10: [Double] = v8[0]
    var v21: Double = v3
    let v15: Double = v10[0]
    let v31: s1 = f24(v0)
    let v76: [s1] = [v1, v0, v0]
    let v71: s1 = v76[1]
    let v64: s4 = s4(p0: v1, p1: v31)
    let v125: s4 = f19(v64)
    let v104: Double = v15 * v21
    let v205: Double = f6(v71, v104, v125)
    return v205
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])])
    let v1: s1 = s1(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), p1: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]), s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])])
    let v2: s0 = s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])
    let v3: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
