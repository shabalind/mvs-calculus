  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  func f45(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p1
    let v2: [[Double]] = v0.p1
    var v6: [[Double]] = v2
    let v8: [Double] = v3[2]
    let v7: [[[Double]]] = [v6, v6, v2]
    let v4: [[Double]] = v0.p0
    let v9: [[Double]] = v7[1]
    let v5: [Double] = v9[0]
    var v15: [[Double]] = v9
    let v1: [[Double]] = v0.p1
    v6[1] = v5
    v15[0] = v8
    let v22: [[[Double]]] = [v15]
    var v16: [[[Double]]] = v22
    let v36: [[Double]] = v0.p1
    let v17: [Double] = v2[2]
    var v23: [[[Double]]] = v16
    v16[0] = v3
    let v27: [[Double]] = v0.p0
    var v37: [[[Double]]] = v7
    let v20: [[Double]] = v0.p1
    let v31: [[Double]] = v0.p1
    v15[0] = v8
    let v35: [[Double]] = v0.p1
    v23[0] = v27
    let v50: [[Double]] = v0.p1
    let v72: [[Double]] = v0.p0
    let v67: s0 = s0(p0: v35, p1: v15)
    var v60: s0 = v67
    v60.p0 = v72
    let v30: [[Double]] = v37[2]
    v60.p1 = v30
    v16[0] = v35
    var v44: [[[Double]]] = v23
    v6[2] = v17
    v16[0] = v20
    var v54: [[Double]] = v31
    let v112: [[Double]] = v0.p0
    let v90: [[Double]] = v0.p1
    let v123: [[Double]] = v60.p0
    v60.p1 = v1
    let v104: [[Double]] = v0.p1
    let v195: [[Double]] = v60.p0
    v60.p0 = v36
    var v52: [[Double]] = v6
    v60.p0 = v123
    v60.p0 = v2
    v60.p1 = v50
    let v84: s0 = s0(p0: v90, p1: v195)
    v23[0] = v4
    v60.p1 = v72
    v60.p1 = v104
    let v171: [[Double]] = v44[0]
    v60.p0 = v112
    v60.p1 = v171
    v60.p1 = v54
    v60.p1 = v72
    v54[2] = v5
    v60.p1 = v52
    return v84
  }
  func f42(_ v0: [[s0]], _ v1: s1) -> [[s0]] {
    return v0
  }
  func f38(_ v0: s1) -> s1 {
    let v10: [[s0]] = v0.p0
    let v9: [[s0]] = f42(v10, v0)
    let v24: [[s0]] = v0.p0
    let v28: [s0] = v24[1]
    let v29: [[s0]] = f42(v9, v0)
    let v47: [[s0]] = f42(v9, v0)
    let v25: [[s0]] = f42(v9, v0)
    let v40: s0 = v0.p1
    var v32: [s0] = v28
    let v39: s1 = s1(p0: v25, p1: v40)
    let v31: s0 = v28[0]
    let v35: [s0] = v29[0]
    var v59: [[s0]] = v29
    let v54: [[s0]] = f42(v59, v0)
    var v62: [[s0]] = v54
    var v112: s1 = v39
    v59[1] = v35
    v62[1] = v32
    let v81: [s0] = v47[0]
    v62[1] = v81
    v112.p0 = v62
    v112.p1 = v31
    return v112
  }
  func f37(_ v0: s1) -> s1 {
    let v5: [[s0]] = v0.p0
    var v4: [[s0]] = v5
    let v6: [s0] = v4[0]
    let v9: s0 = v0.p1
    let v15: s1 = f38(v0)
    let v7: s0 = v6[0]
    let v13: s0 = f45(v9)
    let v17: [[s0]] = v0.p0
    var v26: s1 = v15
    v26.p1 = v13
    v26.p1 = v7
    v26.p0 = v17
    return v26
  }
  func f36(_ v0: s1, _ v1: [s0]) -> [s0] {
    var v5: [s0] = v1
    let v6: s0 = v0.p1
    v5[0] = v6
    let v3: [[Double]] = v6.p1
    v5 = v1
    var v4: s1 = v0
    v5[0] = v6
    let v14: [[s0]] = v4.p0
    var v17: s0 = v6
    v5[0] = v17
    v17.p1 = v3
    let v20: s0 = v4.p1
    let v10: s1 = f38(v4)
    let v12: s1 = f38(v4)
    let v24: s0 = f45(v6)
    let v16: s0 = v0.p1
    let v33: s0 = f45(v16)
    let v29: [[s0]] = v10.p0
    v5[0] = v33
    v5[0] = v20
    let v59: s0 = v5[0]
    let v68: [[s0]] = f42(v29, v12)
    v4.p0 = v14
    let v54: [[Double]] = v24.p1
    v17.p1 = v54
    v4.p1 = v59
    let v50: [s0] = v68[1]
    return v50
  }
  func f35(_ v0: s1) -> s1 {
    var v6: s1 = v0
    let v1: s0 = v6.p1
    let v7: s1 = f38(v0)
    v6.p1 = v1
    var v3: s1 = v0
    let v5: s1 = f37(v6)
    let v10: [s1] = [v7]
    let v4: s1 = v10[0]
    var v11: s0 = v1
    let v9: [[Double]] = v1.p0
    let v25: s1 = v10[0]
    var v17: [[Double]] = v9
    var v13: [[Double]] = v9
    let v12: [[s0]] = v7.p0
    let v14: [[s0]] = v0.p0
    let v15: [s0] = v14[1]
    v11.p1 = v9
    let v43: s0 = f45(v11)
    var v30: [[s0]] = v12
    var v16: s0 = v11
    var v20: [[s0]] = v30
    let v21: s0 = v15[0]
    let v38: s1 = f37(v6)
    let v49: [s1] = [v7, v4, v3, v0]
    let v37: s1 = f37(v4)
    v6.p0 = v20
    var v19: [[Double]] = v13
    var v22: [s1] = v49
    let v35: s1 = v49[0]
    let v50: [[Double]] = v43.p1
    var v27: s0 = v21
    v3 = v0
    v22 = v49
    let v33: [[Double]] = v16.p0
    let v62: s1 = v22[3]
    v16 = v27
    let v47: [s0] = f36(v38, v15)
    let v26: [[s0]] = f42(v20, v35)
    var v76: s1 = v25
    v27.p1 = v19
    v16.p1 = v33
    let v46: [Double] = v50[0]
    let v52: [s0] = f36(v6, v47)
    v22[1] = v0
    v11.p0 = v17
    let v39: s1 = f37(v3)
    v16 = v11
    let v24: s1 = f38(v37)
    v22[1] = v76
    let v34: s1 = v10[0]
    let v64: [[Double]] = v21.p1
    var v103: [s0] = v52
    let v86: [[s0]] = f42(v30, v5)
    v20[1] = v103
    let v87: [[s0]] = v34.p0
    let v121: s0 = v52[0]
    v17[1] = v46
    var v63: [[Double]] = v9
    v3.p0 = v86
    v22[0] = v39
    v3.p1 = v16
    let v56: s1 = f38(v24)
    v63[0] = v46
    v30 = v20
    var v96: s1 = v62
    var v57: [[Double]] = v63
    let v232: [s0] = v30[1]
    let v162: s0 = s0(p0: v64, p1: v19)
    v27.p0 = v57
    let v134: [[Double]] = v121.p0
    v20 = v87
    v30[1] = v232
    v11.p0 = v134
    v3.p0 = v26
    v27 = v43
    let v202: s1 = f38(v96)
    let v280: [[s0]] = v56.p0
    v6.p0 = v280
    let v106: [[s0]] = f42(v87, v4)
    v3.p0 = v106
    v103[0] = v162
    v76 = v24
    return v202
  }
  func f34(_ v0: s0, _ v1: [[s0]]) -> s0 {
    var v3: s0 = v0
    let v6: [[Double]] = v0.p0
    v3.p1 = v6
    let v5: [Double] = v6[2]
    let v7: [Double] = v6[2]
    var v9: [[Double]] = v6
    let v14: [[Double]] = v0.p0
    v3.p1 = v9
    var v10: s0 = v3
    let v18: s0 = f45(v3)
    let v12: [[Double]] = v18.p1
    v3.p1 = v9
    let v25: s1 = s1(p0: v1, p1: v10)
    let v30: [[Double]] = v0.p0
    v3.p0 = v30
    v9[0] = v5
    v3.p0 = v14
    let v17: s0 = v25.p1
    let v23: [[Double]] = v17.p1
    var v54: [Double] = v5
    let v28: s0 = v25.p1
    v9[1] = v54
    let v50: Double = v7[0]
    var v31: s0 = v28
    v3.p0 = v12
    let v66: [Double] = [v50, v50, v50, v50, v50, v50]
    var v60: [Double] = v66
    v31.p1 = v23
    var v149: [Double] = v60
    let v83: s0 = f45(v31)
    let v155: Double = v149[5]
    let v140: [[Double]] = v10.p0
    let v198: s0 = f45(v83)
    v3.p0 = v140
    v54[0] = v155
    v3.p1 = v140
    return v198
  }
  func f29(_ v0: s1) -> s1 {
    let v2: [[s0]] = v0.p0
    let v4: s0 = v0.p1
    let v7: s1 = s1(p0: v2, p1: v4)
    let v16: s1 = f37(v7)
    let v18: s1 = f37(v16)
    var v49: s1 = v18
    return v49
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    var v5: s1 = v0
    let v7: s0 = v5.p1
    let v3: [s0] = [v7, v7, v7, v7, v7]
    let v4: s1 = f29(v0)
    var v14: s0 = v7
    var v11: [s0] = v3
    let v6: [[s0]] = v0.p0
    v11[2] = v14
    let v12: s0 = v11[1]
    let v13: s0 = v3[2]
    let v15: s0 = v11[1]
    let v20: s1 = f35(v0)
    let v30: s1 = f35(v4)
    let v10: [s0] = v6[0]
    let v25: [s0] = v6[1]
    let v39: s0 = v10[0]
    let v23: s1 = s1(p0: v6, p1: v12)
    let v32: [[Double]] = v13.p0
    let v43: [[s0]] = v30.p0
    let v46: [[s0]] = v20.p0
    let v72: [[Double]] = v7.p1
    var v31: [s0] = v10
    let v16: [s0] = [v7, v15, v15, v14, v15, v13]
    let v40: [[Double]] = v13.p1
    let v35: s0 = v10[0]
    let v22: [Double] = v40[1]
    let v28: s0 = v16[0]
    v11[1] = v13
    let v34: Double = v22[0]
    let v27: s0 = f45(v28)
    var v44: Double = v34
    let v172: [[Double]] = v35.p0
    v11[1] = v28
    var v60: [[s0]] = v46
    let v57: [[Double]] = v27.p0
    var v92: [s0] = v31
    var v80: [[s0]] = v6
    v60[1] = v10
    let v94: s0 = f34(v14, v60)
    let v151: [s0] = v43[0]
    v14 = v35
    v14.p1 = v57
    v60[0] = v92
    var v68: s0 = v13
    let v100: [[Double]] = v68.p0
    v80[1] = v151
    v68.p0 = v172
    v80[0] = v25
    v68.p1 = v72
    v31[0] = v39
    v5.p0 = v80
    let v119: s1 = f29(v23)
    let v89: s0 = v3[4]
    let v168: s0 = v119.p1
    let v138: [[Double]] = v39.p1
    v68.p1 = v138
    v92[0] = v12
    v92[0] = v89
    v92[0] = v168
    let v111: s0 = v5.p1
    v14.p0 = v32
    let v244: [[Double]] = v111.p0
    v14.p0 = v100
    v5.p1 = v94
    let v299: Double = v44 - v44
    v68.p1 = v244
    v11[3] = v15
    return v299
  }
  func benchmark() {
    let v0: s1 = s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])], [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])]], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]))
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
