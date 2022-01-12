  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s10 {
    var p0: s1
    var p1: [[s1]]
    var p2: [s0]
  }
  func f62(_ v0: s0, _ v1: [s1]) -> s0 {
    var v2: s0 = v0
    let v7: s1 = v1[0]
    let v3: [s0] = v7.p1
    let v6: [[Double]] = v2.p2
    let v9: [Double] = v6[0]
    var v24: s1 = v7
    let v8: s0 = v3[1]
    v2.p1 = v6
    v2.p2 = v6
    var v16: [[Double]] = v6
    var v15: [[Double]] = v16
    var v14: [Double] = v9
    let v34: [[Double]] = v8.p1
    let v10: [[Double]] = v2.p2
    let v12: s0 = v24.p0
    let v36: [[Double]] = v0.p0
    let v29: [[Double]] = v8.p0
    v24.p0 = v2
    var v33: [[Double]] = v29
    let v69: [[Double]] = v2.p2
    let v30: [[Double]] = v8.p0
    v2.p1 = v15
    var v79: [Double] = v14
    var v35: [s0] = v3
    v2.p0 = v30
    let v53: [[Double]] = v12.p1
    var v43: s0 = v2
    let v52: [[Double]] = v0.p1
    v43.p0 = v33
    var v48: [[Double]] = v34
    let v97: s1 = s1(p0: v2, p1: v3)
    var v42: [s0] = v35
    var v38: [Double] = v79
    let v85: s0 = v97.p0
    let v25: [Double] = v15[0]
    v2.p2 = v52
    var v39: [[Double]] = v69
    v39 = v53
    v2.p0 = v36
    v35[1] = v85
    var v86: [[Double]] = v33
    let v37: [[Double]] = v85.p1
    v35[0] = v0
    v2.p2 = v37
    v2.p0 = v86
    v24.p1 = v42
    var v95: s0 = v8
    v24.p0 = v95
    v35[1] = v43
    v2.p1 = v6
    v95.p1 = v39
    v39[0] = v38
    v16[0] = v25
    var v215: [[Double]] = v10
    v15[0] = v79
    v2.p1 = v15
    v2.p2 = v215
    v39 = v48
    return v95
  }
  func f46(_ v0: s10) -> s10 {
    let v2: [s10] = [v0, v0, v0, v0, v0, v0, v0]
    var v3: [s10] = v2
    v3[4] = v0
    let v6: s10 = v3[1]
    let v4: s10 = v2[6]
    let v7: s10 = v2[1]
    v3[2] = v0
    var v8: s10 = v7
    let v11: [s0] = v4.p2
    let v5: s0 = v11[1]
    var v28: [s0] = v11
    v3[2] = v8
    let v16: [[s0]] = [v11, v28]
    var v12: s10 = v4
    let v14: s1 = v7.p0
    let v21: [s0] = v14.p1
    let v13: [[Double]] = v5.p0
    var v10: s0 = v5
    v12.p2 = v11
    v10.p0 = v13
    v8.p0 = v14
    let v15: [[s0]] = [v21, v21, v21]
    var v30: [[Double]] = v13
    let v19: [s0] = v16[0]
    v28[2] = v10
    v28 = v19
    var v36: s1 = v14
    let v38: [[s1]] = v7.p1
    let v41: [[Double]] = v10.p1
    v12.p2 = v19
    let v27: [Double] = v41[1]
    let v43: [[s1]] = v6.p1
    let v65: [s0] = v36.p1
    v3[6] = v0
    var v24: [Double] = v27
    let v34: [s1] = v43[0]
    v3 = v2
    let v40: [s0] = v4.p2
    let v26: [[s1]] = [v34, v34, v34, v34]
    v28[2] = v10
    v8 = v12
    let v114: s1 = v34[0]
    v8.p0 = v36
    let v44: [s0] = v114.p1
    var v42: s10 = v4
    let v51: [s0] = v15[1]
    let v72: [[Double]] = v10.p2
    v30[2] = v24
    v36.p1 = v65
    let v79: [s1] = v26[3]
    let v46: [s1] = v43[0]
    let v95: s0 = f62(v10, v34)
    let v54: s0 = s0(p0: v13, p1: v41, p2: v72)
    let v58: s0 = f62(v5, v79)
    v36.p1 = v21
    let v88: s1 = v8.p0
    var v199: [[Double]] = v72
    let v116: s0 = f62(v58, v46)
    let v149: [s1] = [v88]
    v36.p0 = v116
    let v49: [s0] = v42.p2
    var v93: [[Double]] = v30
    v8.p2 = v40
    v10.p0 = v93
    let v106: s0 = f62(v10, v149)
    v12.p2 = v19
    v12.p1 = v38
    v42.p0 = v114
    v28[2] = v106
    v36.p0 = v106
    v42.p0 = v14
    v8.p1 = v38
    v10.p1 = v199
    v10.p0 = v93
    let v150: [[s1]] = v0.p1
    v36.p1 = v44
    v12.p1 = v150
    let v212: [s0] = v14.p1
    let v96: s0 = f62(v95, v79)
    v36.p0 = v96
    v8.p1 = v150
    v36.p0 = v54
    v12.p2 = v40
    var v131: s10 = v42
    v42.p2 = v49
    v36.p1 = v51
    v36.p1 = v212
    return v131
  }
  func f43(_ v0: s0, _ v1: s0) -> s0 {
    let v3: [[Double]] = v0.p1
    let v6: [Double] = v3[1]
    var v13: s0 = v0
    let v9: [[Double]] = v1.p2
    var v12: [[Double]] = v9
    v12[1] = v6
    let v18: [[Double]] = v1.p2
    v13.p1 = v12
    v13.p2 = v18
    return v13
  }
  func f38(_ v0: s10) -> s10 {
    let v7: s10 = f46(v0)
    let v3: [[s1]] = v7.p1
    let v5: [s1] = v3[0]
    let v1: s10 = f46(v7)
    let v8: s1 = v5[0]
    let v4: s10 = f46(v1)
    let v10: [s0] = v4.p2
    var v19: [s0] = v10
    let v21: s0 = v8.p0
    let v46: [s0] = v8.p1
    let v59: s1 = s1(p0: v21, p1: v46)
    let v89: s0 = v59.p0
    var v104: [[s1]] = v3
    let v82: s10 = s10(p0: v8, p1: v104, p2: v19)
    v19[1] = v89
    return v82
  }
  func f6(_ v0: s0) -> s0 {
    let v1: [s0] = [v0, v0]
    var v2: s0 = v0
    let v3: s0 = f43(v0, v0)
    let v4: [[Double]] = v0.p2
    v2.p1 = v4
    let v5: [[Double]] = v3.p2
    let v9: [[Double]] = v2.p0
    let v11: s0 = v1[0]
    v2.p2 = v5
    let v12: [[Double]] = v11.p1
    let v17: s0 = s0(p0: v9, p1: v5, p2: v12)
    return v17
  }
  @inline(never)
  func f0(_ v0: s10, _ v1: Double) -> Double {
    let v6: s10 = f38(v0)
    var v2: Double = v1
    let v5: s10 = f46(v0)
    var v4: Double = v2
    var v7: Double = v2
    var v11: s10 = v0
    let v15: s1 = v6.p0
    let v12: [s0] = v11.p2
    let v14: s10 = f38(v0)
    var v13: s1 = v15
    v4 = v7
    v11.p0 = v13
    var v25: [s0] = v12
    let v17: s0 = v25[0]
    var v27: [s0] = v12
    v27[2] = v17
    let v23: s0 = f6(v17)
    let v35: s0 = f43(v23, v17)
    let v45: s0 = f6(v35)
    let v48: [[Double]] = v17.p2
    let v22: s0 = f6(v35)
    let v41: s10 = f38(v5)
    let v51: s1 = v41.p0
    let v40: s10 = f46(v41)
    v13.p0 = v22
    v13.p0 = v23
    v27[1] = v22
    v13.p0 = v17
    v11.p0 = v51
    let v44: Double = v7 + v7
    let v43: s0 = f43(v45, v17)
    let v59: [Double] = v48[0]
    let v39: [s0] = v51.p1
    v13.p0 = v35
    v25[2] = v22
    var v33: s1 = v15
    let v65: s1 = v40.p0
    v33 = v51
    let v87: Double = v59[0]
    let v92: [s0] = v65.p1
    v13.p0 = v17
    let v73: s0 = v51.p0
    var v94: [s0] = v92
    let v32: Double = v59[0]
    v33.p1 = v39
    v11.p2 = v12
    var v50: Double = v2
    v13.p1 = v94
    v94[1] = v73
    v94[0] = v43
    let v60: [Double] = [v32, v50, v32, v87, v44, v4]
    v50 = v87
    v13.p1 = v92
    v11.p2 = v27
    v50 = v1
    v27[0] = v17
    v13.p0 = v23
    let v172: [[s1]] = v14.p1
    let v173: Double = v60[0]
    v11.p1 = v172
    v11.p0 = v33
    return v173
  }
  func benchmark() {
    let v0: s10 = s10(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: [[5.0], [6.0]]), p1: [s0(p0: [[7.0], [8.0], [9.0]], p1: [[10.0], [11.0]], p2: [[12.0], [13.0]]), s0(p0: [[14.0], [15.0], [16.0]], p1: [[17.0], [18.0]], p2: [[19.0], [20.0]])]), p1: [[s1(p0: s0(p0: [[21.0], [22.0], [23.0]], p1: [[24.0], [25.0]], p2: [[26.0], [27.0]]), p1: [s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0], [32.0]], p2: [[33.0], [34.0]]), s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]], p2: [[40.0], [41.0]])])]], p2: [s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0]], p2: [[47.0], [48.0]]), s0(p0: [[49.0], [50.0], [51.0]], p1: [[52.0], [53.0]], p2: [[54.0], [55.0]]), s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0], [60.0]], p2: [[61.0], [62.0]])])
    let v1: Double = 63.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 63.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
