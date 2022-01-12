  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s3 {
    var p0: [s2]
    var p1: [s2]
  }
  struct s6 {
    var p0: s3
    var p1: s2
  }
  func f71(_ v0: s2) -> s2 {
    var v6: s2 = v0
    let v5: [s2] = [v0]
    let v4: [s1] = v0.p0
    let v3: [s1] = v6.p0
    let v9: s3 = s3(p0: v5, p1: v5)
    let v1: s1 = v4[0]
    let v2: [s2] = v9.p0
    let v11: s0 = v1.p0
    let v19: s2 = s2(p0: v4, p1: v11)
    var v8: s0 = v11
    var v23: s2 = v6
    var v25: s3 = v9
    v23.p0 = v3
    let v16: [s1] = v23.p0
    let v10: [[Double]] = v11.p1
    v8.p1 = v10
    let v21: [s2] = v25.p1
    v23.p0 = v3
    v6.p1 = v8
    var v41: [s2] = v21
    v25.p0 = v41
    v6 = v23
    v41[0] = v6
    v23.p0 = v3
    let v48: s2 = v2[0]
    v41[0] = v19
    v25.p1 = v2
    v41[0] = v0
    v41[0] = v23
    v25.p1 = v41
    v41[0] = v48
    var v30: s2 = v6
    v30.p1 = v11
    v41[0] = v23
    v41[0] = v30
    v41[0] = v6
    v30.p0 = v16
    let v93: s2 = v41[0]
    return v93
  }
  func f56(_ v0: [s1]) -> [s1] {
    var v7: [s1] = v0
    var v3: [s1] = v7
    var v4: [s1] = v0
    var v1: [s1] = v3
    let v5: s1 = v7[0]
    var v2: s1 = v5
    var v9: s1 = v5
    let v8: s0 = v5.p0
    let v6: s1 = v7[0]
    let v15: s1 = v4[0]
    var v10: s1 = v6
    let v13: [[Double]] = v8.p1
    let v14: s0 = v6.p0
    let v12: s1 = v0[0]
    let v19: [s0] = [v8, v8]
    let v31: s0 = v19[1]
    var v27: [s0] = v19
    let v25: s0 = v12.p0
    v9.p0 = v25
    let v16: s0 = v2.p0
    var v28: [s1] = v4
    let v21: s0 = v15.p0
    v9.p1 = v21
    var v35: s1 = v2
    let v23: s0 = v27[1]
    let v46: s1 = v28[0]
    var v32: s1 = v12
    v9.p0 = v25
    let v33: [[Double]] = v31.p1
    var v30: [s0] = v27
    let v52: s0 = s0(p0: v33, p1: v33)
    v28[0] = v2
    v10.p1 = v23
    var v76: [s1] = v1
    let v51: s0 = v30[0]
    let v54: s0 = v10.p1
    v7[0] = v10
    var v37: [s0] = v27
    var v26: s1 = v35
    v76[0] = v46
    let v122: s0 = v9.p1
    let v60: [[Double]] = v16.p1
    v28[0] = v32
    var v65: s0 = v54
    v35.p1 = v31
    v10.p1 = v65
    let v100: s0 = v5.p0
    v2.p0 = v25
    var v49: s1 = v9
    let v58: s1 = v3[0]
    var v73: [s0] = v27
    var v41: [s1] = v3
    v30 = v73
    let v90: s2 = s2(p0: v4, p1: v100)
    var v75: [s0] = v37
    let v113: s2 = f71(v90)
    v30[0] = v16
    v41[0] = v49
    let v96: s2 = f71(v113)
    v7[0] = v49
    v3[0] = v58
    let v173: s0 = v26.p0
    v1[0] = v46
    v41 = v4
    v3[0] = v10
    let v253: s2 = f71(v96)
    v32.p1 = v14
    v2.p0 = v14
    let v69: [[Double]] = v173.p0
    let v125: s0 = s0(p0: v13, p1: v69)
    v32.p0 = v122
    v41 = v76
    v1[0] = v35
    v26.p1 = v54
    v65.p0 = v60
    v3[0] = v12
    v30 = v75
    v32.p1 = v125
    v10.p1 = v51
    let v206: s0 = v253.p1
    let v189: s0 = v75[1]
    var v163: s0 = v31
    v37[1] = v52
    v10.p1 = v163
    v26.p1 = v189
    v10.p0 = v122
    v26.p0 = v206
    v75 = v73
    return v41
  }
  func f44(_ v0: s2) -> s2 {
    let v1: s0 = v0.p1
    let v7: [[Double]] = v1.p1
    let v3: [[Double]] = v1.p1
    var v8: [[Double]] = v3
    let v2: [Double] = v3[0]
    let v6: [Double] = v8[0]
    let v10: [Double] = v7[0]
    v8[0] = v10
    let v9: [s1] = v0.p0
    v8[0] = v6
    let v17: s2 = f71(v0)
    let v25: s2 = f71(v17)
    var v13: [s1] = v9
    var v19: s2 = v0
    v19.p0 = v9
    v8[0] = v6
    let v16: [s1] = v17.p0
    let v20: [Double] = v3[0]
    v8[0] = v6
    v8[0] = v2
    let v45: [s1] = f56(v16)
    v8[0] = v20
    let v32: s1 = v45[0]
    v19.p0 = v9
    v19.p0 = v9
    let v42: [s1] = v25.p0
    let v59: s0 = v32.p0
    var v56: s0 = v59
    v56.p1 = v8
    v19.p0 = v42
    v56.p0 = v8
    v19.p0 = v13
    v19.p1 = v1
    var v140: [Double] = v2
    var v86: s2 = v19
    v86.p1 = v56
    v8[0] = v140
    v56.p0 = v3
    return v86
  }
  func f27(_ v0: s6) -> s6 {
    var v4: s6 = v0
    let v6: s3 = v0.p0
    let v3: [s6] = [v4, v4, v4, v0, v0]
    let v5: s6 = v3[3]
    let v1: [s2] = v6.p1
    let v2: s2 = v1[0]
    var v9: s3 = v6
    let v12: s2 = f44(v2)
    let v37: s2 = f71(v2)
    var v20: [s2] = v1
    v9.p1 = v20
    let v14: s2 = v20[0]
    let v26: s2 = f44(v2)
    let v28: s2 = f44(v26)
    let v73: s2 = v20[0]
    v20[0] = v14
    v4.p1 = v73
    let v32: s2 = v20[0]
    let v23: s2 = f44(v28)
    var v25: s6 = v5
    v20[0] = v37
    var v18: [s2] = v1
    let v41: s2 = f71(v32)
    v9.p1 = v18
    v18[0] = v41
    v4.p1 = v23
    v20[0] = v14
    var v48: [s6] = v3
    v18[0] = v14
    v18[0] = v12
    var v49: [s2] = v1
    v9.p0 = v49
    v20[0] = v23
    v20[0] = v23
    v9.p1 = v49
    let v129: s6 = v48[1]
    let v130: s2 = v18[0]
    v20[0] = v130
    v48[0] = v25
    v25.p0 = v9
    return v129
  }
  func f16(_ v0: s6, _ v1: s0) -> s6 {
    var v3: s6 = v0
    let v4: s6 = f27(v3)
    let v8: s2 = v4.p1
    v3.p1 = v8
    let v2: s2 = v4.p1
    let v5: s2 = v3.p1
    v3.p1 = v8
    v3.p1 = v5
    v3.p1 = v2
    v3.p1 = v2
    return v3
  }
  func f11(_ v0: s6, _ v1: Double, _ v2: s2) -> Double {
    let v6: s0 = v2.p1
    var v4: s0 = v6
    var v8: Double = v1
    let v12: Double = v8 / v8
    var v26: Double = v12
    let v61: Double = v26 * v1
    let v36: [[Double]] = v4.p0
    let v47: [Double] = v36[0]
    let v95: [[Double]] = v6.p0
    let v109: Double = v47[0]
    v4.p1 = v95
    let v78: Double = v109 * v61
    return v78
  }
  @inline(never)
  func f0(_ v0: [s6], _ v1: Double) -> Double {
    let v6: s6 = v0[0]
    let v5: s6 = v0[0]
    let v7: s2 = v6.p1
    let v3: s2 = f71(v7)
    let v10: s3 = v6.p0
    var v19: s3 = v10
    let v4: [s2] = v19.p1
    let v16: [s2] = v10.p0
    var v23: [s6] = v0
    let v12: s3 = s3(p0: v4, p1: v16)
    var v15: [s2] = v16
    let v18: s2 = v15[0]
    let v27: s2 = v6.p1
    var v46: Double = v1
    let v24: s3 = s3(p0: v4, p1: v4)
    let v33: s2 = f71(v27)
    v23[0] = v5
    let v34: [s2] = v10.p0
    var v58: s6 = v5
    v15[0] = v7
    let v60: s6 = s6(p0: v24, p1: v33)
    let v42: s0 = v3.p1
    var v44: s0 = v42
    var v41: [s6] = v23
    v58.p0 = v19
    v19 = v12
    v19.p1 = v16
    v19.p1 = v34
    let v89: s6 = v41[0]
    v23[0] = v58
    let v80: s6 = f16(v89, v44)
    let v76: Double = f11(v80, v46, v27)
    let v109: Double = f11(v60, v76, v18)
    let v98: [[Double]] = v44.p0
    v44.p0 = v98
    return v109
  }
  func benchmark() {
    let v0: [s6] = [s6(p0: s3(p0: [s2(p0: [s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s0(p0: [[2.0]], p1: [[3.0]]))], p1: s0(p0: [[4.0]], p1: [[5.0]]))], p1: [s2(p0: [s1(p0: s0(p0: [[6.0]], p1: [[7.0]]), p1: s0(p0: [[8.0]], p1: [[9.0]]))], p1: s0(p0: [[10.0]], p1: [[11.0]]))]), p1: s2(p0: [s1(p0: s0(p0: [[12.0]], p1: [[13.0]]), p1: s0(p0: [[14.0]], p1: [[15.0]]))], p1: s0(p0: [[16.0]], p1: [[17.0]]))), s6(p0: s3(p0: [s2(p0: [s1(p0: s0(p0: [[18.0]], p1: [[19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0]]))], p1: s0(p0: [[22.0]], p1: [[23.0]]))], p1: [s2(p0: [s1(p0: s0(p0: [[24.0]], p1: [[25.0]]), p1: s0(p0: [[26.0]], p1: [[27.0]]))], p1: s0(p0: [[28.0]], p1: [[29.0]]))]), p1: s2(p0: [s1(p0: s0(p0: [[30.0]], p1: [[31.0]]), p1: s0(p0: [[32.0]], p1: [[33.0]]))], p1: s0(p0: [[34.0]], p1: [[35.0]])))]
    let v1: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
