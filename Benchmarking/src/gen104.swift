  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: Double
    var p1: [s0]
    var p2: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: [s1]
  }
  struct s5 {
    var p0: [s2]
    var p1: s1
  }
  func f36(_ v0: s1) -> s1 {
    let v5: s0 = v0.p2
    let v4: [s0] = [v5, v5, v5, v5, v5]
    var v1: s1 = v0
    let v2: [[Double]] = v5.p0
    let v6: [[Double]] = v5.p0
    let v7: s0 = v4[0]
    var v8: [[Double]] = v6
    let v12: s0 = v4[2]
    let v3: [[Double]] = v5.p1
    let v9: [Double] = v3[0]
    let v14: [s0] = v1.p1
    var v11: [[Double]] = v3
    var v18: [[Double]] = v3
    var v10: s0 = v7
    let v17: Double = v9[0]
    var v26: Double = v17
    var v15: s0 = v10
    var v20: [[Double]] = v11
    var v23: s1 = v1
    let v28: [[Double]] = v7.p0
    v8[2] = v9
    let v16: [[Double]] = v7.p0
    let v24: [[Double]] = v15.p0
    var v21: [s0] = v4
    v18 = v20
    let v42: s0 = v14[1]
    let v34: [Double] = v28[1]
    let v40: [Double] = v20[0]
    let v29: Double = v40[0]
    v10.p1 = v18
    var v39: [[Double]] = v24
    let v31: [s0] = v23.p1
    var v36: [Double] = v34
    v21[2] = v12
    let v30: [[Double]] = v12.p1
    let v77: s0 = v21[2]
    let v38: Double = v23.p0
    var v35: [Double] = v36
    let v53: [s0] = v0.p1
    v35[0] = v26
    v18[0] = v35
    v15.p0 = v24
    var v49: [s0] = v31
    v15.p0 = v2
    v23.p1 = v49
    let v69: [[[Double]]] = [v39, v28, v8, v24]
    v35[0] = v29
    let v116: [[Double]] = v42.p1
    v15.p0 = v16
    v1.p0 = v26
    let v44: [[Double]] = v77.p0
    var v63: Double = v29
    var v56: [s0] = v14
    let v70: [Double] = v30[0]
    v15.p0 = v24
    v21[4] = v15
    v39[1] = v35
    let v100: [s0] = v1.p1
    var v112: [s0] = v56
    let v62: [Double] = v44[2]
    let v276: s0 = v112[0]
    let v60: [Double] = v116[0]
    v1.p0 = v38
    let v125: Double = v29 / v63
    v1.p0 = v125
    let v88: [[Double]] = v77.p0
    v20[0] = v62
    v18[0] = v60
    let v83: [[Double]] = v276.p0
    v10.p0 = v88
    v15.p0 = v8
    v49[1] = v12
    v35[0] = v29
    v1.p1 = v100
    let v171: s1 = s1(p0: v38, p1: v53, p2: v12)
    v20[0] = v70
    v11[0] = v62
    v11[0] = v36
    let v262: [[Double]] = v69[3]
    v10.p0 = v39
    v10.p0 = v83
    let v101: [Double] = v262[1]
    v39[1] = v101
    v23.p2 = v276
    v35 = v70
    return v171
  }
  func f27(_ v0: s0) -> s0 {
    let v6: [s0] = [v0]
    let v5: [[Double]] = v0.p0
    let v2: [[Double]] = v0.p0
    let v10: [[[Double]]] = [v5, v5, v5, v5, v2, v5]
    var v4: [[[Double]]] = v10
    v4[4] = v2
    let v11: [[Double]] = v10[5]
    var v21: [[[Double]]] = v10
    v21[3] = v5
    let v15: [[Double]] = v0.p0
    var v35: [[Double]] = v11
    let v20: [[Double]] = v4[3]
    var v29: [[Double]] = v20
    let v22: [Double] = v35[1]
    var v34: [[[Double]]] = v21
    let v17: s0 = v6[0]
    let v45: [[Double]] = v17.p1
    v4[2] = v15
    let v79: s0 = s0(p0: v29, p1: v45)
    var v23: [Double] = v22
    v29[0] = v23
    v4 = v34
    return v79
  }
  func f26(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p0
    let v9: [[Double]] = v0.p1
    let v30: s0 = s0(p0: v2, p1: v9)
    var v42: s0 = v30
    return v42
  }
  func f23(_ v0: s1) -> s1 {
    let v5: s0 = v0.p2
    let v6: s0 = f27(v5)
    let v1: s1 = f36(v0)
    let v4: s0 = f26(v6)
    let v10: s1 = f36(v1)
    let v13: [[Double]] = v4.p1
    let v12: s0 = v10.p2
    var v25: [[Double]] = v13
    let v26: s0 = f27(v12)
    let v37: s0 = v10.p2
    let v65: s1 = f36(v10)
    var v98: s0 = v37
    var v59: s1 = v65
    v98.p1 = v25
    v98.p1 = v13
    let v57: [s0] = v65.p1
    let v80: s0 = f26(v26)
    let v31: [[Double]] = v80.p1
    v98.p1 = v25
    let v66: s1 = f36(v59)
    let v63: s0 = f26(v80)
    v59.p1 = v57
    v98.p1 = v31
    v59.p2 = v98
    v59.p2 = v63
    return v66
  }
  func f21(_ v0: s5) -> s5 {
    var v2: s5 = v0
    var v5: s5 = v0
    let v6: [s2] = v2.p0
    let v10: s2 = v6[2]
    v5.p0 = v6
    var v11: s5 = v2
    var v17: s2 = v10
    v2 = v5
    v11.p0 = v6
    let v8: s1 = v11.p1
    let v14: [s2] = v5.p0
    let v9: s1 = f36(v8)
    v5.p1 = v9
    let v19: s2 = v14[2]
    var v29: [s2] = v14
    let v16: [s1] = v17.p0
    let v48: s1 = v16[1]
    v29[1] = v19
    v5.p1 = v48
    v5.p0 = v29
    return v11
  }
  func f16(_ v0: s1) -> s1 {
    let v1: s1 = f23(v0)
    let v2: s1 = f36(v1)
    let v5: s1 = f36(v0)
    var v3: s1 = v1
    var v6: s1 = v3
    let v9: Double = v0.p0
    let v8: [s0] = v2.p1
    let v4: s0 = v8[1]
    let v7: [[Double]] = v4.p1
    var v13: Double = v9
    let v12: [Double] = v7[0]
    let v16: s0 = v5.p2
    var v14: Double = v9
    v6.p0 = v13
    var v21: [s0] = v8
    let v24: s0 = f27(v4)
    v3.p2 = v24
    let v18: s0 = f26(v24)
    v3.p2 = v24
    v21[0] = v16
    let v27: s0 = f26(v18)
    v21 = v8
    let v19: s0 = f27(v18)
    v21[1] = v19
    v6.p0 = v9
    let v15: s0 = f26(v16)
    let v22: s0 = v21[1]
    v6.p1 = v8
    var v32: [s0] = v8
    var v31: s0 = v4
    var v23: [s0] = v21
    var v29: Double = v14
    let v26: s0 = v8[1]
    v32[0] = v18
    let v25: [[Double]] = v22.p0
    let v60: s0 = f27(v4)
    var v46: s1 = v5
    var v20: [s0] = v23
    let v40: Double = v12[0]
    v6.p2 = v27
    let v58: Double = v12[0]
    let v38: s0 = v21[1]
    var v55: [s0] = v32
    v3.p1 = v20
    v3.p0 = v40
    v6.p1 = v23
    let v43: [[Double]] = v24.p1
    let v49: s0 = f26(v31)
    v21[1] = v60
    v31.p1 = v43
    var v73: s0 = v24
    let v51: s0 = v8[0]
    let v37: s0 = f26(v26)
    let v33: s1 = f36(v1)
    v73.p0 = v25
    let v57: s0 = v20[1]
    let v44: [[Double]] = v57.p1
    v46.p1 = v23
    let v77: s1 = f36(v33)
    v6.p1 = v20
    let v54: Double = v58 - v14
    let v109: s0 = s0(p0: v25, p1: v44)
    let v53: [s1] = [v77, v77, v3, v46, v33, v33, v6]
    v23[1] = v16
    v46.p2 = v73
    let v81: [[[Double]]] = [v43, v43, v7]
    let v64: s0 = v33.p2
    v32[0] = v49
    let v52: s0 = f27(v51)
    v23[0] = v37
    let v59: s1 = v53[5]
    let v62: Double = v0.p0
    v3.p0 = v54
    v6.p1 = v55
    var v93: [s0] = v20
    let v121: [s0] = v59.p1
    let v102: [[Double]] = v81[0]
    v73.p1 = v43
    v6.p1 = v93
    v31.p1 = v44
    v31.p1 = v102
    let v137: s1 = f23(v2)
    let v136: s0 = f26(v73)
    v3.p2 = v38
    let v68: Double = v137.p0
    v20[0] = v15
    let v120: s1 = s1(p0: v29, p1: v121, p2: v136)
    v73.p1 = v43
    v73 = v15
    v3.p0 = v62
    v6.p0 = v68
    v32 = v20
    v32[0] = v64
    let v125: s0 = f27(v37)
    v73 = v18
    v3.p2 = v109
    v93[0] = v125
    v32[1] = v49
    v55[1] = v52
    return v120
  }
  func f10(_ v0: s5) -> s5 {
    let v4: s5 = f21(v0)
    var v1: s5 = v4
    var v7: s5 = v1
    return v7
  }
  func f8(_ v0: [s2]) -> [s2] {
    let v2: s2 = v0[2]
    let v4: s2 = v0[2]
    let v5: [s1] = v4.p1
    var v11: [s1] = v5
    var v1: [s2] = v0
    let v6: [s1] = v4.p1
    var v3: s2 = v2
    v3.p1 = v11
    let v13: [s1] = v4.p0
    v1[1] = v3
    var v17: [s2] = v1
    v3.p0 = v13
    v1 = v0
    v3.p1 = v6
    return v17
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: Double) -> Double {
    var v3: s5 = v0
    var v2: Double = v1
    let v4: s5 = f10(v0)
    let v6: [s2] = v3.p0
    var v5: [s2] = v6
    let v7: s2 = v5[0]
    let v13: [s1] = v7.p0
    v5[2] = v7
    let v12: [s1] = v7.p1
    let v10: s2 = v6[2]
    v3.p0 = v6
    v5[1] = v7
    let v20: s2 = v5[2]
    let v11: s1 = v13[1]
    let v21: s1 = v12[0]
    let v14: s1 = v4.p1
    let v29: s1 = f36(v14)
    let v27: [s2] = f8(v5)
    let v36: [s1] = [v14, v21, v29, v21, v29, v11, v29]
    let v43: s2 = v5[0]
    let v22: [s1] = v20.p1
    let v15: s1 = v36[3]
    let v48: Double = v15.p0
    let v16: s1 = v13[1]
    let v38: s2 = s2(p0: v13, p1: v22)
    let v32: s1 = v36[1]
    let v37: Double = v2 - v48
    v5[2] = v7
    var v35: s5 = v4
    var v33: s2 = v10
    let v23: s1 = f16(v32)
    v5[1] = v43
    let v83: s2 = v5[1]
    let v84: Double = v23.p0
    v5[1] = v43
    var v122: [s2] = v27
    v33.p1 = v22
    let v92: [s2] = v35.p0
    v5[2] = v7
    v5[2] = v38
    var v81: Double = v37
    v122[0] = v83
    v5 = v92
    v33.p0 = v13
    let v100: s1 = f36(v16)
    v3.p0 = v122
    v5[2] = v83
    let v140: Double = v48 / v81
    let v101: s1 = f36(v100)
    v35.p1 = v101
    v3.p0 = v92
    var v127: Double = v84
    let v152: Double = v140 * v127
    v122[2] = v33
    return v152
  }
  func benchmark() {
    let v0: s5 = s5(p0: [s2(p0: [s1(p0: 0.0, p1: [s0(p0: [[1.0], [2.0], [3.0]], p1: [[4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0]])], p2: s0(p0: [[9.0], [10.0], [11.0]], p1: [[12.0]])), s1(p0: 13.0, p1: [s0(p0: [[14.0], [15.0], [16.0]], p1: [[17.0]]), s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0]])], p2: s0(p0: [[22.0], [23.0], [24.0]], p1: [[25.0]])), s1(p0: 26.0, p1: [s0(p0: [[27.0], [28.0], [29.0]], p1: [[30.0]]), s0(p0: [[31.0], [32.0], [33.0]], p1: [[34.0]])], p2: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0]]))], p1: [s1(p0: 39.0, p1: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]]), s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])], p2: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]]))]), s2(p0: [s1(p0: 52.0, p1: [s0(p0: [[53.0], [54.0], [55.0]], p1: [[56.0]]), s0(p0: [[57.0], [58.0], [59.0]], p1: [[60.0]])], p2: s0(p0: [[61.0], [62.0], [63.0]], p1: [[64.0]])), s1(p0: 65.0, p1: [s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0]]), s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0]])], p2: s0(p0: [[74.0], [75.0], [76.0]], p1: [[77.0]])), s1(p0: 78.0, p1: [s0(p0: [[79.0], [80.0], [81.0]], p1: [[82.0]]), s0(p0: [[83.0], [84.0], [85.0]], p1: [[86.0]])], p2: s0(p0: [[87.0], [88.0], [89.0]], p1: [[90.0]]))], p1: [s1(p0: 91.0, p1: [s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]]), s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0]])], p2: s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0]]))]), s2(p0: [s1(p0: 104.0, p1: [s0(p0: [[105.0], [106.0], [107.0]], p1: [[108.0]]), s0(p0: [[109.0], [110.0], [111.0]], p1: [[112.0]])], p2: s0(p0: [[113.0], [114.0], [115.0]], p1: [[116.0]])), s1(p0: 117.0, p1: [s0(p0: [[118.0], [119.0], [120.0]], p1: [[121.0]]), s0(p0: [[122.0], [123.0], [124.0]], p1: [[125.0]])], p2: s0(p0: [[126.0], [127.0], [128.0]], p1: [[129.0]])), s1(p0: 130.0, p1: [s0(p0: [[131.0], [132.0], [133.0]], p1: [[134.0]]), s0(p0: [[135.0], [136.0], [137.0]], p1: [[138.0]])], p2: s0(p0: [[139.0], [140.0], [141.0]], p1: [[142.0]]))], p1: [s1(p0: 143.0, p1: [s0(p0: [[144.0], [145.0], [146.0]], p1: [[147.0]]), s0(p0: [[148.0], [149.0], [150.0]], p1: [[151.0]])], p2: s0(p0: [[152.0], [153.0], [154.0]], p1: [[155.0]]))])], p1: s1(p0: 156.0, p1: [s0(p0: [[157.0], [158.0], [159.0]], p1: [[160.0]]), s0(p0: [[161.0], [162.0], [163.0]], p1: [[164.0]])], p2: s0(p0: [[165.0], [166.0], [167.0]], p1: [[168.0]])))
    let v1: Double = 169.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 169.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
