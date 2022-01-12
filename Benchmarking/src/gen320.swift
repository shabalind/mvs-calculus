  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s4 {
    var p0: s0
    var p1: s0
  }
  func f105(_ v0: s4) -> s4 {
    let v7: s0 = v0.p1
    var v6: s0 = v7
    var v21: s4 = v0
    v21.p1 = v6
    return v21
  }
  func f72(_ v0: s0) -> s0 {
    let v1: [Double] = v0.p1
    let v5: [Double] = v0.p1
    let v6: [[Double]] = v0.p0
    let v2: [Double] = v6[1]
    let v8: [Double] = v0.p1
    let v4: Double = v5[1]
    var v7: [[Double]] = v6
    let v10: Double = v8[1]
    var v12: [[Double]] = v6
    var v13: [Double] = v2
    let v9: Double = v2[0]
    let v11: [[Double]] = v0.p0
    var v15: [Double] = v1
    var v19: [Double] = v8
    let v34: [s0] = [v0, v0]
    let v14: [Double] = v7[0]
    let v21: [Double] = v0.p1
    v13[0] = v4
    let v24: s0 = v34[1]
    let v17: Double = v13[0]
    v15[1] = v10
    let v41: [[Double]] = v0.p0
    let v25: s0 = v34[1]
    var v36: Double = v10
    let v45: [[Double]] = v24.p0
    v15[1] = v17
    let v35: [Double] = v11[2]
    var v73: [s0] = v34
    let v60: Double = v2[0]
    var v37: s0 = v25
    var v51: [[Double]] = v45
    let v44: s0 = v73[0]
    v15[1] = v17
    var v66: [Double] = v35
    v73 = v34
    var v136: s0 = v37
    v136.p0 = v11
    v15[1] = v4
    v37.p0 = v51
    v19[1] = v36
    v136.p1 = v15
    var v47: [Double] = v2
    v12[2] = v14
    var v99: [Double] = v14
    let v86: [Double] = v44.p1
    v37.p0 = v51
    let v104: [[Double]] = [v19, v21, v19, v15, v21]
    v66[0] = v9
    v37.p1 = v86
    let v174: [[Double]] = [v14, v2, v66, v47, v2, v99, v14]
    let v133: [Double] = v174[4]
    v136.p0 = v41
    let v124: [Double] = v104[3]
    v37.p1 = v124
    v7[1] = v133
    v37.p0 = v12
    let v134: [Double] = v11[2]
    v12[0] = v134
    v13[0] = v60
    return v136
  }
  func f63(_ v0: s0) -> s0 {
    let v1: s0 = f72(v0)
    let v4: s0 = f72(v0)
    let v9: s0 = f72(v0)
    let v20: s0 = f72(v1)
    let v42: s0 = f72(v20)
    let v25: s4 = s4(p0: v1, p1: v9)
    let v54: s4 = f105(v25)
    var v73: s4 = v54
    let v134: s4 = f105(v73)
    var v81: s4 = v73
    v81.p1 = v9
    let v60: s0 = v134.p1
    v73.p0 = v60
    v81.p1 = v60
    let v103: s0 = v81.p1
    v73.p0 = v42
    v81.p1 = v4
    return v103
  }
  func f14(_ v0: Double) -> Double {
    var v1: Double = v0
    var v4: Double = v0
    var v6: Double = v0
    var v14: Double = v6
    let v9: Double = v1 * v4
    var v19: Double = v0
    var v10: Double = v6
    var v12: Double = v6
    let v17: [Double] = [v14, v9]
    v14 = v6
    let v21: Double = v17[1]
    let v13: [Double] = [v4, v12]
    let v72: Double = v17[1]
    let v27: Double = v13[0]
    let v67: [[Double]] = [v17, v13]
    var v36: [Double] = v13
    var v41: [[Double]] = v67
    v6 = v27
    v36[1] = v72
    var v77: [Double] = v13
    let v59: [[Double]] = [v77, v13, v17, v36, v13, v36]
    let v45: [[Double]] = [v36, v13, v13]
    var v51: [Double] = v17
    v41[1] = v51
    var v66: [[Double]] = v41
    v77[0] = v27
    v51[0] = v21
    v66[1] = v77
    v77[1] = v6
    v77 = v13
    v66[1] = v77
    v66[1] = v17
    var v58: [[Double]] = v59
    let v149: [Double] = v58[0]
    var v78: [[Double]] = v45
    var v39: [[Double]] = v67
    let v64: [Double] = v78[0]
    let v126: Double = v149[0]
    v4 = v10
    v36[0] = v19
    v41 = v39
    let v115: [Double] = v66[1]
    v51[1] = v4
    var v91: [Double] = v115
    v41[0] = v64
    v39[1] = v91
    v41[0] = v64
    v58[3] = v91
    return v126
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v3: s0 = f72(v0)
    let v5: [Double] = v3.p1
    let v7: [[Double]] = v0.p0
    let v6: Double = f14(v1)
    let v2: [Double] = v7[2]
    let v9: Double = v6 - v1
    let v10: Double = v5[1]
    let v4: s0 = f63(v0)
    let v11: [[Double]] = v4.p0
    var v17: [Double] = v2
    var v21: [Double] = v17
    v21 = v17
    v21[0] = v10
    let v27: Double = f14(v9)
    let v18: Double = v2[0]
    var v29: [[Double]] = v11
    v29[2] = v21
    v21[0] = v27
    v17[0] = v18
    let v41: Double = v21[0]
    let v55: [Double] = v29[2]
    let v124: Double = v55[0]
    v21[0] = v124
    return v41
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [3.0, 4.0])
    let v1: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
