  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s4 {
    var p0: s1
    var p1: s0
  }
  struct s6 {
    var p0: [Double]
    var p1: [s1]
  }
  func f93(_ v0: Double) -> Double {
    var v1: Double = v0
    var v7: Double = v1
    var v3: Double = v7
    v1 = v7
    var v10: Double = v0
    var v4: Double = v10
    var v12: Double = v4
    var v9: Double = v3
    var v11: Double = v12
    let v28: [Double] = [v9, v11]
    var v32: [Double] = v28
    v32[1] = v9
    let v73: Double = v32[0]
    return v73
  }
  func f90(_ v0: s0) -> s0 {
    var v7: s0 = v0
    var v2: s0 = v7
    let v1: [[Double]] = v0.p0
    v2.p0 = v1
    let v21: [[Double]] = v7.p1
    v2.p1 = v21
    return v2
  }
  func f88(_ v0: s4) -> s4 {
    var v5: s4 = v0
    let v3: s0 = v5.p1
    let v7: s0 = v5.p1
    let v17: s0 = f90(v3)
    let v6: s0 = f90(v7)
    v5.p1 = v3
    let v19: s1 = v5.p0
    let v10: s0 = f90(v6)
    let v14: s0 = f90(v6)
    v5.p1 = v17
    let v12: s4 = s4(p0: v19, p1: v6)
    let v21: s0 = f90(v14)
    let v13: s1 = v12.p0
    v5.p0 = v19
    let v18: s4 = s4(p0: v13, p1: v10)
    v5.p1 = v21
    var v41: s4 = v18
    v5 = v41
    return v18
  }
  func f79(_ v0: s6) -> s6 {
    let v7: [s1] = v0.p1
    let v4: [[s1]] = [v7, v7]
    let v2: [s1] = v4[0]
    let v5: s1 = v7[1]
    var v11: s1 = v5
    var v6: s6 = v0
    let v3: s1 = v7[1]
    v6.p1 = v2
    let v9: [s1] = v6.p1
    let v8: [s1] = v4[1]
    var v12: [s1] = v8
    var v10: [[s1]] = v4
    v6.p1 = v8
    let v1: [s1] = v10[0]
    v6.p1 = v8
    v6.p1 = v1
    let v30: s1 = v1[1]
    let v20: [[s0]] = v11.p0
    let v36: [[s0]] = v5.p0
    v6.p1 = v1
    var v22: [[s0]] = v20
    var v17: s1 = v30
    v12[0] = v5
    let v18: s0 = v5.p1
    var v19: s1 = v17
    let v23: [s0] = v22[0]
    let v24: [s6] = [v6, v0, v6, v0, v6, v0]
    v17.p1 = v18
    v11.p1 = v18
    let v33: s0 = v23[0]
    var v21: s6 = v0
    var v40: [[s0]] = v20
    let v16: s0 = f90(v33)
    let v28: s6 = v24[0]
    var v44: [s0] = v23
    v11 = v17
    v6 = v28
    let v73: s0 = f90(v33)
    v44[0] = v18
    v19.p0 = v36
    let v35: s4 = s4(p0: v11, p1: v18)
    let v34: s0 = f90(v73)
    v40[0] = v44
    let v25: [s0] = v36[0]
    let v47: s0 = f90(v33)
    v40[0] = v25
    let v43: s0 = f90(v16)
    let v50: s0 = f90(v47)
    v21.p1 = v9
    let v61: s4 = f88(v35)
    var v75: [s1] = v12
    let v31: s0 = f90(v43)
    var v38: [s0] = v44
    let v55: s0 = v23[0]
    var v37: [s0] = v23
    v75[0] = v3
    let v48: [[Double]] = v50.p0
    let v81: [s1] = v21.p1
    let v66: [Double] = v6.p0
    let v98: s0 = v25[0]
    v12[0] = v19
    v10[0] = v75
    v38[0] = v34
    let v63: s1 = s1(p0: v40, p1: v18)
    v22[0] = v38
    let v58: s0 = f90(v47)
    v75[1] = v63
    let v49: s0 = f90(v58)
    v75[1] = v3
    let v149: [Double] = v48[0]
    v10[0] = v81
    v38[0] = v31
    let v46: [s1] = v4[1]
    let v68: s0 = v19.p1
    v21.p1 = v2
    v17.p0 = v20
    v38[0] = v49
    v37[0] = v55
    v12 = v46
    v21.p1 = v2
    v75[1] = v63
    v19.p1 = v98
    let v207: s4 = f88(v61)
    v21.p1 = v1
    let v106: s6 = s6(p0: v149, p1: v81)
    v21.p1 = v81
    v37[0] = v68
    v6.p1 = v8
    v21.p0 = v66
    let v93: s1 = v207.p0
    v22[0] = v37
    v75[0] = v93
    return v106
  }
  func f70(_ v0: [s1]) -> [s1] {
    var v3: [s1] = v0
    let v1: s1 = v0[0]
    v3[1] = v1
    return v3
  }
  func f42(_ v0: s6) -> s6 {
    let v2: [s1] = v0.p1
    let v3: [Double] = v0.p0
    let v7: s1 = v2[0]
    var v4: s1 = v7
    var v1: s1 = v4
    var v12: s6 = v0
    var v5: [s1] = v2
    let v6: [s1] = v0.p1
    let v11: Double = v3[0]
    let v31: [s1] = f70(v2)
    var v15: [Double] = v3
    let v18: s1 = v6[0]
    v5[0] = v1
    var v29: [Double] = v3
    v12.p0 = v15
    let v17: s6 = f79(v12)
    v12.p1 = v5
    let v22: s6 = s6(p0: v29, p1: v2)
    let v44: [Double] = v17.p0
    v15[0] = v11
    let v23: s0 = v4.p1
    let v30: [s1] = f70(v31)
    let v34: [[Double]] = v23.p1
    var v52: s0 = v23
    v5[1] = v18
    v52.p1 = v34
    v29 = v44
    v12.p1 = v30
    v1.p1 = v52
    v52.p1 = v34
    v52.p1 = v34
    return v22
  }
  func f41(_ v0: s1) -> s1 {
    return v0
  }
  func f35(_ v0: s1) -> s1 {
    let v2: s1 = f41(v0)
    let v8: s1 = f41(v2)
    let v9: s0 = v8.p1
    var v1: s0 = v9
    var v5: s0 = v1
    let v11: s4 = s4(p0: v0, p1: v5)
    let v15: [[Double]] = v9.p1
    var v13: s4 = v11
    let v12: s1 = v13.p0
    var v17: [[Double]] = v15
    var v25: [[Double]] = v15
    let v36: [Double] = v17[0]
    let v14: s1 = f41(v0)
    v25[1] = v36
    let v20: [Double] = v25[2]
    let v50: s0 = f90(v5)
    v1.p1 = v15
    v1 = v9
    var v86: [[Double]] = v17
    v5.p1 = v17
    v86[0] = v20
    let v76: [[Double]] = v50.p0
    var v112: [[Double]] = v76
    v13.p0 = v14
    let v152: s1 = f41(v12)
    let v97: s0 = s0(p0: v76, p1: v86)
    v86[1] = v36
    v1.p0 = v112
    let v72: s1 = f41(v152)
    let v343: s1 = f41(v72)
    v13.p1 = v97
    v13.p0 = v2
    return v343
  }
  func f24(_ v0: s6) -> s6 {
    let v6: [s6] = [v0, v0, v0, v0, v0, v0, v0]
    let v5: [s1] = v0.p1
    let v7: s6 = v6[4]
    let v2: s1 = v5[1]
    let v8: s1 = f41(v2)
    var v15: [s1] = v5
    let v18: s6 = f42(v7)
    let v36: s1 = f41(v8)
    v15[0] = v36
    let v60: [Double] = v18.p0
    let v37: s6 = f42(v18)
    var v68: s6 = v37
    v68.p1 = v15
    v15[0] = v2
    v68.p0 = v60
    return v68
  }
  @inline(never)
  func f0(_ v0: [[s6]], _ v1: [s6], _ v2: Double) -> Double {
    let v9: s6 = v1[0]
    let v3: s6 = f79(v9)
    let v4: s6 = f79(v3)
    let v13: [Double] = v9.p0
    var v35: s6 = v3
    v35.p0 = v13
    let v42: [s1] = v35.p1
    v35.p0 = v13
    let v53: s6 = f24(v4)
    let v45: s1 = v42[0]
    let v33: [s1] = v53.p1
    let v29: s6 = f79(v35)
    let v51: Double = v13[0]
    let v24: s6 = f79(v29)
    var v40: [s1] = v33
    let v52: Double = f93(v51)
    let v32: s1 = f35(v45)
    let v46: Double = v13[0]
    v35.p0 = v13
    let v59: [s1] = v9.p1
    var v49: [Double] = v13
    v49[0] = v46
    v49[0] = v52
    v35.p1 = v40
    var v123: s1 = v45
    v35.p0 = v49
    let v100: [[s0]] = v32.p0
    let v79: [Double] = v24.p0
    var v73: [[s0]] = v100
    v35.p0 = v13
    v123.p0 = v73
    let v194: s0 = v123.p1
    v35.p1 = v59
    let v216: s0 = f90(v194)
    let v121: Double = v79[0]
    v40[0] = v123
    let v291: s0 = f90(v216)
    v123.p1 = v291
    return v121
  }
  func benchmark() {
    let v0: [[s6]] = [[s6(p0: [0.0], p1: [s1(p0: [[s0(p0: [[1.0]], p1: [[2.0], [3.0], [4.0]])]], p1: s0(p0: [[5.0]], p1: [[6.0], [7.0], [8.0]])), s1(p0: [[s0(p0: [[9.0]], p1: [[10.0], [11.0], [12.0]])]], p1: s0(p0: [[13.0]], p1: [[14.0], [15.0], [16.0]]))])], [s6(p0: [17.0], p1: [s1(p0: [[s0(p0: [[18.0]], p1: [[19.0], [20.0], [21.0]])]], p1: s0(p0: [[22.0]], p1: [[23.0], [24.0], [25.0]])), s1(p0: [[s0(p0: [[26.0]], p1: [[27.0], [28.0], [29.0]])]], p1: s0(p0: [[30.0]], p1: [[31.0], [32.0], [33.0]]))])]]
    let v1: [s6] = [s6(p0: [34.0], p1: [s1(p0: [[s0(p0: [[35.0]], p1: [[36.0], [37.0], [38.0]])]], p1: s0(p0: [[39.0]], p1: [[40.0], [41.0], [42.0]])), s1(p0: [[s0(p0: [[43.0]], p1: [[44.0], [45.0], [46.0]])]], p1: s0(p0: [[47.0]], p1: [[48.0], [49.0], [50.0]]))])]
    let v2: Double = 51.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 51.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
