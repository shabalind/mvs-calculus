  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [[s0]]
    var p2: s0
    var p3: s0
  }
  struct s3 {
    var p0: s0
    var p1: [s0]
    var p2: s2
    var p3: s0
  }
  func f64(_ v0: s3) -> s3 {
    let v7: s0 = v0.p0
    var v3: s0 = v7
    var v4: s3 = v0
    let v6: [s0] = v0.p1
    let v1: [[Double]] = v7.p0
    v4.p3 = v7
    var v5: [[Double]] = v1
    v3.p0 = v5
    let v9: [Double] = v1[0]
    v5[0] = v9
    let v12: s2 = v4.p2
    v5 = v1
    let v2: [[Double]] = v7.p1
    let v13: s3 = s3(p0: v3, p1: v6, p2: v12, p3: v7)
    v4.p2 = v12
    v5[0] = v9
    v5[0] = v9
    let v15: s0 = v6[0]
    let v22: [Double] = v2[1]
    let v34: s2 = v0.p2
    let v21: s0 = v34.p2
    v5[0] = v22
    let v25: [Double] = v5[0]
    let v53: [[Double]] = v15.p1
    var v36: [[Double]] = v53
    v5[0] = v25
    var v63: [[Double]] = v2
    let v24: [[Double]] = v21.p0
    let v39: [Double] = v24[0]
    v5[0] = v22
    var v55: [Double] = v25
    v3.p1 = v63
    v63[0] = v25
    let v44: Double = v39[0]
    var v134: [s0] = v6
    v4.p1 = v134
    v3.p0 = v5
    v63[2] = v55
    let v116: [Double] = v36[1]
    v5[0] = v116
    v55[0] = v44
    v4.p1 = v6
    return v13
  }
  func f54(_ v0: s2) -> s2 {
    var v8: s2 = v0
    return v8
  }
  func f47(_ v0: s3) -> s3 {
    var v3: s3 = v0
    var v8: s3 = v3
    let v5: s3 = f64(v3)
    let v2: s3 = f64(v8)
    let v6: s3 = f64(v2)
    let v9: s0 = v5.p0
    let v7: s3 = f64(v5)
    v8.p0 = v9
    var v11: s3 = v7
    let v21: s3 = f64(v11)
    v11.p3 = v9
    let v13: [s0] = [v9, v9, v9, v9]
    v8.p0 = v9
    v3 = v2
    let v15: s0 = v13[3]
    let v48: s3 = f64(v21)
    v3.p0 = v15
    v8 = v21
    let v87: s3 = f64(v5)
    let v35: s0 = v6.p3
    let v61: [s0] = v87.p1
    v8.p3 = v35
    v3.p1 = v61
    return v48
  }
  func f29(_ v0: s3, _ v1: s3) -> s3 {
    let v2: s0 = v1.p0
    var v7: s3 = v1
    let v4: s3 = f64(v7)
    v7.p0 = v2
    let v6: s0 = v7.p3
    v7.p3 = v6
    var v49: s3 = v4
    return v49
  }
  func f18(_ v0: s0) -> s0 {
    var v1: s0 = v0
    var v7: s0 = v0
    var v4: s0 = v7
    let v5: [[Double]] = v7.p0
    let v2: [[Double]] = v7.p0
    let v6: [[Double]] = v1.p1
    var v8: s0 = v0
    var v14: [[Double]] = v6
    let v3: [[Double]] = v8.p0
    var v20: [[Double]] = v2
    let v15: [Double] = v6[0]
    var v12: s0 = v8
    let v22: [Double] = v14[2]
    var v16: [[Double]] = v6
    v7.p0 = v2
    let v46: [Double] = v20[0]
    var v9: s0 = v12
    var v25: [[Double]] = v14
    let v28: [[Double]] = v9.p1
    v9.p1 = v25
    let v17: [Double] = v14[2]
    v4.p1 = v6
    var v21: s0 = v9
    let v35: [[Double]] = v7.p0
    let v38: [[Double]] = v8.p0
    v4.p0 = v2
    var v10: s0 = v8
    let v19: [[Double]] = v9.p1
    let v41: [Double] = v35[0]
    var v39: [Double] = v17
    v16[1] = v41
    v10 = v4
    var v47: [[Double]] = v38
    var v34: s0 = v21
    v25[2] = v41
    v4.p1 = v19
    let v57: [[Double]] = v21.p0
    let v27: [Double] = v3[0]
    let v69: [[Double]] = v8.p1
    v16[2] = v39
    v16[0] = v27
    var v65: [[Double]] = v25
    v8.p0 = v5
    v25[2] = v41
    v34.p1 = v16
    v1.p0 = v47
    let v95: [[Double]] = v10.p1
    v4.p0 = v57
    let v85: [[Double]] = v8.p1
    var v98: [[Double]] = v28
    v7.p0 = v5
    let v54: [[Double]] = v34.p1
    v12.p1 = v85
    v16[0] = v15
    v4.p1 = v54
    let v121: [Double] = v95[0]
    v14 = v69
    v21.p1 = v98
    let v75: [Double] = v38[0]
    v20[0] = v22
    v14[0] = v27
    v1.p1 = v14
    v14[1] = v121
    let v133: [[Double]] = v10.p0
    v12.p1 = v65
    v47[0] = v75
    v1.p0 = v133
    v12.p0 = v47
    v47[0] = v46
    return v34
  }
  func f9(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v3: [[Double]] = v5.p0
    let v7: [[Double]] = v0.p1
    let v1: [[Double]] = v5.p1
    let v6: s0 = f18(v0)
    var v8: s0 = v6
    let v11: [[Double]] = v8.p0
    v8 = v5
    let v21: [[Double]] = v6.p0
    v8.p0 = v3
    let v14: s0 = f18(v8)
    let v20: [[Double]] = v0.p1
    let v34: [[Double]] = v6.p1
    var v15: [[Double]] = v11
    v8.p1 = v34
    let v17: [[Double]] = v14.p0
    v5.p0 = v17
    v5.p0 = v11
    v8.p1 = v1
    let v16: [[Double]] = v5.p0
    v5.p0 = v15
    var v19: s0 = v0
    let v23: [[Double]] = v6.p0
    v8.p0 = v16
    v5.p1 = v20
    let v45: [[Double]] = v6.p1
    var v28: [[Double]] = v11
    v19.p0 = v21
    let v49: [[Double]] = v19.p1
    let v57: s0 = s0(p0: v15, p1: v49)
    v8.p1 = v45
    v8.p0 = v28
    v5.p1 = v1
    v15 = v23
    v5.p1 = v7
    return v57
  }
  func f7(_ v0: s0, _ v1: s0, _ v2: s0) -> s0 {
    var v8: s0 = v2
    let v12: s0 = f9(v0)
    var v7: s0 = v2
    var v4: s0 = v1
    var v5: s0 = v8
    let v6: s0 = f9(v8)
    let v9: s0 = f9(v0)
    let v3: s0 = f18(v8)
    let v23: s0 = f18(v9)
    let v10: s0 = f9(v7)
    var v13: s0 = v0
    let v18: [s0] = [v2, v5, v13, v0, v3, v12, v8]
    var v17: [s0] = v18
    let v47: [[Double]] = v4.p1
    v17[1] = v10
    let v22: [[Double]] = v23.p0
    v17[5] = v5
    v7.p0 = v22
    var v36: [s0] = v18
    var v45: [[Double]] = v47
    v17[0] = v10
    v5.p0 = v22
    v7.p1 = v45
    var v29: s0 = v1
    let v15: s0 = v36[3]
    let v38: [[Double]] = v23.p1
    let v37: s0 = v36[4]
    let v31: s0 = v17[6]
    v36[3] = v29
    let v40: [[Double]] = v7.p1
    let v39: [[Double]] = v6.p0
    v5.p1 = v47
    let v51: s0 = f9(v8)
    let v48: [Double] = v39[0]
    v7.p0 = v22
    let v30: [[Double]] = v37.p0
    let v102: s0 = v36[6]
    v17[3] = v23
    var v50: s0 = v15
    let v61: [[Double]] = v4.p0
    let v140: [[Double]] = v3.p0
    let v91: s0 = f18(v50)
    let v75: [[Double]] = v51.p1
    v5.p0 = v30
    var v126: [[Double]] = v140
    var v77: [[Double]] = v126
    v5.p0 = v61
    let v120: [Double] = v77[0]
    v50.p0 = v39
    v8.p0 = v140
    var v93: [Double] = v120
    var v71: [[Double]] = v22
    v36[2] = v91
    let v135: [Double] = v75[0]
    let v168: [Double] = v40[1]
    let v55: s0 = f18(v102)
    v45[1] = v48
    v7.p0 = v71
    v29.p1 = v38
    let v150: Double = v135[0]
    v4.p1 = v38
    v8.p1 = v47
    v71[0] = v168
    v4 = v55
    v93[0] = v150
    v45[0] = v93
    return v31
  }
  func f5(_ v0: s3) -> s3 {
    var v1: s3 = v0
    let v6: s3 = f47(v1)
    let v5: s3 = f64(v6)
    let v3: s0 = v5.p0
    let v2: [s3] = [v6, v6, v0, v6, v6]
    let v12: [[s3]] = [v2, v2, v2]
    let v10: [s3] = v12[2]
    let v4: s3 = v2[3]
    v1 = v4
    let v18: s3 = v2[2]
    let v14: s3 = f29(v5, v18)
    let v17: [s0] = v4.p1
    var v31: [s0] = v17
    let v27: [s0] = v14.p1
    var v59: [s3] = v10
    var v25: [s3] = v59
    let v45: s0 = v31[1]
    v31[1] = v3
    let v30: s0 = v31[0]
    let v73: s3 = v25[3]
    let v78: s0 = f9(v3)
    let v84: s2 = v0.p2
    v25[1] = v4
    let v138: s3 = f64(v73)
    v1 = v138
    let v57: s3 = f29(v18, v138)
    var v69: [s0] = v27
    let v77: s2 = v6.p2
    v1.p3 = v30
    let v144: s2 = f54(v84)
    v1.p1 = v69
    v1.p2 = v77
    v25[1] = v18
    v1.p2 = v144
    v69[0] = v45
    v1.p3 = v78
    let v129: s3 = f64(v57)
    return v129
  }
  func f2(_ v0: s3) -> s3 {
    var v7: s3 = v0
    var v1: s3 = v0
    let v6: s3 = f5(v7)
    let v3: [s0] = v1.p1
    var v8: s3 = v6
    let v5: s3 = f47(v8)
    var v15: [s0] = v3
    let v9: s0 = v15[1]
    let v14: s0 = v3[1]
    let v42: s0 = v0.p3
    let v24: s0 = f9(v9)
    let v28: s0 = f7(v42, v24, v14)
    let v34: s0 = f18(v28)
    v1.p0 = v14
    v1 = v5
    let v29: s3 = f47(v0)
    var v33: s3 = v29
    let v114: s2 = v5.p2
    v33.p3 = v28
    v1.p2 = v114
    v7.p1 = v15
    v7.p0 = v34
    return v33
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    var v3: s3 = v0
    let v4: s3 = f2(v3)
    let v5: s0 = v3.p0
    var v6: s0 = v5
    v3.p0 = v6
    var v11: s0 = v6
    let v2: s2 = v4.p2
    let v7: [[Double]] = v6.p1
    let v13: [[Double]] = v6.p1
    var v10: [[Double]] = v7
    var v8: [[Double]] = v10
    v6.p1 = v13
    v6.p1 = v10
    let v27: [Double] = v8[2]
    v10[1] = v27
    let v14: s0 = v2.p3
    v10[0] = v27
    let v38: [Double] = v7[1]
    let v33: Double = v38[0]
    v3.p3 = v14
    v3.p3 = v11
    let v66: Double = v33 - v1
    return v66
  }
  func benchmark() {
    let v0: s3 = s3(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], p2: s2(p0: s1(p0: [s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])], p1: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])), p1: [[s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])], [s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])]], p2: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]), p3: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])), p3: s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]))
    let v1: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
