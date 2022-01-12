  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [[s1]]
    var p1: s0
  }
  struct s4 {
    var p0: [[s0]]
    var p1: s2
  }
  struct s6 {
    var p0: [s1]
    var p1: s4
  }
  struct s8 {
    var p0: [s0]
    var p1: [[s1]]
  }
  struct s9 {
    var p0: [[s8]]
    var p1: s6
  }
  func f55(_ v0: s6, _ v1: s8) -> s6 {
    let v6: [s1] = v0.p0
    let v12: [[s1]] = v1.p1
    let v14: s4 = v0.p1
    let v25: s2 = v14.p1
    let v34: [s1] = v12[0]
    let v24: s6 = s6(p0: v6, p1: v14)
    let v32: [[s1]] = v25.p0
    let v59: [s1] = v32[0]
    var v22: s6 = v24
    var v67: s6 = v0
    v67 = v22
    var v40: [s1] = v59
    v22.p1 = v14
    v40 = v34
    v22 = v0
    v22.p0 = v40
    v67.p1 = v14
    return v67
  }
  func f46(_ v0: [s8]) -> [s8] {
    let v3: s8 = v0[0]
    var v2: [s8] = v0
    v2[0] = v3
    var v4: [s8] = v0
    let v7: s8 = v0[0]
    v2[0] = v7
    let v8: s8 = v4[0]
    v2[0] = v7
    v2[0] = v8
    v2[0] = v3
    v4[0] = v8
    let v74: s8 = v2[0]
    v4[0] = v74
    return v2
  }
  func f21(_ v0: s0, _ v1: s0) -> s0 {
    let v6: [[Double]] = v0.p0
    let v9: s1 = s1(p0: v1, p1: v0)
    var v2: [[Double]] = v6
    let v3: s0 = v9.p1
    let v13: [[Double]] = v3.p0
    let v18: s0 = v9.p0
    let v5: [[[Double]]] = [v2, v6, v13, v13]
    var v11: s1 = v9
    let v8: [[Double]] = v0.p0
    let v14: [[Double]] = v18.p0
    v11.p0 = v1
    let v7: [[Double]] = v5[3]
    let v10: [Double] = v8[1]
    let v69: s0 = v11.p1
    v11.p1 = v69
    var v26: s0 = v18
    v2[0] = v10
    let v31: [[Double]] = v69.p1
    v26 = v1
    var v34: s1 = v9
    v26.p1 = v31
    let v57: s0 = v11.p0
    let v44: [Double] = v14[1]
    let v62: s0 = v34.p1
    let v40: [[Double]] = v0.p1
    v2[0] = v44
    v34.p0 = v26
    var v43: [[Double]] = v31
    var v64: s1 = v9
    v11.p1 = v57
    v11.p1 = v62
    v26.p1 = v40
    v43 = v40
    v64.p0 = v57
    let v80: s0 = s0(p0: v7, p1: v43)
    v11 = v64
    return v80
  }
  func f4(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p1
    let v13: s0 = f21(v0, v0)
    let v7: [[Double]] = v0.p1
    let v1: [Double] = v4[0]
    let v16: [Double] = v7[0]
    var v15: [[Double]] = v7
    let v8: s1 = s1(p0: v0, p1: v13)
    let v9: s0 = f21(v0, v13)
    let v10: s0 = f21(v13, v13)
    let v20: [Double] = v15[0]
    v15[0] = v1
    let v14: s0 = v8.p1
    let v42: s0 = f21(v13, v9)
    v15[0] = v1
    let v35: s0 = v8.p0
    var v26: s0 = v9
    let v29: [Double] = v7[0]
    let v25: [Double] = v15[0]
    var v54: s0 = v14
    var v22: s0 = v35
    v15[0] = v16
    let v73: s0 = f21(v42, v13)
    let v38: s0 = v8.p0
    v15[0] = v29
    let v72: [s0] = [v38, v26, v73, v10, v35, v35]
    v54.p1 = v4
    v15[0] = v25
    let v61: s0 = f21(v22, v14)
    v26.p1 = v4
    v22.p1 = v4
    let v36: [[Double]] = v26.p1
    v15[0] = v20
    v22 = v54
    v54.p1 = v4
    v15[0] = v16
    let v116: s0 = v72[5]
    v26.p1 = v15
    let v308: s0 = f21(v61, v116)
    var v80: s0 = v10
    v22.p1 = v36
    v54 = v80
    return v308
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: Double) -> Double {
    var v10: s9 = v0
    let v3: [[s8]] = v10.p0
    let v5: [s8] = v3[0]
    let v12: s8 = v5[0]
    let v8: [s0] = v12.p0
    var v9: s9 = v10
    var v18: [[s8]] = v3
    var v15: [[s8]] = v18
    var v19: [s0] = v8
    let v11: [s8] = f46(v5)
    v9 = v0
    let v33: s0 = v19[0]
    var v20: s9 = v10
    v20.p0 = v15
    v15[1] = v5
    let v34: s0 = f4(v33)
    let v28: [s8] = v18[0]
    let v35: [[Double]] = v34.p0
    let v56: [s8] = v15[0]
    let v30: [[s8]] = v0.p0
    v9.p0 = v30
    let v26: s0 = f21(v34, v33)
    let v16: [s8] = f46(v5)
    v19[0] = v26
    v15[1] = v56
    let v63: s6 = v9.p1
    v10.p0 = v18
    v18 = v15
    let v103: [Double] = v35[0]
    v10 = v9
    let v49: [s8] = f46(v28)
    let v73: s6 = v20.p1
    let v58: s6 = f55(v73, v12)
    v18[0] = v28
    v18[0] = v16
    v9.p1 = v58
    v15[0] = v49
    v15[0] = v16
    v15[1] = v28
    v18[0] = v11
    v10.p1 = v63
    let v231: Double = v103[0]
    return v231
  }
  func benchmark() {
    let v0: s9 = s9(p0: [[s8(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: [[s1(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]]))]])], [s8(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0]])], p1: [[s1(p0: s0(p0: [[18.0], [19.0]], p1: [[20.0]]), p1: s0(p0: [[21.0], [22.0]], p1: [[23.0]]))]])]], p1: s6(p0: [s1(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0]]), p1: s0(p0: [[27.0], [28.0]], p1: [[29.0]]))], p1: s4(p0: [[s0(p0: [[30.0], [31.0]], p1: [[32.0]])], [s0(p0: [[33.0], [34.0]], p1: [[35.0]])]], p1: s2(p0: [[s1(p0: s0(p0: [[36.0], [37.0]], p1: [[38.0]]), p1: s0(p0: [[39.0], [40.0]], p1: [[41.0]]))], [s1(p0: s0(p0: [[42.0], [43.0]], p1: [[44.0]]), p1: s0(p0: [[45.0], [46.0]], p1: [[47.0]]))]], p1: s0(p0: [[48.0], [49.0]], p1: [[50.0]])))))
    let v1: Double = 51.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 51.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
