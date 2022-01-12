  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
    var p2: s0
  }
  struct s2 {
    var p0: s1
    var p1: [s1]
  }
  func f50(_ v0: Double) -> Double {
    var v5: Double = v0
    v5 = v0
    var v6: Double = v0
    var v1: Double = v5
    var v7: Double = v6
    let v2: Double = v1 / v1
    let v3: Double = v7 * v6
    var v4: Double = v7
    var v10: Double = v2
    let v8: [Double] = [v4]
    let v11: Double = v8[0]
    var v18: Double = v3
    var v14: [Double] = v8
    var v33: [Double] = v14
    v10 = v2
    var v15: Double = v11
    var v19: Double = v10
    var v86: Double = v15
    let v30: Double = v14[0]
    var v23: Double = v3
    v14[0] = v30
    var v29: Double = v7
    v14[0] = v19
    var v35: [Double] = v33
    let v55: Double = v14[0]
    v23 = v11
    v33[0] = v30
    v1 = v29
    v33[0] = v55
    var v28: [Double] = v8
    var v66: [Double] = v28
    var v20: Double = v18
    let v48: Double = v28[0]
    v14[0] = v30
    v28[0] = v0
    v33[0] = v86
    let v71: Double = v8[0]
    let v70: [[Double]] = [v35, v33, v14, v66, v14]
    v28[0] = v23
    var v51: [Double] = v66
    var v52: [[Double]] = v70
    var v54: [[Double]] = v52
    v52[1] = v28
    let v103: [Double] = v54[0]
    v28[0] = v20
    v51[0] = v48
    var v154: [Double] = v103
    let v123: Double = v51[0]
    v14[0] = v123
    let v167: Double = v154[0]
    v14[0] = v71
    return v167
  }
  func f43(_ v0: s2) -> s2 {
    var v1: s2 = v0
    let v7: [s1] = v1.p1
    var v3: s2 = v1
    var v30: s2 = v3
    v1.p1 = v7
    return v30
  }
  func f29(_ v0: s2) -> s2 {
    let v1: s2 = f43(v0)
    var v4: s2 = v1
    var v2: s2 = v1
    let v3: [s2] = [v4, v1, v0, v2, v1, v0, v1]
    v4 = v0
    let v19: s2 = v3[2]
    let v36: s2 = f43(v19)
    let v35: s2 = f43(v36)
    let v24: s2 = f43(v35)
    return v24
  }
  func f14(_ v0: Double) -> Double {
    let v6: [Double] = [v0, v0, v0]
    let v2: Double = v6[0]
    let v1: Double = f50(v2)
    let v5: Double = v6[2]
    var v7: [Double] = v6
    v7[1] = v5
    let v3: Double = v7[0]
    v7 = v6
    var v10: [Double] = v7
    let v13: Double = v7[2]
    v10[0] = v13
    let v9: Double = f50(v2)
    let v18: Double = f50(v0)
    let v16: Double = f50(v9)
    let v19: Double = f50(v13)
    v10[1] = v18
    let v12: Double = f50(v9)
    let v15: Double = f50(v16)
    var v20: [Double] = v6
    var v17: [Double] = v6
    var v27: Double = v13
    var v34: [Double] = v10
    let v40: Double = v15 / v16
    let v29: Double = f50(v15)
    v20[0] = v12
    v10[1] = v27
    var v31: Double = v0
    var v30: [Double] = v6
    let v35: Double = f50(v13)
    var v21: Double = v29
    v34[0] = v35
    let v23: Double = v20[0]
    var v106: [Double] = v17
    v34[2] = v19
    v10[0] = v3
    v10 = v7
    let v32: Double = f50(v29)
    var v66: Double = v27
    let v53: Double = v7[0]
    var v57: [Double] = v6
    let v71: Double = v10[0]
    var v62: Double = v21
    let v49: Double = f50(v32)
    let v45: Double = f50(v53)
    v10[0] = v40
    v20[2] = v1
    let v83: Double = v20[1]
    var v58: Double = v5
    let v95: Double = f50(v62)
    v30[0] = v66
    let v81: Double = f50(v49)
    let v82: Double = f50(v31)
    var v143: [Double] = v106
    let v107: Double = f50(v9)
    var v111: [Double] = v143
    v111[1] = v107
    v111[2] = v95
    v7[2] = v49
    var v85: [Double] = v111
    let v139: Double = f50(v35)
    v7[1] = v82
    v143[2] = v3
    v17[2] = v23
    v57[2] = v107
    let v227: Double = v111[0]
    v106[2] = v227
    v30[2] = v139
    v7[1] = v71
    let v289: [[Double]] = [v34, v20, v6, v30, v85, v57, v106]
    v57[1] = v45
    let v194: [Double] = v289[3]
    v34[2] = v82
    let v110: Double = v194[2]
    v57[0] = v58
    v20[1] = v83
    v85[2] = v81
    return v110
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s2, _ v2: Double) -> Double {
    let v5: s2 = f29(v0)
    let v3: s1 = v5.p0
    let v10: s1 = v1.p0
    let v9: s0 = v3.p1
    var v26: s0 = v9
    let v23: [[Double]] = v26.p0
    let v16: [[Double]] = v26.p0
    let v13: [Double] = v16[0]
    v26.p0 = v23
    let v32: [[Double]] = v9.p0
    let v22: [[s0]] = v3.p0
    v26.p0 = v16
    let v60: [Double] = v32[1]
    let v50: Double = v13[0]
    var v47: [[s0]] = v22
    var v54: [Double] = v60
    v26.p0 = v16
    let v166: Double = v54[0]
    let v71: Double = v50 - v166
    let v53: [s0] = v47[0]
    let v93: [[s0]] = v10.p0
    let v112: s0 = v53[0]
    let v78: [s0] = v93[2]
    var v102: [s0] = v78
    var v118: [s0] = v102
    v47[2] = v118
    let v149: Double = f14(v71)
    v102[0] = v26
    let v120: [[Double]] = v112.p0
    v26.p0 = v120
    return v149
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]])], [s0(p0: [[3.0], [4.0], [5.0]])], [s0(p0: [[6.0], [7.0], [8.0]])]], p1: s0(p0: [[9.0], [10.0], [11.0]]), p2: s0(p0: [[12.0], [13.0], [14.0]])), p1: [s1(p0: [[s0(p0: [[15.0], [16.0], [17.0]])], [s0(p0: [[18.0], [19.0], [20.0]])], [s0(p0: [[21.0], [22.0], [23.0]])]], p1: s0(p0: [[24.0], [25.0], [26.0]]), p2: s0(p0: [[27.0], [28.0], [29.0]]))])
    let v1: s2 = s2(p0: s1(p0: [[s0(p0: [[30.0], [31.0], [32.0]])], [s0(p0: [[33.0], [34.0], [35.0]])], [s0(p0: [[36.0], [37.0], [38.0]])]], p1: s0(p0: [[39.0], [40.0], [41.0]]), p2: s0(p0: [[42.0], [43.0], [44.0]])), p1: [s1(p0: [[s0(p0: [[45.0], [46.0], [47.0]])], [s0(p0: [[48.0], [49.0], [50.0]])], [s0(p0: [[51.0], [52.0], [53.0]])]], p1: s0(p0: [[54.0], [55.0], [56.0]]), p2: s0(p0: [[57.0], [58.0], [59.0]]))])
    let v2: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
