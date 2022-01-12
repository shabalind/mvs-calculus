  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f80(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v1: [s0] = [v6, v0, v0, v0, v0, v6, v6]
    let v2: s0 = v1[0]
    let v4: s0 = v1[6]
    let v5: s0 = v1[3]
    let v3: [[Double]] = v2.p1
    var v7: [[Double]] = v3
    let v12: [Double] = v3[0]
    var v8: [[Double]] = v3
    let v9: [s0] = [v4, v2, v2, v6, v0, v6]
    let v13: [Double] = v7[1]
    let v14: [[Double]] = v2.p1
    v6.p1 = v3
    var v25: [[Double]] = v14
    v6.p1 = v8
    var v34: s0 = v0
    v6.p1 = v3
    let v11: s0 = v1[1]
    var v10: [s0] = v9
    let v21: [[Double]] = v6.p0
    var v24: s0 = v5
    let v16: s0 = v10[5]
    v7[0] = v12
    let v36: s0 = v9[2]
    v7[2] = v13
    let v26: [[[Double]]] = [v21, v21, v21, v21, v21, v21, v21]
    var v15: [[Double]] = v25
    var v17: [Double] = v13
    let v18: [[Double]] = v6.p1
    let v19: [[Double]] = v16.p0
    let v28: [[Double]] = v26[4]
    v7[0] = v17
    v25[0] = v17
    v7[0] = v13
    let v43: [[Double]] = v26[6]
    var v29: [Double] = v17
    v25[2] = v12
    let v23: [[Double]] = v26[5]
    let v54: s0 = v10[4]
    var v44: [s0] = v10
    let v33: [[s0]] = [v9, v9, v10, v44]
    v24.p0 = v43
    let v32: [[Double]] = v11.p0
    v34.p0 = v32
    v6.p1 = v15
    let v37: [[Double]] = v54.p0
    let v62: [Double] = v15[2]
    v34.p0 = v23
    v6.p0 = v37
    v24 = v2
    v34.p0 = v19
    v34.p0 = v28
    let v82: [[Double]] = v4.p1
    v24.p1 = v8
    v34.p1 = v15
    v24.p1 = v15
    v7 = v82
    v7[1] = v17
    v24.p1 = v18
    v34.p0 = v28
    v6 = v36
    v10[2] = v16
    let v116: [[Double]] = v34.p0
    var v41: [[Double]] = v14
    let v65: [[Double]] = v36.p0
    v34.p0 = v23
    v6.p0 = v65
    v25[2] = v62
    var v74: [[s0]] = v33
    let v53: [s0] = v74[0]
    v34 = v24
    v34.p1 = v41
    v41[2] = v29
    let v121: s0 = v53[0]
    v6.p0 = v116
    return v121
  }
  func f79(_ v0: s1) -> s1 {
    var v1: s1 = v0
    let v4: s0 = v0.p0
    var v2: s1 = v0
    let v3: s0 = f80(v4)
    let v7: s0 = f80(v3)
    let v5: s0 = v2.p0
    let v8: s0 = f80(v4)
    var v11: s1 = v1
    v11.p1 = v4
    let v15: s0 = f80(v5)
    let v16: [s1] = [v2, v11, v2, v1, v0]
    let v30: s1 = v16[2]
    v2.p1 = v8
    let v45: s0 = v11.p1
    v1.p1 = v45
    v2.p1 = v7
    v1.p0 = v3
    v2.p1 = v15
    return v30
  }
  func f63(_ v0: s0) -> s0 {
    var v3: s0 = v0
    var v2: s0 = v0
    let v7: [[Double]] = v2.p1
    let v4: [[Double]] = v3.p1
    let v15: [[Double]] = v2.p0
    let v11: s0 = f80(v3)
    let v13: s0 = f80(v11)
    v2.p0 = v15
    v3.p0 = v15
    var v30: [[Double]] = v15
    let v59: s1 = s1(p0: v0, p1: v11)
    let v41: [[Double]] = v13.p1
    v2.p1 = v4
    v2.p0 = v30
    let v31: s0 = v59.p1
    let v21: s0 = f80(v31)
    let v36: [[Double]] = v21.p0
    v3.p1 = v7
    v2.p1 = v41
    v3.p1 = v41
    let v53: s0 = v59.p1
    let v89: s1 = f79(v59)
    var v70: s0 = v53
    let v43: s1 = f79(v89)
    let v141: s0 = v43.p0
    v70.p0 = v36
    v2 = v141
    return v70
  }
  func f46(_ v0: s0) -> s0 {
    var v1: s0 = v0
    let v7: s0 = f80(v1)
    let v3: s0 = f63(v7)
    var v2: s0 = v3
    var v5: s0 = v3
    let v8: [[Double]] = v7.p0
    let v11: [[Double]] = v5.p0
    let v9: [Double] = v11[0]
    v5.p0 = v8
    let v12: [[Double]] = v3.p0
    let v10: s1 = s1(p0: v5, p1: v0)
    let v16: [Double] = v8[1]
    let v14: s0 = v10.p1
    v1.p0 = v12
    let v25: [[Double]] = v7.p1
    var v34: [[Double]] = v25
    v1.p0 = v8
    var v21: s0 = v2
    var v32: [Double] = v9
    let v27: s0 = f80(v14)
    let v49: [[Double]] = v21.p1
    let v53: [[Double]] = v5.p0
    let v26: [[Double]] = v27.p0
    let v61: Double = v9[0]
    var v76: [[Double]] = v49
    var v72: [Double] = v16
    v5.p1 = v76
    v21.p0 = v53
    v72[0] = v61
    v34[0] = v72
    let v47: [Double] = v11[1]
    v21.p1 = v76
    v76[1] = v32
    v76[1] = v47
    let v84: s0 = s0(p0: v26, p1: v34)
    return v84
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v5: s0 = v0.p1
    var v6: s0 = v5
    var v11: s0 = v5
    let v9: s0 = v0.p1
    let v8: s0 = f46(v9)
    let v7: [[Double]] = v11.p1
    v11 = v6
    let v14: [Double] = v7[1]
    let v43: s0 = f63(v8)
    let v13: Double = v14[0]
    let v22: [[Double]] = v43.p1
    var v51: [[Double]] = v22
    v6.p1 = v51
    v11.p1 = v7
    var v29: Double = v13
    v6.p1 = v7
    return v29
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]))
    let v1: Double = 10.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 10.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
