  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
    var p2: [s0]
    var p3: s0
    var p4: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: [s0]
  }
  func f43(_ v0: s1) -> s1 {
    let v7: [s0] = v0.p2
    let v6: s0 = v0.p3
    var v5: [s0] = v7
    var v16: s1 = v0
    var v13: [s0] = v7
    let v10: [[Double]] = v6.p0
    let v18: s0 = v13[0]
    v13[0] = v18
    v5[0] = v18
    v16.p4 = v18
    v16.p4 = v18
    v5[0] = v6
    var v17: s1 = v16
    v16.p4 = v6
    let v36: [[Double]] = v18.p0
    var v27: [s0] = v7
    let v40: [[s0]] = v17.p1
    let v88: s0 = v5[0]
    let v57: s0 = v7[0]
    let v37: [[Double]] = v18.p0
    v13[0] = v57
    let v44: s0 = v17.p3
    var v38: [[s0]] = v40
    v17.p2 = v13
    let v54: [s0] = v38[0]
    v17.p4 = v44
    v5[0] = v57
    v13[0] = v44
    var v39: [[s0]] = v38
    var v75: s0 = v88
    v16.p0 = v88
    v39[1] = v54
    var v31: s0 = v44
    v31.p0 = v10
    v31.p0 = v37
    v75.p0 = v36
    let v74: s0 = v13[0]
    let v66: [[Double]] = v6.p0
    let v131: s0 = v5[0]
    v13[0] = v75
    let v71: s1 = s1(p0: v88, p1: v39, p2: v5, p3: v31, p4: v74)
    v31.p0 = v66
    v13[0] = v131
    v38[1] = v27
    v17.p2 = v54
    v17 = v16
    return v71
  }
  func f41(_ v0: s1) -> s1 {
    let v1: s0 = v0.p4
    let v2: [s0] = v0.p2
    var v4: s1 = v0
    v4.p0 = v1
    var v8: s0 = v1
    v4.p3 = v8
    v4.p0 = v8
    let v11: s0 = v2[0]
    v8 = v11
    let v17: s1 = f43(v4)
    return v17
  }
  func f35(_ v0: s1) -> s1 {
    let v6: s1 = f43(v0)
    let v1: s1 = f41(v0)
    let v8: s1 = f41(v0)
    let v7: s1 = f41(v0)
    let v9: s1 = f41(v8)
    let v15: s1 = f43(v8)
    let v26: s1 = f43(v9)
    let v31: s1 = f43(v9)
    let v19: s1 = f41(v26)
    let v96: s1 = f41(v19)
    let v22: [s1] = [v0, v96, v31, v6, v7, v15, v1]
    let v63: s1 = v22[3]
    return v63
  }
  func f31(_ v0: s0) -> s0 {
    var v5: s0 = v0
    var v7: s0 = v5
    let v4: [[Double]] = v7.p0
    let v2: [[Double]] = v5.p0
    v7.p0 = v2
    v5.p0 = v2
    v5.p0 = v2
    v7.p0 = v4
    let v14: [[Double]] = v5.p0
    var v11: s0 = v7
    v5.p0 = v2
    v11.p0 = v14
    let v22: [[Double]] = v11.p0
    var v17: s0 = v11
    v7.p0 = v14
    v17.p0 = v22
    return v17
  }
  func f30(_ v0: [s0]) -> [s0] {
    let v4: s0 = v0[0]
    let v7: [[Double]] = v4.p0
    let v1: [[Double]] = v4.p0
    let v6: [[Double]] = v4.p0
    let v3: [[Double]] = v4.p0
    let v20: [[Double]] = v4.p0
    let v11: s0 = f31(v4)
    let v16: [[Double]] = v11.p0
    var v22: s0 = v11
    v22 = v4
    let v18: s0 = f31(v4)
    v22.p0 = v3
    v22.p0 = v6
    let v25: s0 = v0[0]
    v22.p0 = v1
    v22.p0 = v16
    let v15: s0 = f31(v25)
    let v36: [[Double]] = v22.p0
    v22.p0 = v20
    let v27: s0 = v0[0]
    let v39: [[Double]] = v22.p0
    let v35: [[Double]] = v25.p0
    v22.p0 = v7
    let v50: s0 = f31(v15)
    v22.p0 = v6
    let v38: s0 = f31(v50)
    let v47: [[Double]] = v38.p0
    v22 = v18
    v22.p0 = v47
    let v49: s0 = f31(v27)
    let v61: s0 = f31(v49)
    v22.p0 = v1
    var v135: s0 = v61
    var v183: [[Double]] = v36
    v135.p0 = v39
    v22.p0 = v183
    var v62: [s0] = v0
    v135.p0 = v35
    var v283: [s0] = v62
    v62[0] = v135
    return v283
  }
  func f26(_ v0: s1) -> s1 {
    let v5: s0 = v0.p4
    var v8: s1 = v0
    let v1: [s0] = v8.p2
    let v6: s0 = f31(v5)
    var v4: s1 = v0
    let v2: [s0] = f30(v1)
    v4.p3 = v6
    let v7: s0 = v1[0]
    v8.p0 = v5
    let v19: s1 = f43(v0)
    let v45: [s1] = [v19, v19, v8, v0, v0, v8, v8]
    v4.p0 = v5
    let v30: s0 = v2[0]
    v8.p4 = v30
    var v29: [s1] = v45
    v8.p4 = v7
    let v17: s1 = f41(v4)
    let v42: s1 = f41(v17)
    v4.p0 = v5
    v29[2] = v42
    v29 = v45
    let v68: s1 = v29[0]
    let v52: s1 = f43(v68)
    return v52
  }
  func f18(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v1: [[Double]] = v0.p0
    v7.p0 = v1
    let v6: s0 = f31(v0)
    v7 = v6
    let v17: [[Double]] = v6.p0
    v7.p0 = v17
    return v7
  }
  func f8(_ v0: s1) -> s1 {
    let v6: s1 = f26(v0)
    let v3: s0 = v6.p0
    let v8: s1 = f35(v6)
    var v52: s1 = v8
    v52.p0 = v3
    var v104: s1 = v52
    let v124: s1 = f35(v104)
    return v124
  }
  func f7(_ v0: s1) -> s1 {
    let v6: [[s0]] = v0.p1
    let v7: [s0] = v6[0]
    let v2: s0 = v0.p0
    let v5: s0 = f18(v2)
    let v3: s1 = s1(p0: v5, p1: v6, p2: v7, p3: v5, p4: v5)
    let v11: [s0] = v0.p2
    let v25: s1 = f35(v3)
    var v23: s1 = v25
    v23.p3 = v2
    let v41: s1 = f26(v23)
    let v50: s1 = f8(v23)
    let v74: s0 = v7[0]
    v23.p2 = v11
    v23.p0 = v74
    let v52: [s1] = [v41, v23, v50, v25]
    let v117: s1 = v52[3]
    return v117
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: s1, _ v2: s1, _ v3: Double) -> Double {
    let v9: s1 = f7(v2)
    let v12: s0 = v9.p3
    let v5: [[Double]] = v12.p0
    var v15: [[Double]] = v5
    let v23: [Double] = v15[1]
    v15[0] = v23
    var v20: [Double] = v23
    v15[0] = v20
    let v74: Double = v20[0]
    return v74
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: [s0(p0: [[0.0], [1.0]]), s0(p0: [[2.0], [3.0]])], p1: [s0(p0: [[4.0], [5.0]]), s0(p0: [[6.0], [7.0]])])], [s2(p0: [s0(p0: [[8.0], [9.0]]), s0(p0: [[10.0], [11.0]])], p1: [s0(p0: [[12.0], [13.0]]), s0(p0: [[14.0], [15.0]])])]]
    let v1: s1 = s1(p0: s0(p0: [[16.0], [17.0]]), p1: [[s0(p0: [[18.0], [19.0]])], [s0(p0: [[20.0], [21.0]])]], p2: [s0(p0: [[22.0], [23.0]])], p3: s0(p0: [[24.0], [25.0]]), p4: s0(p0: [[26.0], [27.0]]))
    let v2: s1 = s1(p0: s0(p0: [[28.0], [29.0]]), p1: [[s0(p0: [[30.0], [31.0]])], [s0(p0: [[32.0], [33.0]])]], p2: [s0(p0: [[34.0], [35.0]])], p3: s0(p0: [[36.0], [37.0]]), p4: s0(p0: [[38.0], [39.0]]))
    let v3: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
