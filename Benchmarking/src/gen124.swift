  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  func f46(_ v0: s0) -> s0 {
    var v5: s0 = v0
    var v6: s0 = v0
    let v3: [s0] = [v5, v6, v5, v0]
    let v2: [[Double]] = v0.p1
    let v4: [[Double]] = v5.p0
    var v9: [[Double]] = v2
    v5 = v6
    let v10: [[Double]] = v0.p0
    v6.p1 = v4
    let v17: s0 = v3[1]
    let v7: [[Double]] = v6.p1
    let v8: [[Double]] = v6.p1
    let v12: [Double] = v2[1]
    v5.p1 = v10
    var v13: [[Double]] = v8
    let v14: [Double] = v2[0]
    var v21: s0 = v17
    let v11: [[Double]] = v6.p1
    var v24: s0 = v21
    let v16: [Double] = v4[1]
    let v15: Double = v14[0]
    var v28: [Double] = v14
    var v22: Double = v15
    v24.p1 = v7
    let v35: s0 = v3[2]
    v9 = v10
    v21 = v35
    v6.p1 = v2
    v6.p1 = v2
    let v32: [Double] = v2[0]
    v5.p0 = v8
    let v36: s0 = v3[1]
    v5.p0 = v11
    v6.p1 = v11
    v28[0] = v22
    v6.p1 = v8
    let v97: [[Double]] = v24.p1
    let v26: s0 = v3[3]
    var v18: [[Double]] = v11
    let v43: [[Double]] = v35.p1
    let v30: [[Double]] = v26.p0
    var v38: [[Double]] = v97
    v24.p1 = v13
    let v53: [[Double]] = [v28, v28, v14, v16, v28]
    v38[0] = v32
    let v52: [s0] = [v36, v35, v6, v35]
    v24.p0 = v43
    let v63: [[Double]] = v24.p1
    var v87: [[Double]] = v53
    v38[0] = v14
    v9[0] = v32
    let v70: [[Double]] = v26.p0
    v6.p1 = v18
    let v77: s0 = v52[3]
    v24.p0 = v9
    v38[1] = v12
    let v88: [Double] = v87[4]
    let v59: [[Double]] = v5.p0
    v18[0] = v88
    v6.p0 = v30
    v24.p0 = v43
    v5.p1 = v63
    let v101: [Double] = v38[0]
    v21.p0 = v18
    v21.p1 = v70
    let v104: [[Double]] = v24.p0
    v5.p0 = v59
    v21 = v26
    v87[3] = v101
    v6.p0 = v63
    v24.p1 = v70
    v5.p0 = v104
    return v77
  }
  func f2(_ v0: s0) -> s0 {
    let v1: s0 = f46(v0)
    var v4: s0 = v0
    var v8: s0 = v1
    let v7: s0 = f46(v8)
    var v6: s0 = v1
    let v5: s0 = f46(v1)
    let v3: [[Double]] = v4.p0
    let v2: [Double] = v3[1]
    var v14: [[Double]] = v3
    let v10: [[Double]] = v0.p0
    v8.p0 = v10
    v14[1] = v2
    let v9: [Double] = v14[1]
    var v11: [[Double]] = v10
    let v25: Double = v9[0]
    var v18: [[Double]] = v10
    var v40: s0 = v6
    var v21: Double = v25
    var v12: [Double] = v2
    let v16: [[Double]] = v4.p1
    var v17: [[Double]] = v14
    let v19: Double = v2[0]
    let v73: [[Double]] = v8.p1
    let v20: [[Double]] = v6.p0
    var v39: [[Double]] = v3
    let v41: s0 = f46(v7)
    let v51: [Double] = v11[0]
    let v50: s0 = f46(v8)
    v39[0] = v51
    v17[0] = v2
    let v29: s0 = s0(p0: v3, p1: v14)
    v6.p0 = v18
    v8.p1 = v39
    var v58: [[Double]] = v11
    let v70: [Double] = v58[0]
    var v24: [Double] = v2
    let v56: [[Double]] = v50.p1
    var v46: [[Double]] = v10
    let v30: Double = v70[0]
    let v52: s0 = f46(v40)
    var v75: [Double] = v24
    v6.p0 = v17
    let v69: s0 = f46(v6)
    v18[0] = v24
    v8 = v52
    var v192: [Double] = v75
    let v133: [[Double]] = v29.p0
    v17 = v46
    let v57: [Double] = v56[1]
    v4.p0 = v16
    v192[0] = v30
    var v91: [[Double]] = v14
    v40 = v52
    v8 = v7
    let v109: s0 = f46(v69)
    v91[0] = v9
    var v87: s0 = v41
    v192 = v51
    v4.p1 = v46
    let v63: Double = v57[0]
    let v108: [[Double]] = v109.p0
    var v164: Double = v19
    v18[0] = v24
    v4.p0 = v133
    v46[0] = v192
    v24[0] = v164
    v8.p1 = v18
    v87.p0 = v133
    v4.p1 = v91
    v24[0] = v63
    let v125: [[Double]] = v5.p0
    v12[0] = v21
    v91 = v73
    v58 = v125
    v4.p0 = v108
    v87.p0 = v20
    let v373: [[Double]] = v50.p1
    v87.p0 = v373
    v39[1] = v12
    v91 = v17
    return v87
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s2], _ v2: Double) -> Double {
    let v3: [[Double]] = v0.p0
    let v4: s0 = s0(p0: v3, p1: v3)
    let v6: [[Double]] = v4.p1
    let v18: [[Double]] = v0.p1
    let v14: s0 = s0(p0: v18, p1: v6)
    let v37: Double = v2 - v2
    let v58: s0 = f2(v14)
    let v30: [[Double]] = v58.p0
    let v35: [Double] = v30[0]
    var v28: [Double] = v35
    let v50: Double = v28[0]
    v28[0] = v37
    return v50
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])
    let v1: [s2] = [s2(p0: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), p1: [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])]), s2(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]), p1: [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]), s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])]), s2(p0: s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]), p1: [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]), s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]]), s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]])])]
    let v2: Double = 52.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 52.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
