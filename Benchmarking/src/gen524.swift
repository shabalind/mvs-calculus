  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: [s1]
    var p1: s0
  }
  func f60(_ v0: s0) -> s0 {
    return v0
  }
  func f56(_ v0: [s0]) -> [s0] {
    let v4: s0 = v0[0]
    let v5: s0 = v0[0]
    let v2: s0 = v0[0]
    let v13: s0 = v0[0]
    var v1: s0 = v4
    let v8: [[Double]] = v2.p1
    let v9: s0 = f60(v2)
    let v6: [[[Double]]] = [v8, v8, v8]
    let v11: [[Double]] = v6[2]
    v1.p1 = v11
    let v28: s0 = f60(v9)
    let v35: [[Double]] = v2.p1
    let v32: s0 = f60(v1)
    let v41: [[Double]] = v13.p0
    v1 = v9
    let v60: s0 = f60(v32)
    var v84: [[Double]] = v41
    let v34: [[Double]] = v28.p1
    v1.p0 = v84
    let v58: s1 = s1(p0: v0, p1: v60)
    let v99: [[Double]] = v5.p1
    v1.p1 = v99
    v1.p1 = v35
    v1.p1 = v34
    let v106: [s0] = v58.p0
    return v106
  }
  func f50(_ v0: [s3]) -> [s3] {
    var v4: [s3] = v0
    let v1: s3 = v0[0]
    v4 = v0
    v4[1] = v1
    let v121: [[s3]] = [v4, v0]
    let v80: s3 = v0[0]
    v4[0] = v80
    let v75: [s3] = v121[1]
    return v75
  }
  func f47(_ v0: s1) -> s1 {
    var v3: s1 = v0
    let v6: [s0] = v0.p0
    let v4: s0 = v6[0]
    v3 = v0
    let v8: s0 = v6[0]
    var v2: s0 = v4
    let v5: s0 = f60(v2)
    var v10: s0 = v8
    let v20: [[Double]] = v10.p0
    v3.p1 = v5
    v2.p0 = v20
    v2.p0 = v20
    let v81: [[Double]] = v5.p1
    var v80: s1 = v3
    v10.p1 = v81
    var v177: s1 = v80
    return v177
  }
  func f37(_ v0: s0, _ v1: s0) -> s0 {
    let v6: [s0] = [v0, v0, v0, v0]
    let v3: s0 = v6[3]
    let v9: s0 = v6[3]
    var v13: [s0] = v6
    let v8: s0 = v13[2]
    v13[0] = v8
    v13[2] = v9
    var v20: s0 = v8
    let v12: s0 = f60(v20)
    v13[2] = v3
    let v14: s0 = f60(v12)
    let v31: [[Double]] = v12.p1
    let v55: [[Double]] = v12.p1
    let v37: [[Double]] = v8.p0
    v20.p1 = v55
    let v67: s0 = f60(v14)
    v13[1] = v67
    let v79: s0 = s0(p0: v37, p1: v31)
    return v79
  }
  func f36(_ v0: s3) -> s3 {
    var v3: s3 = v0
    let v5: s0 = v3.p1
    var v7: s0 = v5
    var v4: s3 = v3
    let v2: [s3] = [v3, v0]
    var v10: s3 = v4
    v3 = v0
    let v6: [s1] = v0.p0
    v4 = v3
    let v9: [[Double]] = v7.p1
    let v1: [[Double]] = v5.p1
    let v14: s0 = f37(v7, v5)
    let v11: [[Double]] = v5.p1
    v3.p1 = v14
    let v22: s0 = f37(v5, v5)
    let v8: [[Double]] = v7.p0
    var v20: [s3] = v2
    v20[1] = v10
    let v18: s0 = s0(p0: v8, p1: v11)
    v4.p1 = v14
    let v46: [Double] = v9[1]
    let v34: [s3] = f50(v2)
    var v29: [[Double]] = v1
    let v35: s3 = v20[1]
    v20 = v34
    let v23: s0 = f37(v5, v18)
    v3.p1 = v22
    v3.p1 = v23
    v7.p1 = v29
    v29[1] = v46
    v10.p0 = v6
    v4.p1 = v5
    return v35
  }
  func f33(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v7: [[Double]] = v4.p1
    v4.p1 = v7
    let v2: s0 = f37(v4, v0)
    v4 = v2
    let v3: s0 = f37(v4, v0)
    v4.p1 = v7
    let v13: [[Double]] = v3.p1
    let v8: [[Double]] = v2.p0
    let v9: [[Double]] = v3.p0
    let v10: s0 = f60(v3)
    let v20: s0 = f37(v4, v3)
    let v22: [[Double]] = v20.p0
    let v17: s0 = f60(v2)
    v4.p1 = v13
    v4.p0 = v8
    let v25: [[Double]] = v4.p1
    let v41: [[[Double]]] = [v22, v8]
    v4.p1 = v25
    let v24: [[Double]] = v20.p1
    v4.p1 = v24
    let v43: [[Double]] = v0.p1
    var v36: s0 = v4
    let v58: [[Double]] = v0.p1
    let v49: [[Double]] = v41[0]
    v4.p0 = v9
    let v32: [[Double]] = v17.p1
    var v52: s0 = v36
    var v47: s0 = v52
    v36.p0 = v9
    v36.p0 = v49
    v4.p0 = v49
    let v33: [[Double]] = v41[0]
    v52.p1 = v24
    v47.p1 = v58
    let v66: [[Double]] = v10.p1
    v4.p0 = v33
    v52.p1 = v43
    v47.p0 = v22
    v36 = v20
    let v123: s0 = s0(p0: v49, p1: v24)
    v36.p1 = v58
    v47.p1 = v32
    v4.p1 = v66
    v4.p1 = v58
    v4.p1 = v13
    let v241: s0 = f37(v123, v47)
    return v241
  }
  func f28(_ v0: [s3], _ v1: s0) -> s0 {
    let v6: s0 = f37(v1, v1)
    var v4: s0 = v1
    let v7: s0 = f37(v1, v6)
    var v5: [s3] = v0
    var v8: [s3] = v5
    let v2: s0 = f60(v4)
    var v9: [s3] = v5
    let v14: [[Double]] = v7.p0
    let v12: [Double] = v14[0]
    let v3: s3 = v9[0]
    let v28: [[Double]] = v6.p0
    var v10: [s3] = v8
    let v36: s0 = v3.p1
    var v13: [Double] = v12
    let v34: [[Double]] = v6.p1
    let v23: s3 = v10[0]
    let v26: [Double] = v34[1]
    let v49: s3 = f36(v3)
    let v52: s3 = v8[0]
    v9[0] = v49
    v4.p0 = v28
    v4.p0 = v14
    var v29: s3 = v23
    v29.p1 = v1
    let v30: s3 = f36(v49)
    var v40: [[Double]] = v28
    v29.p1 = v7
    let v45: s3 = f36(v29)
    v4.p1 = v34
    v5[0] = v45
    v5[0] = v30
    let v61: [Double] = v40[1]
    v40[2] = v26
    let v35: [[Double]] = v2.p1
    let v42: [s1] = v52.p0
    v40[0] = v13
    var v80: [s1] = v42
    v4.p0 = v40
    v5[0] = v29
    v4.p0 = v40
    var v46: s0 = v36
    let v84: s0 = f33(v46)
    let v93: s0 = f37(v84, v2)
    let v57: [[Double]] = v84.p1
    v4.p1 = v57
    v46.p0 = v14
    v5[0] = v52
    v29.p0 = v80
    var v141: s0 = v93
    v141.p1 = v35
    v40[2] = v61
    let v137: s3 = v0[0]
    v8[0] = v3
    v5[0] = v137
    return v141
  }
  func f23(_ v0: [s0]) -> [s0] {
    let v2: [[s0]] = [v0, v0, v0, v0]
    var v9: [s0] = v0
    var v6: [[s0]] = v2
    let v5: [s0] = v6[2]
    var v15: [s0] = v5
    let v8: [s0] = f56(v15)
    let v10: [s0] = f56(v9)
    let v16: [s0] = f56(v15)
    var v30: [s0] = v9
    let v25: [s0] = f56(v10)
    let v20: [s0] = f56(v30)
    v15 = v20
    let v43: [s0] = f56(v15)
    let v50: [s0] = f56(v16)
    let v42: [s0] = f56(v8)
    let v48: s0 = v42[0]
    let v46: [[Double]] = v48.p1
    var v58: s0 = v48
    let v104: s0 = f33(v58)
    v58.p1 = v46
    v58.p1 = v46
    let v55: [[Double]] = v104.p1
    let v44: s1 = s1(p0: v16, p1: v58)
    let v79: s0 = v5[0]
    let v63: s1 = s1(p0: v50, p1: v104)
    v58.p1 = v46
    v58.p1 = v55
    v58.p1 = v55
    let v73: [[Double]] = v79.p0
    let v53: [[Double]] = v58.p0
    var v93: s1 = v44
    v6[0] = v25
    v58.p0 = v53
    let v122: s1 = f47(v63)
    v58.p0 = v53
    v58.p0 = v73
    let v299: s1 = f47(v93)
    let v296: [s1] = [v299, v122, v63, v93, v122]
    var v64: [s1] = v296
    v93 = v63
    v93.p0 = v43
    v93.p0 = v15
    let v138: s1 = v64[0]
    let v362: [s0] = v138.p0
    return v362
  }
  func f10(_ v0: [s1]) -> [s1] {
    var v5: [s1] = v0
    var v7: [s1] = v5
    let v2: s1 = v7[0]
    v7[1] = v2
    let v9: s1 = v5[1]
    v7 = v5
    v7[0] = v9
    v5[1] = v2
    let v50: s1 = v7[0]
    let v17: s1 = f47(v50)
    var v44: [s1] = v7
    v5[1] = v17
    return v44
  }
  func f4(_ v0: [s1]) -> [s1] {
    let v2: [s1] = f10(v0)
    let v6: [[s1]] = [v0, v2, v2, v0]
    let v3: [s1] = f10(v0)
    let v4: [s1] = f10(v0)
    let v5: [s1] = f10(v0)
    let v7: [s1] = f10(v5)
    let v8: s1 = v5[0]
    let v9: [s1] = f10(v3)
    var v10: [s1] = v4
    v10 = v5
    var v15: [[s1]] = v6
    let v1: s1 = f47(v8)
    let v17: s1 = v4[0]
    v15[0] = v10
    v15[0] = v2
    v10[1] = v1
    let v13: s1 = f47(v1)
    var v34: [s1] = v9
    let v30: s1 = f47(v17)
    v10[1] = v30
    v15[1] = v5
    v10[0] = v1
    var v25: s1 = v17
    v15[3] = v7
    var v21: s1 = v13
    let v20: [[[s1]]] = [v6, v15, v15, v6, v6, v15]
    let v28: s1 = v10[1]
    let v47: s1 = f47(v30)
    v34[0] = v25
    v15[2] = v3
    v34[0] = v28
    let v19: [[s1]] = v20[4]
    v10[0] = v47
    let v42: [s1] = v19[2]
    let v57: [s1] = f10(v0)
    v34[1] = v21
    v34[0] = v17
    v10 = v57
    v10[1] = v25
    v15[0] = v34
    let v179: [s1] = f10(v42)
    return v179
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s3], _ v2: Double) -> Double {
    let v5: s3 = v1[0]
    let v4: s3 = v1[0]
    let v7: s3 = v1[0]
    var v8: s0 = v0
    let v3: [[Double]] = v8.p1
    let v9: s0 = v7.p1
    let v10: s0 = f37(v0, v9)
    let v29: s0 = f37(v0, v8)
    let v14: [Double] = v3[0]
    v8.p1 = v3
    let v18: s3 = f36(v5)
    let v26: [s1] = v5.p0
    v8.p1 = v3
    let v24: [s1] = f4(v26)
    var v17: s3 = v4
    let v35: Double = v14[0]
    var v19: [s1] = v24
    let v45: s1 = v26[0]
    v19[0] = v45
    var v37: s1 = v45
    var v21: [s3] = v1
    let v22: [s1] = f4(v26)
    var v13: [s1] = v19
    let v46: s0 = v37.p1
    var v51: Double = v35
    v21[0] = v17
    let v39: s3 = v1[0]
    v17 = v18
    let v33: s0 = v39.p1
    let v59: [[Double]] = v46.p1
    let v43: [s0] = v37.p0
    let v49: s3 = v21[0]
    v17.p0 = v13
    let v36: [s1] = v17.p0
    v37.p0 = v43
    let v47: s0 = f28(v21, v10)
    let v57: s1 = v24[1]
    v21[0] = v18
    let v42: [[Double]] = v47.p0
    let v70: s1 = f47(v37)
    let v54: [Double] = v59[0]
    let v91: s1 = v36[1]
    v17.p0 = v22
    v37.p1 = v33
    let v60: Double = v54[0]
    v19[0] = v91
    let v58: [s0] = f23(v43)
    var v65: [s1] = v13
    let v155: Double = v2 / v51
    v37.p1 = v29
    let v67: s3 = f36(v49)
    var v125: s1 = v57
    let v137: [[Double]] = v9.p0
    let v72: s1 = f47(v70)
    v8.p0 = v137
    v13[1] = v72
    var v173: Double = v155
    let v92: s0 = f60(v46)
    v173 = v155
    v21[0] = v67
    v173 = v2
    v37.p0 = v58
    v65[1] = v125
    let v94: [s0] = f23(v43)
    v17.p0 = v65
    v37.p0 = v94
    v37.p1 = v46
    v13[1] = v45
    v8.p0 = v42
    v17.p1 = v92
    v51 = v60
    return v173
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])
    let v1: [s3] = [s3(p0: [s1(p0: [s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])], p1: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])), s1(p0: [s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])], p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]]))], p1: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]))]
    let v2: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
