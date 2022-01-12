  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  struct s4 {
    var p0: [s1]
    var p1: s0
  }
  func f26(_ v0: s2, _ v1: s0) -> s2 {
    var v5: s2 = v0
    var v4: s0 = v1
    var v8: s0 = v1
    var v26: s2 = v5
    let v28: [s0] = v0.p0
    let v20: [[Double]] = v4.p1
    var v23: [s0] = v28
    let v38: s0 = v23[1]
    v26.p1 = v8
    var v49: s2 = v26
    v8.p1 = v20
    v26.p0 = v28
    v5.p1 = v38
    return v49
  }
  func f24(_ v0: s0) -> s0 {
    let v1: [s0] = [v0, v0, v0]
    var v3: s0 = v0
    var v5: [s0] = v1
    v5[1] = v3
    let v6: [[Double]] = v0.p1
    var v12: [[Double]] = v6
    let v7: [[Double]] = v0.p1
    let v4: [[Double]] = v0.p1
    v3 = v0
    v3.p1 = v12
    let v10: [[[Double]]] = [v4, v6, v6, v6, v4, v4, v12]
    let v15: [[Double]] = v10[3]
    v3.p1 = v6
    let v9: [[Double]] = v0.p1
    v3 = v0
    let v11: s2 = s2(p0: v5, p1: v0)
    let v40: [[Double]] = v3.p0
    let v23: [Double] = v6[2]
    var v28: [[Double]] = v6
    v12 = v9
    v12[2] = v23
    let v20: s2 = f26(v11, v0)
    v3.p0 = v40
    v3.p0 = v40
    let v27: [[Double]] = v0.p0
    v3.p1 = v28
    let v24: [[[Double]]] = [v15, v12, v7]
    v28[2] = v23
    v5[2] = v3
    v5[0] = v0
    let v38: [s0] = v11.p0
    v3.p0 = v40
    v3.p0 = v40
    let v77: [[Double]] = v24[0]
    let v70: [[Double]] = v3.p0
    v3.p0 = v70
    let v63: s0 = v20.p1
    v5 = v38
    v3.p0 = v27
    v3.p0 = v70
    v3.p1 = v77
    v3.p0 = v70
    v3.p0 = v27
    return v63
  }
  func f22(_ v0: s0) -> s0 {
    var v2: s0 = v0
    v2 = v0
    let v12: s0 = f24(v2)
    let v40: s0 = f24(v12)
    return v40
  }
  func f6(_ v0: s0) -> s0 {
    let v6: s0 = f24(v0)
    let v44: s0 = f22(v6)
    return v44
  }
  @inline(never)
  func f0(_ v0: [[s4]], _ v1: Double) -> Double {
    let v2: [s4] = v0[0]
    var v5: Double = v1
    let v7: s4 = v2[0]
    var v6: s4 = v7
    let v11: s0 = v7.p1
    let v9: s0 = f24(v11)
    let v8: [s1] = v6.p0
    v6.p1 = v9
    v6.p0 = v8
    v6.p0 = v8
    v6.p1 = v11
    var v29: s4 = v6
    let v13: s0 = v29.p1
    let v24: s0 = f6(v13)
    v29.p0 = v8
    var v17: [s1] = v8
    let v26: [[Double]] = v24.p1
    v6.p0 = v17
    let v23: s0 = f6(v11)
    let v59: [s4] = v0[0]
    var v28: s4 = v6
    var v31: [s1] = v8
    var v60: s4 = v28
    let v57: [Double] = v26[2]
    let v80: s4 = v59[0]
    let v93: Double = v57[0]
    v29.p1 = v24
    let v113: Double = v93 - v5
    let v62: [s1] = v80.p0
    v28.p0 = v17
    v29.p0 = v8
    v29.p0 = v31
    v60.p1 = v23
    var v85: [Double] = v57
    let v77: [s1] = v60.p0
    var v106: [Double] = v85
    let v108: Double = v106[0]
    v31 = v77
    v28.p0 = v62
    let v324: Double = v108 / v113
    return v324
  }
  func benchmark() {
    let v0: [[s4]] = [[s4(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])]), s1(p0: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), p1: [s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])]), s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), p1: [s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])])], p1: s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]))]]
    let v1: Double = 35.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 35.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
