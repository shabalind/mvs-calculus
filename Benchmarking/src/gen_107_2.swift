  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
    var p2: s0
    var p3: s0
    var p4: s0
    var p5: s0
    var p6: s0
    var p7: [s0]
  }
  func f97(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p1
    let v1: [[Double]] = v0.p1
    let v15: [[Double]] = v0.p0
    let v8: [[Double]] = v0.p0
    let v28: [[Double]] = v0.p0
    let v14: [[Double]] = v0.p0
    let v16: [Double] = v28[1]
    let v18: [[Double]] = v0.p1
    var v19: s0 = v0
    let v17: [[Double]] = v19.p1
    v19.p0 = v15
    let v20: [[Double]] = v19.p0
    let v30: [[Double]] = v19.p1
    v19.p1 = v1
    var v37: [Double] = v16
    v19.p1 = v15
    v19.p1 = v20
    var v42: s0 = v19
    v19.p0 = v8
    let v29: [[Double]] = v19.p0
    v19.p0 = v4
    var v59: [[Double]] = v30
    let v62: [[Double]] = v0.p1
    v42.p0 = v18
    v42.p1 = v62
    let v43: [[Double]] = v42.p1
    let v65: [[Double]] = v0.p0
    v19.p1 = v1
    v19.p1 = v59
    var v39: [[Double]] = v29
    var v66: [[Double]] = v28
    v42.p1 = v39
    var v52: [[Double]] = v28
    v19.p0 = v65
    v19.p0 = v43
    v42.p1 = v66
    v19.p0 = v17
    v42.p0 = v29
    v39[1] = v37
    v42.p1 = v52
    v66 = v14
    v42.p0 = v20
    return v42
  }
  func f90(_ v0: s0) -> s0 {
    let v6: s0 = f97(v0)
    return v6
  }
  func f87(_ v0: s0, _ v1: s0) -> s0 {
    var v4: s0 = v1
    var v7: s0 = v4
    let v3: s0 = f97(v0)
    let v6: [[Double]] = v0.p1
    let v5: s0 = f97(v0)
    let v9: s0 = f90(v4)
    let v8: s0 = s0(p0: v6, p1: v6)
    var v11: s0 = v5
    v7.p0 = v6
    let v15: s0 = f90(v5)
    let v29: [[Double]] = v7.p0
    var v2: s0 = v3
    let v22: [[Double]] = v7.p1
    let v10: s0 = f97(v5)
    let v14: s0 = f90(v4)
    v7.p1 = v29
    let v18: [[Double]] = v10.p0
    let v16: [[Double]] = v15.p0
    v7.p0 = v18
    let v19: [s0] = [v14, v9, v11, v1, v2, v3, v11]
    let v13: [Double] = v18[1]
    let v28: Double = v13[0]
    let v17: [[Double]] = v5.p0
    let v20: s0 = f90(v11)
    let v26: s0 = v19[0]
    var v24: [s0] = v19
    let v55: [[Double]] = v2.p1
    let v34: s0 = f90(v26)
    let v42: s0 = f97(v8)
    v4.p1 = v17
    let v21: s0 = f90(v8)
    v7.p1 = v22
    let v45: s0 = v19[1]
    v7.p0 = v29
    v2 = v8
    let v25: [[Double]] = v9.p0
    v7.p0 = v29
    let v23: [Double] = v22[0]
    v24[6] = v45
    v24[3] = v20
    let v82: s0 = v24[4]
    v24[1] = v3
    let v43: [[Double]] = v11.p1
    v24[0] = v34
    v24[2] = v42
    let v69: [[Double]] = v82.p1
    let v44: [[Double]] = v3.p1
    v11.p0 = v43
    v2.p1 = v16
    var v46: [[Double]] = v25
    v11.p0 = v69
    var v96: [Double] = v23
    v24[1] = v2
    v46[0] = v96
    v24[6] = v4
    let v73: Double = v96[0]
    var v71: s0 = v21
    var v76: [s0] = v24
    v96[0] = v28
    v71.p1 = v44
    v2.p0 = v17
    v96[0] = v73
    v7.p0 = v29
    v71.p1 = v46
    v76[0] = v71
    let v206: s0 = v76[6]
    v11.p1 = v55
    v46 = v18
    v2 = v26
    return v206
  }
  func f78(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p1
    var v6: s0 = v0
    let v2: s0 = f87(v6, v6)
    v6.p1 = v4
    return v2
  }
  func f54(_ v0: s1, _ v1: s0) -> s0 {
    var v3: s0 = v1
    let v4: [[Double]] = v1.p1
    let v10: [[Double]] = v3.p0
    var v25: [[Double]] = v10
    let v21: [[Double]] = v3.p0
    v3.p1 = v10
    var v50: [[Double]] = v25
    v25 = v4
    v3.p1 = v50
    var v63: s0 = v3
    v63.p0 = v21
    v3.p1 = v25
    return v63
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s0], _ v2: s1, _ v3: Double) -> Double {
    var v6: [s0] = v1
    let v4: s0 = v6[0]
    let v13: s0 = v6[1]
    var v11: s0 = v0
    let v14: [[Double]] = v13.p1
    var v5: s0 = v13
    v5.p1 = v14
    let v24: [Double] = v14[0]
    let v17: s0 = f54(v2, v0)
    let v22: [[Double]] = v4.p0
    v6[2] = v11
    v11.p1 = v14
    v6[2] = v0
    var v20: [[Double]] = v14
    v5.p0 = v20
    v5.p1 = v20
    v5.p1 = v22
    let v31: [[Double]] = v5.p0
    var v77: [[Double]] = v31
    v6 = v1
    let v38: [Double] = v20[1]
    v11.p1 = v77
    let v56: s0 = f78(v17)
    var v69: [[Double]] = v22
    v11.p1 = v69
    v11.p1 = v14
    var v50: [Double] = v38
    v5.p0 = v69
    v11.p1 = v20
    v20[0] = v38
    v11.p0 = v20
    v69[0] = v50
    v69[0] = v24
    v50 = v38
    v6[0] = v56
    let v95: Double = v50[0]
    return v95
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])
    let v1: [s0] = [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])]
    let v2: s1 = s1(p0: [[s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])], [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])], [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])]], p1: [s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]), s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]]), s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]])], p2: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]), p3: s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]]), p4: s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]]), p5: s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]]), p6: s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]]), p7: [s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]])])
    let v3: Double = 64.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 64.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
