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
  func f90(_ v0: s1) -> s1 {
    let v3: s0 = v0.p0
    var v6: s0 = v3
    let v10: [[Double]] = v3.p1
    v6.p1 = v10
    var v1: s1 = v0
    let v11: s0 = v0.p0
    let v8: [[Double]] = v11.p3
    var v17: s1 = v1
    let v36: s1 = s1(p0: v3, p1: v11)
    let v12: [[Double]] = v3.p3
    let v18: s0 = v1.p1
    v1.p0 = v11
    let v37: s0 = v17.p1
    let v28: [s1] = [v17, v17, v36, v0]
    let v22: [s0] = [v3, v6, v18]
    var v29: [s0] = v22
    v6.p1 = v10
    v1.p0 = v37
    let v34: s1 = v28[3]
    let v59: s0 = v0.p0
    v17.p0 = v3
    let v38: s0 = v29[0]
    v1.p1 = v6
    v17.p0 = v38
    v6.p2 = v8
    let v83: s0 = v29[2]
    let v70: s0 = v36.p0
    v17.p1 = v59
    v1.p0 = v83
    v17.p1 = v70
    v6.p2 = v12
    return v34
  }
  func f88(_ v0: s1) -> s1 {
    var v2: s1 = v0
    let v7: s1 = f90(v0)
    var v4: s1 = v0
    let v1: s1 = f90(v2)
    var v9: s1 = v7
    let v6: s0 = v9.p1
    let v13: [s0] = [v6, v6, v6, v6, v6, v6]
    let v11: [[Double]] = v6.p1
    var v8: [s0] = v13
    let v15: s0 = v8[2]
    let v10: s0 = v13[1]
    let v12: s0 = v1.p1
    let v23: s1 = s1(p0: v12, p1: v15)
    let v24: s0 = v2.p0
    v8[4] = v10
    v8[1] = v12
    let v19: [[Double]] = v10.p0
    let v16: s0 = v1.p1
    v8[5] = v24
    let v21: s1 = f90(v4)
    let v29: [[Double]] = v6.p2
    let v39: [[Double]] = v15.p0
    v9.p1 = v15
    let v44: s0 = v13[3]
    v8[0] = v10
    let v59: s1 = f90(v21)
    v8[1] = v44
    var v37: s0 = v16
    let v32: [[Double]] = v16.p3
    v2.p0 = v37
    v9.p1 = v6
    let v56: s0 = v0.p1
    let v73: s0 = s0(p0: v19, p1: v11, p2: v39, p3: v39)
    v37.p0 = v32
    v8[2] = v37
    let v136: s1 = f90(v23)
    let v53: [[Double]] = v12.p3
    var v63: s0 = v10
    v63.p1 = v11
    v8[2] = v6
    v4.p0 = v73
    v37.p2 = v53
    v9 = v59
    v9.p1 = v44
    let v93: s1 = f90(v136)
    v37.p3 = v29
    v2.p1 = v56
    v9.p1 = v63
    return v93
  }
  func f84(_ v0: s0, _ v1: s0) -> s0 {
    var v6: s0 = v1
    let v3: [[Double]] = v1.p1
    var v2: [[Double]] = v3
    let v9: [[Double]] = v1.p2
    var v10: [[Double]] = v3
    let v8: [[Double]] = v6.p1
    let v4: [Double] = v3[0]
    var v5: [Double] = v4
    let v11: [Double] = v8[0]
    let v12: [[Double]] = v6.p0
    let v15: Double = v11[0]
    let v16: [[Double]] = v6.p3
    v5[0] = v15
    var v29: Double = v15
    let v13: [[Double]] = v0.p2
    v6.p0 = v12
    let v22: [Double] = v12[0]
    var v17: Double = v29
    let v36: [[Double]] = v6.p0
    v6.p0 = v13
    let v21: Double = v17 / v17
    v5[0] = v29
    v6.p2 = v12
    var v34: Double = v21
    var v32: [[Double]] = v9
    v2[1] = v4
    let v49: [[Double]] = v1.p0
    v5[0] = v34
    v6.p2 = v16
    v6.p2 = v49
    v2[0] = v5
    var v56: [[Double]] = v2
    let v87: [[Double]] = v6.p3
    v32[0] = v11
    let v42: [[Double]] = v6.p1
    var v39: s0 = v1
    var v55: s0 = v39
    let v85: s1 = s1(p0: v55, p1: v55)
    let v52: s1 = f90(v85)
    let v30: s1 = f88(v52)
    let v54: [[Double]] = v55.p1
    let v51: [Double] = v54[1]
    v6.p1 = v2
    v2[1] = v51
    let v48: s1 = f90(v52)
    v55.p0 = v16
    let v77: s1 = f90(v48)
    let v69: [Double] = v87[0]
    v10[0] = v22
    let v98: s1 = f90(v85)
    let v68: s0 = v77.p0
    v39.p1 = v56
    v55.p1 = v8
    v10 = v8
    v55.p3 = v36
    v5[0] = v29
    let v93: s1 = f88(v30)
    let v81: s1 = f90(v93)
    let v76: s0 = v98.p1
    let v144: [Double] = v10[1]
    let v111: s0 = v81.p0
    v2[1] = v144
    let v82: [Double] = v42[0]
    v10[1] = v11
    v32[0] = v51
    v56[0] = v69
    let v184: [[Double]] = v76.p0
    var v122: [Double] = v4
    var v165: s0 = v111
    v2[1] = v82
    let v273: [s0] = [v68, v55, v76, v165]
    v6.p3 = v32
    v10[0] = v122
    var v161: [s0] = v273
    v55.p0 = v184
    let v130: s0 = v161[0]
    return v130
  }
  func f83(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p1
    let v7: s0 = f84(v0, v0)
    let v2: [[Double]] = v0.p1
    let v3: [Double] = v2[1]
    let v10: s0 = f84(v0, v7)
    var v8: s0 = v0
    let v13: [Double] = v2[0]
    v8.p1 = v2
    let v6: s1 = s1(p0: v7, p1: v10)
    let v18: s1 = f88(v6)
    let v11: [[Double]] = v10.p3
    var v9: s0 = v7
    let v23: s0 = v6.p0
    let v21: [Double] = v11[0]
    let v25: [s0] = [v0, v7, v9, v7, v23, v9]
    let v27: s0 = f84(v0, v10)
    let v12: s0 = v25[4]
    let v19: s0 = f84(v23, v12)
    let v16: s0 = f84(v8, v27)
    let v61: [[Double]] = v12.p0
    let v33: s1 = f90(v18)
    var v41: [Double] = v21
    v8.p2 = v11
    let v38: s0 = v25[4]
    let v54: [[Double]] = v16.p0
    v8.p2 = v54
    let v48: Double = v13[0]
    var v50: [[Double]] = v2
    let v29: s0 = v33.p0
    let v36: [[Double]] = v29.p1
    v8.p1 = v2
    let v42: [[Double]] = v38.p3
    let v31: [[Double]] = v8.p0
    let v51: [[Double]] = v16.p0
    v9.p3 = v42
    var v62: [[Double]] = v50
    var v37: [Double] = v13
    v8.p0 = v51
    v9.p1 = v62
    v9.p2 = v54
    let v84: [[Double]] = v23.p0
    v9.p3 = v84
    let v91: [[Double]] = v19.p3
    let v175: s0 = s0(p0: v91, p1: v36, p2: v31, p3: v91)
    v8.p3 = v51
    var v148: s0 = v175
    let v195: s0 = f84(v148, v7)
    v50[1] = v3
    v50[0] = v41
    v8.p2 = v51
    v9.p2 = v61
    v62[0] = v37
    v37[0] = v48
    v148.p1 = v4
    return v195
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s0, _ v2: s0, _ v3: Double) -> Double {
    let v5: s0 = v0.p1
    let v8: s0 = f83(v1)
    let v12: [[Double]] = v8.p1
    let v22: [[Double]] = v5.p3
    let v23: s0 = s0(p0: v22, p1: v12, p2: v22, p3: v22)
    let v31: [[Double]] = v23.p0
    let v33: [Double] = v31[0]
    let v47: Double = v33[0]
    return v47
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]], p2: [[3.0]], p3: [[4.0]]), p1: s0(p0: [[5.0]], p1: [[6.0], [7.0]], p2: [[8.0]], p3: [[9.0]]))
    let v1: s0 = s0(p0: [[10.0]], p1: [[11.0], [12.0]], p2: [[13.0]], p3: [[14.0]])
    let v2: s0 = s0(p0: [[15.0]], p1: [[16.0], [17.0]], p2: [[18.0]], p3: [[19.0]])
    let v3: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
