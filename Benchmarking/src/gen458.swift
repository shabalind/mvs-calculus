  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: s1
    var p1: [s0]
  }
  func f38(_ v0: s0) -> s0 {
    var v4: s0 = v0
    var v1: s0 = v0
    var v8: s0 = v4
    let v9: [[Double]] = v8.p1
    v4.p1 = v9
    let v2: [[Double]] = v0.p1
    let v3: [[Double]] = v0.p0
    let v12: [[Double]] = v0.p0
    v8.p1 = v2
    var v7: s0 = v8
    v7.p1 = v9
    let v15: [[Double]] = v4.p0
    v7 = v1
    v4.p0 = v3
    let v19: [[Double]] = v7.p0
    let v11: [[Double]] = v8.p1
    var v47: s0 = v1
    v47.p0 = v15
    let v32: [[Double]] = v47.p1
    v7.p1 = v11
    v1.p1 = v32
    let v72: [[Double]] = v1.p0
    let v29: [[Double]] = v7.p0
    v7.p0 = v19
    v4.p1 = v11
    v47.p0 = v29
    var v106: s0 = v47
    let v63: [[Double]] = v47.p0
    let v91: [[Double]] = v8.p1
    v47.p0 = v12
    v47.p0 = v63
    v1.p1 = v91
    v106.p1 = v11
    v47.p1 = v91
    v106.p0 = v72
    return v106
  }
  func f33(_ v0: [s0], _ v1: s3) -> s3 {
    var v2: [s0] = v0
    let v3: s0 = v2[1]
    let v6: s0 = f38(v3)
    let v13: [s0] = v1.p1
    v2[0] = v6
    let v12: [s0] = v1.p1
    var v16: s3 = v1
    let v20: s0 = v12[1]
    var v44: s3 = v16
    v16.p1 = v13
    v2[1] = v20
    v44.p1 = v12
    let v35: s1 = v44.p0
    let v46: s3 = s3(p0: v35, p1: v13)
    let v80: [s0] = v1.p1
    let v41: s0 = f38(v6)
    v44.p1 = v13
    let v48: s0 = f38(v41)
    let v51: s3 = s3(p0: v35, p1: v80)
    v2[0] = v41
    var v49: [s0] = v13
    v16.p1 = v12
    let v52: s0 = f38(v48)
    let v139: s1 = v51.p0
    v44.p0 = v139
    let v64: s0 = f38(v48)
    var v57: [s0] = v49
    v2[0] = v52
    v16.p1 = v57
    v49[2] = v64
    return v46
  }
  func f29(_ v0: s3) -> s3 {
    let v1: s1 = v0.p0
    let v7: [s0] = v0.p1
    let v4: [s1] = [v1]
    let v5: s0 = v7[1]
    let v3: s1 = v4[0]
    var v12: [s1] = v4
    v12 = v4
    let v30: s1 = v4[0]
    var v18: s1 = v3
    let v13: s1 = v12[0]
    let v20: s0 = v7[0]
    let v27: s1 = v12[0]
    v12[0] = v3
    v18.p1 = v5
    let v39: s0 = f38(v20)
    v12[0] = v13
    let v77: s0 = v7[0]
    v12[0] = v30
    let v66: s0 = f38(v39)
    v12[0] = v18
    let v81: [s0] = v30.p0
    v18.p1 = v66
    v18.p1 = v77
    var v61: [s1] = v12
    v12 = v61
    let v162: [s0] = v27.p0
    v61[0] = v1
    v18.p0 = v162
    let v184: s1 = v12[0]
    var v95: s3 = v0
    v18.p0 = v81
    v95.p0 = v184
    return v95
  }
  func f23(_ v0: s3, _ v1: Double) -> Double {
    let v5: s3 = f29(v0)
    var v4: Double = v1
    let v3: [s0] = v5.p1
    let v2: s0 = v3[0]
    v4 = v1
    let v19: Double = v1 + v4
    let v22: [[Double]] = v2.p1
    let v26: [Double] = v22[2]
    let v15: Double = v26[0]
    v4 = v19
    let v36: Double = v19 * v15
    let v72: Double = v26[0]
    var v70: Double = v36
    var v62: Double = v70
    v4 = v72
    return v62
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s1, _ v2: s1, _ v3: s0, _ v4: [[s3]], _ v5: Double) -> Double {
    let v10: [s3] = v4[0]
    let v13: s3 = v10[0]
    var v14: Double = v5
    let v22: Double = v5 / v14
    var v103: [s0] = v0
    let v35: s3 = f29(v13)
    let v68: s3 = f33(v103, v35)
    let v73: Double = v14 / v22
    let v55: Double = f23(v68, v73)
    return v55
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])]
    let v1: s1 = s1(p0: [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))
    let v2: s1 = s1(p0: [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]))
    let v3: s0 = s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])
    let v4: [[s3]] = [[s3(p0: s1(p0: [s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])], p1: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])), p1: [s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]), s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])])], [s3(p0: s1(p0: [s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])], p1: s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])), p1: [s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]]), s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]]), s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]])])]]
    let v5: Double = 68.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 68.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
