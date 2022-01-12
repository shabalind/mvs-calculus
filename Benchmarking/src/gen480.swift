  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f38(_ v0: s0) -> s0 {
    let v1: [[Double]] = v0.p1
    let v2: [[[Double]]] = [v1, v1, v1, v1]
    var v4: [[[Double]]] = v2
    let v3: [[Double]] = v2[1]
    let v13: [[Double]] = v0.p0
    var v9: [[[Double]]] = v2
    let v12: [[Double]] = v0.p0
    let v15: [[Double]] = v4[1]
    v4 = v2
    let v16: s0 = s0(p0: v15, p1: v13)
    var v81: [[[Double]]] = v2
    let v19: [[Double]] = v81[3]
    v4[0] = v12
    let v35: [[Double]] = v16.p1
    var v27: s0 = v16
    v4[2] = v19
    var v29: s0 = v27
    let v51: [[Double]] = v27.p1
    let v36: [[Double]] = v9[0]
    let v71: [[Double]] = v29.p1
    let v46: [[Double]] = v9[3]
    v29.p1 = v3
    v27.p1 = v51
    v29.p0 = v46
    v29.p0 = v71
    v29.p1 = v35
    v27.p0 = v36
    v29.p1 = v46
    v4[2] = v19
    return v29
  }
  func f1(_ v0: [s0]) -> [s0] {
    var v2: [s0] = v0
    let v6: s0 = v2[2]
    let v5: [[Double]] = v6.p0
    var v3: s0 = v6
    let v7: [Double] = v5[1]
    let v1: [[Double]] = v3.p1
    var v8: [[Double]] = v5
    v3.p1 = v8
    let v19: s0 = f38(v6)
    let v42: s0 = f38(v19)
    let v4: [[Double]] = v3.p0
    let v9: s0 = f38(v6)
    let v13: s0 = f38(v3)
    let v10: [[Double]] = [v7]
    var v11: [Double] = v7
    v8[1] = v11
    var v18: [[Double]] = v1
    var v14: [[Double]] = v10
    v8[1] = v11
    var v23: [[Double]] = v14
    let v17: [Double] = v23[0]
    let v21: s0 = f38(v13)
    let v22: s0 = f38(v6)
    let v26: [[Double]] = v3.p1
    v3.p0 = v4
    v3.p0 = v18
    let v43: [[Double]] = v21.p1
    let v30: [[Double]] = v21.p0
    v3.p0 = v30
    v3.p0 = v4
    let v20: [[Double]] = v9.p0
    var v33: [[Double]] = v14
    v3.p1 = v20
    v2[2] = v42
    v3.p0 = v26
    v33 = v14
    v3.p0 = v5
    let v44: [[Double]] = v3.p1
    let v51: [[Double]] = v3.p1
    var v63: [s0] = v0
    v18[0] = v11
    let v49: [[Double]] = v3.p0
    let v52: [[Double]] = v42.p1
    let v85: s0 = f38(v22)
    let v73: s0 = s0(p0: v51, p1: v49)
    let v104: s0 = f38(v9)
    var v75: [[Double]] = v30
    let v94: [[Double]] = v42.p0
    v3.p0 = v75
    v63[2] = v73
    v3.p1 = v51
    let v76: [Double] = v33[0]
    let v74: s0 = f38(v85)
    v33[0] = v17
    var v84: [[Double]] = v52
    let v45: [[Double]] = v19.p0
    let v71: [Double] = v26[1]
    v3.p0 = v26
    v3.p0 = v45
    let v193: [[Double]] = v104.p0
    v3.p1 = v94
    v3.p0 = v43
    v3.p0 = v26
    v3.p1 = v44
    let v259: [[Double]] = v42.p1
    v3.p0 = v193
    v84[2] = v71
    let v120: [Double] = v259[2]
    let v148: [[Double]] = v74.p1
    v3.p1 = v148
    v75[1] = v120
    var v126: [s0] = v63
    v3.p1 = v84
    v8[1] = v76
    return v126
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    var v3: s1 = v0
    var v5: s1 = v3
    let v13: [s0] = v3.p1
    let v4: s0 = v13[0]
    let v10: s0 = f38(v4)
    var v9: [s0] = v13
    v5.p1 = v13
    let v14: [s0] = v3.p1
    let v8: s0 = f38(v4)
    let v11: [s0] = v0.p0
    let v12: [s0] = f1(v11)
    let v15: s0 = v11[2]
    v3.p1 = v9
    v5.p1 = v13
    v9[0] = v10
    let v30: s0 = v14[0]
    var v22: s0 = v15
    var v45: [s0] = v12
    let v39: [s0] = v5.p1
    let v41: [s0] = v3.p0
    v3.p0 = v12
    let v40: s0 = f38(v22)
    let v32: s0 = f38(v40)
    let v33: s0 = v41[2]
    let v28: [[Double]] = v30.p1
    let v54: s0 = v45[2]
    let v42: [Double] = v28[0]
    let v35: [[Double]] = v8.p0
    v3.p1 = v39
    v22.p0 = v28
    v45[0] = v8
    var v57: [Double] = v42
    v9[0] = v33
    let v96: s0 = f38(v22)
    v57[0] = v1
    let v89: [[Double]] = v54.p1
    var v77: [[Double]] = v89
    let v46: [[Double]] = v32.p1
    let v47: [Double] = v46[2]
    v3.p0 = v45
    var v212: [Double] = v57
    let v59: [Double] = v77[2]
    v22.p1 = v35
    v77[0] = v47
    v77[2] = v212
    var v121: [[Double]] = v89
    v57[0] = v1
    let v151: Double = v59[0]
    v22.p1 = v121
    v3.p1 = v14
    v9[0] = v96
    v77[0] = v47
    return v151
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])], p1: [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])])
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
