  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  func f83(_ v0: s1) -> s1 {
    let v5: s0 = v0.p0
    var v2: s1 = v0
    v2 = v0
    let v3: s0 = v2.p0
    v2.p0 = v3
    var v4: s0 = v5
    let v6: [[Double]] = v4.p1
    let v1: [Double] = v6[0]
    var v7: [[Double]] = v6
    let v11: [[Double]] = v3.p1
    v7[0] = v1
    var v9: s1 = v0
    v9.p0 = v4
    var v15: s0 = v4
    let v19: [Double] = v11[0]
    v4.p1 = v7
    let v13: [[Double]] = v4.p0
    var v14: s1 = v0
    let v20: [[Double]] = v15.p0
    let v25: s0 = s0(p0: v20, p1: v7)
    var v37: s0 = v25
    let v16: [Double] = v13[1]
    v7[0] = v16
    let v21: s0 = v14.p0
    let v23: [[Double]] = v37.p0
    v2.p0 = v21
    let v50: [[Double]] = v5.p0
    v15.p0 = v50
    let v22: s0 = v2.p0
    let v29: Double = v19[0]
    var v32: [Double] = v19
    v32[0] = v29
    v15.p1 = v6
    v4.p0 = v23
    v7[0] = v32
    let v36: s0 = v9.p0
    v4.p0 = v23
    let v85: [s0] = v9.p1
    v2.p0 = v22
    let v72: [s0] = v14.p1
    let v69: [[Double]] = v15.p0
    v4 = v5
    var v49: s1 = v9
    let v170: s0 = v49.p0
    let v97: s0 = v14.p0
    let v98: [[Double]] = v36.p0
    var v88: [s0] = v72
    v9.p0 = v37
    let v70: s1 = s1(p0: v36, p1: v85)
    v4.p0 = v69
    v9 = v49
    v88[0] = v97
    v2 = v70
    v37.p0 = v98
    let v143: s0 = v88[1]
    v2.p0 = v143
    var v200: s1 = v70
    v9.p0 = v170
    return v200
  }
  func f72(_ v0: Double) -> Double {
    var v4: Double = v0
    var v1: Double = v4
    let v3: Double = v0 - v1
    var v16: Double = v3
    var v9: Double = v16
    return v9
  }
  func f71(_ v0: s0) -> s0 {
    let v6: [s0] = [v0]
    var v4: s0 = v0
    let v14: [[Double]] = v0.p0
    let v11: [Double] = v14[1]
    v4.p0 = v14
    let v2: [Double] = v14[2]
    let v16: s0 = v6[0]
    let v13: s0 = v6[0]
    var v39: [[Double]] = v14
    v4.p0 = v39
    v39[0] = v2
    let v25: [s0] = [v16, v13, v4]
    let v29: [[Double]] = v0.p1
    var v31: [s0] = v25
    v39[0] = v11
    v4.p1 = v29
    let v47: s0 = v31[0]
    return v47
  }
  func f70(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v6: [s0] = [v0, v7, v7]
    let v3: s0 = v6[2]
    let v14: s0 = f71(v7)
    let v10: s0 = f71(v0)
    let v11: [[Double]] = v14.p0
    let v12: [[Double]] = v10.p1
    let v30: s0 = v6[0]
    let v48: [[Double]] = v30.p0
    let v49: s1 = s1(p0: v3, p1: v6)
    let v38: s1 = f83(v49)
    v7.p0 = v48
    let v94: s0 = s0(p0: v11, p1: v12)
    let v72: s1 = f83(v38)
    var v58: s1 = v49
    v7.p1 = v12
    let v75: s1 = f83(v38)
    let v201: [[Double]] = v94.p1
    let v60: [s1] = [v75, v58, v75, v72, v72, v58]
    v7.p1 = v201
    let v124: s1 = v60[2]
    let v185: s0 = v124.p0
    return v185
  }
  func f48(_ v0: s0) -> s0 {
    var v5: s0 = v0
    var v2: s0 = v5
    let v1: [s0] = [v0]
    let v6: s0 = v1[0]
    var v9: [s0] = v1
    let v7: s0 = v1[0]
    let v8: s0 = f70(v0)
    let v3: [[Double]] = v2.p0
    let v18: [[Double]] = v7.p1
    let v10: s0 = f70(v6)
    var v4: [[Double]] = v18
    let v16: [[Double]] = v6.p0
    let v23: s0 = f70(v6)
    v9[0] = v7
    var v11: [[Double]] = v3
    let v12: [Double] = v11[0]
    v2.p0 = v3
    let v15: [Double] = v4[0]
    v4[0] = v12
    var v19: s0 = v23
    var v17: s0 = v0
    var v21: [Double] = v12
    let v22: [[Double]] = v7.p0
    v5.p0 = v16
    let v14: [[Double]] = v19.p0
    let v13: [[Double]] = v6.p0
    let v20: s0 = f70(v0)
    var v31: [[Double]] = v11
    v11[1] = v15
    var v26: [s0] = v9
    v4[0] = v15
    v19.p0 = v11
    v5.p1 = v4
    v4[0] = v21
    let v39: [[Double]] = v20.p1
    let v27: [Double] = v4[0]
    v5 = v0
    var v33: [s0] = v1
    let v56: [[Double]] = v7.p1
    let v41: [[Double]] = v17.p0
    v31[1] = v21
    let v32: [[s0]] = [v26, v9, v33, v26, v26, v1]
    let v35: [[Double]] = v0.p0
    var v44: [Double] = v27
    v9[0] = v10
    let v43: [s0] = v32[1]
    v17.p0 = v11
    v2.p1 = v39
    let v81: [[Double]] = v8.p0
    var v50: [Double] = v44
    v17.p0 = v14
    v17.p0 = v35
    v19.p0 = v81
    v19 = v2
    let v51: Double = v50[0]
    v19.p0 = v13
    let v91: s0 = f70(v19)
    let v117: Double = f72(v51)
    v21[0] = v117
    let v80: s0 = v43[0]
    var v71: s0 = v80
    v33[0] = v91
    v19.p0 = v31
    let v118: [[Double]] = v19.p1
    v17.p0 = v31
    v21[0] = v51
    let v158: [Double] = v4[0]
    v17.p0 = v3
    v71.p0 = v41
    v19.p0 = v14
    v19.p0 = v3
    v71.p0 = v14
    let v169: s0 = f70(v5)
    var v131: s0 = v169
    let v184: s0 = f71(v131)
    v11[0] = v158
    v5.p1 = v56
    v4 = v118
    v9[0] = v184
    v19.p0 = v22
    return v71
  }
  func f29(_ v0: s0) -> s0 {
    let v1: s0 = f48(v0)
    let v9: s0 = f70(v1)
    let v24: [[Double]] = v9.p0
    let v17: [[Double]] = v0.p1
    let v16: s0 = s0(p0: v24, p1: v17)
    return v16
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s0, _ v2: [s1], _ v3: Double) -> Double {
    let v13: s0 = f29(v1)
    var v4: Double = v3
    let v5: [[Double]] = v13.p0
    var v12: s0 = v1
    let v11: [[Double]] = v12.p0
    var v10: [[Double]] = v11
    let v23: [[Double]] = v13.p0
    var v40: [[Double]] = v5
    let v33: [Double] = v23[1]
    v12.p0 = v23
    v12.p0 = v11
    v40[0] = v33
    var v16: [[Double]] = v10
    let v25: [Double] = v11[2]
    var v41: [[Double]] = v23
    let v47: Double = v25[0]
    v12.p0 = v40
    v12.p0 = v16
    var v82: [Double] = v25
    var v63: Double = v3
    let v55: [[Double]] = v13.p1
    let v46: Double = v63 * v47
    let v71: Double = v82[0]
    let v70: [Double] = v55[0]
    let v37: Double = v71 * v46
    var v72: [[Double]] = v55
    v12.p1 = v72
    v16[1] = v70
    let v73: [Double] = v55[0]
    v12.p0 = v41
    v40[2] = v73
    let v64: [Double] = v72[0]
    v40[0] = v64
    let v57: Double = v37 / v4
    var v59: [Double] = v33
    v41[2] = v59
    return v57
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])])
    let v1: s0 = s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])
    let v2: [s1] = [s1(p0: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]), p1: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]), s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])])]
    let v3: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
