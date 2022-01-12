  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [Double]
  }
  struct s2 {
    var p0: s1
    var p1: s0
    var p2: s1
  }
  func f54(_ v0: s1, _ v1: s0, _ v2: s2) -> s2 {
    let v7: [Double] = v0.p1
    var v8: s0 = v1
    let v3: [[Double]] = v8.p0
    let v13: [[Double]] = v8.p1
    let v5: [Double] = v0.p1
    v8.p0 = v3
    let v12: s0 = s0(p0: v3, p1: v13)
    let v14: [Double] = v3[1]
    let v25: s1 = v2.p0
    v8.p0 = v3
    v8.p0 = v3
    var v82: [[Double]] = v3
    var v34: [[Double]] = v3
    let v26: [[Double]] = v12.p1
    v8.p0 = v3
    let v79: [s0] = [v1, v12, v8]
    v8.p0 = v3
    v82[1] = v14
    var v36: [s0] = v79
    v8.p1 = v13
    v82[0] = v14
    let v40: [[Double]] = v12.p0
    let v43: s0 = v36[2]
    let v109: [Double] = v34[1]
    v36[0] = v12
    v82[0] = v109
    let v61: [[Double]] = v1.p0
    let v74: s1 = s1(p0: v1, p1: v7)
    v8.p0 = v40
    v8.p1 = v26
    v8.p1 = v26
    var v60: s0 = v8
    let v99: [[Double]] = v8.p1
    let v80: s0 = v36[1]
    v8.p0 = v82
    var v73: s2 = v2
    v60.p1 = v99
    v73.p1 = v43
    v73.p1 = v60
    v60.p0 = v82
    let v62: s0 = v74.p0
    var v75: s2 = v73
    v75.p0 = v25
    v75.p0 = v74
    let v93: [Double] = v61[0]
    v82[0] = v93
    v75.p1 = v80
    let v129: s1 = s1(p0: v62, p1: v5)
    v73.p0 = v129
    return v75
  }
  func f53(_ v0: s2) -> s2 {
    let v4: s1 = v0.p0
    var v3: s1 = v4
    v3 = v4
    var v2: s1 = v3
    let v6: s0 = v0.p1
    v2 = v3
    let v1: s2 = s2(p0: v2, p1: v6, p2: v2)
    return v1
  }
  func f51(_ v0: s0, _ v1: s0) -> s0 {
    let v2: [[Double]] = v1.p1
    var v6: s0 = v0
    v6.p1 = v2
    v6.p1 = v2
    let v14: [[Double]] = v1.p0
    let v33: [[Double]] = v0.p1
    let v21: [[Double]] = v0.p0
    v6.p0 = v21
    let v19: [[Double]] = v6.p1
    let v102: [[Double]] = v6.p1
    v6.p0 = v21
    let v34: [[Double]] = v0.p1
    let v27: [[Double]] = v6.p0
    let v71: [[Double]] = v1.p0
    var v20: s0 = v1
    v20.p1 = v33
    let v37: [[Double]] = v6.p1
    v6.p0 = v71
    v20.p1 = v2
    let v63: [[Double]] = v1.p1
    var v64: s0 = v1
    v20.p0 = v14
    let v82: [[Double]] = v64.p0
    v64.p1 = v102
    v20.p0 = v27
    var v125: s0 = v0
    v64.p1 = v34
    let v58: [[Double]] = v125.p0
    v6.p0 = v58
    v6.p1 = v19
    v6.p0 = v82
    v20.p0 = v27
    v64.p1 = v63
    v125.p1 = v37
    return v20
  }
  func f48(_ v0: s0) -> s0 {
    let v1: [[Double]] = v0.p1
    var v2: s0 = v0
    v2.p1 = v1
    var v8: s0 = v0
    let v7: [[Double]] = v0.p0
    var v9: s0 = v0
    v8.p1 = v1
    let v6: s0 = f51(v9, v2)
    let v11: [[Double]] = v9.p0
    v9.p0 = v7
    v2 = v9
    v8.p0 = v7
    let v16: [[Double]] = v8.p0
    v2.p0 = v11
    var v25: [[Double]] = v16
    let v24: s0 = f51(v9, v8)
    let v21: s0 = f51(v6, v24)
    let v18: [[Double]] = v24.p1
    v2.p0 = v7
    let v80: [[Double]] = v21.p1
    let v66: s0 = f51(v21, v6)
    v2.p0 = v11
    let v36: s0 = f51(v66, v24)
    let v37: s0 = f51(v8, v24)
    let v74: s0 = f51(v36, v37)
    v8.p1 = v18
    let v22: s0 = f51(v74, v2)
    v9 = v8
    v8.p1 = v18
    v9.p0 = v25
    v9.p1 = v80
    return v22
  }
  func f46(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v6: s0 = f51(v0, v3)
    let v5: s0 = f48(v3)
    var v4: s0 = v0
    let v7: [[Double]] = v0.p0
    var v12: [[Double]] = v7
    let v13: s0 = f48(v6)
    let v2: [[Double]] = v6.p1
    let v8: [Double] = v12[1]
    v3.p0 = v7
    let v16: s0 = f48(v13)
    let v9: s0 = f48(v4)
    let v14: s0 = f51(v3, v0)
    let v21: s0 = f51(v16, v16)
    let v15: [[Double]] = v16.p0
    let v28: [[Double]] = v6.p1
    let v24: [[Double]] = v16.p0
    let v33: [Double] = v28[0]
    let v18: s0 = f51(v5, v5)
    let v25: s0 = f48(v14)
    let v40: [Double] = v24[1]
    let v47: [Double] = v28[0]
    let v35: [[Double]] = v21.p0
    var v42: [[Double]] = v35
    v3.p0 = v15
    v3.p0 = v42
    let v38: [[Double]] = v25.p0
    let v61: [Double] = v42[0]
    var v59: s0 = v9
    var v34: [[Double]] = v2
    let v74: [[Double]] = v16.p0
    let v125: [Double] = v2[0]
    var v55: [[Double]] = v28
    let v48: [Double] = v2[2]
    var v58: [[Double]] = v55
    var v69: [[Double]] = v28
    v42[1] = v47
    let v64: [[Double]] = v0.p0
    let v131: [[Double]] = v3.p1
    let v43: s0 = f51(v16, v59)
    var v207: [[Double]] = v58
    let v110: [[Double]] = v18.p1
    v4.p0 = v74
    let v71: [Double] = v64[0]
    var v139: s0 = v0
    let v79: s0 = f51(v139, v43)
    v12[0] = v48
    v34[0] = v8
    v4.p1 = v34
    v69[2] = v8
    let v63: [Double] = v207[0]
    v69[1] = v125
    v3.p0 = v38
    v139.p1 = v207
    v55[0] = v71
    v139.p1 = v55
    let v395: [[Double]] = v18.p1
    let v118: [[[Double]]] = [v131]
    v139.p1 = v110
    v34[1] = v40
    v58[2] = v63
    var v177: [[[Double]]] = v118
    v4.p1 = v69
    v12[0] = v125
    v69[0] = v33
    var v140: [[[Double]]] = v177
    v140[0] = v395
    var v108: [[[Double]]] = v140
    let v89: [[Double]] = v108[0]
    v34[1] = v8
    v59.p1 = v34
    v3.p1 = v89
    v58[0] = v61
    v12[1] = v40
    return v79
  }
  func f45(_ v0: s2, _ v1: s2) -> s2 {
    let v2: s2 = f53(v1)
    let v7: s2 = f53(v2)
    let v5: s1 = v2.p0
    var v8: s2 = v1
    let v3: s1 = v8.p0
    let v11: s0 = v1.p1
    v8.p0 = v5
    let v10: s1 = v7.p0
    let v14: [s0] = [v11]
    var v25: s1 = v5
    var v13: [s0] = v14
    var v12: s2 = v1
    let v17: s0 = f48(v11)
    var v30: s0 = v11
    var v34: s0 = v17
    v13[0] = v30
    let v19: s0 = v13[0]
    let v15: [[Double]] = v30.p1
    let v43: s0 = v2.p1
    var v16: [s0] = v13
    let v32: s0 = f51(v17, v34)
    let v42: [s0] = [v43, v17, v32, v43]
    let v48: [[Double]] = v30.p1
    let v27: s0 = v42[0]
    let v31: s0 = v42[1]
    let v33: s0 = v10.p0
    let v23: [[Double]] = v34.p0
    v13 = v16
    var v56: [[Double]] = v23
    let v45: s2 = f54(v25, v27, v12)
    let v40: s0 = f51(v31, v32)
    let v57: [Double] = v56[1]
    let v28: [Double] = v15[1]
    v56[1] = v28
    let v60: s0 = f48(v17)
    let v51: s0 = v10.p0
    v16[0] = v43
    v8.p1 = v19
    let v140: s0 = f51(v30, v40)
    v25.p0 = v19
    v56[0] = v57
    v12.p1 = v33
    let v133: s0 = f48(v51)
    let v70: s0 = f51(v60, v32)
    v30.p0 = v56
    v16[0] = v133
    v30.p1 = v48
    let v49: [[Double]] = v70.p0
    let v88: s2 = f54(v3, v140, v45)
    v30.p0 = v49
    let v71: s0 = f46(v17)
    v25.p0 = v71
    return v88
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [s2], _ v2: Double) -> Double {
    let v3: s2 = f45(v0, v0)
    var v7: Double = v2
    let v6: s1 = v3.p0
    let v21: [Double] = v6.p1
    let v26: Double = v7 * v7
    var v38: [Double] = v21
    var v72: [Double] = v38
    let v70: Double = v2 - v26
    let v94: Double = v72[1]
    v72[1] = v70
    return v94
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: [5.0, 6.0, 7.0]), p1: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0], [12.0]]), p2: s1(p0: s0(p0: [[13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), p1: [18.0, 19.0, 20.0]))
    let v1: [s2] = [s2(p0: s1(p0: s0(p0: [[21.0], [22.0]], p1: [[23.0], [24.0], [25.0]]), p1: [26.0, 27.0, 28.0]), p1: s0(p0: [[29.0], [30.0]], p1: [[31.0], [32.0], [33.0]]), p2: s1(p0: s0(p0: [[34.0], [35.0]], p1: [[36.0], [37.0], [38.0]]), p1: [39.0, 40.0, 41.0])), s2(p0: s1(p0: s0(p0: [[42.0], [43.0]], p1: [[44.0], [45.0], [46.0]]), p1: [47.0, 48.0, 49.0]), p1: s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]]), p2: s1(p0: s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]]), p1: [60.0, 61.0, 62.0])), s2(p0: s1(p0: s0(p0: [[63.0], [64.0]], p1: [[65.0], [66.0], [67.0]]), p1: [68.0, 69.0, 70.0]), p1: s0(p0: [[71.0], [72.0]], p1: [[73.0], [74.0], [75.0]]), p2: s1(p0: s0(p0: [[76.0], [77.0]], p1: [[78.0], [79.0], [80.0]]), p1: [81.0, 82.0, 83.0]))]
    let v2: Double = 84.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 84.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
