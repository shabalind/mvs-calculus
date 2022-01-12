  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: s1
    var p1: [Double]
  }
  struct s4 {
    var p0: [s0]
    var p1: [s3]
  }
  struct s5 {
    var p0: s3
    var p1: s2
  }
  struct s6 {
    var p0: s3
    var p1: s2
  }
  struct s7 {
    var p0: [s6]
    var p1: [[s3]]
  }
  struct s10 {
    var p0: s4
    var p1: [s1]
  }
  func f12(_ v0: [s3]) -> [s3] {
    var v2: [s3] = v0
    return v2
  }
  func f11(_ v0: s4, _ v1: s2) -> s4 {
    let v4: [s0] = v0.p0
    let v11: s0 = v4[0]
    let v7: s0 = v4[0]
    let v15: s0 = v4[0]
    var v13: [s0] = v4
    v13 = v4
    var v29: [s0] = v4
    let v16: [s3] = v0.p1
    let v34: [s0] = v1.p0
    v13[1] = v7
    v13[0] = v11
    let v58: s0 = v34[0]
    v29[1] = v58
    v29[0] = v15
    let v78: s0 = v34[0]
    v29[1] = v78
    let v41: [s3] = f12(v16)
    var v82: s4 = v0
    var v62: s0 = v58
    let v59: s4 = s4(p0: v29, p1: v41)
    let v100: [[Double]] = v62.p1
    v29[1] = v62
    let v123: [s0] = v59.p0
    v82.p0 = v13
    v82.p0 = v123
    v62.p1 = v100
    return v82
  }
  func f7(_ v0: s3) -> s3 {
    let v5: [Double] = v0.p1
    let v1: [Double] = v0.p1
    var v3: s3 = v0
    let v7: [Double] = v3.p1
    let v8: [Double] = v3.p1
    let v10: s1 = v0.p0
    var v9: s1 = v10
    let v6: [Double] = v0.p1
    var v16: s3 = v3
    let v13: [[s0]] = v9.p0
    v3.p0 = v10
    let v20: s1 = v16.p0
    let v17: [s0] = v13[1]
    let v22: s0 = v17[0]
    var v35: [[s0]] = v13
    var v25: s1 = v9
    let v24: [[Double]] = v22.p1
    v9.p0 = v13
    v16.p1 = v6
    let v30: [s0] = v35[0]
    v25.p0 = v35
    let v29: s3 = s3(p0: v25, p1: v1)
    var v69: s3 = v3
    var v43: [[Double]] = v24
    var v44: s0 = v22
    let v33: [Double] = v29.p1
    let v34: [s0] = v13[1]
    let v27: [[s0]] = v25.p0
    let v54: [[s0]] = v20.p1
    let v39: [[Double]] = [v33, v7, v6, v8, v1]
    let v56: s2 = s2(p0: v30, p1: v44)
    v25.p1 = v54
    let v47: [Double] = v39[1]
    v3.p0 = v25
    let v81: [s0] = v27[0]
    var v37: [[Double]] = v39
    let v107: [Double] = v37[1]
    v25.p1 = v54
    var v60: s0 = v22
    let v32: s6 = s6(p0: v69, p1: v56)
    var v75: [[s0]] = v27
    let v48: s2 = v32.p1
    let v65: [s0] = v54[1]
    v35[2] = v65
    v9.p1 = v54
    v37[3] = v47
    var v71: s2 = v48
    v69.p1 = v107
    let v101: [[[s0]]] = [v75]
    v75[0] = v65
    v44.p1 = v43
    let v82: [[s0]] = v101[0]
    let v120: [[Double]] = v60.p1
    v16.p1 = v5
    v69.p1 = v5
    v25.p0 = v82
    v71.p0 = v30
    let v317: s5 = s5(p0: v69, p1: v71)
    v75[1] = v34
    v75[2] = v81
    let v176: s3 = v317.p0
    v44.p1 = v120
    return v176
  }
  func f6(_ v0: s2) -> s2 {
    var v8: s2 = v0
    v8 = v0
    let v1: [s0] = v0.p0
    let v3: s0 = v1[0]
    let v7: s0 = v1[0]
    let v10: [s0] = v8.p0
    let v5: s0 = v10[0]
    let v6: [[Double]] = v7.p0
    let v30: [s0] = v0.p0
    var v9: [s0] = v30
    v9[0] = v3
    var v13: s0 = v3
    let v16: [[Double]] = v5.p0
    var v11: [s0] = v9
    let v14: s2 = s2(p0: v9, p1: v5)
    let v29: s0 = v11[0]
    let v12: s0 = v10[0]
    v11[0] = v12
    let v34: [[Double]] = v12.p0
    let v18: s0 = v30[0]
    var v60: s0 = v13
    v9[0] = v60
    var v38: s0 = v60
    v9[0] = v60
    v13.p0 = v6
    let v44: [[Double]] = v12.p1
    v11[0] = v18
    let v35: [[Double]] = v13.p0
    let v40: [Double] = v34[1]
    let v26: [[Double]] = v29.p1
    var v46: [[Double]] = v26
    let v69: s0 = v14.p1
    v38.p1 = v46
    v9[0] = v38
    var v86: s0 = v69
    v86.p0 = v6
    v9[0] = v86
    v13.p1 = v26
    let v74: [[Double]] = v60.p0
    v13.p0 = v35
    v13.p0 = v16
    v13.p0 = v74
    v46[0] = v40
    v13.p1 = v44
    return v14
  }
  func f3(_ v0: s7) -> s7 {
    var v7: s7 = v0
    var v5: s7 = v7
    let v2: [s6] = v5.p0
    let v3: [[s3]] = v7.p1
    var v1: s7 = v7
    var v6: s7 = v7
    let v10: [s3] = v3[0]
    var v33: [[s3]] = v3
    let v31: [s6] = v6.p0
    v5 = v1
    v33[0] = v10
    var v19: s7 = v6
    let v17: [s3] = v33[0]
    v7.p1 = v33
    var v30: [[s3]] = v33
    v33[0] = v17
    v19.p1 = v30
    v6.p1 = v30
    let v35: [s3] = f12(v10)
    var v27: [s6] = v2
    v33[0] = v35
    v1 = v5
    v33[0] = v35
    let v89: s6 = v27[0]
    v27[0] = v89
    var v82: [s6] = v27
    v30[0] = v35
    v5 = v0
    v33[0] = v17
    v27 = v31
    let v79: [s7] = [v19, v5, v1, v6]
    v19.p0 = v82
    let v56: s7 = v79[1]
    return v56
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s7, _ v2: s10, _ v3: Double) -> Double {
    var v4: Double = v3
    var v8: s10 = v2
    let v7: s2 = f6(v0)
    let v9: s4 = v8.p0
    let v6: s7 = f3(v1)
    var v13: s4 = v9
    let v14: s2 = f6(v0)
    let v17: s7 = f3(v6)
    var v15: s4 = v13
    let v18: [[s3]] = v17.p1
    let v21: [s1] = v2.p1
    let v28: [s3] = v18[0]
    let v29: [s0] = v0.p0
    v8 = v2
    var v19: [s0] = v29
    let v20: [s3] = v18[0]
    let v16: [s3] = f12(v28)
    var v25: [s3] = v20
    let v42: Double = v4 * v4
    let v39: s4 = f11(v9, v14)
    let v51: s4 = f11(v13, v14)
    var v33: Double = v4
    v8.p0 = v51
    let v30: [s0] = v7.p0
    let v41: s0 = v19[0]
    let v26: s10 = s10(p0: v15, p1: v21)
    let v22: s4 = v26.p0
    var v68: s4 = v39
    let v48: [s0] = v22.p0
    let v43: [s3] = v68.p1
    v15.p1 = v16
    let v53: s3 = v25[0]
    let v36: [[Double]] = v41.p1
    let v32: s3 = v20[0]
    var v54: s0 = v41
    let v34: [Double] = v36[0]
    v13.p1 = v43
    var v58: [[Double]] = v36
    let v50: s3 = f7(v32)
    v58[0] = v34
    v25[0] = v50
    let v114: [[Double]] = v54.p0
    v13.p0 = v48
    let v86: Double = v42 * v33
    v25[0] = v53
    var v52: [s3] = v43
    v68.p1 = v28
    var v128: [Double] = v34
    let v98: s3 = v52[0]
    v52[0] = v53
    let v63: s0 = v30[0]
    var v120: [[Double]] = v58
    v15.p0 = v48
    v68 = v15
    var v118: Double = v86
    v68.p0 = v48
    var v97: [[Double]] = v114
    v15.p0 = v48
    v19[0] = v63
    var v99: [Double] = v128
    let v158: s0 = v29[0]
    v19[0] = v158
    let v168: [s0] = v15.p0
    v52[0] = v32
    v52[0] = v98
    let v136: Double = v99[0]
    let v153: s0 = v168[1]
    var v196: Double = v42
    let v293: Double = v118 - v196
    var v152: [[Double]] = v97
    let v124: [s0] = v68.p0
    v19[0] = v153
    v128[0] = v293
    let v173: [Double] = v152[1]
    v15.p1 = v52
    v54.p1 = v120
    v99 = v173
    v68.p0 = v124
    return v136
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]])], p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]]))
    let v1: s7 = s7(p0: [s6(p0: s3(p0: s1(p0: [[s0(p0: [[6.0], [7.0]], p1: [[8.0]])], [s0(p0: [[9.0], [10.0]], p1: [[11.0]])], [s0(p0: [[12.0], [13.0]], p1: [[14.0]])]], p1: [[s0(p0: [[15.0], [16.0]], p1: [[17.0]])], [s0(p0: [[18.0], [19.0]], p1: [[20.0]])]]), p1: [21.0, 22.0]), p1: s2(p0: [s0(p0: [[23.0], [24.0]], p1: [[25.0]])], p1: s0(p0: [[26.0], [27.0]], p1: [[28.0]]))), s6(p0: s3(p0: s1(p0: [[s0(p0: [[29.0], [30.0]], p1: [[31.0]])], [s0(p0: [[32.0], [33.0]], p1: [[34.0]])], [s0(p0: [[35.0], [36.0]], p1: [[37.0]])]], p1: [[s0(p0: [[38.0], [39.0]], p1: [[40.0]])], [s0(p0: [[41.0], [42.0]], p1: [[43.0]])]]), p1: [44.0, 45.0]), p1: s2(p0: [s0(p0: [[46.0], [47.0]], p1: [[48.0]])], p1: s0(p0: [[49.0], [50.0]], p1: [[51.0]])))], p1: [[s3(p0: s1(p0: [[s0(p0: [[52.0], [53.0]], p1: [[54.0]])], [s0(p0: [[55.0], [56.0]], p1: [[57.0]])], [s0(p0: [[58.0], [59.0]], p1: [[60.0]])]], p1: [[s0(p0: [[61.0], [62.0]], p1: [[63.0]])], [s0(p0: [[64.0], [65.0]], p1: [[66.0]])]]), p1: [67.0, 68.0])]])
    let v2: s10 = s10(p0: s4(p0: [s0(p0: [[69.0], [70.0]], p1: [[71.0]]), s0(p0: [[72.0], [73.0]], p1: [[74.0]])], p1: [s3(p0: s1(p0: [[s0(p0: [[75.0], [76.0]], p1: [[77.0]])], [s0(p0: [[78.0], [79.0]], p1: [[80.0]])], [s0(p0: [[81.0], [82.0]], p1: [[83.0]])]], p1: [[s0(p0: [[84.0], [85.0]], p1: [[86.0]])], [s0(p0: [[87.0], [88.0]], p1: [[89.0]])]]), p1: [90.0, 91.0])]), p1: [s1(p0: [[s0(p0: [[92.0], [93.0]], p1: [[94.0]])], [s0(p0: [[95.0], [96.0]], p1: [[97.0]])], [s0(p0: [[98.0], [99.0]], p1: [[100.0]])]], p1: [[s0(p0: [[101.0], [102.0]], p1: [[103.0]])], [s0(p0: [[104.0], [105.0]], p1: [[106.0]])]])])
    let v3: Double = 107.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 107.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
