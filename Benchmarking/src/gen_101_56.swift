  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  struct s3 {
    var p0: [[s2]]
    var p1: [s2]
  }
  func f111(_ v0: s2) -> s2 {
    var v4: s2 = v0
    return v4
  }
  func f108(_ v0: s0) -> s0 {
    var v5: s0 = v0
    var v4: s0 = v5
    let v3: [[Double]] = v4.p0
    v4.p0 = v3
    var v1: s0 = v4
    let v8: [[Double]] = v1.p2
    let v2: [[Double]] = v1.p0
    let v6: [[[Double]]] = [v8, v8, v8, v8, v8]
    let v11: [[Double]] = v6[1]
    var v17: s0 = v4
    v1.p2 = v8
    v5.p0 = v2
    let v20: [[Double]] = v6[1]
    let v35: [[Double]] = v1.p0
    v17.p2 = v11
    v1.p2 = v20
    v4.p2 = v8
    v5.p0 = v35
    return v17
  }
  func f106(_ v0: s1) -> s1 {
    let v5: s0 = v0.p1
    let v1: s0 = f108(v5)
    var v6: s1 = v0
    let v3: s0 = f108(v5)
    v6.p1 = v1
    var v7: s1 = v6
    let v2: s0 = f108(v3)
    let v9: s0 = f108(v5)
    v6.p1 = v2
    let v11: [s0] = v7.p0
    let v17: s0 = f108(v9)
    let v22: s0 = f108(v17)
    var v19: [s0] = v11
    let v44: s0 = f108(v17)
    v6.p1 = v9
    var v24: [s0] = v19
    v19[0] = v22
    v24[0] = v9
    let v42: s2 = s2(p0: v7, p1: v44)
    v6.p0 = v24
    let v108: s2 = f111(v42)
    let v55: s1 = v108.p0
    v24[0] = v44
    v6.p1 = v9
    return v55
  }
  func f103(_ v0: s2, _ v1: s0) -> s0 {
    var v6: s2 = v0
    let v3: s0 = f108(v1)
    v6.p1 = v1
    let v8: s0 = v6.p1
    v6 = v0
    v6.p1 = v8
    v6.p1 = v3
    let v14: s0 = f108(v8)
    let v13: s0 = f108(v3)
    var v25: s0 = v3
    let v26: [s0] = [v8, v3, v14, v25, v3]
    v6.p1 = v13
    let v56: s0 = v26[2]
    return v56
  }
  func f102(_ v0: s1, _ v1: s2) -> s2 {
    let v6: s2 = f111(v1)
    return v6
  }
  func f100(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v6: [[Double]] = v0.p0
    let v1: [Double] = v6[2]
    v4.p0 = v6
    let v5: [[Double]] = v4.p2
    let v2: [Double] = v5[0]
    let v9: [[Double]] = v4.p0
    v4.p2 = v5
    let v8: [[Double]] = v4.p2
    var v3: [[Double]] = v6
    v4.p0 = v9
    var v7: [[Double]] = v5
    var v18: [Double] = v1
    let v10: [[Double]] = v0.p2
    var v11: [[Double]] = v10
    v11[0] = v1
    let v20: s0 = f108(v4)
    var v12: [[Double]] = v3
    v4.p2 = v11
    let v15: s0 = f108(v20)
    v7[0] = v18
    v11[0] = v2
    let v31: [[Double]] = v15.p1
    let v16: Double = v2[0]
    v12[0] = v1
    v4.p2 = v10
    v4.p2 = v7
    v7[0] = v18
    var v36: [[Double]] = v9
    v4.p2 = v5
    v4.p0 = v12
    v18[0] = v16
    let v29: [Double] = v31[1]
    let v46: [Double] = v10[0]
    v18[0] = v16
    var v62: [[Double]] = v10
    let v96: [Double] = v7[0]
    v36 = v6
    v36[1] = v18
    let v75: [Double] = v8[0]
    var v32: [[Double]] = v12
    v4.p2 = v62
    var v68: [Double] = v29
    let v77: [[Double]] = v15.p2
    v18 = v2
    var v101: [[Double]] = v7
    v11 = v77
    v101[0] = v96
    v62[0] = v75
    var v66: [[Double]] = v31
    let v87: s0 = s0(p0: v36, p1: v66, p2: v101)
    v101[0] = v68
    v7 = v77
    let v121: [Double] = v32[2]
    v36[1] = v96
    v66[1] = v46
    v66[1] = v121
    return v87
  }
  func f98(_ v0: s2) -> s2 {
    let v3: s1 = v0.p0
    let v2: [s2] = [v0]
    let v10: s0 = v3.p1
    let v5: s2 = v2[0]
    let v39: s2 = s2(p0: v3, p1: v10)
    let v38: s1 = v39.p0
    let v62: s2 = f102(v38, v5)
    return v62
  }
  func f89(_ v0: s2) -> s2 {
    var v4: s2 = v0
    let v1: s1 = v4.p0
    v4.p0 = v1
    let v2: s2 = f111(v0)
    var v5: s1 = v1
    let v6: s0 = v2.p1
    let v10: s2 = f111(v2)
    var v12: s1 = v5
    let v14: s1 = v10.p0
    let v20: s0 = f103(v4, v6)
    var v17: s1 = v1
    v4.p1 = v20
    let v16: s1 = v10.p0
    let v9: [s0] = v14.p0
    let v24: s0 = f100(v20)
    v12.p0 = v9
    var v67: s2 = v0
    let v49: s2 = f102(v12, v67)
    let v90: s2 = f102(v16, v49)
    v12.p0 = v9
    v67.p1 = v24
    let v117: s2 = f102(v17, v90)
    return v117
  }
  func f88(_ v0: s1) -> s1 {
    let v1: s1 = f106(v0)
    let v2: s1 = f106(v0)
    let v5: s0 = v1.p1
    let v6: s0 = f108(v5)
    let v3: s0 = f100(v5)
    var v14: s1 = v1
    let v8: s0 = v1.p1
    v14.p1 = v8
    var v16: s1 = v14
    v16.p1 = v6
    v14.p1 = v8
    v14.p1 = v3
    let v57: [s0] = v2.p0
    v14.p0 = v57
    return v16
  }
  func f84(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v7: [[Double]] = v0.p1
    let v4: [[Double]] = v5.p0
    var v8: [[Double]] = v7
    let v1: [Double] = v7[1]
    var v3: [[Double]] = v7
    var v2: [Double] = v1
    let v6: [[Double]] = v5.p0
    let v9: Double = v1[0]
    let v13: [Double] = v7[1]
    let v11: [[Double]] = v0.p2
    let v21: s0 = f108(v5)
    let v10: [[Double]] = v5.p2
    let v12: [Double] = v10[0]
    v2[0] = v9
    v3 = v7
    v5.p0 = v6
    let v15: Double = v2[0]
    v5.p0 = v4
    let v19: s0 = s0(p0: v4, p1: v3, p2: v11)
    let v24: s0 = f108(v19)
    let v74: Double = v13[0]
    var v36: Double = v15
    let v32: [[Double]] = v19.p0
    let v26: Double = v36 + v74
    let v20: s0 = f108(v24)
    let v69: [[Double]] = v24.p2
    let v28: s0 = f100(v20)
    let v59: [Double] = v32[2]
    let v38: [[Double]] = v24.p0
    let v22: [[Double]] = v28.p2
    let v39: [Double] = v69[0]
    let v30: [[Double]] = v21.p0
    v5.p0 = v4
    let v161: s0 = s0(p0: v30, p1: v8, p2: v22)
    let v53: [[Double]] = v21.p1
    let v79: s0 = f108(v161)
    let v132: [Double] = v8[0]
    let v57: [s0] = [v161, v161, v79]
    v5.p2 = v11
    v8[0] = v2
    v2[0] = v26
    v8[0] = v12
    let v111: s0 = v57[1]
    let v105: s0 = f108(v111)
    v3[1] = v59
    v2 = v39
    v5.p0 = v38
    v5.p1 = v53
    v3[1] = v132
    return v105
  }
  func f83(_ v0: s3) -> s3 {
    return v0
  }
  func f80(_ v0: s2) -> s2 {
    let v1: s2 = f89(v0)
    let v6: s1 = v1.p0
    let v2: s1 = f88(v6)
    let v11: s2 = f102(v2, v0)
    return v11
  }
  func f74(_ v0: s2, _ v1: s0) -> s2 {
    let v7: s0 = f100(v1)
    var v8: s2 = v0
    var v6: s0 = v7
    let v9: s0 = f103(v8, v6)
    let v17: s2 = f111(v0)
    let v21: s0 = v17.p1
    var v51: s2 = v8
    let v16: s0 = f100(v7)
    let v14: s1 = v51.p0
    v8.p0 = v14
    let v36: s1 = v0.p0
    let v15: s2 = f98(v51)
    var v50: s1 = v36
    v50.p1 = v21
    let v39: [[Double]] = v16.p2
    let v57: s1 = f106(v50)
    v51.p0 = v50
    let v54: s2 = f102(v57, v15)
    v6.p2 = v39
    v51.p1 = v9
    return v54
  }
  func f49(_ v0: s2) -> s2 {
    var v11: s2 = v0
    let v13: s2 = f89(v11)
    return v13
  }
  func f43(_ v0: s0, _ v1: s2) -> s2 {
    var v5: s2 = v1
    v5.p1 = v0
    v5.p1 = v0
    let v2: s2 = f98(v1)
    let v14: s2 = f74(v2, v0)
    let v10: [s2] = [v2, v5, v14, v2, v5, v1, v5]
    let v17: s2 = v10[0]
    return v17
  }
  func f42(_ v0: s1) -> s1 {
    let v4: s1 = f106(v0)
    let v3: s1 = f106(v4)
    let v2: [s1] = [v0, v3]
    let v9: s1 = v2[0]
    let v52: s1 = f88(v9)
    return v52
  }
  func f38(_ v0: s0) -> s0 {
    let v1: s0 = f108(v0)
    let v7: s0 = f108(v1)
    var v3: s0 = v7
    v3 = v1
    let v5: s0 = f100(v1)
    let v6: [[Double]] = v3.p0
    var v11: s0 = v5
    v11.p0 = v6
    var v2: s0 = v11
    let v9: [Double] = v6[2]
    v3.p0 = v6
    v11.p0 = v6
    let v29: [[Double]] = v2.p2
    let v14: [[Double]] = v2.p0
    let v44: [[Double]] = v0.p2
    let v43: s0 = f100(v1)
    v2.p0 = v6
    let v26: [[Double]] = v43.p2
    let v28: [[Double]] = v5.p1
    var v60: [[Double]] = v14
    var v42: [[Double]] = v26
    v11.p0 = v6
    let v35: s0 = s0(p0: v60, p1: v28, p2: v29)
    v2.p2 = v42
    v11.p2 = v29
    v11.p1 = v28
    v3.p2 = v44
    v11.p2 = v44
    v60[2] = v9
    return v35
  }
  func f29(_ v0: s2) -> s2 {
    var v1: s2 = v0
    let v7: s1 = v1.p0
    let v6: s2 = f98(v0)
    let v5: s0 = v6.p1
    v1.p0 = v7
    var v3: s1 = v7
    v1.p0 = v3
    let v9: s0 = f103(v0, v5)
    let v2: s2 = f80(v0)
    v1.p1 = v9
    let v15: [s2] = [v1, v2, v2, v6, v0, v2]
    let v11: s1 = v2.p0
    var v19: s1 = v7
    v19.p1 = v9
    let v25: s2 = v15[2]
    let v24: s0 = v19.p1
    let v26: s2 = f49(v25)
    let v22: s2 = f111(v26)
    v1.p0 = v11
    v1.p0 = v7
    let v93: s2 = f89(v22)
    let v56: s2 = f74(v93, v24)
    let v46: s2 = f98(v56)
    return v46
  }
  func f21(_ v0: s0, _ v1: s0) -> s0 {
    var v7: s0 = v1
    let v3: s0 = f108(v0)
    let v2: s0 = f38(v0)
    let v5: [[Double]] = v7.p1
    let v4: [[[Double]]] = [v5, v5, v5, v5]
    let v16: s0 = f38(v1)
    let v14: [[Double]] = v2.p2
    let v28: [[Double]] = v16.p0
    let v43: [[[Double]]] = [v28]
    var v26: [[[Double]]] = v4
    var v38: [[[Double]]] = v43
    let v22: [[Double]] = v38[0]
    let v77: [[Double]] = v26[1]
    let v44: [[Double]] = v3.p0
    v38[0] = v44
    let v73: s0 = s0(p0: v22, p1: v77, p2: v14)
    v7.p1 = v5
    return v73
  }
  func f5(_ v0: s0, _ v1: s0, _ v2: s3, _ v3: s0) -> s0 {
    let v7: [s0] = [v3, v3, v0, v3, v0, v0, v1]
    var v74: [s0] = v7
    let v58: s0 = v74[6]
    var v69: [s0] = v74
    v74 = v69
    return v58
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [[s3]], _ v2: Double) -> Double {
    let v4: s2 = f29(v0)
    let v10: [s3] = v1[0]
    var v8: s2 = v4
    let v9: s1 = v0.p0
    let v3: s0 = v8.p1
    let v13: s2 = f98(v0)
    let v14: s0 = f103(v13, v3)
    let v17: s0 = f84(v3)
    var v11: s0 = v17
    v8.p1 = v11
    let v15: s3 = v10[0]
    let v34: [s1] = [v9, v9]
    var v22: s0 = v14
    let v30: s1 = v34[1]
    let v27: s1 = f42(v30)
    let v47: [[Double]] = v3.p2
    v22.p2 = v47
    v11.p2 = v47
    let v42: s0 = f21(v3, v11)
    let v18: [[Double]] = v3.p0
    let v71: [Double] = v18[0]
    let v64: Double = v71[0]
    let v33: [[Double]] = v14.p2
    var v53: s2 = v4
    let v80: s2 = f43(v42, v53)
    let v57: s1 = v13.p0
    let v82: s3 = f83(v15)
    let v88: s0 = v80.p1
    v8.p1 = v22
    let v141: s1 = v4.p0
    let v102: s0 = f103(v80, v14)
    var v85: Double = v64
    v53.p0 = v57
    let v92: [[Double]] = v102.p2
    v53.p0 = v30
    let v66: s0 = f5(v88, v14, v82, v22)
    let v84: s0 = v4.p1
    v53.p1 = v42
    let v69: [[Double]] = v66.p0
    v11.p2 = v92
    v11.p0 = v69
    v53.p1 = v84
    v11.p0 = v18
    v8.p0 = v27
    v11.p2 = v33
    let v93: Double = v85 + v85
    var v162: Double = v93
    v8.p0 = v141
    return v162
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: [[5.0]])], p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0]], p2: [[11.0]])), p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0]], p2: [[17.0]]))
    let v1: [[s3]] = [[s3(p0: [[s2(p0: s1(p0: [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0]], p2: [[23.0]])], p1: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0]], p2: [[29.0]])), p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]], p2: [[35.0]]))], [s2(p0: s1(p0: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0]], p2: [[41.0]])], p1: s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0]], p2: [[47.0]])), p1: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0]], p2: [[53.0]]))]], p1: [s2(p0: s1(p0: [s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0]], p2: [[59.0]])], p1: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0]], p2: [[65.0]])), p1: s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0]], p2: [[71.0]])), s2(p0: s1(p0: [s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0]], p2: [[77.0]])], p1: s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0], [82.0]], p2: [[83.0]])), p1: s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0], [88.0]], p2: [[89.0]])), s2(p0: s1(p0: [s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0]], p2: [[95.0]])], p1: s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0], [100.0]], p2: [[101.0]])), p1: s0(p0: [[102.0], [103.0], [104.0]], p1: [[105.0], [106.0]], p2: [[107.0]]))])], [s3(p0: [[s2(p0: s1(p0: [s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0], [112.0]], p2: [[113.0]])], p1: s0(p0: [[114.0], [115.0], [116.0]], p1: [[117.0], [118.0]], p2: [[119.0]])), p1: s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0], [124.0]], p2: [[125.0]]))], [s2(p0: s1(p0: [s0(p0: [[126.0], [127.0], [128.0]], p1: [[129.0], [130.0]], p2: [[131.0]])], p1: s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0], [136.0]], p2: [[137.0]])), p1: s0(p0: [[138.0], [139.0], [140.0]], p1: [[141.0], [142.0]], p2: [[143.0]]))]], p1: [s2(p0: s1(p0: [s0(p0: [[144.0], [145.0], [146.0]], p1: [[147.0], [148.0]], p2: [[149.0]])], p1: s0(p0: [[150.0], [151.0], [152.0]], p1: [[153.0], [154.0]], p2: [[155.0]])), p1: s0(p0: [[156.0], [157.0], [158.0]], p1: [[159.0], [160.0]], p2: [[161.0]])), s2(p0: s1(p0: [s0(p0: [[162.0], [163.0], [164.0]], p1: [[165.0], [166.0]], p2: [[167.0]])], p1: s0(p0: [[168.0], [169.0], [170.0]], p1: [[171.0], [172.0]], p2: [[173.0]])), p1: s0(p0: [[174.0], [175.0], [176.0]], p1: [[177.0], [178.0]], p2: [[179.0]])), s2(p0: s1(p0: [s0(p0: [[180.0], [181.0], [182.0]], p1: [[183.0], [184.0]], p2: [[185.0]])], p1: s0(p0: [[186.0], [187.0], [188.0]], p1: [[189.0], [190.0]], p2: [[191.0]])), p1: s0(p0: [[192.0], [193.0], [194.0]], p1: [[195.0], [196.0]], p2: [[197.0]]))])]]
    let v2: Double = 198.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 198.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
