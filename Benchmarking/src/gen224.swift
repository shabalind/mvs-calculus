  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f41(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p0
    let v7: [Double] = v5[0]
    let v9: [[Double]] = v0.p1
    let v1: [[Double]] = v0.p0
    let v12: [Double] = v5[0]
    let v16: [[Double]] = v0.p0
    let v10: [Double] = v1[0]
    let v13: [[Double]] = v0.p1
    var v17: [[Double]] = v1
    let v21: [[Double]] = v0.p0
    var v15: s0 = v0
    let v32: [[Double]] = v15.p1
    v15.p0 = v5
    v15.p1 = v13
    v17[0] = v12
    v15.p1 = v32
    let v23: [[Double]] = v0.p0
    v17[0] = v10
    let v45: [[Double]] = v0.p1
    let v30: [Double] = v45[0]
    var v28: [[Double]] = v13
    v15.p0 = v21
    v17[0] = v30
    v15.p0 = v21
    v15.p0 = v17
    let v38: s1 = s1(p0: v15, p1: v15)
    let v84: s0 = v38.p0
    var v68: s0 = v0
    let v47: [Double] = v5[0]
    var v76: s0 = v15
    v28[0] = v47
    v76.p0 = v17
    v17[0] = v30
    v17[0] = v7
    let v67: [Double] = v23[0]
    let v35: [Double] = v13[0]
    v15.p0 = v16
    let v46: s1 = s1(p0: v68, p1: v76)
    v15 = v76
    let v112: s0 = v46.p1
    v28[0] = v67
    v76.p1 = v9
    v68.p0 = v5
    var v78: s1 = v38
    v76.p1 = v28
    v76 = v112
    v17[0] = v35
    v78.p1 = v84
    let v136: s0 = v78.p0
    return v136
  }
  func f35(_ v0: s0) -> s0 {
    let v3: [s0] = [v0, v0, v0]
    let v5: s0 = v3[0]
    let v8: s1 = s1(p0: v5, p1: v5)
    let v11: s0 = v8.p0
    let v28: s0 = f41(v11)
    return v28
  }
  func f27(_ v0: s1, _ v1: s1) -> s1 {
    var v3: s1 = v1
    return v3
  }
  func f12(_ v0: [s1]) -> [s1] {
    let v4: s1 = v0[2]
    let v7: s0 = v4.p0
    let v3: s0 = f41(v7)
    let v2: s1 = v0[1]
    var v6: s1 = v2
    var v11: s1 = v4
    var v5: [s1] = v0
    let v9: s0 = f41(v3)
    let v18: s0 = v6.p1
    let v1: s1 = v5[2]
    v11.p0 = v9
    v5[1] = v2
    let v22: s0 = v4.p1
    v5[0] = v6
    let v14: s1 = f27(v4, v6)
    var v29: s0 = v3
    v5[1] = v1
    let v23: s1 = s1(p0: v7, p1: v22)
    let v25: s1 = f27(v2, v23)
    v5[0] = v25
    var v30: s1 = v2
    v5[0] = v14
    v11.p0 = v9
    v5[2] = v1
    v30.p0 = v29
    let v77: s0 = v11.p0
    v5[2] = v30
    var v41: [s1] = v0
    let v73: s1 = v5[2]
    v6.p0 = v18
    v41[1] = v6
    v6.p0 = v77
    let v64: [[s1]] = [v5, v41, v0, v5, v0, v0]
    let v72: s1 = v0[0]
    v6.p1 = v22
    v5[2] = v73
    v41[0] = v72
    v41[2] = v25
    let v85: [s1] = v64[1]
    return v85
  }
  func f10(_ v0: s0) -> s0 {
    var v7: s0 = v0
    var v8: s0 = v7
    let v4: s0 = f35(v8)
    let v3: s0 = f35(v8)
    var v5: s0 = v7
    let v2: [[Double]] = v0.p1
    let v13: [[[Double]]] = [v2, v2, v2, v2]
    let v1: [[Double]] = v7.p1
    v8.p1 = v1
    var v9: [[[Double]]] = v13
    let v21: s0 = f41(v5)
    v7.p1 = v2
    let v20: [[Double]] = v7.p1
    let v17: [[Double]] = v21.p0
    v9[2] = v1
    let v23: [[Double]] = v7.p0
    let v25: [[Double]] = v7.p0
    v9[0] = v2
    let v58: [[Double]] = v4.p1
    var v28: [[[Double]]] = v9
    v7 = v21
    v28[3] = v2
    v28[1] = v20
    let v19: [[Double]] = v28[1]
    let v37: s0 = f41(v3)
    let v27: s0 = f35(v21)
    v28[0] = v2
    v8 = v3
    let v29: [[Double]] = v37.p0
    var v42: s0 = v27
    v8.p1 = v19
    v28[3] = v19
    let v84: s0 = f35(v42)
    v8.p0 = v29
    v9[3] = v58
    let v39: [[Double]] = v84.p0
    let v81: s0 = f35(v37)
    v5 = v4
    let v69: [[Double]] = v3.p0
    v8.p0 = v29
    v28[0] = v19
    let v66: [[Double]] = v81.p1
    let v82: [[[Double]]] = [v39, v25, v69, v23, v17]
    let v77: [[Double]] = v82[1]
    let v93: s0 = s0(p0: v77, p1: v66)
    return v93
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v5: [s1] = f12(v0)
    let v6: [s1] = f12(v0)
    let v3: s1 = v0[0]
    let v7: s1 = v0[1]
    var v4: s1 = v7
    v4 = v7
    let v8: s1 = v0[0]
    var v12: [s1] = v5
    v12[1] = v7
    let v19: s1 = v0[1]
    let v11: s0 = v8.p0
    let v22: s0 = v4.p1
    let v13: s0 = f35(v22)
    let v17: s1 = v12[2]
    var v43: s0 = v13
    v4.p1 = v11
    let v31: s0 = f10(v22)
    let v55: [[Double]] = v43.p0
    v4.p0 = v31
    let v54: s0 = f41(v22)
    let v28: [[Double]] = v43.p1
    var v51: [[Double]] = v28
    let v91: [Double] = v55[0]
    let v47: s0 = v17.p0
    var v96: [Double] = v91
    let v143: s1 = v6[1]
    v43.p1 = v51
    v4.p0 = v13
    let v66: s1 = f27(v143, v19)
    let v140: [[Double]] = v54.p0
    let v132: [[Double]] = v47.p1
    let v120: [Double] = v140[0]
    let v112: [Double] = v140[0]
    v51[1] = v112
    let v173: s0 = v66.p0
    v51[0] = v120
    let v105: Double = v96[0]
    v4.p1 = v173
    v12[2] = v3
    v4.p0 = v54
    v43.p1 = v132
    let v165: [[Double]] = v173.p0
    v43.p0 = v165
    v4.p1 = v173
    return v105
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s0(p0: [[3.0]], p1: [[4.0], [5.0]])), s1(p0: s0(p0: [[6.0]], p1: [[7.0], [8.0]]), p1: s0(p0: [[9.0]], p1: [[10.0], [11.0]])), s1(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0]]), p1: s0(p0: [[15.0]], p1: [[16.0], [17.0]]))]
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
