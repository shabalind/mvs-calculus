  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: [s1]
    var p1: [s0]
  }
  struct s4 {
    var p0: s1
    var p1: s3
  }
  func f45(_ v0: s3, _ v1: s1) -> s3 {
    var v2: s3 = v0
    var v4: s3 = v2
    var v3: s3 = v4
    let v6: [s0] = v1.p0
    let v5: [s0] = v1.p0
    var v9: [s0] = v5
    let v7: s0 = v9[0]
    var v8: s1 = v1
    v8.p1 = v7
    v8.p0 = v5
    v9[0] = v7
    let v11: s0 = v9[0]
    let v10: s0 = v5[0]
    v8.p0 = v6
    v9[0] = v7
    v9[0] = v10
    let v13: [s1] = v0.p0
    let v23: s0 = v5[0]
    let v16: Double = v10.p0
    v4.p0 = v13
    let v15: [s0] = v3.p1
    let v12: s1 = v13[0]
    v2.p0 = v13
    let v19: s0 = v15[1]
    let v14: s3 = s3(p0: v13, p1: v15)
    let v27: s0 = v6[0]
    let v18: [s1] = v3.p0
    v9[0] = v19
    let v28: Double = v23.p0
    let v59: Double = v16 + v28
    let v29: s0 = v5[0]
    v9[0] = v7
    var v20: s0 = v27
    v9[0] = v20
    v9[0] = v7
    let v36: s0 = v15[1]
    let v30: [s1] = v0.p0
    v9[0] = v23
    let v61: [s0] = v12.p0
    let v42: s1 = v30[0]
    v9[0] = v11
    v9[0] = v7
    let v44: [s0] = v4.p1
    let v83: [s0] = v4.p1
    let v45: Double = v36.p0
    var v60: [s0] = v44
    var v56: s3 = v2
    v2.p1 = v60
    var v39: s3 = v56
    v20.p0 = v28
    let v86: [Double] = [v28, v45, v16, v16]
    let v64: [[Double]] = v27.p1
    let v48: [s0] = v3.p1
    v20.p1 = v64
    var v123: [s0] = v83
    var v47: s3 = v39
    v56.p1 = v123
    v47.p1 = v44
    var v80: [[Double]] = v64
    let v70: s0 = v9[0]
    let v164: [s0] = v42.p0
    v60[1] = v29
    v8.p0 = v6
    let v76: Double = v86[2]
    let v52: Double = v76 * v59
    v9[0] = v11
    v8.p0 = v164
    let v101: Double = v16 * v52
    v39.p1 = v123
    let v68: [s3] = [v14, v4, v47, v0, v3, v39, v4]
    v39.p0 = v18
    v2.p1 = v15
    v8.p0 = v61
    v20.p0 = v101
    let v149: [s0] = v56.p1
    var v113: [s0] = v149
    v47.p1 = v48
    let v158: [[Double]] = v11.p1
    let v146: s0 = v113[0]
    v20.p1 = v80
    v56.p1 = v44
    v20.p1 = v80
    let v137: s3 = v68[3]
    var v145: [s1] = v13
    v2.p0 = v145
    v60[1] = v36
    v3.p0 = v13
    var v99: [[Double]] = v158
    let v97: [[Double]] = v70.p1
    v4.p1 = v149
    v20.p1 = v99
    let v169: s4 = s4(p0: v8, p1: v137)
    v60[0] = v146
    v20.p1 = v97
    let v283: s3 = v169.p1
    return v283
  }
  func f39(_ v0: s3) -> s3 {
    let v2: [s0] = v0.p1
    let v4: s0 = v2[0]
    let v8: [[Double]] = v4.p1
    var v1: s3 = v0
    let v5: [s0] = v0.p1
    var v3: [s0] = v5
    v1.p1 = v3
    let v15: Double = v4.p0
    var v11: [s0] = v5
    let v13: [s0] = v1.p1
    v1.p1 = v11
    var v26: s3 = v0
    let v24: [s0] = v1.p1
    let v36: [s0] = v26.p1
    v1.p1 = v3
    v26.p1 = v36
    v1.p1 = v3
    var v47: s3 = v0
    let v28: [s0] = v47.p1
    v47.p1 = v5
    let v58: s0 = v5[0]
    v26.p1 = v13
    let v32: [[s0]] = [v24, v5, v36, v11]
    var v70: s3 = v47
    let v34: s0 = s0(p0: v15, p1: v8)
    var v41: s3 = v26
    let v84: [s0] = v26.p1
    v70.p1 = v36
    var v43: s0 = v4
    v26.p1 = v24
    let v68: [s1] = v26.p0
    v70.p0 = v68
    let v156: s0 = v11[1]
    v11[0] = v43
    v11[1] = v156
    let v67: s0 = v84[1]
    v3[0] = v34
    let v73: [s0] = v32[0]
    let v53: [s0] = v32[2]
    v70.p1 = v53
    v11[0] = v58
    v70.p0 = v68
    v70.p0 = v68
    var v85: [s1] = v68
    var v40: [s0] = v73
    v11[1] = v58
    v40 = v28
    let v145: [s1] = v1.p0
    v41.p0 = v68
    let v94: [s1] = v26.p0
    let v86: [s1] = v41.p0
    v11[0] = v67
    let v92: s1 = v68[0]
    let v89: s3 = f45(v70, v92)
    v26.p1 = v40
    v41.p1 = v13
    var v103: s3 = v89
    let v59: s1 = v145[0]
    v103.p1 = v2
    v70.p0 = v94
    let v122: s3 = f45(v103, v59)
    v1.p0 = v86
    v103.p0 = v85
    return v122
  }
  func f33(_ v0: [s0]) -> [s0] {
    let v7: [[s0]] = [v0, v0, v0, v0]
    let v1: [[[s0]]] = [v7, v7, v7, v7, v7, v7]
    let v3: [[s0]] = v1[5]
    let v4: [s0] = v3[0]
    let v8: [[s0]] = v1[3]
    var v6: [s0] = v0
    v6 = v4
    var v17: [[s0]] = v8
    let v13: [s0] = v17[0]
    let v18: s0 = v6[0]
    let v11: s1 = s1(p0: v13, p1: v18)
    var v32: s1 = v11
    v32.p0 = v0
    let v26: [s0] = v32.p0
    v17[0] = v4
    let v59: [s0] = v32.p0
    let v63: s0 = v26[0]
    var v47: [s0] = v59
    let v77: s0 = v32.p1
    v47[0] = v63
    let v86: [s0] = v11.p0
    v47[0] = v77
    v17[0] = v86
    return v47
  }
  func f20(_ v0: s0, _ v1: s0) -> s0 {
    var v3: s0 = v0
    var v4: s0 = v1
    let v2: [[Double]] = v1.p1
    let v6: [Double] = v2[0]
    var v8: s0 = v0
    let v7: Double = v1.p0
    let v10: [Double] = v2[0]
    var v9: s0 = v1
    let v5: [Double] = v2[0]
    let v15: [Double] = v2[0]
    let v14: [[Double]] = v4.p1
    let v16: Double = v3.p0
    var v11: [Double] = v5
    let v12: Double = v15[0]
    var v13: [Double] = v11
    let v20: [[Double]] = v3.p1
    let v21: [[Double]] = v0.p1
    var v17: s0 = v8
    let v27: Double = v1.p0
    v4.p1 = v20
    var v32: s0 = v1
    var v35: s0 = v0
    let v34: [[Double]] = v1.p1
    let v19: Double = v1.p0
    let v36: [[Double]] = v1.p1
    v32.p0 = v12
    v4.p1 = v34
    var v22: [[Double]] = v14
    var v31: [Double] = v15
    v3.p1 = v2
    var v24: [Double] = v13
    let v42: [[Double]] = v0.p1
    let v73: Double = v32.p0
    var v26: s0 = v32
    let v82: [[Double]] = v35.p1
    let v61: [[Double]] = [v6, v5, v11, v24, v6]
    v22 = v2
    v31[0] = v16
    let v23: [[Double]] = v1.p1
    var v60: s0 = v8
    let v38: [[Double]] = v60.p1
    v35.p1 = v23
    let v37: Double = v27 - v7
    let v71: s0 = s0(p0: v37, p1: v21)
    v26.p1 = v34
    var v62: [[Double]] = v61
    var v49: s0 = v26
    let v43: [Double] = v62[2]
    let v46: Double = v71.p0
    let v58: [Double] = v36[0]
    let v50: [[Double]] = [v10, v24, v31]
    let v44: [Double] = v50[2]
    v22[0] = v58
    var v57: Double = v73
    var v51: [[Double]] = v38
    let v68: Double = v17.p0
    v32.p1 = v51
    let v64: Double = v8.p0
    let v53: Double = v32.p0
    v32.p0 = v19
    let v55: [[Double]] = v17.p1
    let v97: [[Double]] = v26.p1
    var v75: Double = v68
    v13[0] = v64
    let v56: Double = v32.p0
    v49.p0 = v57
    v26.p1 = v2
    let v99: s0 = s0(p0: v27, p1: v22)
    let v66: [[Double]] = v17.p1
    v8.p1 = v34
    v26.p1 = v42
    v35.p1 = v82
    v17.p0 = v56
    v60.p1 = v97
    v35.p0 = v19
    v13[0] = v53
    v4.p1 = v66
    let v80: [s0] = [v49, v9, v60, v99, v35, v9, v60]
    var v144: [s0] = v80
    let v237: [[Double]] = v0.p1
    v26.p1 = v237
    v4.p0 = v7
    var v196: [s0] = v144
    v62[2] = v44
    v8.p1 = v34
    v4.p1 = v23
    v60.p0 = v7
    v22[0] = v43
    v60.p0 = v12
    v35.p1 = v66
    let v200: s0 = v196[5]
    v4.p0 = v75
    v26.p1 = v55
    v8.p0 = v46
    return v200
  }
  func f19(_ v0: s3) -> s3 {
    let v1: s3 = f39(v0)
    let v2: s3 = f39(v0)
    var v3: s3 = v0
    let v8: [s1] = v1.p0
    let v5: s3 = f39(v2)
    var v7: [s1] = v8
    let v19: s1 = v7[0]
    let v10: [s0] = v0.p1
    let v36: [s0] = v19.p0
    let v18: s0 = v10[0]
    var v20: [s0] = v10
    var v16: s0 = v18
    var v12: [s0] = v20
    let v15: [s0] = f33(v36)
    let v21: [s1] = v3.p0
    let v17: [s1] = v2.p0
    let v23: [s0] = v19.p0
    let v34: s0 = v15[0]
    v3 = v0
    var v24: [s0] = v10
    v3.p1 = v24
    let v43: s0 = v23[0]
    v3.p1 = v24
    let v14: s0 = f20(v34, v18)
    v3.p1 = v10
    v20[1] = v14
    let v30: s0 = v19.p1
    v12[1] = v16
    let v41: s1 = v7[0]
    let v26: s3 = s3(p0: v7, p1: v12)
    v7[0] = v41
    let v47: [s1] = v1.p0
    let v35: s0 = v19.p1
    var v27: s0 = v30
    v12[1] = v34
    v3.p1 = v24
    v3.p1 = v24
    v12[0] = v43
    let v54: Double = v30.p0
    let v80: [[Double]] = v27.p1
    v24[1] = v27
    v27.p0 = v54
    v3.p0 = v21
    let v29: Double = v35.p0
    v3.p0 = v47
    let v67: s3 = f45(v0, v19)
    v16.p0 = v29
    v12[0] = v16
    v3.p0 = v17
    v3.p1 = v10
    v27.p1 = v80
    v16.p0 = v54
    v16.p1 = v80
    let v84: [s3] = [v67, v26, v3, v5]
    v3.p0 = v7
    v7 = v8
    let v115: s3 = v84[2]
    return v115
  }
  func f15(_ v0: s3) -> s3 {
    var v7: s3 = v0
    let v6: [s1] = v7.p0
    var v1: [s1] = v6
    let v5: [s0] = v7.p1
    var v3: s3 = v0
    v7.p1 = v5
    v7.p0 = v6
    let v4: s3 = f19(v7)
    let v11: s3 = f19(v3)
    var v9: [s1] = v6
    var v15: [s0] = v5
    let v12: s0 = v5[1]
    let v10: [s1] = v4.p0
    let v43: s1 = v6[0]
    v7 = v3
    v3.p0 = v1
    let v42: s1 = v9[0]
    let v21: s3 = f45(v0, v42)
    v7.p1 = v15
    v7.p0 = v6
    let v20: s1 = v10[0]
    let v24: [s3] = [v21, v11]
    let v40: s0 = v15[1]
    v3.p0 = v10
    var v22: [s3] = v24
    let v58: s3 = v22[0]
    v1[0] = v20
    v7.p1 = v15
    let v81: s0 = f20(v40, v12)
    v15[1] = v81
    v1[0] = v43
    return v58
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    let v4: s4 = v0[0]
    let v6: s3 = v4.p1
    let v3: s3 = f15(v6)
    let v28: [s1] = v3.p0
    let v16: s1 = v28[0]
    let v26: s0 = v16.p1
    let v42: Double = v26.p0
    return v42
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: s1(p0: [s0(p0: 0.0, p1: [[1.0]])], p1: s0(p0: 2.0, p1: [[3.0]])), p1: s3(p0: [s1(p0: [s0(p0: 4.0, p1: [[5.0]])], p1: s0(p0: 6.0, p1: [[7.0]]))], p1: [s0(p0: 8.0, p1: [[9.0]]), s0(p0: 10.0, p1: [[11.0]])]))]
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
