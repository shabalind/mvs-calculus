  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s3 {
    var p0: [s0]
    var p1: s1
  }
  struct s7 {
    var p0: [s3]
    var p1: [[s1]]
  }
  func f39(_ v0: s0, _ v1: Double) -> Double {
    var v3: Double = v1
    let v8: [[Double]] = v0.p1
    let v2: [[Double]] = v0.p1
    let v5: [Double] = v8[1]
    var v10: s0 = v0
    v10.p0 = v2
    var v7: s0 = v10
    var v6: s0 = v7
    var v4: s0 = v10
    let v9: s0 = s0(p0: v2, p1: v8)
    let v13: Double = v1 + v1
    let v11: [[Double]] = v0.p0
    v10.p0 = v11
    let v22: [Double] = v2[0]
    let v21: Double = v5[0]
    var v18: [Double] = v22
    var v55: Double = v21
    var v23: s0 = v6
    let v14: s0 = s0(p0: v8, p1: v11)
    let v24: [[Double]] = v14.p1
    let v35: Double = v13 + v13
    let v44: [[Double]] = v23.p0
    var v26: Double = v1
    v18[0] = v3
    let v17: Double = v18[0]
    let v27: [[Double]] = v9.p1
    let v33: [[Double]] = v4.p1
    let v34: Double = v26 + v35
    v18[0] = v26
    let v32: [[Double]] = v10.p0
    v18[0] = v26
    let v31: [Double] = v32[1]
    let v25: [[Double]] = v23.p0
    v18[0] = v55
    var v80: [Double] = v5
    v23.p1 = v27
    v18[0] = v55
    let v50: [Double] = v24[1]
    v18[0] = v34
    v26 = v55
    var v100: Double = v17
    var v49: [[Double]] = v33
    v7.p1 = v25
    var v58: [[Double]] = v2
    let v61: [[Double]] = v7.p0
    let v56: [Double] = v61[1]
    v58[1] = v18
    let v29: [[Double]] = v4.p1
    v58[0] = v31
    v18[0] = v3
    let v121: Double = v18[0]
    var v107: Double = v121
    v49[1] = v80
    let v81: Double = v13 / v100
    v23.p1 = v44
    v10.p1 = v29
    let v75: [[Double]] = v7.p0
    v26 = v107
    let v148: [[Double]] = v9.p0
    let v86: Double = v56[0]
    var v130: Double = v86
    v7.p1 = v58
    let v122: [[Double]] = v7.p1
    v6.p1 = v75
    v58[0] = v80
    v18[0] = v130
    v49[1] = v31
    v7.p0 = v122
    v58[1] = v50
    v49[1] = v31
    v80[0] = v55
    v49[0] = v18
    v23.p1 = v49
    v7.p1 = v49
    v4.p0 = v148
    return v81
  }
  func f27(_ v0: Double) -> Double {
    var v6: Double = v0
    var v7: Double = v6
    let v2: [Double] = [v7, v6, v7, v7, v6, v0, v7]
    let v4: Double = v2[2]
    let v32: [[Double]] = [v2]
    var v16: [[Double]] = v32
    var v14: [[Double]] = v16
    let v15: [Double] = v14[0]
    var v22: [Double] = v15
    var v21: [[Double]] = v16
    v21[0] = v22
    var v20: [Double] = v22
    let v26: Double = v20[3]
    let v78: [Double] = v32[0]
    v22[6] = v4
    let v24: Double = v22[2]
    v6 = v26
    v14[0] = v78
    v16[0] = v2
    v20[5] = v24
    v16[0] = v78
    let v35: [Double] = v21[0]
    v16[0] = v22
    v14[0] = v78
    v14[0] = v2
    let v220: Double = v35[4]
    return v220
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: s0, _ v2: Double) -> Double {
    let v3: Double = f39(v1, v2)
    let v19: Double = f27(v3)
    return v19
  }
  func benchmark() {
    let v0: s7 = s7(p0: [s3(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], p1: s1(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])], p1: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])]))], p1: [[s1(p0: [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])], p1: [s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])])], [s1(p0: [s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]), s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]])], p1: [s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]])])], [s1(p0: [s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]]), s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]])], p1: [s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]])])]])
    let v1: s0 = s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]])
    let v2: Double = 64.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 64.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
