  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [s0]
    var p1: [[s1]]
    var p2: s1
    var p3: [s1]
  }
  func f80(_ v0: [s2]) -> [s2] {
    let v6: s2 = v0[1]
    var v20: [s2] = v0
    var v16: [s2] = v20
    v20[1] = v6
    return v16
  }
  func f79(_ v0: s2) -> s2 {
    let v5: [[s1]] = v0.p1
    var v4: s2 = v0
    let v3: [[s1]] = v0.p1
    var v1: s2 = v0
    let v7: [s1] = v3[0]
    var v8: [s1] = v7
    v1.p1 = v3
    let v6: s1 = v8[0]
    v4.p2 = v6
    v1.p2 = v6
    v8[0] = v6
    let v30: [s1] = v1.p3
    v1.p1 = v5
    v1.p3 = v30
    let v22: s1 = v30[1]
    v8[0] = v22
    return v4
  }
  func f72(_ v0: s2) -> s2 {
    let v4: [s2] = [v0, v0]
    let v6: s2 = f79(v0)
    var v1: [s2] = v4
    let v2: [s2] = f80(v1)
    var v3: s2 = v0
    var v7: s2 = v6
    v7 = v6
    var v9: [s2] = v2
    let v8: [[s1]] = v0.p1
    let v20: [s2] = f80(v9)
    let v22: [s1] = v0.p3
    var v10: [s1] = v22
    let v14: [s2] = f80(v2)
    let v13: [s1] = v8[0]
    v1[1] = v3
    v9 = v20
    let v72: s2 = v14[1]
    let v57: s1 = v22[1]
    let v37: s1 = v13[0]
    let v51: s2 = f79(v0)
    let v21: s2 = v9[0]
    v1[1] = v7
    v10[0] = v57
    v7.p3 = v10
    v7.p2 = v37
    let v82: [s0] = v72.p0
    v3.p3 = v10
    v1[1] = v51
    v3.p1 = v8
    v7.p0 = v82
    let v122: s2 = f79(v21)
    v9[0] = v72
    v1[1] = v7
    return v122
  }
  func f70(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v2: [[Double]] = v0.p1
    let v1: [[Double]] = v4.p0
    var v5: [[Double]] = v1
    let v8: [[Double]] = v0.p1
    v4.p0 = v1
    let v7: [Double] = v2[1]
    let v6: s0 = s0(p0: v8, p1: v5)
    let v3: [[Double]] = v4.p1
    v5[1] = v7
    let v29: [[Double]] = v0.p0
    var v9: [[Double]] = v2
    let v13: [[Double]] = v6.p1
    let v16: [Double] = v5[0]
    let v19: [[Double]] = v0.p0
    let v25: [[Double]] = v4.p0
    let v15: Double = v7[0]
    v9[1] = v16
    v5[1] = v7
    var v21: s0 = v6
    v21.p1 = v9
    let v14: [[Double]] = v4.p0
    let v43: [[Double]] = v6.p1
    var v35: s0 = v6
    let v22: [[Double]] = v6.p0
    let v24: [[[Double]]] = [v29, v25, v1, v29, v1, v8]
    var v56: [[[Double]]] = v24
    let v30: [[Double]] = v56[3]
    let v18: [[Double]] = v35.p1
    let v49: [[[[Double]]]] = [v56, v56, v24, v56]
    var v45: [Double] = v16
    v9[0] = v45
    v56[3] = v14
    v56[1] = v22
    let v46: [[Double]] = v4.p0
    v4.p0 = v18
    var v44: [[Double]] = v8
    v9[1] = v7
    v45[0] = v15
    v21.p0 = v30
    let v41: [[[Double]]] = v49[2]
    v35.p1 = v18
    var v33: [[[Double]]] = v24
    var v51: [[[[Double]]]] = v49
    v4.p0 = v19
    let v40: [[Double]] = v6.p0
    let v32: [[Double]] = v35.p0
    v33 = v41
    let v76: [[[Double]]] = v51[3]
    v4.p0 = v32
    v4.p1 = v46
    v4.p0 = v40
    v35.p1 = v14
    v21.p0 = v18
    v35.p1 = v44
    v9[0] = v45
    v45[0] = v15
    let v55: s0 = s0(p0: v25, p1: v3)
    v4.p1 = v43
    v33[4] = v13
    let v102: [[Double]] = v0.p1
    let v65: [[Double]] = v76[2]
    var v94: [[[Double]]] = v33
    let v143: [[Double]] = v21.p0
    let v210: s0 = s0(p0: v143, p1: v65)
    v4.p1 = v102
    v35 = v55
    v51[2] = v94
    return v210
  }
  func f69(_ v0: s1) -> s1 {
    let v7: [s0] = v0.p1
    let v2: s0 = v7[0]
    let v3: [s0] = [v2, v2, v2, v2, v2]
    let v5: [s0] = v0.p1
    let v12: s0 = v3[1]
    let v50: s1 = s1(p0: v12, p1: v5)
    let v142: [s1] = [v50]
    var v96: [s1] = v142
    let v136: s1 = v96[0]
    return v136
  }
  func f49(_ v0: s2, _ v1: s0, _ v2: s0) -> s0 {
    let v3: s0 = f70(v1)
    let v4: [s0] = v0.p0
    var v6: s0 = v2
    let v13: [[Double]] = v6.p0
    var v7: [s0] = v4
    let v11: s0 = v7[0]
    let v9: [s0] = v0.p0
    var v29: s0 = v3
    let v14: s0 = v9[0]
    v7[0] = v6
    var v12: [[Double]] = v13
    v29.p0 = v12
    let v28: [[Double]] = v3.p1
    let v36: [[Double]] = v14.p0
    let v21: s0 = f70(v11)
    let v57: [[Double]] = v21.p1
    let v19: s0 = v4[0]
    v29.p1 = v57
    var v47: s0 = v29
    var v49: [[Double]] = v28
    let v30: s0 = v9[0]
    v29.p1 = v13
    var v120: [[Double]] = v49
    v29.p0 = v120
    let v81: [[Double]] = v30.p1
    v29.p1 = v57
    v47.p1 = v81
    var v53: [[Double]] = v120
    v47 = v30
    v47.p1 = v36
    v7[0] = v19
    let v84: [Double] = v120[1]
    v29.p1 = v53
    v29.p0 = v81
    let v80: [[Double]] = v1.p1
    v29.p1 = v80
    v29.p0 = v57
    var v104: [Double] = v84
    v120[0] = v84
    v49[0] = v104
    return v47
  }
  func f46(_ v0: s2) -> s2 {
    let v7: [[s1]] = v0.p1
    let v5: [s0] = v0.p0
    let v2: [s0] = v0.p0
    let v8: [s1] = v0.p3
    let v4: s1 = v8[0]
    let v14: s1 = f69(v4)
    var v10: [s1] = v8
    let v11: s2 = f72(v0)
    let v26: s1 = v10[0]
    v10[1] = v26
    let v30: [s1] = v7[0]
    let v18: s1 = f69(v26)
    var v16: s2 = v0
    let v17: s2 = f72(v16)
    v16.p1 = v7
    v16.p2 = v18
    let v24: s1 = v30[0]
    let v21: s0 = v14.p0
    let v23: [s1] = v17.p3
    v10[0] = v4
    v16.p2 = v24
    let v29: [s0] = v11.p0
    let v44: s2 = f79(v17)
    v10[0] = v24
    v16.p0 = v29
    var v36: [s0] = v2
    let v35: s0 = v5[0]
    let v34: s0 = f49(v0, v21, v35)
    v16.p0 = v2
    v16.p0 = v36
    v16.p3 = v10
    v36[0] = v34
    let v146: s2 = f72(v44)
    v16.p3 = v10
    v16.p1 = v7
    v16.p3 = v23
    return v146
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [s2], _ v2: Double) -> Double {
    let v5: s0 = v0.p0
    var v4: [s2] = v1
    let v9: s2 = v1[2]
    let v7: s2 = f46(v9)
    let v13: s2 = v4[2]
    var v11: s0 = v5
    let v19: s2 = v1[1]
    v4[1] = v13
    let v15: s1 = v13.p2
    let v40: [[Double]] = v11.p0
    v11.p1 = v40
    let v10: [Double] = v40[1]
    v11.p1 = v40
    let v26: Double = v10[0]
    v11.p0 = v40
    let v29: [[Double]] = v5.p0
    v4[0] = v19
    v11.p0 = v40
    v4[1] = v13
    v4[2] = v7
    let v30: s0 = v15.p0
    let v148: [[Double]] = v30.p1
    v11.p1 = v40
    v11.p0 = v29
    v11.p1 = v148
    v11.p0 = v148
    return v26
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])])
    let v1: [s2] = [s2(p0: [s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])], p1: [[s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]), p1: [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]), s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])])]], p2: s1(p0: s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]), p1: [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]), s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]]), s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]])]), p3: [s1(p0: s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]]), p1: [s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]]), s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]]), s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]])]), s1(p0: s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]]), p1: [s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0]]), s0(p0: [[76.0], [77.0]], p1: [[78.0], [79.0]]), s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0]])])]), s2(p0: [s0(p0: [[84.0], [85.0]], p1: [[86.0], [87.0]])], p1: [[s1(p0: s0(p0: [[88.0], [89.0]], p1: [[90.0], [91.0]]), p1: [s0(p0: [[92.0], [93.0]], p1: [[94.0], [95.0]]), s0(p0: [[96.0], [97.0]], p1: [[98.0], [99.0]]), s0(p0: [[100.0], [101.0]], p1: [[102.0], [103.0]])])]], p2: s1(p0: s0(p0: [[104.0], [105.0]], p1: [[106.0], [107.0]]), p1: [s0(p0: [[108.0], [109.0]], p1: [[110.0], [111.0]]), s0(p0: [[112.0], [113.0]], p1: [[114.0], [115.0]]), s0(p0: [[116.0], [117.0]], p1: [[118.0], [119.0]])]), p3: [s1(p0: s0(p0: [[120.0], [121.0]], p1: [[122.0], [123.0]]), p1: [s0(p0: [[124.0], [125.0]], p1: [[126.0], [127.0]]), s0(p0: [[128.0], [129.0]], p1: [[130.0], [131.0]]), s0(p0: [[132.0], [133.0]], p1: [[134.0], [135.0]])]), s1(p0: s0(p0: [[136.0], [137.0]], p1: [[138.0], [139.0]]), p1: [s0(p0: [[140.0], [141.0]], p1: [[142.0], [143.0]]), s0(p0: [[144.0], [145.0]], p1: [[146.0], [147.0]]), s0(p0: [[148.0], [149.0]], p1: [[150.0], [151.0]])])]), s2(p0: [s0(p0: [[152.0], [153.0]], p1: [[154.0], [155.0]])], p1: [[s1(p0: s0(p0: [[156.0], [157.0]], p1: [[158.0], [159.0]]), p1: [s0(p0: [[160.0], [161.0]], p1: [[162.0], [163.0]]), s0(p0: [[164.0], [165.0]], p1: [[166.0], [167.0]]), s0(p0: [[168.0], [169.0]], p1: [[170.0], [171.0]])])]], p2: s1(p0: s0(p0: [[172.0], [173.0]], p1: [[174.0], [175.0]]), p1: [s0(p0: [[176.0], [177.0]], p1: [[178.0], [179.0]]), s0(p0: [[180.0], [181.0]], p1: [[182.0], [183.0]]), s0(p0: [[184.0], [185.0]], p1: [[186.0], [187.0]])]), p3: [s1(p0: s0(p0: [[188.0], [189.0]], p1: [[190.0], [191.0]]), p1: [s0(p0: [[192.0], [193.0]], p1: [[194.0], [195.0]]), s0(p0: [[196.0], [197.0]], p1: [[198.0], [199.0]]), s0(p0: [[200.0], [201.0]], p1: [[202.0], [203.0]])]), s1(p0: s0(p0: [[204.0], [205.0]], p1: [[206.0], [207.0]]), p1: [s0(p0: [[208.0], [209.0]], p1: [[210.0], [211.0]]), s0(p0: [[212.0], [213.0]], p1: [[214.0], [215.0]]), s0(p0: [[216.0], [217.0]], p1: [[218.0], [219.0]])])])]
    let v2: Double = 220.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 220.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
