  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  func f9(_ v0: s0) -> s0 {
    var v1: s0 = v0
    var v7: s0 = v1
    var v8: s0 = v0
    var v3: s0 = v8
    let v11: [[Double]] = v3.p1
    let v10: [[Double]] = v3.p1
    var v4: s0 = v7
    let v9: [Double] = v10[0]
    let v18: [Double] = v11[2]
    let v16: [[Double]] = v0.p0
    var v35: [Double] = v9
    let v27: [[Double]] = v8.p1
    var v15: [[Double]] = v16
    v15[0] = v35
    let v13: s0 = s0(p0: v16, p1: v27)
    let v22: [Double] = v15[0]
    var v17: s0 = v4
    v15[0] = v22
    v15[0] = v18
    var v19: [[Double]] = v16
    let v28: Double = v9[0]
    let v20: Double = v35[0]
    var v30: [[Double]] = v15
    let v23: [s0] = [v4, v7, v13, v17, v8, v3]
    var v57: [s0] = v23
    let v43: [[Double]] = v13.p1
    var v48: [s0] = v57
    let v21: [[[Double]]] = [v30, v15, v16, v30, v16, v19, v16]
    v57[3] = v1
    let v79: [[Double]] = v13.p1
    v3.p0 = v30
    let v58: [[Double]] = v17.p0
    let v46: s0 = s0(p0: v30, p1: v11)
    v4.p1 = v10
    v15 = v19
    let v53: [[Double]] = v1.p0
    v57[2] = v0
    let v121: [[[Double]]] = [v58]
    v8.p1 = v79
    v4.p0 = v53
    v1.p1 = v43
    var v76: [[Double]] = v27
    let v44: [[Double]] = v4.p1
    let v71: [Double] = v76[2]
    let v78: [[Double]] = v121[0]
    let v113: s0 = v57[2]
    v30[0] = v71
    var v64: Double = v28
    v17.p0 = v78
    v3.p0 = v53
    let v110: Double = v64 / v20
    let v66: s0 = v48[1]
    v7.p1 = v79
    var v62: Double = v110
    v35[0] = v62
    let v215: [[Double]] = v3.p0
    let v90: [[Double]] = v66.p0
    v3.p0 = v15
    v17 = v46
    let v183: [[Double]] = v113.p1
    var v219: s0 = v8
    v4.p0 = v215
    let v204: [[Double]] = v21[0]
    v4.p0 = v15
    let v173: [[Double]] = v219.p1
    v219.p0 = v204
    v3.p1 = v183
    let v178: s0 = s0(p0: v90, p1: v44)
    v3.p1 = v173
    v8.p1 = v11
    v3.p1 = v11
    return v178
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: [s2], _ v2: Double) -> Double {
    var v7: Double = v2
    let v12: Double = v7 * v7
    let v3: s2 = v1[0]
    let v16: [s0] = v3.p1
    var v8: Double = v12
    let v20: s0 = v16[0]
    let v93: s0 = f9(v20)
    let v99: [[Double]] = v93.p0
    let v70: [Double] = v99[0]
    var v85: [Double] = v70
    var v89: Double = v8
    let v81: Double = v85[0]
    let v88: Double = v89 + v2
    var v91: Double = v2
    let v378: Double = v88 - v12
    let v152: [Double] = [v91, v378, v12, v378, v81, v81, v12]
    var v301: [Double] = v152
    let v150: Double = v301[6]
    return v150
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])]), s2(p0: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p1: [s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])]), s2(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])])]
    let v1: [s2] = [s2(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), p1: [s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])])]
    let v2: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
