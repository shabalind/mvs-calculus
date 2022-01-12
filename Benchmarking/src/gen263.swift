  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s3 {
    var p0: s1
    var p1: s2
  }
  struct s4 {
    var p0: [[s0]]
    var p1: [s1]
  }
  struct s7 {
    var p0: s4
    var p1: s4
  }
  func f89(_ v0: s3) -> s3 {
    var v1: s3 = v0
    var v3: s3 = v1
    var v7: s3 = v0
    let v2: s2 = v7.p1
    v7.p1 = v2
    v1.p1 = v2
    v1.p1 = v2
    var v19: s3 = v3
    return v19
  }
  func f88(_ v0: s3) -> s3 {
    var v4: s3 = v0
    let v5: s3 = f89(v4)
    let v1: s1 = v4.p0
    v4.p0 = v1
    var v2: s3 = v5
    let v8: s3 = f89(v0)
    v2 = v8
    v4 = v0
    let v3: s2 = v8.p1
    var v9: s3 = v2
    v9.p0 = v1
    let v18: [[s0]] = v3.p1
    v4.p1 = v3
    var v21: s2 = v3
    let v16: s3 = f89(v9)
    let v45: [[[s0]]] = [v18, v18, v18, v18, v18]
    v2.p0 = v1
    v4.p0 = v1
    let v48: [[s0]] = v45[3]
    v9.p1 = v21
    v21.p1 = v48
    let v156: s3 = f89(v16)
    v9.p0 = v1
    return v156
  }
  func f87(_ v0: s2) -> s2 {
    var v6: s2 = v0
    let v8: [[s0]] = v6.p1
    var v7: s2 = v0
    v7.p1 = v8
    let v2: [s0] = v0.p0
    let v10: [s0] = v7.p0
    let v1: [s0] = v7.p0
    var v14: [[s0]] = v8
    v14[0] = v1
    v14[0] = v2
    v7.p1 = v8
    let v11: [s0] = v14[0]
    v6.p0 = v1
    v14[0] = v10
    v14[0] = v10
    var v18: [[s0]] = v8
    let v15: [s0] = v8[0]
    let v20: s2 = s2(p0: v11, p1: v8)
    let v23: [s0] = v0.p0
    var v31: s2 = v6
    let v35: [s0] = v31.p0
    v6.p1 = v8
    v18[0] = v15
    var v28: s2 = v31
    v18[0] = v23
    v18[0] = v11
    v28.p0 = v1
    v6.p1 = v14
    let v51: [s2] = [v6, v28, v7, v7]
    v6.p0 = v35
    let v141: [s0] = v20.p0
    var v104: [s2] = v51
    v7.p0 = v35
    v14[0] = v1
    var v106: [s0] = v141
    var v163: [s2] = v104
    v28.p1 = v18
    v163[3] = v20
    v6.p0 = v11
    v28.p0 = v106
    let v365: s2 = v163[0]
    return v365
  }
  func f85(_ v0: s2) -> s2 {
    let v7: [[s0]] = v0.p1
    let v1: [s0] = v0.p0
    let v3: [s0] = v0.p0
    var v9: s2 = v0
    var v5: s2 = v0
    let v6: s2 = f87(v5)
    let v4: s2 = f87(v9)
    v9 = v6
    let v2: s2 = f87(v9)
    let v18: s2 = f87(v2)
    v5.p0 = v1
    let v17: s0 = v3[0]
    let v15: s2 = f87(v4)
    let v38: s2 = f87(v18)
    let v43: [s0] = v38.p0
    v9.p1 = v7
    var v25: s2 = v38
    let v39: s1 = s1(p0: v7, p1: v17)
    let v50: s2 = f87(v15)
    v25 = v50
    let v124: [[s0]] = v39.p0
    v5.p1 = v124
    v25.p0 = v43
    return v25
  }
  func f84(_ v0: s4, _ v1: Double) -> Double {
    let v7: [s1] = v0.p1
    let v9: [s1] = v0.p1
    let v5: s1 = v9[0]
    let v6: [s1] = v0.p1
    let v11: [s1] = v0.p1
    let v13: s0 = v5.p1
    var v30: s4 = v0
    let v20: s7 = s7(p0: v0, p1: v30)
    let v27: s1 = v11[0]
    v30.p1 = v7
    v30.p1 = v7
    v30.p1 = v6
    v30.p1 = v11
    var v23: s1 = v27
    var v19: s7 = v20
    let v18: [[s0]] = v30.p0
    v30.p1 = v9
    let v24: [s0] = v18[2]
    var v42: [[s0]] = v18
    v42 = v18
    let v33: s0 = v24[0]
    v30.p0 = v42
    var v21: [s1] = v11
    v19.p0 = v30
    var v41: [s1] = v11
    let v22: s0 = v24[0]
    var v29: [s0] = v24
    var v48: s0 = v13
    var v31: [s1] = v21
    var v65: [s0] = v24
    let v34: s4 = v19.p0
    v30.p1 = v31
    let v85: s0 = v29[0]
    v41[0] = v23
    v65[0] = v48
    v23.p1 = v33
    let v57: [[s0]] = v34.p0
    v30.p1 = v7
    v23.p1 = v22
    let v61: [Double] = v85.p0
    v23.p1 = v85
    let v44: s4 = v19.p1
    v19.p1 = v44
    var v100: [[s0]] = v42
    var v81: [s1] = v31
    v21[0] = v5
    v23.p1 = v22
    v23.p1 = v22
    let v86: s0 = v65[0]
    v48.p0 = v61
    let v188: s1 = v41[0]
    let v141: [s0] = v57[1]
    v42[0] = v29
    v81[0] = v23
    v30.p1 = v81
    v29 = v141
    v100[2] = v65
    let v121: [Double] = v86.p0
    v41 = v31
    let v110: [s0] = v100[0]
    v42[0] = v110
    v31[0] = v188
    let v146: Double = v121[0]
    return v146
  }
  func f83(_ v0: s1) -> s1 {
    var v3: s1 = v0
    let v4: s0 = v0.p1
    v3.p1 = v4
    let v2: [[s0]] = v3.p0
    var v9: s1 = v3
    let v1: [s1] = [v3, v0, v3, v3, v9, v3]
    var v7: [s1] = v1
    let v8: [Double] = v4.p0
    v7[2] = v3
    let v15: s0 = v0.p1
    v7[5] = v3
    let v5: s1 = s1(p0: v2, p1: v15)
    let v17: s1 = v7[0]
    var v20: [[s0]] = v2
    let v32: s1 = s1(p0: v2, p1: v15)
    v9.p1 = v4
    var v18: [[s0]] = v20
    var v12: s1 = v0
    let v25: [[s1]] = [v7, v7, v1, v1]
    let v14: s0 = v5.p1
    let v43: s0 = v17.p1
    let v29: [[s0]] = v12.p0
    let v37: [s1] = v25[0]
    v12.p0 = v18
    let v35: s0 = v0.p1
    var v54: [[s0]] = v20
    let v23: [[Double]] = v35.p1
    var v22: [[Double]] = v23
    let v46: s0 = v3.p1
    let v112: [s0] = v29[0]
    let v57: [Double] = v46.p0
    v9.p1 = v43
    let v68: s1 = v1[2]
    v12.p0 = v18
    v12.p1 = v35
    v7[0] = v17
    v12.p0 = v29
    v12.p1 = v4
    v12.p0 = v18
    let v45: s1 = v37[0]
    v12.p0 = v29
    var v99: s0 = v46
    v99.p0 = v8
    v3.p1 = v43
    v9.p0 = v54
    v7[1] = v3
    let v58: [[Double]] = v46.p2
    v3.p0 = v2
    let v67: s0 = v68.p1
    v9.p1 = v67
    v99.p2 = v58
    v3.p1 = v14
    let v87: [[s0]] = v17.p0
    v54[0] = v112
    v9.p1 = v99
    v22[0] = v57
    v12.p0 = v87
    v99.p1 = v22
    v12.p1 = v15
    v7[2] = v32
    let v52: s2 = s2(p0: v112, p1: v29)
    let v166: s2 = f85(v52)
    let v132: s2 = f85(v166)
    let v148: s2 = f85(v132)
    let v216: s3 = s3(p0: v45, p1: v148)
    let v268: s3 = f88(v216)
    let v133: s3 = f88(v268)
    let v126: s3 = f89(v133)
    let v141: s1 = v126.p0
    return v141
  }
  func f64(_ v0: s7, _ v1: s7, _ v2: s4) -> s7 {
    var v33: s7 = v0
    var v25: s7 = v33
    var v23: s7 = v1
    let v28: s4 = v23.p0
    let v42: s4 = v25.p1
    v25.p1 = v42
    v33.p0 = v28
    return v25
  }
  func f44(_ v0: [[s0]]) -> [[s0]] {
    let v3: [s0] = v0[0]
    let v10: [s0] = v0[1]
    let v23: [[s0]] = [v3, v3, v10]
    return v23
  }
  func f37(_ v0: [[s0]]) -> [[s0]] {
    let v4: [[s0]] = f44(v0)
    let v2: [[s0]] = f44(v4)
    let v13: [s0] = v2[2]
    var v30: [[s0]] = v2
    v30[2] = v13
    v30[1] = v13
    var v49: [s0] = v13
    let v143: [[s0]] = f44(v30)
    let v136: [[s0]] = f44(v143)
    v30[0] = v49
    v30[0] = v13
    return v136
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: Double) -> Double {
    let v5: s4 = v0.p0
    let v6: s7 = f64(v0, v0, v5)
    let v3: s7 = f64(v0, v0, v5)
    let v7: s4 = v6.p0
    let v2: Double = v1 - v1
    var v4: s4 = v7
    let v18: s4 = v0.p1
    let v9: s7 = f64(v3, v0, v4)
    let v13: [[s0]] = v5.p0
    let v21: [[s0]] = f44(v13)
    var v10: Double = v1
    let v27: [[s0]] = f37(v21)
    v4.p0 = v21
    let v42: [[s0]] = v5.p0
    let v26: [[s0]] = f44(v42)
    let v33: [[s0]] = f37(v21)
    let v45: [Double] = [v1, v10, v1]
    var v41: [[s0]] = v27
    var v65: [[s0]] = v26
    let v23: Double = f84(v18, v10)
    let v37: Double = v45[1]
    let v87: [s0] = v41[2]
    let v32: Double = v2 * v23
    let v83: s4 = v9.p1
    v4.p0 = v65
    let v55: s7 = f64(v0, v9, v83)
    let v107: [s1] = v7.p1
    var v96: [s1] = v107
    var v92: [s1] = v96
    let v163: [[s0]] = v5.p0
    var v143: [s1] = v92
    v4.p0 = v163
    v10 = v32
    let v91: s1 = v107[0]
    v96[0] = v91
    v4.p0 = v33
    let v90: s1 = f83(v91)
    v92[0] = v90
    v65[2] = v87
    v4.p1 = v143
    v4.p1 = v92
    let v226: s4 = v55.p0
    let v446: Double = f84(v226, v37)
    return v446
  }
  func benchmark() {
    let v0: s7 = s7(p0: s4(p0: [[s0(p0: [0.0], p1: [[1.0], [2.0], [3.0]], p2: [[4.0], [5.0]])], [s0(p0: [6.0], p1: [[7.0], [8.0], [9.0]], p2: [[10.0], [11.0]])], [s0(p0: [12.0], p1: [[13.0], [14.0], [15.0]], p2: [[16.0], [17.0]])]], p1: [s1(p0: [[s0(p0: [18.0], p1: [[19.0], [20.0], [21.0]], p2: [[22.0], [23.0]])]], p1: s0(p0: [24.0], p1: [[25.0], [26.0], [27.0]], p2: [[28.0], [29.0]]))]), p1: s4(p0: [[s0(p0: [30.0], p1: [[31.0], [32.0], [33.0]], p2: [[34.0], [35.0]])], [s0(p0: [36.0], p1: [[37.0], [38.0], [39.0]], p2: [[40.0], [41.0]])], [s0(p0: [42.0], p1: [[43.0], [44.0], [45.0]], p2: [[46.0], [47.0]])]], p1: [s1(p0: [[s0(p0: [48.0], p1: [[49.0], [50.0], [51.0]], p2: [[52.0], [53.0]])]], p1: s0(p0: [54.0], p1: [[55.0], [56.0], [57.0]], p2: [[58.0], [59.0]]))]))
    let v1: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
