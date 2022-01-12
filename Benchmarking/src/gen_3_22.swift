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
    var p0: s0
    var p1: [[s1]]
  }
  struct s3 {
    var p0: [s2]
  }
  struct s4 {
    var p0: [s3]
    var p1: s3
  }
  struct s5 {
    var p0: s4
    var p1: [[s2]]
  }
  func f96(_ v0: Double) -> Double {
    var v7: Double = v0
    var v6: Double = v7
    var v8: Double = v6
    var v1: Double = v7
    var v5: Double = v6
    let v2: [Double] = [v6, v5]
    v8 = v1
    var v3: Double = v7
    var v11: [Double] = v2
    let v13: Double = v11[1]
    v8 = v3
    v11[0] = v8
    v11[0] = v13
    let v16: Double = v11[1]
    return v16
  }
  func f10(_ v0: Double) -> Double {
    var v4: Double = v0
    let v6: Double = f96(v4)
    let v3: Double = f96(v4)
    let v2: Double = f96(v4)
    var v5: Double = v3
    let v9: Double = f96(v5)
    var v10: Double = v6
    var v11: Double = v0
    let v1: Double = v2 + v4
    let v13: Double = f96(v6)
    let v17: Double = f96(v0)
    let v8: Double = f96(v17)
    var v7: Double = v1
    let v15: Double = f96(v1)
    let v22: Double = f96(v11)
    var v12: Double = v6
    let v36: Double = v0 / v9
    let v25: Double = f96(v6)
    let v30: Double = v15 / v8
    var v29: Double = v12
    var v14: Double = v4
    let v20: Double = f96(v10)
    let v31: Double = f96(v13)
    var v26: Double = v29
    let v52: Double = f96(v25)
    let v50: Double = v52 * v20
    let v43: Double = v50 / v2
    let v73: Double = f96(v50)
    var v27: Double = v31
    let v46: Double = f96(v9)
    let v34: [Double] = [v46, v13, v7, v73, v30]
    let v59: Double = v34[4]
    var v62: [Double] = v34
    v62[2] = v59
    v62[3] = v8
    var v49: Double = v22
    let v40: Double = f96(v49)
    v62[3] = v73
    let v56: Double = f96(v40)
    let v60: Double = v62[2]
    let v71: Double = f96(v31)
    var v51: [Double] = v34
    v62[0] = v71
    v62[1] = v3
    let v81: Double = v62[1]
    let v67: Double = v34[0]
    v62[1] = v14
    let v82: Double = v51[2]
    var v111: [Double] = v51
    v51[2] = v36
    v51[3] = v31
    var v115: [Double] = v111
    let v96: Double = f96(v60)
    var v45: [Double] = v115
    let v120: Double = f96(v5)
    v111[2] = v82
    v45 = v34
    v45[4] = v14
    let v174: Double = f96(v120)
    v45[0] = v50
    let v86: Double = v45[2]
    v62[2] = v81
    v62[3] = v27
    v115[1] = v174
    v62[4] = v26
    v51[0] = v43
    v45[0] = v96
    v115[2] = v67
    v4 = v3
    let v119: Double = f96(v86)
    v111[3] = v2
    v111[1] = v56
    v45[4] = v120
    return v119
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: Double) -> Double {
    var v7: Double = v1
    v7 = v1
    let v2: Double = v7 * v1
    let v31: Double = f96(v2)
    var v37: Double = v31
    var v66: Double = v2
    let v95: Double = v66 - v1
    let v92: Double = v95 + v7
    let v61: Double = f10(v92)
    let v154: Double = v61 * v37
    return v154
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: s4(p0: [s3(p0: [s2(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: [[s1(p0: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), p1: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]))]])]), s3(p0: [s2(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]), p1: [[s1(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]))]])]), s3(p0: [s2(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), p1: [[s1(p0: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]), p1: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]))]])])], p1: s3(p0: [s2(p0: s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]), p1: [[s1(p0: s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), p1: s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]]))]])])), p1: [[s2(p0: s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]]), p1: [[s1(p0: s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]]), p1: s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]]))]])]]), s5(p0: s4(p0: [s3(p0: [s2(p0: s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]]), p1: [[s1(p0: s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]]), p1: s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]]))]])]), s3(p0: [s2(p0: s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]]), p1: [[s1(p0: s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]]), p1: s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]]))]])]), s3(p0: [s2(p0: s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]]), p1: [[s1(p0: s0(p0: [[88.0]], p1: [[89.0], [90.0], [91.0]]), p1: s0(p0: [[92.0]], p1: [[93.0], [94.0], [95.0]]))]])])], p1: s3(p0: [s2(p0: s0(p0: [[96.0]], p1: [[97.0], [98.0], [99.0]]), p1: [[s1(p0: s0(p0: [[100.0]], p1: [[101.0], [102.0], [103.0]]), p1: s0(p0: [[104.0]], p1: [[105.0], [106.0], [107.0]]))]])])), p1: [[s2(p0: s0(p0: [[108.0]], p1: [[109.0], [110.0], [111.0]]), p1: [[s1(p0: s0(p0: [[112.0]], p1: [[113.0], [114.0], [115.0]]), p1: s0(p0: [[116.0]], p1: [[117.0], [118.0], [119.0]]))]])]])]
    let v1: Double = 120.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 120.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
