  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f2(_ v0: [s0], _ v1: s0) -> [s0] {
    let v4: s0 = v0[1]
    let v6: s0 = v0[1]
    var v2: [s0] = v0
    let v8: [[Double]] = v6.p0
    v2[1] = v1
    var v12: [s0] = v0
    var v7: s0 = v6
    let v3: [[Double]] = v6.p0
    let v5: [[Double]] = v4.p1
    let v9: [[Double]] = v7.p0
    var v10: [s0] = v12
    let v13: [Double] = v5[0]
    var v25: [[Double]] = v3
    let v22: Double = v13[0]
    var v19: [[Double]] = v9
    var v14: [[Double]] = v25
    var v11: [[Double]] = v14
    let v15: [[Double]] = v7.p1
    let v37: [[Double]] = v1.p1
    var v51: [[Double]] = v37
    let v28: [[Double]] = v4.p1
    var v26: [Double] = v13
    v7.p0 = v8
    v7.p0 = v3
    v26[0] = v22
    let v17: [Double] = v14[0]
    v10[1] = v6
    let v27: [Double] = v51[0]
    v7.p0 = v19
    var v60: Double = v22
    var v29: s0 = v7
    let v16: [[Double]] = v7.p1
    v10[0] = v29
    var v43: [[Double]] = v51
    let v42: [[Double]] = v1.p0
    v7.p1 = v43
    let v24: s0 = v12[0]
    let v52: Double = v27[0]
    let v38: Double = v60 + v52
    v29.p1 = v37
    v7.p1 = v5
    v29.p1 = v5
    var v47: s0 = v29
    let v31: [[Double]] = v7.p0
    let v56: [[Double]] = v47.p1
    var v36: s0 = v4
    let v44: [Double] = v15[0]
    v29.p1 = v51
    v26[0] = v38
    let v79: [[[Double]]] = [v5, v16, v51]
    v47.p0 = v11
    var v49: [Double] = v44
    var v86: [[[Double]]] = v79
    var v54: [[Double]] = v9
    v2[0] = v47
    v7.p1 = v37
    var v129: [[Double]] = v9
    let v65: s0 = v12[0]
    v47.p1 = v37
    v19[1] = v17
    v26 = v49
    let v63: s0 = v10[1]
    v11[0] = v17
    v12[0] = v65
    v51[0] = v26
    let v150: [[Double]] = v36.p0
    var v96: [s0] = v12
    v2[0] = v65
    let v69: s0 = v10[1]
    v47 = v63
    v2[0] = v69
    var v122: [[[Double]]] = v86
    let v100: s0 = s0(p0: v31, p1: v56)
    v96[1] = v100
    v47.p0 = v129
    let v93: [Double] = v150[2]
    v86 = v122
    let v128: [[s0]] = [v96, v96, v12, v10, v0, v0, v2]
    let v82: [s0] = v128[5]
    v19[1] = v93
    let v53: [[Double]] = v24.p1
    v29.p1 = v53
    v7.p0 = v42
    let v231: [[s0]] = [v96, v0, v2, v96, v82]
    v7.p1 = v28
    let v178: [[Double]] = v86[0]
    v47.p1 = v178
    let v201: [s0] = v231[4]
    v12[1] = v69
    v47.p0 = v54
    return v201
  }
  func f1(_ v0: s0, _ v1: [s0]) -> s0 {
    let v7: [[Double]] = v0.p0
    let v6: [[[Double]]] = [v7, v7]
    let v5: s0 = v1[0]
    let v8: [[Double]] = v6[0]
    let v2: [Double] = v8[0]
    let v4: [[Double]] = v6[1]
    let v21: [s0] = f2(v1, v0)
    let v11: [s0] = f2(v21, v0)
    let v9: [[Double]] = v5.p1
    let v13: [[Double]] = v5.p1
    let v14: [s0] = f2(v11, v0)
    let v10: [s0] = f2(v14, v5)
    var v18: s0 = v5
    let v17: [[Double]] = v0.p1
    v18.p1 = v9
    let v30: [Double] = v13[0]
    let v31: [s0] = f2(v1, v18)
    let v25: [s0] = f2(v10, v18)
    let v16: [[Double]] = v18.p0
    let v33: [[Double]] = v18.p0
    let v48: s0 = v25[0]
    let v57: [[Double]] = v5.p1
    let v50: [[Double]] = v18.p1
    let v56: [[Double]] = v18.p0
    let v54: s0 = v11[0]
    v18.p0 = v4
    var v59: [[[Double]]] = v6
    v18 = v5
    let v71: [[Double]] = v59[1]
    let v53: [s0] = f2(v31, v5)
    let v47: [[Double]] = v54.p1
    v59 = v6
    let v82: s0 = v53[0]
    v18.p0 = v71
    var v74: [[Double]] = v33
    v59[1] = v56
    v18.p1 = v50
    v18.p1 = v57
    let v126: s0 = s0(p0: v74, p1: v57)
    v18.p1 = v50
    v18.p0 = v7
    v74[2] = v30
    v18.p1 = v17
    v18.p1 = v17
    v18.p0 = v33
    v18.p0 = v74
    var v105: s0 = v82
    let v195: [[Double]] = v126.p0
    v105.p0 = v33
    let v73: [[Double]] = v0.p0
    v105.p0 = v16
    v105.p1 = v47
    let v76: [s0] = [v18, v0, v105, v5, v48, v48, v5]
    v18.p0 = v73
    v105.p0 = v195
    var v107: [s0] = v76
    v74[0] = v2
    var v251: [s0] = v107
    v105.p0 = v4
    let v174: s0 = v251[1]
    v105.p0 = v73
    return v174
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [s0], _ v2: s0, _ v3: s0, _ v4: s0, _ v5: [s0], _ v6: s0, _ v7: [s0], _ v8: Double) -> Double {
    let v9: [[Double]] = v3.p0
    let v17: s0 = v5[0]
    let v13: [s0] = f2(v0, v17)
    let v22: [s0] = f2(v13, v6)
    let v19: s0 = f1(v17, v22)
    let v32: Double = v8 / v8
    let v35: [[Double]] = v19.p1
    let v47: [Double] = v9[2]
    let v28: [Double] = v35[0]
    var v51: [Double] = v28
    v51[0] = v8
    v51[0] = v32
    let v134: Double = v51[0]
    v51 = v47
    return v134
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])]
    let v1: [s0] = [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])]
    let v2: s0 = s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])
    let v3: s0 = s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])
    let v4: s0 = s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])
    let v5: [s0] = [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]), s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])]
    let v6: s0 = s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]])
    let v7: [s0] = [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])]
    let v8: Double = 44.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 44.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7, v8)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
