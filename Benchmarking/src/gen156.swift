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
    var p0: [s1]
    var p1: [[s0]]
  }
  func f56(_ v0: s1) -> s1 {
    var v7: s1 = v0
    var v1: s1 = v0
    let v2: [s0] = v1.p0
    let v3: s0 = v2[0]
    let v5: [[Double]] = v3.p1
    let v4: [s0] = v7.p0
    v1.p1 = v3
    v7 = v0
    let v10: s1 = s1(p0: v4, p1: v3)
    let v12: [[s0]] = [v2, v4, v4, v2, v4, v2, v4]
    var v9: s1 = v10
    var v11: [[s0]] = v12
    let v20: s0 = v10.p1
    v7.p1 = v20
    v11[4] = v2
    var v13: [s0] = v4
    let v27: s0 = v2[0]
    var v26: [[s0]] = v11
    let v35: s1 = s1(p0: v13, p1: v27)
    var v25: s0 = v20
    let v28: [s0] = v9.p0
    v9.p1 = v25
    let v44: [s0] = v26[6]
    let v17: s1 = s1(p0: v44, p1: v3)
    var v23: [[Double]] = v5
    v7.p0 = v28
    let v41: [s0] = v7.p0
    v1 = v35
    v25.p1 = v23
    v26[0] = v44
    v9.p0 = v41
    v11[6] = v4
    return v17
  }
  func f50(_ v0: s2) -> s2 {
    let v8: [s1] = v0.p0
    var v5: s2 = v0
    v5 = v0
    let v16: [s1] = v0.p0
    let v28: [[s1]] = [v16, v8, v8]
    v5.p0 = v8
    let v23: [s1] = v28[2]
    v5 = v0
    var v33: s2 = v5
    var v29: s2 = v5
    let v44: [s1] = v29.p0
    var v134: s2 = v33
    var v77: [s1] = v44
    v134.p0 = v77
    var v76: s2 = v134
    v76.p0 = v23
    return v76
  }
  func f49(_ v0: s2) -> s2 {
    var v3: s2 = v0
    var v5: s2 = v3
    let v7: [[s0]] = v3.p1
    let v18: s2 = f50(v5)
    let v20: s2 = f50(v18)
    v3.p1 = v7
    return v20
  }
  func f41(_ v0: s2) -> s2 {
    let v8: s2 = f49(v0)
    let v9: s2 = f49(v8)
    let v12: s2 = f50(v9)
    let v11: [s1] = v9.p0
    var v19: s2 = v12
    let v23: s2 = f50(v19)
    v19.p0 = v11
    let v22: s2 = f49(v23)
    v19.p0 = v11
    return v22
  }
  func f27(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v2: [[Double]] = v0.p0
    let v6: [Double] = v2[2]
    let v5: [[Double]] = v7.p1
    var v4: [[Double]] = v2
    v7.p0 = v2
    var v1: [[Double]] = v5
    let v3: [[Double]] = v7.p1
    var v8: [Double] = v6
    let v13: [[Double]] = v7.p0
    v4[2] = v6
    var v9: [[Double]] = v5
    var v11: s0 = v0
    v9[0] = v6
    var v20: [[Double]] = v2
    v7.p1 = v3
    let v22: [Double] = v3[1]
    var v36: [[Double]] = v1
    let v12: Double = v6[0]
    let v42: [Double] = v3[1]
    let v29: [[Double]] = v11.p0
    let v21: [Double] = v1[1]
    let v70: [[Double]] = v7.p0
    let v14: [[Double]] = v0.p1
    let v25: [Double] = v5[1]
    v11 = v7
    let v17: [[Double]] = v0.p1
    let v10: [[Double]] = v11.p0
    let v43: s0 = s0(p0: v70, p1: v36)
    v9[1] = v8
    v7.p1 = v36
    var v16: s0 = v43
    var v24: [[Double]] = v13
    v8[0] = v12
    v1[1] = v22
    v11.p0 = v2
    let v48: [[Double]] = v16.p1
    v11.p0 = v4
    v7.p1 = v48
    var v26: [[Double]] = v17
    let v34: [Double] = v14[0]
    v16.p1 = v3
    v8[0] = v12
    v7.p1 = v36
    let v51: [Double] = v29[2]
    let v45: [[Double]] = v11.p0
    v1 = v48
    v16.p1 = v26
    let v40: Double = v6[0]
    let v28: [[Double]] = [v25, v21]
    let v31: [[Double]] = v43.p1
    let v96: [Double] = v10[0]
    let v27: [[Double]] = v16.p1
    let v46: [Double] = v28[0]
    v11.p0 = v29
    v7.p0 = v20
    var v50: [Double] = v46
    let v85: [Double] = v4[1]
    var v79: [[Double]] = v29
    v79[1] = v50
    let v91: [Double] = v31[1]
    var v39: [[Double]] = v45
    v9[1] = v51
    var v86: [[Double]] = v24
    v11.p1 = v48
    v11.p0 = v39
    var v100: [Double] = v91
    var v116: Double = v40
    var v77: [Double] = v85
    v11.p1 = v3
    v86[2] = v100
    var v47: Double = v116
    var v117: [Double] = v96
    v1[1] = v42
    v11.p1 = v9
    var v66: [Double] = v34
    var v122: Double = v116
    let v97: Double = v66[0]
    v122 = v116
    v77[0] = v47
    v117[0] = v116
    v16.p1 = v27
    v11.p1 = v1
    var v62: [[Double]] = v2
    v79[0] = v77
    let v125: Double = v25[0]
    v7.p0 = v29
    v9[1] = v117
    let v69: [Double] = [v122, v125]
    v79[2] = v21
    let v56: Double = v69[1]
    v77[0] = v97
    v16.p0 = v45
    let v52: Double = v69[0]
    v7.p0 = v62
    v62[0] = v25
    v47 = v52
    let v184: [[Double]] = v16.p1
    var v142: s0 = v7
    v26[1] = v77
    v4[1] = v85
    v100[0] = v56
    let v133: [[Double]] = v142.p0
    let v175: [Double] = v184[1]
    v7.p0 = v79
    v39[2] = v175
    v11.p0 = v86
    v11.p1 = v1
    v16.p0 = v133
    return v11
  }
  func f26(_ v0: s2) -> s2 {
    var v5: s2 = v0
    v5 = v0
    let v7: s2 = f49(v5)
    var v8: s2 = v7
    let v4: [s1] = v7.p0
    let v10: s2 = f41(v8)
    v8.p0 = v4
    return v10
  }
  func f19(_ v0: s1) -> s1 {
    let v7: s1 = f56(v0)
    return v7
  }
  func f17(_ v0: s2) -> s2 {
    let v5: [s2] = [v0, v0, v0, v0, v0, v0]
    let v6: s2 = f50(v0)
    let v2: s2 = v5[4]
    let v7: s2 = f41(v2)
    var v8: [s2] = v5
    let v1: s2 = f26(v2)
    var v21: [s2] = v8
    v21[0] = v7
    v21[1] = v6
    v21[0] = v7
    let v45: s2 = v8[5]
    v21[5] = v45
    let v101: s2 = v21[1]
    v21[1] = v1
    let v130: s2 = f41(v7)
    v8[1] = v130
    return v101
  }
  func f12(_ v0: s1, _ v1: s2) -> s1 {
    let v4: [s1] = [v0]
    let v6: s0 = v0.p1
    let v3: s1 = v4[0]
    let v8: s0 = f27(v6)
    let v7: s0 = f27(v6)
    let v5: [[s0]] = v1.p1
    let v9: [s0] = v5[0]
    var v12: [s1] = v4
    let v20: s1 = f19(v0)
    v12[0] = v3
    let v11: s1 = v12[0]
    v12 = v4
    var v30: [s0] = v9
    var v35: s1 = v11
    let v15: s0 = f27(v7)
    let v18: [s0] = v0.p0
    var v83: [s0] = v30
    let v34: s1 = s1(p0: v18, p1: v15)
    let v25: [s1] = [v34, v35, v35, v20, v0, v0]
    let v22: s1 = s1(p0: v83, p1: v8)
    v83 = v30
    let v41: s1 = f19(v0)
    v12[0] = v11
    let v69: s1 = v25[5]
    v12[0] = v41
    v30[0] = v15
    let v48: s0 = f27(v7)
    v83[0] = v48
    let v171: s0 = v34.p1
    v35.p1 = v48
    v12[0] = v22
    v83[0] = v171
    return v69
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s2, _ v2: Double) -> Double {
    let v7: s2 = f17(v1)
    let v11: s2 = f26(v7)
    let v19: s1 = f12(v0, v11)
    let v20: s1 = f12(v19, v7)
    let v34: [s0] = v20.p0
    let v21: s0 = v34[0]
    let v42: [[Double]] = v21.p0
    let v45: [Double] = v42[1]
    var v96: [Double] = v45
    let v74: Double = v45[0]
    let v61: Double = v96[0]
    v96[0] = v74
    v96[0] = v61
    return v61
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])], p1: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]))
    let v1: s2 = s2(p0: [s1(p0: [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])], p1: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])), s1(p0: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])], p1: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]))], p1: [[s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])], [s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])]])
    let v2: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
