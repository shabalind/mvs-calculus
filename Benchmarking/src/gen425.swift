  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [Double]
  }
  struct s2 {
    var p0: s0
  }
  struct s6 {
    var p0: s2
    var p1: s0
  }
  func f68(_ v0: s2, _ v1: s0) -> s2 {
    let v6: s0 = v0.p0
    let v7: [[Double]] = v1.p1
    let v3: [[Double]] = v1.p1
    var v8: s0 = v6
    var v4: [[Double]] = v3
    let v16: [Double] = v4[1]
    v8.p1 = v7
    let v10: s0 = v0.p0
    var v23: [Double] = v16
    v8 = v1
    let v14: [s2] = [v0, v0, v0, v0, v0]
    var v9: s0 = v8
    v4[2] = v16
    let v13: s2 = v14[2]
    let v11: [[Double]] = v1.p0
    let v22: s0 = v0.p0
    v4[1] = v23
    let v20: [Double] = v7[2]
    v4[0] = v16
    v8.p1 = v4
    v8.p0 = v11
    let v21: [Double] = v3[0]
    let v49: s6 = s6(p0: v13, p1: v9)
    v23 = v16
    var v25: s0 = v6
    let v29: Double = v23[0]
    let v30: s2 = v49.p0
    let v48: [[[Double]]] = [v11, v11, v11, v11]
    let v38: Double = v29 + v29
    v23[0] = v38
    let v24: [s6] = [v49, v49, v49, v49, v49, v49]
    let v39: s0 = v49.p1
    v23[0] = v38
    v8.p0 = v11
    var v69: [[[Double]]] = v48
    let v33: [[s6]] = [v24, v24, v24, v24, v24, v24]
    v23[0] = v29
    let v51: [[Double]] = v9.p0
    v25.p0 = v51
    var v60: s0 = v22
    let v37: s0 = v30.p0
    v23[0] = v38
    let v52: [[Double]] = v60.p1
    var v42: Double = v29
    var v56: [[[Double]]] = v69
    v9.p1 = v52
    v23[0] = v42
    v60.p1 = v7
    var v73: [[Double]] = v51
    var v57: [[Double]] = v11
    v25.p1 = v4
    var v53: Double = v29
    let v103: [[Double]] = v10.p0
    let v59: [s6] = v33[4]
    v60.p1 = v3
    var v98: [Double] = v20
    v57[0] = v98
    let v81: s6 = v59[2]
    let v85: [[Double]] = v25.p0
    v8.p0 = v85
    var v54: [Double] = v20
    var v117: [[[Double]]] = v56
    v57[0] = v21
    v54[0] = v53
    v60 = v39
    v9.p0 = v103
    v73[0] = v54
    let v116: [[Double]] = v117[1]
    v25.p0 = v51
    var v176: s6 = v81
    var v170: s6 = v176
    v9.p0 = v57
    v60.p1 = v52
    v176.p1 = v37
    v60.p0 = v116
    v9.p0 = v73
    v98[0] = v42
    let v133: s2 = v170.p0
    return v133
  }
  func f49(_ v0: s0, _ v1: s2) -> s0 {
    let v2: s0 = v1.p0
    let v3: s0 = v1.p0
    let v7: [[Double]] = v2.p1
    var v8: s0 = v3
    let v5: [Double] = v7[1]
    let v9: Double = v5[0]
    v8.p1 = v7
    let v4: s2 = f68(v1, v3)
    let v11: s2 = f68(v4, v3)
    let v6: Double = v5[0]
    let v10: [[Double]] = v0.p0
    let v12: [[Double]] = [v5, v5, v5, v5, v5, v5]
    let v18: s2 = f68(v11, v2)
    v8.p0 = v10
    v8.p1 = v7
    v8.p0 = v10
    let v19: [[Double]] = v3.p1
    v8 = v0
    v8.p0 = v10
    let v20: s0 = v4.p0
    var v14: Double = v6
    v14 = v9
    let v28: s2 = f68(v1, v3)
    v8.p0 = v10
    let v21: [Double] = v12[5]
    var v41: [Double] = v21
    let v50: [[Double]] = v3.p0
    v41[0] = v14
    let v42: Double = v9 / v14
    var v26: [[Double]] = v10
    var v62: [Double] = v41
    let v30: s0 = v18.p0
    var v46: Double = v6
    v62[0] = v9
    let v22: [[Double]] = v20.p1
    let v86: s0 = v28.p0
    var v48: [[Double]] = v26
    v48[0] = v62
    var v38: Double = v9
    v8.p0 = v26
    var v37: s0 = v30
    let v75: [Double] = v12[1]
    let v34: Double = v9 / v46
    v37.p0 = v48
    var v71: Double = v9
    let v49: s2 = f68(v18, v86)
    let v45: [s0] = [v8, v2, v37, v2, v0]
    let v65: Double = v21[0]
    v8.p0 = v50
    let v78: s2 = f68(v1, v8)
    let v53: Double = v38 / v34
    var v79: [s0] = v45
    let v58: s0 = v79[0]
    var v52: s2 = v78
    let v150: [Double] = v10[0]
    v62[0] = v42
    v62 = v150
    v52.p0 = v30
    let v133: s0 = v49.p0
    var v187: [[Double]] = v19
    v8.p1 = v187
    let v72: [Double] = v22[2]
    v41[0] = v65
    v52.p0 = v3
    v52.p0 = v58
    v62[0] = v53
    v26[0] = v75
    var v85: s0 = v133
    let v124: s0 = v52.p0
    v79[0] = v3
    v37 = v85
    v41 = v72
    v41[0] = v71
    v8.p0 = v10
    v85.p0 = v48
    var v103: s0 = v124
    return v103
  }
  func f36(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p0
    var v6: [[Double]] = v4
    var v2: s0 = v0
    let v5: [[Double]] = v0.p0
    let v7: [[Double]] = v2.p0
    let v9: [Double] = v7[0]
    var v3: s0 = v0
    v2.p0 = v5
    var v14: [[Double]] = v4
    let v1: [Double] = v6[0]
    var v15: [[Double]] = v7
    var v11: s0 = v2
    let v24: [[Double]] = v0.p0
    let v13: [[Double]] = v0.p1
    let v16: [s0] = [v3, v11, v2, v2, v3]
    v14[0] = v1
    v11.p0 = v24
    let v12: [[Double]] = v3.p1
    let v17: [Double] = v13[1]
    v3.p1 = v13
    v2.p0 = v15
    let v55: [[Double]] = v2.p1
    v15[0] = v17
    v11.p0 = v14
    let v66: [[Double]] = v11.p1
    v2.p1 = v66
    v2.p1 = v55
    v3.p1 = v12
    let v91: [[Double]] = v0.p0
    v14[0] = v9
    v2.p1 = v12
    v3.p1 = v55
    v2.p0 = v91
    let v77: s0 = v16[3]
    return v77
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v6: s0 = v0.p0
    let v5: s0 = v0.p0
    let v4: s0 = f49(v6, v0)
    let v2: s2 = f68(v0, v5)
    var v7: s0 = v6
    let v11: s0 = v0.p0
    let v12: [[Double]] = v5.p1
    let v9: s0 = f49(v4, v2)
    let v10: s0 = f36(v7)
    var v8: [[Double]] = v12
    let v36: [[Double]] = v11.p0
    v7.p0 = v36
    let v26: s0 = f36(v9)
    let v15: [Double] = v12[0]
    let v16: s0 = v0.p0
    v8[0] = v15
    v8[1] = v15
    v7.p1 = v8
    let v20: [[Double]] = v16.p0
    let v42: [[Double]] = v6.p0
    v8[1] = v15
    v8[2] = v15
    let v57: [[Double]] = v9.p0
    let v30: [[[Double]]] = [v57, v42]
    v7.p1 = v12
    let v62: [[Double]] = v30[0]
    let v96: [Double] = v62[0]
    let v39: s1 = s1(p0: v10, p1: v96)
    v8 = v12
    v7.p0 = v20
    let v70: [[Double]] = v26.p1
    let v76: [Double] = v39.p1
    let v144: Double = v76[0]
    v7.p0 = v42
    v8 = v70
    v7.p1 = v8
    return v144
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]))
    let v1: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
