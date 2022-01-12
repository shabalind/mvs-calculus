  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [s1]
    var p1: [s0]
  }
  struct s4 {
    var p0: s1
    var p1: s2
  }
  struct s6 {
    var p0: [[s3]]
    var p1: [Double]
  }
  func f20(_ v0: [Double]) -> [Double] {
    let v3: Double = v0[1]
    var v7: [Double] = v0
    var v5: Double = v3
    let v8: Double = v0[0]
    v7[1] = v5
    var v1: Double = v8
    var v6: [Double] = v7
    var v4: [Double] = v7
    var v2: [Double] = v6
    let v13: Double = v0[1]
    var v20: [Double] = v2
    var v10: Double = v13
    let v11: Double = v6[0]
    let v9: Double = v20[1]
    var v15: [Double] = v20
    v6 = v20
    var v22: Double = v8
    var v14: [Double] = v2
    var v17: Double = v13
    var v12: [Double] = v4
    let v19: Double = v7[0]
    v2[0] = v3
    var v18: Double = v19
    var v16: [Double] = v7
    var v23: [Double] = v7
    var v29: Double = v10
    let v21: Double = v22 - v1
    let v25: Double = v9 * v17
    var v24: [Double] = v7
    let v26: Double = v4[0]
    v15[1] = v17
    v15 = v6
    var v67: Double = v21
    let v51: Double = v24[1]
    var v46: Double = v25
    let v50: Double = v23[1]
    var v33: Double = v50
    v15[1] = v46
    let v54: Double = v7[1]
    var v37: [Double] = v14
    let v28: Double = v16[1]
    let v72: Double = v14[1]
    v7 = v6
    v2[0] = v33
    let v55: Double = v12[1]
    var v73: Double = v8
    v16[0] = v26
    let v70: Double = v7[1]
    v67 = v72
    v6[1] = v51
    v15[0] = v72
    var v32: [Double] = v2
    v15[1] = v22
    let v38: Double = v16[0]
    v6[1] = v54
    v23[0] = v10
    var v58: [Double] = v12
    var v47: Double = v54
    v14 = v0
    var v63: [Double] = v37
    v23[0] = v55
    let v79: Double = v2[0]
    var v99: [Double] = v6
    v20[1] = v46
    var v36: [Double] = v63
    let v140: Double = v2[0]
    v63[0] = v10
    var v93: Double = v72
    var v83: [Double] = v36
    var v86: [Double] = v36
    var v59: Double = v140
    v32[1] = v18
    let v64: Double = v12[0]
    var v208: Double = v29
    var v53: [Double] = v7
    let v118: Double = v15[0]
    let v113: [[Double]] = [v83, v53, v20, v32, v0, v53, v86]
    v36[0] = v38
    var v115: [[Double]] = v113
    let v68: [Double] = v113[0]
    let v87: [Double] = v115[3]
    var v61: [Double] = v68
    let v119: Double = v53[0]
    let v66: Double = v32[0]
    v36[1] = v10
    v99[0] = v21
    v20[1] = v66
    var v60: Double = v208
    let v121: [[Double]] = [v15, v58, v6, v61]
    v61[0] = v11
    var v75: [[Double]] = v121
    v20[1] = v59
    v6[0] = v28
    v14[1] = v140
    var v108: [[Double]] = v75
    let v85: [[Double]] = [v87, v4]
    v36[1] = v47
    let v111: Double = v118 + v93
    v36[1] = v73
    var v206: [[Double]] = v85
    v63[1] = v119
    v4[1] = v67
    let v116: [Double] = v108[0]
    let v109: [Double] = v206[0]
    v83[1] = v79
    v58[0] = v70
    v61[0] = v111
    v23[1] = v64
    v12 = v99
    v61[0] = v60
    v32[1] = v72
    v14 = v109
    return v116
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s6, _ v2: [s0], _ v3: s4, _ v4: s3, _ v5: Double) -> Double {
    let v7: Double = v5 - v5
    var v14: s6 = v1
    var v31: Double = v7
    let v56: [Double] = v14.p1
    let v19: [Double] = f20(v56)
    let v26: Double = v19[1]
    let v85: Double = v26 - v31
    let v261: Double = v31 / v85
    return v261
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0], [1.0], [2.0]]), p1: s0(p0: [[3.0], [4.0], [5.0]]))
    let v1: s6 = s6(p0: [[s3(p0: [s1(p0: s0(p0: [[6.0], [7.0], [8.0]]), p1: s0(p0: [[9.0], [10.0], [11.0]]))], p1: [s0(p0: [[12.0], [13.0], [14.0]]), s0(p0: [[15.0], [16.0], [17.0]])])], [s3(p0: [s1(p0: s0(p0: [[18.0], [19.0], [20.0]]), p1: s0(p0: [[21.0], [22.0], [23.0]]))], p1: [s0(p0: [[24.0], [25.0], [26.0]]), s0(p0: [[27.0], [28.0], [29.0]])])], [s3(p0: [s1(p0: s0(p0: [[30.0], [31.0], [32.0]]), p1: s0(p0: [[33.0], [34.0], [35.0]]))], p1: [s0(p0: [[36.0], [37.0], [38.0]]), s0(p0: [[39.0], [40.0], [41.0]])])]], p1: [42.0, 43.0])
    let v2: [s0] = [s0(p0: [[44.0], [45.0], [46.0]]), s0(p0: [[47.0], [48.0], [49.0]])]
    let v3: s4 = s4(p0: s1(p0: s0(p0: [[50.0], [51.0], [52.0]]), p1: s0(p0: [[53.0], [54.0], [55.0]])), p1: s2(p0: s0(p0: [[56.0], [57.0], [58.0]]), p1: s0(p0: [[59.0], [60.0], [61.0]])))
    let v4: s3 = s3(p0: [s1(p0: s0(p0: [[62.0], [63.0], [64.0]]), p1: s0(p0: [[65.0], [66.0], [67.0]]))], p1: [s0(p0: [[68.0], [69.0], [70.0]]), s0(p0: [[71.0], [72.0], [73.0]])])
    let v5: Double = 74.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 74.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
