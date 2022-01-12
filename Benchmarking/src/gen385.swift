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
    var p0: [[s0]]
    var p1: s0
  }
  func f46(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v6: [s0] = [v0, v4]
    var v1: s0 = v4
    v4 = v0
    var v11: s0 = v1
    let v3: [[Double]] = v0.p0
    v11.p0 = v3
    let v8: [[Double]] = v11.p1
    let v17: s0 = v6[1]
    let v10: [[Double]] = v17.p1
    var v23: [[Double]] = v8
    var v20: [[Double]] = v23
    v20 = v10
    v4.p1 = v20
    v1.p0 = v3
    v4.p1 = v20
    v4.p1 = v20
    var v16: s0 = v11
    v4.p1 = v10
    return v16
  }
  func f42(_ v0: s1) -> s1 {
    var v4: s1 = v0
    let v7: s0 = v0.p0
    let v2: s0 = f46(v7)
    let v1: s0 = v0.p0
    var v3: s0 = v2
    let v11: s0 = v4.p1
    let v5: s0 = f46(v3)
    let v12: [[Double]] = v11.p1
    v4.p1 = v1
    let v15: s1 = s1(p0: v1, p1: v5)
    v3.p1 = v12
    return v15
  }
  func f40(_ v0: s0) -> s0 {
    let v6: s0 = f46(v0)
    let v13: [[Double]] = v6.p0
    let v25: s0 = f46(v0)
    let v26: s0 = f46(v25)
    var v33: s0 = v25
    v33.p0 = v13
    v33 = v26
    let v32: s0 = f46(v33)
    let v51: s0 = f46(v32)
    return v51
  }
  func f33(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v3: [[Double]] = v6.p0
    let v2: [Double] = v3[0]
    var v8: [Double] = v2
    let v4: s0 = f46(v0)
    v6.p0 = v3
    let v5: [[Double]] = v0.p0
    let v1: s1 = s1(p0: v4, p1: v6)
    let v13: s0 = v1.p1
    let v14: s0 = f46(v0)
    let v23: [Double] = v3[1]
    var v15: [[Double]] = v5
    let v11: s1 = s1(p0: v4, p1: v14)
    v15[0] = v8
    let v12: Double = v23[0]
    let v7: [Double] = v3[1]
    let v18: s0 = v11.p0
    let v28: s0 = f46(v14)
    let v16: [Double] = v5[1]
    let v19: s1 = f42(v11)
    var v24: [[Double]] = v3
    let v25: s1 = f42(v1)
    let v32: s0 = v25.p0
    v8 = v7
    v6.p0 = v5
    let v43: s0 = f46(v28)
    var v20: [[Double]] = v15
    let v22: s0 = f40(v13)
    let v42: Double = v2[0]
    let v30: [s1] = [v19, v25, v11, v19, v11, v1, v25]
    v20 = v5
    let v33: s0 = f46(v43)
    let v61: [Double] = v24[0]
    v6.p0 = v5
    v15[1] = v61
    var v60: [s1] = v30
    var v35: [[Double]] = v24
    v24[0] = v16
    let v66: s1 = v60[5]
    let v75: s0 = v11.p1
    v35[1] = v8
    v35 = v3
    var v41: [Double] = v8
    v6.p0 = v20
    let v51: [[Double]] = v22.p1
    let v96: [[Double]] = v0.p0
    let v40: s1 = f42(v66)
    var v101: [[Double]] = v51
    let v65: s0 = v40.p0
    v6.p0 = v5
    let v94: s1 = f42(v66)
    let v64: [s0] = [v0, v65]
    var v83: Double = v12
    let v142: [[Double]] = v75.p0
    v24[1] = v41
    let v58: s0 = v64[1]
    let v73: [[Double]] = v18.p1
    let v123: s1 = f42(v94)
    let v105: s0 = f40(v32)
    v6.p1 = v101
    v20[0] = v61
    var v86: [Double] = v41
    let v133: s0 = v11.p0
    let v89: [[Double]] = v105.p0
    v6.p0 = v35
    v6.p0 = v3
    let v52: s0 = f40(v133)
    let v137: [[Double]] = v58.p1
    let v108: [[Double]] = v0.p1
    let v144: Double = v12 * v42
    let v208: s1 = f42(v123)
    v6.p1 = v73
    v8[0] = v83
    v6.p1 = v108
    let v117: [[Double]] = v52.p0
    v6.p0 = v96
    let v155: s0 = v208.p0
    var v69: [[Double]] = v117
    v6.p0 = v89
    var v291: s0 = v155
    let v162: [[Double]] = v33.p1
    v291.p0 = v142
    v86[0] = v144
    v291.p1 = v162
    v8 = v86
    v291.p1 = v137
    v6.p0 = v69
    v6.p0 = v35
    return v291
  }
  func f26(_ v0: Double) -> Double {
    var v6: Double = v0
    var v3: Double = v0
    var v7: Double = v3
    var v5: Double = v0
    var v2: Double = v5
    var v1: Double = v7
    var v8: Double = v5
    v7 = v0
    var v4: Double = v2
    var v18: Double = v8
    let v19: Double = v0 + v3
    var v12: Double = v2
    let v11: Double = v0 - v6
    var v13: Double = v4
    v18 = v0
    v5 = v2
    var v16: Double = v11
    var v25: Double = v1
    var v30: Double = v18
    var v17: Double = v12
    let v46: Double = v30 + v6
    let v9: [Double] = [v25, v5, v17, v46, v16, v17]
    let v23: [Double] = [v30, v25, v19, v11, v13, v6]
    let v22: Double = v23[3]
    var v26: [Double] = v9
    let v29: Double = v26[0]
    v26[0] = v6
    let v48: [Double] = [v22, v30, v11, v4, v29]
    v26[2] = v5
    var v39: [Double] = v48
    let v58: Double = v39[1]
    return v58
  }
  func f23(_ v0: s0, _ v1: s0) -> s0 {
    let v5: s0 = f46(v1)
    let v4: [[Double]] = v1.p0
    let v13: [[Double]] = v5.p1
    let v9: [Double] = v4[1]
    let v28: Double = v9[0]
    let v18: [[Double]] = v1.p0
    let v15: [Double] = v13[0]
    var v20: [Double] = v9
    let v12: [[Double]] = v1.p1
    let v65: Double = f26(v28)
    let v24: Double = f26(v65)
    v20[0] = v65
    v20[0] = v65
    var v17: [[Double]] = v4
    v17[1] = v20
    v20[0] = v28
    v17[1] = v15
    v20[0] = v24
    let v26: Double = v9[0]
    let v30: s0 = s0(p0: v17, p1: v12)
    let v27: [Double] = v12[1]
    v17[0] = v27
    v20[0] = v26
    var v53: s0 = v30
    var v51: [[Double]] = v18
    v53.p0 = v51
    v17 = v18
    return v53
  }
  func f21(_ v0: s2) -> s2 {
    return v0
  }
  func f20(_ v0: s2) -> s2 {
    var v1: s2 = v0
    v1 = v0
    let v35: [[s0]] = v1.p0
    let v88: s2 = f21(v1)
    v1.p0 = v35
    return v88
  }
  func f18(_ v0: s2) -> s2 {
    let v5: s2 = f21(v0)
    let v26: s2 = f20(v0)
    let v46: [[s0]] = v5.p0
    let v159: s2 = f21(v26)
    var v112: s2 = v159
    v112.p0 = v46
    let v254: s2 = f20(v112)
    return v254
  }
  func f9(_ v0: s2) -> s2 {
    return v0
  }
  func f6(_ v0: s0) -> s0 {
    let v1: [s0] = [v0, v0, v0, v0, v0]
    let v7: s1 = s1(p0: v0, p1: v0)
    let v3: s0 = v1[2]
    let v6: s0 = v1[3]
    let v9: s0 = v7.p1
    let v2: [[Double]] = v3.p1
    let v12: [Double] = v2[0]
    var v15: [[Double]] = v2
    v15[0] = v12
    var v14: s0 = v9
    var v25: [[Double]] = v15
    v14.p1 = v2
    let v19: s0 = f23(v14, v14)
    let v28: [[Double]] = v3.p1
    let v22: s0 = f33(v19)
    v14.p1 = v15
    v14.p1 = v25
    v14.p1 = v28
    v14 = v6
    return v22
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v5: s2 = v0[0]
    var v7: [s2] = v0
    let v2: s2 = f9(v5)
    v7[0] = v2
    let v4: s2 = f9(v2)
    let v9: s2 = v7[0]
    let v15: s2 = f9(v2)
    var v8: s2 = v9
    v7[0] = v2
    let v14: s2 = v7[0]
    let v29: s2 = f18(v4)
    let v17: s2 = f18(v14)
    let v21: s0 = v9.p1
    let v33: s0 = f6(v21)
    v7[0] = v15
    let v35: s0 = v17.p1
    let v25: s0 = f33(v33)
    let v67: [[Double]] = v35.p1
    var v37: s0 = v25
    var v34: [[Double]] = v67
    v37.p1 = v34
    v7[0] = v5
    let v50: [Double] = v34[0]
    let v48: Double = v50[0]
    let v117: [[Double]] = v37.p1
    v8 = v5
    v7[0] = v8
    let v87: [Double] = v117[2]
    v7[0] = v29
    var v151: Double = v48
    v34[1] = v87
    return v151
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])], [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]], p1: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]))]
    let v1: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
