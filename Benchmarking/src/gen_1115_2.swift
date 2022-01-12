  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
    var p2: [s0]
  }
  func f40(_ v0: s0) -> s0 {
    var v1: s0 = v0
    var v3: s0 = v0
    let v8: [s0] = [v3, v3]
    let v6: [Double] = v1.p0
    let v4: Double = v6[0]
    var v5: [s0] = v8
    v5[0] = v1
    let v7: s0 = v8[0]
    v5[1] = v1
    v3.p0 = v6
    v1.p0 = v6
    var v2: Double = v4
    let v9: [[Double]] = v3.p1
    var v15: [Double] = v6
    v3.p1 = v9
    v15[0] = v2
    let v12: [[Double]] = v1.p1
    let v13: Double = v15[1]
    let v14: [Double] = v0.p0
    let v10: [Double] = v3.p0
    let v17: [Double] = v9[0]
    let v22: Double = v17[0]
    v5[0] = v3
    let v35: [Double] = v1.p0
    v1.p1 = v12
    v3.p0 = v15
    v1.p0 = v10
    v1.p1 = v12
    v15[0] = v22
    v3.p0 = v35
    v15[0] = v13
    let v25: [[Double]] = v3.p1
    v1.p0 = v15
    let v33: s0 = v5[1]
    v3.p0 = v14
    let v26: [[Double]] = v0.p1
    var v36: [[Double]] = v25
    let v30: [Double] = v3.p0
    var v42: [[Double]] = v26
    v3.p0 = v14
    v3.p1 = v9
    v5[1] = v3
    v1.p1 = v12
    v3.p1 = v36
    v5[1] = v7
    let v43: [Double] = v25[1]
    v36[1] = v43
    v1.p1 = v42
    v1.p0 = v30
    v3.p0 = v10
    v5[1] = v7
    return v33
  }
  func f36(_ v0: s0) -> s0 {
    let v4: [s0] = [v0, v0]
    let v3: [[Double]] = v0.p1
    let v7: s0 = f40(v0)
    let v9: [Double] = v3[2]
    let v8: s0 = f40(v7)
    let v5: s0 = f40(v0)
    var v12: [[Double]] = v3
    var v18: [[Double]] = v12
    var v10: [s0] = v4
    let v14: [Double] = v8.p0
    let v17: s0 = s0(p0: v14, p1: v18)
    let v28: s0 = v10[1]
    let v15: s0 = f40(v28)
    let v23: s0 = f40(v15)
    var v22: [Double] = v9
    let v36: [Double] = v17.p0
    let v37: Double = v36[0]
    v22[0] = v37
    var v66: [Double] = v9
    let v40: s0 = f40(v17)
    let v48: [[Double]] = v23.p1
    v18 = v3
    let v67: s0 = f40(v5)
    v66 = v22
    let v89: [Double] = v48[2]
    let v86: Double = v66[0]
    v22[0] = v86
    var v306: s0 = v40
    v12[1] = v66
    v12[0] = v89
    v10[0] = v67
    return v306
  }
  func f35(_ v0: s0) -> s0 {
    var v8: s0 = v0
    let v7: [Double] = v0.p0
    let v1: s0 = f36(v8)
    let v4: [Double] = v1.p0
    v8 = v0
    let v2: Double = v4[0]
    let v3: [[Double]] = v1.p1
    let v6: s0 = f36(v1)
    var v11: Double = v2
    var v9: [[Double]] = v3
    let v5: [Double] = v9[0]
    let v12: s0 = f40(v6)
    let v16: [[Double]] = v12.p1
    let v10: [[Double]] = v12.p1
    v9[2] = v5
    v8.p1 = v10
    var v18: [Double] = v7
    v18[1] = v11
    let v26: s0 = f36(v12)
    let v32: [[Double]] = v26.p1
    let v40: Double = v7[0]
    var v34: s0 = v0
    let v36: s0 = f40(v6)
    v8.p1 = v32
    v8.p1 = v10
    v34.p1 = v3
    let v51: [Double] = v34.p0
    let v45: [Double] = v0.p0
    v34.p0 = v18
    let v73: [[Double]] = v36.p1
    var v67: [[Double]] = v32
    let v60: s0 = s0(p0: v45, p1: v67)
    let v78: s0 = f36(v6)
    let v49: [Double] = v26.p0
    let v58: [Double] = v36.p0
    var v130: [[Double]] = v67
    let v115: [[Double]] = v26.p1
    v8.p0 = v58
    let v120: s0 = f40(v60)
    let v107: [Double] = v73[1]
    var v85: s0 = v78
    let v259: Double = v11 / v40
    v34.p1 = v130
    v34.p0 = v49
    var v122: [Double] = v107
    v11 = v259
    v85.p0 = v45
    v34.p1 = v115
    let v63: [Double] = v120.p0
    let v198: [Double] = v16[2]
    v85.p0 = v51
    var v125: [Double] = v63
    v85.p1 = v9
    v8.p0 = v125
    v9[2] = v122
    v67[1] = v198
    return v85
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v2: [s0] = v0.p0
    let v5: s0 = v2[0]
    let v8: s0 = f35(v5)
    let v11: [Double] = v8.p0
    let v12: s0 = f40(v5)
    let v7: [Double] = [v1, v1]
    let v14: [Double] = v12.p0
    let v10: [s0] = v0.p2
    var v36: [Double] = v11
    v36 = v7
    let v18: s0 = v10[0]
    let v17: Double = v36[1]
    v36[1] = v17
    let v26: [Double] = v18.p0
    let v41: Double = v26[0]
    v36[1] = v41
    let v38: Double = v17 - v17
    let v70: Double = v38 + v1
    v36[1] = v41
    v36 = v14
    return v70
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [0.0, 1.0], p1: [[2.0], [3.0], [4.0]]), s0(p0: [5.0, 6.0], p1: [[7.0], [8.0], [9.0]])], p1: [s0(p0: [10.0, 11.0], p1: [[12.0], [13.0], [14.0]]), s0(p0: [15.0, 16.0], p1: [[17.0], [18.0], [19.0]]), s0(p0: [20.0, 21.0], p1: [[22.0], [23.0], [24.0]])], p2: [s0(p0: [25.0, 26.0], p1: [[27.0], [28.0], [29.0]])])
    let v1: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
