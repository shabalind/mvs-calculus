  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  func f66(_ v0: Double) -> Double {
    var v5: Double = v0
    var v6: Double = v0
    var v7: Double = v6
    var v3: Double = v0
    var v9: Double = v0
    var v13: Double = v3
    var v8: Double = v9
    let v15: Double = v7 * v6
    var v4: Double = v15
    v5 = v4
    let v50: [Double] = [v5]
    var v53: Double = v0
    var v23: Double = v13
    v13 = v8
    let v34: Double = v50[0]
    let v28: [Double] = [v34, v7, v34, v23]
    v53 = v5
    var v64: [Double] = v28
    v6 = v53
    let v74: Double = v64[1]
    let v86: Double = v28[1]
    v64[3] = v0
    let v51: [Double] = [v86, v74]
    let v26: Double = v51[0]
    var v56: [Double] = v51
    var v90: [Double] = v56
    var v92: [Double] = v90
    v92[0] = v3
    var v93: [Double] = v92
    v92[1] = v7
    v93 = v51
    var v147: Double = v26
    v93[0] = v147
    let v229: Double = v93[1]
    return v229
  }
  func f11(_ v0: Double) -> Double {
    var v5: Double = v0
    var v2: Double = v0
    var v6: Double = v2
    var v4: Double = v5
    let v8: Double = f66(v0)
    let v1: Double = f66(v8)
    var v7: Double = v6
    let v3: Double = f66(v0)
    let v10: Double = f66(v3)
    var v18: Double = v7
    let v12: Double = f66(v6)
    var v22: Double = v12
    let v14: [Double] = [v22, v0, v7, v7, v12, v22]
    var v17: [Double] = v14
    var v28: Double = v18
    let v29: Double = v17[2]
    let v42: Double = f66(v28)
    let v25: Double = f66(v2)
    v5 = v10
    var v30: [Double] = v17
    var v21: Double = v8
    let v36: Double = v17[5]
    let v39: Double = v17[2]
    v30[2] = v29
    v17[5] = v42
    var v49: Double = v28
    let v117: Double = v30[0]
    let v101: Double = f66(v21)
    let v40: Double = f66(v25)
    let v54: Double = f66(v101)
    let v71: [Double] = [v4, v3, v1, v54, v39, v36, v7]
    var v64: [Double] = v71
    let v152: Double = f66(v54)
    v64[6] = v117
    v17[2] = v22
    let v111: Double = v64[2]
    v30[2] = v152
    let v157: Double = v40 / v111
    v5 = v49
    return v157
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [s2], _ v2: Double) -> Double {
    let v3: s0 = v0.p0
    let v6: [[Double]] = v3.p0
    let v11: Double = f11(v2)
    let v37: Double = f11(v2)
    let v18: [Double] = v6[0]
    var v33: [Double] = v18
    let v9: Double = f66(v37)
    v33[0] = v11
    let v26: Double = f11(v9)
    let v54: Double = f11(v26)
    let v49: Double = f66(v37)
    let v32: Double = v9 * v54
    let v122: Double = f66(v32)
    let v86: Double = v33[0]
    let v127: Double = f66(v49)
    let v149: Double = v86 * v122
    v33[0] = v127
    return v149
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]))
    let v1: [s2] = [s2(p0: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])), s2(p0: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]), p1: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])), s2(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), p1: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]))]
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
