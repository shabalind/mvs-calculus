  import Dispatch
  func f10(_ v0: [[Double]]) -> [[Double]] {
    let v15: [Double] = v0[0]
    var v9: [Double] = v15
    var v34: [[Double]] = v0
    var v10: [[Double]] = v34
    v10[0] = v9
    return v10
  }
  func f9(_ v0: [[Double]]) -> [[Double]] {
    var v3: [[Double]] = v0
    var v1: [[Double]] = v3
    let v2: [Double] = v0[0]
    var v7: [[Double]] = v1
    v1[0] = v2
    return v7
  }
  func f8(_ v0: Double) -> Double {
    var v4: Double = v0
    var v3: Double = v0
    var v2: Double = v3
    let v6: [Double] = [v4, v3, v4, v3]
    let v9: Double = v6[0]
    var v10: [Double] = v6
    var v11: [Double] = v10
    v10[0] = v2
    var v12: [Double] = v10
    var v14: Double = v9
    var v30: [Double] = v12
    var v41: [Double] = v30
    v10[3] = v14
    let v35: Double = v11[3]
    let v74: Double = v41[1]
    var v70: Double = v74
    v10[3] = v4
    let v75: Double = v11[2]
    let v89: Double = v35 + v70
    var v77: Double = v75
    v10[2] = v77
    return v89
  }
  func f7(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]]) -> [[Double]] {
    let v7: [[Double]] = f10(v1)
    let v43: [[Double]] = f10(v7)
    let v56: [[Double]] = f10(v43)
    return v56
  }
  func f6(_ v0: [[Double]], _ v1: [Double], _ v2: [[Double]]) -> [[Double]] {
    let v8: [Double] = v2[0]
    let v6: [[Double]] = f9(v2)
    let v4: [[Double]] = f9(v6)
    let v7: [[Double]] = f9(v4)
    var v11: [Double] = v8
    let v3: Double = v1[0]
    var v13: Double = v3
    var v29: Double = v13
    let v16: Double = f8(v13)
    let v10: Double = f8(v16)
    let v18: Double = v11[0]
    var v23: [[Double]] = v7
    v11[0] = v29
    var v22: [Double] = v1
    let v33: [[Double]] = f9(v23)
    var v34: [Double] = v22
    v23[1] = v34
    v34[0] = v18
    let v24: Double = f8(v10)
    v34[0] = v13
    v11[0] = v24
    return v33
  }
  func f5(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: [[Double]], _ v4: [[Double]], _ v5: [[Double]], _ v6: [[Double]]) -> [[Double]] {
    var v8: [[Double]] = v3
    let v7: [Double] = v3[1]
    var v15: [[Double]] = v2
    let v11: [Double] = v4[1]
    v8[0] = v7
    let v12: [[Double]] = f7(v2, v6, v8)
    var v19: [Double] = v11
    v8[1] = v19
    let v16: [Double] = v2[0]
    var v30: [Double] = v7
    let v20: [[Double]] = f10(v2)
    var v14: [Double] = v16
    v15[0] = v7
    v15[0] = v7
    let v26: [Double] = v12[0]
    v15[0] = v26
    var v39: [[Double]] = v1
    let v17: [Double] = v15[0]
    let v42: Double = v14[0]
    let v21: Double = f8(v42)
    let v28: [Double] = v39[1]
    let v23: [Double] = v20[0]
    v30[0] = v21
    var v25: [[Double]] = v39
    let v33: [[Double]] = f7(v6, v2, v0)
    let v31: Double = v16[0]
    v8[0] = v23
    var v48: [[Double]] = v6
    var v37: [[Double]] = v25
    let v29: [Double] = v5[0]
    var v82: [[Double]] = v2
    let v60: [Double] = v12[0]
    let v43: Double = f8(v31)
    let v46: [Double] = v37[2]
    v82[0] = v46
    v15[0] = v23
    var v34: [Double] = v14
    let v100: Double = v42 + v43
    let v50: [Double] = v82[0]
    let v96: [Double] = v6[0]
    let v138: [[Double]] = [v60, v23, v29, v50]
    v37[1] = v96
    v82[0] = v28
    let v122: [Double] = v48[0]
    v14 = v7
    var v102: [[Double]] = v138
    v15[0] = v30
    let v105: [Double] = v33[0]
    v14 = v105
    v25[0] = v122
    let v280: [Double] = v102[1]
    let v194: Double = f8(v100)
    v19[0] = v194
    v39[2] = v17
    v102[3] = v34
    v37[1] = v7
    let v198: [[Double]] = [v96, v280]
    return v198
  }
  func f4(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v6: [[[Double]]] = [v1, v0]
    let v4: [[Double]] = v6[0]
    let v3: [Double] = v4[0]
    var v5: [[Double]] = v4
    var v8: [Double] = v3
    var v11: [Double] = v8
    v5 = v4
    v5[0] = v11
    let v16: Double = v8[0]
    v11[0] = v16
    let v39: Double = f8(v16)
    v8[0] = v39
    v5[0] = v8
    return v5
  }
  func f3(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]]) -> [[Double]] {
    let v3: [[Double]] = f10(v0)
    let v6: [[Double]] = f10(v0)
    var v8: [[Double]] = v2
    let v7: [[Double]] = f5(v2, v1, v3, v8, v2, v2, v6)
    let v16: [[Double]] = f5(v7, v1, v6, v2, v8, v2, v0)
    let v11: [[Double]] = f4(v1, v1)
    let v18: [[Double]] = f9(v16)
    var v44: [[Double]] = v11
    let v64: [[Double]] = f9(v18)
    let v60: [Double] = v64[0]
    let v71: [[Double]] = f4(v44, v1)
    let v54: [[Double]] = f4(v1, v71)
    var v57: [Double] = v60
    v44[1] = v57
    let v155: [[Double]] = f4(v11, v71)
    let v229: [[Double]] = f4(v155, v11)
    let v373: [[[Double]]] = [v155, v71, v54, v44, v229]
    var v106: [[[Double]]] = v373
    v44[1] = v57
    let v172: [[Double]] = v106[3]
    return v172
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: [[Double]], _ v4: Double) -> Double {
    let v5: Double = f8(v4)
    let v6: [Double] = v1[0]
    let v8: Double = v6[0]
    let v9: [Double] = v3[0]
    var v7: [[Double]] = v0
    let v16: [Double] = [v5]
    let v11: [[Double]] = f7(v3, v3, v1)
    let v30: [[Double]] = f10(v11)
    let v12: [Double] = v1[1]
    var v10: [Double] = v6
    let v15: [[Double]] = f4(v7, v0)
    v7[0] = v10
    let v17: [[Double]] = f6(v15, v6, v1)
    var v21: [[Double]] = v11
    v21[0] = v12
    let v18: [Double] = v17[1]
    let v13: [[Double]] = f3(v11, v2, v17)
    let v25: [Double] = v2[0]
    let v35: [[Double]] = f9(v17)
    v10[0] = v8
    v21[0] = v12
    var v27: [[Double]] = v3
    v21[0] = v16
    let v29: Double = v25[0]
    var v26: [[Double]] = v7
    let v50: [[Double]] = f9(v1)
    v26 = v2
    var v52: [[Double]] = v30
    var v70: Double = v8
    var v41: [[Double]] = v21
    let v53: [Double] = v30[0]
    v52[0] = v9
    v26 = v2
    var v51: Double = v29
    var v45: [[Double]] = v13
    var v40: [[Double]] = v1
    v41[0] = v16
    v10[0] = v70
    var v47: [[Double]] = v21
    v7 = v26
    let v34: [[Double]] = f6(v45, v25, v40)
    var v49: [[Double]] = v27
    var v85: [[Double]] = v34
    let v102: [Double] = v47[0]
    var v80: [[Double]] = v0
    v41[0] = v9
    var v39: [Double] = v18
    let v68: [[Double]] = f6(v7, v6, v17)
    let v56: Double = v39[0]
    var v82: [[Double]] = v85
    var v55: [Double] = v53
    let v100: [[Double]] = f9(v85)
    v55[0] = v51
    v10[0] = v56
    v45[2] = v55
    let v241: [[Double]] = f7(v52, v21, v82)
    v40[0] = v10
    v82[0] = v102
    var v95: [[Double]] = v50
    let v149: [[Double]] = f5(v95, v80, v241, v17, v35, v100, v41)
    let v123: [Double] = v30[0]
    let v159: [[Double]] = f7(v21, v49, v149)
    let v93: [Double] = v159[0]
    v49[0] = v10
    v80[1] = v18
    let v171: Double = v93[0]
    v49[0] = v123
    let v254: [Double] = v68[0]
    v82[1] = v25
    v10[0] = v8
    v27[0] = v254
    return v171
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: [[Double]] = [[3.0], [4.0]]
    let v2: [[Double]] = [[5.0], [6.0], [7.0]]
    let v3: [[Double]] = [[8.0]]
    let v4: Double = 9.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 9.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
