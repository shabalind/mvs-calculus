  import Dispatch
  func f116(_ v0: [[Double]]) -> [[Double]] {
    let v5: [[[Double]]] = [v0, v0, v0, v0, v0, v0, v0]
    let v1: [Double] = v0[0]
    var v6: [Double] = v1
    var v8: [Double] = v6
    let v3: Double = v8[0]
    let v2: [[Double]] = v5[3]
    let v7: [[Double]] = v5[2]
    var v4: [[[Double]]] = v5
    v6[0] = v3
    v8[0] = v3
    let v9: [Double] = v7[0]
    var v13: [[Double]] = v2
    let v10: Double = v6[0]
    var v14: [Double] = v1
    v4 = v5
    let v18: Double = v9[0]
    var v16: Double = v10
    let v21: [[Double]] = v4[0]
    var v27: [[Double]] = v21
    v8[0] = v16
    var v25: Double = v18
    var v41: [[Double]] = v2
    v41[0] = v6
    var v24: [[Double]] = v41
    v27[0] = v1
    var v28: [[[Double]]] = v4
    v4 = v28
    let v19: [Double] = v21[0]
    var v26: [[[Double]]] = v4
    v26[3] = v13
    v8[0] = v18
    var v34: [Double] = v9
    let v31: Double = v1[0]
    v41[0] = v9
    let v60: Double = v10 - v16
    let v22: Double = v34[0]
    var v43: [[[Double]]] = v28
    v34 = v8
    var v45: [[[Double]]] = v5
    var v32: [[[Double]]] = v4
    let v37: Double = v1[0]
    var v36: [[Double]] = v24
    var v56: [[[Double]]] = v43
    v27[0] = v14
    var v62: [[[Double]]] = v56
    v34 = v1
    v41 = v2
    var v169: [Double] = v19
    var v80: [[Double]] = v27
    let v66: [Double] = v80[0]
    var v53: Double = v18
    var v69: [[[Double]]] = v45
    let v92: Double = v66[0]
    var v68: [Double] = v34
    v34[0] = v92
    let v64: [Double] = [v60, v53, v25, v31]
    v56[4] = v36
    let v46: Double = v16 + v37
    let v65: Double = v64[0]
    let v57: Double = v64[1]
    v27 = v7
    v24[0] = v1
    let v86: [[[[Double]]]] = [v69, v32, v4, v45, v62, v45]
    v56[2] = v0
    v169[0] = v46
    v80[0] = v14
    var v75: Double = v65
    v13[0] = v34
    v53 = v57
    let v81: [[[Double]]] = v86[5]
    v43 = v62
    v34[0] = v75
    v34 = v19
    let v95: [[Double]] = v81[1]
    v169[0] = v22
    v25 = v16
    v28[4] = v0
    v4[0] = v21
    v27[0] = v169
    v41[0] = v68
    v45 = v26
    v45[5] = v95
    return v95
  }
  func f110(_ v0: [[Double]]) -> [[Double]] {
    let v5: [[Double]] = f116(v0)
    var v1: [[Double]] = v5
    var v7: [[Double]] = v1
    let v12: [[Double]] = f116(v7)
    let v4: [[Double]] = f116(v12)
    v1 = v4
    let v2: [[Double]] = f116(v0)
    let v3: [[Double]] = f116(v4)
    var v8: [[Double]] = v0
    var v9: [[Double]] = v12
    let v10: [Double] = v4[0]
    let v23: [Double] = v2[0]
    let v24: [[Double]] = f116(v5)
    var v11: [Double] = v10
    v9[0] = v23
    let v33: [Double] = v1[0]
    let v49: [[Double]] = f116(v9)
    let v35: Double = v23[0]
    let v40: [[Double]] = f116(v49)
    var v34: Double = v35
    let v48: Double = v10[0]
    var v27: Double = v48
    let v51: Double = v23[0]
    v1[0] = v33
    let v45: [Double] = v4[0]
    var v75: [[Double]] = v3
    let v30: [[Double]] = f116(v75)
    let v54: [Double] = v8[0]
    v11[0] = v27
    let v87: [Double] = v8[0]
    let v73: [[Double]] = f116(v4)
    v27 = v34
    var v114: [[Double]] = v73
    let v118: [[Double]] = f116(v30)
    let v65: [Double] = v4[0]
    v27 = v51
    var v77: [[Double]] = v114
    let v91: [[Double]] = [v11, v65, v87, v23, v45]
    v1[0] = v54
    let v96: [[[Double]]] = [v9, v24, v40, v77, v118]
    let v81: [Double] = v91[3]
    var v94: [Double] = v81
    v11[0] = v34
    v27 = v35
    v114[0] = v94
    let v143: [[Double]] = v96[1]
    v1[0] = v33
    return v143
  }
  func f105(_ v0: [[Double]]) -> [[Double]] {
    let v9: [[Double]] = f116(v0)
    let v14: [[Double]] = f110(v9)
    let v21: [[Double]] = f116(v14)
    let v29: [[Double]] = f116(v21)
    let v46: [[Double]] = f110(v29)
    let v98: [[Double]] = f116(v46)
    let v66: [[Double]] = f116(v98)
    let v69: [[Double]] = f116(v66)
    let v93: [[Double]] = f116(v69)
    return v93
  }
  func f39(_ v0: [[Double]]) -> [[Double]] {
    let v5: [[[Double]]] = [v0, v0, v0, v0]
    let v7: [[Double]] = f105(v0)
    var v15: [[[Double]]] = v5
    v15[3] = v7
    let v11: [[Double]] = v5[1]
    let v22: [Double] = v7[0]
    var v42: [[Double]] = v11
    var v36: [[[Double]]] = v15
    v36[1] = v42
    let v121: [[Double]] = v36[3]
    v42[0] = v22
    return v121
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: [[Double]], _ v4: Double) -> Double {
    let v6: [[Double]] = f39(v2)
    let v11: [Double] = v6[0]
    let v12: Double = v11[0]
    var v15: Double = v12
    let v75: Double = v12 - v15
    return v75
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: [[Double]] = [[3.0]]
    let v2: [[Double]] = [[4.0]]
    let v3: [[Double]] = [[5.0], [6.0], [7.0]]
    let v4: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
