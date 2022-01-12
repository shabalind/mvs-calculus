  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: [s1]
    var p1: [[s1]]
  }
  struct s3 {
    var p0: [s1]
    var p1: s2
    var p2: s2
  }
  func f51(_ v0: s3) -> s3 {
    let v6: s2 = v0.p1
    let v5: [s1] = v0.p0
    let v8: [s2] = [v6, v6, v6, v6, v6, v6]
    let v13: [s1] = v6.p0
    let v33: s2 = v8[0]
    let v23: s2 = v8[2]
    let v34: s2 = v8[5]
    let v46: [s1] = v0.p0
    let v49: [s1] = v34.p0
    var v26: [s2] = v8
    let v47: [[s1]] = [v46, v13, v13, v46, v5]
    let v93: s2 = v26[1]
    let v50: [s1] = v47[4]
    var v39: [s1] = v50
    let v87: s3 = s3(p0: v49, p1: v33, p2: v93)
    v39 = v46
    var v139: s3 = v87
    v139.p0 = v39
    v26[3] = v23
    return v139
  }
  func f48(_ v0: Double) -> Double {
    var v1: Double = v0
    let v6: Double = v1 / v0
    v1 = v6
    var v5: Double = v0
    var v8: Double = v6
    let v3: Double = v5 - v8
    v1 = v8
    var v11: Double = v8
    var v12: Double = v11
    var v15: Double = v12
    var v49: Double = v6
    let v80: [Double] = [v15]
    let v36: Double = v80[0]
    let v38: [Double] = [v3, v49]
    var v75: [Double] = v38
    let v99: [[Double]] = [v38, v38, v75, v38, v38]
    let v68: [Double] = v99[4]
    let v84: Double = v68[1]
    v75[1] = v36
    return v84
  }
  func f41(_ v0: s2, _ v1: s2) -> s2 {
    let v5: [s1] = v1.p0
    let v10: s1 = v5[0]
    var v3: [s1] = v5
    let v11: s3 = s3(p0: v3, p1: v1, p2: v1)
    let v18: s3 = f51(v11)
    let v20: [[s0]] = v10.p0
    v3[0] = v10
    let v41: [s0] = v10.p1
    let v101: s3 = f51(v18)
    let v44: s1 = s1(p0: v20, p1: v41)
    let v208: s2 = v101.p1
    v3[0] = v44
    return v208
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v5: s2 = v0.p1
    let v7: Double = f48(v1)
    let v3: s2 = f41(v5, v5)
    let v4: s2 = f41(v5, v3)
    let v10: s2 = f41(v4, v5)
    var v24: Double = v1
    let v39: [s1] = v10.p0
    let v43: Double = f48(v24)
    let v26: s1 = v39[0]
    let v44: [s0] = v26.p1
    let v74: s0 = v44[1]
    let v62: Double = f48(v43)
    let v49: [[Double]] = v74.p1
    let v113: [Double] = v49[2]
    var v172: [Double] = v113
    let v155: Double = v172[0]
    v172[0] = v7
    let v118: Double = f48(v62)
    v172[0] = v118
    return v155
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s1(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])]], p1: [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])])], p1: s2(p0: [s1(p0: [[s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])]], p1: [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])])], p1: [[s1(p0: [[s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])]], p1: [s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]), s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])])], [s1(p0: [[s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])]], p1: [s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])])], [s1(p0: [[s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])]], p1: [s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]]), s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])])]]), p2: s2(p0: [s1(p0: [[s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]])]], p1: [s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]]), s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]])])], p1: [[s1(p0: [[s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]])]], p1: [s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]]), s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]])])], [s1(p0: [[s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]])]], p1: [s0(p0: [[88.0]], p1: [[89.0], [90.0], [91.0]]), s0(p0: [[92.0]], p1: [[93.0], [94.0], [95.0]])])], [s1(p0: [[s0(p0: [[96.0]], p1: [[97.0], [98.0], [99.0]])]], p1: [s0(p0: [[100.0]], p1: [[101.0], [102.0], [103.0]]), s0(p0: [[104.0]], p1: [[105.0], [106.0], [107.0]])])]]))
    let v1: Double = 108.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 108.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
