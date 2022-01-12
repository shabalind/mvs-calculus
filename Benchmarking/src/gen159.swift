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
    var p0: [s0]
    var p1: [[s1]]
  }
  struct s5 {
    var p0: s2
    var p1: s0
  }
  func f117(_ v0: s2) -> s2 {
    var v11: s2 = v0
    return v11
  }
  func f114(_ v0: s5) -> s5 {
    var v4: s5 = v0
    var v5: s5 = v0
    let v2: s0 = v4.p1
    let v7: [s5] = [v5, v0, v4, v4, v4, v0, v0]
    let v3: s2 = v0.p0
    let v10: s2 = f117(v3)
    var v9: [s5] = v7
    let v31: s2 = f117(v3)
    v5.p1 = v2
    let v17: s2 = f117(v31)
    let v22: s5 = v9[1]
    let v13: [s0] = [v2, v2, v2, v2]
    let v20: s0 = v13[1]
    let v21: s2 = f117(v17)
    v4.p1 = v2
    v5.p0 = v3
    var v16: s2 = v10
    let v30: s2 = f117(v3)
    v9[0] = v4
    v4.p0 = v16
    let v35: [s0] = v21.p0
    var v40: [s0] = v35
    v5.p0 = v17
    let v58: s0 = v0.p1
    let v60: s0 = v40[0]
    var v103: s5 = v22
    v103.p1 = v60
    v5.p1 = v2
    v5.p1 = v20
    v103 = v5
    v103.p0 = v30
    v103.p1 = v58
    return v103
  }
  func f112(_ v0: s2) -> s2 {
    let v1: s2 = f117(v0)
    let v2: s2 = f117(v1)
    let v8: s2 = f117(v1)
    let v5: [[s1]] = v8.p1
    var v7: [[s1]] = v5
    var v3: [[s1]] = v7
    let v13: s2 = f117(v2)
    let v4: [s1] = v7[0]
    let v19: s2 = f117(v13)
    var v18: [s1] = v4
    let v15: s1 = v18[0]
    let v10: s1 = v4[0]
    var v14: s1 = v10
    let v17: s2 = f117(v19)
    let v32: [s1] = v7[0]
    let v22: [s1] = [v14, v15, v10, v15, v15]
    let v36: [[s1]] = v17.p1
    let v31: s1 = v18[0]
    let v21: [s1] = v7[0]
    var v30: [s1] = v21
    let v34: [s0] = v8.p0
    var v20: [s1] = v32
    let v50: [[s1]] = [v20, v20, v30]
    let v27: [s1] = v3[0]
    let v23: s1 = v30[0]
    var v39: [[s1]] = v50
    let v56: s1 = v22[3]
    let v57: [s0] = v14.p0
    v18[0] = v31
    v39[0] = v30
    let v41: s0 = v34[0]
    v14.p1 = v41
    v18[0] = v14
    let v98: s0 = v57[2]
    let v47: [[Double]] = v98.p1
    let v44: [s0] = v15.p0
    v7[0] = v27
    var v49: s0 = v41
    let v89: s0 = v44[2]
    v14.p1 = v49
    v18[0] = v23
    var v107: [[Double]] = v47
    let v129: s5 = s5(p0: v0, p1: v89)
    let v69: s5 = f114(v129)
    var v80: [[s1]] = v39
    v49.p1 = v107
    v39[1] = v20
    let v133: [s0] = v31.p0
    let v74: [s1] = v80[0]
    v14.p0 = v133
    let v123: s5 = f114(v69)
    let v120: s0 = v56.p1
    let v114: s5 = f114(v123)
    v7[0] = v74
    let v122: s2 = v114.p0
    let v135: [[Double]] = v89.p0
    v49.p0 = v135
    v14.p1 = v120
    v3 = v36
    v39[2] = v18
    return v122
  }
  func f110(_ v0: s2) -> s2 {
    let v2: s2 = f112(v0)
    let v12: s2 = f112(v2)
    let v10: s2 = f117(v12)
    return v10
  }
  func f108(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p0
    let v1: [[Double]] = v0.p0
    var v5: s0 = v0
    v5.p0 = v1
    v5.p0 = v2
    return v5
  }
  func f107(_ v0: [s0]) -> [s0] {
    let v7: [[s0]] = [v0, v0, v0, v0, v0, v0, v0]
    var v6: [[s0]] = v7
    var v9: [[s0]] = v6
    v9[1] = v0
    let v18: [s0] = v9[2]
    return v18
  }
  func f106(_ v0: [s0]) -> [s0] {
    var v6: [s0] = v0
    let v4: s0 = v0[0]
    var v2: [s0] = v6
    let v13: s0 = v2[0]
    let v5: s0 = v2[0]
    let v9: [s0] = f107(v2)
    v2[0] = v5
    v6[0] = v13
    v2[0] = v13
    v2[0] = v13
    v2[0] = v13
    v6[0] = v4
    let v75: s0 = f108(v4)
    v2[0] = v75
    let v137: [s0] = f107(v9)
    return v137
  }
  func f95(_ v0: s0) -> s0 {
    let v1: s0 = f108(v0)
    let v3: [[Double]] = v1.p0
    var v7: s0 = v1
    let v9: [[Double]] = v0.p0
    var v8: [[Double]] = v9
    v7.p0 = v9
    var v4: s0 = v1
    let v5: s0 = f108(v7)
    let v2: [Double] = v3[0]
    var v20: [Double] = v2
    var v15: [Double] = v20
    let v13: [Double] = v3[0]
    let v25: Double = v13[0]
    let v14: s0 = f108(v5)
    var v10: s0 = v4
    var v24: Double = v25
    let v19: [Double] = v8[0]
    v10.p0 = v9
    var v12: [[Double]] = v8
    var v16: Double = v25
    v4.p0 = v12
    v7.p0 = v12
    v20[0] = v16
    let v71: s0 = f108(v0)
    let v29: [[Double]] = v4.p1
    v8[0] = v15
    let v21: [[Double]] = v14.p0
    let v34: [[Double]] = v71.p1
    v8[0] = v19
    v12 = v8
    v15[0] = v24
    v15[0] = v24
    v7.p1 = v29
    let v38: [Double] = v34[2]
    var v103: [[Double]] = v34
    v10.p1 = v103
    v103[1] = v15
    v8[0] = v38
    v20[0] = v25
    v10.p0 = v21
    return v10
  }
  func f54(_ v0: s1) -> s1 {
    let v2: s0 = v0.p1
    var v1: s1 = v0
    v1.p1 = v2
    let v5: s0 = f95(v2)
    v1 = v0
    let v6: s0 = f95(v5)
    v1.p1 = v5
    let v25: [s0] = v1.p0
    let v28: s0 = v25[0]
    let v19: s0 = f95(v6)
    let v33: s0 = f95(v6)
    let v93: s0 = v0.p1
    var v41: s1 = v1
    let v22: s0 = f95(v93)
    let v16: s0 = f108(v28)
    let v46: s0 = f95(v22)
    v41.p1 = v6
    v1.p0 = v25
    var v31: s1 = v41
    v31.p0 = v25
    v31.p0 = v25
    let v84: s0 = f108(v16)
    v1.p0 = v25
    v31.p1 = v19
    v1.p1 = v19
    let v112: s0 = f95(v33)
    v31.p1 = v46
    v41.p1 = v84
    v41.p1 = v112
    return v31
  }
  func f49(_ v0: s1) -> s1 {
    var v1: s1 = v0
    var v3: s1 = v1
    let v6: [s0] = v1.p0
    let v2: [s0] = v3.p0
    let v5: [s0] = v0.p0
    let v7: s1 = f54(v3)
    let v27: s0 = v5[2]
    let v17: s1 = f54(v7)
    v1.p0 = v5
    v3.p0 = v5
    v1.p1 = v27
    let v28: s1 = f54(v17)
    v3.p0 = v2
    let v142: [s1] = [v7, v28]
    let v55: [s0] = v3.p0
    var v138: [s1] = v142
    v3.p0 = v6
    let v106: s1 = v138[1]
    v1.p0 = v55
    let v95: s1 = f54(v106)
    let v121: s1 = f54(v28)
    v3 = v121
    return v95
  }
  func f42(_ v0: s2) -> s2 {
    let v7: s2 = f110(v0)
    let v2: s2 = f117(v7)
    let v6: [s0] = v7.p0
    let v3: [s0] = f107(v6)
    let v9: [[s1]] = v2.p1
    let v5: [[s1]] = v2.p1
    let v10: [[s0]] = [v3, v6, v3]
    let v11: s2 = f117(v0)
    let v13: [s0] = v7.p0
    var v18: [[s1]] = v5
    let v30: s0 = v13[0]
    let v8: s2 = f110(v11)
    let v12: s2 = f117(v7)
    let v14: [s0] = v10[2]
    var v17: s2 = v12
    let v42: [s0] = v17.p0
    v17.p0 = v6
    let v16: [s1] = v9[0]
    v18[0] = v16
    v17 = v8
    let v48: [s1] = v9[0]
    v18[0] = v16
    v18[0] = v48
    let v22: [s1] = v9[0]
    let v29: [s0] = v8.p0
    let v49: s0 = f95(v30)
    v17.p1 = v5
    v17.p1 = v18
    let v50: s1 = v22[0]
    let v53: s0 = v50.p1
    v17.p0 = v13
    var v59: [s0] = v42
    var v55: s2 = v11
    v18[0] = v22
    v59[0] = v49
    v55.p0 = v29
    let v180: [[s1]] = v8.p1
    v55.p0 = v14
    v59[0] = v53
    v18[0] = v22
    v18 = v180
    v18[0] = v16
    v55.p0 = v59
    return v55
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v5: s2 = v0
    let v4: s2 = f112(v5)
    let v10: [s0] = v0.p0
    let v11: s2 = f112(v0)
    let v3: [s0] = v5.p0
    let v13: [s0] = f107(v3)
    var v21: [s0] = v13
    let v14: s0 = v13[0]
    var v16: s0 = v14
    let v19: [[Double]] = v16.p0
    let v26: s2 = f42(v11)
    let v25: s0 = f95(v16)
    let v35: [s0] = f106(v10)
    v21[0] = v25
    let v28: [[s1]] = v4.p1
    v21 = v10
    let v24: [[s1]] = v26.p1
    let v23: [[Double]] = v16.p1
    v21[0] = v16
    var v53: [[s1]] = v28
    let v62: [s1] = v53[0]
    v5.p0 = v21
    v5.p1 = v24
    let v60: [Double] = v23[1]
    let v46: s0 = v35[0]
    let v51: Double = v60[0]
    let v57: s1 = v62[0]
    v21[0] = v46
    var v114: Double = v51
    var v54: s1 = v57
    let v99: s1 = f49(v54)
    let v102: s0 = v99.p1
    v16.p0 = v19
    v21[0] = v102
    return v114
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])], p1: [[s1(p0: [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])], p1: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]))]])
    let v1: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
