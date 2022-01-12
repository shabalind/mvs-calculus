  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
    var p2: [[Double]]
    var p3: [Double]
    var p4: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: Double
  }
  func f112(_ v0: s2) -> s2 {
    var v2: s2 = v0
    var v3: s2 = v2
    return v3
  }
  func f109(_ v0: s0) -> s0 {
    var v1: s0 = v0
    var v3: s0 = v0
    v1 = v0
    var v7: s0 = v0
    var v10: s0 = v1
    let v8: [[Double]] = v10.p0
    let v4: [[Double]] = v3.p4
    let v12: [[Double]] = v1.p0
    let v21: [[Double]] = v1.p2
    var v27: s0 = v7
    v1.p4 = v4
    let v13: [[Double]] = v27.p4
    var v30: [[Double]] = v8
    let v15: [Double] = v21[0]
    v30[1] = v15
    v10.p0 = v12
    v1 = v7
    v10.p0 = v4
    let v50: [Double] = v27.p1
    v1.p1 = v50
    v7.p4 = v13
    v10.p4 = v30
    v7.p0 = v4
    return v10
  }
  func f105(_ v0: s1) -> s1 {
    let v2: s0 = v0.p1
    let v3: [s0] = v0.p0
    let v4: s0 = v0.p1
    let v6: s0 = v3[2]
    let v1: s0 = f109(v6)
    var v5: s0 = v6
    let v10: s0 = f109(v1)
    var v12: s1 = v0
    v12.p1 = v5
    v5 = v6
    var v20: s1 = v12
    var v22: s1 = v12
    v20.p1 = v4
    v5 = v6
    let v13: [s0] = v20.p0
    v20.p1 = v10
    v20.p1 = v5
    var v37: s1 = v22
    v37.p0 = v13
    var v31: s1 = v37
    v20.p1 = v2
    return v31
  }
  func f101(_ v0: s1, _ v1: s2) -> s2 {
    let v5: s1 = f105(v0)
    let v8: s1 = f105(v5)
    let v13: Double = v1.p1
    let v34: s2 = s2(p0: v8, p1: v13)
    var v119: s2 = v34
    return v119
  }
  func f97(_ v0: s2) -> s2 {
    let v2: s1 = v0.p0
    var v8: s1 = v2
    let v1: s2 = f112(v0)
    let v3: s2 = f101(v8, v1)
    var v19: s2 = v3
    return v19
  }
  func f95(_ v0: [s0]) -> [s0] {
    let v5: s0 = v0[1]
    var v2: [s0] = v0
    let v10: s0 = f109(v5)
    let v13: s0 = f109(v5)
    let v32: s0 = f109(v10)
    let v38: s0 = f109(v32)
    let v69: s0 = f109(v13)
    let v62: s0 = f109(v38)
    var v51: [s0] = v2
    v2[1] = v13
    v51[1] = v69
    v2[2] = v62
    return v51
  }
  func f94(_ v0: s1, _ v1: s0) -> s0 {
    var v3: s1 = v0
    let v4: s0 = f109(v1)
    let v11: s1 = f105(v3)
    v3.p1 = v1
    v3 = v11
    v3.p1 = v4
    let v61: [s0] = v11.p0
    let v53: [s0] = f95(v61)
    let v49: [s0] = v0.p0
    let v266: [s0] = f95(v53)
    let v242: [s0] = f95(v49)
    v3.p0 = v242
    let v138: s0 = v266[1]
    let v243: s0 = f109(v138)
    return v243
  }
  func f93(_ v0: s1, _ v1: [s0]) -> s1 {
    let v2: [s0] = f95(v1)
    let v6: s0 = v2[1]
    let v7: s1 = s1(p0: v1, p1: v6)
    return v7
  }
  func f88(_ v0: s2) -> s2 {
    let v3: s2 = f112(v0)
    var v7: s2 = v3
    let v4: s1 = v7.p0
    var v2: s1 = v4
    var v5: s2 = v0
    var v10: s2 = v5
    let v9: [s0] = v4.p0
    let v6: Double = v7.p1
    let v8: Double = v6 / v6
    let v17: s0 = v9[2]
    let v26: [Double] = v17.p3
    let v24: s0 = f94(v2, v17)
    let v13: s0 = f94(v4, v24)
    var v14: [Double] = v26
    var v36: [s0] = v9
    var v22: s0 = v13
    let v19: Double = v3.p1
    v36[0] = v24
    let v29: s1 = f105(v4)
    v36[0] = v17
    v14[1] = v6
    let v16: [s0] = f95(v36)
    let v21: [s0] = f95(v16)
    var v41: s0 = v22
    v36[1] = v17
    let v34: [Double] = v22.p1
    var v42: Double = v6
    let v59: [s0] = v4.p0
    v7.p0 = v4
    v36[2] = v41
    v14[1] = v8
    let v38: s0 = f109(v22)
    v2.p0 = v21
    let v25: s1 = f93(v29, v59)
    let v28: Double = v34[0]
    var v55: [s0] = v21
    v41.p1 = v26
    v5.p1 = v42
    let v35: s0 = v2.p1
    v5.p0 = v29
    let v56: s0 = v2.p1
    v36[0] = v38
    v7.p0 = v25
    v36[0] = v22
    v14[0] = v19
    let v74: Double = v14[0]
    v36[1] = v24
    let v92: s1 = v10.p0
    let v97: s1 = f93(v25, v55)
    let v96: s0 = f94(v92, v56)
    let v94: s0 = v29.p1
    v36[2] = v35
    v7.p1 = v28
    v5.p1 = v28
    v36[1] = v94
    v36[0] = v38
    v5.p1 = v42
    let v102: s2 = s2(p0: v97, p1: v74)
    v55[2] = v96
    return v102
  }
  func f80(_ v0: s1) -> s1 {
    let v7: [s0] = v0.p0
    let v5: [s0] = v0.p0
    let v1: [s0] = v0.p0
    var v2: [s0] = v5
    let v3: s0 = v2[1]
    let v10: s0 = v1[0]
    let v13: s0 = v5[0]
    v2[2] = v3
    v2[2] = v3
    v2[1] = v10
    var v8: s1 = v0
    v8.p1 = v10
    let v15: s0 = v2[0]
    let v18: s0 = v2[1]
    v8.p0 = v1
    let v16: s0 = v8.p1
    let v24: s0 = f94(v8, v10)
    var v21: [s0] = v1
    var v28: s1 = v0
    let v27: s0 = v7[1]
    let v19: [Double] = v15.p1
    v28.p0 = v1
    v2[2] = v16
    var v40: s1 = v8
    let v39: [s0] = f95(v5)
    let v25: s1 = s1(p0: v1, p1: v3)
    let v85: [s0] = v28.p0
    let v45: [s1] = [v25, v28, v40, v25, v8]
    let v37: [s0] = f95(v7)
    let v54: [s0] = f95(v2)
    let v76: [s0] = f95(v2)
    let v64: Double = v19[0]
    let v38: [[s0]] = [v1, v39, v85, v54, v85, v85]
    v40.p0 = v37
    let v63: s1 = f105(v8)
    let v66: [s0] = v38[0]
    v28.p1 = v13
    v40.p1 = v18
    let v98: s0 = v0.p1
    var v79: [s1] = v45
    let v99: s1 = f93(v63, v21)
    let v331: s1 = v79[3]
    v8.p1 = v27
    v2[1] = v24
    var v125: [s0] = v85
    let v363: s1 = f105(v99)
    v8.p0 = v76
    let v139: s2 = s2(p0: v363, p1: v64)
    let v94: s2 = f101(v331, v139)
    let v120: s2 = f112(v94)
    v28.p0 = v66
    v40.p0 = v125
    v8.p0 = v85
    let v237: s2 = f88(v120)
    v8.p1 = v98
    v2 = v7
    let v135: s2 = f97(v237)
    let v154: s1 = v135.p0
    return v154
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v7: [s1] = v0[1]
    let v4: s1 = v7[0]
    let v5: s1 = f80(v4)
    let v2: [s0] = v4.p0
    let v8: s0 = v2[0]
    let v12: [s0] = v5.p0
    let v16: s0 = v12[0]
    var v28: Double = v1
    let v29: [Double] = v8.p1
    let v41: [[Double]] = v16.p4
    let v36: [Double] = v41[0]
    let v43: Double = v36[0]
    var v54: Double = v43
    var v44: [Double] = v29
    v44[0] = v28
    let v167: Double = v44[1]
    let v73: Double = v54 * v167
    return v73
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [s0(p0: [[0.0], [1.0]], p1: [2.0, 3.0], p2: [[4.0], [5.0], [6.0]], p3: [7.0, 8.0], p4: [[9.0], [10.0]]), s0(p0: [[11.0], [12.0]], p1: [13.0, 14.0], p2: [[15.0], [16.0], [17.0]], p3: [18.0, 19.0], p4: [[20.0], [21.0]]), s0(p0: [[22.0], [23.0]], p1: [24.0, 25.0], p2: [[26.0], [27.0], [28.0]], p3: [29.0, 30.0], p4: [[31.0], [32.0]])], p1: s0(p0: [[33.0], [34.0]], p1: [35.0, 36.0], p2: [[37.0], [38.0], [39.0]], p3: [40.0, 41.0], p4: [[42.0], [43.0]]))], [s1(p0: [s0(p0: [[44.0], [45.0]], p1: [46.0, 47.0], p2: [[48.0], [49.0], [50.0]], p3: [51.0, 52.0], p4: [[53.0], [54.0]]), s0(p0: [[55.0], [56.0]], p1: [57.0, 58.0], p2: [[59.0], [60.0], [61.0]], p3: [62.0, 63.0], p4: [[64.0], [65.0]]), s0(p0: [[66.0], [67.0]], p1: [68.0, 69.0], p2: [[70.0], [71.0], [72.0]], p3: [73.0, 74.0], p4: [[75.0], [76.0]])], p1: s0(p0: [[77.0], [78.0]], p1: [79.0, 80.0], p2: [[81.0], [82.0], [83.0]], p3: [84.0, 85.0], p4: [[86.0], [87.0]]))]]
    let v1: Double = 88.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 88.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
