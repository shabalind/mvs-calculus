  import Dispatch
  func f21(_ v0: [[Double]]) -> [[Double]] {
    var v1: [[Double]] = v0
    var v13: [[Double]] = v1
    return v13
  }
  func f12(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]]) -> [[Double]] {
    var v7: [[Double]] = v2
    let v3: [[Double]] = f21(v0)
    var v9: [[Double]] = v2
    let v8: [Double] = v2[2]
    v9[0] = v8
    let v6: Double = v8[0]
    v9[0] = v8
    let v4: [Double] = v3[2]
    let v28: [Double] = v0[0]
    v9[0] = v8
    let v12: Double = v8[0]
    let v16: [[Double]] = f21(v7)
    let v18: [Double] = v16[0]
    v7[1] = v28
    v9[0] = v18
    v9[1] = v4
    v7[1] = v18
    var v36: [[Double]] = v9
    let v30: [Double] = v0[0]
    let v15: [[Double]] = f21(v36)
    let v23: [[Double]] = f21(v2)
    let v34: [Double] = v16[1]
    v36[1] = v34
    let v78: [Double] = v23[1]
    var v54: [Double] = v34
    let v87: [Double] = v3[0]
    let v67: [Double] = v0[1]
    v7[1] = v67
    v9[0] = v54
    v54[0] = v12
    v36[1] = v78
    v9[1] = v30
    var v91: [Double] = v87
    v54[0] = v6
    v54 = v91
    return v15
  }
  func f4(_ v0: [[Double]]) -> [[Double]] {
    var v3: [[Double]] = v0
    let v1: [Double] = v0[0]
    let v5: [Double] = v0[1]
    let v7: [[Double]] = f12(v3, v0, v3)
    v3[2] = v1
    let v13: [[Double]] = f12(v3, v0, v7)
    var v4: [[Double]] = v0
    let v8: [[Double]] = f12(v13, v0, v0)
    let v2: [[Double]] = f12(v0, v8, v13)
    var v9: [[Double]] = v4
    let v21: [Double] = v13[1]
    v3[2] = v21
    v9[2] = v21
    let v15: [[Double]] = f21(v4)
    v9[1] = v21
    let v20: [[Double]] = f21(v8)
    let v33: Double = v1[0]
    var v28: [[Double]] = v15
    let v35: [[Double]] = f21(v15)
    var v12: [[Double]] = v28
    let v37: [[Double]] = f12(v9, v0, v7)
    v3[0] = v5
    var v25: [[Double]] = v9
    v28 = v8
    let v43: [[Double]] = f21(v9)
    let v32: [[Double]] = f21(v25)
    let v22: [[Double]] = f12(v43, v37, v20)
    v12[0] = v1
    let v52: [[Double]] = f12(v12, v22, v25)
    var v62: [[Double]] = v32
    let v60: [Double] = v43[0]
    let v44: [[Double]] = f21(v62)
    let v55: [Double] = v43[2]
    v3 = v52
    v28[1] = v60
    var v66: Double = v33
    let v51: [Double] = v35[2]
    v28[0] = v5
    var v48: [Double] = v51
    let v149: [[Double]] = f21(v2)
    let v112: [[Double]] = f21(v12)
    v28 = v62
    var v73: Double = v66
    var v63: [[Double]] = v62
    var v89: [[Double]] = v44
    v63[1] = v21
    let v76: [Double] = v149[2]
    v3[1] = v55
    v28[2] = v76
    let v95: [Double] = v35[2]
    var v103: [Double] = v48
    let v97: [Double] = v62[0]
    v25[1] = v103
    let v143: Double = v95[0]
    let v69: [[Double]] = f21(v112)
    let v91: [[Double]] = f12(v63, v89, v69)
    v48[0] = v143
    v48[0] = v73
    let v158: [[Double]] = f12(v15, v69, v91)
    v63[1] = v97
    let v201: [[Double]] = f12(v158, v7, v63)
    return v201
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: Double) -> Double {
    let v9: [Double] = v1[1]
    let v7: Double = v9[0]
    var v10: Double = v7
    let v12: [[Double]] = f21(v1)
    let v85: [Double] = v0[0]
    let v98: [[Double]] = f4(v12)
    let v30: [Double] = v98[0]
    let v44: Double = v85[0]
    let v50: Double = v30[0]
    let v47: Double = v44 + v50
    let v53: Double = v10 + v47
    return v53
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0]]
    let v1: [[Double]] = [[2.0], [3.0], [4.0]]
    let v2: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
