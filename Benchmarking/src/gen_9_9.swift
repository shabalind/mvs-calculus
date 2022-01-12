  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s4 {
    var p0: s2
    var p1: s0
  }
  struct s5 {
    var p0: s3
    var p1: [s2]
  }
  func f59(_ v0: [s2], _ v1: s5) -> s5 {
    let v5: [s2] = v1.p1
    let v3: s3 = v1.p0
    let v6: s5 = s5(p0: v3, p1: v5)
    let v2: [[s0]] = v3.p0
    let v7: s2 = v5[2]
    let v13: [s0] = v2[1]
    let v9: [s2] = v6.p1
    var v18: s2 = v7
    let v15: s0 = v13[0]
    let v16: s2 = v9[0]
    let v11: [s2] = v1.p1
    let v21: [[s0]] = v3.p0
    v18.p0 = v15
    var v10: [s0] = v13
    v18.p1 = v15
    var v28: s3 = v3
    let v25: s2 = v11[1]
    let v24: s0 = v25.p0
    var v22: [s2] = v11
    var v33: s3 = v3
    v22[2] = v18
    let v68: s0 = v25.p1
    var v47: [[s0]] = v21
    let v51: [s0] = v3.p1
    var v35: [s0] = v51
    v47[0] = v13
    var v59: s5 = v1
    var v26: s3 = v33
    let v64: s0 = v7.p0
    v33.p1 = v51
    v35[0] = v64
    v35[0] = v24
    v10[0] = v15
    let v42: s0 = v16.p0
    let v56: [s0] = v26.p1
    var v58: [s0] = v56
    v59.p0 = v26
    v26.p0 = v47
    let v67: [[s0]] = v33.p0
    v33.p1 = v35
    v59.p0 = v28
    let v48: s0 = v58[0]
    v28.p1 = v35
    v10[0] = v68
    let v100: s0 = v18.p0
    v10[0] = v100
    v59.p1 = v22
    v22[2] = v16
    let v123: [s2] = v59.p1
    v47[1] = v10
    v35[2] = v42
    v59.p1 = v0
    v35[1] = v48
    v33.p0 = v67
    var v142: [s0] = v51
    v35[0] = v100
    v26.p1 = v142
    let v120: s0 = v7.p0
    v18.p1 = v120
    var v180: s5 = v59
    v180.p1 = v123
    return v180
  }
  func f57(_ v0: s3) -> s3 {
    var v1: s3 = v0
    let v4: [s0] = v1.p1
    let v3: s0 = v4[0]
    let v7: s0 = v4[2]
    let v2: s0 = v4[0]
    let v6: s0 = v4[0]
    var v5: s3 = v1
    let v9: [[Double]] = v3.p0
    var v8: [s0] = v4
    var v13: s0 = v3
    let v12: [[s0]] = v1.p0
    v8[1] = v2
    v13.p0 = v9
    let v29: [s0] = v12[1]
    v5.p1 = v8
    let v11: [s0] = v5.p1
    let v10: s3 = s3(p0: v12, p1: v11)
    v5.p1 = v11
    v8[2] = v3
    let v15: [[s0]] = v10.p0
    v1.p1 = v8
    var v34: [s0] = v29
    let v17: [s0] = v0.p1
    v1.p0 = v15
    var v37: [s0] = v34
    let v23: [s3] = [v1, v0, v1, v0, v1, v0, v5]
    v8[1] = v7
    let v18: s3 = v23[1]
    let v44: s3 = s3(p0: v15, p1: v11)
    v13.p0 = v9
    let v39: [s0] = v15[0]
    let v27: s0 = v37[0]
    v1.p1 = v4
    var v28: [s0] = v17
    v1.p0 = v15
    let v38: [s0] = v15[1]
    var v43: [[s0]] = v12
    var v47: [s0] = v39
    v43[1] = v38
    let v94: [s0] = v44.p1
    let v54: [[Double]] = v13.p2
    v34[0] = v13
    let v46: s3 = v23[4]
    let v60: [[Double]] = v27.p0
    v28[0] = v27
    v47[0] = v6
    v43[1] = v34
    v47[0] = v2
    v13.p0 = v60
    v28[1] = v7
    v37[0] = v3
    let v78: [[s0]] = v44.p0
    let v63: [s0] = v1.p1
    v1.p0 = v78
    let v71: s0 = v8[2]
    v5.p1 = v63
    var v114: s3 = v46
    v34 = v47
    v1.p0 = v43
    let v177: [[s0]] = v5.p0
    var v79: [[s0]] = v177
    v5.p0 = v15
    let v195: [s0] = v114.p1
    let v110: [s0] = v18.p1
    v13.p2 = v54
    let v83: [[s0]] = v10.p0
    v1.p0 = v83
    var v163: s3 = v1
    v114.p0 = v78
    v163.p0 = v79
    var v98: s3 = v163
    v98.p1 = v195
    v114.p0 = v177
    v98.p1 = v28
    v37[0] = v71
    v8 = v110
    v43[0] = v39
    v1.p1 = v94
    let v89: [[s0]] = v1.p0
    v163.p0 = v89
    return v98
  }
  func f56(_ v0: s3) -> s3 {
    let v4: [[s0]] = v0.p0
    let v3: [s0] = v0.p1
    let v8: [s0] = v0.p1
    var v24: s3 = v0
    v24.p1 = v3
    v24.p0 = v4
    let v43: s3 = f57(v24)
    v24 = v0
    let v26: s3 = f57(v43)
    v24.p0 = v4
    v24.p1 = v8
    return v26
  }
  func f55(_ v0: s3) -> s3 {
    let v1: [s0] = v0.p1
    let v2: s3 = f57(v0)
    let v11: s0 = v1[2]
    let v3: [[s0]] = v0.p0
    let v15: [s0] = v2.p1
    let v9: s3 = f57(v2)
    let v16: [s0] = v9.p1
    var v18: [s0] = v16
    var v37: [s0] = v15
    v18 = v37
    v18[2] = v11
    let v99: s3 = s3(p0: v3, p1: v18)
    return v99
  }
  func f50(_ v0: Double) -> Double {
    var v2: Double = v0
    var v6: Double = v0
    var v11: Double = v0
    var v4: Double = v6
    var v1: Double = v11
    var v14: Double = v4
    var v8: Double = v14
    let v18: [Double] = [v8, v11]
    var v17: Double = v14
    var v9: [Double] = v18
    var v22: Double = v8
    v9[0] = v2
    v9[0] = v17
    var v15: [Double] = v9
    v9[0] = v22
    var v39: Double = v1
    v9[1] = v39
    let v75: Double = v15[0]
    return v75
  }
  func f42(_ v0: s2) -> s2 {
    var v8: s2 = v0
    var v2: s2 = v8
    let v1: s0 = v0.p1
    v2.p0 = v1
    let v13: [Double] = v1.p1
    let v15: s0 = v0.p1
    v2.p0 = v1
    var v23: s2 = v0
    var v56: s0 = v1
    v56.p1 = v13
    v8 = v2
    var v28: s2 = v2
    let v42: [Double] = v56.p1
    v23.p1 = v15
    let v63: s0 = v28.p0
    v56.p1 = v42
    v8 = v23
    let v47: s2 = s2(p0: v56, p1: v63)
    return v47
  }
  func f41(_ v0: Double, _ v1: s4) -> Double {
    var v9: s4 = v1
    let v6: s2 = v9.p0
    let v5: s0 = v6.p1
    let v7: [s4] = [v1]
    let v12: s0 = v6.p0
    v9.p1 = v5
    let v13: s0 = v6.p1
    let v14: s4 = v7[0]
    let v18: s0 = v14.p1
    v9.p1 = v13
    v9.p1 = v18
    let v17: s2 = f42(v6)
    var v27: s2 = v17
    let v15: [[Double]] = v13.p0
    let v30: [Double] = v15[1]
    v9.p1 = v12
    let v33: s0 = v27.p0
    let v43: [s0] = [v33, v13, v12, v13, v18, v5, v18]
    let v31: s0 = v43[2]
    v9.p1 = v31
    let v67: Double = v30[0]
    v27.p0 = v31
    v27.p0 = v13
    let v134: Double = f50(v67)
    return v134
  }
  func f35(_ v0: s0) -> s0 {
    let v6: s2 = s2(p0: v0, p1: v0)
    let v3: s0 = v6.p0
    var v2: s0 = v0
    var v12: s0 = v0
    let v17: [Double] = v0.p1
    v2.p1 = v17
    let v21: [[Double]] = v3.p2
    v12.p2 = v21
    let v28: s1 = s1(p0: v12, p1: v2)
    let v37: [[Double]] = v3.p2
    v2.p2 = v37
    let v45: s0 = v28.p1
    let v24: s1 = s1(p0: v12, p1: v45)
    let v54: s0 = v24.p1
    v12.p1 = v17
    v12.p2 = v21
    return v54
  }
  func f30(_ v0: s2) -> s2 {
    var v4: s2 = v0
    let v3: [s2] = [v4, v0, v4, v4]
    let v6: s0 = v4.p1
    let v7: s2 = v3[3]
    v4.p0 = v6
    var v10: s0 = v6
    let v5: [[Double]] = v6.p0
    let v9: s2 = v3[0]
    let v2: s0 = v7.p1
    v10.p0 = v5
    let v13: s2 = f42(v7)
    let v14: s0 = v7.p0
    var v19: [[Double]] = v5
    let v17: s0 = v13.p0
    let v34: [[Double]] = v17.p2
    let v27: s0 = f35(v10)
    var v15: [[Double]] = v34
    let v28: [Double] = v19[2]
    let v40: [Double] = v6.p1
    let v26: s0 = v9.p1
    let v57: s0 = f35(v14)
    v15[0] = v28
    let v46: [[Double]] = v2.p2
    let v103: [Double] = v26.p1
    v4.p0 = v27
    let v54: s2 = f42(v9)
    v4.p0 = v57
    let v130: [Double] = v46[0]
    v10.p2 = v46
    let v111: s0 = v54.p0
    var v60: [Double] = v40
    v10.p1 = v60
    let v75: s0 = s0(p0: v5, p1: v103, p2: v15)
    v4.p1 = v111
    v15[0] = v130
    let v207: s4 = s4(p0: v9, p1: v75)
    let v446: s2 = v207.p0
    return v446
  }
  func f26(_ v0: s5) -> s5 {
    let v7: [s2] = v0.p1
    let v5: s5 = f59(v7, v0)
    var v4: [s2] = v7
    let v3: s2 = v7[0]
    let v1: s2 = v7[0]
    var v6: s5 = v5
    v4[0] = v1
    let v11: [[s2]] = [v7, v7, v7, v7]
    let v10: s2 = f30(v1)
    let v17: [s2] = v11[3]
    v4[0] = v1
    v6.p1 = v7
    v6.p1 = v4
    v6.p1 = v4
    v4[1] = v1
    v4 = v17
    v4[1] = v1
    let v18: s2 = f30(v10)
    var v14: [s2] = v7
    v4[0] = v10
    v4[1] = v3
    let v33: [s2] = v0.p1
    let v13: [s2] = v11[2]
    let v42: [s2] = v6.p1
    let v22: s0 = v18.p1
    var v19: s2 = v18
    v19.p1 = v22
    var v40: s5 = v6
    v6.p1 = v14
    v6.p1 = v13
    v4 = v42
    v4[2] = v19
    let v39: s3 = v40.p0
    let v66: s3 = f55(v39)
    let v97: s3 = f56(v66)
    v40.p1 = v33
    let v37: s3 = f57(v66)
    v6.p0 = v97
    let v51: s5 = f59(v17, v40)
    v6.p0 = v37
    v14[1] = v1
    return v51
  }
  func f21(_ v0: s3) -> s3 {
    let v7: s3 = f56(v0)
    let v4: s3 = f56(v7)
    let v10: [[s0]] = v0.p0
    var v23: s3 = v4
    v23.p0 = v10
    let v87: s3 = f56(v23)
    v23.p0 = v10
    return v87
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: [[s4]], _ v2: Double) -> Double {
    let v4: s5 = f26(v0)
    let v12: s3 = v4.p0
    let v7: [s4] = v1[2]
    let v13: [s4] = v1[0]
    let v10: s3 = f21(v12)
    let v25: [s4] = v1[0]
    var v15: [[s4]] = v1
    v15[1] = v13
    let v9: [s4] = v15[2]
    v15[2] = v9
    v15[2] = v7
    let v30: [s0] = v10.p1
    let v38: s0 = v30[1]
    v15[1] = v25
    let v59: [[Double]] = v38.p2
    v15[1] = v13
    let v44: [Double] = v59[0]
    v15[2] = v13
    let v76: Double = v44[0]
    let v101: s4 = v9[0]
    let v133: Double = f41(v76, v101)
    return v133
  }
  func benchmark() {
    let v0: s5 = s5(p0: s3(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [3.0, 4.0], p2: [[5.0]])], [s0(p0: [[6.0], [7.0], [8.0]], p1: [9.0, 10.0], p2: [[11.0]])]], p1: [s0(p0: [[12.0], [13.0], [14.0]], p1: [15.0, 16.0], p2: [[17.0]]), s0(p0: [[18.0], [19.0], [20.0]], p1: [21.0, 22.0], p2: [[23.0]]), s0(p0: [[24.0], [25.0], [26.0]], p1: [27.0, 28.0], p2: [[29.0]])]), p1: [s2(p0: s0(p0: [[30.0], [31.0], [32.0]], p1: [33.0, 34.0], p2: [[35.0]]), p1: s0(p0: [[36.0], [37.0], [38.0]], p1: [39.0, 40.0], p2: [[41.0]])), s2(p0: s0(p0: [[42.0], [43.0], [44.0]], p1: [45.0, 46.0], p2: [[47.0]]), p1: s0(p0: [[48.0], [49.0], [50.0]], p1: [51.0, 52.0], p2: [[53.0]])), s2(p0: s0(p0: [[54.0], [55.0], [56.0]], p1: [57.0, 58.0], p2: [[59.0]]), p1: s0(p0: [[60.0], [61.0], [62.0]], p1: [63.0, 64.0], p2: [[65.0]]))])
    let v1: [[s4]] = [[s4(p0: s2(p0: s0(p0: [[66.0], [67.0], [68.0]], p1: [69.0, 70.0], p2: [[71.0]]), p1: s0(p0: [[72.0], [73.0], [74.0]], p1: [75.0, 76.0], p2: [[77.0]])), p1: s0(p0: [[78.0], [79.0], [80.0]], p1: [81.0, 82.0], p2: [[83.0]]))], [s4(p0: s2(p0: s0(p0: [[84.0], [85.0], [86.0]], p1: [87.0, 88.0], p2: [[89.0]]), p1: s0(p0: [[90.0], [91.0], [92.0]], p1: [93.0, 94.0], p2: [[95.0]])), p1: s0(p0: [[96.0], [97.0], [98.0]], p1: [99.0, 100.0], p2: [[101.0]]))], [s4(p0: s2(p0: s0(p0: [[102.0], [103.0], [104.0]], p1: [105.0, 106.0], p2: [[107.0]]), p1: s0(p0: [[108.0], [109.0], [110.0]], p1: [111.0, 112.0], p2: [[113.0]])), p1: s0(p0: [[114.0], [115.0], [116.0]], p1: [117.0, 118.0], p2: [[119.0]]))]]
    let v2: Double = 120.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 120.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
