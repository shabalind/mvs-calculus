  import Dispatch
  func f28(_ v0: [[Double]]) -> [[Double]] {
    var v7: [[Double]] = v0
    var v4: [[Double]] = v0
    var v5: [[Double]] = v7
    let v2: [Double] = v5[0]
    v5[1] = v2
    var v9: [[Double]] = v5
    let v10: [Double] = v0[1]
    v9 = v7
    let v8: [Double] = v4[0]
    var v6: [[Double]] = v9
    v4[1] = v8
    let v17: [Double] = v5[0]
    let v15: [Double] = v9[0]
    v9[0] = v10
    let v24: [[Double]] = [v10]
    let v59: [Double] = v7[0]
    let v16: [Double] = v7[0]
    v6[0] = v17
    let v25: [Double] = v5[1]
    var v29: [[Double]] = v24
    var v28: [[Double]] = v5
    v28[1] = v59
    let v45: [Double] = v29[0]
    var v27: [Double] = v10
    v6[0] = v25
    let v98: Double = v8[0]
    var v49: [[Double]] = v0
    let v51: [[[Double]]] = [v6, v5, v6, v28, v4, v49]
    v27[0] = v98
    let v70: [[Double]] = v51[5]
    v4[1] = v15
    v5[0] = v16
    v49[1] = v45
    v49[1] = v27
    var v132: [Double] = v15
    v49[1] = v132
    return v70
  }
  func f26(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v5: [[Double]] = f28(v0)
    let v3: [Double] = v1[0]
    let v7: [[Double]] = f28(v5)
    let v6: [[Double]] = f28(v7)
    let v4: [Double] = v7[1]
    var v2: [Double] = v4
    let v10: Double = v3[0]
    var v8: [[Double]] = v7
    var v15: Double = v10
    v2[0] = v15
    let v21: [[Double]] = f28(v7)
    var v47: [Double] = v2
    v8[0] = v47
    var v19: [Double] = v3
    let v66: [Double] = v6[0]
    let v36: [Double] = v21[0]
    v2 = v19
    v8[0] = v66
    let v56: [Double] = v8[1]
    var v43: [[Double]] = v1
    v8[1] = v36
    v43[0] = v2
    v43[1] = v56
    return v43
  }
  func f23(_ v0: [[Double]]) -> [[Double]] {
    let v6: [Double] = v0[1]
    let v4: [Double] = v0[0]
    let v1: [[Double]] = [v4, v4, v6, v6, v4, v4]
    var v5: [[Double]] = v1
    v5[1] = v4
    let v9: [Double] = v1[5]
    v5[5] = v6
    let v10: [[Double]] = f26(v0, v0)
    let v21: [[Double]] = f26(v10, v10)
    let v18: [[Double]] = f26(v10, v21)
    var v15: [[Double]] = v0
    var v17: [Double] = v9
    let v19: [Double] = v0[1]
    var v27: [[Double]] = v15
    var v14: [[Double]] = v0
    var v20: [[Double]] = v14
    let v28: [[[Double]]] = [v27, v18, v27, v0, v27]
    var v34: [[Double]] = v21
    let v23: [Double] = v1[4]
    var v44: [[[Double]]] = v28
    let v25: [[Double]] = f28(v34)
    v44[2] = v21
    var v29: [[[Double]]] = v44
    var v60: [[Double]] = v5
    let v46: [[Double]] = v28[3]
    let v47: [[Double]] = v29[0]
    v29[3] = v46
    v5[1] = v17
    v15 = v47
    let v102: [[Double]] = f26(v25, v46)
    v34[1] = v23
    let v87: [Double] = v60[5]
    v34[1] = v19
    let v113: [Double] = v5[5]
    v60[3] = v113
    let v83: [[Double]] = f26(v34, v102)
    v29[4] = v20
    v15[1] = v17
    v14[1] = v87
    let v179: [[Double]] = f26(v102, v83)
    return v179
  }
  func f19(_ v0: [[Double]]) -> [[Double]] {
    var v7: [[Double]] = v0
    let v1: [[Double]] = f28(v0)
    let v18: [[Double]] = f28(v1)
    let v8: [[Double]] = f26(v0, v0)
    let v24: [[Double]] = f23(v8)
    let v15: [[Double]] = f28(v7)
    let v17: [[[Double]]] = [v0, v7, v15, v18, v24, v7]
    var v100: [[[Double]]] = v17
    let v52: [[Double]] = v100[2]
    let v114: [[Double]] = f28(v52)
    var v70: [[Double]] = v114
    return v70
  }
  func f15(_ v0: Double) -> Double {
    let v3: Double = v0 * v0
    var v7: Double = v0
    let v6: [Double] = [v3]
    var v5: Double = v0
    var v4: [Double] = v6
    let v1: Double = v6[0]
    let v8: Double = v4[0]
    var v2: [Double] = v6
    var v13: Double = v1
    let v9: Double = v5 / v13
    v2[0] = v9
    v2[0] = v8
    v2[0] = v8
    var v10: Double = v13
    v4[0] = v9
    let v12: Double = v2[0]
    let v20: Double = v4[0]
    v4[0] = v8
    var v28: [Double] = v6
    var v27: Double = v7
    let v36: Double = v2[0]
    var v19: Double = v12
    let v59: Double = v6[0]
    var v16: [Double] = v28
    let v43: Double = v16[0]
    var v26: Double = v7
    var v34: Double = v27
    let v15: Double = v16[0]
    v16[0] = v43
    v28[0] = v15
    v2[0] = v36
    v4[0] = v43
    let v45: Double = v36 - v36
    let v40: Double = v6[0]
    v10 = v27
    let v42: [[Double]] = [v16, v6]
    let v31: [[Double]] = f28(v42)
    let v25: [[Double]] = f19(v42)
    let v41: [Double] = [v10, v20, v19, v45, v59, v40]
    let v21: [[Double]] = f19(v31)
    v16[0] = v9
    v2[0] = v20
    var v58: Double = v45
    let v44: [[Double]] = f26(v21, v25)
    let v80: [Double] = [v8, v43, v26, v36, v34, v13]
    let v50: [Double] = v44[1]
    let v82: Double = v80[3]
    var v81: [Double] = v41
    v7 = v58
    let v64: Double = v50[0]
    v16[0] = v64
    var v143: [Double] = v81
    v4[0] = v82
    let v138: Double = v143[0]
    return v138
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: Double) -> Double {
    let v5: [Double] = v2[1]
    var v6: [[Double]] = v1
    var v18: [[Double]] = v6
    let v8: [Double] = v2[1]
    v18[0] = v5
    var v13: Double = v3
    let v7: [Double] = v18[0]
    let v14: Double = v5[0]
    let v16: Double = v7[0]
    v18[0] = v7
    let v26: [[Double]] = f23(v2)
    var v9: Double = v13
    v6[0] = v7
    let v69: [Double] = [v14, v16, v3, v9, v14, v16]
    let v28: [Double] = v26[1]
    v18[0] = v8
    v18[0] = v28
    let v33: Double = v69[1]
    v13 = v9
    let v100: Double = f15(v33)
    var v62: [Double] = v69
    v18 = v1
    let v54: Double = v62[5]
    var v65: Double = v54
    v62[0] = v100
    return v65
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0]]
    let v1: [[Double]] = [[2.0]]
    let v2: [[Double]] = [[3.0], [4.0]]
    let v3: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
