  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
  }
  struct s5 {
    var p0: [s1]
    var p1: s0
  }
  func f49(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v3: [s0] = [v0, v0, v5, v5, v5, v5]
    var v1: s0 = v0
    let v10: s0 = v3[3]
    let v12: [Double] = v10.p0
    var v24: [s0] = v3
    v5 = v1
    v24[4] = v10
    v24[0] = v0
    v1.p0 = v12
    let v21: s0 = v24[3]
    return v21
  }
  func f44(_ v0: s1) -> s1 {
    let v1: [s0] = v0.p0
    var v2: s1 = v0
    var v6: s1 = v0
    v6.p0 = v1
    v6 = v2
    v6.p0 = v1
    return v6
  }
  func f40(_ v0: [[Double]], _ v1: s1) -> s1 {
    let v7: [s0] = v1.p0
    let v3: s1 = f44(v1)
    let v5: [s0] = v3.p0
    let v6: s0 = v5[0]
    let v13: s0 = f49(v6)
    let v9: s0 = v5[1]
    let v12: s1 = f44(v1)
    var v23: [s0] = v7
    let v17: s0 = f49(v6)
    let v50: [Double] = v9.p0
    var v77: s0 = v17
    let v22: s0 = s0(p0: v50, p1: v0)
    let v30: s0 = f49(v22)
    v23[0] = v6
    var v63: s1 = v12
    v23[0] = v77
    v23[0] = v30
    var v61: [s0] = v23
    v61[0] = v77
    v61[1] = v13
    v23[0] = v9
    v63.p0 = v61
    var v84: s1 = v63
    return v84
  }
  func f29(_ v0: s0) -> s0 {
    var v3: s0 = v0
    var v1: s0 = v0
    var v2: s0 = v0
    let v7: s0 = f49(v2)
    var v5: s0 = v7
    let v13: [Double] = v5.p0
    let v4: [[Double]] = v1.p1
    v2.p0 = v13
    let v10: s0 = f49(v3)
    let v18: [Double] = v1.p0
    v5.p1 = v4
    let v20: [[Double]] = v10.p1
    let v142: s0 = s0(p0: v13, p1: v4)
    v1.p0 = v18
    v2.p1 = v20
    return v142
  }
  func f24(_ v0: s0) -> s0 {
    let v1: s0 = f29(v0)
    var v2: s0 = v0
    let v9: s0 = f49(v0)
    let v7: s0 = f29(v9)
    let v5: s0 = f29(v1)
    let v4: [[Double]] = v7.p1
    let v8: s0 = f29(v7)
    let v3: [s0] = [v5, v2]
    v2.p1 = v4
    let v12: [[Double]] = v5.p1
    let v11: [Double] = v1.p0
    let v10: [Double] = v12[0]
    let v17: [Double] = v9.p0
    v2.p1 = v4
    let v23: s0 = f49(v7)
    let v13: Double = v11[0]
    let v21: [[Double]] = [v10, v10]
    var v25: Double = v13
    v2.p0 = v17
    let v50: [Double] = v8.p0
    var v22: [Double] = v50
    v22[0] = v13
    v2.p1 = v12
    let v18: [Double] = v21[1]
    v22[2] = v25
    let v36: s1 = s1(p0: v3)
    let v16: Double = v18[0]
    v2.p0 = v22
    let v54: s1 = f40(v4, v36)
    let v29: [s0] = v54.p0
    v2.p0 = v50
    var v87: Double = v25
    let v65: Double = v10[0]
    v22[2] = v65
    let v64: s0 = v29[0]
    let v77: Double = v11[1]
    v22[2] = v16
    let v47: Double = v50[0]
    v22[2] = v87
    v22[2] = v77
    v22[2] = v77
    let v99: [s0] = [v8, v0, v0, v64, v5, v8]
    var v96: [s0] = v99
    v22[2] = v77
    v25 = v47
    v2 = v23
    let v164: s0 = v96[3]
    return v164
  }
  func f4(_ v0: s0) -> s0 {
    var v4: s0 = v0
    var v5: s0 = v0
    var v1: s0 = v5
    let v2: s0 = f49(v1)
    let v3: s0 = f49(v5)
    let v8: s0 = f49(v3)
    let v6: [s0] = [v4, v3, v2, v8]
    let v11: [Double] = v1.p0
    let v10: [Double] = v8.p0
    let v9: s0 = f29(v4)
    let v13: s0 = f29(v5)
    v4.p0 = v10
    let v15: s0 = f49(v2)
    var v19: [s0] = v6
    let v14: [Double] = v2.p0
    v19[2] = v13
    v19[1] = v0
    var v18: s0 = v15
    v4.p0 = v11
    let v23: [[Double]] = v13.p1
    var v28: [Double] = v10
    v19 = v6
    var v30: [[Double]] = v23
    v19[1] = v18
    v19[3] = v0
    let v31: Double = v28[2]
    let v38: Double = v31 - v31
    var v53: [Double] = v11
    let v86: [Double] = v9.p0
    v1.p0 = v86
    var v72: [[Double]] = v30
    let v32: [Double] = v30[1]
    var v87: [Double] = v32
    v18.p0 = v10
    v87[0] = v31
    v5.p1 = v72
    v28[0] = v31
    v1.p0 = v10
    v87[0] = v31
    v5.p0 = v14
    let v83: s0 = v19[3]
    v53[2] = v38
    v72[0] = v87
    v1.p0 = v53
    v72[1] = v32
    v72[0] = v32
    v18.p0 = v28
    v87[0] = v31
    return v83
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: Double) -> Double {
    let v2: s5 = v0[0]
    let v7: s0 = v2.p1
    let v9: s0 = f29(v7)
    let v8: s0 = f24(v7)
    let v10: s0 = f4(v8)
    let v13: [Double] = v7.p0
    var v5: s0 = v7
    v5.p0 = v13
    v5.p0 = v13
    let v17: [Double] = v10.p0
    let v28: [[Double]] = v5.p1
    let v23: [[Double]] = v9.p1
    let v34: [Double] = v28[1]
    v5.p1 = v23
    let v49: Double = v17[1]
    var v26: [Double] = v34
    let v61: Double = v26[0]
    let v85: [[Double]] = v8.p1
    v5.p1 = v85
    let v66: Double = v34[0]
    let v54: Double = v61 * v49
    v26[0] = v66
    v26[0] = v61
    var v123: Double = v54
    let v258: Double = v54 * v123
    return v258
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: [s1(p0: [s0(p0: [0.0, 1.0, 2.0], p1: [[3.0], [4.0]]), s0(p0: [5.0, 6.0, 7.0], p1: [[8.0], [9.0]])]), s1(p0: [s0(p0: [10.0, 11.0, 12.0], p1: [[13.0], [14.0]]), s0(p0: [15.0, 16.0, 17.0], p1: [[18.0], [19.0]])])], p1: s0(p0: [20.0, 21.0, 22.0], p1: [[23.0], [24.0]]))]
    let v1: Double = 25.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 25.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
