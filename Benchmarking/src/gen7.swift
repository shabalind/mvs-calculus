  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  struct s3 {
    var p0: [s2]
    var p1: [s1]
  }
  func f81(_ v0: [s1]) -> [s1] {
    let v5: s1 = v0[0]
    let v4: s0 = v5.p1
    let v1: s0 = v5.p1
    var v2: s1 = v5
    let v16: s1 = v0[0]
    let v12: [[Double]] = v4.p0
    var v9: s0 = v4
    let v8: [Double] = v12[0]
    v9.p0 = v12
    v2.p0 = v4
    let v18: s1 = v0[1]
    v9.p0 = v12
    v9 = v4
    let v50: s0 = v2.p1
    v2.p0 = v9
    var v20: s1 = v18
    var v10: [s1] = v0
    let v15: [[Double]] = v1.p1
    v10[0] = v2
    let v25: [[Double]] = v50.p1
    var v14: [[Double]] = v15
    let v17: [[Double]] = v9.p2
    let v19: s1 = v0[1]
    let v26: [Double] = v12[0]
    var v39: s1 = v16
    v10[1] = v19
    let v24: s0 = v39.p1
    v14[1] = v8
    var v28: s0 = v50
    v9.p1 = v25
    var v21: [s1] = v10
    let v33: s0 = v18.p1
    var v43: [[Double]] = v12
    var v40: [Double] = v26
    v9.p1 = v17
    v10[1] = v2
    var v27: s1 = v19
    var v35: s0 = v33
    var v60: [[Double]] = v25
    let v29: [Double] = v60[1]
    let v87: [[Double]] = v35.p2
    let v47: s0 = v27.p1
    v10[1] = v20
    v28.p0 = v12
    let v46: [Double] = v14[1]
    v2.p1 = v47
    let v38: [Double] = v43[0]
    v43[0] = v29
    v28.p0 = v43
    v60[1] = v40
    v2.p0 = v1
    v43[0] = v46
    let v42: [[Double]] = v28.p0
    v35.p2 = v25
    let v156: [Double] = v14[0]
    let v150: s0 = v5.p0
    v10[0] = v27
    v20.p0 = v150
    v2.p0 = v24
    let v88: [Double] = v42[0]
    v14[0] = v38
    v10[1] = v18
    v60[1] = v156
    v10 = v21
    v10[1] = v2
    v39.p0 = v28
    v35.p1 = v25
    v20.p1 = v1
    v28.p1 = v87
    v2.p1 = v9
    var v103: s0 = v24
    v39.p1 = v28
    v60[1] = v38
    v14[1] = v88
    var v166: [s1] = v21
    v2.p0 = v103
    return v166
  }
  func f74(_ v0: s2) -> s2 {
    return v0
  }
  func f72(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p1
    let v11: s1 = s1(p0: v0, p1: v0)
    let v9: s0 = v11.p1
    var v15: s1 = v11
    var v21: s0 = v9
    v21.p1 = v5
    var v18: s0 = v21
    v15.p0 = v18
    let v49: s0 = v15.p0
    v15.p1 = v9
    return v49
  }
  func f71(_ v0: s1) -> s1 {
    let v5: s0 = v0.p1
    let v2: s0 = f72(v5)
    let v4: s2 = s2(p0: v0, p1: v2)
    var v8: s1 = v0
    v8 = v0
    let v7: s0 = f72(v2)
    v8.p1 = v5
    let v12: s2 = f74(v4)
    var v6: s2 = v4
    v6.p1 = v5
    var v22: s1 = v8
    v22 = v8
    v22.p1 = v7
    let v33: s1 = s1(p0: v2, p1: v2)
    let v42: s2 = f74(v6)
    let v32: s1 = v12.p0
    v6.p0 = v22
    let v81: s1 = v42.p0
    var v44: s1 = v22
    let v34: s2 = f74(v42)
    let v61: s0 = v44.p1
    v44 = v81
    v8.p0 = v61
    let v39: s0 = v81.p0
    v44.p1 = v61
    let v67: s0 = v32.p0
    let v51: s0 = v34.p1
    v8 = v44
    v6.p1 = v67
    let v96: s0 = v81.p0
    let v98: s0 = f72(v51)
    var v68: s0 = v39
    v44.p0 = v98
    v8.p0 = v96
    v44.p0 = v68
    v6.p0 = v33
    return v44
  }
  func f70(_ v0: s3) -> s3 {
    let v2: [s1] = v0.p1
    var v5: [s1] = v2
    let v4: s1 = v5[0]
    v5[0] = v4
    var v61: s3 = v0
    v61.p1 = v5
    return v61
  }
  func f67(_ v0: s2, _ v1: s2) -> s2 {
    let v5: [s2] = [v1, v1]
    let v4: s2 = v5[1]
    let v9: s2 = v5[0]
    let v14: s1 = v4.p0
    let v25: s1 = f71(v14)
    let v45: s0 = v9.p1
    let v37: s2 = s2(p0: v25, p1: v45)
    return v37
  }
  func f60(_ v0: s2) -> s2 {
    let v2: s2 = f74(v0)
    var v7: s2 = v2
    let v6: s0 = v2.p1
    let v4: [[Double]] = v6.p0
    var v1: [[Double]] = v4
    let v11: [[Double]] = v6.p1
    let v9: s0 = f72(v6)
    let v5: s1 = v2.p0
    let v12: s0 = f72(v6)
    let v15: [[Double]] = v6.p0
    let v20: s0 = s0(p0: v1, p1: v11, p2: v11)
    var v31: s0 = v9
    let v14: s0 = f72(v12)
    let v24: [Double] = v11[1]
    var v21: s1 = v5
    v7.p1 = v14
    let v22: s0 = v7.p1
    v21.p0 = v20
    v1[0] = v24
    let v71: [[Double]] = v22.p2
    var v121: [[Double]] = v71
    let v107: [Double] = v15[0]
    let v85: s2 = s2(p0: v21, p1: v31)
    v31.p1 = v121
    v121[0] = v107
    v31.p0 = v1
    let v169: s2 = f74(v85)
    return v169
  }
  func f56(_ v0: s3) -> s3 {
    let v7: s3 = f70(v0)
    var v4: s3 = v0
    let v3: [s1] = v7.p1
    let v6: s3 = f70(v7)
    let v8: [s1] = f81(v3)
    let v10: [s2] = v6.p0
    v4.p0 = v10
    v4.p1 = v8
    return v4
  }
  func f53(_ v0: s3) -> s3 {
    var v6: s3 = v0
    let v4: s3 = f70(v6)
    let v8: [s1] = v0.p1
    v6.p1 = v8
    var v5: [s1] = v8
    let v13: s1 = v5[1]
    v6.p1 = v5
    let v7: s0 = v13.p1
    var v9: s0 = v7
    let v2: [[Double]] = v9.p1
    var v3: s0 = v9
    v9.p1 = v2
    let v17: s0 = f72(v3)
    var v18: [s1] = v5
    v18[0] = v13
    let v11: s1 = s1(p0: v7, p1: v17)
    var v19: [[Double]] = v2
    let v29: s1 = v8[1]
    let v25: [s1] = v0.p1
    v18 = v8
    var v20: s1 = v13
    v5[0] = v29
    let v24: [Double] = v19[1]
    v9.p2 = v2
    v5[1] = v29
    v3.p2 = v19
    let v33: [s1] = f81(v18)
    v18[1] = v20
    v19[0] = v24
    v3.p1 = v19
    v3.p1 = v2
    let v36: [s2] = v4.p0
    let v32: [s2] = v0.p0
    v3.p1 = v19
    v5[1] = v13
    let v61: s3 = s3(p0: v36, p1: v33)
    v9.p2 = v2
    v20.p0 = v3
    let v73: [s1] = f81(v25)
    v5[0] = v13
    v18[0] = v13
    v3.p2 = v19
    v6.p0 = v32
    v18[0] = v11
    let v58: s3 = f70(v61)
    v6.p1 = v33
    v6.p1 = v73
    v5[1] = v13
    v6.p0 = v32
    return v58
  }
  func f50(_ v0: [Double], _ v1: s0) -> s0 {
    var v4: s0 = v1
    var v8: s0 = v4
    let v7: s0 = f72(v8)
    let v9: [[Double]] = v4.p2
    var v2: s0 = v7
    let v11: s1 = s1(p0: v2, p1: v2)
    let v12: [[Double]] = v2.p0
    var v19: [[Double]] = v12
    v19[0] = v0
    let v35: s1 = f71(v11)
    let v33: s0 = v35.p1
    v19[0] = v0
    v2.p2 = v9
    v4.p0 = v19
    v19[0] = v0
    v19[0] = v0
    return v33
  }
  func f46(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p0
    let v1: [Double] = v5[0]
    let v2: [[Double]] = v0.p0
    let v3: Double = v1[0]
    let v7: Double = v1[0]
    let v9: [Double] = v5[0]
    let v8: [[Double]] = v0.p1
    var v11: s0 = v0
    let v17: [Double] = v8[0]
    var v10: Double = v3
    var v14: [Double] = v9
    v14[0] = v7
    let v13: [[Double]] = v11.p1
    v11.p2 = v13
    let v18: [[Double]] = v0.p0
    let v12: [[Double]] = v0.p1
    var v24: [Double] = v14
    var v35: [[Double]] = v8
    let v19: Double = v3 / v3
    v24[0] = v19
    let v15: [[Double]] = v0.p1
    let v20: [[Double]] = v11.p1
    v35[0] = v14
    v11.p1 = v15
    v24[0] = v10
    v35[1] = v14
    v11.p1 = v20
    v11.p2 = v15
    var v54: [[Double]] = v12
    v24[0] = v19
    var v16: [[Double]] = v35
    v35[1] = v14
    v11.p1 = v54
    let v21: s0 = f50(v17, v0)
    let v33: [[Double]] = v11.p1
    var v22: [[Double]] = v35
    let v28: [Double] = v2[0]
    var v41: s0 = v11
    let v61: s0 = f72(v21)
    v41.p0 = v2
    let v44: [Double] = v13[0]
    v41.p2 = v33
    v54[1] = v1
    v16[1] = v24
    let v55: [[Double]] = v41.p0
    let v82: [[Double]] = v61.p0
    let v36: [Double] = v16[0]
    v11.p0 = v82
    let v47: [Double] = v18[0]
    let v84: [[Double]] = [v24, v44, v47, v28, v36, v17, v14]
    let v94: [[Double]] = v21.p0
    let v83: [[Double]] = v61.p2
    v41.p1 = v83
    v41.p2 = v20
    let v105: [Double] = v84[1]
    v41.p0 = v94
    v11.p2 = v22
    v24 = v44
    v11.p0 = v55
    let v160: s0 = f50(v105, v0)
    return v160
  }
  func f42(_ v0: s0) -> s0 {
    let v1: s0 = f46(v0)
    let v5: [[Double]] = v0.p2
    let v6: [Double] = v5[1]
    let v2: s0 = f72(v1)
    var v7: [Double] = v6
    let v10: s0 = f72(v1)
    var v9: [[Double]] = v5
    let v4: [[Double]] = v10.p1
    v9[0] = v7
    var v17: [[Double]] = v9
    let v11: [[Double]] = v2.p0
    v17[1] = v6
    var v14: [[Double]] = v11
    v14[0] = v7
    v9[0] = v6
    v9[0] = v6
    let v110: s0 = s0(p0: v14, p1: v4, p2: v17)
    return v110
  }
  func f37(_ v0: Double, _ v1: s1) -> Double {
    let v6: s1 = f71(v1)
    let v2: s0 = v6.p0
    let v10: s0 = f72(v2)
    let v4: [[Double]] = v2.p1
    var v7: Double = v0
    var v8: s0 = v2
    let v13: s0 = f42(v10)
    v8 = v13
    let v32: [[Double]] = v8.p0
    v8.p2 = v4
    let v23: [Double] = v32[0]
    let v57: Double = v0 / v7
    let v74: Double = v23[0]
    let v25: Double = v74 - v57
    v7 = v25
    var v93: Double = v57
    v93 = v25
    return v93
  }
  func f35(_ v0: s1, _ v1: [s2]) -> [s2] {
    let v7: [[s2]] = [v1, v1, v1]
    let v65: [s2] = v7[1]
    return v65
  }
  func f27(_ v0: s1) -> s1 {
    let v6: s1 = f71(v0)
    let v24: s1 = f71(v6)
    return v24
  }
  func f25(_ v0: s0, _ v1: [s3], _ v2: s2, _ v3: s1) -> s0 {
    let v4: s2 = f60(v2)
    let v7: s2 = f60(v4)
    var v19: s2 = v4
    let v25: [s2] = [v19, v7]
    let v20: s2 = v25[1]
    let v43: s0 = v20.p1
    return v43
  }
  func f14(_ v0: s3) -> s3 {
    let v3: s3 = f70(v0)
    let v4: [s2] = v0.p0
    let v2: s2 = v4[0]
    var v11: s2 = v2
    var v8: s2 = v11
    let v12: s1 = v8.p0
    let v16: [s1] = [v12, v12]
    let v35: s3 = f56(v0)
    let v29: [s2] = v3.p0
    var v47: [s2] = v29
    let v38: s3 = f53(v3)
    var v60: s3 = v35
    v60.p0 = v47
    let v106: [s2] = v38.p0
    v47[0] = v8
    v60.p0 = v106
    v60.p1 = v16
    v47 = v4
    return v60
  }
  func f3(_ v0: s0, _ v1: s1) -> s1 {
    var v2: s0 = v0
    let v7: [[Double]] = v2.p0
    v2.p0 = v7
    let v9: [Double] = v7[0]
    v2.p0 = v7
    let v5: s0 = v1.p0
    let v11: s0 = v1.p0
    v2 = v11
    let v3: Double = v9[0]
    v2.p0 = v7
    var v13: [Double] = v9
    let v10: s0 = f46(v5)
    let v12: [[Double]] = v2.p0
    var v20: s1 = v1
    let v16: [Double] = v12[0]
    let v36: s0 = f50(v13, v0)
    v13[0] = v3
    let v15: s0 = f46(v10)
    let v30: Double = v16[0]
    let v28: Double = f37(v3, v1)
    var v35: Double = v30
    v13[0] = v28
    v20.p1 = v15
    var v34: s1 = v20
    v20.p1 = v36
    v13[0] = v35
    let v96: s1 = f27(v34)
    return v96
  }
  func f1(_ v0: s3) -> s3 {
    var v2: s3 = v0
    let v3: [s2] = v0.p0
    let v5: [s1] = v2.p1
    let v4: [s2] = v0.p0
    let v8: s2 = v4[0]
    v2.p0 = v3
    let v17: [s1] = v2.p1
    v2.p1 = v17
    var v15: s2 = v8
    var v16: s2 = v15
    let v22: s1 = v16.p0
    let v38: s2 = v3[0]
    let v53: s0 = v38.p1
    let v43: s0 = v22.p0
    let v91: [s2] = f35(v22, v4)
    let v50: s3 = s3(p0: v91, p1: v5)
    v2.p1 = v5
    v15.p1 = v53
    let v171: [s2] = v2.p0
    v15.p1 = v43
    v2.p0 = v171
    return v50
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    var v7: [s3] = v0
    let v4: s3 = v7[0]
    let v5: [s2] = v4.p0
    let v8: s3 = v0[2]
    var v2: Double = v1
    v2 = v1
    var v3: [s3] = v7
    let v14: s2 = v5[0]
    var v11: [s2] = v5
    v3[0] = v8
    let v17: s1 = v14.p0
    let v6: s2 = f67(v14, v14)
    let v10: s0 = v6.p1
    let v13: s3 = v0[0]
    let v16: s0 = f25(v10, v7, v14, v17)
    let v25: s3 = v0[0]
    let v20: s3 = f14(v8)
    v7[2] = v4
    let v30: s3 = v0[1]
    let v19: s1 = v14.p0
    let v27: s3 = f1(v30)
    let v33: s3 = v7[2]
    v7[2] = v8
    var v43: s3 = v25
    let v64: s1 = f3(v16, v19)
    var v71: [s3] = v3
    let v44: s3 = f70(v13)
    v7[2] = v33
    v43.p0 = v5
    v3[2] = v13
    let v54: s3 = v7[2]
    v71[2] = v27
    let v117: s0 = v64.p1
    v7[0] = v8
    v71[1] = v43
    let v72: s2 = v11[0]
    var v94: s3 = v54
    let v76: s0 = f25(v117, v71, v72, v64)
    let v104: s3 = v71[2]
    let v141: [s1] = v25.p1
    let v248: [[Double]] = v76.p1
    v94.p1 = v141
    let v118: [s1] = v94.p1
    v94.p1 = v118
    v7[1] = v104
    var v180: s3 = v44
    v43 = v20
    let v105: [Double] = v248[0]
    let v220: Double = v105[0]
    v7[2] = v43
    v43 = v94
    let v158: Double = v220 * v2
    v7[0] = v180
    v71[0] = v8
    return v158
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: [s2(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]], p2: [[3.0], [4.0]]), p1: s0(p0: [[5.0]], p1: [[6.0], [7.0]], p2: [[8.0], [9.0]])), p1: s0(p0: [[10.0]], p1: [[11.0], [12.0]], p2: [[13.0], [14.0]]))], p1: [s1(p0: s0(p0: [[15.0]], p1: [[16.0], [17.0]], p2: [[18.0], [19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0], [22.0]], p2: [[23.0], [24.0]])), s1(p0: s0(p0: [[25.0]], p1: [[26.0], [27.0]], p2: [[28.0], [29.0]]), p1: s0(p0: [[30.0]], p1: [[31.0], [32.0]], p2: [[33.0], [34.0]]))]), s3(p0: [s2(p0: s1(p0: s0(p0: [[35.0]], p1: [[36.0], [37.0]], p2: [[38.0], [39.0]]), p1: s0(p0: [[40.0]], p1: [[41.0], [42.0]], p2: [[43.0], [44.0]])), p1: s0(p0: [[45.0]], p1: [[46.0], [47.0]], p2: [[48.0], [49.0]]))], p1: [s1(p0: s0(p0: [[50.0]], p1: [[51.0], [52.0]], p2: [[53.0], [54.0]]), p1: s0(p0: [[55.0]], p1: [[56.0], [57.0]], p2: [[58.0], [59.0]])), s1(p0: s0(p0: [[60.0]], p1: [[61.0], [62.0]], p2: [[63.0], [64.0]]), p1: s0(p0: [[65.0]], p1: [[66.0], [67.0]], p2: [[68.0], [69.0]]))]), s3(p0: [s2(p0: s1(p0: s0(p0: [[70.0]], p1: [[71.0], [72.0]], p2: [[73.0], [74.0]]), p1: s0(p0: [[75.0]], p1: [[76.0], [77.0]], p2: [[78.0], [79.0]])), p1: s0(p0: [[80.0]], p1: [[81.0], [82.0]], p2: [[83.0], [84.0]]))], p1: [s1(p0: s0(p0: [[85.0]], p1: [[86.0], [87.0]], p2: [[88.0], [89.0]]), p1: s0(p0: [[90.0]], p1: [[91.0], [92.0]], p2: [[93.0], [94.0]])), s1(p0: s0(p0: [[95.0]], p1: [[96.0], [97.0]], p2: [[98.0], [99.0]]), p1: s0(p0: [[100.0]], p1: [[101.0], [102.0]], p2: [[103.0], [104.0]]))])]
    let v1: Double = 105.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 105.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
