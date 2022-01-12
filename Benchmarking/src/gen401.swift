  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s7 {
    var p0: Double
    var p1: [[s2]]
  }
  func f71(_ v0: s0) -> s0 {
    var v5: s0 = v0
    var v4: s0 = v5
    var v6: s0 = v0
    let v3: [[Double]] = v5.p0
    let v13: [[Double]] = v5.p1
    let v17: [[Double]] = v6.p0
    v4.p0 = v3
    v5.p0 = v17
    v4.p1 = v13
    v6.p1 = v13
    let v1: [[Double]] = v4.p3
    v5.p1 = v13
    let v27: [[Double]] = v4.p1
    v4.p1 = v27
    var v36: s0 = v4
    v5.p3 = v1
    return v36
  }
  func f68(_ v0: s7) -> s7 {
    var v6: s7 = v0
    let v2: Double = v6.p0
    let v7: [Double] = [v2, v2]
    let v3: Double = v7[1]
    v6.p0 = v3
    let v5: Double = v7[1]
    let v12: [[s2]] = v6.p1
    let v8: [[s2]] = v6.p1
    v6.p1 = v12
    v6.p1 = v12
    let v33: Double = v6.p0
    var v34: Double = v5
    let v19: [s2] = v8[1]
    var v45: s7 = v0
    let v16: s2 = v19[0]
    v45.p1 = v8
    let v55: s0 = v16.p0
    v6.p0 = v5
    let v52: [[Double]] = v55.p2
    v45.p0 = v3
    v45.p0 = v2
    var v68: [[Double]] = v52
    let v60: [Double] = v68[2]
    let v36: Double = v60[0]
    var v50: s7 = v0
    var v58: s7 = v50
    let v107: Double = v36 + v5
    v6.p0 = v107
    v68[1] = v60
    let v88: [[s2]] = v6.p1
    var v44: [[Double]] = v68
    v58.p1 = v88
    let v80: [Double] = v44[2]
    v68[1] = v80
    v6.p0 = v34
    v58 = v45
    v50.p1 = v88
    v58.p0 = v33
    v58.p1 = v8
    v45.p0 = v33
    return v58
  }
  func f59(_ v0: [[s2]]) -> [[s2]] {
    var v2: [[s2]] = v0
    var v5: [[s2]] = v0
    v2 = v5
    var v1: [[s2]] = v0
    let v3: [[[s2]]] = [v1, v2, v0, v5, v1, v0]
    let v9: [s2] = v2[2]
    v2[0] = v9
    v1[0] = v9
    var v37: [s2] = v9
    v2[1] = v9
    v1[1] = v37
    let v65: [[s2]] = v3[2]
    return v65
  }
  func f50(_ v0: s2) -> s2 {
    var v8: s2 = v0
    var v6: s2 = v8
    var v5: s2 = v0
    let v2: s0 = v5.p1
    let v4: [s2] = [v5, v6, v8]
    let v1: s0 = f71(v2)
    let v7: s0 = f71(v2)
    let v9: s0 = v5.p1
    let v13: s0 = v0.p0
    let v3: s2 = v4[1]
    let v11: s0 = f71(v1)
    let v16: s0 = f71(v7)
    var v29: s2 = v3
    v6.p0 = v16
    v5.p1 = v13
    var v30: s2 = v29
    let v28: s0 = f71(v9)
    v8.p0 = v28
    v6.p1 = v13
    var v17: s2 = v29
    v8.p1 = v28
    let v48: s0 = v3.p1
    v6.p0 = v2
    let v90: s0 = v30.p0
    let v52: s0 = f71(v48)
    let v75: s0 = v3.p0
    v29.p1 = v52
    v17.p0 = v90
    v17.p0 = v11
    v8.p0 = v75
    return v17
  }
  func f15(_ v0: s7) -> s7 {
    var v2: s7 = v0
    var v6: s7 = v0
    let v8: s7 = f68(v6)
    v6 = v8
    var v5: s7 = v6
    let v1: s7 = f68(v0)
    let v9: s7 = f68(v1)
    let v7: [[s2]] = v0.p1
    var v3: [[s2]] = v7
    let v17: [[s2]] = v2.p1
    let v21: [s2] = v7[0]
    let v15: [s2] = v17[0]
    let v20: [[s2]] = v0.p1
    var v18: s7 = v1
    let v12: [[s2]] = f59(v7)
    v5.p1 = v3
    let v19: [[s2]] = f59(v17)
    let v30: [[s2]] = f59(v20)
    v5.p1 = v7
    let v13: Double = v0.p0
    let v16: s2 = v21[0]
    let v28: Double = v0.p0
    let v51: [[s2]] = f59(v3)
    let v56: [s2] = v12[0]
    let v37: s7 = f68(v18)
    let v46: [[s2]] = v37.p1
    v2.p0 = v13
    let v24: [[[s2]]] = [v51, v3, v12, v51]
    v6.p1 = v3
    v3[0] = v15
    v18.p0 = v28
    let v32: [s2] = v20[0]
    v2 = v1
    v3 = v19
    v3[1] = v32
    let v26: s2 = v56[0]
    let v40: [s2] = v46[1]
    let v23: [s2] = v30[0]
    let v31: Double = v5.p0
    var v49: [s2] = v23
    let v50: Double = v9.p0
    v3[0] = v49
    v2.p0 = v31
    v5.p1 = v51
    let v33: s0 = v16.p0
    v3[0] = v21
    let v59: s2 = v23[0]
    let v66: [[s2]] = v24[2]
    v49 = v40
    let v42: [[Double]] = v33.p2
    let v39: [Double] = v42[1]
    v2.p1 = v19
    let v79: [[s2]] = v24[2]
    v6.p0 = v50
    v6.p1 = v66
    v2.p1 = v17
    let v116: s2 = f50(v59)
    v49[0] = v116
    v18.p1 = v3
    v5.p1 = v79
    let v105: Double = v39[0]
    v5.p1 = v7
    let v188: s7 = f68(v18)
    v6.p1 = v46
    v5.p0 = v105
    var v113: s7 = v188
    v3[1] = v15
    v5.p1 = v7
    v113.p1 = v3
    v49[0] = v26
    v18.p1 = v51
    return v113
  }
  @inline(never)
  func f0(_ v0: [s7], _ v1: Double) -> Double {
    var v4: [s7] = v0
    let v7: s7 = v4[1]
    var v3: [s7] = v0
    let v5: s7 = v3[1]
    let v6: s7 = f68(v7)
    v3[0] = v5
    let v8: s7 = f68(v6)
    var v18: Double = v1
    var v21: Double = v18
    let v39: s7 = v4[1]
    let v14: s7 = f15(v5)
    let v30: s7 = v3[2]
    v18 = v21
    let v120: Double = v14.p0
    var v94: Double = v1
    let v70: Double = v94 / v120
    let v86: Double = v70 * v18
    v3[0] = v30
    v3[2] = v39
    v4[1] = v6
    v3[1] = v8
    return v86
  }
  func benchmark() {
    let v0: [s7] = [s7(p0: 0.0, p1: [[s2(p0: s0(p0: [[1.0], [2.0], [3.0]], p1: [[4.0]], p2: [[5.0], [6.0], [7.0]], p3: [[8.0], [9.0]]), p1: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0]], p2: [[14.0], [15.0], [16.0]], p3: [[17.0], [18.0]]))], [s2(p0: s0(p0: [[19.0], [20.0], [21.0]], p1: [[22.0]], p2: [[23.0], [24.0], [25.0]], p3: [[26.0], [27.0]]), p1: s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]], p2: [[32.0], [33.0], [34.0]], p3: [[35.0], [36.0]]))], [s2(p0: s0(p0: [[37.0], [38.0], [39.0]], p1: [[40.0]], p2: [[41.0], [42.0], [43.0]], p3: [[44.0], [45.0]]), p1: s0(p0: [[46.0], [47.0], [48.0]], p1: [[49.0]], p2: [[50.0], [51.0], [52.0]], p3: [[53.0], [54.0]]))]]), s7(p0: 55.0, p1: [[s2(p0: s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]], p2: [[60.0], [61.0], [62.0]], p3: [[63.0], [64.0]]), p1: s0(p0: [[65.0], [66.0], [67.0]], p1: [[68.0]], p2: [[69.0], [70.0], [71.0]], p3: [[72.0], [73.0]]))], [s2(p0: s0(p0: [[74.0], [75.0], [76.0]], p1: [[77.0]], p2: [[78.0], [79.0], [80.0]], p3: [[81.0], [82.0]]), p1: s0(p0: [[83.0], [84.0], [85.0]], p1: [[86.0]], p2: [[87.0], [88.0], [89.0]], p3: [[90.0], [91.0]]))], [s2(p0: s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]], p2: [[96.0], [97.0], [98.0]], p3: [[99.0], [100.0]]), p1: s0(p0: [[101.0], [102.0], [103.0]], p1: [[104.0]], p2: [[105.0], [106.0], [107.0]], p3: [[108.0], [109.0]]))]]), s7(p0: 110.0, p1: [[s2(p0: s0(p0: [[111.0], [112.0], [113.0]], p1: [[114.0]], p2: [[115.0], [116.0], [117.0]], p3: [[118.0], [119.0]]), p1: s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0]], p2: [[124.0], [125.0], [126.0]], p3: [[127.0], [128.0]]))], [s2(p0: s0(p0: [[129.0], [130.0], [131.0]], p1: [[132.0]], p2: [[133.0], [134.0], [135.0]], p3: [[136.0], [137.0]]), p1: s0(p0: [[138.0], [139.0], [140.0]], p1: [[141.0]], p2: [[142.0], [143.0], [144.0]], p3: [[145.0], [146.0]]))], [s2(p0: s0(p0: [[147.0], [148.0], [149.0]], p1: [[150.0]], p2: [[151.0], [152.0], [153.0]], p3: [[154.0], [155.0]]), p1: s0(p0: [[156.0], [157.0], [158.0]], p1: [[159.0]], p2: [[160.0], [161.0], [162.0]], p3: [[163.0], [164.0]]))]])]
    let v1: Double = 165.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 165.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
