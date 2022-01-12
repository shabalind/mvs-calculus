  import Dispatch
  func f51(_ v0: [Double], _ v1: [[Double]]) -> [[Double]] {
    var v3: [[Double]] = v1
    let v9: [Double] = v1[0]
    v3[1] = v9
    return v3
  }
  func f47(_ v0: [[Double]]) -> [[Double]] {
    var v3: [[Double]] = v0
    let v6: [Double] = v3[0]
    var v1: [[Double]] = v3
    var v4: [[Double]] = v1
    var v8: [[Double]] = v0
    var v5: [Double] = v6
    v1[0] = v5
    let v27: [Double] = v1[2]
    var v20: [[Double]] = v8
    var v2: [[Double]] = v4
    let v32: [Double] = v4[1]
    var v28: [Double] = v27
    v3[0] = v32
    v3[2] = v32
    let v81: [Double] = v2[1]
    v5 = v28
    let v74: [[[Double]]] = [v8, v1, v20]
    v3[0] = v81
    var v78: [[[Double]]] = v74
    let v98: [[Double]] = v78[1]
    return v98
  }
  func f44(_ v0: [[Double]]) -> [[Double]] {
    var v6: [[Double]] = v0
    let v7: [Double] = v0[1]
    let v1: [[Double]] = f47(v6)
    var v4: [Double] = v7
    var v9: [[Double]] = v6
    v6[1] = v7
    let v17: [[Double]] = f47(v0)
    var v12: [[Double]] = v17
    let v13: [[Double]] = f47(v0)
    let v10: [Double] = v1[2]
    let v16: [[Double]] = f47(v0)
    v9[1] = v4
    let v11: [[Double]] = f47(v9)
    v12[2] = v10
    let v26: [Double] = v13[2]
    v9[2] = v26
    let v64: [[Double]] = f47(v16)
    let v56: [[[Double]]] = [v11, v1, v6, v16, v13, v1, v12]
    var v38: [[[Double]]] = v56
    v38[4] = v64
    var v142: [[[Double]]] = v38
    let v139: [[Double]] = v142[1]
    v142[3] = v139
    return v139
  }
  func f43(_ v0: [[Double]]) -> [[Double]] {
    let v4: [Double] = v0[0]
    let v8: [[Double]] = f44(v0)
    let v5: [Double] = v8[1]
    var v12: [[Double]] = v8
    let v27: [Double] = v12[1]
    var v14: [[Double]] = v8
    let v24: Double = v4[0]
    let v25: [[Double]] = f47(v8)
    let v36: [[Double]] = f44(v25)
    let v41: [Double] = v36[2]
    var v30: Double = v24
    var v64: Double = v30
    v14[1] = v41
    var v97: [Double] = v27
    var v70: Double = v64
    v14[0] = v4
    v97[0] = v70
    let v194: [Double] = v14[2]
    var v85: [Double] = v194
    v12[0] = v5
    let v140: [[Double]] = [v27, v97, v85]
    v97[0] = v30
    let v102: [[Double]] = f44(v140)
    return v102
  }
  func f42(_ v0: Double) -> Double {
    var v1: Double = v0
    var v6: Double = v1
    v6 = v0
    let v8: [Double] = [v6]
    let v19: [[Double]] = [v8, v8, v8, v8]
    var v15: [[Double]] = v19
    let v18: [[[Double]]] = [v15, v15, v15, v15, v19, v15]
    let v11: [[Double]] = v18[4]
    let v20: [Double] = v15[3]
    let v13: [Double] = v11[3]
    v15[1] = v13
    let v29: [[Double]] = [v13, v8, v8, v13, v20]
    var v53: [[Double]] = v29
    let v37: [Double] = v53[0]
    v15[2] = v8
    var v42: [Double] = v37
    v15[3] = v20
    var v40: [Double] = v13
    v53[2] = v8
    let v67: [[[Double]]] = [v29, v53, v53, v29, v53]
    let v44: [[Double]] = v67[2]
    var v38: [[[Double]]] = v67
    v15[1] = v42
    var v90: [[Double]] = v53
    let v70: [[Double]] = v38[2]
    let v92: [Double] = v53[4]
    let v78: [[[Double]]] = [v44, v70, v29]
    v90[3] = v92
    var v132: [[[Double]]] = v78
    let v59: [[Double]] = v132[2]
    v53[0] = v40
    v53[4] = v13
    v132[1] = v90
    v15[1] = v92
    var v58: [[Double]] = v59
    v53[3] = v20
    let v155: [[Double]] = v78[2]
    let v134: [Double] = v58[0]
    v132[2] = v58
    v132[2] = v29
    v38[2] = v58
    let v140: Double = v134[0]
    v132[0] = v155
    return v140
  }
  func f38(_ v0: [[Double]]) -> [[Double]] {
    let v5: [[Double]] = f47(v0)
    let v9: [[Double]] = f43(v5)
    let v15: [Double] = v0[2]
    let v17: [[Double]] = f44(v9)
    let v18: Double = v15[0]
    var v29: Double = v18
    let v19: [Double] = [v29, v18]
    let v26: Double = v19[1]
    let v57: [Double] = [v26, v18, v29]
    let v39: [[Double]] = f51(v57, v17)
    return v39
  }
  func f26(_ v0: [[Double]]) -> [[Double]] {
    let v7: [Double] = v0[2]
    let v6: Double = v7[0]
    let v1: [[Double]] = f38(v0)
    let v15: [[Double]] = f38(v0)
    let v4: Double = v7[0]
    var v11: [[Double]] = v0
    let v9: [Double] = v1[1]
    v11 = v0
    v11 = v1
    let v20: [Double] = v15[0]
    let v14: [[Double]] = f43(v0)
    let v12: [[Double]] = f47(v1)
    let v17: [[Double]] = f43(v12)
    let v25: [Double] = v12[2]
    var v13: [Double] = v25
    let v22: [Double] = v12[0]
    let v30: [Double] = v14[1]
    var v24: Double = v6
    var v38: [Double] = v9
    v38[0] = v4
    let v67: [[Double]] = [v38, v20, v22, v20, v13]
    var v36: [Double] = v38
    v11[2] = v36
    let v111: [Double] = v67[0]
    v24 = v4
    var v200: [[Double]] = v17
    var v92: [Double] = v111
    let v40: [[Double]] = f38(v11)
    v92[0] = v24
    let v116: [Double] = v12[0]
    var v66: [Double] = v30
    var v57: [[Double]] = v40
    v92 = v66
    var v120: [[Double]] = v57
    var v112: [[Double]] = v120
    v120[0] = v92
    v57[0] = v116
    v112 = v200
    v11[1] = v30
    return v112
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: Double) -> Double {
    let v5: [Double] = v1[1]
    var v7: [Double] = v5
    let v9: [Double] = [v2]
    let v10: [[Double]] = f26(v0)
    let v16: [Double] = v0[1]
    let v36: [Double] = v10[1]
    let v31: Double = v36[0]
    let v15: [Double] = v1[2]
    v7[0] = v2
    let v49: [Double] = v1[1]
    var v20: [Double] = v16
    v7[0] = v31
    let v52: Double = v9[0]
    let v34: Double = v49[0]
    var v19: [Double] = v15
    v20[0] = v52
    var v38: [Double] = v7
    let v26: Double = f42(v34)
    v20 = v5
    v38[0] = v31
    v38[0] = v26
    v7[0] = v34
    let v40: Double = v19[0]
    v38[0] = v40
    v38 = v20
    let v140: Double = v38[0]
    return v140
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: [[Double]] = [[3.0], [4.0], [5.0]]
    let v2: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
