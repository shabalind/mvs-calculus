  import Dispatch
  func f25(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    var v4: [[Double]] = v1
    var v2: [[Double]] = v1
    let v3: [Double] = v1[1]
    var v5: [[Double]] = v2
    v4[1] = v3
    v5[1] = v3
    v5[0] = v3
    v5[1] = v3
    v4[0] = v3
    var v6: [Double] = v3
    v2[1] = v3
    v5[0] = v6
    var v9: [Double] = v6
    let v7: Double = v3[0]
    v9[0] = v7
    v2[0] = v6
    v5[1] = v6
    v5 = v4
    let v16: Double = v6[0]
    var v13: [[Double]] = v5
    let v22: [Double] = v13[0]
    v5[1] = v9
    v4[1] = v22
    let v24: Double = v9[0]
    let v37: [Double] = v1[1]
    v2[1] = v3
    v2[0] = v22
    let v28: [[Double]] = [v22, v6, v6, v3]
    v4[0] = v6
    v9[0] = v16
    v4[1] = v37
    v9[0] = v24
    v13[0] = v6
    let v52: [Double] = v28[2]
    v5[1] = v22
    let v41: [[[Double]]] = [v13, v0]
    v2[1] = v52
    var v81: [[[Double]]] = v41
    var v186: [[[Double]]] = v81
    v186[0] = v0
    let v115: [[Double]] = v186[1]
    return v115
  }
  func f17(_ v0: [[Double]]) -> [[Double]] {
    let v5: [[Double]] = f25(v0, v0)
    var v9: [[Double]] = v0
    let v1: [[Double]] = f25(v5, v5)
    let v14: [[Double]] = f25(v1, v9)
    let v16: [[Double]] = f25(v14, v5)
    return v16
  }
  func f16(_ v0: [[Double]]) -> [[Double]] {
    var v5: [[Double]] = v0
    let v1: [[Double]] = f25(v5, v0)
    let v6: [Double] = v0[0]
    var v4: [Double] = v6
    var v3: [Double] = v6
    var v13: [[Double]] = v1
    v5[1] = v4
    let v22: [[Double]] = f25(v5, v13)
    let v31: [[Double]] = f17(v22)
    v5[0] = v3
    v5[0] = v6
    return v31
  }
  func f15(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v3: [[Double]] = f25(v0, v1)
    var v2: [[Double]] = v0
    v2 = v3
    let v5: [Double] = v2[1]
    v2[1] = v5
    let v8: [[Double]] = f17(v2)
    let v11: Double = v5[0]
    v2[1] = v5
    var v21: [Double] = v5
    v21[0] = v11
    v2[0] = v21
    let v32: [[Double]] = f17(v8)
    var v28: [[Double]] = v32
    v28[1] = v21
    return v28
  }
  func f14(_ v0: Double) -> Double {
    var v3: Double = v0
    var v7: Double = v0
    var v6: Double = v7
    var v4: Double = v0
    var v2: Double = v7
    var v11: Double = v4
    var v5: Double = v7
    var v1: Double = v11
    var v9: Double = v5
    let v8: Double = v5 / v9
    v3 = v9
    var v10: Double = v9
    let v13: Double = v1 / v10
    var v20: Double = v10
    let v30: [Double] = [v6, v9, v8]
    let v19: Double = v30[2]
    var v17: [Double] = v30
    let v14: Double = v17[2]
    let v12: Double = v2 / v13
    let v26: Double = v30[0]
    var v24: [Double] = v17
    var v27: [Double] = v30
    let v22: Double = v14 + v19
    var v29: [Double] = v30
    v29 = v27
    let v52: Double = v29[0]
    var v31: Double = v10
    v27[1] = v14
    var v33: [Double] = v30
    let v43: [Double] = [v0, v31, v22, v20, v13]
    v24[2] = v9
    var v44: Double = v12
    var v45: [Double] = v43
    v29[2] = v44
    v11 = v22
    var v54: [Double] = v24
    let v64: Double = v54[0]
    var v51: [Double] = v45
    let v28: [Double] = [v3, v64, v52, v64]
    v45 = v51
    let v32: Double = v51[4]
    let v60: Double = v28[2]
    let v57: [Double] = [v10, v1, v32, v4, v52, v13, v26]
    v45 = v43
    var v79: [Double] = v28
    var v100: [Double] = v79
    let v85: Double = v28[0]
    let v94: Double = v100[1]
    var v56: [Double] = v57
    var v55: [Double] = v56
    v51[4] = v85
    var v116: [Double] = v100
    var v103: [Double] = v116
    v54 = v33
    v29[0] = v10
    let v130: Double = v55[3]
    v116[0] = v130
    let v174: Double = v103[0]
    v27[2] = v174
    let v155: Double = v57[2]
    var v72: Double = v94
    let v148: Double = v155 - v60
    v33[2] = v72
    return v148
  }
  func f8(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v6: [Double] = v1[1]
    var v3: [Double] = v6
    let v7: Double = v6[0]
    let v2: [Double] = v1[1]
    let v5: [[Double]] = f15(v0, v1)
    let v14: Double = v3[0]
    let v12: [[Double]] = f16(v1)
    var v8: [Double] = v2
    let v9: Double = f14(v7)
    var v10: [[Double]] = v12
    let v29: [[[Double]]] = [v5, v0, v5, v10, v12]
    var v13: [[[Double]]] = v29
    var v15: Double = v14
    v3[0] = v9
    var v24: [Double] = v8
    v3[0] = v7
    var v36: Double = v9
    let v25: [Double] = [v7, v36, v36, v15, v9]
    let v22: Double = v25[3]
    var v35: [Double] = v25
    var v21: [[Double]] = v0
    let v37: [[Double]] = v13[2]
    let v39: [Double] = v21[1]
    v21[1] = v2
    let v30: [[[Double]]] = [v12, v12, v37]
    let v56: [[[[Double]]]] = [v30, v30, v30, v30, v30, v30]
    var v84: [[[[Double]]]] = v56
    let v121: Double = v25[0]
    let v75: Double = v35[3]
    let v130: [[Double]] = v30[1]
    var v68: [[[[Double]]]] = v84
    v8[0] = v22
    var v212: [[[[Double]]]] = v68
    v10[0] = v39
    var v146: [[Double]] = v130
    var v74: [[[[Double]]]] = v212
    let v383: [[[Double]]] = v74[5]
    v8[0] = v75
    v10 = v146
    v10[0] = v24
    v35[1] = v121
    let v190: [[Double]] = v383[1]
    return v190
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    let v2: [[Double]] = f8(v0, v0)
    let v4: [Double] = v2[1]
    let v8: [[Double]] = f16(v2)
    var v5: [[Double]] = v2
    let v29: [Double] = v5[1]
    let v25: Double = f14(v1)
    let v11: [Double] = v8[1]
    var v10: Double = v25
    let v40: Double = f14(v10)
    let v35: Double = v4[0]
    v5[1] = v4
    var v65: [Double] = v29
    let v36: Double = v65[0]
    v65 = v11
    let v244: [Double] = [v35, v40, v36, v1]
    var v90: [Double] = v244
    let v209: Double = v90[1]
    return v209
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
