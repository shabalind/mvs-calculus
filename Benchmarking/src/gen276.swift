  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [[s1]]
  }
  struct s3 {
    var p0: s1
    var p1: s1
  }
  struct s5 {
    var p0: s2
    var p1: [s3]
  }
  struct s6 {
    var p0: [s2]
  }
  func f56(_ v0: Double) -> Double {
    var v3: Double = v0
    var v5: Double = v0
    var v4: Double = v0
    v4 = v3
    var v7: Double = v3
    var v9: Double = v4
    let v2: [Double] = [v5, v5, v4, v0, v3, v9, v9]
    var v20: [Double] = v2
    var v8: [Double] = v2
    let v21: Double = v2[4]
    let v22: Double = v20[3]
    var v12: [Double] = v8
    v12[4] = v7
    var v18: [Double] = v2
    let v30: Double = v21 / v3
    let v27: Double = v2[6]
    let v33: Double = v18[4]
    let v44: Double = v30 * v22
    var v35: Double = v33
    var v24: Double = v4
    var v19: [Double] = v12
    let v58: Double = v19[2]
    v12[1] = v44
    v8[2] = v35
    v12[4] = v24
    v7 = v33
    var v51: [Double] = v19
    v12[4] = v35
    v20[5] = v58
    v19[2] = v33
    let v63: Double = v51[1]
    v8[3] = v63
    v7 = v27
    return v63
  }
  func f39(_ v0: s0) -> s0 {
    let v4: [Double] = v0.p0
    let v6: [[Double]] = v0.p1
    let v7: [Double] = v6[0]
    var v20: s0 = v0
    var v45: s0 = v20
    v45.p0 = v4
    var v19: s0 = v45
    var v31: s0 = v19
    let v21: [Double] = v31.p0
    v45.p0 = v7
    let v68: [Double] = v19.p0
    v45.p0 = v68
    let v32: [[Double]] = v19.p1
    v45.p0 = v4
    let v89: [[Double]] = v19.p1
    let v158: s0 = s0(p0: v21, p1: v32)
    let v163: [Double] = v89[0]
    v20.p0 = v163
    return v158
  }
  func f38(_ v0: s0) -> s0 {
    let v1: [[Double]] = v0.p1
    var v5: s0 = v0
    var v13: s0 = v5
    v5.p1 = v1
    v5.p1 = v1
    return v13
  }
  func f17(_ v0: [Double]) -> [Double] {
    var v4: [Double] = v0
    let v2: Double = v4[0]
    v4[0] = v2
    let v5: Double = f56(v2)
    var v7: [Double] = v0
    v7[0] = v2
    let v3: Double = f56(v2)
    var v6: Double = v5
    let v8: Double = f56(v3)
    let v11: Double = f56(v3)
    var v14: [Double] = v4
    let v16: Double = v7[0]
    var v9: [Double] = v4
    v9[0] = v8
    v4[0] = v11
    var v1: Double = v6
    let v10: Double = v4[0]
    let v29: Double = v9[0]
    var v34: [Double] = v0
    var v33: Double = v3
    var v37: Double = v10
    let v17: Double = f56(v37)
    var v12: [Double] = v34
    var v19: Double = v16
    v19 = v11
    var v27: [Double] = v7
    let v28: Double = v12[0]
    let v25: Double = v14[0]
    let v40: Double = v34[0]
    v4[0] = v40
    v12[0] = v33
    v12[0] = v40
    var v23: Double = v25
    let v35: [[Double]] = [v14, v14, v12, v27, v0, v0]
    let v57: [Double] = v35[2]
    v27[0] = v17
    v12[0] = v11
    v4[0] = v3
    let v43: Double = f56(v1)
    let v47: Double = f56(v25)
    v9[0] = v16
    v27[0] = v10
    v12[0] = v28
    v12[0] = v43
    let v31: Double = f56(v47)
    var v54: [Double] = v57
    v54[0] = v29
    v12[0] = v23
    v14[0] = v11
    v14[0] = v16
    var v71: Double = v40
    v34[0] = v19
    v54[0] = v31
    v9[0] = v71
    v23 = v1
    v4[0] = v47
    var v143: [Double] = v54
    return v143
  }
  func f14(_ v0: Double, _ v1: s0) -> Double {
    let v4: [[Double]] = v1.p1
    let v2: [Double] = v4[0]
    var v6: [[Double]] = v4
    let v7: [Double] = f17(v2)
    var v3: s0 = v1
    var v10: [[Double]] = v6
    let v16: s0 = s0(p0: v7, p1: v4)
    let v20: [Double] = f17(v7)
    let v9: s0 = f38(v16)
    v10[0] = v7
    var v12: [Double] = v20
    let v11: [[Double]] = v1.p1
    let v26: s0 = f39(v3)
    v3.p0 = v20
    let v21: [[Double]] = v9.p1
    let v15: [Double] = v11[0]
    v10[0] = v15
    v6[0] = v15
    let v17: [[Double]] = v1.p1
    let v25: s0 = f39(v9)
    let v30: [Double] = v26.p0
    v3.p0 = v30
    let v47: [Double] = v25.p0
    v3.p1 = v21
    v3.p1 = v10
    v3.p0 = v12
    v3.p1 = v21
    let v34: Double = v30[0]
    let v53: Double = f56(v34)
    let v24: Double = v47[0]
    let v59: Double = f56(v24)
    let v44: [Double] = v17[0]
    v3.p0 = v44
    let v77: Double = v53 / v59
    return v77
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s6], _ v2: [[s5]], _ v3: s2, _ v4: Double) -> Double {
    let v10: [Double] = v0.p0
    var v7: [Double] = v10
    var v8: s0 = v0
    v7[0] = v4
    let v17: Double = v4 * v4
    let v14: Double = v10[0]
    v8.p0 = v10
    v7[0] = v4
    v8.p0 = v7
    v8.p0 = v7
    var v35: [Double] = v10
    v8.p0 = v35
    v8.p0 = v7
    let v60: Double = v7[0]
    let v29: Double = v4 + v17
    let v33: Double = v60 + v60
    v35 = v7
    let v31: Double = v14 * v33
    let v43: [Double] = f17(v35)
    let v68: Double = v43[0]
    let v54: Double = v17 / v31
    var v51: Double = v29
    let v39: [Double] = f17(v7)
    let v52: Double = v54 * v51
    let v56: Double = v39[0]
    v8.p0 = v35
    v35[0] = v56
    let v87: Double = v43[0]
    v35[0] = v68
    v7[0] = v60
    v35[0] = v87
    let v122: Double = v54 * v52
    let v221: Double = f14(v68, v8)
    v7[0] = v221
    return v122
  }
  func benchmark() {
    let v0: s0 = s0(p0: [0.0], p1: [[1.0]])
    let v1: [s6] = [s6(p0: [s2(p0: s0(p0: [2.0], p1: [[3.0]]), p1: [[s1(p0: [s0(p0: [4.0], p1: [[5.0]])], p1: s0(p0: [6.0], p1: [[7.0]]))], [s1(p0: [s0(p0: [8.0], p1: [[9.0]])], p1: s0(p0: [10.0], p1: [[11.0]]))]]), s2(p0: s0(p0: [12.0], p1: [[13.0]]), p1: [[s1(p0: [s0(p0: [14.0], p1: [[15.0]])], p1: s0(p0: [16.0], p1: [[17.0]]))], [s1(p0: [s0(p0: [18.0], p1: [[19.0]])], p1: s0(p0: [20.0], p1: [[21.0]]))]])])]
    let v2: [[s5]] = [[s5(p0: s2(p0: s0(p0: [22.0], p1: [[23.0]]), p1: [[s1(p0: [s0(p0: [24.0], p1: [[25.0]])], p1: s0(p0: [26.0], p1: [[27.0]]))], [s1(p0: [s0(p0: [28.0], p1: [[29.0]])], p1: s0(p0: [30.0], p1: [[31.0]]))]]), p1: [s3(p0: s1(p0: [s0(p0: [32.0], p1: [[33.0]])], p1: s0(p0: [34.0], p1: [[35.0]])), p1: s1(p0: [s0(p0: [36.0], p1: [[37.0]])], p1: s0(p0: [38.0], p1: [[39.0]]))), s3(p0: s1(p0: [s0(p0: [40.0], p1: [[41.0]])], p1: s0(p0: [42.0], p1: [[43.0]])), p1: s1(p0: [s0(p0: [44.0], p1: [[45.0]])], p1: s0(p0: [46.0], p1: [[47.0]]))), s3(p0: s1(p0: [s0(p0: [48.0], p1: [[49.0]])], p1: s0(p0: [50.0], p1: [[51.0]])), p1: s1(p0: [s0(p0: [52.0], p1: [[53.0]])], p1: s0(p0: [54.0], p1: [[55.0]])))])]]
    let v3: s2 = s2(p0: s0(p0: [56.0], p1: [[57.0]]), p1: [[s1(p0: [s0(p0: [58.0], p1: [[59.0]])], p1: s0(p0: [60.0], p1: [[61.0]]))], [s1(p0: [s0(p0: [62.0], p1: [[63.0]])], p1: s0(p0: [64.0], p1: [[65.0]]))]])
    let v4: Double = 66.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 66.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
