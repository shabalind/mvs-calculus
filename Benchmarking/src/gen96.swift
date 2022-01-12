  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  func f7(_ v0: s0) -> s0 {
    let v4: [Double] = v0.p0
    let v3: [[Double]] = v0.p1
    let v7: [Double] = v0.p0
    let v11: [Double] = v3[0]
    let v1: [[Double]] = v0.p1
    var v8: s0 = v0
    var v6: [[Double]] = v3
    var v13: [[Double]] = v6
    v6[0] = v4
    v6[0] = v7
    let v5: [[Double]] = v0.p1
    v8.p1 = v13
    let v15: [Double] = v6[1]
    v8.p1 = v3
    v8.p1 = v6
    v8.p1 = v5
    let v10: [Double] = v5[0]
    let v9: [Double] = v0.p0
    let v12: [Double] = v3[0]
    var v27: [[Double]] = v13
    v6 = v1
    v8.p0 = v10
    var v40: [[Double]] = v1
    let v30: [Double] = v40[1]
    v27[1] = v4
    v13[1] = v4
    let v36: [Double] = v27[0]
    var v43: s0 = v8
    let v53: [[Double]] = [v15, v36, v10]
    v43.p0 = v12
    let v46: [Double] = v53[2]
    let v69: [[Double]] = v43.p1
    v43.p0 = v11
    var v71: [[Double]] = v53
    let v76: [Double] = v5[1]
    v40[0] = v46
    let v72: [Double] = v71[1]
    v8.p0 = v76
    let v94: [[Double]] = v8.p1
    v27[1] = v9
    v43.p1 = v3
    let v211: s0 = s0(p0: v72, p1: v94)
    v13 = v69
    v8.p0 = v30
    return v211
  }
  func f5(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v7: [[Double]] = v0.p1
    let v2: [Double] = v6.p0
    let v5: [Double] = v7[1]
    v6.p1 = v7
    let v8: Double = v5[0]
    var v4: Double = v8
    let v1: s0 = s0(p0: v2, p1: v7)
    let v3: s0 = f7(v6)
    let v11: [Double] = v7[1]
    v6.p0 = v5
    let v12: s0 = f7(v3)
    var v10: s0 = v6
    let v13: [Double] = v12.p0
    let v17: Double = v5[0]
    var v20: s0 = v0
    var v24: [Double] = v11
    var v18: [Double] = v11
    v24[0] = v4
    let v21: Double = v24[0]
    var v15: [[Double]] = v7
    let v33: [[Double]] = v12.p1
    v6.p0 = v2
    let v30: [[Double]] = v1.p1
    v6.p1 = v30
    let v27: Double = v18[0]
    var v32: s0 = v12
    v6 = v10
    var v62: Double = v27
    v18[0] = v17
    v24[0] = v21
    let v38: [[Double]] = v12.p1
    v20.p1 = v33
    let v41: [s0] = [v32, v0, v0, v3, v20, v20]
    v6.p1 = v38
    var v74: [s0] = v41
    v20.p0 = v13
    let v34: [Double] = v7[1]
    var v64: [s0] = v74
    let v45: s0 = f7(v1)
    let v135: s0 = f7(v0)
    v32.p1 = v15
    v18[0] = v8
    v20.p0 = v34
    let v170: s0 = v64[5]
    v6.p0 = v24
    v20.p0 = v24
    v6.p1 = v7
    v4 = v62
    let v60: s0 = f7(v170)
    v74[3] = v45
    v74[2] = v6
    v10 = v135
    return v60
  }
  func f4(_ v0: s0, _ v1: s0) -> s0 {
    let v5: s0 = f5(v1)
    let v7: s0 = f7(v5)
    let v3: [Double] = v0.p0
    let v8: [Double] = v1.p0
    var v9: s0 = v7
    var v2: [Double] = v8
    let v6: Double = v8[0]
    let v10: Double = v6 / v6
    let v18: Double = v2[0]
    let v13: s0 = f7(v1)
    let v19: s0 = f5(v1)
    let v26: s0 = f5(v13)
    let v12: [[Double]] = v13.p1
    let v14: s0 = f5(v26)
    var v34: Double = v6
    let v46: [Double] = v14.p0
    let v22: [Double] = v26.p0
    v2[0] = v34
    v2[0] = v18
    let v32: s0 = f7(v9)
    let v25: s0 = f5(v1)
    var v15: Double = v10
    v9.p1 = v12
    let v51: Double = v3[0]
    v9.p0 = v2
    let v71: s0 = f5(v7)
    v2[0] = v51
    let v64: [[Double]] = v25.p1
    v9.p0 = v46
    var v35: [Double] = v22
    var v85: s0 = v71
    v35[0] = v15
    var v58: Double = v10
    let v54: [s0] = [v85, v14, v71, v9, v71, v32, v19]
    v9.p0 = v22
    v35[0] = v58
    v2[0] = v34
    v85.p0 = v35
    v85.p1 = v64
    let v241: s0 = v54[1]
    return v241
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v2: s0 = f5(v0)
    var v6: Double = v1
    var v8: s0 = v0
    let v9: [[Double]] = v2.p1
    let v4: s0 = f4(v0, v2)
    v8.p1 = v9
    let v5: [[Double]] = v8.p1
    let v3: s0 = f7(v0)
    v8.p1 = v9
    v8.p1 = v5
    let v7: [Double] = v9[0]
    let v15: s0 = f5(v2)
    let v11: [Double] = v15.p0
    var v14: Double = v1
    v14 = v6
    let v18: [[Double]] = v15.p1
    v8.p0 = v11
    let v21: [Double] = v5[0]
    let v19: Double = v21[0]
    let v25: [Double] = v3.p0
    v8.p0 = v25
    var v30: [Double] = v25
    let v24: [Double] = v18[0]
    let v27: Double = v19 / v14
    var v46: Double = v19
    v8.p1 = v5
    var v54: Double = v19
    let v91: Double = v7[0]
    let v29: [Double] = v9[1]
    v8.p0 = v29
    var v40: Double = v46
    let v32: Double = v29[0]
    v30[0] = v54
    let v77: [Double] = [v91, v54, v32, v40, v27]
    v8.p1 = v18
    v30[0] = v91
    let v114: [Double] = v3.p0
    let v135: [[Double]] = v4.p1
    var v102: [Double] = v77
    v8.p0 = v114
    v8.p0 = v30
    v8.p1 = v135
    v8.p0 = v24
    let v188: Double = v102[2]
    return v188
  }
  func benchmark() {
    let v0: s0 = s0(p0: [0.0], p1: [[1.0], [2.0]])
    let v1: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
