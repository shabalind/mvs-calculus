  import Dispatch
  func f25(_ v0: [Double]) -> [Double] {
    let v5: Double = v0[1]
    let v6: [[Double]] = [v0, v0]
    var v7: [[Double]] = v6
    v7[0] = v0
    var v2: [[Double]] = v7
    var v3: Double = v5
    let v1: [Double] = v7[1]
    var v8: [Double] = v0
    v2[1] = v1
    v2 = v6
    v2[0] = v1
    let v34: [[Double]] = [v0, v1, v0, v1, v1]
    let v10: [Double] = v34[3]
    let v14: [Double] = v34[3]
    let v12: [Double] = v2[1]
    var v20: [[Double]] = v6
    v20[0] = v8
    let v16: [[[Double]]] = [v34, v34, v34, v34, v34]
    var v24: [Double] = v14
    let v23: [[Double]] = v16[2]
    var v29: [[Double]] = v6
    var v25: [Double] = v12
    var v26: [Double] = v10
    v2[1] = v24
    var v33: Double = v3
    var v37: [Double] = v1
    v37 = v24
    let v71: [Double] = v23[2]
    let v32: Double = v24[2]
    let v68: [[Double]] = [v12, v37, v25, v1, v0, v71, v71]
    v20[0] = v26
    let v91: Double = v33 + v32
    v2 = v29
    v24[2] = v33
    v8[2] = v91
    var v62: [[Double]] = v68
    v29 = v20
    var v98: [[Double]] = v29
    let v83: [Double] = v62[4]
    v20 = v98
    return v83
  }
  func f6(_ v0: Double) -> Double {
    var v6: Double = v0
    var v4: Double = v6
    var v7: Double = v4
    var v2: Double = v0
    let v1: [Double] = [v0, v7, v4, v0]
    let v18: [[Double]] = [v1, v1, v1, v1, v1]
    var v5: [[Double]] = v18
    v2 = v6
    let v3: [[Double]] = [v1, v1, v1, v1, v1, v1]
    let v8: [[[Double]]] = [v18, v18, v18, v18, v5, v5, v5]
    var v11: [[[Double]]] = v8
    v5[2] = v1
    v5[2] = v1
    var v12: [[[Double]]] = v11
    var v15: [[Double]] = v5
    v15[0] = v1
    var v17: [[Double]] = v15
    let v19: [[Double]] = [v1, v1, v1, v1, v1, v1, v1]
    let v21: [Double] = v3[3]
    let v24: [Double] = v5[4]
    v11[2] = v18
    let v27: [Double] = v18[4]
    let v10: [[Double]] = v12[0]
    let v22: [Double] = v19[2]
    let v29: [Double] = v3[4]
    v12[2] = v17
    var v39: [Double] = v27
    var v48: [Double] = v24
    let v41: Double = v21[1]
    var v30: [Double] = v27
    var v71: [[Double]] = v3
    let v50: Double = v21[0]
    let v66: [Double] = v71[3]
    let v49: [Double] = v17[4]
    v48[3] = v50
    let v40: Double = v30[2]
    var v38: [[Double]] = v19
    var v84: [[Double]] = v3
    var v56: [[Double]] = v84
    let v147: [Double] = v10[1]
    v71[2] = v147
    v12[0] = v5
    v15[0] = v48
    var v52: [[Double]] = v38
    var v59: [[Double]] = v52
    let v130: [Double] = v84[0]
    v56[1] = v48
    let v113: Double = v41 * v2
    v38[3] = v1
    v84[1] = v66
    v39[2] = v113
    v39[0] = v40
    var v105: [[Double]] = v56
    let v46: [Double] = v71[1]
    v15[1] = v22
    v52[1] = v29
    var v206: [[Double]] = v59
    var v184: [[Double]] = v105
    v17[1] = v39
    v71[3] = v30
    let v148: [Double] = v206[5]
    v56[4] = v46
    v105[5] = v130
    v17[3] = v148
    v71[1] = v66
    let v188: Double = v147[2]
    let v229: [Double] = v105[0]
    v105 = v184
    v38[5] = v1
    v17[0] = v229
    var v154: [Double] = v49
    v48 = v154
    return v188
  }
  @inline(never)
  func f0(_ v0: [Double], _ v1: Double) -> Double {
    var v5: Double = v1
    let v9: [Double] = f25(v0)
    let v8: Double = f6(v5)
    var v3: Double = v8
    let v12: Double = v9[2]
    let v10: Double = f6(v3)
    var v30: [Double] = v0
    let v11: Double = v9[2]
    var v17: [Double] = v30
    let v14: Double = v0[1]
    let v16: Double = v0[0]
    let v24: Double = v11 + v12
    var v27: [Double] = v17
    v27[1] = v10
    var v33: Double = v11
    let v18: Double = f6(v16)
    v3 = v33
    v30[1] = v11
    v30[2] = v18
    let v54: Double = v27[2]
    v27[1] = v24
    v27[2] = v5
    v30[2] = v14
    v30[1] = v3
    return v54
  }
  func benchmark() {
    let v0: [Double] = [0.0, 1.0, 2.0]
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
