  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [[s0]]
  }
  struct s3 {
    var p0: [s1]
    var p1: [s2]
  }
  func f89(_ v0: s1) -> s1 {
    let v1: s0 = v0.p0
    var v6: s0 = v1
    var v5: s1 = v0
    let v3: s0 = v5.p0
    let v10: [[Double]] = v3.p0
    v6.p1 = v10
    v6.p0 = v10
    let v14: s0 = v0.p0
    v5.p1 = v14
    var v21: s1 = v0
    let v33: s0 = v21.p1
    var v146: s0 = v6
    let v68: s1 = s1(p0: v33, p1: v146)
    return v68
  }
  func f84(_ v0: s3, _ v1: [s2]) -> [s2] {
    let v2: s2 = v1[0]
    var v3: s2 = v2
    var v9: [s2] = v1
    let v15: [[s0]] = v2.p1
    var v12: [s2] = v9
    let v17: [[s0]] = v2.p1
    let v14: [s2] = v0.p1
    var v21: [s2] = v12
    var v24: [s2] = v21
    v24[0] = v2
    let v26: s2 = v14[0]
    v12 = v24
    v3.p1 = v15
    v12[1] = v26
    v3.p1 = v17
    v21 = v1
    v9[0] = v3
    return v12
  }
  func f80(_ v0: s1) -> s1 {
    let v2: s0 = v0.p1
    var v1: s0 = v2
    var v3: s0 = v2
    let v5: [[Double]] = v1.p2
    var v8: s1 = v0
    var v7: [[Double]] = v5
    let v6: [Double] = v7[0]
    v7[0] = v6
    let v11: s1 = f89(v8)
    let v10: s1 = s1(p0: v2, p1: v3)
    var v15: s1 = v11
    let v18: s1 = f89(v8)
    let v14: [[Double]] = v1.p1
    let v13: s0 = v18.p0
    let v22: s1 = f89(v10)
    var v27: s1 = v22
    let v24: s0 = v8.p1
    v3.p1 = v14
    let v36: [[Double]] = v24.p1
    v3.p2 = v7
    let v21: s0 = v11.p1
    let v26: s1 = f89(v0)
    v8.p0 = v3
    let v49: s1 = f89(v27)
    let v61: s0 = v26.p0
    let v56: [[Double]] = v13.p1
    let v176: s0 = v15.p0
    v15.p0 = v1
    let v64: s1 = f89(v49)
    let v77: s1 = f89(v11)
    v27.p1 = v1
    v15 = v77
    let v60: [Double] = v7[0]
    v3.p0 = v36
    v27.p1 = v21
    v7[0] = v60
    v8.p1 = v61
    v3.p1 = v56
    v27.p1 = v176
    return v64
  }
  func f75(_ v0: s3) -> s3 {
    var v2: s3 = v0
    let v29: [s1] = v0.p0
    v2.p0 = v29
    var v47: s3 = v2
    return v47
  }
  func f73(_ v0: s1) -> s1 {
    var v7: s1 = v0
    let v5: s1 = f80(v7)
    let v6: s1 = f80(v7)
    let v9: s0 = v5.p1
    let v2: s1 = f80(v0)
    let v10: s0 = v6.p0
    let v12: s1 = f80(v2)
    let v8: s0 = v0.p0
    let v27: s1 = f89(v12)
    let v25: [[Double]] = v9.p3
    var v18: [[Double]] = v25
    v7.p0 = v8
    let v31: [Double] = v18[0]
    let v52: s1 = f89(v27)
    let v103: [Double] = v25[0]
    let v29: [[Double]] = v8.p2
    let v23: Double = v103[0]
    var v58: [Double] = v31
    let v28: [Double] = v18[1]
    let v21: [Double] = v29[0]
    v18[1] = v58
    let v44: [Double] = v25[0]
    v58[0] = v23
    var v50: s0 = v8
    let v32: Double = v28[0]
    v7.p0 = v50
    var v61: [[Double]] = v25
    v58[0] = v23
    v58[0] = v32
    let v53: [Double] = v29[0]
    let v35: s0 = v5.p1
    var v36: [[Double]] = v61
    var v49: [[Double]] = v29
    let v34: [Double] = v25[1]
    let v39: [Double] = [v23, v32, v32, v23, v23, v23]
    var v65: [Double] = v39
    var v56: Double = v23
    v50.p2 = v29
    var v74: [Double] = v39
    v18[1] = v44
    v49[0] = v28
    v7.p0 = v9
    v18[1] = v31
    v49[0] = v53
    let v59: s0 = v52.p0
    var v84: s0 = v59
    let v87: [[Double]] = v9.p3
    let v193: Double = v74[2]
    v50.p2 = v49
    v49[0] = v21
    let v90: s1 = s1(p0: v84, p1: v9)
    v50.p3 = v87
    v84.p3 = v25
    let v166: [[Double]] = v50.p1
    v65[0] = v193
    let v121: Double = v65[0]
    let v141: [Double] = v166[1]
    let v85: Double = v65[4]
    v74[1] = v56
    let v62: Double = v141[0]
    v7.p0 = v10
    let v106: [[Double]] = v35.p1
    v84.p1 = v106
    var v97: Double = v121
    v84.p3 = v36
    v58 = v34
    v58[0] = v97
    v74[1] = v62
    v58[0] = v85
    return v90
  }
  func f72(_ v0: s1, _ v1: s3) -> s1 {
    var v5: s3 = v1
    let v2: [s1] = v5.p0
    v5.p0 = v2
    v5.p0 = v2
    let v4: [s1] = v5.p0
    let v33: s1 = v2[1]
    let v32: s3 = f75(v5)
    let v89: [s2] = v32.p1
    let v24: s2 = v89[1]
    var v20: [s2] = v89
    v20[1] = v24
    let v44: [s2] = f84(v5, v20)
    v5.p1 = v44
    var v42: s2 = v24
    v20[0] = v42
    let v74: s1 = f89(v33)
    let v176: s1 = f73(v74)
    v5.p0 = v4
    return v176
  }
  func f46(_ v0: s1) -> s1 {
    let v7: s1 = f73(v0)
    let v4: s0 = v7.p1
    let v9: s1 = s1(p0: v4, p1: v4)
    let v20: s1 = f89(v9)
    let v41: s1 = f89(v20)
    let v40: s1 = f89(v41)
    let v82: s1 = f80(v40)
    var v122: s1 = v82
    return v122
  }
  func f44(_ v0: [s1]) -> [s1] {
    var v2: [s1] = v0
    let v1: s1 = v0[1]
    v2[0] = v1
    let v6: s0 = v1.p0
    var v3: s1 = v1
    let v5: s1 = v0[0]
    let v4: s1 = v2[1]
    let v10: s1 = f46(v3)
    v2[1] = v4
    v3.p1 = v6
    v2[1] = v3
    v3.p1 = v6
    var v11: [s1] = v2
    let v25: s0 = v4.p1
    let v19: s1 = f73(v5)
    let v22: s1 = f89(v10)
    v3.p0 = v25
    let v68: s1 = f46(v5)
    v11[1] = v3
    v2[1] = v22
    let v50: s1 = v0[1]
    v2[0] = v50
    v3.p1 = v6
    let v39: s0 = v68.p0
    v3.p1 = v6
    v2[1] = v19
    var v47: [s1] = v11
    v3.p0 = v25
    v3.p0 = v39
    v3.p0 = v25
    v11 = v2
    let v42: s1 = v2[1]
    v2[1] = v42
    v3.p0 = v6
    return v47
  }
  func f20(_ v0: [s1], _ v1: s0, _ v2: s1) -> [s1] {
    var v19: [s1] = v0
    return v19
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    var v5: s3 = v0
    let v3: [s2] = v0.p1
    let v9: [s2] = v5.p1
    var v6: s3 = v5
    v5.p1 = v3
    let v2: s3 = f75(v0)
    let v11: [s1] = v5.p0
    let v12: s1 = v11[0]
    v5.p1 = v9
    let v15: [s1] = v6.p0
    let v16: s1 = v15[1]
    let v18: s1 = f72(v16, v6)
    let v23: s0 = v12.p1
    v6 = v2
    let v20: s1 = f72(v16, v2)
    let v44: [s1] = v5.p0
    let v71: [s1] = f44(v11)
    let v33: [s1] = f20(v11, v23, v20)
    var v67: [s1] = v44
    let v30: [[Double]] = v23.p3
    v67[0] = v12
    v67[0] = v16
    v5.p0 = v67
    v67[1] = v20
    v67[1] = v18
    let v73: [Double] = v30[0]
    let v92: Double = v73[0]
    v67[1] = v16
    v5.p0 = v33
    v5.p0 = v71
    let v98: s1 = f80(v18)
    v67[0] = v98
    var v83: Double = v92
    return v83
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]], p2: [[6.0]], p3: [[7.0], [8.0]]), p1: s0(p0: [[9.0], [10.0], [11.0]], p1: [[12.0], [13.0], [14.0]], p2: [[15.0]], p3: [[16.0], [17.0]])), s1(p0: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]], p2: [[24.0]], p3: [[25.0], [26.0]]), p1: s0(p0: [[27.0], [28.0], [29.0]], p1: [[30.0], [31.0], [32.0]], p2: [[33.0]], p3: [[34.0], [35.0]]))], p1: [s2(p0: s1(p0: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]], p2: [[42.0]], p3: [[43.0], [44.0]]), p1: s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0], [50.0]], p2: [[51.0]], p3: [[52.0], [53.0]])), p1: [[s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]], p2: [[60.0]], p3: [[61.0], [62.0]])]]), s2(p0: s1(p0: s0(p0: [[63.0], [64.0], [65.0]], p1: [[66.0], [67.0], [68.0]], p2: [[69.0]], p3: [[70.0], [71.0]]), p1: s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]], p2: [[78.0]], p3: [[79.0], [80.0]])), p1: [[s0(p0: [[81.0], [82.0], [83.0]], p1: [[84.0], [85.0], [86.0]], p2: [[87.0]], p3: [[88.0], [89.0]])]])])
    let v1: Double = 90.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 90.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
