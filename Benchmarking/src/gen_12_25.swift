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
    var p0: [[s1]]
    var p1: s0
  }
  struct s3 {
    var p0: s1
    var p1: [s0]
  }
  struct s4 {
    var p0: s2
    var p1: [[s1]]
  }
  struct s5 {
    var p0: s3
  }
  struct s6 {
    var p0: s5
    var p1: [[s4]]
  }
  func f55(_ v0: [s2]) -> [s2] {
    var v2: [s2] = v0
    var v1: [s2] = v0
    let v7: s2 = v0[0]
    let v6: s2 = v1[0]
    v1[0] = v6
    v1 = v0
    v1[0] = v7
    v2[0] = v6
    v1 = v2
    v2 = v1
    let v35: s2 = v2[0]
    let v29: s2 = v1[0]
    var v32: [s2] = v0
    let v34: [s2] = [v7, v6]
    let v26: s2 = v34[1]
    v32[0] = v6
    v2[0] = v35
    v2[0] = v26
    v32[0] = v26
    v32 = v2
    v32[0] = v29
    return v32
  }
  func f38(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p1
    let v3: [Double] = v2[0]
    let v7: [[Double]] = v0.p1
    let v6: [[Double]] = v0.p1
    let v4: [[Double]] = v0.p0
    let v8: [[Double]] = v0.p1
    var v5: [Double] = v3
    var v14: [[Double]] = v7
    let v10: [[Double]] = v0.p1
    v14[0] = v3
    var v22: [[Double]] = v8
    v14[2] = v3
    let v1: Double = v5[0]
    let v13: [[Double]] = v0.p1
    let v9: [[Double]] = v0.p1
    let v12: [Double] = v13[0]
    let v15: Double = v3[0]
    var v21: [[Double]] = v6
    let v19: Double = v1 * v15
    let v24: [[Double]] = v0.p1
    var v32: [Double] = v12
    var v26: s0 = v0
    let v29: [[Double]] = v0.p1
    v21[0] = v5
    var v37: [[Double]] = v24
    v22 = v9
    let v33: [[Double]] = v26.p1
    v26.p0 = v29
    v5[0] = v19
    let v64: [[Double]] = v26.p0
    let v56: [[Double]] = v26.p0
    let v34: [Double] = v4[0]
    v26.p0 = v56
    v26.p0 = v7
    let v45: s0 = s0(p0: v37, p1: v22)
    let v51: [[Double]] = v26.p1
    v26.p0 = v56
    v21[0] = v3
    var v53: s0 = v45
    let v50: [[Double]] = v53.p0
    v26.p0 = v6
    let v86: Double = v34[0]
    v21[2] = v5
    v53.p0 = v21
    let v75: s0 = s0(p0: v33, p1: v10)
    v21[1] = v32
    v26.p0 = v51
    v21 = v14
    v37[0] = v3
    let v52: s0 = s0(p0: v50, p1: v51)
    v53.p0 = v14
    let v110: [[Double]] = v75.p1
    v32[0] = v86
    v26.p1 = v110
    v26.p0 = v64
    return v52
  }
  func f37(_ v0: s2) -> s2 {
    let v5: s0 = v0.p1
    var v12: s2 = v0
    let v23: s0 = f38(v5)
    let v34: s0 = f38(v23)
    v12.p1 = v34
    let v87: [s2] = [v12, v0]
    let v120: s2 = v87[1]
    return v120
  }
  func f30(_ v0: s0) -> s0 {
    let v2: s0 = f38(v0)
    let v5: [[Double]] = v0.p1
    let v7: s0 = f38(v2)
    let v11: s0 = f38(v2)
    let v15: [[Double]] = v11.p1
    let v14: [[Double]] = v0.p1
    let v25: s0 = f38(v0)
    var v18: s0 = v0
    v18.p0 = v15
    let v27: [[Double]] = v18.p0
    let v21: s0 = f38(v18)
    let v33: [[Double]] = v21.p0
    v18.p1 = v33
    var v92: s0 = v7
    v18.p0 = v5
    v92.p1 = v14
    let v149: s0 = f38(v92)
    let v124: [s0] = [v2, v25, v92, v149, v149]
    var v142: [s0] = v124
    var v126: [s0] = v142
    var v105: [s0] = v126
    v92.p1 = v27
    let v243: s0 = v105[3]
    return v243
  }
  func f16(_ v0: s2) -> s2 {
    let v19: s2 = f37(v0)
    let v32: s2 = f37(v19)
    let v51: s2 = f37(v32)
    return v51
  }
  func f10(_ v0: s0) -> s0 {
    let v9: s0 = f38(v0)
    let v14: s0 = f30(v9)
    let v5: [[Double]] = v14.p1
    let v2: s0 = s0(p0: v5, p1: v5)
    let v33: s0 = f30(v2)
    return v33
  }
  @inline(never)
  func f0(_ v0: [[s6]], _ v1: [s2], _ v2: [s1], _ v3: Double) -> Double {
    let v4: [s2] = f55(v1)
    var v7: [s2] = v4
    let v14: [s2] = f55(v7)
    let v11: s2 = v7[0]
    var v8: s2 = v11
    var v10: s2 = v8
    let v28: s2 = f16(v10)
    var v13: s2 = v10
    let v24: s0 = v11.p1
    let v16: s2 = v4[0]
    let v9: [[s1]] = v28.p0
    let v19: [[Double]] = v24.p1
    let v33: s2 = v14[0]
    let v30: [Double] = v19[0]
    let v29: s0 = v28.p1
    let v17: s2 = f37(v10)
    var v23: s0 = v29
    let v49: [s2] = [v13, v13, v33, v33, v16, v17, v17]
    let v42: s0 = f38(v24)
    v13.p1 = v23
    let v65: [[Double]] = v42.p1
    let v59: Double = v30[0]
    v10.p1 = v23
    v23 = v24
    var v36: [s2] = v49
    var v55: [[Double]] = v65
    let v45: s0 = v33.p1
    v8.p1 = v45
    let v73: s0 = f38(v42)
    v10.p1 = v45
    v13.p0 = v9
    let v172: s2 = v36[5]
    v23.p0 = v55
    v13 = v172
    let v84: s0 = f10(v42)
    v10.p1 = v73
    let v175: s2 = f37(v172)
    v8.p1 = v84
    v7[0] = v175
    return v59
  }
  func benchmark() {
    let v0: [[s6]] = [[s6(p0: s5(p0: s3(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])]), p1: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]])])), p1: [[s4(p0: s2(p0: [[s1(p0: s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]]), p1: [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]]), s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]]), s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]])])], [s1(p0: s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0], [71.0]]), p1: [s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]]), s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0], [82.0], [83.0]]), s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0], [88.0], [89.0]])])]], p1: s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0], [95.0]])), p1: [[s1(p0: s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0], [100.0], [101.0]]), p1: [s0(p0: [[102.0], [103.0], [104.0]], p1: [[105.0], [106.0], [107.0]]), s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0], [112.0], [113.0]]), s0(p0: [[114.0], [115.0], [116.0]], p1: [[117.0], [118.0], [119.0]])])]])]])]]
    let v1: [s2] = [s2(p0: [[s1(p0: s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0], [124.0], [125.0]]), p1: [s0(p0: [[126.0], [127.0], [128.0]], p1: [[129.0], [130.0], [131.0]]), s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0], [136.0], [137.0]]), s0(p0: [[138.0], [139.0], [140.0]], p1: [[141.0], [142.0], [143.0]])])], [s1(p0: s0(p0: [[144.0], [145.0], [146.0]], p1: [[147.0], [148.0], [149.0]]), p1: [s0(p0: [[150.0], [151.0], [152.0]], p1: [[153.0], [154.0], [155.0]]), s0(p0: [[156.0], [157.0], [158.0]], p1: [[159.0], [160.0], [161.0]]), s0(p0: [[162.0], [163.0], [164.0]], p1: [[165.0], [166.0], [167.0]])])]], p1: s0(p0: [[168.0], [169.0], [170.0]], p1: [[171.0], [172.0], [173.0]]))]
    let v2: [s1] = [s1(p0: s0(p0: [[174.0], [175.0], [176.0]], p1: [[177.0], [178.0], [179.0]]), p1: [s0(p0: [[180.0], [181.0], [182.0]], p1: [[183.0], [184.0], [185.0]]), s0(p0: [[186.0], [187.0], [188.0]], p1: [[189.0], [190.0], [191.0]]), s0(p0: [[192.0], [193.0], [194.0]], p1: [[195.0], [196.0], [197.0]])])]
    let v3: Double = 198.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 198.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
