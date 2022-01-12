  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f18(_ v0: s0, _ v1: [[s0]]) -> [[s0]] {
    var v44: [[s0]] = v1
    var v98: [[s0]] = v44
    return v98
  }
  func f17(_ v0: Double) -> Double {
    var v6: Double = v0
    let v5: [Double] = [v0, v0, v6, v6, v0, v0, v6]
    let v1: Double = v5[6]
    var v8: Double = v6
    let v12: Double = v5[5]
    var v7: Double = v1
    var v3: [Double] = v5
    let v9: Double = v3[2]
    v6 = v9
    let v4: Double = v3[0]
    let v11: Double = v5[2]
    let v16: Double = v5[1]
    var v20: Double = v16
    let v19: Double = v5[1]
    let v30: Double = v5[0]
    var v21: [Double] = v5
    v21[5] = v1
    v21[4] = v30
    var v14: [Double] = v3
    v3[3] = v11
    let v25: Double = v14[2]
    let v28: [Double] = [v8, v16, v4, v6, v7]
    v21[1] = v19
    v14[4] = v12
    v21[1] = v11
    v21[1] = v9
    v3 = v21
    let v46: [[Double]] = [v28, v28, v28, v28, v28, v28, v28]
    v21[0] = v6
    var v37: [[Double]] = v46
    v14[5] = v20
    let v52: [Double] = v37[2]
    var v53: [Double] = v52
    v20 = v11
    v53[4] = v30
    v3[5] = v25
    let v98: Double = v53[2]
    return v98
  }
  func f16(_ v0: s0) -> s0 {
    var v5: s0 = v0
    v5 = v0
    let v4: [[Double]] = v0.p1
    let v1: [[Double]] = v5.p1
    v5.p0 = v4
    let v8: s0 = s0(p0: v4, p1: v1)
    var v23: [[Double]] = v4
    v5.p0 = v23
    let v9: [s0] = [v5, v0, v0, v5, v8, v5]
    var v31: [s0] = v9
    let v48: s0 = v31[0]
    return v48
  }
  func f15(_ v0: s0, _ v1: [[s0]]) -> s0 {
    let v5: s0 = f16(v0)
    let v32: [[s0]] = f18(v5, v1)
    let v23: s0 = f16(v0)
    let v34: [[s0]] = f18(v23, v32)
    let v74: [s0] = v34[1]
    let v138: s0 = v74[0]
    return v138
  }
  func f9(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v10: [s0] = [v5]
    var v6: s0 = v5
    let v4: s0 = f16(v6)
    let v2: s0 = f16(v4)
    let v18: [[s0]] = [v10, v10, v10]
    var v23: [[s0]] = v18
    let v54: s0 = f15(v2, v23)
    return v54
  }
  func f5(_ v0: s0, _ v1: Double, _ v2: s0, _ v3: s0, _ v4: s0) -> Double {
    let v7: [[Double]] = v4.p1
    let v6: [[Double]] = v2.p1
    let v5: s0 = s0(p0: v6, p1: v7)
    var v15: s0 = v3
    v15.p0 = v6
    let v8: [Double] = v6[0]
    let v10: [Double] = v6[0]
    let v14: [Double] = v7[0]
    v15.p0 = v7
    let v21: Double = f17(v1)
    let v20: s0 = f9(v15)
    var v18: [[Double]] = v7
    var v29: [Double] = v8
    v18[0] = v14
    var v23: [Double] = v10
    v23[0] = v21
    let v33: s0 = f16(v20)
    let v34: [[Double]] = v20.p1
    let v16: Double = v23[0]
    let v36: [[Double]] = v15.p1
    v15.p0 = v7
    var v24: [[Double]] = v36
    let v27: [[Double]] = v5.p1
    let v59: [Double] = v27[0]
    let v88: [[Double]] = v33.p1
    v15.p1 = v34
    v23[0] = v16
    let v57: s0 = f9(v3)
    let v99: [Double] = v88[0]
    let v71: [[Double]] = v57.p0
    v18[0] = v59
    let v62: Double = v99[0]
    v29[0] = v16
    v15.p1 = v24
    v18 = v71
    var v121: [Double] = v29
    let v58: Double = v16 / v62
    v15.p0 = v18
    v23 = v121
    return v58
  }
  func f4(_ v0: s0, _ v1: s0) -> s0 {
    var v2: s0 = v0
    let v4: s0 = f9(v2)
    var v7: s0 = v0
    let v5: s0 = f9(v4)
    let v3: [[Double]] = v0.p1
    let v13: [[Double]] = v5.p1
    let v6: s0 = f9(v7)
    let v9: [Double] = v13[0]
    let v15: s0 = f16(v4)
    let v10: s0 = f16(v5)
    let v20: s0 = f16(v6)
    let v8: s0 = f9(v0)
    let v25: [[Double]] = v4.p1
    var v18: [[Double]] = v3
    v7.p0 = v3
    let v21: [[Double]] = v4.p1
    let v17: Double = v9[0]
    v7.p1 = v18
    let v37: [[Double]] = v20.p1
    let v34: [[Double]] = v10.p1
    v2.p0 = v34
    v2.p1 = v18
    let v22: [[Double]] = v15.p1
    let v32: [Double] = v34[0]
    var v40: [[Double]] = v25
    v7.p1 = v40
    let v53: [Double] = v3[0]
    let v31: [Double] = v22[0]
    v40[0] = v53
    v18[0] = v31
    v2.p1 = v25
    v40[0] = v9
    let v67: s0 = f16(v2)
    v40[0] = v53
    v18[0] = v32
    v18[0] = v32
    var v23: [Double] = v32
    v18[0] = v32
    let v24: [[Double]] = v20.p0
    let v47: s0 = s0(p0: v21, p1: v13)
    let v48: Double = v9[0]
    v18[0] = v9
    var v84: s0 = v8
    v18[0] = v23
    v84.p0 = v37
    let v30: s0 = f9(v47)
    v18[0] = v31
    v23[0] = v48
    v84 = v30
    v7.p1 = v24
    v84.p1 = v21
    let v42: Double = f17(v17)
    v84.p0 = v21
    v7.p1 = v37
    let v60: [[Double]] = v67.p0
    let v125: [[Double]] = v7.p0
    v84.p1 = v125
    v2.p1 = v60
    v23[0] = v42
    v84.p1 = v40
    v2.p0 = v40
    let v143: [[Double]] = v47.p0
    let v183: [Double] = v143[0]
    v18[0] = v183
    return v84
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: Double) -> Double {
    let v5: [[Double]] = v1.p1
    let v9: s0 = f9(v1)
    let v7: [Double] = v5[0]
    let v11: s0 = f4(v0, v0)
    let v48: Double = v7[0]
    let v41: s0 = f4(v9, v9)
    let v24: Double = f5(v1, v48, v1, v0, v41)
    let v27: Double = v7[0]
    let v42: s0 = f9(v0)
    let v47: Double = f17(v24)
    let v59: Double = f5(v11, v27, v9, v42, v1)
    var v71: Double = v59
    var v75: Double = v47
    let v79: Double = v71 + v75
    return v79
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0]])
    let v1: s0 = s0(p0: [[2.0]], p1: [[3.0]])
    let v2: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
