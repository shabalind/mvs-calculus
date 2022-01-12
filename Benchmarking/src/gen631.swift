  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
    var p2: [[s0]]
    var p3: s0
  }
  struct s3 {
    var p0: [[s0]]
  }
  func f84(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p0
    let v2: [[Double]] = v0.p1
    let v6: [[Double]] = v0.p0
    var v3: s0 = v0
    v3 = v0
    let v1: [Double] = v2[1]
    v3.p0 = v6
    var v11: [[Double]] = v6
    v3.p1 = v2
    let v13: [Double] = v2[0]
    v11[0] = v13
    v3.p0 = v5
    let v25: [[Double]] = v3.p0
    let v14: [[Double]] = v3.p1
    let v16: [Double] = v2[2]
    var v18: s0 = v3
    let v36: [Double] = v6[0]
    v11[0] = v13
    var v33: [[Double]] = v25
    v3 = v0
    let v32: [Double] = v25[0]
    let v51: [[Double]] = v3.p1
    v3.p0 = v11
    v3 = v18
    var v42: [[Double]] = v51
    var v67: s0 = v3
    v11[0] = v16
    var v35: [[Double]] = v33
    var v94: [[Double]] = v11
    let v44: [[Double]] = v18.p0
    v3.p1 = v2
    let v45: [[Double]] = v3.p1
    v3.p0 = v6
    v18.p0 = v25
    v18.p1 = v42
    v67.p0 = v11
    let v77: [[Double]] = v0.p1
    v3.p1 = v77
    v35[0] = v36
    v18.p0 = v6
    v3.p1 = v77
    v67.p1 = v45
    v67.p1 = v14
    let v92: [[Double]] = v3.p0
    let v52: [Double] = v35[0]
    v3.p0 = v92
    var v97: [[Double]] = v14
    v67 = v3
    let v145: [[Double]] = v0.p1
    v94[0] = v32
    v18.p1 = v97
    let v74: [[Double]] = v18.p1
    v67.p1 = v74
    v11[0] = v52
    v42[0] = v1
    v18.p0 = v94
    let v85: [[Double]] = v3.p1
    let v79: [[Double]] = v18.p0
    v18.p1 = v145
    let v169: [[Double]] = v3.p0
    var v189: s0 = v67
    v67.p0 = v5
    v189.p1 = v14
    v3.p0 = v79
    let v174: [Double] = v169[0]
    var v228: [[Double]] = v74
    v3.p1 = v85
    v11[0] = v174
    v18.p1 = v228
    v3.p0 = v44
    return v189
  }
  func f65(_ v0: s0, _ v1: s0) -> s0 {
    let v2: [[Double]] = v0.p1
    let v4: [[Double]] = v1.p0
    let v6: [[Double]] = v1.p0
    let v3: [[Double]] = v0.p1
    let v10: [[Double]] = v0.p1
    let v7: [Double] = v4[0]
    var v9: [[Double]] = v10
    let v11: s0 = s0(p0: v6, p1: v9)
    let v17: s0 = s0(p0: v4, p1: v10)
    v9[0] = v7
    let v16: [[Double]] = v1.p0
    v9 = v3
    let v26: [[Double]] = v17.p0
    let v51: [[Double]] = v0.p0
    var v24: s0 = v1
    v24.p0 = v16
    let v34: [Double] = v2[0]
    var v36: s0 = v24
    v9[1] = v34
    v36.p1 = v10
    var v45: s0 = v36
    let v39: s0 = s0(p0: v51, p1: v2)
    v24.p1 = v2
    let v48: [[Double]] = v39.p1
    let v85: s0 = f84(v11)
    let v137: [[Double]] = v85.p0
    v24.p0 = v137
    v45.p0 = v137
    v36.p1 = v2
    let v59: [[Double]] = v45.p0
    v36.p1 = v9
    v45.p1 = v48
    var v178: s0 = v1
    v178.p0 = v59
    v45.p1 = v3
    v24.p0 = v26
    v178.p1 = v9
    v178.p1 = v48
    let v242: s0 = f84(v178)
    return v242
  }
  func f45(_ v0: s0, _ v1: s0) -> s0 {
    let v2: [[Double]] = v0.p0
    let v3: s0 = f65(v1, v1)
    let v5: [[Double]] = v0.p1
    let v6: s0 = s0(p0: v2, p1: v5)
    var v10: s0 = v0
    let v9: [[Double]] = v3.p0
    v10.p0 = v9
    let v13: s0 = f84(v1)
    let v12: [[Double]] = v13.p1
    v10.p1 = v12
    v10.p1 = v5
    v10.p0 = v9
    let v42: [[Double]] = v6.p0
    v10.p1 = v5
    v10.p0 = v2
    var v29: s0 = v3
    v10.p0 = v42
    let v23: s0 = f65(v10, v29)
    return v23
  }
  func f40(_ v0: s0, _ v1: s3) -> s0 {
    var v3: s0 = v0
    let v2: s0 = f45(v3, v0)
    let v11: s0 = f45(v3, v2)
    let v4: s0 = f45(v3, v2)
    let v12: [[Double]] = v3.p0
    let v10: [Double] = v12[0]
    let v16: [Double] = v12[0]
    var v13: s0 = v3
    v3 = v0
    var v14: [[Double]] = v12
    var v33: [Double] = v16
    v14[0] = v16
    let v17: [[Double]] = v3.p1
    let v25: [Double] = v17[0]
    v3.p0 = v14
    v14[0] = v16
    let v26: [[Double]] = v13.p1
    let v29: [Double] = v12[0]
    let v20: Double = v29[0]
    let v37: [[Double]] = v2.p0
    let v31: [[Double]] = v4.p1
    let v57: s0 = f65(v0, v3)
    v14[0] = v25
    let v71: s0 = f45(v11, v13)
    v13.p1 = v31
    var v123: [[Double]] = v26
    v123[0] = v29
    var v101: s0 = v71
    v33[0] = v20
    v14[0] = v10
    var v139: s0 = v13
    v139 = v13
    v13.p1 = v123
    v139.p0 = v12
    let v116: s0 = f45(v57, v139)
    v14[0] = v33
    let v175: [[Double]] = v101.p1
    v101.p0 = v37
    v139.p1 = v175
    return v116
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: s0, _ v2: s1, _ v3: Double) -> Double {
    var v13: s3 = v0
    var v16: s0 = v1
    let v49: [[s0]] = v13.p0
    let v38: s0 = f40(v16, v13)
    let v47: s0 = f65(v38, v1)
    v13.p0 = v49
    let v77: [[Double]] = v47.p1
    let v32: [Double] = v77[0]
    let v63: Double = v32[0]
    return v63
  }
  func benchmark() {
    let v0: s3 = s3(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])], [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]])
    let v1: s0 = s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])
    let v2: s1 = s1(p0: [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]), p2: [[s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])], [s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])]], p3: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]))
    let v3: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
