  import Dispatch
  func f12(_ v0: [[Double]]) -> [[Double]] {
    var v3: [[Double]] = v0
    var v4: [[Double]] = v3
    var v2: [[Double]] = v3
    var v7: [[Double]] = v0
    var v6: [[Double]] = v4
    var v10: [[Double]] = v6
    var v1: [[Double]] = v0
    let v9: [Double] = v10[0]
    let v12: [Double] = v3[1]
    var v5: [[Double]] = v4
    let v8: [Double] = v1[0]
    var v13: [Double] = v8
    let v11: Double = v13[0]
    var v25: [Double] = v9
    let v23: Double = v8[0]
    var v27: [[Double]] = v5
    v5[1] = v9
    let v30: [Double] = v3[1]
    v25[0] = v23
    var v29: [Double] = v30
    var v14: [Double] = v30
    let v28: [Double] = v0[0]
    v5 = v2
    v5[1] = v8
    var v24: Double = v23
    var v21: [[Double]] = v1
    var v50: [[Double]] = v7
    v27[0] = v30
    let v15: [Double] = [v11]
    var v22: Double = v11
    v1[1] = v30
    let v59: [Double] = v0[0]
    v14 = v28
    let v41: [Double] = v27[0]
    let v36: [Double] = v27[1]
    v13[0] = v24
    let v20: [Double] = v10[0]
    let v37: Double = v14[0]
    let v48: [Double] = v1[0]
    v29 = v13
    let v75: [Double] = v50[1]
    v2[0] = v75
    var v32: [Double] = v25
    var v63: [Double] = v12
    let v49: [Double] = v7[1]
    let v60: Double = v28[0]
    let v52: [Double] = v10[1]
    var v72: [Double] = v13
    let v40: Double = v72[0]
    v32[0] = v11
    let v61: [Double] = v5[0]
    v63[0] = v40
    let v68: Double = v36[0]
    v27[1] = v48
    var v95: Double = v23
    var v89: Double = v37
    var v123: [[Double]] = v21
    var v55: [[Double]] = v123
    var v57: [Double] = v59
    v1[1] = v48
    let v47: Double = v20[0]
    let v73: [Double] = v3[0]
    let v85: [Double] = v55[1]
    v21[0] = v32
    v6[1] = v63
    v57[0] = v95
    v32[0] = v60
    v14 = v41
    v89 = v95
    let v76: Double = v57[0]
    v4[1] = v59
    v6[1] = v61
    v57[0] = v22
    v21[0] = v29
    v55 = v0
    v4[0] = v52
    v7[1] = v13
    v13[0] = v47
    v4[1] = v52
    v32[0] = v89
    v25 = v85
    v13[0] = v76
    v21[0] = v15
    v14[0] = v68
    v5[0] = v15
    v21[0] = v49
    v1[0] = v73
    v27 = v123
    return v27
  }
  func f1(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    var v4: [[Double]] = v0
    let v5: [[Double]] = f12(v1)
    var v8: [[Double]] = v0
    let v7: [[Double]] = f12(v4)
    var v3: [[Double]] = v8
    let v17: [[Double]] = f12(v5)
    let v2: [Double] = v3[0]
    var v9: [[Double]] = v8
    var v13: [Double] = v2
    let v19: [[Double]] = f12(v9)
    var v10: [Double] = v13
    var v12: [[Double]] = v19
    let v21: [Double] = v7[0]
    let v14: [[Double]] = f12(v4)
    v4[1] = v10
    let v38: [[Double]] = f12(v4)
    let v16: [[Double]] = f12(v17)
    let v28: [[[Double]]] = [v12, v5, v0, v14, v5, v0, v16]
    var v47: [Double] = v13
    let v30: Double = v13[0]
    v3 = v38
    v3[0] = v2
    let v27: [[Double]] = v28[5]
    v8[0] = v47
    let v46: Double = v10[0]
    v3[0] = v13
    let v44: Double = v46 * v30
    var v40: [Double] = v47
    let v62: [[[Double]]] = [v27, v19, v9]
    let v95: [[Double]] = v28[0]
    let v74: [Double] = v95[0]
    v47[0] = v44
    var v73: [[[Double]]] = v62
    v3[1] = v21
    v9[0] = v74
    var v111: [[[Double]]] = v73
    let v113: [[Double]] = v111[2]
    v8[0] = v13
    v4[1] = v40
    return v113
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    let v6: [[Double]] = f12(v0)
    let v2: [Double] = v0[1]
    let v9: [Double] = v0[0]
    let v8: [[Double]] = f12(v6)
    let v3: Double = v9[0]
    let v5: [Double] = v6[0]
    let v11: Double = v2[0]
    var v7: [[Double]] = v8
    v7[1] = v5
    let v16: Double = v5[0]
    let v15: [Double] = v0[1]
    let v13: [[Double]] = f1(v8, v7)
    v7 = v6
    let v18: Double = v15[0]
    let v21: [[Double]] = f1(v8, v7)
    v7[0] = v2
    let v31: [Double] = v13[1]
    let v24: [Double] = v21[0]
    let v47: Double = v31[0]
    let v55: Double = v18 + v16
    var v66: Double = v3
    let v36: Double = v24[0]
    let v100: [Double] = [v1, v11, v1, v36, v55, v55]
    var v38: Double = v66
    var v255: [Double] = v100
    var v99: [Double] = v255
    var v214: [Double] = v255
    v214 = v99
    let v181: Double = v214[0]
    let v134: Double = v181 + v47
    v99[3] = v38
    return v134
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0]]
    let v1: Double = 2.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 2.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
