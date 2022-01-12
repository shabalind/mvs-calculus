  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
  }
  struct s2 {
    var p0: [[s0]]
    var p1: s1
  }
  struct s3 {
    var p0: [s2]
    var p1: s0
    var p2: s0
    var p3: Double
    var p4: [s0]
  }
  func f121(_ v0: s0) -> s0 {
    var v1: s0 = v0
    let v3: [[Double]] = v0.p0
    let v7: [[Double]] = v1.p0
    let v2: [[Double]] = v1.p1
    var v8: [[Double]] = v3
    let v9: [[Double]] = v1.p0
    let v4: [Double] = v7[1]
    let v6: [Double] = v2[1]
    var v11: [[Double]] = v7
    let v5: [[Double]] = v1.p0
    v1.p1 = v2
    v1.p0 = v8
    var v14: [Double] = v4
    v8 = v11
    v1.p0 = v7
    var v12: [Double] = v6
    v1 = v0
    v1.p0 = v3
    let v10: [[Double]] = v0.p1
    let v28: Double = v14[0]
    var v13: s0 = v0
    let v37: Double = v14[0]
    let v15: [Double] = [v28, v37, v37, v37, v28, v28, v37]
    v8[1] = v14
    v12[0] = v37
    var v25: s0 = v0
    let v23: [[Double]] = v0.p0
    let v34: [Double] = v7[0]
    let v26: Double = v12[0]
    v25.p1 = v3
    let v18: [[Double]] = v25.p0
    let v16: Double = v6[0]
    let v44: [[Double]] = v25.p1
    let v29: [[Double]] = v0.p1
    v14[0] = v37
    let v19: [Double] = v8[1]
    let v30: [[Double]] = v1.p1
    let v21: s1 = s1(p0: v1)
    let v52: Double = v15[2]
    let v40: [Double] = [v37, v52, v28, v28, v52, v26]
    let v36: s0 = s0(p0: v2, p1: v44)
    v14[0] = v52
    let v27: [Double] = v30[0]
    v25.p1 = v2
    var v32: [Double] = v34
    var v50: [[Double]] = v29
    v13.p1 = v44
    v11[1] = v32
    let v68: s0 = v21.p0
    var v101: s1 = v21
    let v47: Double = v40[3]
    v8[1] = v14
    v25.p0 = v10
    let v48: Double = v14[0]
    let v96: [[[Double]]] = [v2, v2, v30, v23]
    let v33: [Double] = v9[0]
    var v85: Double = v48
    var v65: [Double] = v34
    v50[1] = v19
    let v88: [[Double]] = v25.p1
    v13.p0 = v18
    let v93: Double = v27[0]
    let v70: s0 = v101.p0
    let v106: [Double] = v88[1]
    v13 = v68
    v101.p0 = v13
    var v99: [[[Double]]] = v96
    v12[0] = v85
    v50[1] = v65
    var v139: s0 = v0
    v139.p0 = v50
    v13.p1 = v23
    v11[1] = v106
    let v92: [[Double]] = v139.p1
    v11[1] = v4
    v8[0] = v19
    let v61: [Double] = v92[0]
    v11[1] = v14
    v32 = v61
    v1.p0 = v30
    let v118: [[Double]] = v68.p0
    v85 = v16
    v1.p1 = v30
    v25.p0 = v8
    v25.p0 = v118
    v101.p0 = v36
    v8[1] = v27
    v32[0] = v47
    let v135: [[Double]] = v99[3]
    v14[0] = v93
    v1.p1 = v5
    v65[0] = v28
    v12[0] = v47
    v139.p0 = v135
    v11[0] = v33
    return v70
  }
  func f117(_ v0: s1) -> s1 {
    let v1: s0 = v0.p0
    let v2: s1 = s1(p0: v1)
    var v12: s1 = v2
    let v8: s0 = v12.p0
    var v21: s1 = v2
    var v9: s1 = v21
    v9 = v12
    v9.p0 = v8
    return v9
  }
  func f113(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p0
    let v2: [[Double]] = v0.p1
    let v1: [Double] = v2[0]
    let v5: [Double] = v6[1]
    let v3: s0 = f121(v0)
    let v4: s0 = s0(p0: v2, p1: v6)
    var v11: [[Double]] = v6
    let v7: [[Double]] = v3.p0
    v11[0] = v1
    let v15: [[Double]] = v4.p1
    let v35: s0 = f121(v3)
    let v31: s0 = f121(v4)
    let v28: [[Double]] = v4.p1
    let v17: [Double] = v11[0]
    v11[1] = v17
    v11[1] = v17
    let v68: [[Double]] = v31.p0
    var v60: s0 = v35
    v60.p0 = v11
    v60.p0 = v28
    v11 = v15
    v11[0] = v17
    let v96: [Double] = v68[0]
    v60.p1 = v7
    v11[0] = v96
    v11[0] = v5
    return v60
  }
  func f107(_ v0: s0) -> s0 {
    var v1: s0 = v0
    let v7: [[Double]] = v1.p0
    var v5: [[Double]] = v7
    let v2: [[Double]] = v1.p0
    let v4: [Double] = v7[1]
    let v3: [Double] = v5[1]
    let v10: s0 = f121(v1)
    v1 = v0
    let v6: [[Double]] = v0.p1
    v1.p0 = v6
    let v9: [[Double]] = [v3, v4]
    let v8: Double = v3[0]
    let v13: s0 = f121(v10)
    var v15: [[Double]] = v6
    let v36: Double = v3[0]
    let v16: Double = v4[0]
    v5[1] = v4
    v5[0] = v4
    let v30: [Double] = v5[1]
    v15[0] = v4
    let v18: s0 = s0(p0: v2, p1: v7)
    let v14: [[Double]] = v10.p1
    let v24: s0 = f113(v13)
    let v21: [Double] = v9[1]
    let v34: [[Double]] = v0.p1
    v5[0] = v30
    var v17: [Double] = v30
    var v26: [Double] = v21
    var v25: s0 = v10
    var v33: [[Double]] = v6
    v15[1] = v3
    var v56: s0 = v18
    v1.p1 = v9
    let v28: [[Double]] = v13.p0
    v15[0] = v26
    let v27: [[Double]] = v24.p1
    var v22: s0 = v56
    let v31: s0 = f113(v25)
    var v47: [Double] = v17
    var v48: [Double] = v47
    var v90: [[Double]] = v7
    let v39: s0 = f121(v24)
    var v84: [[Double]] = v34
    v90[0] = v48
    v84 = v28
    v47[0] = v8
    var v35: [Double] = v4
    v90[1] = v26
    var v29: [Double] = v4
    v25.p0 = v5
    v25.p1 = v90
    let v37: [Double] = v84[1]
    v90[0] = v47
    let v32: Double = v3[0]
    v25.p1 = v84
    v84[0] = v48
    let v78: [[Double]] = v39.p0
    let v54: [s0] = [v22, v22, v31, v39, v13]
    v35 = v17
    v56.p0 = v90
    let v89: Double = v48[0]
    var v50: Double = v16
    let v145: [Double] = v9[1]
    let v59: Double = v32 - v89
    let v57: s0 = v54[2]
    var v53: [[Double]] = v33
    v47 = v37
    let v100: Double = v145[0]
    v26 = v35
    v56.p0 = v53
    v5[1] = v48
    var v58: [[Double]] = v27
    v90[1] = v145
    v1.p1 = v5
    v84[1] = v30
    var v124: s0 = v57
    let v108: [[Double]] = v56.p1
    let v95: [Double] = v7[1]
    v22.p1 = v58
    v53[1] = v95
    v22.p0 = v14
    var v102: [[Double]] = v108
    v53[0] = v47
    v124.p1 = v15
    var v109: [Double] = v3
    var v65: [[Double]] = v78
    v56.p1 = v84
    let v135: s0 = f113(v124)
    v26[0] = v36
    v102[1] = v109
    v33 = v65
    v29[0] = v50
    v29[0] = v59
    v17[0] = v100
    v124.p0 = v102
    v90[1] = v29
    return v135
  }
  func f100(_ v0: s1) -> s1 {
    let v12: s0 = v0.p0
    let v13: s0 = v0.p0
    let v38: [[Double]] = v12.p0
    let v29: [[Double]] = v13.p1
    let v39: s0 = s0(p0: v38, p1: v29)
    let v46: s0 = f113(v39)
    let v138: s1 = s1(p0: v46)
    return v138
  }
  func f96(_ v0: s0) -> s0 {
    let v4: s0 = f121(v0)
    let v6: [[Double]] = v4.p0
    let v11: s0 = s0(p0: v6, p1: v6)
    var v1: s0 = v4
    let v5: s1 = s1(p0: v1)
    let v13: s1 = f117(v5)
    let v22: s1 = f100(v13)
    var v14: s1 = v22
    let v16: s0 = v14.p0
    v14.p0 = v11
    return v16
  }
  func f46(_ v0: s0) -> s0 {
    var v1: s0 = v0
    v1 = v0
    let v3: [[Double]] = v1.p0
    let v7: s0 = f121(v0)
    var v6: s0 = v1
    let v4: [[Double]] = v7.p1
    let v5: s0 = s0(p0: v3, p1: v3)
    let v2: s0 = f96(v0)
    let v8: [[Double]] = v0.p0
    v6 = v7
    let v9: s0 = f121(v0)
    v1.p0 = v3
    let v13: s0 = f96(v7)
    v6.p0 = v4
    v6.p1 = v3
    var v14: s0 = v5
    let v22: [[[Double]]] = [v3, v8]
    v6 = v5
    let v71: s0 = f113(v9)
    var v27: s0 = v14
    let v17: [[Double]] = v13.p1
    v6.p0 = v17
    let v54: s0 = f121(v7)
    let v34: [[Double]] = v22[0]
    let v46: s0 = f113(v6)
    let v59: s0 = f121(v46)
    v14.p0 = v34
    let v49: s0 = f107(v27)
    let v73: [s0] = [v49, v59, v71, v2, v54, v9, v7]
    v6.p0 = v34
    var v233: [s0] = v73
    let v392: s0 = v233[2]
    return v392
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v2: s3 = v0[0]
    let v6: s3 = v0[0]
    let v3: [s3] = [v2, v6, v2, v2, v2, v2]
    let v8: s3 = v3[3]
    let v24: s0 = v8.p2
    var v10: Double = v1
    var v15: Double = v1
    let v14: s0 = f46(v24)
    let v26: [[Double]] = v14.p0
    var v87: [[Double]] = v26
    let v38: [Double] = v87[0]
    let v46: Double = v10 * v15
    var v97: Double = v46
    var v53: [Double] = v38
    v87[0] = v38
    v53[0] = v97
    let v173: Double = v53[0]
    v53[0] = v15
    var v71: Double = v173
    return v71
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: [s2(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])], [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])]], p1: s1(p0: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]))), s2(p0: [[s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])], [s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])]], p1: s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])))], p1: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), p2: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]), p3: 32.0, p4: [s0(p0: [[33.0], [34.0]], p1: [[35.0], [36.0]]), s0(p0: [[37.0], [38.0]], p1: [[39.0], [40.0]])])]
    let v1: Double = 41.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 41.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
