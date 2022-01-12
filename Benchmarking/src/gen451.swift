  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  func f47(_ v0: s0) -> s0 {
    let v1: [[Double]] = v0.p0
    let v7: [Double] = v1[1]
    let v3: [[Double]] = v0.p0
    let v4: [[Double]] = v0.p1
    let v2: [[Double]] = v0.p1
    let v18: [[Double]] = v0.p1
    let v9: s0 = s0(p0: v1, p1: v4)
    let v16: [[Double]] = v9.p1
    var v14: s0 = v9
    let v30: s0 = s0(p0: v3, p1: v4)
    v14.p1 = v2
    v14.p0 = v3
    let v35: [[Double]] = v9.p0
    v14.p0 = v1
    var v19: [[Double]] = v1
    let v69: [Double] = v19[0]
    let v27: [[Double]] = v9.p0
    v14.p1 = v18
    v14.p0 = v19
    var v36: s0 = v30
    var v45: s0 = v30
    let v61: [[Double]] = v14.p1
    v14.p0 = v27
    let v49: s0 = s0(p0: v1, p1: v4)
    let v54: [[Double]] = v36.p1
    v14.p1 = v54
    v19[2] = v69
    v14.p1 = v2
    v36 = v45
    let v60: [[Double]] = v14.p0
    v14.p1 = v61
    let v43: [[Double]] = v49.p1
    v19[1] = v7
    let v82: [[Double]] = v36.p1
    v14.p1 = v61
    let v105: s0 = s0(p0: v60, p1: v16)
    v14.p0 = v35
    v45.p0 = v35
    v45.p0 = v19
    v36.p1 = v16
    v45.p1 = v82
    v14.p1 = v43
    return v105
  }
  func f35(_ v0: [s0], _ v1: s0) -> s0 {
    let v5: s0 = v0[0]
    let v6: s0 = f47(v5)
    let v4: s0 = f47(v6)
    return v4
  }
  func f27(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v3: [[Double]] = v0.p0
    let v5: [Double] = v3[0]
    let v7: s0 = f47(v4)
    var v6: [[Double]] = v3
    var v14: [[Double]] = v6
    v6[0] = v5
    v4.p0 = v14
    let v12: [[Double]] = v4.p1
    v14[1] = v5
    v4.p1 = v12
    let v10: [Double] = v6[1]
    v6[1] = v10
    let v20: [[Double]] = v7.p1
    v4.p1 = v20
    var v11: [[Double]] = v6
    var v23: [[Double]] = v20
    v4.p1 = v12
    var v47: [[Double]] = v23
    let v30: s0 = f47(v4)
    let v29: s0 = f47(v30)
    var v86: [[Double]] = v11
    v4.p1 = v47
    v4.p1 = v20
    var v21: [[Double]] = v86
    v4.p0 = v21
    let v28: s0 = f47(v29)
    v47[0] = v10
    v4.p1 = v12
    return v28
  }
  func f20(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p0
    var v3: s0 = v0
    var v1: s0 = v3
    let v2: s0 = f47(v1)
    v1.p0 = v7
    v1.p0 = v7
    return v2
  }
  func f9(_ v0: s0) -> s0 {
    let v5: s0 = f47(v0)
    let v2: [[Double]] = v5.p0
    let v1: [[Double]] = v0.p0
    var v6: [[Double]] = v2
    let v7: [Double] = v6[2]
    v6[0] = v7
    let v9: Double = v7[0]
    let v3: [[Double]] = v0.p1
    let v4: s0 = f47(v0)
    v6[1] = v7
    var v12: [[Double]] = v1
    let v11: [[Double]] = v5.p0
    let v8: s0 = f27(v4)
    let v15: [[Double]] = v8.p0
    let v10: s0 = f20(v8)
    let v14: s0 = f47(v4)
    let v13: s0 = f20(v10)
    var v21: [Double] = v7
    let v25: [[Double]] = v4.p0
    let v30: s0 = f20(v4)
    var v20: [[Double]] = v12
    let v23: [Double] = v11[1]
    let v17: s0 = f27(v13)
    let v19: [Double] = [v9, v9, v9, v9, v9]
    let v29: [Double] = v6[0]
    var v22: [[Double]] = v3
    v6[0] = v23
    let v34: s0 = f47(v30)
    var v24: [Double] = v19
    v20 = v25
    v20[1] = v23
    var v60: Double = v9
    let v58: s0 = f20(v5)
    var v33: [Double] = v19
    v21[0] = v9
    let v28: Double = v19[2]
    var v48: [[Double]] = v3
    let v59: s0 = f20(v34)
    let v95: [Double] = v15[2]
    let v73: Double = v60 * v60
    let v31: [[Double]] = v58.p0
    var v42: [[Double]] = v22
    var v26: [Double] = v33
    v12[2] = v23
    v33[3] = v28
    v20 = v2
    let v61: [[Double]] = v14.p1
    v26[0] = v60
    let v81: s0 = f27(v17)
    let v39: [Double] = v3[0]
    let v55: [Double] = v3[0]
    v48[0] = v7
    v60 = v28
    v6[2] = v95
    let v72: [Double] = v20[0]
    v12[2] = v21
    v21[0] = v28
    let v98: [Double] = v48[0]
    let v63: Double = v24[3]
    var v64: [[Double]] = v61
    let v38: [[Double]] = v30.p0
    var v41: Double = v63
    v48[0] = v55
    let v66: [Double] = v31[2]
    var v86: [[Double]] = v38
    v42[0] = v98
    v64[0] = v66
    var v108: [Double] = v26
    v21[0] = v41
    let v121: s0 = f20(v59)
    let v143: [[Double]] = v81.p1
    v48 = v143
    var v83: s0 = v121
    v83.p0 = v31
    v64[0] = v72
    v83.p1 = v42
    v24[1] = v73
    v83.p0 = v20
    v20 = v2
    let v196: [[Double]] = v8.p1
    v64[0] = v39
    v83.p1 = v196
    v20[2] = v29
    v83.p0 = v86
    v83.p1 = v64
    v24 = v108
    let v214: s0 = f27(v83)
    return v214
  }
  func f1(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p0
    let v6: s0 = f47(v0)
    let v5: [[Double]] = v6.p1
    var v8: [[Double]] = v3
    let v51: s0 = s0(p0: v8, p1: v5)
    return v51
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s1, _ v2: s0, _ v3: Double) -> Double {
    let v6: [[s0]] = v1.p0
    var v4: s0 = v2
    let v8: [[Double]] = v4.p0
    let v16: s0 = f1(v2)
    let v9: [Double] = v8[0]
    let v14: [s0] = v6[0]
    let v29: [[Double]] = v16.p1
    let v18: s0 = f35(v14, v2)
    let v22: [[Double]] = v2.p1
    v4.p1 = v29
    let v35: [[Double]] = v2.p0
    let v30: Double = v9[0]
    let v59: s0 = f9(v4)
    v4.p0 = v35
    let v20: [[Double]] = v18.p0
    v4.p0 = v20
    v4.p1 = v29
    let v36: [Double] = v22[0]
    let v46: Double = v36[0]
    v4.p0 = v8
    v4.p0 = v35
    let v70: Double = v3 - v30
    v4 = v59
    let v106: Double = v46 - v70
    return v106
  }
  func benchmark() {
    let v0: s1 = s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])]], p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])])
    let v1: s1 = s1(p0: [[s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])]], p1: [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])])
    let v2: s0 = s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])
    let v3: Double = 28.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 28.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
